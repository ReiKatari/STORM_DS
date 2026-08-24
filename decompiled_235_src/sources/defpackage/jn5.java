package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import com.stormds.emulator.R;
import me.magnum.melonds.impl.emulator.debug.RendererDebugBridge;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: jn5  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class jn5 implements eo2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ qa4 B;
    public final /* synthetic */ qa4 L;
    public final /* synthetic */ on2 R;
    public final /* synthetic */ eo2 X;

    public /* synthetic */ jn5(qa4 qa4Var, qa4 qa4Var2, on2 on2Var, eo2 eo2Var, int i) {
        this.A = i;
        this.B = qa4Var;
        this.L = qa4Var2;
        this.R = on2Var;
        this.X = eo2Var;
    }

    /* JADX WARN: Type inference failed for: r16v4, types: [java.lang.Object, wq7] */
    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        boolean z;
        int i = this.A;
        jg7 jg7Var = jg7.a;
        boolean z2 = false;
        switch (i) {
            case 0:
                px0 px0Var = (px0) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                xq2 xq2Var = (xq2) px0Var;
                if (xq2Var.S(intValue & 1, z)) {
                    c40 c40Var = d90.k0;
                    yt0 a = wt0.a(ju.c, c40Var, xq2Var, 0);
                    int hashCode = Long.hashCode(xq2Var.T);
                    xv4 l = xq2Var.l();
                    x64 x64Var = x64.a;
                    a74 E = l.E(xq2Var, x64Var);
                    jx0.i.getClass();
                    on2 on2Var = ix0.b;
                    xq2Var.f0();
                    if (xq2Var.S) {
                        xq2Var.k(on2Var);
                    } else {
                        xq2Var.o0();
                    }
                    pn pnVar = ix0.f;
                    yh2.K(xq2Var, pnVar, a);
                    pn pnVar2 = ix0.e;
                    yh2.K(xq2Var, pnVar2, l);
                    Integer valueOf = Integer.valueOf(hashCode);
                    pn pnVar3 = ix0.g;
                    yh2.K(xq2Var, pnVar3, valueOf);
                    ne neVar = ix0.h;
                    yh2.F(xq2Var, neVar);
                    pn pnVar4 = ix0.d;
                    yh2.K(xq2Var, pnVar4, E);
                    a74 Q = ge7.Q(dj6.f(x64Var, 64.0f, RecyclerView.B1, 2), 24.0f, RecyclerView.B1, 2);
                    e34 d = h70.d(d90.Y, false);
                    int hashCode2 = Long.hashCode(xq2Var.T);
                    xv4 l2 = xq2Var.l();
                    a74 E2 = l.E(xq2Var, Q);
                    xq2Var.f0();
                    if (xq2Var.S) {
                        xq2Var.k(on2Var);
                    } else {
                        xq2Var.o0();
                    }
                    yh2.K(xq2Var, pnVar, d);
                    yh2.K(xq2Var, pnVar2, l2);
                    i61.w(hashCode2, xq2Var, pnVar3, xq2Var, neVar);
                    yh2.K(xq2Var, pnVar4, E2);
                    x37.b(yh2.O(xq2Var, R.string.login_with_retro_achievements), x64Var, 0L, 0L, oj2.e0, null, 0L, null, 0L, 2, false, 2, 0, null, ((xe7) xq2Var.j(ye7.b)).f, xq2Var, 196656, 3120, 55260);
                    xq2Var.p(true);
                    a74 P = ge7.P(x64Var, 24.0f, 8.0f);
                    yt0 a2 = wt0.a(new gu(4.0f, true, new i(1)), c40Var, xq2Var, 6);
                    int hashCode3 = Long.hashCode(xq2Var.T);
                    xv4 l3 = xq2Var.l();
                    a74 E3 = l.E(xq2Var, P);
                    xq2Var.f0();
                    if (xq2Var.S) {
                        xq2Var.k(on2Var);
                    } else {
                        xq2Var.o0();
                    }
                    yh2.K(xq2Var, pnVar, a2);
                    yh2.K(xq2Var, pnVar2, l3);
                    i61.w(hashCode3, xq2Var, pnVar3, xq2Var, neVar);
                    yh2.K(xq2Var, pnVar4, E3);
                    a74 c = dj6.c(x64Var, 1.0f);
                    d41.a.getClass();
                    a74 a3 = ua6.a(c, false, new mc(c41.b, 6));
                    qa4 qa4Var = this.B;
                    String str = (String) qa4Var.getValue();
                    xf1 J = mb3.J(xq2Var);
                    boolean f = xq2Var.f(qa4Var);
                    Object P2 = xq2Var.P();
                    Object obj3 = ox0.a;
                    if (f || P2 == obj3) {
                        P2 = new j4(qa4Var, 16);
                        xq2Var.l0(P2);
                    }
                    zo4.b(str, (qn2) P2, a3, false, null, n16.h, null, false, null, null, null, false, 0, 0, null, J, xq2Var, 1572864, 0, 524216);
                    a74 a4 = ua6.a(dj6.c(x64Var, 1.0f), false, new mc(c41.c, 6));
                    qa4 qa4Var2 = this.L;
                    String str2 = (String) qa4Var2.getValue();
                    ?? obj4 = new Object();
                    xh3 xh3Var = new xh3(0, 7, 0, 121);
                    xf1 J2 = mb3.J(xq2Var);
                    Object P3 = xq2Var.P();
                    if (P3 == obj3) {
                        P3 = new j4(qa4Var2, 17);
                        xq2Var.l0(P3);
                    }
                    zo4.b(str2, (qn2) P3, a4, false, null, n16.i, null, false, obj4, xh3Var, null, false, 0, 0, null, J2, xq2Var, 1572912, RendererDebugBridge.CAPTURE_HEIGHT, 518072);
                    xq2Var.p(true);
                    a74 O = ge7.O(dj6.e(dj6.c(x64Var, 1.0f), 52.0f), 8.0f);
                    l26 a5 = k26.a(ju.b, d90.i0, xq2Var, 54);
                    int hashCode4 = Long.hashCode(xq2Var.T);
                    xv4 l4 = xq2Var.l();
                    a74 E4 = l.E(xq2Var, O);
                    xq2Var.f0();
                    if (xq2Var.S) {
                        xq2Var.k(on2Var);
                    } else {
                        xq2Var.o0();
                    }
                    yh2.K(xq2Var, pnVar, a5);
                    yh2.K(xq2Var, pnVar2, l4);
                    i61.w(hashCode4, xq2Var, pnVar3, xq2Var, neVar);
                    yh2.K(xq2Var, pnVar4, E4);
                    mb3.o(this.R, null, false, mb3.K(xq2Var), n16.j, xq2Var, 805306368, 382);
                    Object obj5 = this.X;
                    boolean f2 = xq2Var.f(obj5) | xq2Var.f(qa4Var);
                    Object P4 = xq2Var.P();
                    if (f2 || P4 == obj3) {
                        P4 = new u6(obj5, qa4Var, qa4Var2, 17);
                        xq2Var.l0(P4);
                    }
                    mb3.o((on2) P4, null, false, mb3.K(xq2Var), n16.k, xq2Var, 805306368, 382);
                    xq2Var.p(true);
                    xq2Var.p(true);
                    return jg7Var;
                }
                xq2Var.V();
                return jg7Var;
            default:
                px0 px0Var2 = (px0) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z2 = true;
                }
                xq2 xq2Var2 = (xq2) px0Var2;
                if (xq2Var2.S(intValue2 & 1, z2)) {
                    hf.b(dj6.c(dj6.m(450.0f, 1, x64.a), 0.85f), null, 0L, RecyclerView.B1, n16.I(-722062356, new jn5(this.B, this.L, this.R, this.X, 0), xq2Var2), xq2Var2, 1572870, 62);
                } else {
                    xq2Var2.V();
                }
                return jg7Var;
        }
    }
}
