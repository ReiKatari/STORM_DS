package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hd2  reason: default package */
/* loaded from: classes.dex */
public final class hd2 implements tt7 {
    public final int a;

    public hd2(int i) {
        this.a = i;
    }

    @Override // defpackage.tt7
    public final int a(qh1 qh1Var) {
        return 0;
    }

    @Override // defpackage.tt7
    public final int b(qh1 qh1Var, kk3 kk3Var) {
        return 0;
    }

    @Override // defpackage.tt7
    public final int c(qh1 qh1Var) {
        return this.a;
    }

    @Override // defpackage.tt7
    public final int d(qh1 qh1Var, kk3 kk3Var) {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if ((obj instanceof hd2) && this.a == ((hd2) obj).a) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return xg6.q(new StringBuilder("Insets(left=0, top=0, right=0, bottom="), this.a, ')');
    }
}
