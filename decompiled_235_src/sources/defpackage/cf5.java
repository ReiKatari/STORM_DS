package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: cf5  reason: default package */
/* loaded from: classes.dex */
public final class cf5 {
    public ey0 a;
    public int b;
    public sq2 c;
    public eo2 d;
    public int e;
    public y94 f;
    public ja4 g;

    public cf5(ey0 ey0Var) {
        this.a = ey0Var;
    }

    public final boolean a() {
        boolean z;
        if (this.a != null) {
            sq2 sq2Var = this.c;
            if (sq2Var != null) {
                z = sq2Var.a();
            } else {
                z = false;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    public final yb3 b(Object obj) {
        yb3 s;
        ey0 ey0Var = this.a;
        if (ey0Var != null && (s = ey0Var.s(this, obj)) != null) {
            return s;
        }
        return yb3.IGNORED;
    }

    public final void c() {
        ey0 ey0Var = this.a;
        if (ey0Var != null) {
            ey0Var.k0 = true;
            ey0Var.p0.S();
        }
        this.a = null;
        this.f = null;
        this.g = null;
        this.d = null;
    }

    public final void d(boolean z) {
        int i;
        int i2 = this.b;
        if (z) {
            i = i2 | 32;
        } else {
            i = i2 & (-33);
        }
        this.b = i;
    }

    public final void e(eo2 eo2Var) {
        this.d = eo2Var;
    }
}
