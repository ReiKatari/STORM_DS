package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: zx2  reason: default package */
/* loaded from: classes.dex */
public final class zx2 {
    public final int a;
    public final hc1 b;
    public final jd0 c;

    public zx2(int i, hc1 hc1Var, jd0 jd0Var) {
        hc1Var.getClass();
        this.a = i;
        this.b = hc1Var;
        this.c = jd0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zx2) {
            zx2 zx2Var = (zx2) obj;
            if (this.a == zx2Var.a && b53.x(this.b, zx2Var.b) && this.c == zx2Var.c) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        return this.c.hashCode() + ((hashCode + (Integer.hashCode(this.a) * 31)) * 31);
    }

    public final String toString() {
        return "ConfiguredOutput(streamId=" + ((Object) uf6.a(this.a)) + ", deferrableSurface=" + this.b + ", graph=" + this.c + ')';
    }
}
