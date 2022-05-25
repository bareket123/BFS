public class Main {
    public static void main(String[] args) {
        Node nodeA=new Node("A");
        Node nodeB=new Node("B");
        Node nodeC=new Node("C");
        Node nodeD=new Node("D");
        Node nodeE=new Node("E");
        Node nodeF=new Node("F");
        Node nodeG=new Node("G") ;
        Node nodeH=new Node("H");

        nodeA.addNeighbor(nodeB);
        nodeA.addNeighbor(nodeF);
        nodeA.addNeighbor(nodeG);

        nodeB.addNeighbor(nodeA);
        nodeB.addNeighbor(nodeC);
        nodeB.addNeighbor(nodeD);

        nodeC.addNeighbor(nodeB);

        nodeD.addNeighbor(nodeB);
        nodeD.addNeighbor(nodeE);

        nodeE.addNeighbor(nodeE);

        nodeF.addNeighbor(nodeA);

        nodeG.addNeighbor(nodeH);
        nodeG.addNeighbor(nodeA);

        nodeH.addNeighbor(nodeG);


       BFS bfs = new BFS();
       bfs.startBsf(nodeA);



    }
}
