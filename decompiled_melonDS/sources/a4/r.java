package a4;

import java.util.AbstractList;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class r implements ListIterator, oc.a {
    public final /* synthetic */ int A;
    public int B;
    public int L;
    public int R;
    public final Object X;

    public r(z2.p pVar, int i2) {
        this.A = 3;
        this.X = pVar;
        this.B = i2 - 1;
        this.L = -1;
        this.R = z2.q.g(pVar);
    }

    public void a() {
        int i2;
        i2 = ((AbstractList) ((ac.a) this.X).X).modCount;
        if (i2 == this.R) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        int i2;
        int i10;
        switch (this.A) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case DSiCameraSource.FrontCamera /* 1 */:
                a();
                ac.a aVar = (ac.a) this.X;
                int i11 = this.B;
                this.B = i11 + 1;
                aVar.add(i11, obj);
                this.L = -1;
                i2 = ((AbstractList) aVar).modCount;
                this.R = i2;
                return;
            case 2:
                b();
                ac.b bVar = (ac.b) this.X;
                int i12 = this.B;
                this.B = i12 + 1;
                bVar.add(i12, obj);
                this.L = -1;
                i10 = ((AbstractList) bVar).modCount;
                this.R = i10;
                return;
            default:
                c();
                z2.p pVar = (z2.p) this.X;
                pVar.add(this.B + 1, obj);
                this.L = -1;
                this.B++;
                this.R = z2.q.g(pVar);
                return;
        }
    }

    public void b() {
        int i2;
        i2 = ((AbstractList) ((ac.b) this.X)).modCount;
        if (i2 == this.R) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    public void c() {
        if (z2.q.g((z2.p) this.X) == this.R) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        switch (this.A) {
            case 0:
                if (this.B < this.R) {
                    return true;
                }
                return false;
            case DSiCameraSource.FrontCamera /* 1 */:
                if (this.B < ((ac.a) this.X).L) {
                    return true;
                }
                return false;
            case 2:
                if (this.B < ((ac.b) this.X).B) {
                    return true;
                }
                return false;
            default:
                if (this.B < ((z2.p) this.X).size() - 1) {
                    return true;
                }
                return false;
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.A) {
            case 0:
                if (this.B > this.L) {
                    return true;
                }
                return false;
            case DSiCameraSource.FrontCamera /* 1 */:
                if (this.B > 0) {
                    return true;
                }
                return false;
            case 2:
                if (this.B > 0) {
                    return true;
                }
                return false;
            default:
                if (this.B >= 0) {
                    return true;
                }
                return false;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.A) {
            case 0:
                a1.h0 h0Var = ((t) this.X).A;
                int i2 = this.B;
                this.B = i2 + 1;
                Object f8 = h0Var.f(i2);
                f8.getClass();
                return (b3.o) f8;
            case DSiCameraSource.FrontCamera /* 1 */:
                a();
                int i10 = this.B;
                ac.a aVar = (ac.a) this.X;
                if (i10 < aVar.L) {
                    this.B = i10 + 1;
                    this.L = i10;
                    return aVar.A[aVar.B + i10];
                }
                fj.j.l();
                return null;
            case 2:
                b();
                int i11 = this.B;
                ac.b bVar = (ac.b) this.X;
                if (i11 < bVar.B) {
                    this.B = i11 + 1;
                    this.L = i11;
                    return bVar.A[i11];
                }
                fj.j.l();
                return null;
            default:
                c();
                int i12 = this.B + 1;
                this.L = i12;
                z2.p pVar = (z2.p) this.X;
                z2.q.a(i12, pVar.size());
                Object obj = pVar.get(i12);
                this.B = i12;
                return obj;
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.A) {
            case 0:
                return this.B - this.L;
            case DSiCameraSource.FrontCamera /* 1 */:
                return this.B;
            case 2:
                return this.B;
            default:
                return this.B + 1;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.A) {
            case 0:
                a1.h0 h0Var = ((t) this.X).A;
                int i2 = this.B - 1;
                this.B = i2;
                Object f8 = h0Var.f(i2);
                f8.getClass();
                return (b3.o) f8;
            case DSiCameraSource.FrontCamera /* 1 */:
                a();
                int i10 = this.B;
                if (i10 > 0) {
                    int i11 = i10 - 1;
                    this.B = i11;
                    this.L = i11;
                    ac.a aVar = (ac.a) this.X;
                    return aVar.A[aVar.B + i11];
                }
                fj.j.l();
                return null;
            case 2:
                b();
                int i12 = this.B;
                if (i12 > 0) {
                    int i13 = i12 - 1;
                    this.B = i13;
                    this.L = i13;
                    return ((ac.b) this.X).A[i13];
                }
                fj.j.l();
                return null;
            default:
                c();
                int i14 = this.B;
                z2.p pVar = (z2.p) this.X;
                z2.q.a(i14, pVar.size());
                int i15 = this.B;
                this.L = i15;
                this.B--;
                return pVar.get(i15);
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        int i2;
        switch (this.A) {
            case 0:
                i2 = this.B - this.L;
                break;
            case DSiCameraSource.FrontCamera /* 1 */:
                i2 = this.B;
                break;
            case 2:
                i2 = this.B;
                break;
            default:
                return this.B;
        }
        return i2 - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int i2;
        int i10;
        switch (this.A) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case DSiCameraSource.FrontCamera /* 1 */:
                ac.a aVar = (ac.a) this.X;
                a();
                int i11 = this.L;
                if (i11 != -1) {
                    aVar.b(i11);
                    this.B = this.L;
                    this.L = -1;
                    i2 = ((AbstractList) aVar).modCount;
                    this.R = i2;
                    return;
                }
                a0.j.p("Call next() or previous() before removing element from the iterator.");
                return;
            case 2:
                ac.b bVar = (ac.b) this.X;
                b();
                int i12 = this.L;
                if (i12 != -1) {
                    bVar.b(i12);
                    this.B = this.L;
                    this.L = -1;
                    i10 = ((AbstractList) bVar).modCount;
                    this.R = i10;
                    return;
                }
                a0.j.p("Call next() or previous() before removing element from the iterator.");
                return;
            default:
                c();
                z2.p pVar = (z2.p) this.X;
                pVar.remove(this.L);
                this.B--;
                this.L = -1;
                this.R = z2.q.g(pVar);
                return;
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.A) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case DSiCameraSource.FrontCamera /* 1 */:
                a();
                int i2 = this.L;
                if (i2 != -1) {
                    ((ac.a) this.X).set(i2, obj);
                    return;
                } else {
                    a0.j.p("Call next() or previous() before replacing element from the iterator.");
                    return;
                }
            case 2:
                b();
                int i10 = this.L;
                if (i10 != -1) {
                    ((ac.b) this.X).set(i10, obj);
                    return;
                } else {
                    a0.j.p("Call next() or previous() before replacing element from the iterator.");
                    return;
                }
            default:
                z2.p pVar = (z2.p) this.X;
                c();
                int i11 = this.L;
                if (i11 >= 0) {
                    pVar.set(i11, obj);
                    this.R = z2.q.g(pVar);
                    return;
                }
                a0.j.p("Cannot call set before the first call to next() or previous() or immediately after a call to add() or remove()");
                return;
        }
    }

    public r(ac.b bVar, int i2) {
        int i10;
        this.A = 2;
        this.X = bVar;
        this.B = i2;
        this.L = -1;
        i10 = ((AbstractList) bVar).modCount;
        this.R = i10;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public r(t tVar, int i2, int i10) {
        this(tVar, (i10 & 1) != 0 ? 0 : i2, 0, tVar.A.f45b);
        this.A = 0;
    }

    public r(t tVar, int i2, int i10, int i11) {
        this.A = 0;
        this.X = tVar;
        this.B = i2;
        this.L = i10;
        this.R = i11;
    }

    public r(ac.a aVar, int i2) {
        int i10;
        this.A = 1;
        this.X = aVar;
        this.B = i2;
        this.L = -1;
        i10 = ((AbstractList) aVar).modCount;
        this.R = i10;
    }
}
