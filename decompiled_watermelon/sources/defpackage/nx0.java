package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: nx0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class nx0 implements aj2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ List B;
    public final /* synthetic */ mi2 L;
    public final /* synthetic */ ki2 R;
    public final /* synthetic */ int X;
    public final /* synthetic */ String Y;

    public /* synthetic */ nx0(String str, List list, int i, mi2 mi2Var, ki2 ki2Var, int i2) {
        this.A = 0;
        this.Y = str;
        this.B = list;
        this.X = i;
        this.L = mi2Var;
        this.R = ki2Var;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        boolean z;
        sn1 sn1Var;
        ki2 ki2Var;
        int i = this.A;
        boolean z2 = false;
        o27 o27Var = o27.a;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                px0.a(this.Y, this.B, this.X, this.L, this.R, (tu0) obj, ep2.I(1));
                return o27Var;
            case 1:
                tu0 tu0Var = (tu0) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z2 = true;
                }
                sk2 sk2Var = (sk2) tu0Var;
                if (sk2Var.O(intValue & 1, z2)) {
                    l07.a(o76.c(wy3.a, 1.0f), null, 0L, ct3.H0(-1304512071, new nx0(this.B, this.L, this.R, this.X, this.Y, 2), sk2Var), sk2Var, 1572870, 62);
                } else {
                    sk2Var.R();
                }
                return o27Var;
            default:
                tu0 tu0Var2 = (tu0) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                sk2 sk2Var2 = (sk2) tu0Var2;
                if (sk2Var2.O(intValue2 & 1, z)) {
                    wy3 wy3Var = wy3.a;
                    zy3 c = o76.c(wy3Var, 1.0f);
                    lr0 a = jr0.a(rt.c, y60.j0, sk2Var2, 0);
                    int hashCode = Long.hashCode(sk2Var2.T);
                    sm4 l = sk2Var2.l();
                    zy3 e0 = l07.e0(sk2Var2, c);
                    nu0.i.getClass();
                    mv0 mv0Var = mu0.b;
                    sk2Var2.b0();
                    if (sk2Var2.S) {
                        sk2Var2.k(mv0Var);
                    } else {
                        sk2Var2.k0();
                    }
                    dn dnVar = mu0.f;
                    oo2.S(sk2Var2, dnVar, a);
                    dn dnVar2 = mu0.e;
                    oo2.S(sk2Var2, dnVar2, l);
                    Integer valueOf = Integer.valueOf(hashCode);
                    dn dnVar3 = mu0.g;
                    oo2.S(sk2Var2, dnVar3, valueOf);
                    yd ydVar = mu0.h;
                    oo2.P(sk2Var2, ydVar);
                    dn dnVar4 = mu0.d;
                    oo2.S(sk2Var2, dnVar4, e0);
                    zy3 b0 = b53.b0(o76.e(64.0f, 2, wy3Var), 24.0f, RecyclerView.A1, 24.0f, RecyclerView.A1, 10);
                    tv3 d = d50.d(y60.Y, false);
                    int hashCode2 = Long.hashCode(sk2Var2.T);
                    sm4 l2 = sk2Var2.l();
                    zy3 e02 = l07.e0(sk2Var2, b0);
                    sk2Var2.b0();
                    if (sk2Var2.S) {
                        sk2Var2.k(mv0Var);
                    } else {
                        sk2Var2.k0();
                    }
                    oo2.S(sk2Var2, dnVar, d);
                    oo2.S(sk2Var2, dnVar2, l2);
                    b31.x(hashCode2, sk2Var2, dnVar3, sk2Var2, ydVar);
                    oo2.S(sk2Var2, dnVar4, e02);
                    ir6.b(this.Y, wy3Var, 0L, 0L, pe2.d0, null, 0L, null, 0L, 2, false, 2, 0, null, ((c17) sk2Var2.j(d17.b)).f, sk2Var2, 196656, 3120, 55260);
                    sk2Var2.p(true);
                    List list = this.B;
                    boolean h = sk2Var2.h(list);
                    mi2 mi2Var = this.L;
                    boolean f = h | sk2Var2.f(mi2Var);
                    ki2 ki2Var2 = this.R;
                    int i2 = this.X;
                    boolean f2 = f | sk2Var2.f(ki2Var2) | sk2Var2.d(i2);
                    Object L = sk2Var2.L();
                    sn1 sn1Var2 = su0.a;
                    if (!f2 && L != sn1Var2) {
                        ki2Var = ki2Var2;
                        sn1Var = sn1Var2;
                    } else {
                        sn1Var = sn1Var2;
                        ki2Var = ki2Var2;
                        ce1 ce1Var = new ce1(list, mi2Var, ki2Var, i2, 4);
                        sk2Var2.h0(ce1Var);
                        L = ce1Var;
                    }
                    ki2 ki2Var3 = ki2Var;
                    io2.b(null, null, null, null, null, null, false, null, (mi2) L, sk2Var2, 0, 511);
                    zy3 X = b53.X(o76.d(o76.c(wy3Var, 1.0f), 52.0f), 8.0f);
                    sr5 a2 = rr5.a(rt.b, y60.h0, sk2Var2, 54);
                    int hashCode3 = Long.hashCode(sk2Var2.T);
                    sm4 l3 = sk2Var2.l();
                    zy3 e03 = l07.e0(sk2Var2, X);
                    sk2Var2.b0();
                    if (sk2Var2.S) {
                        sk2Var2.k(mv0Var);
                    } else {
                        sk2Var2.k0();
                    }
                    oo2.S(sk2Var2, dnVar, a2);
                    oo2.S(sk2Var2, dnVar2, l3);
                    b31.x(hashCode3, sk2Var2, dnVar3, sk2Var2, ydVar);
                    oo2.S(sk2Var2, dnVar4, e03);
                    boolean f3 = sk2Var2.f(ki2Var3);
                    Object L2 = sk2Var2.L();
                    if (f3 || L2 == sn1Var) {
                        L2 = new w7(19, ki2Var3);
                        sk2Var2.h0(L2);
                    }
                    l.k((ki2) L2, null, false, pu.x(sk2Var2), dk7.b, sk2Var2, 805306368, 382);
                    sk2Var2.p(true);
                    sk2Var2.p(true);
                    return o27Var;
                }
                sk2Var2.R();
                return o27Var;
        }
    }

    public /* synthetic */ nx0(List list, mi2 mi2Var, ki2 ki2Var, int i, String str, int i2) {
        this.A = i2;
        this.B = list;
        this.L = mi2Var;
        this.R = ki2Var;
        this.X = i;
        this.Y = str;
    }
}
