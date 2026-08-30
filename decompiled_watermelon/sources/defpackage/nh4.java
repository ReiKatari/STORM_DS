package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: nh4  reason: default package */
/* loaded from: classes.dex */
public final class nh4 implements re7 {
    public final ih4 a;

    public nh4(ih4 ih4Var) {
        this.a = ih4Var;
    }

    @Override // defpackage.re7
    public final int a(od1 od1Var) {
        return od1Var.Y(this.a.c());
    }

    @Override // defpackage.re7
    public final int b(od1 od1Var) {
        return od1Var.Y(this.a.d());
    }

    @Override // defpackage.re7
    public final int c(od1 od1Var, sd3 sd3Var) {
        return od1Var.Y(this.a.b(sd3Var));
    }

    @Override // defpackage.re7
    public final int d(od1 od1Var, sd3 sd3Var) {
        return od1Var.Y(this.a.a(sd3Var));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nh4)) {
            return false;
        }
        return b53.x(((nh4) obj).a, this.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        sd3 sd3Var = sd3.Ltr;
        ih4 ih4Var = this.a;
        float a = ih4Var.a(sd3Var);
        float d = ih4Var.d();
        float b = ih4Var.b(sd3Var);
        float c = ih4Var.c();
        return "PaddingValues(" + ((Object) ji1.c(a)) + ", " + ((Object) ji1.c(d)) + ", " + ((Object) ji1.c(b)) + ", " + ((Object) ji1.c(c)) + ')';
    }
}
