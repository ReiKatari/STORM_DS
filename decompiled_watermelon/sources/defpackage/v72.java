package defpackage;

import java.util.Iterator;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: v72  reason: default package */
/* loaded from: classes.dex */
public final class v72 implements Iterator, f93 {
    public final /* synthetic */ int A;
    public final Iterator B;
    public int L;
    public Object R;
    public final /* synthetic */ b06 X;

    public v72(w72 w72Var) {
        this.A = 0;
        this.X = w72Var;
        this.B = w72Var.a.iterator();
        this.L = -1;
    }

    public void a() {
        Object next;
        w72 w72Var = (w72) this.X;
        do {
            Iterator it = this.B;
            if (it.hasNext()) {
                next = it.next();
            } else {
                this.L = 0;
                return;
            }
        } while (((Boolean) w72Var.c.n(next)).booleanValue() != w72Var.b);
        this.R = next;
        this.L = 1;
    }

    public void b() {
        Iterator it = this.B;
        if (it.hasNext()) {
            Object next = it.next();
            if (((Boolean) ((y82) this.X).c.n(next)).booleanValue()) {
                this.L = 1;
                this.R = next;
                return;
            }
        }
        this.L = 0;
    }

    public boolean c() {
        Iterator it;
        y82 y82Var = (y82) this.X;
        Iterator it2 = (Iterator) this.R;
        if (it2 != null && it2.hasNext()) {
            this.L = 1;
            return true;
        }
        do {
            Iterator it3 = this.B;
            if (it3.hasNext()) {
                it = (Iterator) e06.c0.n(y82Var.c.n(it3.next()));
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
                vd6.b();
                return null;
            case 1:
                int i = this.L;
                if (i != 2) {
                    if (i == 0 && !c()) {
                        vd6.b();
                        return null;
                    }
                    this.L = 0;
                    Iterator it = (Iterator) this.R;
                    it.getClass();
                    return it.next();
                }
                vd6.b();
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
                vd6.b();
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

    public v72(y82 y82Var) {
        this.A = 1;
        this.X = y82Var;
        this.B = y82Var.b.iterator();
    }

    public v72(y82 y82Var, byte b) {
        this.A = 2;
        this.X = y82Var;
        this.B = y82Var.b.iterator();
        this.L = -1;
    }
}
