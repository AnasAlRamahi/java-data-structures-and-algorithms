package trees;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class KNode {
    String value;
    List<KNode> children;


    public KNode(String value) {
        this.value = value;
        children = new ArrayList<KNode>();
    }

}
