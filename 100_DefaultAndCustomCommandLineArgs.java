/* 
1. Find number of command line arguments.
2. There are no default command line arguments that Java provides from its side.
3. Print the user provided command line arguments.
*/ 

class DefaultAndCustomCommandLineArgs 
{
    public static void main(String args[])
    {

        // In Java, command-line arguments are passed to the main() method as an array of String values, args[] in this case.
        String allCommandLineArgsArray[] = args;

        int noOfCommandLineArgs = args.length;
        System.out.println("Number of command line arguments passed during execution : "+noOfCommandLineArgs);

        System.out.println("There are NO DEFAULT COMMAND LINE ARGUMENTS provided by Java");

        if(noOfCommandLineArgs > 0)
        {
            int index = 0;
            for(String argument : allCommandLineArgsArray)
            {
                System.out.println("User Provided Command Line Argument "+index+" : "+argument);
                index++;
            }
        }
        else
        {
            System.out.println("No command line arguments passed.");
        }
    }
}
