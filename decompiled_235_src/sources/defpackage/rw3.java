package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: rw3  reason: default package */
/* loaded from: classes.dex */
public final class rw3 extends u {
    public final qw3 a = new a21();
    public final int b;
    public boolean c;

    /* JADX WARN: Type inference failed for: r0v0, types: [a21, qw3] */
    public rw3(int i) {
        this.b = i;
    }

    @Override // defpackage.u
    public final boolean b(a50 a50Var) {
        if (this.c) {
            a50 a50Var2 = (a50) ((a21) this.a.b);
            if (a50Var2 instanceof gw3) {
                ((gw3) a50Var2).g = false;
                return true;
            }
            return true;
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
        boolean z = false;
        if (am1Var.h) {
            if (((a21) this.a.c) != null) {
                a50 d = am1Var.h().d();
                this.c = ((d instanceof xr4) || (d instanceof qw3)) ? true : true;
                return b50.a(am1Var.e);
            }
            return null;
        }
        int i = am1Var.g;
        int i2 = this.b;
        if (i >= i2) {
            return new b50(-1, false, am1Var.c + i2);
        }
        return null;
    }
}
