package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: rb6  reason: default package */
/* loaded from: classes.dex */
public final class rb6 implements Iterator, r41, zf3 {
    public int A;
    public Object B;
    public Iterator L;
    public r41 R;

    public final RuntimeException a() {
        int i = this.A;
        if (i != 4) {
            if (i != 5) {
                return new IllegalStateException("Unexpected state of the iterator: " + this.A);
            }
            return new IllegalStateException("Iterator has failed.");
        }
        return new NoSuchElementException();
    }

    @Override // defpackage.r41
    public final l61 b() {
        return vt1.A;
    }

    public final x61 c(r41 r41Var, Object obj) {
        this.B = obj;
        this.A = 3;
        this.R = r41Var;
        x61 x61Var = x61.COROUTINE_SUSPENDED;
        r41Var.getClass();
        return x61Var;
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
                    throw a();
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
            r41 r41Var = this.R;
            r41Var.getClass();
            this.R = null;
            r41Var.i(jg7.a);
        }
    }

    @Override // defpackage.r41
    public final void i(Object obj) {
        oi2.Y(obj);
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
                throw a();
            }
            this.A = 1;
            Iterator it = this.L;
            it.getClass();
            return it.next();
        } else if (hasNext()) {
            return next();
        } else {
            fa6.c();
            return null;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
