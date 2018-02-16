Renzo, October twenty-eight 2001
I was right that the two slashes mean that the computer overlooks the line and doesn't print the line in the file.
public class CommentsAndSlashes
{
	public static void main(String[] args)
	{
	    // A comment, this is so you can read your program later.
	    // Anything after the // is ignored by Java.

	    System.out.println( "I could have code like this." ); //and the comment after is ignored.

            // You can also use a comment to "disable" or comment out a piece of code:
	    // System.out.println("This is awesome.");

	    System.out.println( "This will run." );
	}
}
