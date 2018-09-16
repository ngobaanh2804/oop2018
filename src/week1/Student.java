package week1;

public class Student {
        private String name;
        private String id;
        private String group;
        private String email;
    // TODO: khai báo các thuộc tính cho Student
        public  String getName(){   return name; }      public void setName(){ this.name=name;}
        public  String getId(){     return id; }        public void setId(){ this.id=id;}
        public  String getGroup(){  return group; }     public void setGroup(){ this.group=group;}
        public  String getEmail(){  return email; }     public void setEmail(){ this.email=email;}
    // TODO: khai báo các phương thức getter, setter cho Student

    /**
     * Constructor 1
     */
    Student() {
        this.name="student";
        this.id="000";
        this.group="INT22041";
        this.email="uet.@vnu.edu.vn";
        // TODO:Phuong thuc khoi tao khong co tham so : Strudent()
    }

    /**
     * Constructor 2
     * @param n
     * @param sid
     * @param em
     */
    Student(String n, String sid, String em) {
        this,name=n;
        this.id=sid;
        this.email=em;
        this.group="INT22041";
        // TODO:phuong thuc khoi tao co tham so: Student()
    }

    /**
     * Constructor 3
     * @param s
     */
    Student(Student s) {
        // TODO:
    }

    String getInfo() {
        // TODO:
        return null; // xóa dòng này sau khi cài đặt
    }
    String getInfo() {
        String this = name + " " + id + " " + group +" " +email;
        return this;
        // TODO:phuong thuc String getInfo()
    }
}
