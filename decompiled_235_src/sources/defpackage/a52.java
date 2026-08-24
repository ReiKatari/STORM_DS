package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: a52  reason: default package */
/* loaded from: classes.dex */
public final class a52 extends e74 {
    public final ga7 a;
    public final w97 b;
    public final w97 c;
    public final w97 d;
    public final o52 e;
    public final z72 f;
    public final on2 g;
    public final b52 h;

    public a52(ga7 ga7Var, w97 w97Var, w97 w97Var2, w97 w97Var3, o52 o52Var, z72 z72Var, on2 on2Var, b52 b52Var) {
        this.a = ga7Var;
        this.b = w97Var;
        this.c = w97Var2;
        this.d = w97Var3;
        this.e = o52Var;
        this.f = z72Var;
        this.g = on2Var;
        this.h = b52Var;
    }

    @Override // defpackage.e74
    public final z64 e() {
        return new n52(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a52) {
            a52 a52Var = (a52) obj;
            if (a52Var.a == this.a && nb3.k(a52Var.b, this.b) && nb3.k(a52Var.c, this.c) && nb3.k(a52Var.d, this.d) && a52Var.e.equals(this.e) && nb3.k(a52Var.f, this.f) && a52Var.g == this.g && nb3.k(a52Var.h, this.h)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // defpackage.e74
    public final void g(z64 z64Var) {
        n52 n52Var = (n52) z64Var;
        n52Var.l0 = this.a;
        n52Var.m0 = this.b;
        n52Var.n0 = this.c;
        n52Var.o0 = this.d;
        n52Var.p0 = this.e;
        n52Var.q0 = this.f;
        n52Var.r0 = this.g;
        n52Var.s0 = this.h;
    }

    public final int hashCode() {
        int i;
        int i2;
        int hashCode = this.a.hashCode() * 31;
        int i3 = 0;
        w97 w97Var = this.b;
        if (w97Var != null) {
            i = w97Var.hashCode();
        } else {
            i = 0;
        }
        int i4 = (hashCode + i) * 31;
        w97 w97Var2 = this.c;
        if (w97Var2 != null) {
            i2 = w97Var2.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (i4 + i2) * 31;
        w97 w97Var3 = this.d;
        if (w97Var3 != null) {
            i3 = w97Var3.hashCode();
        }
        int hashCode2 = this.e.a.hashCode();
        int hashCode3 = this.f.a.hashCode();
        return this.h.hashCode() + ((this.g.hashCode() + ((hashCode3 + ((hashCode2 + ((i5 + i3) * 31)) * 31)) * 31)) * 31);
    }
}
