
public class Graph<T extends Comparable> {
    Vertex<T> head;

    public void addVertex(T id){
        Vertex<T> temp  = new Vertex<>(id);
        Vertex<T> iterator = head;
        if(head == null)
            head = temp;
        while(iterator.next != null){
            iterator = iterator.next;
        }
        iterator.next = temp;
    }

    public void addEdge(T startId, T endId){
        Vertex<T> current = findVertex(startId);
        if(current == null)
            System.out.print("have no vertex");
        else{
            Edge<T> iterator = current.edgelink;
        if(iterator == null){
            iterator = new Edge(endId);
        }else{
            while(iterator.next != null){
                iterator = iterator.next;
                iterator.next = new Edge(endId);
            }
        }


        }

    }
    public Vertex<T> findVertex(T id){
        Vertex<T> iterator = head;
        while(iterator.next != null){
            if(iterator.id == id)
                return iterator;
            iterator = iterator.next;
        }
        return null;
    }
    public void display(){
        Vertex<T> iterator = head;
        while (iterator != null) {
            System.out.print(iterator.id + "--->");
            Edge<T> iteratorEdge = iterator.edgelink;
            while (iteratorEdge != null) {
                System.out.println(iteratorEdge.vertexId +" ");
                iteratorEdge = iteratorEdge.next;
            }
                System.out.println();
                iterator = iterator.next;
        }
    }
}
