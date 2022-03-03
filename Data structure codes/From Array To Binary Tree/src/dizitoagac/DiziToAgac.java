
package dizitoagac;


public class DiziToAgac {
 static Node root;   
    /* A function that constructs Balanced Binary Search Tree  
     from a sorted array */
    Node sortedArrayToBST(int arr[], int start, int end) {   
        /* Base Case */
        if (start > end) { 
            return null; 
        }   
        /* Get the middle element and make it root */
        int mid = (start + end) / 2; 
        Node node = new Node(arr[mid]); 
  
        /* Recursively construct the left subtree and make it 
         left child of root */
        node.left = sortedArrayToBST(arr, start, mid - 1); 
  
        /* Recursively construct the right subtree and make it 
         right child of root */
        node.right = sortedArrayToBST(arr, mid + 1, end); 
          
        return node; 
    } 
  
    /* A utility function to print preorder traversal of BST */
    void preOrder(Node node) { 
        if (node == null) { 
            return; 
        } 
        System.out.print(node.data + " "); 
        preOrder(node.left); 
        preOrder(node.right); 
    }
    
    void printLevelOrder()     { 
        int h = height(root);                
        int i=0;
        for (i=1; i<=h; i++) {
            printGivenLevel(root, i);    
             System.out.println();
              
        }
    }
    
   int height(Node root) 
    { 
        if (root == null) 
           return 0; 
        else
        { 
            /* compute  height of each subtree */
            int lheight = height(root.left); 
            int rheight = height(root.right); 
              
            /* use the larger one */
            if (lheight > rheight) 
                return(lheight+1); 
            else return(rheight+1);  
        } 
    }
    void printGivenLevel (Node root ,int level)     {        
        if (root == null) 
            return; 
        if (level == 1){    
            System.out.print(root.data+" " ); }
        else if (level > 1) 
        { 
            printGivenLevel(root.left, level-1); 
            printGivenLevel(root.right, level-1); 
     
        } 
       
    }
   
    public static void main(String[] args) {
   DiziToAgac tree = new DiziToAgac(); 
        int arr[] = new int[]{1, 2, 3, 4, 5, 6, 7,8,9,10,11,12,13}; 
        int n = arr.length; 
        root = tree.sortedArrayToBST(arr, 0, n -1); 
        System.out.println("Preorder traversal of constructed BST"); 
        tree.preOrder(root);
        System.out.println("");
        tree.printLevelOrder();
    }
    
}
