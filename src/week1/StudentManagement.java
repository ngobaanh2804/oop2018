package week1;

import java.util.ArrayList;
import java.util.HashSet;

public class StudentManagement {
    public static ArrayList<Student> students= new ArrayList<Student>(100);

    // TODO: khai báo thuộc tính students là array chứa các đối tượng thuộc lớp Student (max. 100)

    public boolean sameGroup(Student s1, Student s2) {
        String st1=s1.getGroup();
        String st2=s2.getGroup();
        if(s1.equals(s2)) return true;
        // TODO: kiem tra 2 sinh vien co cung lop
        return false; // xóa dòng này sau khi cài đặt
    }

    void studentsByGroup() {
        HashSet<String> List = new HashSet<String>();
        for (Student st : students) {
            List.add(st.getGroup());
        }
        for (String Group : List) {
            System.out.println("Class" + Group);
            for (Student st : students) {
                if (st.getGroup().equals(Group)) {
                    System.out.println(st.getInfo());
                }}}
    }
                // TODO: in ra danh sach sinh vien theo tung lop
    }

    void removeStudent(String id) {
        // TODO:
    }

    public static void main(String[] args) {
    Student st1= new Student();
    st1.getName()= "Ngo Ba Anh";
    st1.getId();= "17020573";
    st1.getEmail();= "ngobaanh2804992gmail.com";
    st1.getGroup();= "INT22041";
    System.out.println(st1.getName());          System.out.println(st1.getInfo());
    Student st2 = new Student();
    st2.getName()= "Anh Ngo Ba";
    st2.getId();= "17020573";
    st2.getEmail()="ngobaanh2804@gmail.com";
    st2.getGroup()="INT22042";
    Student st3 = new Student("Ba Anh","17028073","17020228@vnu.edu.vn");
    Student st4 = new Student(st2);


        // TODO:
    }
}
