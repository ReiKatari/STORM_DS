package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ig7  reason: default package */
/* loaded from: classes.dex */
public final class ig7 implements tt7 {
    public final tt7 a;
    public final tt7 b;

    public ig7(tt7 tt7Var, tt7 tt7Var2) {
        this.a = tt7Var;
        this.b = tt7Var2;
    }

    @Override // defpackage.tt7
    public final int a(qh1 qh1Var) {
        return Math.max(this.a.a(qh1Var), this.b.a(qh1Var));
    }

    @Override // defpackage.tt7
    public final int b(qh1 qh1Var, kk3 kk3Var) {
        return Math.max(this.a.b(qh1Var, kk3Var), this.b.b(qh1Var, kk3Var));
    }

    @Override // defpackage.tt7
    public final int c(qh1 qh1Var) {
        return Math.max(this.a.c(qh1Var), this.b.c(qh1Var));
    }

    @Override // defpackage.tt7
    public final int d(qh1 qh1Var, kk3 kk3Var) {
        return Math.max(this.a.d(qh1Var, kk3Var), this.b.d(qh1Var, kk3Var));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ig7)) {
            return false;
        }
        ig7 ig7Var = (ig7) obj;
        if (nb3.k(ig7Var.a, this.a) && nb3.k(ig7Var.b, this.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    public final String toString() {
        return "(" + this.a + " ∪ " + this.b + ')';
    }
}
