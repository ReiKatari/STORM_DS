package defpackage;

import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build;
import android.os.SystemClock;
import android.util.Log;
import androidx.camera.camera2.compat.quirk.AfRegionFlipHorizontallyQuirk;
import androidx.camera.camera2.compat.quirk.CrashWhenTakingPhotoWithAutoFlashAEModeQuirk;
import androidx.camera.camera2.compat.quirk.ImageCaptureFailWithAutoFlashQuirk;
import androidx.camera.camera2.compat.quirk.TorchFlashRequiredFor3aUpdateQuirk;
import com.github.junrar.unpack.ppm.SubAllocator;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.CommonStatusCodes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fb1  reason: default package */
/* loaded from: classes.dex */
public final class fb1 implements m55 {
    public final /* synthetic */ int a;
    public final int b;
    public final Object c;
    public final Object d;

    public /* synthetic */ fb1(Object obj, int i, int i2, Object obj2) {
        this.a = i2;
        this.c = obj;
        this.d = obj2;
        this.b = i;
    }

    /* JADX WARN: Type inference failed for: r12v7, types: [s9, java.lang.Object] */
    @Override // defpackage.n55
    public final Object get() {
        Object gg0Var;
        Set unmodifiableSet;
        Object gj7Var;
        lx lxVar;
        gr1 gr1Var;
        d90 d90Var;
        t54 t54Var;
        Object gt2Var;
        Object obj;
        switch (this.a) {
            case 0:
                eb1 eb1Var = (eb1) this.c;
                gb1 gb1Var = (gb1) this.d;
                int i = this.b;
                switch (i) {
                    case 0:
                        gr1 gr1Var2 = gb1Var.a;
                        gr1Var2.getClass();
                        gg0Var = new gg0(gr1Var2, (gj7) gb1Var.H.get(), (cg0) gb1Var.F.get(), (ve0) gb1Var.I.get(), (kj7) gb1Var.k.get(), (sh0) gb1Var.y.get());
                        return gg0Var;
                    case 1:
                        pa paVar = eb1Var.a;
                        pa paVar2 = eb1Var.a;
                        tg0 tg0Var = (tg0) paVar.R;
                        mp2.o(tg0Var);
                        ze0 ze0Var = (ze0) paVar2.Y;
                        mp2.o(ze0Var);
                        u63 u63Var = new u63(29, eb1Var, gb1Var);
                        sy7 sy7Var = (sy7) gb1Var.f.get();
                        wz3 wz3Var = (wz3) gb1Var.n.get();
                        ww2 ww2Var = new ww2(2, (byte) 0);
                        ww2Var.a(gb1Var.p.get());
                        ww2Var.a(gb1Var.r.get());
                        ww2Var.a(gb1Var.s.get());
                        ww2Var.a(gb1Var.l.get());
                        ww2Var.a(gb1Var.t.get());
                        ww2Var.a(gb1Var.q.get());
                        ww2Var.a(gb1Var.n.get());
                        ww2Var.a(gb1Var.u.get());
                        ww2Var.a(gb1Var.v.get());
                        ArrayList arrayList = ww2Var.b;
                        if (arrayList.isEmpty()) {
                            unmodifiableSet = Collections.EMPTY_SET;
                        } else if (arrayList.size() == 1) {
                            unmodifiableSet = Collections.singleton(arrayList.get(0));
                        } else {
                            unmodifiableSet = Collections.unmodifiableSet(new HashSet(arrayList));
                        }
                        pf0 pf0Var = (pf0) gb1Var.G.get();
                        Context context = (Context) paVar2.B;
                        gj7Var = new gj7(tg0Var, ze0Var, u63Var, sy7Var, wz3Var, unmodifiableSet, (dc0) gb1Var.x.get(), (sh0) gb1Var.y.get(), gb1Var.z, gb1Var.k, gb1Var.F, (a42) gb1Var.D.get(), (sg0) gb1Var.e.get(), (ij0) paVar2.Z, pf0Var, context, al1.g.l(context));
                        return gj7Var;
                    case 2:
                        sg0 sg0Var = (sg0) gb1Var.e.get();
                        sg0Var.getClass();
                        return new ty7(sg0Var);
                    case 3:
                        gr1 gr1Var3 = gb1Var.a;
                        gr1Var3.getClass();
                        return new sg0(gr1Var3, (lg0) gb1Var.d.get());
                    case 4:
                        tg0 tg0Var2 = (tg0) eb1Var.a.R;
                        mp2.o(tg0Var2);
                        gr1 gr1Var4 = gb1Var.a;
                        gr1Var4.getClass();
                        try {
                            return cf0.b(tg0Var2.b(), gr1Var4.B);
                        } catch (xl1 unused) {
                            if (!kj2.G()) {
                                return null;
                            }
                            Log.e("CXCP", "Failed to inject camera metadata: Do Not Disturb mode is on.");
                            return null;
                        }
                    case 5:
                        return new wz3((lg0) gb1Var.d.get(), (op6) gb1Var.l.get(), (kj7) gb1Var.k.get(), (ou0) gb1Var.m.get());
                    case 6:
                        sg0 sg0Var2 = (sg0) gb1Var.e.get();
                        jh0 jh0Var = (jh0) gb1Var.j.get();
                        jh0Var.getClass();
                        boolean a = jh0Var.a().a(ImageCaptureFailWithAutoFlashQuirk.class);
                        if (si1.a().b(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.class) != null || a) {
                            lxVar = vs0.X;
                        } else {
                            lxVar = cs1.g0;
                        }
                        return new op6(sg0Var2, lxVar, (kj7) gb1Var.k.get());
                    case 7:
                        return new jh0((lg0) gb1Var.d.get(), (dr6) gb1Var.i.get());
                    case 8:
                        return new dr6((StreamConfigurationMap) gb1Var.g.get(), (lp4) gb1Var.h.get());
                    case 9:
                        lg0 lg0Var = (lg0) gb1Var.d.get();
                        if (lg0Var == null) {
                            return null;
                        }
                        CameraCharacteristics.Key key = CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP;
                        key.getClass();
                        return (StreamConfigurationMap) ((qc0) lg0Var).c(key);
                    case 10:
                        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) gb1Var.g.get();
                        return new lp4((lg0) gb1Var.d.get());
                    case 11:
                        gb1Var.a.getClass();
                        Executor executor = ((ux) eb1Var.a.L).a;
                        executor.getClass();
                        n61 F = f04.F(executor);
                        gj7Var = new kj7(g04.i(jw2.y(oi2.c(), F).N(new r61("CXCP-UseCase-" + gr1Var.B))), executor, F);
                        return gj7Var;
                    case 12:
                        return new ou0();
                    case 13:
                        return new e62((g62) gb1Var.o.get());
                    case 14:
                        return new g62((sg0) gb1Var.e.get(), (kj7) gb1Var.k.get(), (ou0) gb1Var.m.get());
                    case 15:
                        sg0 sg0Var3 = (sg0) gb1Var.e.get();
                        op6 op6Var = (op6) gb1Var.l.get();
                        kj7 kj7Var = (kj7) gb1Var.k.get();
                        r87 r87Var = (r87) gb1Var.q.get();
                        jh0 jh0Var2 = (jh0) gb1Var.j.get();
                        jh0Var2.getClass();
                        if (jh0Var2.a().a(TorchFlashRequiredFor3aUpdateQuirk.class)) {
                            d90Var = d90.G0;
                        } else {
                            d90Var = d90.z0;
                        }
                        gg0Var = new od2(sg0Var3, op6Var, kj7Var, r87Var, d90Var);
                        return gg0Var;
                    case 16:
                        return new r87((sg0) gb1Var.e.get(), (op6) gb1Var.l.get(), (kj7) gb1Var.k.get());
                    case 17:
                        sg0 sg0Var4 = (sg0) gb1Var.e.get();
                        jh0 jh0Var3 = (jh0) gb1Var.j.get();
                        jh0Var3.getClass();
                        if (jh0Var3.a().a(AfRegionFlipHorizontallyQuirk.class)) {
                            t54Var = d90.v0;
                        } else {
                            t54Var = vs0.k0;
                        }
                        gj7Var = new zg2(sg0Var4, t54Var, (op6) gb1Var.l.get(), (kj7) gb1Var.k.get(), gb1Var.b());
                        return gj7Var;
                    case 18:
                        return new wq6((od2) gb1Var.r.get(), (kj7) gb1Var.k.get());
                    case 19:
                        return new ln7();
                    case 20:
                        return new qy7(gb1Var.b());
                    case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                        ec0 ec0Var = (ec0) gb1Var.w.get();
                        kj7 kj7Var2 = (kj7) gb1Var.k.get();
                        ou0 ou0Var = (ou0) gb1Var.m.get();
                        ec0Var.getClass();
                        kj7Var2.getClass();
                        ou0Var.getClass();
                        gj7Var = new dc0(ec0Var, kj7Var2, ou0Var);
                        return gj7Var;
                    case 22:
                        return new ec0();
                    case ConnectionResult.API_DISABLED /* 23 */:
                        return new sh0();
                    case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                        gr1 gr1Var5 = gb1Var.a;
                        gr1Var5.getClass();
                        return new bg0((sg0) gb1Var.e.get(), gr1Var5, (sh0) gb1Var.y.get(), (we0) gb1Var.A.get(), (ae0) gb1Var.B.get(), (zg2) gb1Var.s.get(), (jh0) gb1Var.j.get(), (a42) gb1Var.D.get(), (dr6) gb1Var.i.get(), (lb3) gb1Var.E.get(), gb1Var.b);
                    case 25:
                        ((qy7) gb1Var.v.get()).getClass();
                        ((e62) gb1Var.p.get()).getClass();
                        ((r87) gb1Var.q.get()).getClass();
                        ((wz3) gb1Var.n.get()).getClass();
                        return new Object();
                    case SubAllocator.N4 /* 26 */:
                        return new ae0();
                    case 27:
                        String str = (String) gb1Var.C.get();
                        jh0 jh0Var4 = (jh0) gb1Var.j.get();
                        str.getClass();
                        jh0Var4.getClass();
                        return new b42(str, jh0Var4.a());
                    case 28:
                        gr1 gr1Var6 = gb1Var.a;
                        gr1Var6.getClass();
                        String str2 = gr1Var6.B;
                        mp2.o(str2);
                        return str2;
                    case 29:
                        eb1Var.a().getClass();
                        return new Object();
                    case 30:
                        gr1 gr1Var7 = gb1Var.a;
                        gr1Var7.getClass();
                        pa paVar3 = eb1Var.a;
                        u63 u63Var2 = (u63) paVar3.X;
                        mp2.o(u63Var2);
                        gj7Var = new pf0((ae0) gb1Var.B.get(), (ou0) gb1Var.m.get(), gr1Var7, (jh0) gb1Var.j.get(), (sy7) gb1Var.f.get(), gb1Var.a(), (lg0) gb1Var.d.get(), (ij0) paVar3.Z, u63Var2);
                        return gj7Var;
                    case 31:
                        return new te0((sg0) gb1Var.e.get(), (e62) gb1Var.p.get(), (od2) gb1Var.r.get(), (zg2) gb1Var.s.get(), (wq6) gb1Var.t.get(), (r87) gb1Var.q.get(), (wz3) gb1Var.n.get(), (qy7) gb1Var.v.get(), (sy7) gb1Var.f.get(), (dc0) gb1Var.x.get(), (gj7) gb1Var.H.get(), (kj7) gb1Var.k.get(), (ln7) gb1Var.u.get());
                    default:
                        throw new AssertionError(i);
                }
            case 1:
                nb1 nb1Var = (nb1) this.c;
                jb1 jb1Var = (jb1) this.d;
                pa paVar4 = (pa) jb1Var.a;
                int i2 = this.b;
                switch (i2) {
                    case 0:
                        t57 t57Var = (t57) ((m55) nb1Var.f).get();
                        ks6 ks6Var = (ks6) ((m55) nb1Var.o).get();
                        kf0 kf0Var = (kf0) paVar4.L;
                        mp2.o(kf0Var);
                        nb1 nb1Var2 = (nb1) jb1Var.b;
                        t57 t57Var2 = (t57) ((m55) nb1Var2.f).get();
                        kf0 kf0Var2 = (kf0) paVar4.L;
                        mp2.o(kf0Var2);
                        nd0 nd0Var = (nd0) ((m55) nb1Var2.p).get();
                        ks6 ks6Var2 = (ks6) ((m55) nb1Var2.o).get();
                        t57Var2.getClass();
                        kf0Var2.getClass();
                        nd0Var.getClass();
                        ks6Var2.getClass();
                        ?? obj2 = new Object();
                        obj2.a = t57Var2;
                        obj2.b = kf0Var2;
                        obj2.c = (jr6) paVar4.X;
                        obj2.d = nd0Var;
                        obj2.e = ks6Var2;
                        return new kc0((w61) ((m55) jb1Var.c).get(), t57Var, ks6Var, kf0Var, (gt2) paVar4.R, (rv6) paVar4.Y, (sc0) ((m55) jb1Var.d).get(), (sk0) ((m55) jb1Var.e).get(), obj2, (e65) ((m55) nb1Var.u).get(), (oi0) ((m55) nb1Var.y).get(), (nd0) ((m55) nb1Var.p).get(), (yx6) ((m55) nb1Var.m).get(), (qf0) paVar4.B, (xb0) paVar4.Z, (jr6) paVar4.X, (wy0) ((m55) nb1Var.z).get());
                    case 1:
                        t57 t57Var3 = (t57) ((m55) nb1Var.f).get();
                        rc3 rc3Var = (rc3) ((m55) nb1Var.d).get();
                        t57Var3.getClass();
                        rc3Var.getClass();
                        return g04.i(jw2.y(new tc3(rc3Var), jw2.y(t57Var3.h, new r61("CXCP-Camera2Controller"))));
                    case 2:
                        m55 m55Var = (m55) nb1Var.g;
                        t57 t57Var4 = (t57) ((m55) nb1Var.f).get();
                        kf0 kf0Var3 = (kf0) paVar4.L;
                        mp2.o(kf0Var3);
                        rc3 rc3Var2 = (rc3) ((m55) nb1Var.d).get();
                        m55Var.getClass();
                        t57Var4.getClass();
                        rc3Var2.getClass();
                        return new sc0(m55Var, t57Var4, kf0Var3.a, rc3Var2);
                    case 3:
                        fb1 fb1Var = (fb1) jb1Var.h;
                        fb1 fb1Var2 = (fb1) jb1Var.i;
                        fb1 fb1Var3 = (fb1) jb1Var.j;
                        fb1 fb1Var4 = (fb1) jb1Var.k;
                        kf0 kf0Var4 = (kf0) paVar4.L;
                        mp2.o(kf0Var4);
                        ((fb1) jb1Var.g).getClass();
                        fb1Var.getClass();
                        fb1Var2.getClass();
                        fb1Var3.getClass();
                        fb1Var4.getClass();
                        int i3 = kf0Var4.h;
                        if (i3 == 2) {
                            if (Build.VERSION.SDK_INT >= 31) {
                                return (sk0) fb1Var4.get();
                            }
                            i.m("Cannot use Extension sessions below Android S");
                            return null;
                        } else if (Build.VERSION.SDK_INT >= 28) {
                            return (sk0) fb1Var3.get();
                        } else {
                            if (i3 == 1) {
                                return (sk0) fb1Var.get();
                            }
                            return (sk0) fb1Var2.get();
                        }
                    case 4:
                        kf0 kf0Var5 = (kf0) paVar4.L;
                        mp2.o(kf0Var5);
                        return new oi((t57) ((m55) nb1Var.f).get(), (jr6) paVar4.X, kf0Var5, 0);
                    case 5:
                        return new ni((jr6) paVar4.X, (t57) ((m55) nb1Var.f).get());
                    case 6:
                        kf0 kf0Var6 = (kf0) paVar4.L;
                        mp2.o(kf0Var6);
                        return new oi((t57) ((m55) nb1Var.f).get(), (jr6) paVar4.X, kf0Var6, 1);
                    case 7:
                        kf0 kf0Var7 = (kf0) paVar4.L;
                        mp2.o(kf0Var7);
                        return new zi((t57) ((m55) nb1Var.f).get(), kf0Var7, (jr6) paVar4.X);
                    case 8:
                        t57 t57Var5 = (t57) ((m55) nb1Var.f).get();
                        kf0 kf0Var8 = (kf0) paVar4.L;
                        mp2.o(kf0Var8);
                        return new mh(t57Var5, kf0Var8, (jr6) paVar4.X, (ld0) ((m55) nb1Var.n).get(), (ks6) ((m55) nb1Var.o).get());
                    default:
                        throw new AssertionError(i2);
                }
            case 2:
                int i4 = this.b;
                switch (i4) {
                    case 0:
                        kf0 kf0Var9 = (kf0) ((kb1) this.d).a.B;
                        mp2.o(kf0Var9);
                        kb1 kb1Var = (kb1) this.d;
                        return new sf0(kf0Var9, (lg0) ((kb1) this.d).c.get(), (gt2) ((kb1) this.d).e.get(), (gt2) ((kb1) this.d).e.get(), (jr6) ((kb1) this.d).f.get(), (rv6) ((kb1) this.d).h.get(), (kc0) ((kb1) this.d).g.get(), (lm2) ((kb1) this.d).k.get(), (km2) ((kb1) this.d).i.get(), (bx) ((m55) ((nb1) this.c).r).get(), (qf0) kb1Var.a.L, (tf0) kb1Var.o.get(), (uf0) ((kb1) this.d).p.get(), (jt2) ((kb1) this.d).m.get(), (w61) ((kb1) this.d).n.get(), (t41) ((kb1) this.d).r.get());
                    case 1:
                        kf0 kf0Var10 = (kf0) ((kb1) this.d).a.B;
                        mp2.o(kf0Var10);
                        xb0 xb0Var = (xb0) ((kb1) this.d).b.get();
                        xb0Var.getClass();
                        String str3 = kf0Var10.a;
                        str3.getClass();
                        return xb0Var.c.d(str3);
                    case 2:
                        rd0 rd0Var = (rd0) ((m55) ((nb1) this.c).v).get();
                        mp2.o((kf0) ((kb1) this.d).a.B);
                        rd0Var.getClass();
                        ((bh0) ((m55) ((nb1) this.c).x).get()).getClass();
                        xb0 xb0Var2 = rd0Var.d;
                        mp2.o(xb0Var2);
                        return xb0Var2;
                    case 3:
                        u63 u63Var3 = ((kb1) this.d).a;
                        kf0 kf0Var11 = (kf0) u63Var3.B;
                        mp2.o(kf0Var11);
                        gt2Var = new gt2((t57) ((m55) ((nb1) this.c).f).get(), (qf0) u63Var3.L, kf0Var11, (ox3) ((kb1) this.d).d.get(), (List) ((kb1) this.d).l.get(), (nd0) ((m55) ((nb1) this.c).p).get());
                        return gt2Var;
                    case 4:
                        return new ox3();
                    case 5:
                        kf0 kf0Var12 = (kf0) ((kb1) this.d).a.B;
                        mp2.o(kf0Var12);
                        ox3 ox3Var = (ox3) ((kb1) this.d).d.get();
                        lm2 lm2Var = (lm2) ((kb1) this.d).k.get();
                        ox3Var.getClass();
                        lm2Var.getClass();
                        ArrayList d0 = hf.d0(ox3Var);
                        d0.add(ox3Var);
                        d0.add(lm2Var);
                        d0.addAll(kf0Var12.k);
                        obj = d0;
                        return obj;
                    case 6:
                        jr6 jr6Var = (jr6) ((kb1) this.d).f.get();
                        km2 km2Var = (km2) ((kb1) this.d).i.get();
                        lg0 lg0Var2 = (lg0) ((kb1) this.d).c.get();
                        jr6Var.getClass();
                        km2Var.getClass();
                        lg0Var2.getClass();
                        ((kx6) ((kb1) this.d).j.get()).getClass();
                        CameraCharacteristics.Key key2 = CameraCharacteristics.SENSOR_INFO_TIMESTAMP_SOURCE;
                        key2.getClass();
                        Integer num = (Integer) ((qc0) lg0Var2).c(key2);
                        if (num != null) {
                            num.intValue();
                        }
                        return new lm2(jr6Var, km2Var);
                    case 7:
                        kf0 kf0Var13 = (kf0) ((kb1) this.d).a.B;
                        mp2.o(kf0Var13);
                        ((t57) ((m55) ((nb1) this.c).f).get()).getClass();
                        gt2Var = new jr6((lg0) ((kb1) this.d).c.get(), kf0Var13, new jd1(9), ((kb1) this.d).g);
                        return gt2Var;
                    case 8:
                        u63 u63Var4 = ((kb1) this.d).a;
                        qf0 qf0Var = (qf0) u63Var4.L;
                        kf0 kf0Var14 = (kf0) u63Var4.B;
                        mp2.o(kf0Var14);
                        xb0 xb0Var3 = (xb0) ((kb1) this.d).b.get();
                        gt2 gt2Var2 = (gt2) ((kb1) this.d).e.get();
                        jr6 jr6Var2 = (jr6) ((kb1) this.d).f.get();
                        rv6 rv6Var = (rv6) ((kb1) this.d).h.get();
                        xb0Var3.getClass();
                        ((bh0) ((m55) ((nb1) this.c).x).get()).getClass();
                        gt2Var2.getClass();
                        jr6Var2.getClass();
                        rv6Var.getClass();
                        kc0 kc0Var = (kc0) ((m55) new jb1((nb1) xb0Var3.e.B, new pa(xb0Var3, qf0Var, kf0Var14, gt2Var2, jr6Var2, rv6Var, xb0Var3)).f).get();
                        synchronized (xb0Var3.f) {
                            xb0Var3.g.add(kc0Var);
                        }
                        mp2.o(kc0Var);
                        return kc0Var;
                    case 9:
                        jr6 jr6Var3 = (jr6) ((kb1) this.d).f.get();
                        yg1 yg1Var = ((kb1) this.d).g;
                        oi0 oi0Var = (oi0) ((m55) ((nb1) this.c).y).get();
                        jr6Var3.getClass();
                        yg1Var.getClass();
                        oi0Var.getClass();
                        obj = new rv6(jr6Var3, yg1Var, oi0Var, jr6Var3.X);
                        return obj;
                    case 10:
                        return new km2();
                    case 11:
                        long j = Long.MAX_VALUE;
                        long j2 = Long.MAX_VALUE;
                        for (int i5 = 0; i5 < 3; i5++) {
                            long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                            System.currentTimeMillis();
                            long elapsedRealtimeNanos2 = SystemClock.elapsedRealtimeNanos() - elapsedRealtimeNanos;
                            if (elapsedRealtimeNanos2 < j2) {
                                j2 = elapsedRealtimeNanos2;
                            }
                        }
                        for (int i6 = 0; i6 < 3; i6++) {
                            long nanoTime = System.nanoTime();
                            SystemClock.elapsedRealtimeNanos();
                            long nanoTime2 = System.nanoTime() - nanoTime;
                            if (nanoTime2 < j) {
                                j = nanoTime2;
                            }
                        }
                        return new Object();
                    case 12:
                        gt2Var = new tf0((jt2) ((kb1) this.d).m.get(), (gt2) ((kb1) this.d).e.get(), (w61) ((kb1) this.d).n.get());
                        return gt2Var;
                    case 13:
                        return new jt2();
                    case 14:
                        t57 t57Var6 = (t57) ((m55) ((nb1) this.c).f).get();
                        rc3 rc3Var3 = (rc3) ((m55) ((nb1) this.c).d).get();
                        t57Var6.getClass();
                        rc3Var3.getClass();
                        return g04.i(jw2.y(new tc3(rc3Var3), jw2.y(t57Var6.h, new r61("CXCP-Graph"))));
                    case 15:
                        gt2Var = new uf0((jt2) ((kb1) this.d).m.get(), (gt2) ((kb1) this.d).e.get(), (w61) ((kb1) this.d).n.get());
                        return gt2Var;
                    case 16:
                        gt2Var = new t41((gt2) ((kb1) this.d).e.get(), (lg0) ((kb1) this.d).c.get(), (ot2) ((kb1) this.d).q.get(), (ox3) ((kb1) this.d).d.get());
                        return gt2Var;
                    case 17:
                        return new ot2();
                    default:
                        throw new AssertionError(i4);
                }
            default:
                pb1 pb1Var = (pb1) this.d;
                sb1 sb1Var = (sb1) this.c;
                rh rhVar = sb1Var.a;
                int i7 = this.b;
                switch (i7) {
                    case 0:
                        return new lm5();
                    case 1:
                        return new Object();
                    case 2:
                        return new Object();
                    case 3:
                        Context context2 = rhVar.a;
                        kd6 kd6Var = (kd6) sb1Var.s.get();
                        ro6 ro6Var = (ro6) pb1Var.f.get();
                        d76 d76Var = (d76) pb1Var.g.get();
                        mp mpVar = (mp) sb1Var.u.get();
                        uv4 uv4Var = (uv4) sb1Var.I.get();
                        g91 g91Var = (g91) pb1Var.i.get();
                        sx1 sx1Var = (sx1) pb1Var.e.get();
                        fg fgVar = (fg) sb1Var.W.get();
                        ce6 ce6Var = (ce6) sb1Var.L.get();
                        fb2 fb2Var = (fb2) sb1Var.T.get();
                        kd6Var.getClass();
                        ro6Var.getClass();
                        d76Var.getClass();
                        mpVar.getClass();
                        uv4Var.getClass();
                        g91Var.getClass();
                        sx1Var.getClass();
                        fgVar.getClass();
                        ce6Var.getClass();
                        fb2Var.getClass();
                        return new jh(context2, kd6Var, ro6Var, d76Var, mpVar, uv4Var, g91Var, sx1Var, fgVar, ce6Var, fb2Var);
                    case 4:
                        Context context3 = rhVar.a;
                        kd6 kd6Var2 = (kd6) sb1Var.s.get();
                        uh7 uh7Var = (uh7) sb1Var.r.get();
                        kd6Var2.getClass();
                        uh7Var.getClass();
                        return new ro6(context3, kd6Var2, uh7Var);
                    case 5:
                        return new Object();
                    case 6:
                        kd6 kd6Var3 = (kd6) sb1Var.s.get();
                        wb1 wb1Var = new wb1(3);
                        wb1Var.g(h91.BLACK_SCREEN, new Object());
                        h91 h91Var = h91.PHYSICAL_CAMERAS;
                        sb1 sb1Var2 = pb1Var.a;
                        rh rhVar2 = sb1Var2.a;
                        Context context4 = rhVar2.a;
                        iu3 iu3Var = (iu3) pb1Var.d.get();
                        uv4 uv4Var2 = (uv4) sb1Var2.I.get();
                        iu3Var.getClass();
                        uv4Var2.getClass();
                        wb1Var.g(h91Var, new nw4(context4, iu3Var, uv4Var2));
                        h91 h91Var2 = h91.STATIC_IMAGE;
                        Context context5 = rhVar2.a;
                        kd6 kd6Var4 = (kd6) sb1Var2.s.get();
                        o40 o40Var = (o40) pb1Var.h.get();
                        kd6Var4.getClass();
                        o40Var.getClass();
                        wb1Var.g(h91Var2, new lq6(context5, kd6Var4, o40Var));
                        Map f = wb1Var.f();
                        kd6Var3.getClass();
                        f.getClass();
                        return new g91(f, kd6Var3);
                    case 7:
                        Context context6 = rhVar.a;
                        if (Build.VERSION.SDK_INT >= 28) {
                            return new o40(context6, 1);
                        }
                        return new o40(context6, 0);
                    default:
                        throw new AssertionError(i7);
                }
        }
    }
}
