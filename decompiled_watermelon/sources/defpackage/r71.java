package defpackage;

import android.content.Context;
import android.util.Log;
import androidx.camera.camera2.compat.quirk.ConfigureSurfaceToSecondarySessionFailQuirk;
import androidx.camera.camera2.compat.quirk.PreviewOrientationIncorrectQuirk;
import androidx.camera.camera2.compat.quirk.TextureViewIsClosedQuirk;
import androidx.camera.camera2.compat.quirk.UseTorchAsFlashQuirk;
import me.magnum.melonds.database.MelonDatabase;
import me.magnum.melonds.ui.inputsetup.b;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: r71  reason: default package */
/* loaded from: classes.dex */
public final class r71 implements gw4 {
    public final /* synthetic */ int a;
    public final int b;
    public final Object c;
    public final Object d;
    public final Object e;

    public /* synthetic */ r71(Object obj, Object obj2, Object obj3, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = i;
    }

    @Override // defpackage.fw4
    public final Object get() {
        t57 t57Var;
        yx2 k91Var;
        int i = this.a;
        int i2 = this.b;
        Object obj = this.c;
        Object obj2 = this.e;
        Object obj3 = this.d;
        switch (i) {
            case 0:
                o71 o71Var = (o71) obj;
                s71 s71Var = (s71) obj2;
                q71 q71Var = (q71) obj3;
                switch (i2) {
                    case 0:
                        g57 g57Var = (g57) s71Var.b.get();
                        n57 n57Var = (n57) q71Var.k.get();
                        if (s71Var.c.get() == null) {
                            return new k47(g57Var, n57Var, (n47) s71Var.l.get(), s71Var.j, s71Var.i, s71Var.h);
                        }
                        c44.b();
                        return null;
                    case 1:
                        h47 h47Var = s71Var.a;
                        jf0 jf0Var = (jf0) q71Var.y.get();
                        h47Var.getClass();
                        jf0Var.getClass();
                        if (ve2.D("CXCP")) {
                            Log.d("CXCP", "Prepared UseCaseGraphContext (Deferred)");
                        }
                        return new g57(new g47(h47Var, 0), jf0Var, h47Var.b, new g47(h47Var, 1));
                    case 2:
                        s71Var.a.getClass();
                        return null;
                    case 3:
                        return new pc1(s71Var.k, (n57) q71Var.k.get());
                    case 4:
                        return new t47(s71Var.h, s71Var.e, (g57) s71Var.b.get(), s71Var.j, (n57) q71Var.k.get(), (zg0) o71Var.a.Z);
                    case 5:
                        gw4 gw4Var = s71Var.f;
                        gw4 gw4Var2 = s71Var.g;
                        gw4Var.getClass();
                        gw4Var2.getClass();
                        if (gi0.c) {
                            Object obj4 = gw4Var2.get();
                            obj4.getClass();
                            return (ci0) obj4;
                        }
                        Object obj5 = gw4Var.get();
                        obj5.getClass();
                        return (ci0) obj5;
                    case ig7.b /* 6 */:
                        xh0 xh0Var = (xh0) s71Var.d.get();
                        w82 w82Var = (w82) q71Var.r.get();
                        ew6 ew6Var = (ew6) q71Var.q.get();
                        l97 l97Var = (l97) q71Var.u.get();
                        n57 n57Var2 = (n57) q71Var.k.get();
                        bs0 bs0Var = (bs0) q71Var.m.get();
                        af0 af0Var = (af0) q71Var.j.get();
                        tc0 a = q71Var.c.a();
                        z43 z43Var = (z43) q71Var.E.get();
                        af0Var.getClass();
                        z43Var.getClass();
                        if (af0Var.a().a(UseTorchAsFlashQuirk.class)) {
                            t57Var = new u57(af0Var, a, z43Var);
                        } else {
                            t57Var = k45.h0;
                        }
                        return new fi0(xh0Var, w82Var, ew6Var, l97Var, n57Var2, bs0Var, t57Var, (je0) q71Var.e.get(), s71Var.e, (g57) s71Var.b.get());
                    case 7:
                        je0 je0Var = (je0) q71Var.e.get();
                        q71Var.a();
                        je0Var.getClass();
                        ((g57) s71Var.b.get()).getClass();
                        ((ak7) q71Var.f.get()).getClass();
                        ((n57) q71Var.k.get()).getClass();
                        Object obj6 = new Object();
                        be0 be0Var = ce0.g;
                        ce0 ce0Var = je0Var.b;
                        be0Var.getClass();
                        be0.c(ce0Var);
                        return obj6;
                    case 8:
                        return new y47((g57) s71Var.b.get(), q71Var.a());
                    case 9:
                        return new gi0((je0) q71Var.e.get(), s71Var.f, (n57) q71Var.k.get(), (ew6) q71Var.q.get());
                    case 10:
                        n57 n57Var3 = (n57) q71Var.k.get();
                        ke0 ke0Var = (ke0) o71Var.a.R;
                        nk2.t(ke0Var);
                        af0 af0Var2 = (af0) q71Var.j.get();
                        af0Var2.getClass();
                        ox4 a2 = af0Var2.a();
                        if (!a2.a(ConfigureSurfaceToSecondarySessionFailQuirk.class) && !a2.a(PreviewOrientationIncorrectQuirk.class) && !a2.a(TextureViewIsClosedQuirk.class)) {
                            k91Var = iq0.i0;
                        } else {
                            k91Var = new k91(23);
                        }
                        return new m57(n57Var3, ke0Var, k91Var, (f16) s71Var.i.get());
                    case 11:
                        return s71Var.a.c;
                    default:
                        throw new AssertionError(i2);
                }
            default:
                y71 y71Var = (y71) obj3;
                d81 d81Var = (d81) obj2;
                b81 b81Var = (b81) obj;
                switch (i2) {
                    case 0:
                        return new e00((z33) b81Var.R.get(), (y37) b81Var.P.get(), d81Var.a);
                    case 1:
                        return new wm0((xm0) b81Var.f.get());
                    case 2:
                        return new pn0((xm0) b81Var.f.get(), d81Var.a);
                    case 3:
                        return new y41((l62) b81Var.S.get());
                    case 4:
                        return new w61((qf) b81Var.U.get(), (w16) b81Var.s.get(), (l62) b81Var.S.get());
                    case 5:
                        return new i71((vp5) b81Var.x.get(), (w16) b81Var.s.get(), (vm5) b81Var.v.get());
                    case ig7.b /* 6 */:
                        Context context = b81Var.a.A;
                        l62 l62Var = (l62) b81Var.S.get();
                        ap apVar = (ap) b81Var.u.get();
                        qf qfVar = (qf) b81Var.U.get();
                        w16 w16Var = (w16) b81Var.s.get();
                        l62Var.getClass();
                        apVar.getClass();
                        qfVar.getClass();
                        w16Var.getClass();
                        return new js1(new r9(context, l62Var, apVar, qfVar, w16Var), (w16) b81Var.s.get());
                    case 7:
                        return new ct1((w16) b81Var.s.get(), (ud5) b81Var.n.get(), (ra4) b81Var.Z.get(), (ht1) y71Var.e.get(), (rs1) y71Var.j.get(), (u64) b81Var.a0.get(), d81Var.a());
                    case 8:
                        Context context2 = b81Var.a.A;
                        w16 w16Var2 = (w16) b81Var.s.get();
                        id5 id5Var = (id5) b81Var.l.get();
                        vp5 vp5Var = (vp5) b81Var.x.get();
                        xm0 xm0Var = (xm0) b81Var.f.get();
                        ud5 ud5Var = (ud5) b81Var.n.get();
                        MelonDatabase melonDatabase = (MelonDatabase) b81Var.c.get();
                        melonDatabase.getClass();
                        b74 b74Var = new b74(melonDatabase.r());
                        ra4 ra4Var = (ra4) b81Var.Z.get();
                        fb4 fb4Var = (fb4) b81Var.e0.get();
                        md5 md5Var = (md5) b81Var.f0.get();
                        g96 g96Var = (g96) b81Var.g0.get();
                        wp2 wp2Var = (wp2) b81Var.z.get();
                        h64 h64Var = (h64) b81Var.b0.get();
                        u64 u64Var = (u64) b81Var.a0.get();
                        ap apVar2 = (ap) b81Var.u.get();
                        k43 k43Var = (k43) b81Var.h0.get();
                        z33 z33Var = (z33) b81Var.R.get();
                        e72 e72Var = (e72) b81Var.D.get();
                        qv5 qv5Var = (qv5) y71Var.g.get();
                        ra1 ra1Var = (ra1) b81Var.i0.get();
                        ra1Var.getClass();
                        return new hv1(context2, w16Var2, id5Var, vp5Var, xm0Var, ud5Var, b74Var, ra4Var, fb4Var, md5Var, g96Var, wp2Var, h64Var, u64Var, apVar2, k43Var, z33Var, e72Var, qv5Var, new tf0(ra1Var), (rs1) y71Var.j.get(), (ht1) y71Var.e.get(), d81Var.a(), (q26) b81Var.L.get(), d81Var.a);
                    case 9:
                        return new b((w16) b81Var.s.get(), (vp5) b81Var.x.get(), d81Var.a);
                    case 10:
                        z33 z33Var2 = (z33) b81Var.R.get();
                        ra1 ra1Var2 = (ra1) b81Var.i0.get();
                        ra1Var2.getClass();
                        return new bf3((k43) b81Var.h0.get(), z33Var2, new tf0(ra1Var2), (w16) b81Var.s.get(), d81Var.a);
                    case 11:
                        return new sg3((k43) b81Var.h0.get(), d81Var.a);
                    case mj2.L /* 12 */:
                        return new eh3((k43) b81Var.h0.get(), (w16) b81Var.s.get());
                    case 13:
                        return new xd5((ud5) b81Var.n.get());
                    case 14:
                        return new al5((ud5) b81Var.n.get(), (w16) b81Var.s.get(), (ra4) b81Var.Z.get(), (fb4) b81Var.e0.get(), (g96) b81Var.g0.get(), (u64) b81Var.a0.get(), d81Var.a);
                    case ig7.e /* 15 */:
                        return new sl5((ml5) b81Var.j0.get(), (vp5) b81Var.x.get(), (w16) b81Var.s.get(), (vm5) b81Var.v.get(), (y37) b81Var.P.get(), d81Var.a);
                    case 16:
                        return new yo5((vp5) b81Var.x.get(), (w16) b81Var.s.get(), (vm5) b81Var.v.get(), (y37) b81Var.P.get(), (uf1) b81Var.y.get(), (qf) b81Var.U.get(), (ud5) b81Var.n.get(), (a50) b81Var.J.get());
                    case 17:
                        return new dp5((o54) b81Var.t.get());
                    case 18:
                        return new v37((wl2) b81Var.l0.get(), (cm2) b81Var.m0.get());
                    default:
                        throw new AssertionError(i2);
                }
        }
    }
}
