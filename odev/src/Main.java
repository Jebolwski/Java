import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        double maas_limit=15000;

        TamZamanliCalisan tam_zamanli=new TamZamanliCalisan("Ahmet", "Yılmaz", 8000);
        tam_zamanli.tamZamanliMaasHesapla();

        YariZamanliCalisan yari_zamanli=new YariZamanliCalisan("Ayşe", "Kara", 50, 120);
        yari_zamanli.yariZamanliMaasHesapla();

        CeyrekZamanliCalisan ceyrek_zamanli_1=new CeyrekZamanliCalisan("Mehmet", "Demir", tam_zamanli.maasiGetir());
        ceyrek_zamanli_1.ceyrekZamanliMaasHesapla();

        CeyrekZamanliCalisan ceyrek_zamanli_2=new CeyrekZamanliCalisan("Fatma", "Çelik", tam_zamanli.maasiGetir());
        ceyrek_zamanli_2.ceyrekZamanliMaasHesapla();

        List<Calisan> calisanlar=new ArrayList<>();
        calisanlar.add(tam_zamanli);
        calisanlar.add(yari_zamanli);
        calisanlar.add(ceyrek_zamanli_1);
        calisanlar.add(ceyrek_zamanli_2);

        double toplam_maas=calisanlar.stream().mapToDouble(Calisan::maasiGetir).sum();
        System.out.println("Toplam Maaş: "+toplam_maas+" TL");

        if (toplam_maas > maas_limit) {
            System.out.println("Limit Aşıldı! Çalışanlar işten çıkarılıyor.");

            for (int i=0; i < calisanlar.size(); i++) {
                if (toplam_maas<=maas_limit) {
                    break;
                }
                Calisan calisan=calisanlar.get(i);
                if (calisan instanceof CeyrekZamanliCalisan) {
                    System.out.println(calisan.ad+" "+calisan.soyad+" işten çıkarıldı. Maaş: "+calisan.maasiGetir()+" TL");
                    toplam_maas=toplam_maas-calisan.maasiGetir();
                    calisanlar.remove(i);
                    i--;
                }
            }

            for (int i=0; i < calisanlar.size(); i++) {
                if (toplam_maas<=maas_limit) {
                    break;
                }
                Calisan calisan=calisanlar.get(i);
                if (calisan instanceof YariZamanliCalisan) {
                    System.out.println(calisan.ad+" "+calisan.soyad+" işten çıkarıldı. Maaş: "+calisan.maasiGetir()+" TL");
                    toplam_maas=toplam_maas-calisan.maasiGetir();
                    calisanlar.remove(i);
                    i--;
                }
            }

            for (int i=0; i < calisanlar.size(); i++) {
                if (toplam_maas<=maas_limit) {
                    break;
                }
                Calisan calisan=calisanlar.get(i);
                if (calisan instanceof TamZamanliCalisan) {
                    System.out.println(calisan.ad+" "+calisan.soyad+" işten çıkarıldı. Maaş: "+calisan.maasiGetir()+" TL");
                    toplam_maas=toplam_maas-calisan.maasiGetir();
                    calisanlar.remove(i);
                    i--;
                }
            }
        }

        System.out.println("Kalan Çalışanlar:");
        for (Calisan calisan : calisanlar) {
            System.out.println("Ad: "+calisan.ad+", Soyad: "+calisan.soyad+", Departman: "+calisan.departman+", Maaş: "+calisan.maas+" TL");
        }
        System.out.println("Yeni Toplam Maaş: "+toplam_maas+" TL");
}
}


