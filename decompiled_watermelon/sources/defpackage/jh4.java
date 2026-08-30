package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: jh4  reason: default package */
/* loaded from: classes.dex */
public final class jh4 extends dz3 {
    public final ih4 a;

    public jh4(ih4 ih4Var) {
        this.a = ih4Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [yy3, a23, kh4] */
    @Override // defpackage.dz3
    public final yy3 c() {
        ?? a23Var = new a23();
        a23Var.l0 = this.a;
        return a23Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof jh4)) {
            return false;
        }
        return b53.x(((jh4) obj).a, this.a);
    }

    @Override // defpackage.dz3
    public final void g(yy3 yy3Var) {
        kh4 kh4Var = (kh4) yy3Var;
        ih4 ih4Var = kh4Var.l0;
        ih4 ih4Var2 = this.a;
        if (!b53.x(ih4Var2, ih4Var)) {
            kh4Var.l0 = ih4Var2;
            kh4Var.S0();
        }
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
