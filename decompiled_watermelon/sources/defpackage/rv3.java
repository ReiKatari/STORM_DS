package defpackage;

import androidx.preference.Preference;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: rv3  reason: default package */
/* loaded from: classes.dex */
public final class rv3 extends ic3 implements ki2 {
    public final /* synthetic */ int B;
    public final /* synthetic */ sv3 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rv3(sv3 sv3Var, int i) {
        super(0);
        this.B = i;
        this.L = sv3Var;
    }

    @Override // defpackage.ki2
    public final Object c() {
        xn4 placementScope;
        int i = this.B;
        o27 o27Var = o27.a;
        sv3 sv3Var = this.L;
        switch (i) {
            case 0:
                zf3 zf3Var = sv3Var.Y;
                zf3Var.i = 0;
                o24 y = zf3Var.a.y();
                Object[] objArr = y.A;
                int i2 = y.L;
                for (int i3 = 0; i3 < i2; i3++) {
                    sv3 sv3Var2 = ((vf3) objArr[i3]).B0.p;
                    sv3Var2.c0 = sv3Var2.d0;
                    sv3Var2.d0 = Preference.DEFAULT_ORDER;
                    sv3Var2.o0 = false;
                    if (sv3Var2.g0 == tf3.InLayoutBlock) {
                        sv3Var2.g0 = tf3.NotUsed;
                    }
                }
                vf3 vf3Var = zf3Var.a;
                vf3 vf3Var2 = zf3Var.a;
                o24 y2 = vf3Var.y();
                Object[] objArr2 = y2.A;
                int i4 = y2.L;
                for (int i5 = 0; i5 < i4; i5++) {
                    ((vf3) objArr2[i5]).B0.p.s0.d = false;
                }
                if (sv3Var.r().f0) {
                    u14 u14Var = (u14) vf3Var2.n();
                    int i6 = ((o24) u14Var.B).L;
                    for (int i7 = 0; i7 < i6; i7++) {
                        ((m74) ((vf3) u14Var.get(i7)).A0.e).f0 = true;
                    }
                }
                sv3Var.r().G0().b();
                if (sv3Var.r().f0) {
                    u14 u14Var2 = (u14) vf3Var2.n();
                    int i8 = ((o24) u14Var2.B).L;
                    for (int i9 = 0; i9 < i8; i9++) {
                        ((m74) ((vf3) u14Var2.get(i9)).A0.e).f0 = false;
                    }
                }
                o24 y3 = vf3Var2.y();
                Object[] objArr3 = y3.A;
                int i10 = y3.L;
                for (int i11 = 0; i11 < i10; i11++) {
                    vf3 vf3Var3 = (vf3) objArr3[i11];
                    zf3 zf3Var2 = vf3Var3.B0;
                    if (zf3Var2.p.c0 != vf3Var3.v()) {
                        vf3Var2.O();
                        vf3Var2.B();
                        if (vf3Var3.v() == Integer.MAX_VALUE) {
                            if (zf3Var2.c || mj2.J(vf3Var3)) {
                                ms3 ms3Var = zf3Var2.q;
                                ms3Var.getClass();
                                ms3Var.t0(false);
                            }
                            zf3Var2.p.w0();
                        }
                    }
                }
                o24 y4 = vf3Var2.y();
                Object[] objArr4 = y4.A;
                int i12 = y4.L;
                for (int i13 = 0; i13 < i12; i13++) {
                    wf3 wf3Var = ((vf3) objArr4[i13]).B0.p.s0;
                    wf3Var.e = wf3Var.d;
                }
                return o27Var;
            case 1:
                sv3Var.Y.a().c(sv3Var.w0);
                return o27Var;
            default:
                zf3 zf3Var3 = sv3Var.Y;
                m74 m74Var = zf3Var3.a().n0;
                if (m74Var == null || (placementScope = m74Var.g0) == null) {
                    placementScope = ((ee) yf3.a(zf3Var3.a)).getPlacementScope();
                }
                mi2 mi2Var = sv3Var.B0;
                if (mi2Var == null) {
                    m74 a = zf3Var3.a();
                    long j = sv3Var.C0;
                    float f = sv3Var.D0;
                    placementScope.getClass();
                    xn4.a(placementScope, a);
                    a.o0(a33.c(j, a.X), f, null);
                } else {
                    m74 a2 = zf3Var3.a();
                    long j2 = sv3Var.C0;
                    float f2 = sv3Var.D0;
                    placementScope.getClass();
                    xn4.a(placementScope, a2);
                    a2.o0(a33.c(j2, a2.X), f2, mi2Var);
                }
                return o27Var;
        }
    }
}
