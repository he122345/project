package Kanade.domain;

public class Drug {
    String drug_id;
    String dr_name;
    String dr_price;
    String dr_inventory;

    public Drug() {
    }

    public Drug(String drug_id, String dr_name, String dr_price, String dr_inventory) {
        this.drug_id = drug_id;
        this.dr_name = dr_name;
        this.dr_price = dr_price;
        this.dr_inventory = dr_inventory;
    }

    public String getDrug_id() {
        return drug_id;
    }

    public void setDrug_id(String drug_id) {
        this.drug_id = drug_id;
    }

    public String getDr_name() {
        return dr_name;
    }

    public void setDr_name(String dr_name) {
        this.dr_name = dr_name;
    }

    public String getDr_price() {
        return dr_price;
    }

    public void setDr_price(String dr_price) {
        this.dr_price = dr_price;
    }

    public String getDr_inventory() {
        return dr_inventory;
    }

    public void setDr_inventory(String dr_inventory) {
        this.dr_inventory = dr_inventory;
    }

    @Override
    public String toString() {
        return "Drug{" +
                "drug_id='" + drug_id + '\'' +
                ", dr_name='" + dr_name + '\'' +
                ", dr_price='" + dr_price + '\'' +
                ", dr_inventory='" + dr_inventory + '\'' +
                '}';
    }
}
