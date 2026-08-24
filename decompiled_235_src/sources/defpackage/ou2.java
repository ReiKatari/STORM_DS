package defpackage;

import java.util.Iterator;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ou2  reason: default package */
/* loaded from: classes.dex */
public final class ou2 implements Iterator, zf3 {
    public final mk6 A;
    public final int B;
    public int L;
    public final int R;

    public ou2(mk6 mk6Var, int i, int i2) {
        this.A = mk6Var;
        this.B = i2;
        this.L = i;
        this.R = mk6Var.d0;
        if (mk6Var.Z) {
            ok6.f();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.L < this.B) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        mk6 mk6Var = this.A;
        int i = mk6Var.d0;
        int i2 = this.R;
        if (i != i2) {
            ok6.f();
        }
        int i3 = this.L;
        this.L = mk6Var.A[(i3 * 5) + 3] + i3;
        return new nk6(mk6Var, i3, i2);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
