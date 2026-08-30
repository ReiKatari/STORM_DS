package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: pm  reason: default package */
/* loaded from: classes.dex */
public final class pm implements re7 {
    public final int a;
    public final String b;
    public final tj4 c = me2.G(x13.e);
    public final tj4 d = me2.G(Boolean.TRUE);

    public pm(int i, String str) {
        this.a = i;
        this.b = str;
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

    public final x13 e() {
        return (x13) this.c.getValue();
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof pm) {
                if (this.a == ((pm) obj).a) {
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

    public final void g(vf7 vf7Var, int i) {
        int i2 = this.a;
        if (i != 0 && (i & i2) == 0) {
            return;
        }
        this.c.setValue(vf7Var.a.h(i2));
        f(vf7Var.a.t(i2));
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
        return ej6.g(sb, e().d, ')');
    }
}
