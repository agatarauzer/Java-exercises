package CanYouGetTheLoop;

import java.util.ArrayList;

public class LoopInspector {
    public int loopSize(Node node) {
        ArrayList<Node> nodes = new ArrayList<>();
        Node curr = node;
        while (curr.getNext() != null) {
            if (!nodes.contains(curr)) {
                nodes.add(curr);
                curr = curr.getNext();
            }
            else {
                return nodes.size() - nodes.indexOf(curr);
            }
        }
        return 0;
    }
}
