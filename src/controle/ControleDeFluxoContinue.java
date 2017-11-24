package controle;

public class ControleDeFluxoContinue {

	public static void main(String[] args) {
		for(int i =0; i < 100; i++) {
			if(i > 20 && i < 90) {
				continue;
			}
			System.out.println(i);
		}
	}
}
