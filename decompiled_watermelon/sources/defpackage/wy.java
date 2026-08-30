package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: wy  reason: default package */
/* loaded from: classes.dex */
public final class wy extends dz3 {
    public final long a;
    public final b60 b;
    public final float c;
    public final y26 d;

    public wy(long j, zn3 zn3Var, y26 y26Var, int i) {
        j = (i & 1) != 0 ? xq0.h : j;
        zn3Var = (i & 2) != 0 ? null : zn3Var;
        this.a = j;
        this.b = zn3Var;
        this.c = 1.0f;
        this.d = y26Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [yy3, mz] */
    @Override // defpackage.dz3
    public final yy3 c() {
        ?? yy3Var = new yy3();
        yy3Var.j0 = this.a;
        yy3Var.k0 = this.b;
        yy3Var.l0 = this.c;
        yy3Var.m0 = this.d;
        yy3Var.n0 = 9205357640488583168L;
        return yy3Var;
    }

    public final boolean equals(Object obj) {
        wy wyVar;
        if (obj instanceof wy) {
            wyVar = (wy) obj;
        } else {
            wyVar = null;
        }
        if (wyVar == null || !xq0.c(this.a, wyVar.a) || !b53.x(this.b, wyVar.b) || this.c != wyVar.c || !b53.x(this.d, wyVar.d)) {
            return false;
        }
        return true;
    }

    @Override // defpackage.dz3
    public final void g(yy3 yy3Var) {
        mz mzVar = (mz) yy3Var;
        mzVar.j0 = this.a;
        mzVar.k0 = this.b;
        mzVar.l0 = this.c;
        y26 y26Var = mzVar.m0;
        y26 y26Var2 = this.d;
        if (!b53.x(y26Var, y26Var2)) {
            mzVar.m0 = y26Var2;
            nl2.M(mzVar);
        }
        n40.M(mzVar);
    }

    public final int hashCode() {
        int i;
        int i2 = xq0.i;
        int hashCode = Long.hashCode(this.a) * 31;
        b60 b60Var = this.b;
        if (b60Var != null) {
            i = b60Var.hashCode();
        } else {
            i = 0;
        }
        return this.d.hashCode() + ej6.a(this.c, (hashCode + i) * 31, 31);
    }
}
