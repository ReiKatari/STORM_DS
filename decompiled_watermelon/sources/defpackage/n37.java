package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: n37  reason: default package */
/* loaded from: classes.dex */
final class n37 extends dz3 {
    public final float a;
    public final float b;

    public n37(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [yy3, o37] */
    @Override // defpackage.dz3
    public final yy3 c() {
        ?? yy3Var = new yy3();
        yy3Var.j0 = this.a;
        yy3Var.k0 = this.b;
        return yy3Var;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof n37) {
            n37 n37Var = (n37) obj;
            if (ji1.b(this.a, n37Var.a) && ji1.b(this.b, n37Var.b)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // defpackage.dz3
    public final void g(yy3 yy3Var) {
        o37 o37Var = (o37) yy3Var;
        o37Var.j0 = this.a;
        o37Var.k0 = this.b;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }
}
