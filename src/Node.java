class Node 
{

	Book book;
    Node left;
    Node right;
	
    public Node getLeft() {
		return left;
	}

	public void setLeft(Node left) {
		this.left = left;
	}

	public Node getRight() {
		return right;
	}

	public void setRight(Node right) {
		this.right = right;
	}

	Node(Book book)
	{
		this.book = book;
		this.right = null;
	    this.left = null;
	}

    Node(Book book,Node left, Node right){
        this.book = book;
        this.right = right;
        this.left = left;
    }
}