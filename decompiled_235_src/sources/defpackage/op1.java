package defpackage;

import java.util.Iterator;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: op1  reason: default package */
/* loaded from: classes.dex */
public final class op1 implements Iterator, zf3 {
    public final /* synthetic */ int A;
    public final Iterator B;
    public int L;

    public op1(xy6 xy6Var) {
        this.A = 2;
        this.L = 50;
        this.B = xy6Var.a.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.A;
        Iterator it = this.B;
        switch (i) {
            case 0:
                break;
            case 1:
                return it.hasNext();
            default:
                if (this.L > 0 && it.hasNext()) {
                    return true;
                }
                return false;
        }
        while (this.L > 0 && it.hasNext()) {
            it.next();
            this.L--;
        }
        return it.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.A;
        Iterator it = this.B;
        switch (i) {
            case 0:
                break;
            case 1:
                int i2 = this.L;
                this.L = i2 + 1;
                if (i2 >= 0) {
                    return new j43(i2, it.next());
                }
                hf.q0();
                throw null;
            default:
                int i3 = this.L;
                if (i3 != 0) {
                    this.L = i3 - 1;
                    return it.next();
                }
                fa6.c();
                return null;
        }
        while (this.L > 0 && it.hasNext()) {
            it.next();
            this.L--;
        }
        return it.next();
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

    public op1(Iterator it) {
        this.A = 1;
        it.getClass();
        this.B = it;
    }

    public op1(pp1 pp1Var) {
        this.A = 0;
        this.B = pp1Var.a.iterator();
        this.L = pp1Var.b;
    }
}
