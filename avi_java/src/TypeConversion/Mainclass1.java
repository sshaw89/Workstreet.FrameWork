package TypeConversion;

public class Mainclass1 {

	public static void main(String[] args) 
	{
        Y ref = new Z();
        System.out.println(ref.c);
        System.out.println(ref.b);
        
        X ref1 = new Z();
        System.out.println(ref1.c);  // upcasting implicitly
        
        X ref2 = (X)new Y();  // upcasting explicitly
        System.out.println(ref2.c);
        System.out.println("==================================");
        // downcast only possible explicitly and first we have to upcast
        Y ref3 = (Y) new Z();
        Z ref4 = (Z) ref3;
        System.out.println(ref4.c);
        System.out.println(ref4.b);
        System.out.println(ref4.s);

	}

}
class X
{
char c = 'A';	
}
class Y extends X
{
	boolean b = false;
}
class Z extends Y
{
	String s = "java";
}