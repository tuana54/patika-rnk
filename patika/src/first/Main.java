package first;

public class Main {
	public static void main(String[] args) {
		First a=new First("hello world");
		/*System.out.println(a.str);*/
		// string str ifadesini private yaptığım zaman burda ulaşamam fakat first classında bir metod
		//tanımlayıp onu çağırmayı deneylim
		a.Showstr();
		// bu sefer hata vermedi çünkü ben string str yi kendi sıonıfının içinde bir metot kullanarak çağırdım
		//daha sonra kullandığım metotu da main içinde çağırdım
	}
}
