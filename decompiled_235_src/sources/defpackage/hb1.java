package defpackage;

import android.content.Context;
import android.util.Log;
import androidx.camera.camera2.compat.quirk.ConfigureSurfaceToSecondarySessionFailQuirk;
import androidx.camera.camera2.compat.quirk.PreviewOrientationIncorrectQuirk;
import androidx.camera.camera2.compat.quirk.TextureViewIsClosedQuirk;
import androidx.camera.camera2.compat.quirk.UseTorchAsFlashQuirk;
import me.magnum.melonds.database.MelonDatabase;
import me.magnum.melonds.ui.inputsetup.b;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hb1  reason: default package */
/* loaded from: classes.dex */
public final class hb1 implements m55 {
    public final /* synthetic */ int a;
    public final int b;
    public final Object c;
    public final Object d;
    public final Object e;

    public /* synthetic */ hb1(Object obj, Object obj2, Object obj3, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = i;
    }

    @Override // defpackage.n55
    public final Object get() {
        pj7 pj7Var;
        c43 yc1Var;
        Object la1Var;
        int i = this.a;
        int i2 = this.b;
        Object obj = this.c;
        Object obj2 = this.e;
        Object obj3 = this.d;
        switch (i) {
            case 0:
                eb1 eb1Var = (eb1) obj;
                ib1 ib1Var = (ib1) obj2;
                gb1 gb1Var = (gb1) obj3;
                switch (i2) {
                    case 0:
                        ej7 ej7Var = (ej7) ib1Var.b.get();
                        kj7 kj7Var = (kj7) gb1Var.k.get();
                        if (ib1Var.c.get() == null) {
                            return new ii7(ej7Var, kj7Var, (li7) ib1Var.l.get(), ib1Var.j, ib1Var.i, ib1Var.h);
                        }
                        u34.a();
                        return null;
                    case 1:
                        fi7 fi7Var = ib1Var.a;
                        sh0 sh0Var = (sh0) gb1Var.y.get();
                        fi7Var.getClass();
                        sh0Var.getClass();
                        if (kj2.F("CXCP")) {
                            Log.d("CXCP", "Prepared UseCaseGraphContext (Deferred)");
                        }
                        return new ej7(new ei7(fi7Var, 0), sh0Var, fi7Var.b, new ei7(fi7Var, 1));
                    case 2:
                        ib1Var.a.getClass();
                        return null;
                    case 3:
                        return new qg1(ib1Var.k, (kj7) gb1Var.k.get());
                    case 4:
                        return new ri7(ib1Var.h, ib1Var.e, (ej7) ib1Var.b.get(), ib1Var.j, (kj7) gb1Var.k.get(), (ij0) eb1Var.a.Z);
                    case 5:
                        m55 m55Var = ib1Var.f;
                        m55 m55Var2 = ib1Var.g;
                        m55Var.getClass();
                        m55Var2.getClass();
                        if (ok0.c) {
                            Object obj4 = m55Var2.get();
                            obj4.getClass();
                            return (kk0) obj4;
                        }
                        Object obj5 = m55Var.get();
                        obj5.getClass();
                        return (kk0) obj5;
                    case 6:
                        fk0 fk0Var = (fk0) ib1Var.d.get();
                        od2 od2Var = (od2) gb1Var.r.get();
                        r87 r87Var = (r87) gb1Var.q.get();
                        ln7 ln7Var = (ln7) gb1Var.u.get();
                        kj7 kj7Var2 = (kj7) gb1Var.k.get();
                        ou0 ou0Var = (ou0) gb1Var.m.get();
                        jh0 jh0Var = (jh0) gb1Var.j.get();
                        cf0 a = gb1Var.c.a();
                        lb3 lb3Var = (lb3) gb1Var.E.get();
                        jh0Var.getClass();
                        lb3Var.getClass();
                        if (jh0Var.a().a(UseTorchAsFlashQuirk.class)) {
                            pj7Var = new j97(jh0Var, a, lb3Var);
                        } else {
                            pj7Var = vs0.l0;
                        }
                        return new nk0(fk0Var, od2Var, r87Var, ln7Var, kj7Var2, ou0Var, pj7Var, (sg0) gb1Var.e.get(), ib1Var.e, (ej7) ib1Var.b.get());
                    case 7:
                        sg0 sg0Var = (sg0) gb1Var.e.get();
                        gb1Var.a();
                        sg0Var.getClass();
                        ((ej7) ib1Var.b.get()).getClass();
                        ((sy7) gb1Var.f.get()).getClass();
                        ((kj7) gb1Var.k.get()).getClass();
                        Object obj6 = new Object();
                        kg0 kg0Var = lg0.g;
                        lg0 lg0Var = sg0Var.b;
                        kg0Var.getClass();
                        kg0.c(lg0Var);
                        return obj6;
                    case 8:
                        return new wi7((ej7) ib1Var.b.get(), gb1Var.a());
                    case 9:
                        return new ok0((sg0) gb1Var.e.get(), ib1Var.f, (kj7) gb1Var.k.get(), (r87) gb1Var.q.get());
                    case 10:
                        kj7 kj7Var3 = (kj7) gb1Var.k.get();
                        tg0 tg0Var = (tg0) eb1Var.a.R;
                        mp2.o(tg0Var);
                        jh0 jh0Var2 = (jh0) gb1Var.j.get();
                        jh0Var2.getClass();
                        y65 a2 = jh0Var2.a();
                        if (!a2.a(ConfigureSurfaceToSecondarySessionFailQuirk.class) && !a2.a(PreviewOrientationIncorrectQuirk.class) && !a2.a(TextureViewIsClosedQuirk.class)) {
                            yc1Var = xd5.i0;
                        } else {
                            yc1Var = new yc1(23);
                        }
                        return new jj7(kj7Var3, tg0Var, yc1Var, (tc6) ib1Var.i.get());
                    case 11:
                        return ib1Var.a.c;
                    default:
                        throw new AssertionError(i2);
                }
            default:
                pb1 pb1Var = (pb1) obj3;
                ub1 ub1Var = (ub1) obj2;
                sb1 sb1Var = (sb1) obj;
                switch (i2) {
                    case 0:
                        return new v10((ha3) sb1Var.S.get(), (wh7) sb1Var.P.get(), ub1Var.a);
                    case 1:
                        return new gp0((hp0) sb1Var.f.get());
                    case 2:
                        return new aq0((hp0) sb1Var.f.get(), ub1Var.a);
                    case 3:
                        return new k81((fb2) sb1Var.T.get());
                    case 4:
                        la1Var = new la1((fg) sb1Var.W.get(), (kd6) sb1Var.s.get(), (fb2) sb1Var.T.get(), (db1) sb1Var.V.get(), (p06) sb1Var.x.get());
                        break;
                    case 5:
                        return new xa1((p06) sb1Var.x.get(), (kd6) sb1Var.s.get(), (kx5) sb1Var.v.get());
                    case 6:
                        Context context = sb1Var.a.a;
                        fb2 fb2Var = (fb2) sb1Var.T.get();
                        mp mpVar = (mp) sb1Var.u.get();
                        fg fgVar = (fg) sb1Var.W.get();
                        kd6 kd6Var = (kd6) sb1Var.s.get();
                        fb2Var.getClass();
                        mpVar.getClass();
                        fgVar.getClass();
                        kd6Var.getClass();
                        return new vw1(new s9(context, fb2Var, mpVar, fgVar, kd6Var), (kd6) sb1Var.s.get());
                    case 7:
                        return new nx1((kd6) sb1Var.s.get(), (pn5) sb1Var.n.get(), (oj4) sb1Var.b0.get(), (sx1) pb1Var.e.get(), (jh) pb1Var.j.get(), (jf4) sb1Var.c0.get(), ub1Var.a());
                    case 8:
                        Context context2 = sb1Var.a.a;
                        kd6 kd6Var2 = (kd6) sb1Var.s.get();
                        cn5 cn5Var = (cn5) sb1Var.l.get();
                        p06 p06Var = (p06) sb1Var.x.get();
                        hp0 hp0Var = (hp0) sb1Var.f.get();
                        pn5 pn5Var = (pn5) sb1Var.n.get();
                        MelonDatabase melonDatabase = (MelonDatabase) sb1Var.c.get();
                        melonDatabase.getClass();
                        qf4 qf4Var = new qf4(melonDatabase.r());
                        oj4 oj4Var = (oj4) sb1Var.b0.get();
                        ck4 ck4Var = (ck4) sb1Var.g0.get();
                        hn5 hn5Var = (hn5) sb1Var.h0.get();
                        vk6 vk6Var = (vk6) sb1Var.i0.get();
                        xv2 xv2Var = (xv2) sb1Var.z.get();
                        ve4 ve4Var = (ve4) sb1Var.d0.get();
                        jf4 jf4Var = (jf4) sb1Var.c0.get();
                        mp mpVar2 = (mp) sb1Var.u.get();
                        wa3 wa3Var = (wa3) sb1Var.j0.get();
                        ha3 ha3Var = (ha3) sb1Var.S.get();
                        yb2 yb2Var = (yb2) sb1Var.D.get();
                        d76 d76Var = (d76) pb1Var.g.get();
                        ne1 ne1Var = (ne1) sb1Var.k0.get();
                        ne1Var.getClass();
                        la1Var = new sz1(context2, kd6Var2, cn5Var, p06Var, hp0Var, pn5Var, qf4Var, oj4Var, ck4Var, hn5Var, vk6Var, xv2Var, ve4Var, jf4Var, mpVar2, wa3Var, ha3Var, yb2Var, d76Var, new ci0(ne1Var), (jh) pb1Var.j.get(), (sx1) pb1Var.e.get(), ub1Var.a(), (ce6) sb1Var.L.get(), ub1Var.a);
                        break;
                    case 9:
                        return new b((kd6) sb1Var.s.get(), (p06) sb1Var.x.get(), ub1Var.a);
                    case 10:
                        ha3 ha3Var2 = (ha3) sb1Var.S.get();
                        ne1 ne1Var2 = (ne1) sb1Var.k0.get();
                        ne1Var2.getClass();
                        return new yl3((wa3) sb1Var.j0.get(), ha3Var2, new ci0(ne1Var2), (kd6) sb1Var.s.get(), ub1Var.a);
                    case 11:
                        return new qn3((wa3) sb1Var.j0.get(), ub1Var.a);
                    case 12:
                        return new eo3((wa3) sb1Var.j0.get(), (kd6) sb1Var.s.get());
                    case 13:
                        return new sn5((pn5) sb1Var.n.get());
                    case 14:
                        return new qv5((pn5) sb1Var.n.get(), (kd6) sb1Var.s.get(), (oj4) sb1Var.b0.get(), (ck4) sb1Var.g0.get(), (vk6) sb1Var.i0.get(), (jf4) sb1Var.c0.get(), ub1Var.a);
                    case 15:
                        return new hw5((bw5) sb1Var.l0.get(), (p06) sb1Var.x.get(), (kd6) sb1Var.s.get(), (kx5) sb1Var.v.get(), (wh7) sb1Var.P.get(), ub1Var.a);
                    case 16:
                        return new tz5((p06) sb1Var.x.get(), (kd6) sb1Var.s.get(), (kx5) sb1Var.v.get(), (wh7) sb1Var.P.get(), (yj1) sb1Var.y.get(), (fg) sb1Var.W.get(), (pn5) sb1Var.n.get(), (e70) sb1Var.J.get(), (db1) sb1Var.V.get());
                    case 17:
                        return new yz5((ud4) sb1Var.t.get());
                    case 18:
                        return new qh7((bs2) sb1Var.n0.get(), (hs2) sb1Var.o0.get());
                    case 19:
                        return new qr7(vy7.k0(sb1Var.a.a), (kd6) sb1Var.s.get(), (jm4) sb1Var.p0.get());
                    default:
                        throw new AssertionError(i2);
                }
                return la1Var;
        }
    }
}
