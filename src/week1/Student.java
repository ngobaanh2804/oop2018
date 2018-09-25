package week1;
public class Student {

    private String name;
    private String id;

    private String group;
    private String email;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getId(){
        return id;
    }
    public void setId(String id){
        this.id = id;
    }
    public String getGroup(){return group;}

    public void setGroup(String group)
    {

        this.group = group;
    }

    public String getEmail(){return email;}

    public void setEmaill(String email)
    {

        this.email = email;
    }
    // TODO: khai báo các phương thức getter, setter cho Student

    /**
     * Constructor 1
     */
    Student() {
        this.name = "Student";

        this.id = "000";

        this.group = "INT22041";

        this.email = "uet@vnu.edu.vn";

        // TODO:
    }

    /**
     * Constructor 2
     * @param n
     * @param sid
     * @param em
     */
    Student(String n, String sid, String em) {
        this.name = n;

        this.id =sid;
        this.group="INT20041";
        this.email = em;

        // TODO:
    }

    /**
     * Constructor 3
     * @param s
     */
    Student(Student s) {
        this.name  = s.name;

        this.id = s.id;

        this.group = s.group;

        this.email = s.email;
        // TODO:
    }

    String getInfo() {
        String s = this.name + " " + this.id + " " + this.group +" " +this.email;
        return s;
        // TODO:

    }
}