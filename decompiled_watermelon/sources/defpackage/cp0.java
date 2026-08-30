package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: cp0  reason: default package */
/* loaded from: classes.dex */
public final class cp0 extends dz3 {
    public final l14 a;
    public final jy2 b;
    public final boolean c;
    public final boolean d;
    public final String e;
    public final og5 f;
    public final ki2 g;

    public cp0(l14 l14Var, jy2 jy2Var, boolean z, boolean z2, String str, og5 og5Var, ki2 ki2Var) {
        this.a = l14Var;
        this.b = jy2Var;
        this.c = z;
        this.d = z2;
        this.e = str;
        this.f = og5Var;
        this.g = ki2Var;
    }

    @Override // defpackage.dz3
    public final yy3 c() {
        return new g0(this.a, this.b, this.c, this.d, this.e, this.f, this.g);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && cp0.class == obj.getClass()) {
                cp0 cp0Var = (cp0) obj;
                if (!b53.x(this.a, cp0Var.a) || !b53.x(this.b, cp0Var.b) || this.c != cp0Var.c || this.d != cp0Var.d || !b53.x(this.e, cp0Var.e) || !b53.x(this.f, cp0Var.f) || this.g != cp0Var.g) {
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
        ((ep0) yy3Var).f1(this.a, this.b, this.c, this.d, this.e, this.f, this.g);
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        l14 l14Var = this.a;
        if (l14Var != null) {
            i = l14Var.hashCode();
        } else {
            i = 0;
        }
        int i5 = i * 31;
        jy2 jy2Var = this.b;
        if (jy2Var != null) {
            i2 = jy2Var.hashCode();
        } else {
            i2 = 0;
        }
        int c = ej6.c(ej6.c((i5 + i2) * 31, this.c, 31), this.d, 31);
        String str = this.e;
        if (str != null) {
            i3 = str.hashCode();
        } else {
            i3 = 0;
        }
        int i6 = (c + i3) * 31;
        og5 og5Var = this.f;
        if (og5Var != null) {
            i4 = Integer.hashCode(og5Var.a);
        }
        return this.g.hashCode() + ((i6 + i4) * 31);
    }
}
