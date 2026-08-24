package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: c34  reason: default package */
/* loaded from: classes.dex */
public final class c34 extends aj3 implements on2 {
    public final /* synthetic */ int B;
    public final /* synthetic */ d34 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c34(d34 d34Var, int i) {
        super(0);
        this.B = i;
        this.L = d34Var;
    }

    @Override // defpackage.on2
    public final Object c() {
        cx4 placementScope;
        int i = this.B;
        jg7 jg7Var = jg7.a;
        d34 d34Var = this.L;
        switch (i) {
            case 0:
                wm3 wm3Var = d34Var.Y;
                wm3Var.i = 0;
                ua4 z = wm3Var.a.z();
                Object[] objArr = z.A;
                int i2 = z.L;
                for (int i3 = 0; i3 < i2; i3++) {
                    d34 d34Var2 = ((sm3) objArr[i3]).C0.p;
                    d34Var2.d0 = d34Var2.e0;
                    d34Var2.e0 = Integer.MAX_VALUE;
                    d34Var2.p0 = false;
                    if (d34Var2.h0 == qm3.InLayoutBlock) {
                        d34Var2.h0 = qm3.NotUsed;
                    }
                }
                sm3 sm3Var = wm3Var.a;
                sm3 sm3Var2 = wm3Var.a;
                ua4 z2 = sm3Var.z();
                Object[] objArr2 = z2.A;
                int i4 = z2.L;
                for (int i5 = 0; i5 < i4; i5++) {
                    ((sm3) objArr2[i5]).C0.p.t0.d = false;
                }
                if (d34Var.f().g0) {
                    aa4 aa4Var = (aa4) sm3Var2.n();
                    int i6 = ((ua4) aa4Var.B).L;
                    for (int i7 = 0; i7 < i6; i7++) {
                        ((eg4) ((sm3) aa4Var.get(i7)).B0.e).g0 = true;
                    }
                }
                d34Var.f().G0().a();
                if (d34Var.f().g0) {
                    aa4 aa4Var2 = (aa4) sm3Var2.n();
                    int i8 = ((ua4) aa4Var2.B).L;
                    for (int i9 = 0; i9 < i8; i9++) {
                        ((eg4) ((sm3) aa4Var2.get(i9)).B0.e).g0 = false;
                    }
                }
                ua4 z3 = sm3Var2.z();
                Object[] objArr3 = z3.A;
                int i10 = z3.L;
                for (int i11 = 0; i11 < i10; i11++) {
                    sm3 sm3Var3 = (sm3) objArr3[i11];
                    wm3 wm3Var2 = sm3Var3.C0;
                    if (wm3Var2.p.d0 != sm3Var3.w()) {
                        sm3Var2.O();
                        sm3Var2.C();
                        if (sm3Var3.w() == Integer.MAX_VALUE) {
                            if (wm3Var2.c || bl2.J(sm3Var3)) {
                                rz3 rz3Var = wm3Var2.q;
                                rz3Var.getClass();
                                rz3Var.u0(false);
                            }
                            wm3Var2.p.w0();
                        }
                    }
                }
                ua4 z4 = sm3Var2.z();
                Object[] objArr4 = z4.A;
                int i12 = z4.L;
                for (int i13 = 0; i13 < i12; i13++) {
                    tm3 tm3Var = ((sm3) objArr4[i13]).C0.p.t0;
                    tm3Var.e = tm3Var.d;
                }
                return jg7Var;
            case 1:
                d34Var.Y.a().y(d34Var.x0);
                return jg7Var;
            default:
                wm3 wm3Var3 = d34Var.Y;
                eg4 eg4Var = wm3Var3.a().o0;
                if (eg4Var == null || (placementScope = eg4Var.h0) == null) {
                    placementScope = ((te) vm3.a(wm3Var3.a)).getPlacementScope();
                }
                qn2 qn2Var = d34Var.C0;
                if (qn2Var == null) {
                    eg4 a = wm3Var3.a();
                    long j = d34Var.D0;
                    float f = d34Var.E0;
                    placementScope.getClass();
                    cx4.b(placementScope, a);
                    a.h0(i93.c(j, a.X), f, null);
                } else {
                    eg4 a2 = wm3Var3.a();
                    long j2 = d34Var.D0;
                    float f2 = d34Var.E0;
                    placementScope.getClass();
                    cx4.b(placementScope, a2);
                    a2.h0(i93.c(j2, a2.X), f2, qn2Var);
                }
                return jg7Var;
        }
    }
}
