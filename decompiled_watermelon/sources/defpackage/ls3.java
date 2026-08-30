package defpackage;

import androidx.preference.Preference;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ls3  reason: default package */
/* loaded from: classes.dex */
public final class ls3 extends ic3 implements ki2 {
    public final /* synthetic */ int B;
    public final /* synthetic */ ms3 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ls3(ms3 ms3Var, int i) {
        super(0);
        this.B = i;
        this.L = ms3Var;
    }

    @Override // defpackage.ki2
    public final Object c() {
        hs3 W0;
        int i = this.B;
        o27 o27Var = o27.a;
        ms3 ms3Var = this.L;
        switch (i) {
            case 0:
                zf3 zf3Var = ms3Var.Y;
                zf3Var.h = 0;
                o24 y = zf3Var.a.y();
                Object[] objArr = y.A;
                int i2 = y.L;
                for (int i3 = 0; i3 < i2; i3++) {
                    ms3 ms3Var2 = ((vf3) objArr[i3]).B0.q;
                    ms3Var2.getClass();
                    ms3Var2.c0 = ms3Var2.d0;
                    ms3Var2.d0 = Preference.DEFAULT_ORDER;
                    if (ms3Var2.e0 == tf3.InLayoutBlock) {
                        ms3Var2.e0 = tf3.NotUsed;
                    }
                }
                vf3 vf3Var = zf3Var.a;
                vf3 vf3Var2 = zf3Var.a;
                o24 y2 = vf3Var.y();
                Object[] objArr2 = y2.A;
                int i4 = y2.L;
                for (int i5 = 0; i5 < i4; i5++) {
                    ms3 ms3Var3 = ((vf3) objArr2[i5]).B0.q;
                    ms3Var3.getClass();
                    ms3Var3.m0.d = false;
                }
                uz2 uz2Var = ms3Var.r().P0;
                if (uz2Var != null) {
                    boolean z = uz2Var.f0;
                    u14 u14Var = (u14) vf3Var2.n();
                    int i6 = ((o24) u14Var.B).L;
                    for (int i7 = 0; i7 < i6; i7++) {
                        hs3 W02 = ((m74) ((vf3) u14Var.get(i7)).A0.e).W0();
                        if (W02 != null) {
                            W02.f0 = z;
                        }
                    }
                }
                uz2 uz2Var2 = ms3Var.r().P0;
                uz2Var2.getClass();
                uz2Var2.G0().b();
                if (ms3Var.r().P0 != null) {
                    u14 u14Var2 = (u14) vf3Var2.n();
                    int i8 = ((o24) u14Var2.B).L;
                    for (int i9 = 0; i9 < i8; i9++) {
                        hs3 W03 = ((m74) ((vf3) u14Var2.get(i9)).A0.e).W0();
                        if (W03 != null) {
                            W03.f0 = false;
                        }
                    }
                }
                o24 y3 = vf3Var2.y();
                Object[] objArr3 = y3.A;
                int i10 = y3.L;
                for (int i11 = 0; i11 < i10; i11++) {
                    ms3 ms3Var4 = ((vf3) objArr3[i11]).B0.q;
                    ms3Var4.getClass();
                    int i12 = ms3Var4.c0;
                    int i13 = ms3Var4.d0;
                    if (i12 != i13 && i13 == Integer.MAX_VALUE) {
                        ms3Var4.t0(true);
                    }
                }
                o24 y4 = vf3Var2.y();
                Object[] objArr4 = y4.A;
                int i14 = y4.L;
                for (int i15 = 0; i15 < i14; i15++) {
                    ms3 ms3Var5 = ((vf3) objArr4[i15]).B0.q;
                    ms3Var5.getClass();
                    wf3 wf3Var = ms3Var5.m0;
                    wf3Var.e = wf3Var.d;
                }
                return o27Var;
            case 1:
                zf3 zf3Var2 = ms3Var.Y;
                xn4 xn4Var = null;
                if (!mj2.J(zf3Var2.a) && !zf3Var2.c) {
                    m74 m74Var = zf3Var2.a().n0;
                    if (m74Var != null && (W0 = m74Var.W0()) != null) {
                        xn4Var = W0.g0;
                    }
                } else {
                    m74 m74Var2 = zf3Var2.a().n0;
                    if (m74Var2 != null) {
                        xn4Var = m74Var2.g0;
                    }
                }
                if (xn4Var == null) {
                    xn4Var = ((ee) yf3.a(zf3Var2.a)).getPlacementScope();
                }
                hs3 W04 = zf3Var2.a().W0();
                W04.getClass();
                xn4.l(xn4Var, W04, ms3Var.j0);
                return o27Var;
            default:
                hs3 W05 = ms3Var.Y.a().W0();
                W05.getClass();
                W05.c(ms3Var.t0);
                return o27Var;
        }
    }
}
