package defpackage;

import android.view.View;
import android.view.ViewParent;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: a4  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class a4 implements aj2 {
    public final /* synthetic */ int A = 0;
    public final /* synthetic */ ct1 B;
    public final /* synthetic */ ki2 L;
    public final /* synthetic */ mi2 R;

    public /* synthetic */ a4(ct1 ct1Var, ki2 ki2Var, mi2 mi2Var) {
        this.B = ct1Var;
        this.L = ki2Var;
        this.R = mi2Var;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        boolean z;
        int i = this.A;
        o27 o27Var = o27.a;
        tu0 tu0Var = (tu0) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                int intValue = num.intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                sk2 sk2Var = (sk2) tu0Var;
                if (sk2Var.O(intValue & 1, z)) {
                    ViewParent parent = ((View) sk2Var.j(ue.f)).getParent();
                    parent.getClass();
                    ((cf1) parent).h0.setDimAmount(0.8f);
                    ct1 ct1Var = this.B;
                    k24 m = me2.m((ce6) ct1Var.e.getValue(), sk2Var);
                    Object L = sk2Var.L();
                    Object obj3 = su0.a;
                    if (L == obj3) {
                        L = me2.G(null);
                        sk2Var.h0(L);
                    }
                    k24 k24Var = (k24) L;
                    boolean h = sk2Var.h(ct1Var);
                    Object L2 = sk2Var.L();
                    if (h || L2 == obj3) {
                        L2 = new x3(ct1Var, (j11) null, 1);
                        sk2Var.h0(L2);
                    }
                    l.g(sk2Var, (aj2) L2, o27Var);
                    mj2.b(true, ct3.H0(814039041, new b4(this.L, ct1Var, this.R, m, k24Var, 0), sk2Var), sk2Var, 54, 0);
                } else {
                    sk2Var.R();
                }
                return o27Var;
            default:
                num.getClass();
                n40.b(this.B, this.L, this.R, tu0Var, ep2.I(1));
                return o27Var;
        }
    }

    public /* synthetic */ a4(ct1 ct1Var, ki2 ki2Var, mi2 mi2Var, int i) {
        this.B = ct1Var;
        this.L = ki2Var;
        this.R = mi2Var;
    }
}
