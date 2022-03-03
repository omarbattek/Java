package treege;

public class TreeGe {

    public static void main(String[] args) {
        AVLTree tree = new AVLTree();

        tree.root = tree.insert(tree.root, 10);
        tree.root = tree.insert(tree.root, 20);
        tree.root = tree.insert(tree.root, 30);
        tree.root = tree.insert(tree.root, 40);
        tree.root = tree.insert(tree.root, 50);
        tree.root = tree.insert(tree.root, 25);
        tree.root = tree.insert(tree.root, 90);
        tree.root = tree.insert(tree.root, 25);
        tree.root = tree.insert(tree.root, 200);
        tree.root = tree.insert(tree.root, 300);
        /* The constructed AVL Tree would be 
             30 
            /  \ 
          20   40 
         /  \     \ 
        10  25    50 
         */
        System.out.println("Preorder traversal"
                + " of constructed tree is : ");
        tree.preOrder(tree.root);
        tree.printLevelOrder();
    }

}
