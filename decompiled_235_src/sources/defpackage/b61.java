package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: b61  reason: default package */
/* loaded from: classes.dex */
public final class b61 extends e74 {
    public final p97 a;
    public final c37 b;
    public final jt3 c;
    public final boolean d;
    public final boolean e;
    public final mk4 f;
    public final p27 g;
    public final l33 h;
    public final nh2 i;

    public b61(p97 p97Var, c37 c37Var, jt3 jt3Var, boolean z, boolean z2, mk4 mk4Var, p27 p27Var, l33 l33Var, nh2 nh2Var) {
        this.a = p97Var;
        this.b = c37Var;
        this.c = jt3Var;
        this.d = z;
        this.e = z2;
        this.f = mk4Var;
        this.g = p27Var;
        this.h = l33Var;
        this.i = nh2Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [e61, zg1, z64] */
    @Override // defpackage.e74
    public final z64 e() {
        ?? zg1Var = new zg1();
        zg1Var.m0 = this.a;
        zg1Var.n0 = this.b;
        zg1Var.o0 = this.c;
        zg1Var.p0 = this.d;
        zg1Var.q0 = this.e;
        zg1Var.r0 = this.f;
        p27 p27Var = this.g;
        zg1Var.s0 = p27Var;
        zg1Var.t0 = this.h;
        zg1Var.u0 = this.i;
        p27Var.g = new c61(zg1Var, 4);
        return zg1Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof b61) {
                b61 b61Var = (b61) obj;
                if (this.a.equals(b61Var.a) && nb3.k(this.b, b61Var.b) && this.c == b61Var.c && this.d == b61Var.d && this.e == b61Var.e && nb3.k(this.f, b61Var.f) && this.g == b61Var.g && nb3.k(this.h, b61Var.h) && nb3.k(this.i, b61Var.i)) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.e74
    public final void g(z64 z64Var) {
        e61 e61Var = (e61) z64Var;
        boolean z = e61Var.p0;
        boolean z2 = e61Var.q0;
        l33 l33Var = e61Var.t0;
        p27 p27Var = e61Var.s0;
        e61Var.m0 = this.a;
        c37 c37Var = this.b;
        e61Var.n0 = c37Var;
        e61Var.o0 = this.c;
        boolean z3 = this.d;
        e61Var.p0 = z3;
        e61Var.r0 = this.f;
        p27 p27Var2 = this.g;
        e61Var.s0 = p27Var2;
        l33 l33Var2 = this.h;
        e61Var.t0 = l33Var2;
        e61Var.u0 = this.i;
        if (z3 != z || z3 != z || !nb3.k(l33Var2, l33Var) || this.e != z2 || !k47.c(c37Var.b)) {
            bl2.G(e61Var);
        }
        if (p27Var2 != p27Var) {
            p27Var2.g = new c61(e61Var, 0);
        }
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        int e = xg6.e(xg6.e(xg6.e((this.c.hashCode() + ((hashCode + (this.a.hashCode() * 31)) * 31)) * 31, false, 31), this.d, 31), this.e, 31);
        int hashCode2 = this.g.hashCode();
        int hashCode3 = this.h.hashCode();
        return this.i.hashCode() + ((hashCode3 + ((hashCode2 + ((this.f.hashCode() + e) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "CoreTextFieldSemanticsModifier(transformedText=" + this.a + ", value=" + this.b + ", state=" + this.c + ", readOnly=false, enabled=" + this.d + ", isPassword=" + this.e + ", offsetMapping=" + this.f + ", manager=" + this.g + ", imeOptions=" + this.h + ", focusRequester=" + this.i + ')';
    }
}
