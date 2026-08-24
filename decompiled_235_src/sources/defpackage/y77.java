package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: y77  reason: default package */
/* loaded from: classes.dex */
public final class y77 extends e74 {
    public final boolean a;
    public final r94 b;
    public final boolean c;
    public final mq5 d;
    public final qn2 e;

    public y77(boolean z, r94 r94Var, boolean z2, mq5 mq5Var, qn2 qn2Var) {
        this.a = z;
        this.b = r94Var;
        this.c = z2;
        this.d = mq5Var;
        this.e = qn2Var;
    }

    @Override // defpackage.e74
    public final z64 e() {
        return new z77(this.a, this.b, this.c, this.d, this.e);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && y77.class == obj.getClass()) {
                y77 y77Var = (y77) obj;
                if (this.a != y77Var.a || !nb3.k(this.b, y77Var.b) || this.c != y77Var.c || !this.d.equals(y77Var.d) || this.e != y77Var.e) {
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
        z77 z77Var = (z77) z64Var;
        boolean z = z77Var.J0;
        boolean z2 = this.a;
        if (z != z2) {
            z77Var.J0 = z2;
            bl2.G(z77Var);
        }
        z77Var.K0 = this.e;
        z77Var.f1(this.b, null, false, this.c, null, this.d, z77Var.L0);
    }

    public final int hashCode() {
        int i;
        int hashCode = Boolean.hashCode(this.a) * 31;
        r94 r94Var = this.b;
        if (r94Var != null) {
            i = r94Var.hashCode();
        } else {
            i = 0;
        }
        return this.e.hashCode() + lb1.a(this.d.a, xg6.e(xg6.e((hashCode + i) * 961, false, 31), this.c, 31), 31);
    }
}
