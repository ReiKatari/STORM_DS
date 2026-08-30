package defpackage;

import java.util.List;
import java.util.ListIterator;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: tf5  reason: default package */
/* loaded from: classes.dex */
public final class tf5 implements ListIterator, f93 {
    public final /* synthetic */ int A = 1;
    public final Object B;
    public final /* synthetic */ Object L;

    public tf5(iu3 iu3Var, int i) {
        this.L = iu3Var;
        this.B = ((List) iu3Var.B).listIterator(tq0.C0(i, iu3Var));
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
                if (((l75) obj).A < ((qh6) this.L).R - 1) {
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
                if (((l75) obj).A >= 0) {
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
                l75 l75Var = (l75) obj;
                int i2 = l75Var.A + 1;
                qh6 qh6Var = (qh6) this.L;
                b53.u(i2, qh6Var.R);
                l75Var.A = i2;
                return qh6Var.get(i2);
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
                size = ((uf5) obj).size();
                break;
            case 1:
                previousIndex = ((ListIterator) obj2).previousIndex();
                size = ((iu3) obj).size();
                break;
            default:
                return ((l75) obj2).A + 1;
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
                l75 l75Var = (l75) obj;
                int i2 = l75Var.A;
                qh6 qh6Var = (qh6) this.L;
                b53.u(i2, qh6Var.R);
                l75Var.A = i2 - 1;
                return qh6Var.get(i2);
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
                size = ((uf5) obj).size();
                break;
            case 1:
                nextIndex = ((ListIterator) obj2).nextIndex();
                size = ((iu3) obj).size();
                break;
            default:
                return ((l75) obj2).A;
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

    public tf5(uf5 uf5Var, int i) {
        this.L = uf5Var;
        this.B = uf5Var.A.listIterator(tq0.C0(i, uf5Var));
    }

    public tf5(l75 l75Var, qh6 qh6Var) {
        this.B = l75Var;
        this.L = qh6Var;
    }
}
