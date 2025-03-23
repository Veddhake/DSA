import java.util.*;

public class implementation
{
  public static class Edge
  {
    int src;
    int dest;
    int weight;
    public Edge(int src,int dest,int weight)
    {
      this.src=src;
      this.dest=dest;
      this.weight=weight;
    }
  }

  public static void createGraph(ArrayList<Edge> graph[])
  {
    for(int i=0;i<graph.length;i++)
    {
      graph[i]=new ArrayList<Edge>();
    }

    graph[0].add(new Edge(0,2,2));
    graph[1].add(new Edge(1,2,10));
    graph[1].add(new Edge(1,3,0));
    graph[2].add(new Edge(2,0,2));
    graph[2].add(new Edge(2,1,10));
    graph[2].add(new Edge(2,3,-1));
    graph[3].add(new Edge(3,2,-1));
    graph[3].add(new Edge(3,1,0));


  }

  public static void BFS(ArrayList<Edge>graph[], int v)
  {
    boolean[]visited= new boolean[v];
    Queue<Integer>q=new LinkedList<>();
    q.add(0);
    while(!q.isEmpty())
    {
      int curr=q.remove();
      if(visited[curr]==false)
      {
        visited[curr]=true;
        for(int i=0;i<graph[curr].size();i++)
        {
          q.add(graph[curr].get(i).dest);
        }
        System.out.println(curr);
      }

      
    }
  }

  public static void main(String[] args) {
    int v=4;
    ArrayList<Edge> graph[]=new ArrayList[v];
    createGraph(graph);
    //print 2's neighbours

    for(int i=0;i<graph[2].size();i++)
    {
      System.out.println(graph[2].get(i).dest);
    }

    BFS(graph,v);
  }
}