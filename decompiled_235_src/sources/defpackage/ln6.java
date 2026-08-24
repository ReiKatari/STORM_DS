package defpackage;

import java.util.Iterator;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ln6  reason: default package */
/* loaded from: classes.dex */
public final class ln6 implements by0, Iterable, zf3 {
    public final mk6 A;
    public final int B;
    public final fi5 L;

    public ln6(mk6 mk6Var, int i, zq2 zq2Var, fi5 fi5Var) {
        this.A = mk6Var;
        this.B = i;
        this.L = fi5Var;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ln6) {
            ln6 ln6Var = (ln6) obj;
            if (ln6Var.B == this.B && ln6Var.A == this.A && ln6Var.L.equals(this.L)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.A.hashCode();
        return this.L.hashCode() + ((hashCode + (this.B * 31)) * 31);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new kn6(this.A, this.B, null, this.L);
    }
}
