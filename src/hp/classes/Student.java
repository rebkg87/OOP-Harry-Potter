package hp.classes;

public class Student extends Character {
    protected String house;

    public Student(String house, String name, int age) {
        super(name, age, 100, true);
        this.house = house;
    }

    @Override
    public String introduce(){
        return "Hola, soy " + super.getName() + ", soy un estudiante, voy a la casa " + house + " y tengo " + super.getAge() + " años.";
    }

    @Override
    public String doing(){
        return super.getName() + " está estudiando.";
    }
}
