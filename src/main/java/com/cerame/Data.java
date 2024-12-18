package com.cerame;

public class Data {
    private String giorno;
    private String mese;
    private String anno;
    private String ora;
    
    public Data(String giorno, String mese, String anno, String ora) {
        this.giorno = giorno;
        this.mese = mese;
        this.anno = anno;
        this.ora = ora;
    }

    public String getGiorno() {
        return giorno;
    }

    public void setGiorno(String giorno) {
        this.giorno = giorno;
    }

    public String getMese() {
        return mese;
    }

    public void setMese(String mese) {
        this.mese = mese;
    }

    public String getAnno() {
        return anno;
    }

    public void setAnno(String anno) {
        this.anno = anno;
    }

    public String getOra() {
        return ora;
    }

    public void setOra(String ora) {
        this.ora = ora;
    }

    @Override
    public String toString() {
        return giorno + "/" + mese + "/" + anno + " " + ora + "\n";
    }
}
