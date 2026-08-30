package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: p67  reason: default package */
/* loaded from: classes.dex */
public final class p67 implements re7 {
    public final String a;
    public final tj4 b;

    public p67(i23 i23Var, String str) {
        this.a = str;
        this.b = me2.G(i23Var);
    }

    @Override // defpackage.re7
    public final int a(od1 od1Var) {
        return e().d;
    }

    @Override // defpackage.re7
    public final int b(od1 od1Var) {
        return e().b;
    }

    @Override // defpackage.re7
    public final int c(od1 od1Var, sd3 sd3Var) {
        return e().c;
    }

    @Override // defpackage.re7
    public final int d(od1 od1Var, sd3 sd3Var) {
        return e().a;
    }

    public final i23 e() {
        return (i23) this.b.getValue();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p67)) {
            return false;
        }
        return b53.x(e(), ((p67) obj).e());
    }

    public final void f(i23 i23Var) {
        this.b.setValue(i23Var);
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
        return ej6.g(sb, e().d, ')');
    }
}
