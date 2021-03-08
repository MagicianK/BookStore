package magzhan;

import java.sql.ResultSet;

import org.postgresql.util.PSQLException;

public class Books extends SQLObject implements IBooks{
	ResultSet rs;

	public void bringBooksRs() { //to bring books from books table on database
		try {
			st = connection.createStatement();
			rs = st.executeQuery("Select * from Books");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public void showBooks() {//to show available books for user
		try {
			bringBooksRs();
			while(rs.next()) {
				System.out.println(rs.getInt("Book_id")+ " " + rs.getString("BookName") + " " + rs.getString("Category") + " " + rs.getInt("Price"));
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public void deleteBook(int id) {//this method for user with extended permission
		try {
			st = connection.createStatement();
			st.executeQuery("Delete from Books where Book_id = " + id);
		} catch (PSQLException psql) {
			System.out.println("You should delete this book from your cart");
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}
}
