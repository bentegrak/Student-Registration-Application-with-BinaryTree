
package ogrencikayituygulamasi;


public class Node {
    int no;
    String ad;
    int not;
    Node left;
    Node right;
    
    public Node(){
        no = 0;
        ad = " ";
        not = 0;
        
        left = null;
        right = null;
    }
    
    public Node(int no , String ad , int not){
        this.no = no;
        this.ad = ad;
        this.not = not;
        
        left = null;
        right = null;
    }
}
