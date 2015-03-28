package me.wwsun.tree;

/**
 * An abstract base class providing some functionality of the Tree interface
 */
public abstract class AbstractTree<E> implements Tree<E> {

    @Override
    public boolean isExternal(Position<E> p) throws IllegalArgumentException {
        return numChildren(p) == 0;
    }

    @Override
    public boolean isInternal(Position<E> p) throws IllegalArgumentException {
        return numChildren(p) > 0;
    }

    @Override
    public boolean isRoot(Position<E> p) throws IllegalArgumentException {
        return p==root();
    }

    @Override
    public boolean isEmpty() {
        return size()==0;
    }


    /**
     *
     * @param p is position you want to compute the tree depth
     * @return the number of levels separating position p from the root
     */
    public int depth(Position<E> p) {
        if(isRoot(p)) return 0;
        else return 1+depth(parent(p));
    }

    /**
     *
     * @return the height of the tree
     */
    private int heightBad() {
        int h =0;
        for (Position<E> p : positions()) {
            if(isExternal(p)) h = Math.max(h, depth(p)); // only consider the leaf positions
        }
        return h;
    }

    /**
     *
     * @param p
     * @return the height of the subtree rooted at Position p
     */
    public int height(Position<E> p){
        int h =0;
        for (Position<E> c : children(p)) {
            h = Math.max(h, 1+height(c));
        }
        return h;
    }
}
