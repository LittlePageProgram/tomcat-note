package com.littlepage.demo4;

class Student implements Say{
    @Override
    public void say() {
        System.out.println("student");
    }
}
class Help implements Say{
    Student s = null;
    public Help(Student s){
        s=s;
    }
    @Override
    public void say() {

    }
}
interface Say{
    void say();
}
class Use{
    public void use(Say s){
        s.say();
    }
}
public class ForceCast {
    public static void main(String[] args) {
        Student s = new Student();
        Use use = new Use();//某些情况，我们不得不使用Use调用Student
        Help help = new Help(s);//通过这个外观类
        use.use(s);
    }
}
