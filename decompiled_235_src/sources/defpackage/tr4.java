package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: tr4  reason: default package */
/* loaded from: classes.dex */
public final class tr4 extends e74 {
    public final sr4 a;
    public final ic b;
    public final z31 c;
    public final float d;
    public final z40 e;

    public tr4(sr4 sr4Var, ic icVar, z31 z31Var, float f, z40 z40Var) {
        this.a = sr4Var;
        this.b = icVar;
        this.c = z31Var;
        this.d = f;
        this.e = z40Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [ur4, z64] */
    @Override // defpackage.e74
    public final z64 e() {
        ?? z64Var = new z64();
        z64Var.k0 = this.a;
        z64Var.l0 = true;
        z64Var.m0 = this.b;
        z64Var.n0 = this.c;
        z64Var.o0 = this.d;
        z64Var.p0 = this.e;
        return z64Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof tr4) {
                tr4 tr4Var = (tr4) obj;
                if (!nb3.k(this.a, tr4Var.a) || !nb3.k(this.b, tr4Var.b) || !nb3.k(this.c, tr4Var.c) || Float.compare(this.d, tr4Var.d) != 0 || !nb3.k(this.e, tr4Var.e)) {
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
        boolean z;
        ur4 ur4Var = (ur4) z64Var;
        boolean z2 = ur4Var.l0;
        sr4 sr4Var = this.a;
        if (z2 && xi6.b(ur4Var.k0.h(), sr4Var.h())) {
            z = false;
        } else {
            z = true;
        }
        ur4Var.k0 = sr4Var;
        ur4Var.l0 = true;
        ur4Var.m0 = this.b;
        ur4Var.n0 = this.c;
        ur4Var.o0 = this.d;
        ur4Var.p0 = this.e;
        if (z) {
            xk2.w(ur4Var);
        }
        f04.I(ur4Var);
    }

    public final int hashCode() {
        int hashCode;
        int e = xg6.e(this.a.hashCode() * 31, true, 31);
        int hashCode2 = this.c.hashCode();
        int a = xg6.a(this.d, (hashCode2 + ((this.b.hashCode() + e) * 31)) * 31, 31);
        z40 z40Var = this.e;
        if (z40Var == null) {
            hashCode = 0;
        } else {
            hashCode = z40Var.hashCode();
        }
        return a + hashCode;
    }

    public final String toString() {
        return "PainterElement(painter=" + this.a + ", sizeToIntrinsics=true, alignment=" + this.b + ", contentScale=" + this.c + ", alpha=" + this.d + ", colorFilter=" + this.e + ')';
    }
}
