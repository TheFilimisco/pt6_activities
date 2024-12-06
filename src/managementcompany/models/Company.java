package managementcompany.models;

public class Company {
    private String cif;
    private String name;
    private String typeBusiness;

    public Company(String cif, String name, String typeBusiness) {
        this.cif = cif;
        this.name = name;
        this.typeBusiness = typeBusiness;
    }

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTypeBusiness() {
        return typeBusiness;
    }

    public void setTypeBusiness(String typeBusiness) {
        this.typeBusiness = typeBusiness;
    }

    @Override
    public String toString() {
        return "Company{" +
                "cif='" + cif + '\'' +
                ", name='" + name + '\'' +
                ", typeBusiness='" + typeBusiness + '\'' +
                '}';
    }
}
