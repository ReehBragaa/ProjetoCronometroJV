//CONOMETRO
package Cronometro;

public class ProjetoCronometro {

	public static void main(String[] args) {
		try {
			for (int i = 0; i < 60; i++) {
				for (int j = 0; j < 60; j++) {
					System.out.println(i + ":" + j);
					Thread.sleep(1000);
				}
			}
		} catch (Exception e) {
			System.out.println("Não foi possivel adicionar um segundo em cada execução do laço FOR");
		}
	}

}
