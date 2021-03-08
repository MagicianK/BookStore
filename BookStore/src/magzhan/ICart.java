package magzhan;

public interface ICart { 
	public default void showCartContent(int id) {
	}
	public default void deleteBookFromCart(int id) {
	}
	public default void addBookToCart() {
		
	}
}
