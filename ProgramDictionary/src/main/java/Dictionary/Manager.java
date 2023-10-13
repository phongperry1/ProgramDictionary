
package Dictionary;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


public class Manager {
    Validation vl = new Validation();
    public int menu() {
        System.out.println("1. Add new word.");
        System.out.println("2. Delete word.");
        System.out.println("3. Search word.");
        System.out.println("4. Exit");
        int choice = vl.checkInputIntLimit(1, 4);
        return choice;
    }
    
    public void addNewWord(HashMap<String, String> hm) {
        System.out.print("Enter English: ");
        String english = vl.checkInputString();
        if(!checkKeywordExist(hm, english)) {
            if(!vl.checkInputYN()) {
                return;
            }
        }
        System.out.print("Enter Vietnamese: ");
        String vietnam = vl.checkInputString();
        hm.put(english, vietnam);
        System.out.println("Delete successful");
    }
    
    public void deleteWord(HashMap<String, String> hm) {
        System.out.print("Enter english: ");
        String english = vl.checkInputString();
        hm.remove(english);
        System.out.println("Remove successful.");
    }
    
    public void translate(HashMap<String, String> hm) {
        System.out.print("Enter english: ");
        String english = vl.checkInputString();
        Set<Map.Entry<String, String>> entries = hm.entrySet();
        for (Map.Entry entry : entries) {
            if(entry.getKey().equals(english)) {
                System.out.println("Vietnamese: " + entry.getValue());
                return;
            }
        }
        System.err.println("Not found in data");
        
    }
    
    public boolean checkKeywordExist(HashMap<String, String> hm, String english) {
        Set set = hm.entrySet();
        Iterator iterator = set.iterator();
        while(iterator.hasNext()) {
            Map.Entry mentry = (Map.Entry) iterator.next();
            if(english.equalsIgnoreCase(mentry.getKey().toString())) {
                return false;
            }
        }
        return true;
    }
}
