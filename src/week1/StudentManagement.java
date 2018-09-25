package week1;
import java.util.ArrayList;
import  java.util.HashSet;
public class StudentManagement {

    private Student[] students = new Student[100];
    private  int numberOfStudent =4;
    // TODO: khai báo thuộc tính students là array chứa các đối tượng thuộc lớp Student (max. 100)

    public boolean sameGroup(Student s1, Student s2) {
        String str1 = s1.getGroup();
        String str2 = s2.getGroup();
        if(str1.equals(str2)) return true;
        return false; // xóa dòng này sau khi cài đặt
    }

    void studentsByGroup() {
        HashSet<String> StudentClass = new HashSet<String>();
        for(int i=0;i<numberOfStudent;++i) {
            StudentClass.add(students[i].getGroup());
        }
        for(String Group : StudentClass) {
            System.out.print("*Danh sach sinh vien lop"+ Group);
            for(int i=0;i<numberOfStudent;++i) {
                if(students[i].getGroup().equals(Group)) {
                    System.out.println(students[i].getInfo());
                }
            }
        }
        // TODO:
    }

    void removeStudent(String id) {
        int index = -1;
        for(int i=0;i<numberOfStudent;++i) {
            if(students[i].getId().equals(id)) {
                index = i;
                break;
            }
        }
        if(index!=-1){
            students[index]=null;
            for(int i = index;i<numberOfStudent-1;i++) {
                students[i] = students[i + 1];
            }
            students[numberOfStudent-1]=null;
            numberOfStudent--;
            System.out.println("Delete Successfully");
        }
        else System.out.println("Invalid To Remove Student By This " + id + " ID");

    }
    // TODO:

    public static void main(String[] args) {
        Student Student1 = new Student();
        Student1.setName("Bui Duy");
        Student1.setGroup("INT22042");
        Student1.setId("17020135");
        Student1.setEmaill("hkkd.uet.140598@gmail.com");
        Student Student2 = new Student();
        Student Student3 = new Student("Bui A","17024357","eegg@vnu.edu.vn");
        Student Student4 = new Student(Student2);

        StudentManagement StudentManagament1 = new StudentManagement();

        StudentManagament1.students[0]=Student1;
        StudentManagament1.students[1]=Student2;
        StudentManagament1.students[2]=Student3;
        StudentManagament1.students[3]=Student4;
        StudentManagament1.studentsByGroup();
        StudentManagament1.removeStudent("17020135");
        StudentManagament1.studentsByGroup();
        //cau 10
        if(StudentManagament1.sameGroup(Student1,Student2))	System.out.println("YES");
        else System.out.println("NO");
        // TODO:
    }
}