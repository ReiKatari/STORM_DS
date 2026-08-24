package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bn  reason: default package */
/* loaded from: classes.dex */
public final class bn implements tt7 {
    public final int a;
    public final String b;
    public final vs4 c = np2.Y(e83.e);
    public final vs4 d = np2.Y(Boolean.TRUE);

    public bn(int i, String str) {
        this.a = i;
        this.b = str;
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

    public final e83 e() {
        return (e83) this.c.getValue();
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof bn) {
                if (this.a == ((bn) obj).a) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final void f(boolean z) {
        this.d.setValue(Boolean.valueOf(z));
    }

    public final void g(vu7 vu7Var, int i) {
        int i2 = this.a;
        if (i != 0 && (i & i2) == 0) {
            return;
        }
        this.c.setValue(vu7Var.a.h(i2));
        f(vu7Var.a.t(i2));
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.b);
        sb.append('(');
        sb.append(e().a);
        sb.append(", ");
        sb.append(e().b);
        sb.append(", ");
        sb.append(e().c);
        sb.append(", ");
        return xg6.q(sb, e().d, ')');
    }
}
