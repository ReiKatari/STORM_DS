package defpackage;

import java.util.Iterator;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: oc2  reason: default package */
/* loaded from: classes.dex */
public final class oc2 implements Iterator, zf3 {
    public final /* synthetic */ int A;
    public final Iterator B;
    public int L;
    public Object R;
    public final /* synthetic */ qb6 X;

    public oc2(qd2 qd2Var, byte b) {
        this.A = 2;
        this.X = qd2Var;
        this.B = ((qb6) qd2Var.b).iterator();
        this.L = -1;
    }

    public void a() {
        Object next;
        pc2 pc2Var = (pc2) this.X;
        do {
            Iterator it = this.B;
            if (it.hasNext()) {
                next = it.next();
            } else {
                this.L = 0;
                return;
            }
        } while (((Boolean) pc2Var.c.g(next)).booleanValue() != pc2Var.b);
        this.R = next;
        this.L = 1;
    }

    public void b() {
        Iterator it = this.B;
        if (it.hasNext()) {
            Object next = it.next();
            if (((Boolean) ((qd2) this.X).c.g(next)).booleanValue()) {
                this.L = 1;
                this.R = next;
                return;
            }
        }
        this.L = 0;
    }

    public boolean c() {
        Iterator it;
        qd2 qd2Var = (qd2) this.X;
        Iterator it2 = (Iterator) this.R;
        if (it2 != null && it2.hasNext()) {
            this.L = 1;
            return true;
        }
        do {
            Iterator it3 = this.B;
            if (it3.hasNext()) {
                it = (Iterator) tb6.d0.g(qd2Var.c.g(it3.next()));
            } else {
                this.L = 2;
                this.R = null;
                return false;
            }
        } while (!it.hasNext());
        this.R = it;
        this.L = 1;
        return true;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.A) {
            case 0:
                if (this.L == -1) {
                    a();
                }
                if (this.L == 1) {
                    return true;
                }
                return false;
            case 1:
                int i = this.L;
                if (i == 1) {
                    return true;
                }
                if (i == 2) {
                    return false;
                }
                return c();
            default:
                if (this.L == -1) {
                    b();
                }
                if (this.L == 1) {
                    return true;
                }
                return false;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.A) {
            case 0:
                if (this.L == -1) {
                    a();
                }
                if (this.L != 0) {
                    Object obj = this.R;
                    this.R = null;
                    this.L = -1;
                    return obj;
                }
                fa6.c();
                return null;
            case 1:
                int i = this.L;
                if (i != 2) {
                    if (i == 0 && !c()) {
                        fa6.c();
                        return null;
                    }
                    this.L = 0;
                    Iterator it = (Iterator) this.R;
                    it.getClass();
                    return it.next();
                }
                fa6.c();
                return null;
            default:
                if (this.L == -1) {
                    b();
                }
                if (this.L != 0) {
                    Object obj2 = this.R;
                    this.R = null;
                    this.L = -1;
                    return obj2;
                }
                fa6.c();
                return null;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.A) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public oc2(qd2 qd2Var) {
        this.A = 1;
        this.X = qd2Var;
        this.B = ((qb6) qd2Var.b).iterator();
    }

    public oc2(pc2 pc2Var) {
        this.A = 0;
        this.X = pc2Var;
        this.B = pc2Var.a.iterator();
        this.L = -1;
    }
}
