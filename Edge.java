public class Edge<T extends Comparable> {
    T vertexId;
    Edge<T> next;
    public Edge(T vertexId) {
        this.vertexId = vertexId;
        this.next = null;
    }

}
