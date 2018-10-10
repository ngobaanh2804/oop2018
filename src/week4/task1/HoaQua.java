package week4.task1;

public class HoaQua {
    protected String name;
    protected   int giaca;
    protected   String nguongoc;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getNguongoc() {
        return nguongoc;
    }
    public void setNguongoc(String nguongoc) {
        this.nguongoc = nguongoc;
    }
    public int getGiaca() {
        return giaca;
    }
    public void setGiaca(int giaca) {
        this.giaca = giaca;
    }
    public void Price()
    {
        System.out.println("gia tien la" + this.giaca);
    }
    public void Tengoi()
    {
        System.out.println("Qua nay la"+ this.name);
    }
}
