
package ogrencikayituygulamasi;


public class BTree {
    Node root;
    
    public BTree(){
        root = null;
    }
    
    Node newNode (int no, String ad, int not){
        root = new Node(no,ad,not);
        return root;
    }
    
    Node insert(Node root, int no, String ad, int not){
        if(root!=null){
            if(no<root.no){
                root.left = insert(root.left,no,ad,not);
            }
            else{
                root.right=insert(root.right,no,ad,not);
            }
        }
        else{
            root = newNode(no,ad,not);
        }
        return root;
    }
    
    void inOrder(Node root){
        if(root!=null){
            inOrder(root.left);
            System.out.println(root.no + "\t" + root.ad + "\t" + root.not);
            inOrder(root.right);
        }
    }
    
    void delete(int num){
        Node parent = null;
        Node temp=root;
        
        while(temp!=null && temp.no!=num){
            parent = temp;
            
            if(num<temp.no){
                temp=temp.left;
            }
            else{
                temp=temp.right;
            }
        }
        
        if(temp==null){
            System.out.println("Eleman Yok!");
        }
        
        if(temp.left==null){
            if(parent==null){
                root=temp.right;
            }
            else if(temp==parent.left){
                parent.left=temp.right;
            }
            else{
                parent.right=temp.right;
            }
        }
        
        else if(temp.right==null){
            if(parent==null){
                root=temp.left;
            }
            else if(temp==parent.left){
                parent.left=temp.left;
            }
            else{
                parent.right=temp.left;
            }
        }
        
        else{
            Node halef=halefiBul(temp.right);
            temp.no=halef.no;
            delete(halef.no);
        }    
        
    }

    Node halefiBul(Node node2){
        while(node2.left!=null){
            node2=node2.left;
        }
        return node2;
    }
}
