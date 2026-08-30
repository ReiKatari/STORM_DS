package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: xl2  reason: default package */
/* loaded from: classes.dex */
public final class xl2 {
    public final v85 a;
    public final xu b;
    public final c87 c;
    public final l23 d;

    public xl2(v85 v85Var, xu xuVar, c87 c87Var, l23 l23Var) {
        v85Var.getClass();
        this.a = v85Var;
        this.b = xuVar;
        this.c = c87Var;
        this.d = l23Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof xl2) {
                xl2 xl2Var = (xl2) obj;
                if (!b53.x(this.a, xl2Var.a) || !this.b.equals(xl2Var.b) || !this.c.equals(xl2Var.c) || !this.d.equals(xl2Var.d)) {
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
