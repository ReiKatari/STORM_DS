package defpackage;

import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: h7  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class h7 implements aj2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ long B;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object R;

    public /* synthetic */ h7(long j, p96 p96Var, String str) {
        this.A = 3;
        this.B = j;
        this.L = p96Var;
        this.R = str;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        boolean z;
        int i = this.A;
        o27 o27Var = o27.a;
        Object obj3 = this.R;
        Object obj4 = this.L;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                b53.a((List) obj4, this.B, (mi2) obj3, (tu0) obj, ep2.I(1));
                return o27Var;
            case 1:
                ((Integer) obj2).getClass();
                ff.a((rb4) obj4, (zy3) obj3, this.B, (tu0) obj, ep2.I(1));
                return o27Var;
            case 2:
                ((Integer) obj2).getClass();
                bx4.a((ex4) obj4, this.B, (zy3) obj3, (tu0) obj, ep2.I(385));
                return o27Var;
            default:
                p96 p96Var = (p96) obj4;
                String str = (String) obj3;
                tu0 tu0Var = (tu0) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                sk2 sk2Var = (sk2) tu0Var;
                if (sk2Var.O(intValue & 1, z)) {
                    f91 a = e70.a(this.B, sk2Var, 5);
                    boolean h = sk2Var.h(p96Var);
                    Object L = sk2Var.L();
                    if (h || L == su0.a) {
                        L = new n96(p96Var, 1);
                        sk2Var.h0(L);
                    }
                    l.k((ki2) L, null, false, a, ct3.H0(-929149933, new n00(str, 1), sk2Var), sk2Var, 805306368, 382);
                } else {
                    sk2Var.R();
                }
                return o27Var;
        }
    }

    public /* synthetic */ h7(rb4 rb4Var, zy3 zy3Var, long j, int i) {
        this.A = 1;
        this.L = rb4Var;
        this.R = zy3Var;
        this.B = j;
    }

    public /* synthetic */ h7(Object obj, long j, Object obj2, int i, int i2) {
        this.A = i2;
        this.L = obj;
        this.B = j;
        this.R = obj2;
    }
}
