package com.stringislemleri;

public class runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String deger="12345";
		
		deger=" deneme yazisý ";
		
		//string uzunlugu
		System.out.println(deger.length());
		
		//stringin basýnda ve sonunda bosluklarý kýrpmak
		System.out.println(deger.trim());
		
		//string içinde deðiþiklik yapma
		System.out.println(deger.replace("y", "Y"));
		System.out.println(deger.replace(" ", ""));
		
		//bir string içinde index numarasý verilen karakteri bulma
		System.out.println(deger.charAt(4));
		
		//bir string içinden verilen index aralýðýnda deðeri verir
		System.out.println(deger.substring(8, 15));
		
		//iki string deðeri birleþtirmek için kullanýlýr
		System.out.println(deger.concat("kim?"));
		System.out.println(deger+"kim???");
		
		//iki string içeriðin doðruluðunu gösterir
		// deger="icerik";
		System.out.println(deger.equals("icerik"));
		System.out.println(deger=="icerik");
		
		//bir string içindeki karakterin yerini verir.
		System.out.println(deger.indexOf("n"));
		System.out.println(deger.lastIndexOf("i"));
		System.out.println(deger.indexOf("þþ"));
		
		//bir string ifadenin boþ olup olmadýðýný sorgular
		//boþ ise TRUE bos deðil ise FALSE.
		System.out.println(deger.isEmpty());
		System.out.println(deger.trim().isEmpty());
		
		
		deger="HER SEY büyük Harfle yazýlýr";
		//verilen ifadeyi küçük harfle yazar
		System.out.println(deger.toLowerCase());
		//verilen ifadeyi büyük harfle yazar
		System.out.println(deger.toUpperCase());
		
		//bir string dizisini verilen ifadeye göre ayrýþtýrýr
		deger="adý:ali,soyad:ALÝ,telefon: 0555 555 ";
		System.out.println(deger.split(",")[0].split(":")[1]);
		System.out.println(deger.split(",")[1]);
		System.out.println(deger.split(",")[2]);
	}

}
