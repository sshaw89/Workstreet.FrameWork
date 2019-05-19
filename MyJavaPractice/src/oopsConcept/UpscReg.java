package oopsConcept;

public class UpscReg {

	public static void main(String[] args) {
		UpdateSend sd = new UpdateSend();
		System.out.println(sd);
		sd.login(12, "avi");
		sd.login(13, 387285);
		
			
	}	

	}


class SendUpsc{
	public void login(int regNo, String name) {
		System.out.println("mail sent");
	}
}
class UpdateSend extends SendUpsc{
	public void login(int rollNo, int phno) {
		System.out.println("mail sent");
	}
}
