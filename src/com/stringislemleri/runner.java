package com.stringislemleri;

public class runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String deger="12345";
		
		deger=" deneme yazis� ";
		
		//string uzunlugu
		System.out.println(deger.length());
		
		//stringin bas�nda ve sonunda bosluklar� k�rpmak
		System.out.println(deger.trim());
		
		//string i�inde de�i�iklik yapma
		System.out.println(deger.replace("y", "Y"));
		System.out.println(deger.replace(" ", ""));
		
		//bir string i�inde index numaras� verilen karakteri bulma
		System.out.println(deger.charAt(4));
		
		//bir string i�inden verilen index aral���nda de�eri verir
		System.out.println(deger.substring(8, 15));
		
		//iki string de�eri birle�tirmek i�in kullan�l�r
		System.out.println(deger.concat("kim?"));
		System.out.println(deger+"kim???");
		
		//iki string i�eri�in do�rulu�unu g�sterir
		// deger="icerik";
		System.out.println(deger.equals("icerik"));
		System.out.println(deger=="icerik");
		
		//bir string i�indeki karakterin yerini verir.
		System.out.println(deger.indexOf("n"));
		System.out.println(deger.lastIndexOf("i"));
		System.out.println(deger.indexOf("��"));
		
		//bir string ifadenin bo� olup olmad���n� sorgular
		//bo� ise TRUE bos de�il ise FALSE.
		System.out.println(deger.isEmpty());
		System.out.println(deger.trim().isEmpty());
		
		
		deger="HER SEY b�y�k Harfle yaz�l�r";
		//verilen ifadeyi k���k harfle yazar
		System.out.println(deger.toLowerCase());
		//verilen ifadeyi b�y�k harfle yazar
		System.out.println(deger.toUpperCase());
		
		//bir string dizisini verilen ifadeye g�re ayr��t�r�r
		deger="ad�:ali,soyad:AL�,telefon: 0555 555 ";
		System.out.println(deger.split(",")[0].split(":")[1]);
		System.out.println(deger.split(",")[1]);
		System.out.println(deger.split(",")[2]);
	}

}
