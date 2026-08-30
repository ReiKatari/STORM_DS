package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: c06  reason: default package */
/* loaded from: classes.dex */
public final class c06 implements Iterator, j11, f93 {
    public int A;
    public Object B;
    public Iterator L;
    public j11 R;

    @Override // defpackage.j11
    public final e31 a() {
        return mp1.A;
    }

    public final RuntimeException b() {
        int i = this.A;
        if (i != 4) {
            if (i != 5) {
                return new IllegalStateException("Unexpected state of the iterator: " + this.A);
            }
            return new IllegalStateException("Iterator has failed.");
        }
        return new NoSuchElementException();
    }

    public final p31 c(j11 j11Var, Object obj) {
        this.B = obj;
        this.A = 3;
        this.R = j11Var;
        p31 p31Var = p31.COROUTINE_SUSPENDED;
        j11Var.getClass();
        return p31Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        while (true) {
            int i = this.A;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2 || i == 3) {
                        return true;
                    }
                    if (i == 4) {
                        return false;
                    }
                    throw b();
                }
                Iterator it = this.L;
                it.getClass();
                if (it.hasNext()) {
                    this.A = 2;
                    return true;
                }
                this.L = null;
            }
            this.A = 5;
            j11 j11Var = this.R;
            j11Var.getClass();
            this.R = null;
            j11Var.k(o27.a);
        }
    }

    @Override // defpackage.j11
    public final void k(Object obj) {
        me2.a0(obj);
        this.A = 4;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.A;
        if (i != 0 && i != 1) {
            if (i != 2) {
                if (i == 3) {
                    this.A = 0;
                    Object obj = this.B;
                    this.B = null;
                    return obj;
                }
                throw b();
            }
            this.A = 1;
            Iterator it = this.L;
            it.getClass();
            return it.next();
        } else if (hasNext()) {
            return next();
        } else {
            vd6.b();
            return null;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
