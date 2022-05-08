// { Driver Code Starts
import java.lang.Math;
import java.util.*;
class UniqueRows{
public static void main(String[] args)
 {  Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int r=sc.nextInt();
			int c=sc.nextInt();
			int[][] a=new int [r][c];
			for(int i=0;i<r;i++)
				for(int j=0;j<c;j++)
					a[i][j]=sc.nextInt();
			GfG g=new GfG();
			ArrayList<ArrayList<Integer>> arr = g.uniqueRow(a,r,c);
			for(int i = 0;i<arr.size();i++){
			    ArrayList<Integer> demo = arr.get(i);
			    for(int j = 0;j<demo.size();j++){
			        System.out.print(demo.get(j)+" ");
			    }
			    System.out.print("$");
			}
			System.out.println();
		}
 }
}// } Driver Code Ends


/*Complete the given function*/
class Node{
    boolean flag;
    Node[] links;
    public Node(){
        flag=false;
        links=new Node[2];
    }
    boolean contains(int val){
        return links[val]!=null;
    }
    void put(int val, Node newnode){
        links[val]=newnode;
    }
    Node get(int val){
        return links[val];
    }
    void setEnd(){
        flag=true;
    }
    boolean isEnd(){
        return flag;
    }
}
class GfG
{
    public static ArrayList<ArrayList<Integer>> uniqueRow(int a[][],int r, int c)
    {
        Node root=new Node();
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        for(int[] i: a){
            ArrayList<Integer> list=insert(i, root);
            if(!list.isEmpty()) ans.add(list);
        }
        return ans;
    }
    static ArrayList<Integer> insert(int[] a, Node root){
        Node node=root;
        for(int i: a){
            if(!node.contains(i)) node.put(i, new Node());
            node=node.get(i);
        }
        ArrayList<Integer> list=new ArrayList<>();
        if(node.isEnd()) return list;
        for(int i: a){
            list.add(i);
        }
        node.setEnd();
        return list;
    }
}
