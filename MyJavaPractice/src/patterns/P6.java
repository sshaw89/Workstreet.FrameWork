package patterns;

public class P6 {

	public static void main(String[] args) {
		diamondpattern(9);

	}
	public static void diamondpattern(int n) {
		int mid = (n/2)+1 , space  = n, star = 1;
		for(int i = 1; i<=n; i++)
		{
			for(int j = 1; j<=space;j++)
			{
				System.out.print(" ");
			}
			for(int k = 1; k<=star; k++)
			{
				System.out.print(k);
			}
			System.out.println();
			if(i<mid) {
				space--;
				star+=2;
			}else {
				space++;
				star-=2;
			}
		}
	}

}
