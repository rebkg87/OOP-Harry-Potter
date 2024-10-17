package hp.classes;

public class House {
    protected String houseName;
    protected String founder;
    protected String ghost;
    protected String qualities;

    public House(String houseName, String founder, String ghost, String qualities) {
        this.houseName = houseName;
        this.founder = founder;
        this.ghost = ghost;
        this.qualities = qualities;
    }

    public String houseInformation(){
        return "La casa " + houseName + " fue fundada por " + founder + ", sus cualidades son: " + qualities+ " y su fantasma es " + ghost +".";
    }

}
