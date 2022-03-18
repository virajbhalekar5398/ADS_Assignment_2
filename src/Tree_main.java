import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Tree_main {

	public static void main(String[] args) {
			System.out.println( "|***************************************** ***********|\n" );
			System.out.println( "|*****************| Library Management System|******* **********|\n" ); 
			System.out.println( "|****************************** **********************|\n" ); 
			System.out.println( "| 1: Search Any book By Its ID|\n" ); 
			System.out.println( " | 2: Display all book in InOrder Manner |\n" ); 
			System.out.println( " | 3: Display all book in PreOrder Manner|\n" );
			System.out.println( " | 4: Display all book in PostOrder Manner|\n" );
		    System.out.println( " | 5: Delete Book using ID|\n" );
			System.out.println( "| 0: Exit|\n" ); 
			System.out.println( " |********************************** ******************|\n" ); 
		BufferedReader reader = null;
		String line = "";
		BTree booktree = new BTree();
		try {
			String filePath = System.getProperty("user.dir") + "//books_new.csv";
			reader = new BufferedReader(new FileReader(filePath));
			reader.readLine();
			while((line = reader.readLine()) != null) {

				String[] values = line.split(",");
				
				//System.out.println(values[0]);
				
				if(values[0] != null) {
					booktree.add(new Book(Integer.parseInt(values[0]), values[1], values[2], values[5]));
				}
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		finally {
			try {
				reader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		}
		
			String flag = "T"; 
		    
		    Scanner sc = new Scanner(System.in);
				  
				    while(flag!="F" || flag!="f")
				    {
				        System.out.println("Enter an operation: 1. Add more books\n 2. Display Book Information InOrder\n 3. preOrder Traversal\n 4. postOrder Traversal\n 5.Delete \n");
				        int ans  = sc.nextInt();
				        switch(ans) {
				          
				            case 1: 
				            { 
				            	int id;
				            	System.out.println("Enter Book Name of the book to be displayed:  ");
				            	id = sc.nextInt();
				                //booktree.search(name);
				            	Node bnode = booktree.search_Recursive(booktree.root, id);
				                bnode.book.display_book();
				            }
				 		        break;
				 		             
				            	                
				            case 2: 
				            { 
				         
				            	System.out.println("Display Names of all the books: ");			                  
				            	booktree.traverseInOrder(booktree.root);
				            }
				                break;
				                
				            case 3: 
				            { 
				         
				            	System.out.println("Display Names of all the books: ");			                  
				            	booktree.traversePreOrder(booktree.root);
				            }
				                break;
				                
				                
				            case 4: 
				            { 
				         
				            	System.out.println("Display Names of all the books: ");			                  
				            	booktree.traversePostOrder(booktree.root);
				            }
				                break;
				               
				            case 5: { 
				            	int id;
				            	System.out.println("Enter Book ID of the book to be deleted: "); 
				                id = sc.nextInt();
				                booktree.delete(id);
				            	}
				                break;		
				                
				            default:
				                System.out.println("Invalid command. Please try again.");
				                
				        }
				        
				        System.out.println("Do you want to continue?");
				        flag = sc.next();
				    }

	}

}
