package magzhan;

import java.sql.ResultSet;

import org.postgresql.util.PSQLException;

public class Cart extends SQLObject implements ICart{
	ResultSet rs;
	
	public void bringCartContentRs(int id) { //to bring values from cart_content table in data base
		try {
			st = connection.createStatement();
			rs = st.executeQuery("Select * from Cart_content where Cart_id = " + id);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	public void showCartContent(int id) {//to show current cart_content by cart_id that user should have
		try {
			bringCartContentRs(id);
			System.out.println("Cart_id  Book_id \n");
			while(rs.next()) {
				System.out.println(rs.getInt("Cart_id") + " " + rs.getInt("Book_id"));
			}
			System.out.println();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	public void deleteBookFromCart(int id) { //deleting book from cart_content by book_id that user should know
		try {
			st = connection.createStatement();
			rs = st.executeQuery("Delete from Cart_content where Book_id = " + id);
		}catch (PSQLException psql) {
			System.out.println("There is no such a book in your cart!");
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}
	public void addBookToCart() { //adding some books to cart_content
		try {
			int Book_id = InputKey.inInt("Id of the Book: ");
			int Cart_id = InputKey.inInt("Your cart_id: ");
			int amount = InputKey.inInt("How many books do you want?: ");
			st = connection.createStatement();
			st.executeQuery("Insert into Cart_content values(" + Cart_id + ", " + Book_id + ", " + amount + ");");
		}catch (PSQLException psql) {
			System.out.println("You've entered wrong input!");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
