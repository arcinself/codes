import java.io.*; 
import java.util.*; 
class BFS 
{ 
    int V;
    LinkedList<Integer> adj[];
    BFS(int v) 
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
  
    void BFS(int v) 
    {
		boolean visited[] = new boolean[V];
		Queue<Integer> q=new LinkedList<>();
		q.add(v);
		visited[v] = true; 
		while(q.size()>0){
			int n=q.remove();
			System.out.print(n+" ");
			for(int m :adj[n]){
			if(visited[m]!=true){
				q.add(m);
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
        BFS graph = new BFS(V);
		for(int i=0;i<E;i++)
			graph.addEdge(sc.nextInt(),sc.nextInt()); 
		System.out.println("Enter the starting vertex:");
		int s=sc.nextInt();
        System.out.println("Breadth First Traversal:");
		graph.BFS(s);
    } 
} 