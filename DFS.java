import java.io.*; 
import java.util.*; 
class DFS 
{ 
    int V;
    LinkedList<Integer> adj[];
    DFS(int v) 
    { 
        V = v; 
        adj = new LinkedList[v]; 
        for (int i=0; i<v; ++i) 
            adj[i] = new LinkedList(); 
    }
    void addEdge(int v, int w) 
    { 
        adj[v].add(w);
    } 
  
    void DFS(int v) 
    {
		boolean visited[] = new boolean[V];
		Stack<Integer> st=new Stack<>();
		st.push(v);
		visited[v] = true; 
		while(!st.empty()){
			int n=st.pop();
			System.out.print(n+" ");
			for(int m :adj[n]){
			if(visited[m]!=true){
				st.push(m);
				visited[m]=true;
			}
			} 
		}
	}
    public static void main(String args[]) 
    { 
		Scanner sc=new Scanner(System.in);
		System.out.println("No. of vertices:");
		int V=sc.nextInt();
		System.out.println("No. of edges:");
		int E=sc.nextInt();
        DFS graph = new DFS(V);
		for(int i=0;i<E;i++)
			graph.addEdge(sc.nextInt(),sc.nextInt()); 
		System.out.println("Enter the starting vertex:");
		int s=sc.nextInt();
        System.out.println("Depth First Traversal:");
		graph.DFS(s);
    } 
} 