package week4.task1;

public class QuaTao extends HoaQua {
    protected String nsx;
    public String getNsx() {
        return nsx;
    }
    public void setNsx(String nsx) {
        this.nsx = nsx;
    }
    @Override
    public int getGiaca() {
        return super.getGiaca();
    }
    @Override
    public void setGiaca(int giaca) {
        super.setGiaca(giaca);
    }
    public void Price()
    {
        System.out.println("Gia tien la"+super.giaca);
    }
    public void Ngaysanxuat()
    {
        System.out.println("ngay san xuat" +this.nsx );
    }
}
