package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: cs2  reason: default package */
/* loaded from: classes.dex */
public final class cs2 {
    public final ki5 a;
    public final pv b;
    public final bm7 c;
    public final s83 d;

    public cs2(ki5 ki5Var, pv pvVar, bm7 bm7Var, s83 s83Var) {
        ki5Var.getClass();
        this.a = ki5Var;
        this.b = pvVar;
        this.c = bm7Var;
        this.d = s83Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof cs2) {
                cs2 cs2Var = (cs2) obj;
                if (!nb3.k(this.a, cs2Var.a) || !this.b.equals(cs2Var.b) || !this.c.equals(cs2Var.c) || !this.d.equals(cs2Var.d)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        int hashCode2 = this.c.hashCode();
        return this.d.hashCode() + ((hashCode2 + ((hashCode + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "GitHubReleaseCandidate(release=" + this.a + ", asset=" + this.b + ", version=" + this.c + ", publishedAt=" + this.d + ")";
    }
}
