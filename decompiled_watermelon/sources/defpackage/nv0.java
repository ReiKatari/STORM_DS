package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: nv0  reason: default package */
/* loaded from: classes.dex */
public final class nv0 extends ic3 implements aj2 {
    public final /* synthetic */ int B = 1;
    public final /* synthetic */ aj2 L;
    public final /* synthetic */ Object R;
    public final /* synthetic */ Object X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nv0(wg4 wg4Var, jm jmVar, aj2 aj2Var, int i) {
        super(2);
        this.R = wg4Var;
        this.X = jmVar;
        this.L = aj2Var;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        boolean z;
        int i = this.B;
        o27 o27Var = o27.a;
        aj2 aj2Var = this.L;
        Object obj3 = this.X;
        Object obj4 = this.R;
        switch (i) {
            case 0:
                ((Number) obj2).intValue();
                ov0.a((wg4) obj4, (jm) obj3, aj2Var, (tu0) obj, ep2.I(1));
                return o27Var;
            default:
                tu0 tu0Var = (tu0) obj;
                int intValue = ((Number) obj2).intValue();
                aj7 aj7Var = (aj7) obj4;
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                sk2 sk2Var = (sk2) tu0Var;
                if (sk2Var.O(intValue & 1, z)) {
                    ee eeVar = aj7Var.A;
                    boolean h = sk2Var.h(aj7Var);
                    Object L = sk2Var.L();
                    sn1 sn1Var = su0.a;
                    if (h || L == sn1Var) {
                        L = new zi7(aj7Var, null, 0);
                        sk2Var.h0(L);
                    }
                    l.g(sk2Var, (aj2) L, eeVar);
                    boolean h2 = sk2Var.h(aj7Var);
                    Object L2 = sk2Var.L();
                    if (h2 || L2 == sn1Var) {
                        L2 = new zi7(aj7Var, null, 1);
                        sk2Var.h0(L2);
                    }
                    l.g(sk2Var, (aj2) L2, eeVar);
                    ((qu0) obj3).a(eeVar, aj2Var, sk2Var, 0);
                } else {
                    sk2Var.R();
                }
                return o27Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nv0(aj7 aj7Var, qu0 qu0Var, aj2 aj2Var) {
        super(2);
        this.R = aj7Var;
        this.X = qu0Var;
        this.L = aj2Var;
    }
}
