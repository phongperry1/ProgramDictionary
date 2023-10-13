public class Test5 {
    public static void main(String[] args) {
        Ngay ngay1 = new Ngay(12, 3, 2022);
        Ngay ngay2 = new Ngay(3, 1, 2020);
        Ngay ngay3 = new Ngay(21, 11, 2019);
        
        HangSanXuat hang1 = new HangSanXuat("Toei","Nhat Ban");
        HangSanXuat hang2 = new HangSanXuat("Bandai","Nhat Ban");
        HangSanXuat hang3 = new HangSanXuat("KBS", "Han Quoc");
                
        BoPhim bophim1 = new BoPhim("Kamen Rider Zio", 2021, hang1, 200000, ngay1);
        BoPhim bophim2 = new BoPhim("Kamen Rider W", 2012, hang2, 150000, ngay2);
        BoPhim bophim3 = new BoPhim("The Glory", 2023, hang3, 100000, ngay3);
        
        System.out.println("So sanh phim 1 co re hon phim 2 khong: " + bophim1.Kiemtragiaverehon(bophim2));
        System.out.println("So sanh phim 2 co re hon phim 3 khong: " + bophim2.Kiemtragiaverehon(bophim3));
        System.out.println("So sanh phim 1 co re hon phim 3 khong: " + bophim1.Kiemtragiaverehon(bophim3));
        
        System.out.println("Ten hang san xuat bo phim 1: " + bophim1.laytenhangsanxuat());
        System.out.println("Ten hang san xuat bo phim 2: " + bophim2.laytenhangsanxuat());
        System.out.println("Ten hang san xuat bo phim 3: " + bophim3.laytenhangsanxuat());
        
        System.out.println("Bo phim 1 sau khi giam gia 20%: " + bophim1.giaSaukhuyenmai(20));
        System.out.println("Bo phim 2 sau khi giam gia 40%: " + bophim2.giaSaukhuyenmai(40));
        System.out.println("Bo phim 3 sau khi giam gia 60%: " + bophim3.giaSaukhuyenmai(60));
    }
    
}
