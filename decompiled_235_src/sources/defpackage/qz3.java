package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qz3  reason: default package */
/* loaded from: classes.dex */
public final class qz3 extends aj3 implements on2 {
    public final /* synthetic */ int B;
    public final /* synthetic */ rz3 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qz3(rz3 rz3Var, int i) {
        super(0);
        this.B = i;
        this.L = rz3Var;
    }

    @Override // defpackage.on2
    public final Object c() {
        mz3 W0;
        int i = this.B;
        jg7 jg7Var = jg7.a;
        rz3 rz3Var = this.L;
        switch (i) {
            case 0:
                wm3 wm3Var = rz3Var.Y;
                wm3Var.h = 0;
                ua4 z = wm3Var.a.z();
                Object[] objArr = z.A;
                int i2 = z.L;
                for (int i3 = 0; i3 < i2; i3++) {
                    rz3 rz3Var2 = ((sm3) objArr[i3]).C0.q;
                    rz3Var2.getClass();
                    rz3Var2.d0 = rz3Var2.e0;
                    rz3Var2.e0 = Integer.MAX_VALUE;
                    if (rz3Var2.f0 == qm3.InLayoutBlock) {
                        rz3Var2.f0 = qm3.NotUsed;
                    }
                }
                sm3 sm3Var = wm3Var.a;
                sm3 sm3Var2 = wm3Var.a;
                ua4 z2 = sm3Var.z();
                Object[] objArr2 = z2.A;
                int i4 = z2.L;
                for (int i5 = 0; i5 < i4; i5++) {
                    rz3 rz3Var3 = ((sm3) objArr2[i5]).C0.q;
                    rz3Var3.getClass();
                    rz3Var3.n0.d = false;
                }
                x53 x53Var = rz3Var.f().Q0;
                if (x53Var != null) {
                    boolean z3 = x53Var.g0;
                    aa4 aa4Var = (aa4) sm3Var2.n();
                    int i6 = ((ua4) aa4Var.B).L;
                    for (int i7 = 0; i7 < i6; i7++) {
                        mz3 W02 = ((eg4) ((sm3) aa4Var.get(i7)).B0.e).W0();
                        if (W02 != null) {
                            W02.g0 = z3;
                        }
                    }
                }
                x53 x53Var2 = rz3Var.f().Q0;
                x53Var2.getClass();
                x53Var2.G0().a();
                if (rz3Var.f().Q0 != null) {
                    aa4 aa4Var2 = (aa4) sm3Var2.n();
                    int i8 = ((ua4) aa4Var2.B).L;
                    for (int i9 = 0; i9 < i8; i9++) {
                        mz3 W03 = ((eg4) ((sm3) aa4Var2.get(i9)).B0.e).W0();
                        if (W03 != null) {
                            W03.g0 = false;
                        }
                    }
                }
                ua4 z4 = sm3Var2.z();
                Object[] objArr3 = z4.A;
                int i10 = z4.L;
                for (int i11 = 0; i11 < i10; i11++) {
                    rz3 rz3Var4 = ((sm3) objArr3[i11]).C0.q;
                    rz3Var4.getClass();
                    int i12 = rz3Var4.d0;
                    int i13 = rz3Var4.e0;
                    if (i12 != i13 && i13 == Integer.MAX_VALUE) {
                        rz3Var4.u0(true);
                    }
                }
                ua4 z5 = sm3Var2.z();
                Object[] objArr4 = z5.A;
                int i14 = z5.L;
                for (int i15 = 0; i15 < i14; i15++) {
                    rz3 rz3Var5 = ((sm3) objArr4[i15]).C0.q;
                    rz3Var5.getClass();
                    tm3 tm3Var = rz3Var5.n0;
                    tm3Var.e = tm3Var.d;
                }
                return jg7Var;
            case 1:
                wm3 wm3Var2 = rz3Var.Y;
                cx4 cx4Var = null;
                if (!bl2.J(wm3Var2.a) && !wm3Var2.c) {
                    eg4 eg4Var = wm3Var2.a().o0;
                    if (eg4Var != null && (W0 = eg4Var.W0()) != null) {
                        cx4Var = W0.h0;
                    }
                } else {
                    eg4 eg4Var2 = wm3Var2.a().o0;
                    if (eg4Var2 != null) {
                        cx4Var = eg4Var2.h0;
                    }
                }
                if (cx4Var == null) {
                    cx4Var = ((te) vm3.a(wm3Var2.a)).getPlacementScope();
                }
                mz3 W04 = wm3Var2.a().W0();
                W04.getClass();
                cx4.k(cx4Var, W04, rz3Var.k0);
                return jg7Var;
            default:
                mz3 W05 = rz3Var.Y.a().W0();
                W05.getClass();
                W05.y(rz3Var.u0);
                return jg7Var;
        }
    }
}
