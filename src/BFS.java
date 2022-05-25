import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    public void startBsf(Node start){
        Queue<Node> queue = new LinkedList<>();
        start.setVisited(true);
        queue.add(start);
        System.out.println("The in queue: " + queue);

        while (!queue.isEmpty()){
            Node currentNode=queue.remove();
            for (Node neighbors:currentNode.getNeighbors()) {
                if (!neighbors.isVisited()){
                    neighbors.setVisited(true);
                    queue.add(neighbors);
                    System.out.println("in the Queue: " + queue);
                }
            }



        }





    }


}
