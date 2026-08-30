package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: gp3  reason: default package */
/* loaded from: classes.dex */
public final class gp3 extends t {
    public final ep3 a;
    public boolean b;
    public int c;

    public gp3(ep3 ep3Var) {
        this.a = ep3Var;
    }

    @Override // defpackage.t
    public final boolean b(c30 c30Var) {
        if (!(c30Var instanceof op3)) {
            return false;
        }
        if (this.b && this.c == 1) {
            this.a.g = false;
            this.b = false;
        }
        return true;
    }

    @Override // defpackage.t
    public final c30 d() {
        return this.a;
    }

    @Override // defpackage.t
    public final boolean e() {
        return true;
    }

    @Override // defpackage.t
    public final d30 g(vh1 vh1Var) {
        if (vh1Var.h) {
            this.b = true;
            this.c = 0;
        } else if (this.b) {
            this.c++;
        }
        return d30.a(vh1Var.b);
    }
}
