package week4.task1;

public class CamSanh extends QuaCam {
    @Override
    public void setSoluong(int soluong) {
        super.setSoluong(soluong);
    }
    @Override
    public int getSoluong() {
        return super.getSoluong();
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
        System.out.println("Gia la"+ super.giaca );
    }
}
