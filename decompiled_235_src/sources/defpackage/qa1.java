package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qa1  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class qa1 implements fo2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ pa1 B;
    public final /* synthetic */ qn2 L;
    public final /* synthetic */ eo2 R;

    public /* synthetic */ qa1(pa1 pa1Var, qn2 qn2Var, eo2 eo2Var, int i) {
        this.A = i;
        this.B = pa1Var;
        this.L = qn2Var;
        this.R = eo2Var;
    }

    @Override // defpackage.fo2
    public final Object e(Object obj, Object obj2, Object obj3) {
        int i;
        boolean z;
        int i2 = this.A;
        jg7 jg7Var = jg7.a;
        boolean z2 = true;
        pa1 pa1Var = this.B;
        switch (i2) {
            case 0:
                lq4 lq4Var = (lq4) obj;
                px0 px0Var = (px0) obj2;
                int intValue = ((Integer) obj3).intValue();
                lq4Var.getClass();
                if ((intValue & 6) == 0) {
                    if (((xq2) px0Var).f(lq4Var)) {
                        i = 4;
                    } else {
                        i = 2;
                    }
                    intValue |= i;
                }
                if ((intValue & 19) == 18) {
                    z2 = false;
                }
                xq2 xq2Var = (xq2) px0Var;
                if (xq2Var.S(intValue & 1, z2)) {
                    if (pa1Var instanceof oa1) {
                        xq2Var.b0(578442313);
                        nb3.i(ge7.N(dj6.c, lq4Var), xq2Var, 0);
                        xq2Var.p(false);
                    } else if (pa1Var instanceof na1) {
                        xq2Var.b0(578595236);
                        nb3.d(dj6.c, lq4Var, ((na1) pa1Var).a, this.L, this.R, null, xq2Var, ((intValue << 3) & 112) | 6, 32);
                        xq2Var.p(false);
                    } else if (pa1Var instanceof ma1) {
                        xq2Var.b0(578989835);
                        nb3.g(ge7.N(dj6.c, lq4Var), xq2Var, 0);
                        xq2Var.p(false);
                    } else {
                        throw xg6.f(xq2Var, -396984452, false);
                    }
                } else {
                    xq2Var.V();
                }
                return jg7Var;
            default:
                px0 px0Var2 = (px0) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((lq4) obj).getClass();
                if ((intValue2 & 17) != 16) {
                    z = true;
                } else {
                    z = false;
                }
                xq2 xq2Var2 = (xq2) px0Var2;
                if (xq2Var2.S(1 & intValue2, z)) {
                    boolean z3 = pa1Var instanceof oa1;
                    x64 x64Var = x64.a;
                    if (z3) {
                        xq2Var2.b0(-134727535);
                        nb3.i(dj6.c(x64Var, 1.0f), xq2Var2, 6);
                        xq2Var2.p(false);
                    } else if (pa1Var instanceof na1) {
                        xq2Var2.b0(-134585958);
                        nb3.d(x64Var, new pq4(RecyclerView.B1, RecyclerView.B1, RecyclerView.B1, RecyclerView.B1), ((na1) pa1Var).a, this.L, this.R, new pq4(24.0f, 8.0f, 24.0f, 8.0f), xq2Var2, 196662, 0);
                        xq2Var2.p(false);
                    } else if (pa1Var instanceof ma1) {
                        xq2Var2.b0(-134096685);
                        nb3.g(dj6.c(x64Var, 1.0f), xq2Var2, 6);
                        xq2Var2.p(false);
                    } else {
                        throw xg6.f(xq2Var2, -1528368504, false);
                    }
                } else {
                    xq2Var2.V();
                }
                return jg7Var;
        }
    }
}
