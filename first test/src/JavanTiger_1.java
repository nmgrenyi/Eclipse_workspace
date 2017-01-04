class Tiger {
     int age; // 年龄
     int hight; // 身体高度
 
     public Tiger() {
         print();
     }
     public Tiger(int age) {
    	     this.age = age;
    	     print();
    	     }
     public void print() {
         System.out.println("I'am a " + age + "岁 " + hight + "尺高 tiger!");
     }
 }
 public class JavanTiger_1 extends Tiger {    
     public JavanTiger_1() {
         super(1);    // 调用父类无参数的构造函数
     }
     public static void main(String[] args) {
         new JavanTiger_1();
     }
 }