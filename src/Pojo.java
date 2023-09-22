public class Pojo {
//name, uretici, birim, id, urunMiktar, defaultRaf



    private String urunIsmi;

    private String uretici;
    private String urunBirimi;
    private int urunId;

    private int urunMiktar;

    private String raf;

    public Pojo() {
    }

    public Pojo(String urunIsmi, String uretici, String urunBirimi, int urunId, int urunMiktar, String raf) {
        this.urunIsmi = urunIsmi;
        this.uretici = uretici;
        this.urunBirimi = urunBirimi;
        this.urunId = urunId;
        this.urunMiktar = urunMiktar;
        this.raf = raf;
    }

    public Integer getUrunId() {
        return urunId;
    }

    public void setUrunId(int urunId) {
        this.urunId = urunId;
    }

    public String getUrunIsmi() {
        return urunIsmi;
    }

    public void setUrunIsmi(String urunIsmi) {
        this.urunIsmi = urunIsmi;
    }

    public String getUretici() {
        return uretici;
    }

    public void setUretici(String uretici) {
        this.uretici = uretici;
    }

    public String getUrunBirimi() {
        return urunBirimi;
    }

    public void setUrunBirimi(String urunBirimi) {
        this.urunBirimi = urunBirimi;
    }

    public int getUrunMiktar() {
        return urunMiktar;
    }

    public void setUrunMiktar(int urunMiktar) {
        this.urunMiktar = urunMiktar;
    }

    public String getRaf() {
        return raf;
    }

    public void setRaf(String raf) {
        this.raf = raf;
    }

    @Override
    public String toString() {
        return "Methodlar{" +
                "urunId=" + urunId +
                ", urunIsmi='" + urunIsmi + '\'' +
                ", uretici='" + uretici + '\'' +
                ", urunBirimi='" + urunBirimi + '\'' +
                ", urunMiktar=" + urunMiktar +
                ", raf='" + raf + '\'' +
                '}';
    }

    }
