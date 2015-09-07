package Questao3;

public class FabricaDeCarro {
	
	private static  FabricaDeCarro INSTANCE = new FabricaDeCarro();

	public static FabricaDeCarro getInstance(){
		return INSTANCE;
	}

}
