package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: b60  reason: default package */
/* loaded from: classes.dex */
public final class b60 extends e74 {
    public final float a;
    public final cn6 b;
    public final ke6 c;

    public b60(float f, cn6 cn6Var, ke6 ke6Var) {
        this.a = f;
        this.b = cn6Var;
        this.c = ke6Var;
    }

    @Override // defpackage.e74
    public final z64 e() {
        return new a60(this.a, this.b, this.c);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof b60) {
                b60 b60Var = (b60) obj;
                if (!om1.b(this.a, b60Var.a) || !this.b.equals(b60Var.b) || !nb3.k(this.c, b60Var.c)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.e74
    public final void g(z64 z64Var) {
        a60 a60Var = (a60) z64Var;
        float f = a60Var.n0;
        na0 na0Var = a60Var.q0;
        float f2 = this.a;
        if (!om1.b(f, f2)) {
            a60Var.n0 = f2;
            na0Var.R0();
        }
        cn6 cn6Var = a60Var.o0;
        cn6 cn6Var2 = this.b;
        if (!nb3.k(cn6Var, cn6Var2)) {
            a60Var.o0 = cn6Var2;
            na0Var.R0();
        }
        ke6 ke6Var = a60Var.p0;
        ke6 ke6Var2 = this.c;
        if (!nb3.k(ke6Var, ke6Var2)) {
            a60Var.p0 = ke6Var2;
            na0Var.R0();
            bl2.G(a60Var);
        }
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        return this.c.hashCode() + ((hashCode + (Float.hashCode(this.a) * 31)) * 31);
    }

    public final String toString() {
        return "BorderModifierNodeElement(width=" + ((Object) om1.c(this.a)) + ", brush=" + this.b + ", shape=" + this.c + ')';
    }
}
