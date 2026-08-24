package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: uv  reason: default package */
/* loaded from: classes.dex */
public final class uv implements nh1 {
    public final char a;

    public uv(char c) {
        this.a = c;
    }

    @Override // defpackage.nh1
    public final void a(vz6 vz6Var, vz6 vz6Var2, int i) {
        a21 a21Var;
        String.valueOf(this.a);
        if (i == 1) {
            a21Var = new a21();
        } else {
            a21Var = new a21();
        }
        for (a21 a21Var2 = (a21) vz6Var.f; a21Var2 != null && a21Var2 != vz6Var2; a21Var2 = (a21) a21Var2.f) {
            a21Var.b(a21Var2);
        }
        a21Var.j();
        a21 a21Var3 = (a21) vz6Var.f;
        a21Var.f = a21Var3;
        if (a21Var3 != null) {
            a21Var3.e = a21Var;
        }
        a21Var.e = vz6Var;
        vz6Var.f = a21Var;
        a21 a21Var4 = (a21) vz6Var.b;
        a21Var.b = a21Var4;
        if (((a21) a21Var.f) == null) {
            a21Var4.d = a21Var;
        }
    }

    @Override // defpackage.nh1
    public final char b() {
        return this.a;
    }

    @Override // defpackage.nh1
    public final int c() {
        return 1;
    }

    @Override // defpackage.nh1
    public final int d(mh1 mh1Var, mh1 mh1Var2) {
        if (mh1Var.d || mh1Var2.c) {
            int i = mh1Var2.h;
            if (i % 3 != 0 && (mh1Var.h + i) % 3 == 0) {
                return 0;
            }
        }
        if (mh1Var.g >= 2 && mh1Var2.g >= 2) {
            return 2;
        }
        return 1;
    }

    @Override // defpackage.nh1
    public final char e() {
        return this.a;
    }
}
