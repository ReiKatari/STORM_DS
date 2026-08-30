package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: vc4  reason: default package */
/* loaded from: classes.dex */
public final class vc4 extends dz3 {
    public final mi2 a;

    public vc4(mi2 mi2Var) {
        this.a = mi2Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [yy3, wc4] */
    @Override // defpackage.dz3
    public final yy3 c() {
        ?? yy3Var = new yy3();
        yy3Var.j0 = this.a;
        yy3Var.k0 = -9223372034707292160L;
        return yy3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vc4)) {
            return false;
        }
        if (this.a == ((vc4) obj).a) {
            return true;
        }
        return false;
    }

    @Override // defpackage.dz3
    public final void g(yy3 yy3Var) {
        wc4 wc4Var = (wc4) yy3Var;
        wc4Var.j0 = this.a;
        wc4Var.k0 = -9223372034707292160L;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
