package defpackage;

import java.util.AbstractList;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: wr2  reason: default package */
/* loaded from: classes.dex */
public final class wr2 implements ListIterator, f93 {
    public final /* synthetic */ int A;
    public int B;
    public int L;
    public int R;
    public final Object X;

    public wr2(xa6 xa6Var, int i) {
        this.A = 3;
        this.X = xa6Var;
        this.B = i - 1;
        this.L = -1;
        this.R = b53.Q(xa6Var);
    }

    public void a() {
        int i;
        i = ((AbstractList) ((hp3) this.X).X).modCount;
        if (i == this.R) {
            return;
        }
        throw new ConcurrentModificationException();
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
                hp3 hp3Var = (hp3) obj2;
                int i3 = this.B;
                this.B = i3 + 1;
                hp3Var.add(i3, obj);
                this.L = -1;
                this.R = hp3.d(hp3Var);
                return;
            case 2:
                b();
                ip3 ip3Var = (ip3) obj2;
                int i4 = this.B;
                this.B = i4 + 1;
                ip3Var.add(i4, obj);
                this.L = -1;
                i = ((AbstractList) ip3Var).modCount;
                this.R = i;
                return;
            default:
                c();
                xa6 xa6Var = (xa6) obj2;
                xa6Var.add(this.B + 1, obj);
                this.L = -1;
                this.B++;
                this.R = b53.Q(xa6Var);
                return;
        }
    }

    public void b() {
        int i;
        i = ((AbstractList) ((ip3) this.X)).modCount;
        if (i == this.R) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    public void c() {
        if (b53.Q((xa6) this.X) == this.R) {
            return;
        }
        throw new ConcurrentModificationException();
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
                if (this.B >= ((hp3) obj).L) {
                    return false;
                }
                return true;
            case 2:
                if (this.B >= ((ip3) obj).B) {
                    return false;
                }
                return true;
            default:
                if (this.B >= ((xa6) obj).size() - 1) {
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
                w14 w14Var = ((yr2) obj).A;
                int i2 = this.B;
                this.B = i2 + 1;
                Object f = w14Var.f(i2);
                f.getClass();
                return (yy3) f;
            case 1:
                a();
                int i3 = this.B;
                hp3 hp3Var = (hp3) obj;
                if (i3 < hp3Var.L) {
                    this.B = i3 + 1;
                    this.L = i3;
                    return hp3Var.A[hp3Var.B + i3];
                }
                vd6.b();
                return null;
            case 2:
                b();
                int i4 = this.B;
                ip3 ip3Var = (ip3) obj;
                if (i4 < ip3Var.B) {
                    this.B = i4 + 1;
                    this.L = i4;
                    return ip3Var.A[i4];
                }
                vd6.b();
                return null;
            default:
                c();
                int i5 = this.B + 1;
                this.L = i5;
                xa6 xa6Var = (xa6) obj;
                b53.u(i5, xa6Var.size());
                Object obj2 = xa6Var.get(i5);
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
                w14 w14Var = ((yr2) obj).A;
                int i2 = this.B - 1;
                this.B = i2;
                Object f = w14Var.f(i2);
                f.getClass();
                return (yy3) f;
            case 1:
                a();
                int i3 = this.B;
                if (i3 > 0) {
                    int i4 = i3 - 1;
                    this.B = i4;
                    this.L = i4;
                    hp3 hp3Var = (hp3) obj;
                    return hp3Var.A[hp3Var.B + i4];
                }
                vd6.b();
                return null;
            case 2:
                b();
                int i5 = this.B;
                if (i5 > 0) {
                    int i6 = i5 - 1;
                    this.B = i6;
                    this.L = i6;
                    return ((ip3) obj).A[i6];
                }
                vd6.b();
                return null;
            default:
                c();
                xa6 xa6Var = (xa6) obj;
                b53.u(this.B, xa6Var.size());
                int i7 = this.B;
                this.L = i7;
                this.B--;
                return xa6Var.get(i7);
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
                hp3 hp3Var = (hp3) obj;
                a();
                int i3 = this.L;
                if (i3 != -1) {
                    hp3Var.c(i3);
                    this.B = this.L;
                    this.L = -1;
                    this.R = hp3.d(hp3Var);
                    return;
                }
                i.n("Call next() or previous() before removing element from the iterator.");
                return;
            case 2:
                ip3 ip3Var = (ip3) obj;
                b();
                int i4 = this.L;
                if (i4 != -1) {
                    ip3Var.c(i4);
                    this.B = this.L;
                    this.L = -1;
                    i = ((AbstractList) ip3Var).modCount;
                    this.R = i;
                    return;
                }
                i.n("Call next() or previous() before removing element from the iterator.");
                return;
            default:
                c();
                xa6 xa6Var = (xa6) obj;
                xa6Var.remove(this.L);
                this.B--;
                this.L = -1;
                this.R = b53.Q(xa6Var);
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
                    ((hp3) obj2).set(i2, obj);
                    return;
                } else {
                    i.n("Call next() or previous() before replacing element from the iterator.");
                    return;
                }
            case 2:
                b();
                int i3 = this.L;
                if (i3 != -1) {
                    ((ip3) obj2).set(i3, obj);
                    return;
                } else {
                    i.n("Call next() or previous() before replacing element from the iterator.");
                    return;
                }
            default:
                xa6 xa6Var = (xa6) obj2;
                c();
                int i4 = this.L;
                if (i4 >= 0) {
                    xa6Var.set(i4, obj);
                    this.R = b53.Q(xa6Var);
                    return;
                }
                i.n("Cannot call set before the first call to next() or previous() or immediately after a call to add() or remove()");
                return;
        }
    }

    public wr2(ip3 ip3Var, int i) {
        int i2;
        this.A = 2;
        this.X = ip3Var;
        this.B = i;
        this.L = -1;
        i2 = ((AbstractList) ip3Var).modCount;
        this.R = i2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public wr2(yr2 yr2Var, int i, int i2) {
        this(yr2Var, (i2 & 1) != 0 ? 0 : i, 0, yr2Var.A.b);
        this.A = 0;
    }

    public wr2(yr2 yr2Var, int i, int i2, int i3) {
        this.A = 0;
        this.X = yr2Var;
        this.B = i;
        this.L = i2;
        this.R = i3;
    }

    public wr2(hp3 hp3Var, int i) {
        this.A = 1;
        this.X = hp3Var;
        this.B = i;
        this.L = -1;
        this.R = hp3.d(hp3Var);
    }
}
