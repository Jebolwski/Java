class TamZamanliCalisan extends Calisan {
    private double sabit_maas;

    public TamZamanliCalisan(String ad, String soyad, double sabit_maas) {
        super(ad, soyad, "IT");
        this.sabit_maas=sabit_maas;
    }

    public void tamZamanliMaasHesapla() {
        this.maas=sabit_maas;
}
}
