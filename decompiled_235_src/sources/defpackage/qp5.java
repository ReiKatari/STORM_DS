package defpackage;

import java.util.List;
import java.util.ListIterator;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qp5  reason: default package */
/* loaded from: classes.dex */
public final class qp5 implements ListIterator, zf3 {
    public final /* synthetic */ int A = 2;
    public final Object B;
    public final /* synthetic */ Object L;

    public qp5(l14 l14Var, int i) {
        this.L = l14Var;
        this.B = ((List) l14Var.B).listIterator(gt0.z0(i, l14Var));
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        switch (this.A) {
            case 0:
                ListIterator listIterator = (ListIterator) this.B;
                listIterator.add(obj);
                listIterator.previous();
                return;
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        int i = this.A;
        Object obj = this.B;
        switch (i) {
            case 0:
                return ((ListIterator) obj).hasPrevious();
            case 1:
                return ((ListIterator) obj).hasPrevious();
            default:
                if (((bh5) obj).A < ((ht6) this.L).R - 1) {
                    return true;
                }
                return false;
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        int i = this.A;
        Object obj = this.B;
        switch (i) {
            case 0:
                return ((ListIterator) obj).hasNext();
            case 1:
                return ((ListIterator) obj).hasNext();
            default:
                if (((bh5) obj).A >= 0) {
                    return true;
                }
                return false;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        int i = this.A;
        Object obj = this.B;
        switch (i) {
            case 0:
                return ((ListIterator) obj).previous();
            case 1:
                return ((ListIterator) obj).previous();
            default:
                bh5 bh5Var = (bh5) obj;
                int i2 = bh5Var.A + 1;
                ht6 ht6Var = (ht6) this.L;
                ge7.m(i2, ht6Var.R);
                bh5Var.A = i2;
                return ht6Var.get(i2);
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        int previousIndex;
        int size;
        int i = this.A;
        Object obj = this.L;
        Object obj2 = this.B;
        switch (i) {
            case 0:
                previousIndex = ((ListIterator) obj2).previousIndex();
                size = ((rp5) obj).size();
                break;
            case 1:
                previousIndex = ((ListIterator) obj2).previousIndex();
                size = ((l14) obj).size();
                break;
            default:
                return ((bh5) obj2).A + 1;
        }
        return (size - 1) - previousIndex;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        int i = this.A;
        Object obj = this.B;
        switch (i) {
            case 0:
                return ((ListIterator) obj).next();
            case 1:
                return ((ListIterator) obj).next();
            default:
                bh5 bh5Var = (bh5) obj;
                int i2 = bh5Var.A;
                ht6 ht6Var = (ht6) this.L;
                ge7.m(i2, ht6Var.R);
                bh5Var.A = i2 - 1;
                return ht6Var.get(i2);
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        int nextIndex;
        int size;
        int i = this.A;
        Object obj = this.L;
        Object obj2 = this.B;
        switch (i) {
            case 0:
                nextIndex = ((ListIterator) obj2).nextIndex();
                size = ((rp5) obj).size();
                break;
            case 1:
                nextIndex = ((ListIterator) obj2).nextIndex();
                size = ((l14) obj).size();
                break;
            default:
                return ((bh5) obj2).A;
        }
        return (size - 1) - nextIndex;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        switch (this.A) {
            case 0:
                ((ListIterator) this.B).remove();
                return;
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.A) {
            case 0:
                ((ListIterator) this.B).set(obj);
                return;
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
        }
    }

    public qp5(rp5 rp5Var, int i) {
        this.L = rp5Var;
        this.B = rp5Var.A.listIterator(gt0.z0(i, rp5Var));
    }

    public qp5(bh5 bh5Var, ht6 ht6Var) {
        this.B = bh5Var;
        this.L = ht6Var;
    }
}
