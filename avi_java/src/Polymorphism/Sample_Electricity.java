package Polymorphism;

public class Sample_Electricity 
	{
		void supply(String grd ) 
		{
			System.out.println("electric supply by "+grd);
		}
		void supply(String grd , int pnl)
		{
			System.out.println("electric supply by "+grd +" and "+pnl +" solar panels");
		}
		void supply(int pnl , String th)
		{
			System.out.println("electric supply by "+pnl +" and "+th);
		}
	}
class Sample_electricity1 extends Sample_Electricity
{
    void supply(String nuke)
    {
    	System.out.println("electric supply by "+nuke +" nothing to worry");
    }
}


