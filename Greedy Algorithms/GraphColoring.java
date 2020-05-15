import java.util.*;

class Edge
{
	int source, dest;

	public Edge(int source, int dest) {
		this.source = source;
		this.dest = dest;
	}
};

class Graph
{
	// An array of Lists to represent adjacency list
	List<List<Integer>> adjList = null;

	// Constructor
	Graph(List<Edge> edges, int N)
	{
		adjList = new ArrayList<>(N);

		for (int i = 0; i < N; i++) {
			adjList.add(i, new ArrayList<>());
		}

		// add edges to the undirected graph
		for (int i = 0; i < edges.size(); i++)
		{
			int src = edges.get(i).source;
			int dest = edges.get(i).dest;

			adjList.get(src).add(dest);
			adjList.get(dest).add(src);
		}
	}
}

class GreedyColoring
{
	// Add more colors for graphs with many more vertices
	private static String[] color = {
			"", "BLUE", "GREEN", "RED", "YELLOW", "ORANGE", "PINK",
			"BLACK", "BROWN", "WHITE", "PURPLE", "VOILET"
	};

	// Function to assign colors to vertices of graph
	public static void colorGraph(Graph graph, int N)
	{
		// stores color assigned to each vertex
		Map<Integer, Integer> result = new HashMap<>();

		// assign color to vertex one by one
		for (int u = 0; u < N; u++)
		{
			// set to store color of adjacent vertices of u
			Set<Integer> assigned = new TreeSet<>();

			// check colors of adjacent vertices of u and store in set
			for (int i : graph.adjList.get(u)) {
				if (result.containsKey(i)) {
					assigned.add(result.get(i));
				}
			}

			// check for first free color
			int color = 1;
			for (Integer c: assigned) {
				if (color != c) {
					break;
				}
				color++;
			}

			// assigns vertex u the first available color
			result.put(u, color);
		}

		for (int v = 0; v < N; v++) {
			System.out.println("Color assigned to vertex " + v + " is "
					+ color[result.get(v)]);
		}
	}

	// Greedy coloring of graph
	public static void main(String[] args)
	{
		// List of graph edges as per above diagram
		List<Edge> edges = Arrays.asList(
								new Edge(0, 1), new Edge(0, 4), 
								new Edge(0, 5), new Edge(4, 5),
								new Edge(1, 4), new Edge(1, 3),
								new Edge(2, 3), new Edge(2, 4)
							);

		// Set number of vertices in the graph
		final int N = 6;

		// create a graph from edges
		Graph graph = new Graph(edges, N);

		// color graph using greedy algorithm
		colorGraph(graph, N);
	}
}