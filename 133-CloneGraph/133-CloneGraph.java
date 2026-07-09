// Last updated: 7/9/2026, 3:11:04 PM
class Solution {
    private HashMap<Node,Node> map=new HashMap<>();
    public Node cloneGraph(Node node) {
        if(node==null){
            return null;
        }
        if(map.containsKey(node)){
            return map.get(node);
        }
        Node cloneNode=new Node(node.val,new ArrayList<>());
        map.put(node,cloneNode);
        for(Node neighbor:node.neighbors){
            cloneNode.neighbors.add(cloneGraph(neighbor));
        }
        return cloneNode;
    }
}