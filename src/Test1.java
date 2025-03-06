/*
1. we can see that an object of Test2 was created
2. instead of executing the Test2 constructor, the program execute the parent
    constructor before the child because of inheritance.
3. the program goes to Test1 class. then we see that we initialize var1 = 555,
    and it goes to print AAA
4. doSomething() method is in Test1 class too but because Test2 overrides the method,
    Test2 doSomething() gets executed instead of Test1 doSomething()
5. in Test2 doSomething(), the program executes the method and prints Var2, but Var2
    wasn't initialize so the output will be Var2 = 0. and we are done with Test1 constructor

6. now go to Test2 constructor, and we print BBB
7. Test2 doSomething() gets executed, and Var2 still hasn't been initialized
    so the method prints Var2 = 0
8. we see that Var2 = 111, but because doSomething() method was called before,
    that line of code doesn't get printed

    so in the end we get...
    AAA
    Var2 = 0
    BBB
    Var2 = 0
    Var1 = 555

* */
public class Test1 {
    public int Var1;
    public Test1(){
        Var1 = 555;
        System.out.println("AAA");
        doSomething();
    }
    public void doSomething(){
        Var1 = 1111;
        System.out.println("A.doSomething()");
    }
}

class Test2 extends Test1{
    public int Var2;
    public Test2(){
        System.out.println("BBB");
        doSomething();
        System.out.println("Var1=" + Var1);
        Var2 = 111;
    }
    public void doSomething(){
        System.out.println("Var2=" + Var2);
    }

    public static void main(String[] args) {
        new Test2();
    }
}
