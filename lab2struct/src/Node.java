public class Node {
    private Goods good ;
    private Node leftChild;
    private Node rightChild;

    public void printNode() {
        System.out.println("Chosen NODE has value: " + good.toString());
    }

    public Goods getValue() {
        return this.good;
    }

    public String getStringValue() {
        return good.toString();
    }

    public void setValue(final Goods student) {
        this.good = student;
    }

    public Node getLeftChild() {
        return this.leftChild;
    }

    public void setLeftChild(final Node leftChild) {
        this.leftChild = leftChild;
    }

    public Node getRightChild() {
        return this.rightChild;
    }

    public void setRightChild(final Node rightChild) {
        this.rightChild = rightChild;
    }


}