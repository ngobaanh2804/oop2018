package week4.task1;

public class CamCaoPhong extends QuaCam {
    @Override
    public void setNguongoc(String nguongoc) {
        super.setNguongoc(nguongoc);
    }
    @Override
    public String getNguongoc() {
        return super.getNguongoc();
    }
    @Override
    public void setSoluong(int soluong) {
        super.setSoluong(soluong);
    }
    @Override
    public int getSoluong() {
        return super.getSoluong();
    }
    public void Soluong()
    {
        System.out.println("So luong nhap"+ super.soluong);
    }
}
