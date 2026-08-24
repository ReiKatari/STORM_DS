package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: da  reason: default package */
/* loaded from: classes.dex */
public final class da implements tt7 {
    public final tt7 a;
    public final qq4 b;

    public da(tt7 tt7Var, qq4 qq4Var) {
        this.a = tt7Var;
        this.b = qq4Var;
    }

    @Override // defpackage.tt7
    public final int a(qh1 qh1Var) {
        return this.b.a(qh1Var) + this.a.a(qh1Var);
    }

    @Override // defpackage.tt7
    public final int b(qh1 qh1Var, kk3 kk3Var) {
        return this.b.b(qh1Var, kk3Var) + this.a.b(qh1Var, kk3Var);
    }

    @Override // defpackage.tt7
    public final int c(qh1 qh1Var) {
        return this.b.c(qh1Var) + this.a.c(qh1Var);
    }

    @Override // defpackage.tt7
    public final int d(qh1 qh1Var, kk3 kk3Var) {
        return this.b.d(qh1Var, kk3Var) + this.a.d(qh1Var, kk3Var);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof da) {
                da daVar = (da) obj;
                if (nb3.k(daVar.a, this.a) && daVar.b.equals(this.b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.b.a.hashCode() * 31) + this.a.hashCode();
    }

    public final String toString() {
        return "(" + this.a + " + " + this.b + ')';
    }
}
