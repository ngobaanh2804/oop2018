package week1;

import java.util.ArrayList;
import java.util.HashSet;

public class StudentManagement {
    Student[] students= new Student[100];

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
    Student stu1 = new Student();
    Student stu2 = new Student("anh" , "111" , "anh@gmail.com.vn");
    Student stu3 = new Student(stu2);
    StudentManagement s = new StudentManagement();
        s.students[0]= new Student();
        s.students[0].setName("anh");
        s.students[0].setId("111");
        s.students[0].setGroup("INT 22041");
        s.students[0].setEmail("anh@vnu.edu.vn");

        s.students[1] = new Student();
        s.students[1].setName("ngo anh");
        s.students[1].setId("222");
        s.students[1].setGroup("INT 22041");
        s.students[1].setEmail("anhngo@vnu.edu.vn");

        s.students[2] = new Student();
        s.students[2].setName("ngo ba anh");
        s.students[2].setId("333");
        s.students[2].setGroup("INT 22042");
        s.students[2].setEmail("ngobaanh@vnu.edu.vn");
        System.out.println(st.sameGroup(stu1,stu2) + "\n"+ s.sameGroup(stu1,stu3));
        s.removeStudent("222");
        System.out.println("danh sach luc sau : " + "\n");
        s.studentsByGroup();
        // TODO:
    }
}}}