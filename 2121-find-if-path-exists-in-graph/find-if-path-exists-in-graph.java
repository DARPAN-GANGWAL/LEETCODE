class Solution {

    public boolean validPath(int n, int[][] edges, int source, int destination) {

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
        }

        boolean[] visited = new boolean[n];
    return dfs(source, destination, graph, visited);
    }

    private boolean dfs(int current, int destination,
                        ArrayList<ArrayList<Integer>> graph,
                        boolean[] visited) {

        if (visited[current])
            return false;

        visited[current] = true;

        if (current == destination)
            return true;

        for (int neighbour : graph.get(current)) {
            if (dfs(neighbour, destination, graph, visited))
                return true;
        }

        return false;
    }
}