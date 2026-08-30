package defpackage;

import java.util.Iterator;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: x86  reason: default package */
/* loaded from: classes.dex */
public final class x86 implements fv0, Iterable, f93 {
    public final w86 A;
    public final int B;
    public final int L;

    public x86(w86 w86Var, int i, int i2) {
        this.A = w86Var;
        this.B = i;
        this.L = i2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof x86) {
            x86 x86Var = (x86) obj;
            if (x86Var.B == this.B && x86Var.L == this.L && x86Var.A == this.A) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return (this.A.hashCode() * 31) + this.B;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        w86 w86Var = this.A;
        if (w86Var.c0 != this.L) {
            y86.f();
        }
        int i = this.B;
        w86Var.k(i);
        return new lo2(w86Var, i + 1, w86Var.A[(i * 5) + 3] + i);
    }
}
