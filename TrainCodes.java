public class TrainCodes {
    public static void main(String[] args) {

        String[] trainCodes = {"TR101", "TR102", "TR103"};

        try {
            System.out.println(trainCodes[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid train code index.");
        }

        System.out.println("Program continues...");
    }
}