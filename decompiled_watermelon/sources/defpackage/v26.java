package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: v26  reason: default package */
/* loaded from: classes.dex */
public final class v26 extends dz3 {
    public final float a;
    public final y26 b;
    public final boolean c;
    public final long d;
    public final long e;

    public v26(float f, y26 y26Var, boolean z, long j, long j2) {
        this.a = f;
        this.b = y26Var;
        this.c = z;
        this.d = j;
        this.e = j2;
    }

    @Override // defpackage.dz3
    public final yy3 c() {
        return new f30(new yb(25, this));
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof v26) {
                v26 v26Var = (v26) obj;
                if (!ji1.b(this.a, v26Var.a) || !b53.x(this.b, v26Var.b) || this.c != v26Var.c || !xq0.c(this.d, v26Var.d) || !xq0.c(this.e, v26Var.e)) {
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
        m74 m74Var;
        f30 f30Var = (f30) yy3Var;
        yb ybVar = new yb(25, this);
        f30Var.j0 = ybVar;
        if (f30Var.A.i0 && (m74Var = l.N(f30Var, 2).m0) != null) {
            m74Var.x1(ybVar, true);
        }
    }

    public final int hashCode() {
        int c = ej6.c((this.b.hashCode() + (Float.hashCode(this.a) * 31)) * 31, this.c, 31);
        int i = xq0.i;
        return Long.hashCode(this.e) + b31.c(this.d, c, 31);
    }

    public final String toString() {
        return "ShadowGraphicsLayerElement(elevation=" + ((Object) ji1.c(this.a)) + ", shape=" + this.b + ", clip=" + this.c + ", ambientColor=" + ((Object) xq0.i(this.d)) + ", spotColor=" + ((Object) xq0.i(this.e)) + ')';
    }
}
