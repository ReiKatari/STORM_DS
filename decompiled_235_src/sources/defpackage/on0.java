package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: on0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class on0 implements fo2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ xn0 B;
    public final /* synthetic */ on2 L;

    public /* synthetic */ on0(xn0 xn0Var, on2 on2Var, int i) {
        this.A = i;
        this.B = xn0Var;
        this.L = on2Var;
    }

    @Override // defpackage.fo2
    public final Object e(Object obj, Object obj2, Object obj3) {
        int i = this.A;
        jg7 jg7Var = jg7.a;
        x64 x64Var = x64.a;
        int i2 = 2;
        boolean z = true;
        boolean z2 = false;
        switch (i) {
            case 0:
                lq4 lq4Var = (lq4) obj;
                px0 px0Var = (px0) obj2;
                int intValue = ((Integer) obj3).intValue();
                lq4Var.getClass();
                if ((intValue & 6) == 0) {
                    if (((xq2) px0Var).f(lq4Var)) {
                        i2 = 4;
                    }
                    intValue |= i2;
                }
                if ((intValue & 19) == 18) {
                    z = false;
                }
                xq2 xq2Var = (xq2) px0Var;
                if (xq2Var.S(intValue & 1, z)) {
                    lb4.b(dj6.c(x64Var, 1.0f), this.B, lq4Var, this.L, xq2Var, ((intValue << 6) & 896) | 6);
                } else {
                    xq2Var.V();
                }
                return jg7Var;
            default:
                lq4 lq4Var2 = (lq4) obj;
                px0 px0Var2 = (px0) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                lq4Var2.getClass();
                if ((intValue2 & 6) == 0) {
                    if (((xq2) px0Var2).f(lq4Var2)) {
                        i2 = 4;
                    }
                    intValue2 |= i2;
                }
                if ((intValue2 & 19) != 18) {
                    z2 = true;
                }
                xq2 xq2Var2 = (xq2) px0Var2;
                if (xq2Var2.S(intValue2 & 1, z2)) {
                    a74 W = nb3.W(q60.s(x64Var, lq4Var2), nb3.U(xq2Var2), true);
                    nq6 nq6Var = ky0.n;
                    lb4.b(W, this.B, new pq4(ge7.r(lq4Var2, (kk3) xq2Var2.j(nq6Var)) + 16.0f, lq4Var2.d() + 16.0f, ge7.q(lq4Var2, (kk3) xq2Var2.j(nq6Var)) + 16.0f, lq4Var2.a() + 16.0f), this.L, xq2Var2, 0);
                } else {
                    xq2Var2.V();
                }
                return jg7Var;
        }
    }
}
