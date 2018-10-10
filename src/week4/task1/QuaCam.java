package week4.task1;

public class QuaCam extends HoaQua {
    protected int soluong;

    public int getSoluong() {
        return soluong;
    }
    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }
    @Override
    public int getGiaca() {
        return super.getGiaca();
    }
    @Override
    public void setGiaca(int giaca) {
        super.setGiaca(giaca);
    }
    @Override
    public String getNguongoc() {
        return super.getNguongoc();
    }
    @Override
    public void setNguongoc(String nguongoc) {
        super.setNguongoc(nguongoc);
    }
    public void Price()
    {
        System.out.println("Gia la"+ super.giaca );
    }
    public void Soluong()
    {
        System.out.println("So luong nhap"+ this.soluong);
    }
}
