package week2.task3;

public class Task3 {
    // TODO doi tung giao vien
    class teacher{
        String name;
        int age;
        String sex;
        public String getName()
        {
            return this.name;
        }
        public void setName(String name) {
            this.name=name;
        }
        public int getAge()
        {
            return this.age;
        }

        public void setAge(int age) {
            this.age = age;
        }
        public String getSex()
        {
            return this.sex;
        }

        public void setSex(String sex) {
            this.sex = sex;
        }
        // TODO ten giao vien
        public void Name()
        {
            System.out.println("ten toi la"+ this.name);
        }
        // TODO giao vien dang day hoc
        public void Teach()
        {
            System.out.println("I am teaching");
        }
        // TODO mon hoc
        public void Subject()
        {
            System.out.println("day mon toan");
        }
    }

}

//TODO: khai báo 3 class tương ứng với 3 đối tượng thực tế ở dưới
