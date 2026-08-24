package defpackage;

import me.magnum.melonds.impl.emulator.debug.RendererDebugBridge;
import me.magnum.melonds.ui.settings.fragments.SoftInputBehaviourPreferencesFragmentKt;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: si  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class si implements eo2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ boolean B;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object R;
    public final /* synthetic */ Object X;
    public final /* synthetic */ Object Y;

    public /* synthetic */ si(on2 on2Var, a74 a74Var, boolean z, lq4 lq4Var, fo2 fo2Var, int i) {
        this.A = 0;
        this.L = on2Var;
        this.R = a74Var;
        this.B = z;
        this.X = lq4Var;
        this.Y = fo2Var;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        boolean z;
        int i = this.A;
        jg7 jg7Var = jg7.a;
        Object obj3 = this.Y;
        Object obj4 = this.L;
        Object obj5 = this.X;
        Object obj6 = this.R;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                ti.b((on2) obj4, (a74) obj6, this.B, (lq4) obj5, (fo2) obj3, (px0) obj, ii2.a0(196609));
                return jg7Var;
            case 1:
                ((Integer) obj2).getClass();
                hf.a((pq5) obj6, (String) obj5, (String) obj3, this.B, (on2) obj4, (px0) obj, ii2.a0(9));
                return jg7Var;
            case 2:
                String str = (String) obj4;
                rs4 rs4Var = (rs4) obj6;
                bs0 bs0Var = (bs0) obj5;
                qn2 qn2Var = (qn2) obj3;
                px0 px0Var = (px0) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                xq2 xq2Var = (xq2) px0Var;
                if (xq2Var.S(intValue & 1, z)) {
                    x37.b(str, null, 0L, 0L, null, null, 0L, null, 0L, 2, false, 1, 0, null, ((xe7) xq2Var.j(ye7.b)).i, xq2Var, 0, 3120, 55294);
                    a74 f0 = nw7.f0(dj6.c(x64.a, 1.0f), false, null, 2);
                    float h = rs4Var.h();
                    nq6 nq6Var = vt0.a;
                    cf1 r = ej2.r(((ut0) xq2Var.j(nq6Var)).i(), ((ut0) xq2Var.j(nq6Var)).i(), xq2Var, 1018);
                    boolean f = xq2Var.f(rs4Var);
                    Object P = xq2Var.P();
                    vs0 vs0Var = ox0.a;
                    if (f || P == vs0Var) {
                        P = new kn3(rs4Var, 1);
                        xq2Var.l0(P);
                    }
                    qn2 qn2Var2 = (qn2) P;
                    boolean f2 = xq2Var.f(qn2Var) | xq2Var.f(rs4Var);
                    Object P2 = xq2Var.P();
                    if (f2 || P2 == vs0Var) {
                        P2 = new ci2(26, qn2Var, rs4Var);
                        xq2Var.l0(P2);
                    }
                    jk6.b(h, qn2Var2, f0, this.B, bs0Var, 0, (on2) P2, r, xq2Var, RendererDebugBridge.CAPTURE_HEIGHT, 160);
                } else {
                    xq2Var.V();
                }
                return jg7Var;
            case 3:
                ((Integer) obj2).getClass();
                SoftInputBehaviourPreferencesFragmentKt.a((a74) obj6, (String) obj5, (String) obj3, this.B, (on2) obj4, (px0) obj, ii2.a0(7));
                return jg7Var;
            default:
                ((Integer) obj2).getClass();
                l.f((a74) obj6, (o6) obj5, this.B, (on2) obj4, (qn2) obj3, (px0) obj, ii2.a0(7));
                return jg7Var;
        }
    }

    public /* synthetic */ si(a74 a74Var, o6 o6Var, boolean z, on2 on2Var, qn2 qn2Var, int i) {
        this.A = 4;
        this.R = a74Var;
        this.X = o6Var;
        this.B = z;
        this.L = on2Var;
        this.Y = qn2Var;
    }

    public /* synthetic */ si(Object obj, String str, String str2, boolean z, on2 on2Var, int i, int i2) {
        this.A = i2;
        this.R = obj;
        this.X = str;
        this.Y = str2;
        this.B = z;
        this.L = on2Var;
    }

    public /* synthetic */ si(String str, rs4 rs4Var, boolean z, bs0 bs0Var, qn2 qn2Var) {
        this.A = 2;
        this.L = str;
        this.R = rs4Var;
        this.B = z;
        this.X = bs0Var;
        this.Y = qn2Var;
    }
}
