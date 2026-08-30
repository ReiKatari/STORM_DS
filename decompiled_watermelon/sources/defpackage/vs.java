package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: vs  reason: default package */
/* loaded from: classes.dex */
public final class vs extends dz3 {
    public final boolean a;
    public final mi2 b;

    public vs(mi2 mi2Var, boolean z) {
        this.a = z;
        this.b = mi2Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [yy3, g21] */
    @Override // defpackage.dz3
    public final yy3 c() {
        ?? yy3Var = new yy3();
        yy3Var.j0 = this.a;
        yy3Var.k0 = this.b;
        return yy3Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof vs) {
                vs vsVar = (vs) obj;
                if (this.a != vsVar.a || this.b != vsVar.b) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.dz3
    public final void g(yy3 yy3Var) {
        g21 g21Var = (g21) yy3Var;
        g21Var.j0 = this.a;
        g21Var.k0 = this.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }
}
