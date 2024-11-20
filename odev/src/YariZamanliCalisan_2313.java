class YariZamanliCalisan extends Calisan {
    private double saatlik_ucret;
    private int calismaS_saatleri;

    public YariZamanliCalisan(String ad, String soyad, double saatlik_ucret, int calismaS_saatleri) {
        super(ad, soyad, "Satış");
        this.saatlik_ucret=saatlik_ucret;
        this.calismaS_saatleri=calismaS_saatleri;
    }

    public void yariZamanliMaasHesapla() {
        this.maas=saatlik_ucret * calismaS_saatleri;
}
}
