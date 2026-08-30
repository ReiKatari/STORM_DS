package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ha3  reason: default package */
/* loaded from: classes.dex */
public final class ha3 extends dz3 {
    public final mi2 a;
    public final mi2 b;

    public ha3(mi2 mi2Var, mi2 mi2Var2) {
        this.a = mi2Var;
        this.b = mi2Var2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [yy3, ja3] */
    @Override // defpackage.dz3
    public final yy3 c() {
        ?? yy3Var = new yy3();
        yy3Var.j0 = this.a;
        yy3Var.k0 = this.b;
        return yy3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ha3)) {
            return false;
        }
        ha3 ha3Var = (ha3) obj;
        if (this.a == ha3Var.a && this.b == ha3Var.b) {
            return true;
        }
        return false;
    }

    @Override // defpackage.dz3
    public final void g(yy3 yy3Var) {
        ja3 ja3Var = (ja3) yy3Var;
        ja3Var.j0 = this.a;
        ja3Var.k0 = this.b;
    }

    public final int hashCode() {
        int i;
        int i2 = 0;
        mi2 mi2Var = this.a;
        if (mi2Var != null) {
            i = mi2Var.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        mi2 mi2Var2 = this.b;
        if (mi2Var2 != null) {
            i2 = mi2Var2.hashCode();
        }
        return i3 + i2;
    }
}
