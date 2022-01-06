class This_keyword 
{
    int a;
    This_keyword(int a)
    {
        this.a = a;
    }
    void show()
    {
        System.out.println(a);
    }
    public static void main(String[] argu) {

        This_keyword r = new This_keyword(100);

        r.show();
    }
}

/*output:- 

C:\Users\Tusha\Desktop\cmdusjava>javac This_keyword.java

C:\Users\Tusha\Desktop\cmdusjava>java v
Error: Could not find or load main class v
Caused by: java.lang.ClassNotFoundException: v

C:\Users\Tusha\Desktop\cmdusjava>java This_keyword
0

C:\Users\Tusha\Desktop\cmdusjava>javac This_keyword.java

C:\Users\Tusha\Desktop\cmdusjava>java  This_keyword
100

C:\Users\Tusha\Desktop\cmdusjava>*/



/*class This_keyword 
{
    This_keyword()
    {
         this(40);
    }
    This_keyword(int a)
    {
         
        System.out.println(a);
    }
     
    public static void main(String[] argu) {

        This_keyword r = new This_keyword();

    }

}

output screen cmd 
C:\Users\Tusha\Desktop\cmdusjava>javac This_keyword.java

C:\Users\Tusha\Desktop\cmdusjava>java Test
HELLO TUSHAR WHAT ARE YOU DOING RIGHT NOW
HELLO MY NAME IS JAVA PROGRAM

C:\Users\Tusha\Desktop\cmdusjava>java This_keyword
40

 */ 
// this keyword defualt constructor  and instance veriable use 


/*class This_keyword 
{
    This_keyword()
    {
        System.out.println("Hi Tushar How are you");
    }
    This_keyword(int a)
    {
        this();
        System.out.println(a);
    }
     
    public static void main(String[] argu) {

        This_keyword r = new This_keyword(10005);

    }
}

output screen 

C:\Users\Tusha\Desktop\cmdusjava>javac  This_keyword.java

C:\Users\Tusha\Desktop\cmdusjava>java This_keyword
Hi Tushar How are you
10005

*/

/* same unicode  this keyword example

class This_keyword 
{
    void show()
    {
        System.out.println(this);
    }
    public static void main(String[] argu) {

        This_keyword r = new This_keyword();
        System.out.println(r);
        r.show();
    }
}

output : - class uniq number show 

C:\Users\Tusha\Desktop\cmdusjava>javac This_keyword.java

C:\Users\Tusha\Desktop\cmdusjava>java This_keyword
This_keyword@5acf9800
This_keyword@5acf9800

*/