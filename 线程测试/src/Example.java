public class Example {
    public static void main(String[] args) {
        People peopleOne,peopleTwo;
        StringBuffer str=new StringBuffer();
        peopleOne=new People("张三",str);
        peopleTwo =new People("李四",str);
        peopleOne.start();
        peopleTwo.start();
    }
}
