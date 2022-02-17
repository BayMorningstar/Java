public class Vertex<T extends Comparable> {
    T id;
    Vertex<T> next;
    Edge<T> edgelink;


    public Vertex(T id) {
        this.id = id;
        this.edgelink = null;
    }

}
