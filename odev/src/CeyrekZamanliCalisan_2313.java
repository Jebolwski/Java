class CeyrekZamanliCalisan extends Calisan {
    private double tam_zamanli_maas;

    public CeyrekZamanliCalisan(String ad, String soyad, double tam_zamanli_maas) {
        super(ad, soyad, "Danışma");
        this.tam_zamanli_maas=tam_zamanli_maas;
    }

    public void ceyrekZamanliMaasHesapla() {
        this.maas=tam_zamanli_maas/4;
    }
}
