import java.util.*;
public class DoesItHaveLegs{
    static treeNode root = new treeNode("Does it have legs?", null, null);
    public static void main(String[] args){
        root.left = new treeNode("Is it a cat?", null, null);
        root.right = new treeNode("Is it a dog?", null, null);
        guess();
    }
    static void guess(){
        Scanner scan = null;
        try{
            scan = new Scanner(System.in);
        }
        catch (Exception e){
            System.out.println(e);
        }
        System.out.println(root.data);
        String ques = scan.next();
        if(ques.equals("yes")){
            root = root.left;
            System.out.println(root.data);
            String ques2 = scan.next();
            if(ques2.equals("yes")){
                System.out.println("I win! Continue?");
            }
            else if(ques2.equals("no")){
                System.out.println("I give up. What is it?");
                String ans = scan.next();
                System.out.println("Please type a question that is yes for " + ans + " and no for cat");
                String newQues = scan.next();
                root.right = new treeNode(newQues, null, null);
                System.out.println("Continue? yes/no");
                String cont =  scan.next();
                if(cont.equals("yes")){
                    guess();
                }
            }
        }else if(ques.equals("no")){
            root = root.right;
            System.out.println(root.data);
        }
    }
}
class treeNode{
    String data;
    treeNode left;
    treeNode right;
    treeNode(String newdata, treeNode left, treeNode right){
        this.data = newdata;
        this.left = left;
        this.right = right;
    }
}