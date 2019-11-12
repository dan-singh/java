package ds.session9;

public class MediaDriver {

	public MediaDriver() {
		// TODO Auto-generated constructor stub
		System.out.println("This is Media Driver Class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Media m1 = new Media();
		ElectronicMedia em1 = new ElectronicMedia();
		PaperMedia pm1 = new PaperMedia();
		NewsMedia md1 = new NewsMedia();
		
		em1.MainStreamResource(String.valueOf(em1.getClass()));
		pm1.MainStreamResource(String.valueOf(pm1.getClass()));
		md1.MainStreamResource(String.valueOf(md1.getClass()));
	}

}
