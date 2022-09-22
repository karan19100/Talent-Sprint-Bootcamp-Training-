import java.util.Scanner;

abstract class Book {
	
	protected String title;
	
	public abstract void setTitle(String title);

	public abstract String getTitle();
}


class MyBook extends Book{

	@Override
	public String getTitle() {
		return "The title of my book is: "+title;
	}

	@Override
	public void setTitle(String title) {
		this.title = title;
		
	}

}

public class Testing{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		MyBook book = new MyBook();
		String title = sc.nextLine();
		
		book.setTitle(title);
		
		System.out.println(book.getTitle());
		
		sc.close();
    }
}