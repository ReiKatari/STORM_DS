package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: kk1  reason: default package */
/* loaded from: classes.dex */
public final class kk1 extends dz3 {
    public final mi2 a;

    public kk1(mi2 mi2Var) {
        this.a = mi2Var;
    }

    @Override // defpackage.dz3
    public final yy3 c() {
        return new f80(new g80(), this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kk1)) {
            return false;
        }
        if (this.a == ((kk1) obj).a) {
            return true;
        }
        return false;
    }

    @Override // defpackage.dz3
    public final void g(yy3 yy3Var) {
        f80 f80Var = (f80) yy3Var;
        f80Var.l0 = this.a;
        f80Var.R0();
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
