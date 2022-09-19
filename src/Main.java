import java.util.Random;
public class Main {
    private static final Random RANDOM = new Random();

    public static void main(String[] args) {
        GriffindorStudent harry = generateGryffindorStudent("Гарри Поттер");
        GriffindorStudent ron = generateGryffindorStudent("Рон Уизли");
        GriffindorStudent hermiona = generateGryffindorStudent("Гермиона Грейнджер");
        HufflepuffStudent sadric = generateHufflepuffStudent("Седрик Диггори");
        RavenclawStudent padma = generateRavenclawStudent("Падма Патил");
        SlytherinStudent drako = generateSlytherinStudent("Драко Малфой");

        harry.print();
        ron.print();
        sadric.print();
        padma.print();
        drako.print();

        harry.compareHogwarts(sadric);
        harry.compareGriffindor(ron);
        padma.compareHogwarts(hermiona);

    }

    private static GriffindorStudent generateGryffindorStudent(String name) {
        return new GriffindorStudent(
                name,
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100)
        );
    }

    private static RavenclawStudent generateRavenclawStudent(String name) {
        return new RavenclawStudent(
                name,
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100)
        );
    }
    private static HufflepuffStudent generateHufflepuffStudent(String name) {
        return new HufflepuffStudent(
                name,
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100)
        );
    }
    private static SlytherinStudent generateSlytherinStudent(String name) {
        return new SlytherinStudent(
                name,
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100)
        );
    }
}