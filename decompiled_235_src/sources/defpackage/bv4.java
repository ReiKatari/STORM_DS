package defpackage;

import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bv4  reason: default package */
/* loaded from: classes.dex */
public final class bv4 {
    public final gd5 a;
    public final List b;
    public final lc5 c;
    public final boolean d;

    public bv4(gd5 gd5Var, List list, lc5 lc5Var, boolean z) {
        gd5Var.getClass();
        this.a = gd5Var;
        this.b = list;
        this.c = lc5Var;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof bv4) {
                bv4 bv4Var = (bv4) obj;
                if (!nb3.k(this.a, bv4Var.a) || !this.b.equals(bv4Var.b) || !this.c.equals(bv4Var.c) || this.d != bv4Var.d) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int b = i61.b(this.a.hashCode() * 31, this.b, 31);
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + b) * 31);
    }

    public final String toString() {
        return "PendingRaSubmissionSnapshot(context=" + this.a + ", records=" + this.b + ", counts=" + this.c + ", closed=" + this.d + ")";
    }
}
