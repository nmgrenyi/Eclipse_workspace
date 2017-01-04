class JavanTiger {
     int age;      // 年龄
     int hight;    // 身体高度
 
     public JavanTiger() {
         print();
         this.age=2;   //这里初始化 age 的值 ，但递归返回的时候，这个值会被覆写
         print();
     }
     
     public JavanTiger(int age) {
         this();      // 调用自己的第一个构造函数，下面的两个语句数不执行的
         this.age = age;
         print();
     }
 
     public JavanTiger(int age, int hight) {
         this(age);   // 调用自己第二个构造函数  ，下面的两个语句数不执行的
         this.hight = hight;
         print();
     }
 
     public void print() {  //打印函数
         System.out.println("I'am a " + age + "岁 " + hight + "尺高 tiger!");
     }
     public static void main(String[] args) {
         new JavanTiger(3,3);
     }
 }