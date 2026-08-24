package defpackage;

import java.util.ListIterator;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: x0  reason: default package */
/* loaded from: classes.dex */
public final class x0 extends w0 implements ListIterator {
    public final /* synthetic */ z0 R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(z0 z0Var, int i) {
        super(z0Var, 0);
        this.R = z0Var;
        int a = z0Var.a();
        if (i >= 0 && i <= a) {
            this.B = i;
        } else {
            e41.q(lb1.j("index: ", i, a, ", size: "));
            throw null;
        }
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        if (this.B > 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.B;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious()) {
            int i = this.B - 1;
            this.B = i;
            return this.R.get(i);
        }
        fa6.c();
        return null;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.B - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
