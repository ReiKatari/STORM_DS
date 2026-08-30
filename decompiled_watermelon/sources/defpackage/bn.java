package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: bn  reason: default package */
/* loaded from: classes.dex */
public final class bn extends ic3 implements aj2 {
    public final /* synthetic */ int B = 0;
    public final /* synthetic */ et0 L;
    public final /* synthetic */ Object R;
    public final /* synthetic */ Object X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ Object Z;
    public final /* synthetic */ Object c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bn(n24 n24Var, zy3 zy3Var, z02 z02Var, h32 h32Var, String str, et0 et0Var, int i) {
        super(2);
        this.R = n24Var;
        this.X = zy3Var;
        this.Y = z02Var;
        this.Z = h32Var;
        this.c0 = str;
        this.L = et0Var;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        boolean z;
        Object obj3;
        int i = this.B;
        o27 o27Var = o27.a;
        Object obj4 = this.c0;
        Object obj5 = this.Z;
        Object obj6 = this.Y;
        Object obj7 = this.R;
        switch (i) {
            case 0:
                tu0 tu0Var = (tu0) obj;
                int intValue = ((Number) obj2).intValue();
                mi2 mi2Var = (mi2) obj6;
                mn mnVar = (mn) obj5;
                kx6 kx6Var = (kx6) obj7;
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                sk2 sk2Var = (sk2) tu0Var;
                if (sk2Var.O(intValue & 1, z)) {
                    Object L = sk2Var.L();
                    Object obj8 = su0.a;
                    if (L == obj8) {
                        L = (u01) mi2Var.n(mnVar);
                        sk2Var.h0(L);
                    }
                    u01 u01Var = (u01) L;
                    ex6 f = kx6Var.f();
                    tj4 tj4Var = kx6Var.d;
                    Object c = f.c();
                    Object obj9 = this.X;
                    boolean g = sk2Var.g(b53.x(c, obj9));
                    Object L2 = sk2Var.L();
                    if (g || L2 == obj8) {
                        if (b53.x(kx6Var.f().c(), obj9)) {
                            obj3 = h32.b;
                        } else {
                            obj3 = ((u01) mi2Var.n(mnVar)).b;
                        }
                        L2 = obj3;
                        sk2Var.h0(L2);
                    }
                    h32 h32Var = (h32) L2;
                    Object L3 = sk2Var.L();
                    if (L3 == obj8) {
                        L3 = new hn(b53.x(obj9, tj4Var.getValue()));
                        sk2Var.h0(L3);
                    }
                    hn hnVar = (hn) L3;
                    z02 z02Var = u01Var.a;
                    boolean h = sk2Var.h(u01Var);
                    Object L4 = sk2Var.L();
                    if (h || L4 == obj8) {
                        L4 = new i56(1, u01Var);
                        sk2Var.h0(L4);
                    }
                    zy3 U = b53.U(wy3.a, (bj2) L4);
                    hnVar.a.setValue(Boolean.valueOf(b53.x(obj9, tj4Var.getValue())));
                    zy3 f2 = U.f(hnVar);
                    kx6 kx6Var2 = (kx6) obj7;
                    boolean h2 = sk2Var.h(obj9);
                    Object L5 = sk2Var.L();
                    if (h2 || L5 == obj8) {
                        L5 = new yb(5, obj9);
                        sk2Var.h0(L5);
                    }
                    mi2 mi2Var2 = (mi2) L5;
                    boolean f3 = sk2Var.f(h32Var);
                    Object L6 = sk2Var.L();
                    if (f3 || L6 == obj8) {
                        L6 = new n0(2, h32Var);
                        sk2Var.h0(L6);
                    }
                    ct3.d(kx6Var2, mi2Var2, f2, z02Var, h32Var, (aj2) L6, ct3.H0(-143346359, new an((xa6) obj4, obj9, mnVar, this.L, 0), sk2Var), sk2Var, 12582912);
                } else {
                    sk2Var.R();
                }
                return o27Var;
            default:
                ((Number) obj2).intValue();
                ct3.k((n24) obj7, (zy3) this.X, (z02) obj6, (h32) obj5, (String) obj4, this.L, (tu0) obj, ep2.I(199681));
                return o27Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bn(kx6 kx6Var, Object obj, mi2 mi2Var, mn mnVar, xa6 xa6Var, et0 et0Var) {
        super(2);
        this.R = kx6Var;
        this.X = obj;
        this.Y = mi2Var;
        this.Z = mnVar;
        this.c0 = xa6Var;
        this.L = et0Var;
    }
}
