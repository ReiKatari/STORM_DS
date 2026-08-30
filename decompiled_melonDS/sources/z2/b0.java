package z2;

import java.util.List;
import java.util.ListIterator;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b0 implements ListIterator, oc.a {
    public final /* synthetic */ int A = 0;
    public final Object B;
    public final /* synthetic */ Object L;

    public b0(vc.e eVar, int i2) {
        this.L = eVar;
        this.B = ((List) eVar.B).listIterator(zb.l.K(i2, eVar));
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        switch (this.A) {
            case 0:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
            case DSiCameraSource.FrontCamera /* 1 */:
                ListIterator listIterator = (ListIterator) this.B;
                listIterator.add(obj);
                listIterator.previous();
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        switch (this.A) {
            case 0:
                if (((nc.r) this.B).A < ((c0) this.L).R - 1) {
                    return true;
                }
                return false;
            case DSiCameraSource.FrontCamera /* 1 */:
                return ((ListIterator) this.B).hasPrevious();
            default:
                return ((ListIterator) this.B).hasPrevious();
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.A) {
            case 0:
                if (((nc.r) this.B).A >= 0) {
                    return true;
                }
                return false;
            case DSiCameraSource.FrontCamera /* 1 */:
                return ((ListIterator) this.B).hasNext();
            default:
                return ((ListIterator) this.B).hasNext();
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.A) {
            case 0:
                nc.r rVar = (nc.r) this.B;
                int i2 = rVar.A + 1;
                c0 c0Var = (c0) this.L;
                q.a(i2, c0Var.R);
                rVar.A = i2;
                return c0Var.get(i2);
            case DSiCameraSource.FrontCamera /* 1 */:
                return ((ListIterator) this.B).previous();
            default:
                return ((ListIterator) this.B).previous();
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.A) {
            case 0:
                return ((nc.r) this.B).A + 1;
            case DSiCameraSource.FrontCamera /* 1 */:
                return (((zb.w) this.L).size() - 1) - ((ListIterator) this.B).previousIndex();
            default:
                return (((vc.e) this.L).size() - 1) - ((ListIterator) this.B).previousIndex();
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.A) {
            case 0:
                nc.r rVar = (nc.r) this.B;
                int i2 = rVar.A;
                c0 c0Var = (c0) this.L;
                q.a(i2, c0Var.R);
                rVar.A = i2 - 1;
                return c0Var.get(i2);
            case DSiCameraSource.FrontCamera /* 1 */:
                return ((ListIterator) this.B).next();
            default:
                return ((ListIterator) this.B).next();
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        switch (this.A) {
            case 0:
                return ((nc.r) this.B).A;
            case DSiCameraSource.FrontCamera /* 1 */:
                return (((zb.w) this.L).size() - 1) - ((ListIterator) this.B).nextIndex();
            default:
                return (((vc.e) this.L).size() - 1) - ((ListIterator) this.B).nextIndex();
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        switch (this.A) {
            case 0:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
            case DSiCameraSource.FrontCamera /* 1 */:
                ((ListIterator) this.B).remove();
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.A) {
            case 0:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
            case DSiCameraSource.FrontCamera /* 1 */:
                ((ListIterator) this.B).set(obj);
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public b0(zb.w wVar, int i2) {
        this.L = wVar;
        this.B = wVar.A.listIterator(zb.l.K(i2, wVar));
    }

    public b0(nc.r rVar, c0 c0Var) {
        this.B = rVar;
        this.L = c0Var;
    }
}
