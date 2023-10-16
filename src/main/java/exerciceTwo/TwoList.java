package exerciceTwo;

import java.util.ArrayList;
import java.util.List;

public class TwoList {
    private Integer pivot;
    private List<Integer> right;
    private List<Integer> left;

    public TwoList() {
        this(null);
    }

    public TwoList(final Integer pivot, final List<Integer> left, final List<Integer> right) {
        this.pivot = pivot;
        this.right = right;
        this.left = left;
    }

    public TwoList(final Integer pivot) {
        this(pivot, new ArrayList<>(), new ArrayList<>());
    }

    public List<Integer> getRight() {
        return right;
    }

    public List<Integer> getLeft() {
        return left;
    }

    public Integer getPivot() {
        return pivot;
    }

    public void setPivot(final Integer pivot) {
        this.pivot = pivot;
    }

    public void setRight(final List<Integer> right) {
        this.right = right;
    }

    public void setLeft(final List<Integer> left) {
        this.left = left;
    }

    @Override
    public String toString() {
        return "{" +
                "pivot=" + pivot +
                ", right=" + right +
                ", left=" + left +
                '}';
    }
}
