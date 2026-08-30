package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import me.magnum.melonds.impl.emulator.debug.RendererDebugBridge;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: od5  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class od5 implements aj2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ k24 B;
    public final /* synthetic */ k24 L;
    public final /* synthetic */ ki2 R;
    public final /* synthetic */ aj2 X;

    public /* synthetic */ od5(k24 k24Var, k24 k24Var2, ki2 ki2Var, aj2 aj2Var, int i) {
        this.A = i;
        this.B = k24Var;
        this.L = k24Var2;
        this.R = ki2Var;
        this.X = aj2Var;
    }

    /* JADX WARN: Type inference failed for: r15v8, types: [uc7, java.lang.Object] */
    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        boolean z;
        int i = this.A;
        o27 o27Var = o27.a;
        boolean z2 = false;
        switch (i) {
            case 0:
                tu0 tu0Var = (tu0) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                sk2 sk2Var = (sk2) tu0Var;
                if (sk2Var.O(intValue & 1, z)) {
                    h20 h20Var = y60.j0;
                    lr0 a = jr0.a(rt.c, h20Var, sk2Var, 0);
                    int hashCode = Long.hashCode(sk2Var.T);
                    sm4 l = sk2Var.l();
                    wy3 wy3Var = wy3.a;
                    zy3 e0 = l07.e0(sk2Var, wy3Var);
                    nu0.i.getClass();
                    ki2 ki2Var = mu0.b;
                    sk2Var.b0();
                    if (sk2Var.S) {
                        sk2Var.k(ki2Var);
                    } else {
                        sk2Var.k0();
                    }
                    dn dnVar = mu0.f;
                    oo2.S(sk2Var, dnVar, a);
                    dn dnVar2 = mu0.e;
                    oo2.S(sk2Var, dnVar2, l);
                    Integer valueOf = Integer.valueOf(hashCode);
                    dn dnVar3 = mu0.g;
                    oo2.S(sk2Var, dnVar3, valueOf);
                    yd ydVar = mu0.h;
                    oo2.P(sk2Var, ydVar);
                    dn dnVar4 = mu0.d;
                    oo2.S(sk2Var, dnVar4, e0);
                    zy3 Z = b53.Z(o76.e(64.0f, 2, wy3Var), 24.0f, RecyclerView.A1, 2);
                    tv3 d = d50.d(y60.Y, false);
                    int hashCode2 = Long.hashCode(sk2Var.T);
                    sm4 l2 = sk2Var.l();
                    zy3 e02 = l07.e0(sk2Var, Z);
                    sk2Var.b0();
                    if (sk2Var.S) {
                        sk2Var.k(ki2Var);
                    } else {
                        sk2Var.k0();
                    }
                    oo2.S(sk2Var, dnVar, d);
                    oo2.S(sk2Var, dnVar2, l2);
                    b31.x(hashCode2, sk2Var, dnVar3, sk2Var, ydVar);
                    oo2.S(sk2Var, dnVar4, e02);
                    ir6.b(me2.X(sk2Var, R.string.login_with_retro_achievements), wy3Var, 0L, 0L, pe2.d0, null, 0L, null, 0L, 2, false, 2, 0, null, ((c17) sk2Var.j(d17.b)).f, sk2Var, 196656, 3120, 55260);
                    sk2Var.p(true);
                    zy3 Y = b53.Y(wy3Var, 24.0f, 8.0f);
                    lr0 a2 = jr0.a(new ot(4.0f, true, new i(1)), h20Var, sk2Var, 6);
                    int hashCode3 = Long.hashCode(sk2Var.T);
                    sm4 l3 = sk2Var.l();
                    zy3 e03 = l07.e0(sk2Var, Y);
                    sk2Var.b0();
                    if (sk2Var.S) {
                        sk2Var.k(ki2Var);
                    } else {
                        sk2Var.k0();
                    }
                    oo2.S(sk2Var, dnVar, a2);
                    oo2.S(sk2Var, dnVar2, l3);
                    b31.x(hashCode3, sk2Var, dnVar3, sk2Var, ydVar);
                    oo2.S(sk2Var, dnVar4, e03);
                    zy3 c = o76.c(wy3Var, 1.0f);
                    w01.a.getClass();
                    zy3 a3 = fz5.a(c, false, new yb(6, v01.b));
                    k24 k24Var = this.B;
                    String str = (String) k24Var.getValue();
                    yb1 w = pu.w(sk2Var);
                    boolean f = sk2Var.f(k24Var);
                    Object L = sk2Var.L();
                    Object obj3 = su0.a;
                    if (f || L == obj3) {
                        L = new j4(k24Var, 16);
                        sk2Var.h0(L);
                    }
                    vf4.b(str, (mi2) L, a3, false, null, jv3.d, false, null, null, null, false, 0, 0, null, w, sk2Var, 1572864, 0, 524216);
                    zy3 a4 = fz5.a(o76.c(wy3Var, 1.0f), false, new yb(6, v01.c));
                    k24 k24Var2 = this.L;
                    String str2 = (String) k24Var2.getValue();
                    ?? obj4 = new Object();
                    fb3 fb3Var = new fb3(0, 7, 0, 121);
                    yb1 w2 = pu.w(sk2Var);
                    Object L2 = sk2Var.L();
                    if (L2 == obj3) {
                        L2 = new j4(k24Var2, 17);
                        sk2Var.h0(L2);
                    }
                    vf4.b(str2, (mi2) L2, a4, false, null, jv3.e, false, obj4, fb3Var, null, false, 0, 0, null, w2, sk2Var, 1572912, RendererDebugBridge.CAPTURE_HEIGHT, 518072);
                    sk2Var.p(true);
                    zy3 X = b53.X(o76.d(o76.c(wy3Var, 1.0f), 52.0f), 8.0f);
                    sr5 a5 = rr5.a(rt.b, y60.h0, sk2Var, 54);
                    int hashCode4 = Long.hashCode(sk2Var.T);
                    sm4 l4 = sk2Var.l();
                    zy3 e04 = l07.e0(sk2Var, X);
                    sk2Var.b0();
                    if (sk2Var.S) {
                        sk2Var.k(ki2Var);
                    } else {
                        sk2Var.k0();
                    }
                    oo2.S(sk2Var, dnVar, a5);
                    oo2.S(sk2Var, dnVar2, l4);
                    b31.x(hashCode4, sk2Var, dnVar3, sk2Var, ydVar);
                    oo2.S(sk2Var, dnVar4, e04);
                    l.k(this.R, null, false, pu.x(sk2Var), jv3.f, sk2Var, 805306368, 382);
                    Object obj5 = this.X;
                    boolean f2 = sk2Var.f(obj5) | sk2Var.f(k24Var);
                    Object L3 = sk2Var.L();
                    if (f2 || L3 == obj3) {
                        L3 = new t6(obj5, k24Var, k24Var2, 17);
                        sk2Var.h0(L3);
                    }
                    l.k((ki2) L3, null, false, pu.x(sk2Var), jv3.g, sk2Var, 805306368, 382);
                    sk2Var.p(true);
                    sk2Var.p(true);
                    return o27Var;
                }
                sk2Var.R();
                return o27Var;
            default:
                tu0 tu0Var2 = (tu0) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z2 = true;
                }
                sk2 sk2Var2 = (sk2) tu0Var2;
                if (sk2Var2.O(intValue2 & 1, z2)) {
                    l07.a(o76.c(o76.l(450.0f, 1, wy3.a), 0.85f), null, 0L, ct3.H0(-722062356, new od5(this.B, this.L, this.R, this.X, 0), sk2Var2), sk2Var2, 1572870, 62);
                } else {
                    sk2Var2.R();
                }
                return o27Var;
        }
    }
}
