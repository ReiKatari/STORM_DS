package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: x62  reason: default package */
/* loaded from: classes.dex */
public final class x62 implements tt7 {
    public final tt7 a;
    public final tt7 b;

    public x62(tt7 tt7Var, tt7 tt7Var2) {
        this.a = tt7Var;
        this.b = tt7Var2;
    }

    @Override // defpackage.tt7
    public final int a(qh1 qh1Var) {
        int a = this.a.a(qh1Var) - this.b.a(qh1Var);
        if (a < 0) {
            return 0;
        }
        return a;
    }

    @Override // defpackage.tt7
    public final int b(qh1 qh1Var, kk3 kk3Var) {
        int b = this.a.b(qh1Var, kk3Var) - this.b.b(qh1Var, kk3Var);
        if (b < 0) {
            return 0;
        }
        return b;
    }

    @Override // defpackage.tt7
    public final int c(qh1 qh1Var) {
        int c = this.a.c(qh1Var) - this.b.c(qh1Var);
        if (c < 0) {
            return 0;
        }
        return c;
    }

    @Override // defpackage.tt7
    public final int d(qh1 qh1Var, kk3 kk3Var) {
        int d = this.a.d(qh1Var, kk3Var) - this.b.d(qh1Var, kk3Var);
        if (d < 0) {
            return 0;
        }
        return d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x62)) {
            return false;
        }
        x62 x62Var = (x62) obj;
        if (nb3.k(x62Var.a, this.a) && nb3.k(x62Var.b, this.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "(" + this.a + " - " + this.b + ')';
    }
}
