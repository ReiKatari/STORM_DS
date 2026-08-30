package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: l02  reason: default package */
/* loaded from: classes.dex */
public final class l02 extends dz3 {
    public final kx6 a;
    public final ax6 b;
    public final ax6 c;
    public final ax6 d;
    public final z02 e;
    public final h32 f;
    public final ki2 g;
    public final m02 h;

    public l02(kx6 kx6Var, ax6 ax6Var, ax6 ax6Var2, ax6 ax6Var3, z02 z02Var, h32 h32Var, ki2 ki2Var, m02 m02Var) {
        this.a = kx6Var;
        this.b = ax6Var;
        this.c = ax6Var2;
        this.d = ax6Var3;
        this.e = z02Var;
        this.f = h32Var;
        this.g = ki2Var;
        this.h = m02Var;
    }

    @Override // defpackage.dz3
    public final yy3 c() {
        return new y02(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof l02) {
            l02 l02Var = (l02) obj;
            if (l02Var.a == this.a && b53.x(l02Var.b, this.b) && b53.x(l02Var.c, this.c) && b53.x(l02Var.d, this.d) && l02Var.e.equals(this.e) && b53.x(l02Var.f, this.f) && l02Var.g == this.g && b53.x(l02Var.h, this.h)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // defpackage.dz3
    public final void g(yy3 yy3Var) {
        y02 y02Var = (y02) yy3Var;
        y02Var.k0 = this.a;
        y02Var.l0 = this.b;
        y02Var.m0 = this.c;
        y02Var.n0 = this.d;
        y02Var.o0 = this.e;
        y02Var.p0 = this.f;
        y02Var.q0 = this.g;
        y02Var.r0 = this.h;
    }

    public final int hashCode() {
        int i;
        int i2;
        int hashCode = this.a.hashCode() * 31;
        int i3 = 0;
        ax6 ax6Var = this.b;
        if (ax6Var != null) {
            i = ax6Var.hashCode();
        } else {
            i = 0;
        }
        int i4 = (hashCode + i) * 31;
        ax6 ax6Var2 = this.c;
        if (ax6Var2 != null) {
            i2 = ax6Var2.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (i4 + i2) * 31;
        ax6 ax6Var3 = this.d;
        if (ax6Var3 != null) {
            i3 = ax6Var3.hashCode();
        }
        int hashCode2 = this.e.a.hashCode();
        int hashCode3 = this.f.a.hashCode();
        return this.h.hashCode() + ((this.g.hashCode() + ((hashCode3 + ((hashCode2 + ((i5 + i3) * 31)) * 31)) * 31)) * 31);
    }
}
