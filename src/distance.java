public class distance {

        public static void main(String[] args) {
            // Check if two command-line arguments are provided
            if (args.length < 2) {
                System.out.println("Usage: java Distance <x-coordinate> <y-coordinate>");
                return;
            }

            // Parse command-line arguments as integers
            int x = Integer.parseInt(args[0]);
            int y = Integer.parseInt(args[1]);

            // Calculate Euclidean distance using Math.pow function
            double distance = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));

            // Print the result
            System.out.println("Euclidean distance from point (" + x + ", " + y + ") to the origin (0, 0): " + distance);

    }

}
