package defpackage;

import java.util.Iterator;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: t0  reason: default package */
/* loaded from: classes.dex */
public abstract class t0 implements Iterator, zf3 {
    public int A;
    public Object B;

    public abstract void a();

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.A;
        if (i != 0) {
            if (i == 1) {
                return true;
            }
            if (i == 2) {
                return false;
            }
            i.h("hasNext called when the iterator is in the FAILED state.");
            return false;
        }
        this.A = 3;
        a();
        if (this.A != 1) {
            return false;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.A;
        if (i == 1) {
            this.A = 0;
            return this.B;
        }
        if (i != 2) {
            this.A = 3;
            a();
            if (this.A == 1) {
                this.A = 0;
                return this.B;
            }
        }
        fa6.c();
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
