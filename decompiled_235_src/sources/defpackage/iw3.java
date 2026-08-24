package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: iw3  reason: default package */
/* loaded from: classes.dex */
public final class iw3 extends u {
    public final gw3 a;
    public boolean b;
    public int c;

    public iw3(gw3 gw3Var) {
        this.a = gw3Var;
    }

    @Override // defpackage.u
    public final boolean b(a50 a50Var) {
        if (!(a50Var instanceof qw3)) {
            return false;
        }
        if (this.b && this.c == 1) {
            this.a.g = false;
            this.b = false;
        }
        return true;
    }

    @Override // defpackage.u
    public final a50 d() {
        return this.a;
    }

    @Override // defpackage.u
    public final boolean e() {
        return true;
    }

    @Override // defpackage.u
    public final b50 g(am1 am1Var) {
        if (am1Var.h) {
            this.b = true;
            this.c = 0;
        } else if (this.b) {
            this.c++;
        }
        return b50.a(am1Var.b);
    }
}
