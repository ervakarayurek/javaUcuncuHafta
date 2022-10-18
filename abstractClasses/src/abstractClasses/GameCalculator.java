package abstractClasses;

public abstract class GameCalculator {
	public abstract void hesapla();
	
	public final void gameOver() {
		System.out.println("Oyun bitti.");
	}
}

//bu yazım GameCalculator'ı kullanan sınıfın gameOver kodunu da kullanmak zorunda olduğunu gösterir.
//hesapla da her sınıf override etmek zorunda demek.