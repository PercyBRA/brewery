package de.brewery.tree;

public class TreeElement {

    private int value;
    private TreeElement left, right;

    public TreeElement(int v, TreeElement l, TreeElement r) {
        this.value = v;
        this.left = l;
        this.right = r;
    }

    public  int getValue() {
        return value;
    }

    public TreeElement getLeft() {
        return left;
    }

    public TreeElement getRight() {
        return  right;
    }

    public void add(int v) {
        int c = Integer.compare(value, v);
        if (c == 0) {
            return;
        }
        if (c > 0) {
            if (left == null) {
                left = new TreeElement(v, null, null);
                return;
            }
            left.add(v);
        }
        else {
            if (right == null){
                right = new TreeElement(v, null, null);
                return;
            }
            right.add(v);
        }
    }

    public boolean contains(int v) {
        int c = Integer.compare(value, v);

        if (c == 0) {
            return true;
        }

        if (c > 0) {
            if (left != null) {
                return left.contains(v);
            }
        }
        else {
            if (right != null){
                return right.contains(v);
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return  "[" + (left == null ? "" : left.toString()) +
                "," +  value +
                "," + (right == null ? "" : right.toString()) +
                "]";
    }
}
