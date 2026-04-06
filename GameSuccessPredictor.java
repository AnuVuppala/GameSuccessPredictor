import java.util.Scanner;

public class GameSuccessPredictor {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===================================");
        System.out.println("   Game Success Prediction Tool");
        System.out.println("===================================");

        // 1. Take inputs
        System.out.print("Enter game genre (Action / Puzzle / RPG): ");
        String genre = sc.nextLine();

        System.out.print("Enter platform (PC / Console / Mobile): ");
        String platform = sc.nextLine();

        System.out.print("Enter critic score (0 - 10): ");
        double criticScore = sc.nextDouble();
        sc.nextLine(); // consume leftover newline

        System.out.print("Enter difficulty (Easy / Medium / Hard): ");
        String difficulty = sc.nextLine();

        // 2. Initialize score
        int score = 0;

        // 3. Genre-based scoring
        if (genre.equalsIgnoreCase("Action")) {
            score += 3;
        } else if (genre.equalsIgnoreCase("Puzzle")) {
            score += 2;
        } else if (genre.equalsIgnoreCase("RPG")) {
            score += 2;
        }

        // 4. Platform-based scoring
        if (platform.equalsIgnoreCase("Console")) {
            score += 2;
        } else if (platform.equalsIgnoreCase("PC")) {
            score += 1;
        }

        // 5. Critic score-based scoring
        if (criticScore >= 8) {
            score += 3;
        } else if (criticScore >= 6) {
            score += 2;
        } else {
            score += 1;
        }

        // 6. Difficulty-based scoring
        if (difficulty.equalsIgnoreCase("Easy") || difficulty.equalsIgnoreCase("Medium")) {
            score += 1;
        }

        // 7. Predict success level
        String prediction;
        if (score >= 7) {
            prediction = "High Success Potential";
        } else if (score >= 4) {
            prediction = "Medium Success Potential";
        } else {
            prediction = "Low Success Potential";
        }

        // 8. Display result
        System.out.println("\n----- Prediction Result -----");
        System.out.println("Total Score: " + score);
        System.out.println("Predicted Outcome: " + prediction);

        sc.close();
    }
}
