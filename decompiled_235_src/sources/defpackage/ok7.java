package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ok7  reason: default package */
/* loaded from: classes.dex */
public final class ok7 implements tt7 {
    public final String a;
    public final vs4 b;

    public ok7(p83 p83Var, String str) {
        this.a = str;
        this.b = np2.Y(p83Var);
    }

    @Override // defpackage.tt7
    public final int a(qh1 qh1Var) {
        return e().b;
    }

    @Override // defpackage.tt7
    public final int b(qh1 qh1Var, kk3 kk3Var) {
        return e().c;
    }

    @Override // defpackage.tt7
    public final int c(qh1 qh1Var) {
        return e().d;
    }

    @Override // defpackage.tt7
    public final int d(qh1 qh1Var, kk3 kk3Var) {
        return e().a;
    }

    public final p83 e() {
        return (p83) this.b.getValue();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ok7)) {
            return false;
        }
        return nb3.k(e(), ((ok7) obj).e());
    }

    public final void f(p83 p83Var) {
        this.b.setValue(p83Var);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append("(left=");
        sb.append(e().a);
        sb.append(", top=");
        sb.append(e().b);
        sb.append(", right=");
        sb.append(e().c);
        sb.append(", bottom=");
        return xg6.q(sb, e().d, ')');
    }
}
