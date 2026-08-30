package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: xg3  reason: default package */
/* loaded from: classes.dex */
public final class xg3 extends dz3 {
    public final float a;
    public final boolean b;

    public xg3(float f, boolean z) {
        this.a = f;
        this.b = z;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [yy3, yg3] */
    @Override // defpackage.dz3
    public final yy3 c() {
        ?? yy3Var = new yy3();
        yy3Var.j0 = this.a;
        yy3Var.k0 = this.b;
        return yy3Var;
    }

    public final boolean equals(Object obj) {
        xg3 xg3Var;
        if (this == obj) {
            return true;
        }
        if (obj instanceof xg3) {
            xg3Var = (xg3) obj;
        } else {
            xg3Var = null;
        }
        if (xg3Var != null && this.a == xg3Var.a && this.b == xg3Var.b) {
            return true;
        }
        return false;
    }

    @Override // defpackage.dz3
    public final void g(yy3 yy3Var) {
        yg3 yg3Var = (yg3) yy3Var;
        yg3Var.j0 = this.a;
        yg3Var.k0 = this.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }
}
