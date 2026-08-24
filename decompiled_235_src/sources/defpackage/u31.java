package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: u31  reason: default package */
/* loaded from: classes.dex */
public final class u31 extends e74 {
    public final lw a;
    public final ic b;
    public final z31 c;
    public final float d;

    public u31(lw lwVar, ic icVar, z31 z31Var, float f) {
        this.a = lwVar;
        this.b = icVar;
        this.c = z31Var;
        this.d = f;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [v31, z64] */
    @Override // defpackage.e74
    public final z64 e() {
        ?? z64Var = new z64();
        z64Var.k0 = this.a;
        z64Var.l0 = this.b;
        z64Var.m0 = this.c;
        z64Var.n0 = this.d;
        return z64Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof u31) {
                u31 u31Var = (u31) obj;
                if (this.a == u31Var.a && nb3.k(this.b, u31Var.b) && nb3.k(this.c, u31Var.c) && Float.compare(this.d, u31Var.d) == 0) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.e74
    public final void g(z64 z64Var) {
        v31 v31Var = (v31) z64Var;
        long h = v31Var.k0.h();
        lw lwVar = this.a;
        boolean b = xi6.b(h, lwVar.h());
        v31Var.k0 = lwVar;
        v31Var.l0 = this.b;
        v31Var.m0 = this.c;
        v31Var.n0 = this.d;
        if (!b) {
            xk2.w(v31Var);
        }
        f04.I(v31Var);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        int hashCode2 = this.c.hashCode();
        return xg6.a(this.d, (hashCode2 + ((hashCode + (this.a.hashCode() * 31)) * 31)) * 31, 31);
    }

    public final String toString() {
        return "ContentPainterElement(painter=" + this.a + ", alignment=" + this.b + ", contentScale=" + this.c + ", alpha=" + this.d + ", colorFilter=null)";
    }
}
