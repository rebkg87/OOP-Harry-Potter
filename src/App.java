import hp.classes.House;
import hp.classes.Muggle;
import hp.classes.Professor;
import hp.classes.Student;

public class App {
    public static void main(String[] args) throws Exception {
        Student harry = new Student("Gryffindor", "Harry Potter", 11);
        Student draco = new Student("Slytherin", "Draco Malfoy", 11);
        Student cedric = new Student("Hufflepuff", "Cedric Diggory", 13);
        Student cho = new Student("Ravenclaw", "Cho Chang", 12);

        Professor dumbledore = new Professor("Transformaciones", "Albus Dumbledore", 115);
        Professor snape = new Professor("Pociones Mágicas", "Severus Snape", 38);
        Professor mcgonagall = new Professor("Transfiguraciones", "Minerva McGonagall", 70);

        House gryffindor = new House("Gryffindor", "Godric Gryffindor", "Nick Casi Decapitado", "Valor, Fuerza y Audacia");
        House slytherin = new House("Slytherin", "Salazar Slytherin", "El Barón Sanguinario", "Ambición, Determinación y Astucia");
        House hufflepuff = new House("Hufflepuff", "Helga Hufflepuff", "El Fraile Gordo", "Justicia, Lealtad y Paciencia");
        House ravenclaw =  new House("Ravenclaw", "Rowena Ravenclaw", "La Dama Gris", "Creatividad, Erudición y Inteligencia");

        Muggle uncle = new Muggle("Vernon Dursley");
        Muggle aunt = new Muggle("Petunia Dursley");
        Muggle cousin = new Muggle("Dudley Dursley");


        System.out.println("¡Bienvenidos al Colegio Hogwarts de Magia y Hechicería!");

        System.out.println();

        System.out.println(harry.introduce());
        System.out.println(gryffindor.houseInformation());
        System.out.println();

        System.out.println(dumbledore.introduce());
        boolean isAWizardDumbledore = dumbledore.getIsAWizard();
        if (isAWizardDumbledore) {
            System.out.println("Dumbledores es un mago");
        }
        System.out.println(snape.introduce());
        System.out.println(mcgonagall.introduce());

        System.out.println();
        System.out.println(uncle.introduce());    
        
        System.out.println();
        System.out.println(cho.doing());

        System.out.println();
        System.out.println(mcgonagall.doing());

        System.out.println("\n¡La pelea entre Cedrig y Snape ha empezado!\n");

        while (cedric.isAlive() && snape.isAlive()) {
            cedric.castSpell(snape);
            if (snape.isAlive()) {
                snape.castSpell(cedric);
            }

            if (cedric.isAlive() && snape.isAlive()) {
                cedric.attack(snape);
                if (snape.isAlive()) {
                    snape.attack(cedric);
                }
            }
        }

        if (cedric.isAlive()) {
            System.out.println("\n¡Cedric gana la batalla!\n");
        } else {
            System.out.println("\n¡Snape gana la batalla!\n");
        }
    }
}
