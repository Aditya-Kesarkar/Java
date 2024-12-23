public class Tree_Pattern {
    public static void main(String[] args) {
        int treeHeight = 11; // Number of levels in the canopy
        int trunkHeight = 5; // Number of rows in the trunk
        int trunkWidth = 5;  // Number of stars in each row of the trunk
        int odd = 1;

        // Tree Canopy
        for (int i = 1; i <= treeHeight; i++) {
            // Spaces
            for (int j = treeHeight + 4; j > i; j--) {
                System.out.print(" ");
            }

            // Stars
            for (int k = 1; k < 2 * odd; k++) {
                System.out.print("*");
            }

            odd++;
            System.out.println();
        }

        // Tree Trunk
        for (int i = 1; i <= trunkHeight; i++) {
            for (int s = 0; s < treeHeight - 1; s++) {
                System.out.print(" ");
            }
            for (int j = 0; j < trunkWidth; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("\n \t! SAVE TREES !");
    }
}
