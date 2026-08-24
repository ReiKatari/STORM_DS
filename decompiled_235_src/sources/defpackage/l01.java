package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: l01  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class l01 implements eo2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ List B;
    public final /* synthetic */ qn2 L;
    public final /* synthetic */ on2 R;
    public final /* synthetic */ int X;
    public final /* synthetic */ String Y;

    public /* synthetic */ l01(String str, List list, int i, qn2 qn2Var, on2 on2Var, int i2) {
        this.A = 0;
        this.Y = str;
        this.B = list;
        this.X = i;
        this.L = qn2Var;
        this.R = on2Var;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        boolean z;
        vs0 vs0Var;
        on2 on2Var;
        int i = this.A;
        boolean z2 = false;
        jg7 jg7Var = jg7.a;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                n01.a(this.Y, this.B, this.X, this.L, this.R, (px0) obj, ii2.a0(1));
                return jg7Var;
            case 1:
                px0 px0Var = (px0) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z2 = true;
                }
                xq2 xq2Var = (xq2) px0Var;
                if (xq2Var.S(intValue & 1, z2)) {
                    hf.b(dj6.c(x64.a, 1.0f), null, 0L, RecyclerView.B1, n16.I(-1304512071, new l01(this.B, this.L, this.R, this.X, this.Y, 2), xq2Var), xq2Var, 1572870, 62);
                } else {
                    xq2Var.V();
                }
                return jg7Var;
            default:
                px0 px0Var2 = (px0) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                xq2 xq2Var2 = (xq2) px0Var2;
                if (xq2Var2.S(intValue2 & 1, z)) {
                    x64 x64Var = x64.a;
                    a74 c = dj6.c(x64Var, 1.0f);
                    yt0 a = wt0.a(ju.c, d90.k0, xq2Var2, 0);
                    int hashCode = Long.hashCode(xq2Var2.T);
                    xv4 l = xq2Var2.l();
                    a74 E = l.E(xq2Var2, c);
                    jx0.i.getClass();
                    iy0 iy0Var = ix0.b;
                    xq2Var2.f0();
                    if (xq2Var2.S) {
                        xq2Var2.k(iy0Var);
                    } else {
                        xq2Var2.o0();
                    }
                    pn pnVar = ix0.f;
                    yh2.K(xq2Var2, pnVar, a);
                    pn pnVar2 = ix0.e;
                    yh2.K(xq2Var2, pnVar2, l);
                    Integer valueOf = Integer.valueOf(hashCode);
                    pn pnVar3 = ix0.g;
                    yh2.K(xq2Var2, pnVar3, valueOf);
                    ne neVar = ix0.h;
                    yh2.F(xq2Var2, neVar);
                    pn pnVar4 = ix0.d;
                    yh2.K(xq2Var2, pnVar4, E);
                    a74 S = ge7.S(dj6.f(x64Var, 64.0f, RecyclerView.B1, 2), 24.0f, RecyclerView.B1, 24.0f, RecyclerView.B1, 10);
                    e34 d = h70.d(d90.Y, false);
                    int hashCode2 = Long.hashCode(xq2Var2.T);
                    xv4 l2 = xq2Var2.l();
                    a74 E2 = l.E(xq2Var2, S);
                    xq2Var2.f0();
                    if (xq2Var2.S) {
                        xq2Var2.k(iy0Var);
                    } else {
                        xq2Var2.o0();
                    }
                    yh2.K(xq2Var2, pnVar, d);
                    yh2.K(xq2Var2, pnVar2, l2);
                    i61.w(hashCode2, xq2Var2, pnVar3, xq2Var2, neVar);
                    yh2.K(xq2Var2, pnVar4, E2);
                    x37.b(this.Y, x64Var, 0L, 0L, oj2.e0, null, 0L, null, 0L, 2, false, 2, 0, null, ((xe7) xq2Var2.j(ye7.b)).f, xq2Var2, 196656, 3120, 55260);
                    xq2Var2.p(true);
                    List list = this.B;
                    boolean h = xq2Var2.h(list);
                    qn2 qn2Var = this.L;
                    boolean f = h | xq2Var2.f(qn2Var);
                    on2 on2Var2 = this.R;
                    int i2 = this.X;
                    boolean f2 = f | xq2Var2.f(on2Var2) | xq2Var2.d(i2);
                    Object P = xq2Var2.P();
                    vs0 vs0Var2 = ox0.a;
                    if (!f2 && P != vs0Var2) {
                        on2Var = on2Var2;
                        vs0Var = vs0Var2;
                    } else {
                        vs0Var = vs0Var2;
                        on2Var = on2Var2;
                        gi1 gi1Var = new gi1(list, qn2Var, on2Var, i2, 4);
                        xq2Var2.l0(gi1Var);
                        P = gi1Var;
                    }
                    on2 on2Var3 = on2Var;
                    gi2.e(null, null, null, null, null, null, false, null, (qn2) P, xq2Var2, 0, 511);
                    a74 O = ge7.O(dj6.e(dj6.c(x64Var, 1.0f), 52.0f), 8.0f);
                    l26 a2 = k26.a(ju.b, d90.i0, xq2Var2, 54);
                    int hashCode3 = Long.hashCode(xq2Var2.T);
                    xv4 l3 = xq2Var2.l();
                    a74 E3 = l.E(xq2Var2, O);
                    xq2Var2.f0();
                    if (xq2Var2.S) {
                        xq2Var2.k(iy0Var);
                    } else {
                        xq2Var2.o0();
                    }
                    yh2.K(xq2Var2, pnVar, a2);
                    yh2.K(xq2Var2, pnVar2, l3);
                    i61.w(hashCode3, xq2Var2, pnVar3, xq2Var2, neVar);
                    yh2.K(xq2Var2, pnVar4, E3);
                    boolean f3 = xq2Var2.f(on2Var3);
                    Object P2 = xq2Var2.P();
                    if (f3 || P2 == vs0Var) {
                        P2 = new x7(19, on2Var3);
                        xq2Var2.l0(P2);
                    }
                    mb3.o((on2) P2, null, false, mb3.K(xq2Var2), hv.e, xq2Var2, 805306368, 382);
                    xq2Var2.p(true);
                    xq2Var2.p(true);
                    return jg7Var;
                }
                xq2Var2.V();
                return jg7Var;
        }
    }

    public /* synthetic */ l01(List list, qn2 qn2Var, on2 on2Var, int i, String str, int i2) {
        this.A = i2;
        this.B = list;
        this.L = qn2Var;
        this.R = on2Var;
        this.X = i;
        this.Y = str;
    }
}
