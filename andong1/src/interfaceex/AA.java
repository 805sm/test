package interfaceex;

public class AA implements Area{
	public static void main(String[] args) {
		AA a= new AA();
		a.disp();
		a.disp1();
	}

	@Override
	public void disp1() {
		// TODO Auto-generated method stub
		System.out.println("test1");
	}

	@Override
	public void disp() {
		// TODO Auto-generated method stub
		System.out.println("test");
	}

	


}
