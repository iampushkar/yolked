import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class EggIncubator {
    List<Egg> eggs = new ArrayList<>();
    private final Random random = new Random();

    public void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many eggs would you like to incubate ?");
        int numEggs = Math.max(1, scanner.nextInt());
        scanner.nextLine(); // Consume newline
        for (int i = 1; i <= numEggs; i++) {
            String eggName = generateFunEggName(i);
            System.out.println("Created egg: " + eggName);
            eggs.add(new Egg(eggName));
        }

        System.out.println("You have successfully created " + numEggs + " eggs in the incubator!");

        System.out.println("Starting incubation process...");
        while (true) {
            for (Egg egg : eggs) {
                updateEgg(egg);
                sleep(120);
            }
        }

    }

    private void updateEgg(Egg egg) {
        if (egg.isIncreasing()) {
            egg.setProgress(egg.getProgress() + 1);
            if (egg.getProgress() >= 100) {
                egg.setIncreasing(false);
                fakeHatch(egg);
            }
        } else {
            egg.setProgress(egg.getProgress() - 1);
            if (egg.getProgress() <= 0) {
                egg.setIncreasing(true);
            }
        }

        // Update heat randomly
        int heatChange = random.nextInt(5) - 2; // -2 to +2
        egg.setHeat(Math.max(0, Math.min(100, egg.getHeat() + heatChange)));

        // Update mood based on heat
        if (egg.getHeat() < 30) {
            egg.setMood("cold");
        } else if (egg.getHeat() > 70) {
            egg.setMood("hot");
        } else {
            egg.setMood("calm");
        }

        // Print egg status
        System.out.println(egg.getName() + " " + progressBar(egg.getProgress()) + " | Heat: " + egg.getHeat() + " | Mood: " + egg.getMood());
    }

    private String progressBar(int progress) {
        int length = 20;
        int filled = progress * length / 100;
        return "[" + "#".repeat(filled) + "-".repeat(length - filled) + "]";
    }

    private void fakeHatch(Egg egg) {
        System.out.print("\n✨ " + egg.getName() + " is hatching");
        try {
            for (int i = 0; i < 3; i++) {
                System.out.print(".");
                Thread.sleep(400);
            }
        } catch (InterruptedException ignored) {}

        System.out.println(" Just kidding! Not today.\n");
        egg.setProgress(98); // reset below 100
    }

    private String generateFunEggName(int i) {
        String[] adjectives = {"Sunny", "Cracked", "Yolky", "Scrambled", "Boiled", "Fried", "Poached", "Baked"};
        String[] nouns = {"Chick", "Hen", "Rooster", "Nest", "Feather", "Cluck", "Beak", "Wattle"};
        String adjective = adjectives[random.nextInt(adjectives.length)];
        String noun = nouns[random.nextInt(nouns.length)];
        return adjective + " " + noun + " Egg #" + i;
    }

    private void sleep(long ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException ignored) {}
    }
}
