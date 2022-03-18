import java.util.Stack;

public class BTree implements ILibrarySystem
{

	Node root;
	BTree()
	{
		this.root = null;
	}

	
	public Node addRecursive(Node current, Book book) {
	    if (current == null) 
	    {
	 
	        return new Node(book);
	    }

	    if (current.book.compareTo(book) > 0) {
	        current.left = addRecursive(current.left, book);
	    } else if (current.book.compareTo(book) < 0) {
	        current.right = addRecursive(current.right, book);
	    } else {
	        
	        return current;
	    }

	    return current;
	}
	
	public void add(Book book) {
//		if(root == null)
//			root= new Node(book);
		root = addRecursive(root, book);
	}
	
	
	public void traverseInOrder(Node node){
        Node t = root;
        Stack<Node> st=new Stack<>();
        while (t!=null||!st.isEmpty()){
            if(t!=null){
                st.add(t);
                t = t.left;
            }
            else {
                t=st.pop();
                System.out.print(t.book.toString()+"\n ");
                t = t.right;
            }
        }
    }
	   
	void search(int id)  { 
        root = search_Recursive(root, id); 
    } 
    
    Node search_Recursive(Node root, int id)  { 
         
        if (root==null || root.book.id==id) 
            return root; 
       
        if (id < root.book.id) 
        {
        	
            return search_Recursive(root.left, id); 
        }
        
        
        return search_Recursive(root.right, id); 
    } 
    
	public void traversePreOrder(Node node) 
	{
	    if (node != null) 
	    {
	        System.out.print("\n " + node.book.toString());
	        traversePreOrder(node.left);
	        traversePreOrder(node.right);
	    }
	}
	
	public void traversePostOrder(Node node) 
	{
	    if (node != null) 
	    {
	        traversePostOrder(node.left);
	        traversePostOrder(node.right);
	        System.out.print("\n " + node.book.toString());
	    }
	}
	
	void delete(int id) 
	{ 
		root = deleteRec(root, id); 
	}
   
    public Node deleteRec(Node root, int id)
    {
        
        if (root == null)
            return root;
 
        
        if (id < root.book.id)
            root.left = deleteRec(root.left, id);
        else if (id > root.book.id)
            root.right = deleteRec(root.right, id);
 
        else {
            
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;
 
        
            root.book.id = treeValue(root.right);
 
            
            root.right = deleteRec(root.right, root.book.id);
        }
 
        return root;
    }
 
    int treeValue(Node root)
    {
        int treev = root.book.id;
        while (root.left != null)
        {
            treev = root.left.book.id;
            root = root.left;
        }
        return treev;
    }

}