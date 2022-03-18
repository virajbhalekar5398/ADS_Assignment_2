import java.util.List;

public interface ILibrarySystem
{

	public Node addRecursive(Node current, Book book);

	public Node deleteRec(Node current, int ID);
	
}
