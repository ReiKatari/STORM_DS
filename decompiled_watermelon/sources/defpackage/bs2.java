package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: bs2  reason: default package */
/* loaded from: classes.dex */
public final class bs2 extends dz3 {
    public final h20 a;

    public bs2(h20 h20Var) {
        this.a = h20Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [yy3, cs2] */
    @Override // defpackage.dz3
    public final yy3 c() {
        ?? yy3Var = new yy3();
        yy3Var.j0 = this.a;
        return yy3Var;
    }

    public final boolean equals(Object obj) {
        bs2 bs2Var;
        if (this == obj) {
            return true;
        }
        if (obj instanceof bs2) {
            bs2Var = (bs2) obj;
        } else {
            bs2Var = null;
        }
        if (bs2Var == null) {
            return false;
        }
        return this.a.equals(bs2Var.a);
    }

    @Override // defpackage.dz3
    public final void g(yy3 yy3Var) {
        ((cs2) yy3Var).j0 = this.a;
    }

    public final int hashCode() {
        return Float.hashCode(this.a.a);
    }
}
