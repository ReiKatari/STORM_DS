package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: oo6  reason: default package */
/* loaded from: classes.dex */
public final class oo6 extends dz3 {
    public final wv6 a;
    public final oa0 b;
    public final wp6 c;
    public final k21 d;

    public oo6(wv6 wv6Var, oa0 oa0Var, wp6 wp6Var, k21 k21Var) {
        this.a = wv6Var;
        this.b = oa0Var;
        this.c = wp6Var;
        this.d = k21Var;
    }

    @Override // defpackage.dz3
    public final yy3 c() {
        return new po6(this.a, this.b, this.c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof oo6) {
                oo6 oo6Var = (oo6) obj;
                if (this.a != oo6Var.a || this.b != oo6Var.b || this.c != oo6Var.c || this.d != oo6Var.d) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.dz3
    public final void g(yy3 yy3Var) {
        vv6 vv6Var;
        po6 po6Var = (po6) yy3Var;
        po6Var.l0.B = null;
        wv6 wv6Var = this.a;
        po6Var.l0 = wv6Var;
        wv6Var.B = po6Var;
        if (po6Var.i0) {
            vv6Var = vv6.Attached;
        } else {
            vv6Var = vv6.Detached;
        }
        wv6Var.L = vv6Var;
        po6Var.m0 = this.b;
        po6Var.n0 = this.c;
        po6Var.o0 = this.d;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        int hashCode2 = this.c.hashCode();
        return this.d.hashCode() + ((hashCode2 + ((hashCode + (this.a.hashCode() * 31)) * 31)) * 31);
    }
}
