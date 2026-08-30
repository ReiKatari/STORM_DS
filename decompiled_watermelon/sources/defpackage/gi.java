package defpackage;

import me.magnum.melonds.impl.emulator.debug.RendererDebugBridge;
import me.magnum.melonds.ui.settings.fragments.SoftInputBehaviourPreferencesFragmentKt;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: gi  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class gi implements aj2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ boolean B;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object R;
    public final /* synthetic */ Object X;
    public final /* synthetic */ Object Y;

    public /* synthetic */ gi(ki2 ki2Var, zy3 zy3Var, boolean z, ih4 ih4Var, bj2 bj2Var, int i) {
        this.A = 0;
        this.L = ki2Var;
        this.R = zy3Var;
        this.B = z;
        this.X = ih4Var;
        this.Y = bj2Var;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        boolean z;
        int i = this.A;
        o27 o27Var = o27.a;
        Object obj3 = this.Y;
        Object obj4 = this.L;
        Object obj5 = this.X;
        Object obj6 = this.R;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                hi.b((ki2) obj4, (zy3) obj6, this.B, (ih4) obj5, (bj2) obj3, (tu0) obj, ep2.I(196609));
                return o27Var;
            case 1:
                ((Integer) obj2).getClass();
                se.a((rg5) obj6, (String) obj5, (String) obj3, this.B, (ki2) obj4, (tu0) obj, ep2.I(1));
                return o27Var;
            case 2:
                ((Integer) obj2).getClass();
                nl2.e((nd3) obj6, this.B, (ki2) obj4, (ki2) obj5, (ki2) obj3, (tu0) obj, ep2.I(1));
                return o27Var;
            case 3:
                ((Integer) obj2).getClass();
                mh7.l((ft5) obj6, this.B, (wc2) obj5, (ki2) obj4, (ki2) obj3, (tu0) obj, ep2.I(1));
                return o27Var;
            case 4:
                String str = (String) obj4;
                pj4 pj4Var = (pj4) obj6;
                op0 op0Var = (op0) obj5;
                mi2 mi2Var = (mi2) obj3;
                tu0 tu0Var = (tu0) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                sk2 sk2Var = (sk2) tu0Var;
                if (sk2Var.O(intValue & 1, z)) {
                    ir6.b(str, null, 0L, 0L, null, null, 0L, null, 0L, 2, false, 1, 0, null, ((c17) sk2Var.j(d17.b)).i, sk2Var, 0, 3120, 55294);
                    zy3 f0 = ct3.f0(o76.c(wy3.a, 1.0f), false, null, 2);
                    float h = pj4Var.h();
                    ye6 ye6Var = ir0.a;
                    long i2 = ((hr0) sk2Var.j(ye6Var)).i();
                    long i3 = ((hr0) sk2Var.j(ye6Var)).i();
                    if (true & true) {
                        i2 = ((hr0) sk2Var.j(ir0.a)).g();
                    }
                    long j = i2;
                    ye6 ye6Var2 = ir0.a;
                    long f = ((hr0) sk2Var.j(ye6Var2)).f();
                    long j2 = ((xq0) sk2Var.j(e01.a)).a;
                    if (((hr0) sk2Var.j(ye6Var2)).k()) {
                        mh7.V(j2);
                    } else {
                        mh7.V(j2);
                    }
                    long r = mh7.r(xq0.b(0.38f, f), ((hr0) sk2Var.j(ye6Var2)).j());
                    if (true & true) {
                        i3 = ((hr0) sk2Var.j(ye6Var2)).g();
                    }
                    long b = xq0.b(0.24f, i3);
                    long b2 = xq0.b(0.32f, ((hr0) sk2Var.j(ye6Var2)).f());
                    long b3 = xq0.b(0.12f, b2);
                    long b4 = xq0.b(0.54f, ir0.b(i3, sk2Var));
                    eb1 eb1Var = new eb1(j, r, i3, b, b2, b3, b4, xq0.b(0.54f, i3), xq0.b(0.12f, b4), xq0.b(0.12f, b3));
                    boolean f2 = sk2Var.f(pj4Var);
                    Object L = sk2Var.L();
                    sn1 sn1Var = su0.a;
                    if (f2 || L == sn1Var) {
                        L = new ng3(pj4Var, 1);
                        sk2Var.h0(L);
                    }
                    mi2 mi2Var2 = (mi2) L;
                    boolean f3 = sk2Var.f(mi2Var) | sk2Var.f(pj4Var);
                    Object L2 = sk2Var.L();
                    if (f3 || L2 == sn1Var) {
                        L2 = new jd2(23, mi2Var, pj4Var);
                        sk2Var.h0(L2);
                    }
                    t86.b(h, mi2Var2, f0, this.B, op0Var, (ki2) L2, eb1Var, sk2Var, RendererDebugBridge.CAPTURE_HEIGHT);
                    return o27Var;
                }
                sk2Var.R();
                return o27Var;
            case 5:
                ((Integer) obj2).getClass();
                SoftInputBehaviourPreferencesFragmentKt.a((zy3) obj6, (String) obj5, (String) obj3, this.B, (ki2) obj4, (tu0) obj, ep2.I(7));
                return o27Var;
            default:
                ((Integer) obj2).getClass();
                jv3.i((zy3) obj6, (n6) obj5, this.B, (ki2) obj4, (mi2) obj3, (tu0) obj, ep2.I(7));
                return o27Var;
        }
    }

    public /* synthetic */ gi(nd3 nd3Var, boolean z, ki2 ki2Var, ki2 ki2Var2, ki2 ki2Var3, int i) {
        this.A = 2;
        this.R = nd3Var;
        this.B = z;
        this.L = ki2Var;
        this.X = ki2Var2;
        this.Y = ki2Var3;
    }

    public /* synthetic */ gi(zy3 zy3Var, n6 n6Var, boolean z, ki2 ki2Var, mi2 mi2Var, int i) {
        this.A = 6;
        this.R = zy3Var;
        this.X = n6Var;
        this.B = z;
        this.L = ki2Var;
        this.Y = mi2Var;
    }

    public /* synthetic */ gi(ft5 ft5Var, boolean z, wc2 wc2Var, ki2 ki2Var, ki2 ki2Var2, int i) {
        this.A = 3;
        this.R = ft5Var;
        this.B = z;
        this.X = wc2Var;
        this.L = ki2Var;
        this.Y = ki2Var2;
    }

    public /* synthetic */ gi(Object obj, String str, String str2, boolean z, ki2 ki2Var, int i, int i2) {
        this.A = i2;
        this.R = obj;
        this.X = str;
        this.Y = str2;
        this.B = z;
        this.L = ki2Var;
    }

    public /* synthetic */ gi(String str, pj4 pj4Var, boolean z, op0 op0Var, mi2 mi2Var) {
        this.A = 4;
        this.L = str;
        this.R = pj4Var;
        this.B = z;
        this.X = op0Var;
        this.Y = mi2Var;
    }
}
