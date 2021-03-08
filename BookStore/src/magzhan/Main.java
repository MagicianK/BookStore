package magzhan;


public class Main {

	public static void main(String[] args) {
		SQLObject.getConnection();
		ICart cart = new Cart();
		IBooks books = new Books();
		
		//User interaction menu
	 	int swValue, id;
	    System.out.println("YOUR CART_ID IS 8001");
		while(true) {
			System.out.println("|  	MENU SELECTION	   |");
		    System.out.println("| Options:                 |");
		    System.out.println("|        1. ShowBooks      |");
		    System.out.println("|        2. ShowCartContent|");
		    System.out.println("|        3. DeleteCartBook |");
		    System.out.println("|        4. AddBookToCart  |");
		    System.out.println("|        5. Exit           |");
		    swValue = InputKey.inInt(" Select option: ");
		    int Cart_id = 8001;
		    
		    // Switch construct
		    switch (swValue) {
		    case 1:
		          books.showBooks();
		          break;
		    case 2:
			     cart.showCartContent(Cart_id);
			      break;
		    case 3:
		    	 id= InputKey.inInt("Id of the book: ");
			     cart.deleteBookFromCart(id);
			      break;
		    case 4:
		          cart.addBookToCart();
		          break;
		    case 5:
		          System.exit(0);
		          break;
		    case 666:
		    	id = InputKey.inInt("Id of the book: ");
		    	books.deleteBook(id);
		    	break;
		    default:
		          System.out.println("Invalid selection");
		          break; // This break is not really necessary
		    }
		}
	}

}
