

package Dictionary;

import java.util.HashMap;


public class Main {

    public static void main(String[] args) {
        HashMap<String, String> hm= new HashMap<>();
        Manager mn = new Manager();
        while(true) {
            int choice = mn.menu();
            switch (choice) {
                case 1:
                    mn.addNewWord(hm);
                    break;
                case 2:
                    mn.deleteWord(hm);
                    break;
                case 3:
                    mn.translate(hm);
                    break;
                case 4:
                    return;
            }
        }
    }
}
