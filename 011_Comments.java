class Comments 
{
    public static void main(String args[])
    {
        String city = "Bangalore";  // initializing name as Bangalore. (this is single line comment)
        System.out.println(city+ " is the best city to live in!!");  //printing the name of the city (this also is single line comment)

        /*
         Now this is multi line comment.
         I will change the value held by variable 'city' to 'Seattle'
         Lets see how this works.
        */
        city = "Seattle";
        System.out.println("The city I lived and loved to stay in: "+city);
    }
}
