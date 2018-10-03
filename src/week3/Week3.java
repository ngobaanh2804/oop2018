package week3;

public class Week3 {

    public static int max(int m, int n) {
        /**
         * @param m là só thứ nhất
         * @param n là số thứ hai
         * @return giá trị lớn nhất của hai số m và n
         */
        if(m>n)
            return m;
        else
            return n;
        // TODO: Tìm giá trị lớn nhất của hai số nguyên, giá trị trả về của hàm là số lớn nhất
    }

    public static int minOfArray(int[] array) {
        /**
         * @param array là mảng số nguyên
         * @return giá trị nhỏ nhất của mảng số nguyên
         */
        int i,min;
        min=array[0];
        for (i=0;i<array.length;i++){
            if (array[i]<min) min=array[i];
        }
        return min;
        // TODO: Tìm giá trị nhỏ nhất của của một mảng số nguyên (kích thước mảng <= 100 phần tử)
    }

    /**
     * Chương trình tính chỉ số BMI và in ra kết quả đánh giá
     * @param weight cân nặng
     * @param height chiều cao
     * @return Thiếu cân, Bình thường, Thừa cân, Béo phì
     */
    public static String calculateBMI(double weight, double height) {
        double BMI;
        BMI=weight/(height*height);
        if (BMI<18.5) return "Thiếu cân";
        if (BMI>=18.5 && BMI <23) return "Bình thường";
        if (BMI>=23 && BMI<25) return "Thừa cân";
        return "Béo phì";
        // TODO: Viết chương trình tính chỉ số BMI và in ra kết quả đánh giá
    }
}
