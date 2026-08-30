package defpackage;

import java.util.Iterator;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: lo2  reason: default package */
/* loaded from: classes.dex */
public final class lo2 implements Iterator, f93 {
    public final w86 A;
    public final int B;
    public int L;
    public final int R;

    public lo2(w86 w86Var, int i, int i2) {
        this.A = w86Var;
        this.B = i2;
        this.L = i;
        this.R = w86Var.c0;
        if (w86Var.Z) {
            y86.f();
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
        w86 w86Var = this.A;
        int i = w86Var.c0;
        int i2 = this.R;
        if (i != i2) {
            y86.f();
        }
        int i3 = this.L;
        this.L = w86Var.A[(i3 * 5) + 3] + i3;
        return new x86(w86Var, i3, i2);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
