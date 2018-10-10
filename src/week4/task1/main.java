package week4.task1;

public class main {
    public static void main(String[] abc) {
        HoaQua hq = new HoaQua();
        QuaCam qc = new QuaCam();
        QuaTao qt = new QuaTao();
        CamCaoPhong ccp = new CamCaoPhong();
        CamSanh cs = new CamSanh();
        cs.setSoluong(10);
        System.out.println(" So luong la 10");
        hq.setNguongoc("Vietnam");
        System.out.println("Xuat xu tu Vietnam");
        qc.setGiaca(10000);
        System.out.println("Gia 10kg la 10000");
        qt.setGiaca(20000);
        System.out.println("Gia 10kg la 10000");
    }
}
