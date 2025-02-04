class CommandLineArgs {
    public static void main(String[] args) {
        System.out.println("Using String[] args array i.e mechanism used to store command line arguments!");
        System.out.println("The total number of elements in String[] args is: " + args.length + "!");
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }
}