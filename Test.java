//super keyword program type 1
class A
{
    void show()
    {
        System.out.println("HELLO TUSHAR WHAT ARE YOU DOING RIGHT NOW");
    }
}
 
class B extends A
{
   
  void show()
  {
      super.show();
      System.out.println("HELLO MY NAME IS JAVA PROGRAM");
  }
}
class Test
{
    public static void main(String[] argu) {

        B tr = new B();
        tr.show();
    }

}
// type two
/*class A
{
   A(int a)
    {
        System.out.println("HELLO TUSHAR WHAT ARE YOU DOING RIGHT NOW"+ a);
    }
}
 
class B extends A
{
   
  B()
  {
      super(1986);
      System.out.println("HELLO MY NAME IS JAVA PROGRAM");
  }
}
class Test
{
    public static void main(String[] argu) {

        B tr = new B();
        tr.show();
    }

}
*/
