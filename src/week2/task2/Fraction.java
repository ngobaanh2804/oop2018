package week2.task2;

public class Fraction {
    private int numerator;
    private int denominator;

    // TODO: khai báo các thuộc tính

    public Fraction(int numerator, int denominator) {
        this.numerator=numerator;
        this.denominator=denominator;
        // TODO: khởi tạo giá trị cho các thuộc tính numberator (tử số), denominator (mẫu số)
    }

    public int getNumerator() {
        return numerator;
    }
    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }
    public int getDenominator() {
        return denominator;
    }
    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }
        // TODO: getter setter

    public Fraction add(Fraction other) {
        Fraction ps = new Fraction(0,1);
        ps.numerator=this.numerator * other.denominator + this.denominator * other.numerator;
        ps.denominator=this.denominator * other.denominator;
        return ps;
        // TODO: Phương thức cộng hai phân số (this và other), trả về đối tượng Fraction mới
    }

    public Fraction subtract(Fraction other) {
        Fraction ps = new Fraction(0,1);
        ps.numerator=this.numerator * other.denominator - this.denominator * other.numerator;
        ps.denominator=this.denominator * other.denominator;
        return ps;
        // TODO: Phương thức trừ hai phân số (this và other), trả về đối tượng Fraction mới
    }

    public Fraction multiply(Fraction other) {
        Fraction ps = new Fraction(0,1);
        ps.numerator=this.numerator * other.numerator;
        ps.denominator=this.denominator * other.denominator;
        return ps;
        // TODO: Phương thức nhân hai phân số (this và other), trả về đối tượng Fraction mới
    }

    public Fraction divide(Fraction other) {
        Fraction ps = new Fraction(0,1);
        ps.numerator=this.numerator * other.denominator;
        ps.denominator=this.denominator * other.numerator;
        return ps;
        // TODO: Phương thức chia hai phân số (this và other), trả về đối tượng Fraction mới
    }

    @Override
    public boolean equals(Object obj) {
     Fraction PS = (Fraction) obj;
     int temp =(this.numerator * PS.denominator) - (this.denominator * PS.numerator);
     if(temp==0)        return true;
     else return false;
    }
    public static void main (String[]args){
        Fraction ps1 = new Fraction(2,3);
        Fraction ps2 = new Fraction(2,3);
        System.out.println(ps1.add(ps2));
        System.out.println(ps1.subtract(ps2));
        System.out.println(ps1.multiply(ps2));
        System.out.println(ps1.divide(ps2));
        System.out.println("ps1=ps2 la true hay false : "+ps1.equals(ps2));
    }
}
