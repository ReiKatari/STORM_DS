package defpackage;

import java.util.Iterator;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: nk6  reason: default package */
/* loaded from: classes.dex */
public final class nk6 implements by0, Iterable, zf3 {
    public final mk6 A;
    public final int B;
    public final int L;

    public nk6(mk6 mk6Var, int i, int i2) {
        this.A = mk6Var;
        this.B = i;
        this.L = i2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof nk6) {
            nk6 nk6Var = (nk6) obj;
            if (nk6Var.B == this.B && nk6Var.L == this.L && nk6Var.A == this.A) {
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
        mk6 mk6Var = this.A;
        if (mk6Var.d0 != this.L) {
            ok6.f();
        }
        int i = this.B;
        mk6Var.g(i);
        return new ou2(mk6Var, i + 1, mk6Var.A[(i * 5) + 3] + i);
    }
}
