package firstCase;

public class InterfaceSource implements MyInterface {

	@Override
	public void testMethod() {
		InterfaceDest.someSimilarUsingOfMyInterface(()->{
			;
		});
	}

}
