package hp.classes;

public class Professor extends Character {
    protected String subject;

    public Professor(String subject, String name, int age) {
        super(name, age,100, true);
        this.subject = subject;
    }

    @Override
    public String introduce(){
        return "Hola, soy el Profesor " + super.getName() + " y enseño " + subject + ".";
    }

    @Override
    public String doing(){
        return super.getName() + " está dando clases de " + subject + ".";
    }
    
}
