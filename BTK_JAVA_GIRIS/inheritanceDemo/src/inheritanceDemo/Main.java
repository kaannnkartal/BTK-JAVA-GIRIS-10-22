package inheritanceDemo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*OgretmenKrediManager okm = new OgretmenKrediManager();
		TarimKrediManager tkm = new TarimKrediManager();
		
		okm.Hesapla();*/
		
		KrediUI krediUI = new KrediUI();
		
		krediUI.KrediHesapla(new AskerKrediManager());
		
		
	}

}
