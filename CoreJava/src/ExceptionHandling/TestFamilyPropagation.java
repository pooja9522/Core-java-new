package ExceptionHandling;

public class TestFamilyPropagation {
	public static void main(String[] args) {
		dad();
	}
	private static void dad() {
		try {
	          mom();
			
		} catch (MistakeException e) {
			System.out.println(e);
		}
		}
	private static void mom() throws MistakeException{
	try {
		son();
		
	} catch (MistakeException e) {
		System.out.println(e);
		
	}
		
	}
	private static void son()throws MistakeException {
		MistakeException M=new MistakeException();
		throw M;
	}
		
	}
	
	
