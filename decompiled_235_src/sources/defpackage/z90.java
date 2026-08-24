package defpackage;

import java.util.Iterator;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: z90  reason: default package */
/* loaded from: classes.dex */
public final class z90 implements Iterator {
    public int A = 0;
    public final int B;
    public final /* synthetic */ ea0 L;

    public z90(ea0 ea0Var) {
        this.L = ea0Var;
        this.B = ea0Var.size();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.A < this.B) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.A;
        if (i < this.B) {
            this.A = i + 1;
            return Byte.valueOf(this.L.f(i));
        }
        fa6.c();
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
