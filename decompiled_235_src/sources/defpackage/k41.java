package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: k41  reason: default package */
/* loaded from: classes.dex */
public final class k41 {
    public final mm6 a = new mm6();

    public static void b(k41 k41Var, eo2 eo2Var, zv0 zv0Var, on2 on2Var, int i) {
        if ((i & 8) != 0) {
            zv0Var = null;
        }
        k41Var.a.add(new zv0(-1789283891, true, new dq3(eo2Var, k41Var, zv0Var, on2Var)));
    }

    public final void a(i41 i41Var, px0 px0Var, int i) {
        int i2;
        int i3;
        boolean z;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(-798501095);
        if (xq2Var.f(i41Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i4 = i2 | i;
        if (xq2Var.f(this)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i5 = i4 | i3;
        if ((i5 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var.S(i5 & 1, z)) {
            mm6 mm6Var = this.a;
            int size = mm6Var.size();
            for (int i6 = 0; i6 < size; i6++) {
                ((fo2) mm6Var.get(i6)).e(i41Var, xq2Var, Integer.valueOf(i5 & 14));
            }
        } else {
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new ql1(this, i, 7, i41Var);
        }
    }
}
