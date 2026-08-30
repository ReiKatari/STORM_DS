package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: h23  reason: default package */
/* loaded from: classes.dex */
public final class h23 implements ih4 {
    public final re7 a;
    public final od1 b;

    public h23(re7 re7Var, zh6 zh6Var) {
        this.a = re7Var;
        this.b = zh6Var;
    }

    @Override // defpackage.ih4
    public final float a(sd3 sd3Var) {
        re7 re7Var = this.a;
        od1 od1Var = this.b;
        return od1Var.A0(re7Var.d(od1Var, sd3Var));
    }

    @Override // defpackage.ih4
    public final float b(sd3 sd3Var) {
        re7 re7Var = this.a;
        od1 od1Var = this.b;
        return od1Var.A0(re7Var.c(od1Var, sd3Var));
    }

    @Override // defpackage.ih4
    public final float c() {
        re7 re7Var = this.a;
        od1 od1Var = this.b;
        return od1Var.A0(re7Var.a(od1Var));
    }

    @Override // defpackage.ih4
    public final float d() {
        re7 re7Var = this.a;
        od1 od1Var = this.b;
        return od1Var.A0(re7Var.b(od1Var));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h23)) {
            return false;
        }
        h23 h23Var = (h23) obj;
        if (b53.x(this.a, h23Var.a) && b53.x(this.b, h23Var.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "InsetsPaddingValues(insets=" + this.a + ", density=" + this.b + ')';
    }
}
