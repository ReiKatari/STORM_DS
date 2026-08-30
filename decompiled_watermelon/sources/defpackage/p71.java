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
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: p71  reason: default package */
/* loaded from: classes.dex */
public final class p71 implements gw4 {
    public final /* synthetic */ int a;
    public final int b;
    public final Object c;
    public final Object d;

    public /* synthetic */ p71(int i, int i2, Object obj, Object obj2) {
        this.a = i2;
        this.c = obj;
        this.d = obj2;
        this.b = i;
    }

    /* JADX WARN: Type inference failed for: r12v7, types: [r9, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v29, types: [java.lang.Object, hm1] */
    @Override // defpackage.fw4
    public final Object get() {
        Object xd0Var;
        Set unmodifiableSet;
        Object j57Var;
        y60 y60Var;
        an1 an1Var;
        s57 s57Var;
        ay3 ay3Var;
        Object an2Var;
        Object obj;
        Object bd6Var;
        switch (this.a) {
            case 0:
                o71 o71Var = (o71) this.c;
                q71 q71Var = (q71) this.d;
                int i = this.b;
                switch (i) {
                    case 0:
                        an1 an1Var2 = q71Var.a;
                        an1Var2.getClass();
                        xd0Var = new xd0(an1Var2, (j57) q71Var.H.get(), (td0) q71Var.F.get(), (mc0) q71Var.I.get(), (n57) q71Var.k.get(), (jf0) q71Var.y.get());
                        return xd0Var;
                    case 1:
                        ka kaVar = o71Var.a;
                        ka kaVar2 = o71Var.a;
                        ke0 ke0Var = (ke0) kaVar.R;
                        nk2.t(ke0Var);
                        qc0 qc0Var = (qc0) kaVar2.Y;
                        nk2.t(qc0Var);
                        q03 q03Var = new q03(29, o71Var, q71Var);
                        ak7 ak7Var = (ak7) q71Var.f.get();
                        rs3 rs3Var = (rs3) q71Var.n.get();
                        vq2 vq2Var = new vq2(2, (byte) 0);
                        vq2Var.a(q71Var.p.get());
                        vq2Var.a(q71Var.r.get());
                        vq2Var.a(q71Var.s.get());
                        vq2Var.a(q71Var.l.get());
                        vq2Var.a(q71Var.t.get());
                        vq2Var.a(q71Var.q.get());
                        vq2Var.a(q71Var.n.get());
                        vq2Var.a(q71Var.u.get());
                        vq2Var.a(q71Var.v.get());
                        ArrayList arrayList = vq2Var.b;
                        if (arrayList.isEmpty()) {
                            unmodifiableSet = Collections.EMPTY_SET;
                        } else if (arrayList.size() == 1) {
                            unmodifiableSet = Collections.singleton(arrayList.get(0));
                        } else {
                            unmodifiableSet = Collections.unmodifiableSet(new HashSet(arrayList));
                        }
                        gd0 gd0Var = (gd0) q71Var.G.get();
                        Context context = (Context) kaVar2.B;
                        j57Var = new j57(ke0Var, qc0Var, q03Var, ak7Var, rs3Var, unmodifiableSet, (v90) q71Var.x.get(), (jf0) q71Var.y.get(), q71Var.z, q71Var.k, q71Var.F, (nz1) q71Var.D.get(), (je0) q71Var.e.get(), (zg0) kaVar2.Z, gd0Var, context, wg1.g.l(context));
                        return j57Var;
                    case 2:
                        je0 je0Var = (je0) q71Var.e.get();
                        je0Var.getClass();
                        return new bk7(je0Var);
                    case 3:
                        an1 an1Var3 = q71Var.a;
                        an1Var3.getClass();
                        return new je0(an1Var3, (ce0) q71Var.d.get());
                    case 4:
                        ke0 ke0Var2 = (ke0) o71Var.a.R;
                        nk2.t(ke0Var2);
                        an1 an1Var4 = q71Var.a;
                        an1Var4.getClass();
                        try {
                            return tc0.b(ke0Var2.b(), an1Var4.B);
                        } catch (sh1 unused) {
                            if (!ve2.E()) {
                                return null;
                            }
                            Log.e("CXCP", "Failed to inject camera metadata: Do Not Disturb mode is on.");
                            return null;
                        }
                    case 5:
                        return new rs3((ce0) q71Var.d.get(), (zd6) q71Var.l.get(), (n57) q71Var.k.get(), (bs0) q71Var.m.get());
                    case ig7.b /* 6 */:
                        je0 je0Var2 = (je0) q71Var.e.get();
                        af0 af0Var = (af0) q71Var.j.get();
                        af0Var.getClass();
                        boolean a = af0Var.a().a(ImageCaptureFailWithAutoFlashQuirk.class);
                        if (oe1.a().b(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.class) != null || a) {
                            y60Var = y60.m0;
                        } else {
                            y60Var = y60.v0;
                        }
                        return new zd6(je0Var2, y60Var, (n57) q71Var.k.get());
                    case 7:
                        return new af0((ce0) q71Var.d.get(), (nf6) q71Var.i.get());
                    case 8:
                        return new nf6((StreamConfigurationMap) q71Var.g.get(), (ig4) q71Var.h.get());
                    case 9:
                        ce0 ce0Var = (ce0) q71Var.d.get();
                        if (ce0Var == null) {
                            return null;
                        }
                        CameraCharacteristics.Key key = CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP;
                        key.getClass();
                        return (StreamConfigurationMap) ((ia0) ce0Var).c(key);
                    case 10:
                        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) q71Var.g.get();
                        return new ig4((ce0) q71Var.d.get());
                    case 11:
                        q71Var.a.getClass();
                        Executor executor = ((sw) o71Var.a.L).a;
                        executor.getClass();
                        g31 n = w81.n(executor);
                        j57Var = new n57(iq2.c(se.O(hi2.c(), n).C(new j31("CXCP-UseCase-" + an1Var.B))), executor, n);
                        return j57Var;
                    case mj2.L /* 12 */:
                        return new bs0();
                    case 13:
                        return new p12((r12) q71Var.o.get());
                    case 14:
                        return new r12((je0) q71Var.e.get(), (n57) q71Var.k.get(), (bs0) q71Var.m.get());
                    case ig7.e /* 15 */:
                        je0 je0Var3 = (je0) q71Var.e.get();
                        zd6 zd6Var = (zd6) q71Var.l.get();
                        n57 n57Var = (n57) q71Var.k.get();
                        ew6 ew6Var = (ew6) q71Var.q.get();
                        af0 af0Var2 = (af0) q71Var.j.get();
                        af0Var2.getClass();
                        if (af0Var2.a().a(TorchFlashRequiredFor3aUpdateQuirk.class)) {
                            s57Var = k45.p0;
                        } else {
                            s57Var = sn1.j0;
                        }
                        xd0Var = new w82(je0Var3, zd6Var, n57Var, ew6Var, s57Var);
                        return xd0Var;
                    case 16:
                        return new ew6((je0) q71Var.e.get(), (zd6) q71Var.l.get(), (n57) q71Var.k.get());
                    case 17:
                        je0 je0Var4 = (je0) q71Var.e.get();
                        af0 af0Var3 = (af0) q71Var.j.get();
                        af0Var3.getClass();
                        if (af0Var3.a().a(AfRegionFlipHorizontallyQuirk.class)) {
                            ay3Var = sn1.f0;
                        } else {
                            ay3Var = k45.g0;
                        }
                        j57Var = new ic2(je0Var4, ay3Var, (zd6) q71Var.l.get(), (n57) q71Var.k.get(), q71Var.b());
                        return j57Var;
                    case 18:
                        return new hf6((w82) q71Var.r.get(), (n57) q71Var.k.get());
                    case 19:
                        return new l97();
                    case 20:
                        return new yj7(q71Var.b());
                    case 21:
                        w90 w90Var = (w90) q71Var.w.get();
                        n57 n57Var2 = (n57) q71Var.k.get();
                        bs0 bs0Var = (bs0) q71Var.m.get();
                        w90Var.getClass();
                        n57Var2.getClass();
                        bs0Var.getClass();
                        j57Var = new v90(w90Var, n57Var2, bs0Var);
                        return j57Var;
                    case 22:
                        return new w90();
                    case 23:
                        return new jf0();
                    case 24:
                        an1 an1Var5 = q71Var.a;
                        an1Var5.getClass();
                        return new sd0((je0) q71Var.e.get(), an1Var5, (jf0) q71Var.y.get(), (nc0) q71Var.A.get(), (rb0) q71Var.B.get(), (ic2) q71Var.s.get(), (af0) q71Var.j.get(), (nz1) q71Var.D.get(), (nf6) q71Var.i.get(), (z43) q71Var.E.get(), q71Var.b);
                    case 25:
                        ((yj7) q71Var.v.get()).getClass();
                        ((p12) q71Var.p.get()).getClass();
                        ((ew6) q71Var.q.get()).getClass();
                        ((rs3) q71Var.n.get()).getClass();
                        return new Object();
                    case 26:
                        return new rb0();
                    case 27:
                        String str = (String) q71Var.C.get();
                        af0 af0Var4 = (af0) q71Var.j.get();
                        str.getClass();
                        af0Var4.getClass();
                        return new oz1(str, af0Var4.a());
                    case 28:
                        an1 an1Var6 = q71Var.a;
                        an1Var6.getClass();
                        String str2 = an1Var6.B;
                        nk2.t(str2);
                        return str2;
                    case 29:
                        o71Var.a().getClass();
                        return new Object();
                    case 30:
                        an1 an1Var7 = q71Var.a;
                        an1Var7.getClass();
                        ka kaVar3 = o71Var.a;
                        q03 q03Var2 = (q03) kaVar3.X;
                        nk2.t(q03Var2);
                        j57Var = new gd0((rb0) q71Var.B.get(), (bs0) q71Var.m.get(), an1Var7, (af0) q71Var.j.get(), (ak7) q71Var.f.get(), q71Var.a(), (ce0) q71Var.d.get(), (zg0) kaVar3.Z, q03Var2);
                        return j57Var;
                    case 31:
                        return new kc0((je0) q71Var.e.get(), (p12) q71Var.p.get(), (w82) q71Var.r.get(), (ic2) q71Var.s.get(), (hf6) q71Var.t.get(), (ew6) q71Var.q.get(), (rs3) q71Var.n.get(), (yj7) q71Var.v.get(), (ak7) q71Var.f.get(), (v90) q71Var.x.get(), (j57) q71Var.H.get(), (n57) q71Var.k.get(), (l97) q71Var.u.get());
                    default:
                        throw new AssertionError(i);
                }
            case 1:
                w71 w71Var = (w71) this.c;
                r8 r8Var = (r8) this.d;
                ka kaVar4 = (ka) r8Var.a;
                int i2 = this.b;
                switch (i2) {
                    case 0:
                        ct6 ct6Var = (ct6) w71Var.f.get();
                        tg6 tg6Var = (tg6) w71Var.o.get();
                        bd0 bd0Var = (bd0) kaVar4.L;
                        nk2.t(bd0Var);
                        w71 w71Var2 = (w71) r8Var.b;
                        ct6 ct6Var2 = (ct6) w71Var2.f.get();
                        bd0 bd0Var2 = (bd0) kaVar4.L;
                        nk2.t(bd0Var2);
                        fb0 fb0Var = (fb0) w71Var2.p.get();
                        tg6 tg6Var2 = (tg6) w71Var2.o.get();
                        ct6Var2.getClass();
                        bd0Var2.getClass();
                        fb0Var.getClass();
                        tg6Var2.getClass();
                        ?? obj2 = new Object();
                        obj2.a = ct6Var2;
                        obj2.b = bd0Var2;
                        obj2.c = (tf6) kaVar4.X;
                        obj2.d = fb0Var;
                        obj2.e = tg6Var2;
                        return new ca0((o31) ((gw4) r8Var.c).get(), ct6Var, tg6Var, bd0Var, (an2) kaVar4.R, (xj6) kaVar4.Y, (ka0) ((gw4) r8Var.d).get(), (ki0) ((gw4) r8Var.j).get(), obj2, (ww4) w71Var.u.get(), (fg0) w71Var.z.get(), (fb0) w71Var.p.get(), (cm6) w71Var.m.get(), (hd0) kaVar4.B, (p90) kaVar4.Z, (tf6) kaVar4.X, (aw0) w71Var.A.get());
                    case 1:
                        ct6 ct6Var3 = (ct6) w71Var.f.get();
                        c63 c63Var = (c63) w71Var.d.get();
                        ct6Var3.getClass();
                        c63Var.getClass();
                        return iq2.c(se.O(new e63(c63Var), se.O(ct6Var3.h, new j31("CXCP-Camera2Controller"))));
                    case 2:
                        gw4 gw4Var = w71Var.g;
                        ct6 ct6Var4 = (ct6) w71Var.f.get();
                        bd0 bd0Var3 = (bd0) kaVar4.L;
                        nk2.t(bd0Var3);
                        c63 c63Var2 = (c63) w71Var.d.get();
                        gw4Var.getClass();
                        ct6Var4.getClass();
                        c63Var2.getClass();
                        return new ka0(gw4Var, ct6Var4, bd0Var3.a, c63Var2);
                    case 3:
                        p71 p71Var = (p71) r8Var.f;
                        p71 p71Var2 = (p71) r8Var.g;
                        p71 p71Var3 = (p71) r8Var.h;
                        p71 p71Var4 = (p71) r8Var.i;
                        bd0 bd0Var4 = (bd0) kaVar4.L;
                        nk2.t(bd0Var4);
                        ((p71) r8Var.e).getClass();
                        p71Var.getClass();
                        p71Var2.getClass();
                        p71Var3.getClass();
                        p71Var4.getClass();
                        int i3 = bd0Var4.h;
                        if (i3 == 2) {
                            if (Build.VERSION.SDK_INT >= 31) {
                                return (ki0) p71Var4.get();
                            }
                            i.n("Cannot use Extension sessions below Android S");
                            return null;
                        } else if (Build.VERSION.SDK_INT >= 28) {
                            return (ki0) p71Var3.get();
                        } else {
                            if (i3 == 1) {
                                return (ki0) p71Var.get();
                            }
                            return (ki0) p71Var2.get();
                        }
                    case 4:
                        bd0 bd0Var5 = (bd0) kaVar4.L;
                        nk2.t(bd0Var5);
                        return new ci((ct6) w71Var.f.get(), (tf6) kaVar4.X, bd0Var5, 0);
                    case 5:
                        return new bi((tf6) kaVar4.X, (ct6) w71Var.f.get());
                    case ig7.b /* 6 */:
                        bd0 bd0Var6 = (bd0) kaVar4.L;
                        nk2.t(bd0Var6);
                        return new ci((ct6) w71Var.f.get(), (tf6) kaVar4.X, bd0Var6, 1);
                    case 7:
                        bd0 bd0Var7 = (bd0) kaVar4.L;
                        nk2.t(bd0Var7);
                        return new ni((ct6) w71Var.f.get(), bd0Var7, (tf6) kaVar4.X);
                    case 8:
                        ct6 ct6Var5 = (ct6) w71Var.f.get();
                        bd0 bd0Var8 = (bd0) kaVar4.L;
                        nk2.t(bd0Var8);
                        return new ah(ct6Var5, bd0Var8, (tf6) kaVar4.X, (db0) w71Var.n.get(), (tg6) w71Var.o.get());
                    default:
                        throw new AssertionError(i2);
                }
            case 2:
                int i4 = this.b;
                switch (i4) {
                    case 0:
                        bd0 bd0Var9 = (bd0) ((u71) this.d).a.B;
                        nk2.t(bd0Var9);
                        u71 u71Var = (u71) this.d;
                        return new jd0(bd0Var9, (ce0) ((u71) this.d).c.get(), (an2) ((u71) this.d).e.get(), (an2) ((u71) this.d).e.get(), (tf6) ((u71) this.d).f.get(), (xj6) ((u71) this.d).h.get(), (ca0) ((u71) this.d).g.get(), (lh2) ((u71) this.d).k.get(), (kh2) ((u71) this.d).i.get(), (jw) ((w71) this.c).r.get(), (hd0) u71Var.a.L, (kd0) u71Var.o.get(), (ld0) ((u71) this.d).p.get(), (dn2) ((u71) this.d).m.get(), (o31) ((u71) this.d).n.get(), (l11) ((u71) this.d).r.get());
                    case 1:
                        bd0 bd0Var10 = (bd0) ((u71) this.d).a.B;
                        nk2.t(bd0Var10);
                        p90 p90Var = (p90) ((u71) this.d).b.get();
                        p90Var.getClass();
                        String str3 = bd0Var10.a;
                        str3.getClass();
                        return p90Var.c.d(str3);
                    case 2:
                        jb0 jb0Var = (jb0) ((w71) this.c).w.get();
                        nk2.t((bd0) ((u71) this.d).a.B);
                        jb0Var.getClass();
                        ((se0) ((w71) this.c).y.get()).getClass();
                        p90 p90Var2 = jb0Var.d;
                        nk2.t(p90Var2);
                        return p90Var2;
                    case 3:
                        q03 q03Var3 = ((u71) this.d).a;
                        bd0 bd0Var11 = (bd0) q03Var3.B;
                        nk2.t(bd0Var11);
                        an2Var = new an2((ct6) ((w71) this.c).f.get(), (hd0) q03Var3.L, bd0Var11, (nq3) ((u71) this.d).d.get(), (List) ((u71) this.d).l.get(), (fb0) ((w71) this.c).p.get());
                        return an2Var;
                    case 4:
                        return new nq3();
                    case 5:
                        bd0 bd0Var12 = (bd0) ((u71) this.d).a.B;
                        nk2.t(bd0Var12);
                        nq3 nq3Var = (nq3) ((u71) this.d).d.get();
                        lh2 lh2Var = (lh2) ((u71) this.d).k.get();
                        nq3Var.getClass();
                        lh2Var.getClass();
                        ArrayList f0 = l07.f0(nq3Var);
                        f0.add(nq3Var);
                        f0.add(lh2Var);
                        f0.addAll(bd0Var12.k);
                        obj = f0;
                        return obj;
                    case ig7.b /* 6 */:
                        tf6 tf6Var = (tf6) ((u71) this.d).f.get();
                        kh2 kh2Var = (kh2) ((u71) this.d).i.get();
                        ce0 ce0Var2 = (ce0) ((u71) this.d).c.get();
                        tf6Var.getClass();
                        kh2Var.getClass();
                        ce0Var2.getClass();
                        ((ol6) ((u71) this.d).j.get()).getClass();
                        CameraCharacteristics.Key key2 = CameraCharacteristics.SENSOR_INFO_TIMESTAMP_SOURCE;
                        key2.getClass();
                        Integer num = (Integer) ((ia0) ce0Var2).c(key2);
                        if (num != null) {
                            num.intValue();
                        }
                        return new lh2(tf6Var, kh2Var);
                    case 7:
                        bd0 bd0Var13 = (bd0) ((u71) this.d).a.B;
                        nk2.t(bd0Var13);
                        ((ct6) ((w71) this.c).f.get()).getClass();
                        an2Var = new tf6((ce0) ((u71) this.d).c.get(), bd0Var13, new Object(), ((u71) this.d).g);
                        return an2Var;
                    case 8:
                        q03 q03Var4 = ((u71) this.d).a;
                        hd0 hd0Var = (hd0) q03Var4.L;
                        bd0 bd0Var14 = (bd0) q03Var4.B;
                        nk2.t(bd0Var14);
                        p90 p90Var3 = (p90) ((u71) this.d).b.get();
                        an2 an2Var2 = (an2) ((u71) this.d).e.get();
                        tf6 tf6Var2 = (tf6) ((u71) this.d).f.get();
                        xj6 xj6Var = (xj6) ((u71) this.d).h.get();
                        p90Var3.getClass();
                        ((se0) ((w71) this.c).y.get()).getClass();
                        an2Var2.getClass();
                        tf6Var2.getClass();
                        xj6Var.getClass();
                        ca0 ca0Var = (ca0) ((gw4) new r8((w71) p90Var3.e.B, new ka(p90Var3, hd0Var, bd0Var14, an2Var2, tf6Var2, xj6Var, p90Var3)).k).get();
                        synchronized (p90Var3.f) {
                            p90Var3.g.add(ca0Var);
                        }
                        nk2.t(ca0Var);
                        return ca0Var;
                    case 9:
                        tf6 tf6Var3 = (tf6) ((u71) this.d).f.get();
                        wc1 wc1Var = ((u71) this.d).g;
                        fg0 fg0Var = (fg0) ((w71) this.c).z.get();
                        tf6Var3.getClass();
                        wc1Var.getClass();
                        fg0Var.getClass();
                        obj = new xj6(tf6Var3, wc1Var, fg0Var, tf6Var3.X);
                        return obj;
                    case 10:
                        return new kh2();
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
                    case mj2.L /* 12 */:
                        an2Var = new kd0((dn2) ((u71) this.d).m.get(), (an2) ((u71) this.d).e.get(), (o31) ((u71) this.d).n.get());
                        return an2Var;
                    case 13:
                        return new dn2();
                    case 14:
                        ct6 ct6Var6 = (ct6) ((w71) this.c).f.get();
                        c63 c63Var3 = (c63) ((w71) this.c).d.get();
                        ct6Var6.getClass();
                        c63Var3.getClass();
                        return iq2.c(se.O(new e63(c63Var3), se.O(ct6Var6.h, new j31("CXCP-Graph"))));
                    case ig7.e /* 15 */:
                        an2Var = new ld0((dn2) ((u71) this.d).m.get(), (an2) ((u71) this.d).e.get(), (o31) ((u71) this.d).n.get());
                        return an2Var;
                    case 16:
                        an2Var = new l11((an2) ((u71) this.d).e.get(), (ce0) ((u71) this.d).c.get(), (in2) ((u71) this.d).q.get(), (nq3) ((u71) this.d).d.get());
                        return an2Var;
                    case 17:
                        return new in2();
                    default:
                        throw new AssertionError(i4);
                }
            default:
                y71 y71Var = (y71) this.d;
                b81 b81Var = (b81) this.c;
                fh fhVar = b81Var.a;
                int i7 = this.b;
                switch (i7) {
                    case 0:
                        return new rc5();
                    case 1:
                        return new Object();
                    case 2:
                        return new Object();
                    case 3:
                        Context context2 = fhVar.A;
                        w16 w16Var = (w16) b81Var.s.get();
                        bd6 bd6Var2 = (bd6) y71Var.f.get();
                        qv5 qv5Var = (qv5) y71Var.g.get();
                        ap apVar = (ap) b81Var.u.get();
                        pm4 pm4Var = (pm4) b81Var.I.get();
                        s51 s51Var = (s51) y71Var.i.get();
                        ht1 ht1Var = (ht1) y71Var.e.get();
                        qf qfVar = (qf) b81Var.U.get();
                        q26 q26Var = (q26) b81Var.L.get();
                        w16Var.getClass();
                        bd6Var2.getClass();
                        qv5Var.getClass();
                        apVar.getClass();
                        pm4Var.getClass();
                        s51Var.getClass();
                        ht1Var.getClass();
                        qfVar.getClass();
                        q26Var.getClass();
                        return new xg(context2, w16Var, bd6Var2, qv5Var, apVar, pm4Var, s51Var, ht1Var, qfVar, q26Var);
                    case 4:
                        w16 w16Var2 = (w16) b81Var.s.get();
                        w37 w37Var = (w37) b81Var.r.get();
                        w16Var2.getClass();
                        w37Var.getClass();
                        bd6Var = new bd6(w16Var2, w37Var);
                        break;
                    case 5:
                        return new Object();
                    case ig7.b /* 6 */:
                        w16 w16Var3 = (w16) b81Var.s.get();
                        e81 e81Var = new e81(3);
                        e81Var.g(t51.BLACK_SCREEN, new Object());
                        t51 t51Var = t51.PHYSICAL_CAMERAS;
                        b81 b81Var2 = y71Var.a;
                        fh fhVar2 = b81Var2.a;
                        Context context3 = fhVar2.A;
                        gn3 gn3Var = (gn3) y71Var.d.get();
                        pm4 pm4Var2 = (pm4) b81Var2.I.get();
                        gn3Var.getClass();
                        pm4Var2.getClass();
                        e81Var.g(t51Var, new in4(context3, gn3Var, pm4Var2));
                        t51 t51Var2 = t51.STATIC_IMAGE;
                        Context context4 = fhVar2.A;
                        w16 w16Var4 = (w16) b81Var2.s.get();
                        p20 p20Var = (p20) y71Var.h.get();
                        w16Var4.getClass();
                        p20Var.getClass();
                        e81Var.g(t51Var2, new we6(context4, w16Var4, p20Var));
                        Map f = e81Var.f();
                        w16Var3.getClass();
                        f.getClass();
                        bd6Var = new s51(f, w16Var3);
                        break;
                    case 7:
                        Context context5 = fhVar.A;
                        if (Build.VERSION.SDK_INT >= 28) {
                            return new p20(context5, 1);
                        }
                        return new p20(context5, 0);
                    default:
                        throw new AssertionError(i7);
                }
                return bd6Var;
        }
    }
}
