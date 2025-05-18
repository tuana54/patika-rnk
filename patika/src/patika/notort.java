package patika;
import java.util.Scanner;
public class notort {

	/*public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int fizik,mat,tarih,turkce,kimya,muzik;
		
		System.out.println("mat notunuzu girin:");
		mat=input.nextInt();
		System.out.println("fizik notunuzu girin:");
		fizik=input.nextInt();
		System.out.println("tarih notunuzu girin:");
		tarih=input.nextInt();
		System.out.println("turkce notunuzu girin:");
		turkce=input.nextInt();
		System.out.println("kimya notunuzu girin:");
		kimya=input.nextInt();
		System.out.println("muzik notunuzu girin:");
		muzik=input.nextInt();
		
		int sonuc=fizik+mat+tarih+turkce+kimya+muzik;
		double ort=sonuc/6;
		
		System.out.println("ortalamanız: "+ort);
		if(ort>60) {
			System.out.println("sınıfı geçti");
		}
		else {
			System.out.println("sınıfta kaldı");
		}
		

	}*/
	
	/*public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		double tutar,kdv=0.18;
		System.out.println("ucret tutarini giriniz: ");
		tutar=input.nextDouble();
		double kdvTutar=tutar*kdv;
		double kdvliTutar=tutar+kdvTutar;
		System.out.println("ödeyeceğiniz tutar: "+kdvliTutar);
		
	}*/
	/*public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		double tutar,kdv;
		System.out.println("ucret tutarını giriniz:");
		tutar=input.nextDouble();
		if(tutar<1000&& tutar>0) {
			kdv=0.18;
		}
		else {
			kdv=0.08;
		}
		double kdvTutar=tutar*kdv;
		double kdvliTutar=tutar+kdvTutar;
		System.out.println("ödeyeceğiniz tutar: "+kdvliTutar);
	}*/
	
	/*public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int a,b;
		System.out.println("üçgenin 1. kenar uzunluğunu giriniz:");
		a=input.nextInt();
		System.out.println("üçgenin 2.kenar uzunluğunu giriniz: ");
		b=input.nextInt();
		
		double c=Math.sqrt((a*a)+(b*b));
		System.out.println("hipotenüs uzunluğu: "+c);
		
		
		
	}*/
	
	/*public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int a,b,c;
		System.out.println("üçgenin kenar uzunluklarını giriniz:" );
		a=input.nextInt();
		b=input.nextInt();
		c=input.nextInt();
		
		double u=(a+b+c)/2;
		double cevre=2* u;
		double alan=Math.sqrt(u*(u-a)*(u-b)*(u-c));
		System.out.println("üçgenin alanı: "+alan);
	}*/
	
	/*public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		double km=2.20,yol,acilis=10,tutar;
		System.out.println("gidilecek yol mesafesini giriniz: ");
		yol=input.nextInt();
		tutar=(yol*km)+acilis;
		if(tutar<20) {
			System.out.println("ödenecek tutar: 20");
		}
		else {
			System.out.println("ödenecek tutar: "+tutar);
		}
		
		
	
	}*/
	
	/*public static void main(String[] args) {
		Scanner input=new Scanner (System.in);
		double pi=3.14,yaricap;
		System.out.println("dairenin yarı çapını giriniz: ");
		yaricap=input.nextDouble();
		double alan=pi*yaricap*yaricap;
		double cevre=2*pi*yaricap;
		System.out.println("dairenin alanı: "+alan);
		System.out.println("dairenin çevresi: "+cevre);,
	}*/
	/*public static void main(String[] args) {
		Scanner input=new Scanner (System.in);
		double pi=3.14,yaricap,daireDilimi;
		System.out.println("dairenin yarı çapını giriniz: ");
		yaricap=input.nextDouble();
		System.out.println("daire diliminin açısını giriniz: ");
		daireDilimi=input.nextDouble();
		double alan=(pi*(yaricap*yaricap)*daireDilimi)/360;
		System.out.println("dairenin alanı: "+alan);
	}*/
	
