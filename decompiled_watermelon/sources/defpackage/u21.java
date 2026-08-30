package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: u21  reason: default package */
/* loaded from: classes.dex */
public final class u21 extends dz3 {
    public final uw6 a;
    public final oq6 b;
    public final hm3 c;
    public final boolean d;
    public final boolean e;
    public final pb4 f;
    public final bq6 g;
    public final hx2 h;
    public final wc2 i;

    public u21(uw6 uw6Var, oq6 oq6Var, hm3 hm3Var, boolean z, boolean z2, pb4 pb4Var, bq6 bq6Var, hx2 hx2Var, wc2 wc2Var) {
        this.a = uw6Var;
        this.b = oq6Var;
        this.c = hm3Var;
        this.d = z;
        this.e = z2;
        this.f = pb4Var;
        this.g = bq6Var;
        this.h = hx2Var;
        this.i = wc2Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [yy3, x21, xc1] */
    @Override // defpackage.dz3
    public final yy3 c() {
        ?? xc1Var = new xc1();
        xc1Var.l0 = this.a;
        xc1Var.m0 = this.b;
        xc1Var.n0 = this.c;
        xc1Var.o0 = this.d;
        xc1Var.p0 = this.e;
        xc1Var.q0 = this.f;
        bq6 bq6Var = this.g;
        xc1Var.r0 = bq6Var;
        xc1Var.s0 = this.h;
        xc1Var.t0 = this.i;
        bq6Var.g = new v21(xc1Var, 4);
        return xc1Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof u21) {
                u21 u21Var = (u21) obj;
                if (this.a.equals(u21Var.a) && b53.x(this.b, u21Var.b) && this.c == u21Var.c && this.d == u21Var.d && this.e == u21Var.e && b53.x(this.f, u21Var.f) && this.g == u21Var.g && b53.x(this.h, u21Var.h) && b53.x(this.i, u21Var.i)) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.dz3
    public final void g(yy3 yy3Var) {
        x21 x21Var = (x21) yy3Var;
        boolean z = x21Var.o0;
        boolean z2 = x21Var.p0;
        hx2 hx2Var = x21Var.s0;
        bq6 bq6Var = x21Var.r0;
        x21Var.l0 = this.a;
        oq6 oq6Var = this.b;
        x21Var.m0 = oq6Var;
        x21Var.n0 = this.c;
        boolean z3 = this.d;
        x21Var.o0 = z3;
        x21Var.q0 = this.f;
        bq6 bq6Var2 = this.g;
        x21Var.r0 = bq6Var2;
        hx2 hx2Var2 = this.h;
        x21Var.s0 = hx2Var2;
        x21Var.t0 = this.i;
        if (z3 != z || z3 != z || !b53.x(hx2Var2, hx2Var) || this.e != z2 || !vr6.c(oq6Var.b)) {
            nl2.M(x21Var);
        }
        if (bq6Var2 != bq6Var) {
            bq6Var2.g = new v21(x21Var, 0);
        }
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        int c = ej6.c(ej6.c(ej6.c((this.c.hashCode() + ((hashCode + (this.a.hashCode() * 31)) * 31)) * 31, false, 31), this.d, 31), this.e, 31);
        int hashCode2 = this.g.hashCode();
        int hashCode3 = this.h.hashCode();
        return this.i.hashCode() + ((hashCode3 + ((hashCode2 + ((this.f.hashCode() + c) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "CoreTextFieldSemanticsModifier(transformedText=" + this.a + ", value=" + this.b + ", state=" + this.c + ", readOnly=false, enabled=" + this.d + ", isPassword=" + this.e + ", offsetMapping=" + this.f + ", manager=" + this.g + ", imeOptions=" + this.h + ", focusRequester=" + this.i + ')';
    }
}
