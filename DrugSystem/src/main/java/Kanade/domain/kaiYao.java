package Kanade.domain;

public class kaiYao {
    public int kaiyao_id;
    public int s_id;
    public int d_id;
    public int drug_id;
    public String drug_name;
    public String price;

    @Override
    public String toString() {
        return "kaiYao{" +
                "kaiyao_id=" + kaiyao_id +
                ", s_id=" + s_id +
                ", d_id=" + d_id +
                ", drug_id=" + drug_id +
                ", drug_name='" + drug_name + '\'' +
                ", price='" + price + '\'' +
                '}';
    }

    public int getKaiyao_id() {
        return kaiyao_id;
    }

    public void setKaiyao_id(int kaiyao_id) {
        this.kaiyao_id = kaiyao_id;
    }

    public int getS_id() {
        return s_id;
    }

    public void setS_id(int s_id) {
        this.s_id = s_id;
    }

    public int getD_id() {
        return d_id;
    }

    public void setD_id(int d_id) {
        this.d_id = d_id;
    }

    public int getDrug_id() {
        return drug_id;
    }

    public void setDrug_id(int drug_id) {
        this.drug_id = drug_id;
    }

    public String getDrug_name() {
        return drug_name;
    }

    public void setDrug_name(String drug_name) {
        this.drug_name = drug_name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public kaiYao(int kaiyao_id, int s_id, int d_id, int drug_id, String drug_name, String price) {

        this.kaiyao_id = kaiyao_id;
        this.s_id = s_id;
        this.d_id = d_id;
        this.drug_id = drug_id;
        this.drug_name = drug_name;
        this.price = price;
    }

    public kaiYao() {

    }
}
