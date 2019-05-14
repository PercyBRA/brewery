package de.brewery.tree;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Tree {

    private TreeElement root;

    public Tree() {
    }

    public Iterator iterator() {
        return new Iterator() {

            List<TreeElement> agenda = new LinkedList();

            {
                agenda.add(root);
            }

            @Override
            public boolean hasNext() {
                return agenda.size() > 0;
            }

            @Override
            public Object next() {
                TreeElement elem = agenda.remove(0);

                if (elem.getLeft() != null)
                    agenda.add(elem.getLeft());
                if (elem.getRight() != null)
                    agenda.add(elem.getRight());

                return elem;
            }
        };
    }

    public void add(int v) {
        if (root == null) {
            root = new TreeElement(v, null, null);
            return;
        }

        root.add(v);
    }

    public boolean contains(int v) {
        if (root == null) {
            return false;
        }

        return root.contains(v);
    }

    @Override
    public String toString() {
        return "Tree {" +
                 (root == null ? "" : root.toString()) +
                '}';
    }

    public static void main(String[] args) {
        Tree t = new Tree();

        t.add(3);
        t.add(4);
        t.add(2);
        t.add(1);

        System.out.println(t.toString());

        System.out.println(t.contains(2));
        System.out.println(t.contains(10));

        Iterator<TreeElement> it = t.iterator();
        while(it.hasNext()) {
            System.out.println(it.next().getValue());
        }
    }
}
