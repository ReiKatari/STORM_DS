package defpackage;

import java.util.AbstractList;
import java.util.ListIterator;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xx2  reason: default package */
/* loaded from: classes.dex */
public final class xx2 implements ListIterator, zf3 {
    public final /* synthetic */ int A;
    public int B;
    public int L;
    public int R;
    public final Object X;

    public xx2(mm6 mm6Var, int i) {
        this.A = 3;
        this.X = mm6Var;
        this.B = i - 1;
        this.L = -1;
        this.R = ge7.F(mm6Var);
    }

    public void a() {
        int i;
        i = ((AbstractList) ((jw3) this.X).X).modCount;
        if (i == this.R) {
            return;
        }
        i.l();
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        int i;
        int i2 = this.A;
        Object obj2 = this.X;
        switch (i2) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                a();
                jw3 jw3Var = (jw3) obj2;
                int i3 = this.B;
                this.B = i3 + 1;
                jw3Var.add(i3, obj);
                this.L = -1;
                this.R = jw3.c(jw3Var);
                return;
            case 2:
                b();
                kw3 kw3Var = (kw3) obj2;
                int i4 = this.B;
                this.B = i4 + 1;
                kw3Var.add(i4, obj);
                this.L = -1;
                i = ((AbstractList) kw3Var).modCount;
                this.R = i;
                return;
            default:
                c();
                mm6 mm6Var = (mm6) obj2;
                mm6Var.add(this.B + 1, obj);
                this.L = -1;
                this.B++;
                this.R = ge7.F(mm6Var);
                return;
        }
    }

    public void b() {
        int i;
        i = ((AbstractList) ((kw3) this.X)).modCount;
        if (i == this.R) {
            return;
        }
        i.l();
    }

    public void c() {
        if (ge7.F((mm6) this.X) == this.R) {
            return;
        }
        i.l();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        int i = this.A;
        Object obj = this.X;
        switch (i) {
            case 0:
                if (this.B >= this.R) {
                    return false;
                }
                return true;
            case 1:
                if (this.B >= ((jw3) obj).L) {
                    return false;
                }
                return true;
            case 2:
                if (this.B >= ((kw3) obj).B) {
                    return false;
                }
                return true;
            default:
                if (this.B >= ((mm6) obj).size() - 1) {
                    return false;
                }
                return true;
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
            case 1:
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
        int i = this.A;
        Object obj = this.X;
        switch (i) {
            case 0:
                ca4 ca4Var = ((zx2) obj).A;
                int i2 = this.B;
                this.B = i2 + 1;
                Object f = ca4Var.f(i2);
                f.getClass();
                return (z64) f;
            case 1:
                a();
                int i3 = this.B;
                jw3 jw3Var = (jw3) obj;
                if (i3 < jw3Var.L) {
                    this.B = i3 + 1;
                    this.L = i3;
                    return jw3Var.A[jw3Var.B + i3];
                }
                fa6.c();
                return null;
            case 2:
                b();
                int i4 = this.B;
                kw3 kw3Var = (kw3) obj;
                if (i4 < kw3Var.B) {
                    this.B = i4 + 1;
                    this.L = i4;
                    return kw3Var.A[i4];
                }
                fa6.c();
                return null;
            default:
                c();
                int i5 = this.B + 1;
                this.L = i5;
                mm6 mm6Var = (mm6) obj;
                ge7.m(i5, mm6Var.size());
                Object obj2 = mm6Var.get(i5);
                this.B = i5;
                return obj2;
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.A) {
            case 0:
                return this.B - this.L;
            case 1:
                return this.B;
            case 2:
                return this.B;
            default:
                return this.B + 1;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        int i = this.A;
        Object obj = this.X;
        switch (i) {
            case 0:
                ca4 ca4Var = ((zx2) obj).A;
                int i2 = this.B - 1;
                this.B = i2;
                Object f = ca4Var.f(i2);
                f.getClass();
                return (z64) f;
            case 1:
                a();
                int i3 = this.B;
                if (i3 > 0) {
                    int i4 = i3 - 1;
                    this.B = i4;
                    this.L = i4;
                    jw3 jw3Var = (jw3) obj;
                    return jw3Var.A[jw3Var.B + i4];
                }
                fa6.c();
                return null;
            case 2:
                b();
                int i5 = this.B;
                if (i5 > 0) {
                    int i6 = i5 - 1;
                    this.B = i6;
                    this.L = i6;
                    return ((kw3) obj).A[i6];
                }
                fa6.c();
                return null;
            default:
                c();
                mm6 mm6Var = (mm6) obj;
                ge7.m(this.B, mm6Var.size());
                int i7 = this.B;
                this.L = i7;
                this.B--;
                return mm6Var.get(i7);
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        int i;
        switch (this.A) {
            case 0:
                return (this.B - this.L) - 1;
            case 1:
                i = this.B;
                break;
            case 2:
                i = this.B;
                break;
            default:
                return this.B;
        }
        return i - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int i;
        int i2 = this.A;
        Object obj = this.X;
        switch (i2) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                jw3 jw3Var = (jw3) obj;
                a();
                int i3 = this.L;
                if (i3 != -1) {
                    jw3Var.b(i3);
                    this.B = this.L;
                    this.L = -1;
                    this.R = jw3.c(jw3Var);
                    return;
                }
                i.m("Call next() or previous() before removing element from the iterator.");
                return;
            case 2:
                kw3 kw3Var = (kw3) obj;
                b();
                int i4 = this.L;
                if (i4 != -1) {
                    kw3Var.b(i4);
                    this.B = this.L;
                    this.L = -1;
                    i = ((AbstractList) kw3Var).modCount;
                    this.R = i;
                    return;
                }
                i.m("Call next() or previous() before removing element from the iterator.");
                return;
            default:
                c();
                mm6 mm6Var = (mm6) obj;
                mm6Var.remove(this.L);
                this.B--;
                this.L = -1;
                this.R = ge7.F(mm6Var);
                return;
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        int i = this.A;
        Object obj2 = this.X;
        switch (i) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                a();
                int i2 = this.L;
                if (i2 != -1) {
                    ((jw3) obj2).set(i2, obj);
                    return;
                } else {
                    i.m("Call next() or previous() before replacing element from the iterator.");
                    return;
                }
            case 2:
                b();
                int i3 = this.L;
                if (i3 != -1) {
                    ((kw3) obj2).set(i3, obj);
                    return;
                } else {
                    i.m("Call next() or previous() before replacing element from the iterator.");
                    return;
                }
            default:
                mm6 mm6Var = (mm6) obj2;
                c();
                int i4 = this.L;
                if (i4 >= 0) {
                    mm6Var.set(i4, obj);
                    this.R = ge7.F(mm6Var);
                    return;
                }
                i.m("Cannot call set before the first call to next() or previous() or immediately after a call to add() or remove()");
                return;
        }
    }

    public xx2(kw3 kw3Var, int i) {
        int i2;
        this.A = 2;
        this.X = kw3Var;
        this.B = i;
        this.L = -1;
        i2 = ((AbstractList) kw3Var).modCount;
        this.R = i2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public xx2(zx2 zx2Var, int i, int i2) {
        this(zx2Var, (i2 & 1) != 0 ? 0 : i, 0, zx2Var.A.b);
        this.A = 0;
    }

    public xx2(zx2 zx2Var, int i, int i2, int i3) {
        this.A = 0;
        this.X = zx2Var;
        this.B = i;
        this.L = i2;
        this.R = i3;
    }

    public xx2(jw3 jw3Var, int i) {
        this.A = 1;
        this.X = jw3Var;
        this.B = i;
        this.L = -1;
        this.R = jw3.c(jw3Var);
    }
}
