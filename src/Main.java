public class Main {
    public static void main(String[] args) {
        System.out.println("🥚 Welcome to Yolked");
        System.out.println("Fun Virtual Egg Incubator");
        System.out.println("===========================");
        System.out.println("__   _____  _   _   _     ___  ____  _____ \n" +
                "\\ \\ / / _ \\| | | | | |   / _ \\/ ___|| ____|\n" +
                " \\ V / | | | | | | | |  | | | \\___ \\|  _|  \n" +
                "  | || |_| | |_| | | |__| |_| |___) | |___ \n" +
                "  |_| \\___/ \\___/  |_____\\___/|____/|_____|");

        EggIncubator incubator = new EggIncubator();
        incubator.start();

    }
}