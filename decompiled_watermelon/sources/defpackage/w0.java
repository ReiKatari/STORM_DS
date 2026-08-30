package defpackage;

import java.util.ListIterator;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: w0  reason: default package */
/* loaded from: classes.dex */
public final class w0 extends v0 implements ListIterator {
    public final /* synthetic */ y0 R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(y0 y0Var, int i) {
        super(0, y0Var);
        this.R = y0Var;
        int b = y0Var.b();
        if (i >= 0 && i <= b) {
            this.B = i;
        } else {
            f81.q(wh1.f(i, b, "index: ", ", size: "));
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
        vd6.b();
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
