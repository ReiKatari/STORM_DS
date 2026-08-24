package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ar4  reason: default package */
/* loaded from: classes.dex */
public final class ar4 implements cq3 {
    public final ue1 a;
    public final uj2 b;
    public final ei c;

    public ar4(ue1 ue1Var, zq4 zq4Var, ei eiVar) {
        this.a = ue1Var;
        this.b = zq4Var;
        this.c = eiVar;
    }

    @Override // defpackage.cq3
    public final int a() {
        return this.b.J().B;
    }

    @Override // defpackage.cq3
    public final void b(int i, Object obj, px0 px0Var, int i2) {
        int i3;
        int i4;
        int i5;
        boolean z;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(-1201380429);
        if (xq2Var.d(i)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i6 = i3 | i2;
        if (xq2Var.h(obj)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i7 = i6 | i4;
        if (xq2Var.f(this)) {
            i5 = 256;
        } else {
            i5 = 128;
        }
        int i8 = i7 | i5;
        if ((i8 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var.S(i8 & 1, z)) {
            qo2.f(obj, i, this.a.y, n16.I(1142237095, new a11(this, i, 3), xq2Var), xq2Var, ((i8 >> 3) & 14) | 3072 | ((i8 << 3) & 112));
        } else {
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new hp(this, i, obj, i2, 9);
        }
    }

    @Override // defpackage.cq3
    public final Object c(int i) {
        Object f = this.c.f(i);
        if (f == null) {
            return this.b.K(i);
        }
        return f;
    }

    @Override // defpackage.cq3
    public final int e(Object obj) {
        return this.c.e(obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ar4)) {
            return false;
        }
        return nb3.k(this.b, ((ar4) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