	/*public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		double kilo,boy,indeks;
		System.out.println("lütfen boyunuzu metre cinsinden giriniz: ");
		boy=input.nextDouble();
		System.out.println("lütfen kilonuzu giriniz: ");
		kilo=input.nextDouble();
		indeks=kilo/boy*boy;
		System.out.println("vücut kitle indeksiniz: "+indeks);
		
	}*/
	/*public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		double armut,elma,domates,muz,patlican,toplam;
		System.out.println("armut kaç kilo?");
		armut=input.nextDouble();
		System.out.println("elma kaç kilo?");
		elma=input.nextDouble();
		System.out.println("domates kaç kilo?");
		domates=input.nextDouble();
		System.out.println("muz kaç kilo?");
		muz=input.nextDouble();
		System.out.println("patlıcan kaç kilo?");
		patlican=input.nextDouble();
		toplam=(2.14*armut)+(3.67*elma)+(1.11*domates)+(0.95*muz)+(5*patlican);
		System.out.println("toplam tutar: "+toplam);
		
	}*/
	/*public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int gun;
		System.out.println("girmek istediğiniz günün numarasını tuşlayınız: ");
		gun=input.nextInt();
		switch(gun) {
		case 1:
			System.out.println("pazartesi");
			break;
		case 2:
			System.out.println("salı");
			break;
		case 3:
			System.out.println("çarşamba");
			break;
		case 4:
			System.out.println("perşembe");
			break;
		case 5:
			System.out.println("cuma");
			break;
		case 6:
			System.out.println("cumartesi");
			break;
		case 7:
			System.out.println("pazar");
			break;	
		default:
			System.out.println("hatalı tuşlama yaptınız");
			break;	
		}
		
	}*/
	/*public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int sayi1,sayi2,islem;
		System.out.println("1. sayıyı giriniz:");
		sayi1=input.nextInt();
		System.out.println("2. sayıyı giriniz:");
		sayi2=input.nextInt();
		System.out.println("1-toplama\n 2-çıkarma\n 3-çarpma\n 4-bölme işlemlerinden istediğiniz numarayı tuşlayın:");
		islem=input.nextInt();
		switch(islem) {
		case 1 :
			int topla=sayi1+sayi2;
			System.out.println("sonuç:"+topla);
			break;
		case 2:
			int cikar=sayi1-sayi2;
			System.out.println("sonuç"+cikar);
			break;
		case 3:
			int carp=sayi1*sayi2;
			System.out.println("sonuç:"+carp);
			break;
		case 4:
			int bol=sayi1/sayi2;
			System.out.println("sonuç"+bol);
			break;
		default:
			System.out.println("yanlış tuşlama yaptınız");
			break;
		}
	
	}*/
	/*public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String ad,sifre;
		System.out.println("lütfen kullanıcı adınızı giriniz:");
		ad=input.nextLine();
		System.out.println("lütfen şifrenizi giriniz:");
		sifre=input.nextLine();
		
		if(ad.equals("patika")&& sifre.equals("patika123")) {
			System.out.println("giriş başarılı");
		}
		else {
			System.out.println("hatalı tuşlama yaptınız");
			String sifirlama;
			System.out.println("şifrenizi sıfırlamak ister misiniz?");
			sifirlama=input.nextLine();
			if(sifirlama.equals("evet")) {
				String yenisifre;
				System.out.println("yeni şifrenizi giriniz: ");
				yenisifre=input.nextLine();
				if(yenisifre.equals("patika123")){
					System.out.println("şifre oluşturulamadı lütfen yeni şifre giriniz");
				}
				else {
					System.out.println("şifreniz başarıyla oluşturuldu");
				}
			}
			else {
				System.out.println("sistemden çıkış yapılıyor.. ");
			}
			
		}
	}*/
	/*public static void main(String[] args) {
		Scanner input=new Scanner (System.in);
		int mat,türk,fiz,kim,biy,ort;
		System.out.println("mat notunuzu giriniz: ");
		mat=input.nextInt();
		System.out.println("türkçe notunuzu giriniz: ");
		türk=input.nextInt();
		System.out.println("fizik notunuzu giriniz: ");
		fiz=input.nextInt();
		System.out.println("kimya notunuzu giriniz: ");
		kim=input.nextInt();
		System.out.println("biyoloji notunuzu giriniz: ");
		biy=input.nextInt();
		ort=(mat+türk+fiz+biy+kim)/5;
		if(ort>=55) {
			System.out.println("sınıfı geçtiniz");
		}
		else {
			System.out.println("sınıfta kaldınız");
		}
	}*/
	/*public static void main(String[] args) {
		Scanner input=new Scanner (System.in);
		double mesafe,toplam,yas,indirimY=0,indirimYol=0,km=0.10;
		System.out.println("gideceğiniz mesafeyi giriniz: ");
		mesafe=input.nextDouble();
		System.out.println("yaşınızı giriniz: ");
		yas=input.nextDouble();
		String yolTip;
		System.out.println("yolculuk tipinizi giriniz: ");
		yolTip=input.nextLine();
		toplam=mesafe*km;
		toplam=input.nextDouble();
		if(yas<12) {
			indirimY=toplam *0.5;	
		}
		else if(yas>12&&yas<24) {
			indirimY=toplam*0.1;
		}
		else if(yas>65) {
			indirimY=toplam*0.3;
		}	
		if(yolTip.equals("gidiş dönüş")) {
			indirimYol=toplam*0.2;
		}
		
		double ode=toplam-indirimY-indirimYol;
		System.out.println("ödenecek tutar: "+ode);
	}*/
	/*public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String sifre="123";
		boolean basarili=false;
		
		while(!basarili) {
			System.out.println("şifrenizi giriniz:");
			String girilenSifre;
			girilenSifre=input.nextLine();
			
			if(sifre.contentEquals(girilenSifre)) {
				basarili=true;
				System.out.println("giriş başarılı");
			}
		}
	}*/
	/*public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int k;
		System.out.println("lütfen bir sayı giriniz: ");
		k=input.nextInt();
		int toplam=0;
		int sayac=0;
		for(int i=0;i<=k;i++) {
			if(i%3==0 && i%4==0) {
				toplam+=i;
				sayac++;
			}
		}
		if(sayac>0) {
			double ortalama=toplam/sayac;
			System.out.println("ortalama: "+ortalama);
		}
		else {
			System.out.println("sayı bulunamadı");
		}
	 
	}*/
	/*public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int sayi;
		int toplam=0;
		do {
			System.out.println("bir sayi giriniz:");
			sayi=input.nextInt();
			if(sayi%2==1) {
				toplam+=sayi;
			}
		}while(sayi>=0);
		System.out.println("girilen tek sayıların toplamı: "+toplam);
	}*/
	/*public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int sayi,toplam=0;
		do {
			System.out.println("bir sayi giriniz:");
			sayi=input.nextInt();
			
			if(sayi%4==0) {
				toplam+=sayi;
			}
		}while(sayi%2==0);
		System.out.println("girilen çift ve 4ün katı olan sayıların toplamı:"+toplam);
	}*/
	
	/*static int power(int base,int exp) {
		int result=1;
		for(int i=1;i<=exp;i++) {
			result *=base;
		}
		return result;
	}
	public static void main(String[] args) {
		int case1=power(2,3);
		System.out.println(case1);
	}*/
	/*static int toplam (int x,int y) {
		int sonuc=x+y;
		return sonuc;
	}
	public static void main(String[] args) {
		int case1=toplam(3,7);
		System.out.println("sonuç:"+case1);
	}*/
	
	/*static void toplam(int x,int y){
		System.out.println(x+y);
	}
	public static void main(String[] args) {
		toplam(3,5);
	}*/
	
	/*static int f(int n ) {
		int result=0;
		for(int i=0;i<=n;i++) {
			result+=i;
		}
		return result;
	}
	public static void main(String[] args) {
		System.out.println(f(3));
	}*/
	/*static int f(int n) {
		if(n==1) {
			return 1;
		}
		int result=f(n-1)+n;
		return result;
	}
	public static void main(String[] args) {
		System.out.println(f(3));
	}*/
	
	
	
}
	