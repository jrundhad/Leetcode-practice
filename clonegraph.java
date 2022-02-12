import java.util.*;
public class clonegraph {
    public Node cloneGraph(Node node) {
        HashMap<Node, Node> map = new HashMap<Node, Node>();
        return clone(node, map);
    }

    public Node clone(Node node, HashMap<Node, Node> map){
        if(node == null){
            return null;
        }

        if(map.containsKey(node)) return map.get(node);
        else{
            Node newNode = new Node(node.val, new ArrayList<Node>());
            map.put(node, newNode);
            for(Node n : node.neighbors){
                Node neighbor = clone(n, map);
                newNode.neighbors.add(neighbor);
            }
            return newNode;

        }
    }
}
