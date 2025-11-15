public class Main {
    public static void main(String[] args) {
        System.out.println("🥚 Welcome to Yolked");
        System.out.println("Fun Virtual Egg Incubator");
        var ascii = """
                __     ______  _    _   _      ____   _____ ______\s
                \\ \\   / / __ \\| |  | | | |    / __ \\ / ____|  ____|
                 \\ \\_/ / |  | | |  | | | |   | |  | | (___ | |__  \s
                  \\   /| |  | | |  | | | |   | |  | |\\___ \\|  __| \s
                   | | | |__| | |__| | | |___| |__| |____) | |____\s
                   |_|  \\____/ \\____/  |______\\____/|_____/|______|                                                 \s
                """;
        System.out.println(ascii);

        EggIncubator incubator = new EggIncubator();
        incubator.start();
    }
}