package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: i56  reason: default package */
/* loaded from: classes.dex */
public final class i56 extends ic3 implements bj2 {
    public final /* synthetic */ int B;
    public final /* synthetic */ Object L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i56(int i, Object obj) {
        super(3);
        this.B = i;
        this.L = obj;
    }

    @Override // defpackage.bj2
    public final Object i(Object obj, Object obj2, Object obj3) {
        int i = this.B;
        Object obj4 = this.L;
        switch (i) {
            case 0:
                ns3 ns3Var = (ns3) obj;
                ((Number) obj3).intValue();
                sk2 sk2Var = (sk2) ((tu0) obj2);
                Object L = sk2Var.L();
                sn1 sn1Var = su0.a;
                if (L == sn1Var) {
                    L = l.A(sk2Var);
                    sk2Var.h0(L);
                }
                o31 o31Var = (o31) L;
                Object L2 = sk2Var.L();
                if (L2 == sn1Var) {
                    L2 = new g56(ns3Var, o31Var);
                    sk2Var.h0(L2);
                }
                g56 g56Var = (g56) L2;
                ((et0) obj4).q(g56Var, new k56(g56Var), sk2Var, 6);
                return o27.a;
            default:
                yn4 c = ((mv3) obj2).c(((lz0) obj3).a);
                return ((vv3) obj).s0(c.A, c.B, qp1.A, new ej(5, c, (u01) obj4));
        }
    }
}
