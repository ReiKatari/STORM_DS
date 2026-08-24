package defpackage;

import android.app.admin.DevicePolicyManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.hardware.camera2.CameraManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.os.Vibrator;
import android.widget.TextView;
import com.github.junrar.unpack.decode.Compress;
import com.github.junrar.unpack.ppm.SubAllocator;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.CommonStatusCodes;
import com.google.mlkit.vision.common.InputImage;
import defpackage.k63;
import java.lang.reflect.Proxy;
import java.net.URL;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import me.magnum.melonds.database.MelonDatabase;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mb1  reason: default package */
/* loaded from: classes.dex */
public final class mb1 implements m55 {
    public final /* synthetic */ int a;
    public final int b;
    public final Object c;

    public /* synthetic */ mb1(Object obj, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = i;
    }

    /* JADX WARN: Type inference failed for: r0v19, types: [dh5, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v33, types: [java.lang.Object, af0] */
    /* JADX WARN: Type inference failed for: r4v21, types: [java.lang.Object, ci0] */
    /* JADX WARN: Type inference failed for: r8v6, types: [dh5, java.lang.Object] */
    private final Object a() {
        String string;
        nb1 nb1Var = (nb1) this.c;
        lc0 lc0Var = null;
        int i = this.b;
        switch (i) {
            case 0:
                return new zg0((rc3) ((m55) nb1Var.d).get());
            case 1:
                return yh2.c();
            case 2:
                return new cf0((rd0) ((m55) nb1Var.v).get());
            case 3:
                mb1 mb1Var = (mb1) nb1Var.A;
                Context a = nb1Var.a();
                t57 t57Var = (t57) ((m55) nb1Var.f).get();
                zg0 zg0Var = (zg0) ((m55) nb1Var.e).get();
                mb1Var.getClass();
                t57Var.getClass();
                zg0Var.getClass();
                ng0 ng0Var = ((pg0) ((os0) nb1Var.a).B).d;
                ng0Var.getClass();
                Map map = ng0Var.A;
                try {
                    Trace.beginSection("Initialize defaultCameraBackend");
                    xb0 xb0Var = (xb0) mb1Var.get();
                    Trace.endSection();
                    if (!map.containsKey(new qd0("CXCP-Camera2"))) {
                        Map p0 = c14.p0(map, new vr4(new qd0("CXCP-Camera2"), new ah0(xb0Var)));
                        if (p0.containsKey(new qd0("CXCP-Camera2"))) {
                            return new rd0("CXCP-Camera2", p0, a, t57Var, zg0Var);
                        }
                        StringBuilder sb = new StringBuilder("Failed to find ");
                        sb.append((Object) qd0.a("CXCP-Camera2"));
                        i.k(sb, " in the list of available CameraPipe backends! Available values are ", p0.keySet());
                        return null;
                    }
                    e41.g(qd0.a("CXCP-Camera2"), ". Use CameraBackendConfig#internalBackend field instead.", "CameraBackendConfig#cameraBackends should not contain a backend with ");
                    return null;
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            case 4:
                return new xb0((t57) ((m55) nb1Var.f).get(), (ed0) ((m55) nb1Var.k).get(), (ld0) ((m55) nb1Var.n).get(), (e65) ((m55) nb1Var.u).get(), new d51(nb1Var, 2), nb1Var.a());
            case 5:
                gs1 gs1Var = (gs1) nb1Var.b;
                zg0 zg0Var2 = (zg0) ((m55) nb1Var.e).get();
                rc3 rc3Var = (rc3) ((m55) nb1Var.d).get();
                int i2 = gs1Var.X;
                zg0Var2.getClass();
                rc3Var.getClass();
                ArrayList arrayList = new ArrayList();
                ((rg0) gs1Var.Y).getClass();
                ThreadFactory threadFactory = pm.b;
                ScheduledExecutorService a2 = pm.a(new mm(i2, pm.b(threadFactory, "CXCP-IO-")), 8);
                arrayList.add(a2);
                n61 F = f04.F(a2);
                ScheduledExecutorService a3 = pm.a(new mm(i2, pm.b(threadFactory, "CXCP-BG-")), gs1Var.L);
                arrayList.add(a3);
                n61 F2 = f04.F(a3);
                ScheduledExecutorService a4 = pm.a(new mm(gs1Var.R, pm.b(threadFactory, "CXCP-")), gs1Var.B);
                arrayList.add(a4);
                n61 F3 = f04.F(a4);
                zg0Var2.a(wg0.THREAD, new lf1(1, arrayList));
                j57 j57Var = new j57(gs1Var, zg0Var2, 0);
                j57 j57Var2 = new j57(gs1Var, zg0Var2, 1);
                ?? obj = new Object();
                ?? obj2 = new Object();
                obj.A = g04.i(jw2.y(new tc3(rc3Var), F3).N(new r61("CXCP")));
                obj2.A = g04.i(jw2.y(new tc3(rc3Var), new r61("CXCP-Dispatch")));
                zg0Var2.a(wg0.SCOPE, new q64(8, obj, obj2));
                return new t57((w61) obj.A, (w61) obj2.A, a2, F, a3, F2, a4, F3, j57Var, j57Var2);
            case 6:
                return new ed0((m55) nb1Var.g, (t57) ((m55) nb1Var.f).get(), nb1Var.a(), (PackageManager) ((m55) nb1Var.h).get(), (id0) ((m55) nb1Var.i).get(), (m55) nb1Var.j, (zg0) ((m55) nb1Var.e).get(), (rc3) ((m55) nb1Var.d).get());
            case 7:
                Object systemService = nb1Var.a().getSystemService("camera");
                systemService.getClass();
                return (CameraManager) systemService;
            case 8:
                PackageManager packageManager = nb1Var.a().getPackageManager();
                packageManager.getClass();
                return packageManager;
            case 9:
                return new id0();
            case 10:
                Context a5 = nb1Var.a();
                ?? obj3 = new Object();
                if (Build.VERSION.SDK_INT >= 35) {
                    obj3.b = new lc0(a5);
                }
                try {
                    ServiceInfo[] serviceInfoArr = a5.getPackageManager().getPackageInfo(a5.getPackageName(), 132).services;
                    if (serviceInfoArr != null) {
                        String str = null;
                        for (ServiceInfo serviceInfo : serviceInfoArr) {
                            Bundle bundle = serviceInfo.metaData;
                            if (bundle != null && (string = bundle.getString("androidx.camera.featurecombinationquery.PLAY_SERVICES_IMPL_PROVIDER_KEY")) != null) {
                                if (str == null) {
                                    str = string;
                                } else {
                                    i.m("Multiple Play Services CameraDeviceSetupCompat implementations found in the manifest.");
                                    return null;
                                }
                            }
                        }
                        if (str != null) {
                            try {
                                lc0Var = (lc0) Class.forName(str).getConstructor(Context.class).newInstance(a5);
                            } catch (Exception e) {
                                throw new IllegalStateException("Failed to instantiate Play Services CameraDeviceSetupCompat implementation", e);
                            }
                        }
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                }
                obj3.a = lc0Var;
                return obj3;
            case 11:
                Context a6 = nb1Var.a();
                t57 t57Var2 = (t57) ((m55) nb1Var.f).get();
                vv4 vv4Var = (vv4) ((m55) nb1Var.l).get();
                u63 u63Var = ((pg0) ((os0) nb1Var.a).B).c;
                mp2.o(u63Var);
                return new ld0(a6, t57Var2, vv4Var, u63Var, (yx6) ((m55) nb1Var.m).get());
            case 12:
                return new vv4(nb1Var.a());
            case 13:
                return new Object();
            case 14:
                return new e65((vv4) ((m55) nb1Var.l).get(), (mp5) ((m55) nb1Var.s).get(), (gd0) ((m55) nb1Var.t).get(), (id0) ((m55) nb1Var.i).get(), (t57) ((m55) nb1Var.f).get());
            case 15:
                os0 os0Var = (os0) nb1Var.a;
                u63 u63Var2 = new u63((m55) nb1Var.g, (t57) ((m55) nb1Var.f).get());
                ld0 ld0Var = (ld0) ((m55) nb1Var.n).get();
                id0 id0Var = (id0) ((m55) nb1Var.i).get();
                nd0 nd0Var = (nd0) ((m55) nb1Var.p).get();
                yx6 yx6Var = (yx6) ((m55) nb1Var.m).get();
                og0 og0Var = ((pg0) os0Var.B).e;
                mp2.o(og0Var);
                t57 t57Var3 = (t57) ((m55) nb1Var.f).get();
                ld0Var.getClass();
                id0Var.getClass();
                nd0Var.getClass();
                yx6Var.getClass();
                t57Var3.getClass();
                ?? obj4 = new Object();
                obj4.a = u63Var2;
                obj4.b = ld0Var;
                obj4.c = id0Var;
                obj4.d = nd0Var;
                obj4.e = yx6Var;
                obj4.f = og0Var;
                obj4.g = t57Var3;
                obj4.h = new tu0();
                eb ebVar = new eb((m55) nb1Var.g, (t57) ((m55) nb1Var.f).get(), (rc3) ((m55) nb1Var.d).get());
                yx6 yx6Var2 = (yx6) ((m55) nb1Var.m).get();
                gg ggVar = (gg) ((m55) nb1Var.q).get();
                bx bxVar = (bx) ((m55) nb1Var.r).get();
                og0 og0Var2 = ((pg0) os0Var.B).e;
                mp2.o(og0Var2);
                return new mp5(obj4, (id0) ((m55) nb1Var.i).get(), ebVar, yx6Var2, ggVar, bxVar, og0Var2, (t57) ((m55) nb1Var.f).get());
            case 16:
                return new nd0((ld0) ((m55) nb1Var.n).get(), (ks6) ((m55) nb1Var.o).get());
            case 17:
                mp2.o(((pg0) ((os0) nb1Var.a).B).f);
                return new Object();
            case 18:
                Object systemService2 = nb1Var.a().getSystemService("device_policy");
                systemService2.getClass();
                return new gg((DevicePolicyManager) systemService2);
            case 19:
                return new bx((t57) ((m55) nb1Var.f).get(), (zg0) ((m55) nb1Var.e).get(), (rc3) ((m55) nb1Var.d).get());
            case 20:
                return new gd0((t57) ((m55) nb1Var.f).get(), (nd0) ((m55) nb1Var.p).get(), (mp5) ((m55) nb1Var.s).get());
            case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                nb1Var.a();
                ((t57) ((m55) nb1Var.f).get()).getClass();
                ((rd0) ((m55) nb1Var.v).get()).getClass();
                return new Object();
            case 22:
                return new oi0();
            case ConnectionResult.API_DISABLED /* 23 */:
                return new wy0();
            default:
                throw new AssertionError(i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v129, types: [d14, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v182, types: [v34] */
    /* JADX WARN: Type inference failed for: r3v10, types: [vw4, java.util.concurrent.ThreadPoolExecutor] */
    /* JADX WARN: Type inference failed for: r3v18, types: [d14, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v21, types: [java.lang.Object, q61] */
    /* JADX WARN: Type inference failed for: r3v24, types: [v34] */
    /* JADX WARN: Type inference failed for: r4v23, types: [java.lang.Object, nb3] */
    /* JADX WARN: Type inference failed for: r4v8, types: [f14, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v6, types: [f14, java.lang.Object] */
    @Override // defpackage.n55
    public final Object get() {
        Object plVar;
        Object l85Var;
        op opVar;
        switch (this.a) {
            case 0:
                return a();
            default:
                sb1 sb1Var = (sb1) this.c;
                int i = 0;
                int i2 = this.b;
                switch (i2) {
                    case 0:
                        return new rb1(this, 0);
                    case 1:
                        Context context = sb1Var.a.a;
                        MelonDatabase melonDatabase = (MelonDatabase) sb1Var.c.get();
                        jd6 jd6Var = (jd6) sb1Var.e.get();
                        melonDatabase.getClass();
                        jd6Var.getClass();
                        return new h16(context, melonDatabase, jd6Var);
                    case 2:
                        Context context2 = sb1Var.a.a;
                        Set<k16> singleton = Collections.singleton(new Object());
                        singleton.getClass();
                        j16 n = ln2.n(context2, MelonDatabase.class, "melon-database");
                        for (k16 k16Var : singleton) {
                            k16Var.getClass();
                            n.d.add(k16Var);
                        }
                        n.a(new j64(1, 2, 12), new j64(4, 5, 13), new j64(5, 6, 14), new j64(7, 8, 15), new j64(8, 9, 16));
                        return (MelonDatabase) n.b();
                    case 3:
                        Context context3 = sb1Var.a.a;
                        SharedPreferences sharedPreferences = (SharedPreferences) sb1Var.d.get();
                        MelonDatabase melonDatabase2 = (MelonDatabase) sb1Var.c.get();
                        sharedPreferences.getClass();
                        melonDatabase2.getClass();
                        return new jd6(context3, sharedPreferences, melonDatabase2);
                    case 4:
                        Context context4 = sb1Var.a.a;
                        SharedPreferences sharedPreferences2 = context4.getSharedPreferences(v15.b(context4), 0);
                        sharedPreferences2.getClass();
                        return sharedPreferences2;
                    case 5:
                        return new rb1(this, 1);
                    case 6:
                        l85 l85Var2 = (l85) sb1Var.m.get();
                        MelonDatabase melonDatabase3 = (MelonDatabase) sb1Var.c.get();
                        melonDatabase3.getClass();
                        qf4 qf4Var = new qf4(melonDatabase3.r());
                        hk hkVar = (hk) sb1Var.i.get();
                        jk jkVar = (jk) sb1Var.j.get();
                        SharedPreferences sharedPreferences3 = (SharedPreferences) sb1Var.d.get();
                        cn5 cn5Var = (cn5) sb1Var.l.get();
                        Context context5 = sb1Var.a.a;
                        l85Var2.getClass();
                        hkVar.getClass();
                        jkVar.getClass();
                        sharedPreferences3.getClass();
                        cn5Var.getClass();
                        plVar = new pl(l85Var2, qf4Var, hkVar, jkVar, sharedPreferences3, context5, cn5Var);
                        return plVar;
                    case 7:
                        x34 x34Var = new x34(sb1Var.a.a);
                        wk4 wk4Var = new wk4();
                        wk4Var.c.add(x34Var);
                        wk4Var.i = false;
                        wk4Var.j = false;
                        xk4 xk4Var = new xk4(wk4Var);
                        id3 id3Var = (id3) sb1Var.h.get();
                        hk hkVar2 = (hk) sb1Var.i.get();
                        jk jkVar2 = (jk) sb1Var.j.get();
                        ek ekVar = (ek) sb1Var.k.get();
                        cn5 cn5Var2 = (cn5) sb1Var.l.get();
                        id3Var.getClass();
                        hkVar2.getClass();
                        jkVar2.getClass();
                        ekVar.getClass();
                        cn5Var2.getClass();
                        l85Var = new l85(xk4Var, id3Var, hkVar2, jkVar2, ekVar, cn5Var2);
                        return l85Var;
                    case 8:
                        return ii2.g(new k4(12));
                    case 9:
                        SharedPreferences sharedPreferences4 = (SharedPreferences) sb1Var.d.get();
                        sharedPreferences4.getClass();
                        return new hk(sharedPreferences4);
                    case 10:
                        SharedPreferences sharedPreferences5 = (SharedPreferences) sb1Var.d.get();
                        sharedPreferences5.getClass();
                        return new jk(sharedPreferences5);
                    case 11:
                        return new Object();
                    case 12:
                        SharedPreferences sharedPreferences6 = (SharedPreferences) sb1Var.d.get();
                        sharedPreferences6.getClass();
                        return new cn5(sharedPreferences6);
                    case 13:
                        return new rb1(this, 2);
                    case 14:
                        return new cp5(sb1Var.a.a, (SharedPreferences) sb1Var.d.get());
                    case 15:
                        Context context6 = sb1Var.a.a;
                        SharedPreferences sharedPreferences7 = (SharedPreferences) sb1Var.d.get();
                        jd1 jd1Var = new jd1(0);
                        id3 id3Var2 = (id3) sb1Var.h.get();
                        uh7 uh7Var = (uh7) sb1Var.r.get();
                        jd6 jd6Var2 = (jd6) sb1Var.e.get();
                        cp5 cp5Var = (cp5) sb1Var.p.get();
                        sharedPreferences7.getClass();
                        id3Var2.getClass();
                        uh7Var.getClass();
                        jd6Var2.getClass();
                        cp5Var.getClass();
                        xe1 xe1Var = xk1.a;
                        l85Var = new ng6(context6, sharedPreferences7, jd1Var, id3Var2, uh7Var, g04.i(de1.L), jd6Var2, cp5Var);
                        return l85Var;
                    case 16:
                        return new xx0(sb1Var.a.a, 0);
                    case 17:
                        Context context7 = sb1Var.a.a;
                        mp mpVar = (mp) sb1Var.u.get();
                        mpVar.getClass();
                        return new kx5(context7, mpVar);
                    case 18:
                        Context context8 = sb1Var.a.a;
                        uh7 uh7Var2 = (uh7) sb1Var.r.get();
                        ud4 ud4Var = (ud4) sb1Var.t.get();
                        uh7Var2.getClass();
                        ud4Var.getClass();
                        return new mp(context8, uh7Var2, ud4Var);
                    case 19:
                        Context context9 = sb1Var.a.a;
                        kd6 kd6Var = (kd6) sb1Var.s.get();
                        kd6Var.getClass();
                        return new ud4(context9, kd6Var);
                    case 20:
                        Context context10 = sb1Var.a.a;
                        su2 su2Var = (su2) sb1Var.w.get();
                        kd6 kd6Var2 = (kd6) sb1Var.s.get();
                        mp mpVar2 = (mp) sb1Var.u.get();
                        uh7 uh7Var3 = (uh7) sb1Var.r.get();
                        jd6 jd6Var3 = (jd6) sb1Var.e.get();
                        su2Var.getClass();
                        kd6Var2.getClass();
                        mpVar2.getClass();
                        uh7Var3.getClass();
                        jd6Var3.getClass();
                        plVar = new xb2(context10, su2Var, kd6Var2, mpVar2, uh7Var3, jd6Var3);
                        return plVar;
                    case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                        tu2 tu2Var = new tu2();
                        tu2Var.f.add(new xb7(new xh7(), null, false, Uri.class));
                        tu2Var.c(v41.class, new x41());
                        tu2Var.c(k63.b.class, new c63());
                        return new su2(tu2Var);
                    case 22:
                        return new yj1(sb1Var.a.a);
                    case ConnectionResult.API_DISABLED /* 23 */:
                        return new xv2(sb1Var.a.a);
                    case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                        return new ft(sb1Var.a.a, (kd6) sb1Var.s.get());
                    case 25:
                        Context context11 = sb1Var.a.a;
                        kd6 kd6Var3 = (kd6) sb1Var.s.get();
                        b46 b46Var = (b46) sb1Var.C.get();
                        uh7 uh7Var4 = (uh7) sb1Var.r.get();
                        kd6Var3.getClass();
                        b46Var.getClass();
                        uh7Var4.getClass();
                        return new yb2(context11, kd6Var3, b46Var, uh7Var4);
                    case SubAllocator.N4 /* 26 */:
                        Context context12 = sb1Var.a.a;
                        sw4 sw4Var = (sw4) sb1Var.B.get();
                        sw4Var.getClass();
                        return new b46(context12, sw4Var);
                    case 27:
                        Context applicationContext = sb1Var.a.a.getApplicationContext();
                        ss2 ss2Var = new ss2(applicationContext);
                        s63 s63Var = new s63(applicationContext);
                        ?? threadPoolExecutor = new ThreadPoolExecutor(3, 3, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new kx2(2));
                        pq6 pq6Var = new pq6(s63Var);
                        return new sw4(applicationContext, new uk1(applicationContext, threadPoolExecutor, sw4.i, ss2Var, s63Var, pq6Var), s63Var, pq6Var);
                    case 28:
                        Context context13 = sb1Var.a.a;
                        k10 k10Var = (k10) sb1Var.E.get();
                        k10Var.getClass();
                        ws0 ws0Var = new ws0(k10Var, 0);
                        kx5 kx5Var = (kx5) sb1Var.v.get();
                        kx5Var.getClass();
                        ws0 ws0Var2 = new ws0(kx5Var, 1);
                        pa paVar = new pa(context13);
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        ArrayList arrayList3 = new ArrayList();
                        ArrayList arrayList4 = new ArrayList();
                        ArrayList arrayList5 = new ArrayList();
                        arrayList2.add(new vr4(new s90(1), URL.class));
                        arrayList4.add(new vr4(ws0Var, n00.class));
                        arrayList4.add(new vr4(ws0Var2, pq5.class));
                        paVar.Y = new uv0(g04.U(arrayList), g04.U(arrayList2), g04.U(arrayList3), g04.U(arrayList4), g04.U(arrayList5));
                        paVar.R = new ex6(new ej0(context13, 1));
                        paVar.X = new ex6(new ej0(context13, 2));
                        s71 s71Var = new s71(100);
                        we1 we1Var = (we1) paVar.L;
                        paVar.L = new we1(we1Var.a, we1Var.b, we1Var.c, we1Var.d, s71Var, we1Var.f, we1Var.g, we1Var.h, we1Var.i, we1Var.j, we1Var.k, we1Var.l, we1Var.m, we1Var.n, we1Var.o);
                        return paVar.g();
                    case 29:
                        return new k10(sb1Var.a.a);
                    case 30:
                        return new at();
                    case 31:
                        Context context14 = sb1Var.a.a;
                        if (nb3.k(Build.MANUFACTURER, "AYN") && nb3.k(Build.MODEL, "AYN Thor")) {
                            return new pi1(context14);
                        }
                        return new pi1(context14);
                    case 32:
                        return new uv4(sb1Var.a.a);
                    case 33:
                        return new e70(sb1Var.a.a);
                    case 34:
                        return new ae6(sb1Var.a.a);
                    case InputImage.IMAGE_FORMAT_YUV_420_888 /* 35 */:
                        return new ce6(sb1Var.a.a);
                    case 36:
                        return new c76(sb1Var.a.a);
                    case 37:
                        return new l06(sb1Var.a.a, (kd6) sb1Var.s.get(), (uh7) sb1Var.r.get());
                    case SubAllocator.N_INDEXES /* 38 */:
                        Context context15 = sb1Var.a.a;
                        ((sw4) sb1Var.B.get()).getClass();
                        ArrayList arrayList6 = new ArrayList(3);
                        TextView.BufferType bufferType = TextView.BufferType.SPANNABLE;
                        arrayList6.add(new m51());
                        arrayList6.add(new ww4());
                        arrayList6.add(new Object());
                        if (!arrayList6.isEmpty()) {
                            m44 m44Var = new m44(arrayList6);
                            int size = arrayList6.size();
                            int i3 = 0;
                            while (i3 < size) {
                                Object obj = arrayList6.get(i3);
                                i3++;
                                m44Var.c((b1) obj);
                            }
                            ArrayList arrayList7 = (ArrayList) m44Var.L;
                            eb ebVar = new eb(15);
                            float f = context15.getResources().getDisplayMetrics().density;
                            ?? obj2 = new Object();
                            obj2.d = (int) ((8.0f * f) + 0.5f);
                            obj2.a = (int) ((24.0f * f) + 0.5f);
                            int i4 = (int) ((4.0f * f) + 0.5f);
                            obj2.b = i4;
                            int i5 = (int) ((1.0f * f) + 0.5f);
                            obj2.c = i5;
                            obj2.e = i5;
                            obj2.f = i4;
                            ?? obj3 = new Object();
                            ng3 ng3Var = new ng3(2);
                            ng3 ng3Var2 = new ng3(1);
                            int size2 = arrayList7.size();
                            while (i < size2) {
                                Object obj4 = arrayList7.get(i);
                                i++;
                                b1 b1Var = (b1) obj4;
                                b1Var.getClass();
                                b1Var.b(obj3);
                                b1Var.d(ng3Var);
                                b1Var.c(ng3Var2);
                            }
                            ?? obj5 = new Object();
                            obj5.a = obj2.a;
                            obj5.b = obj2.b;
                            obj5.c = obj2.c;
                            obj5.d = obj2.d;
                            obj5.e = obj2.e;
                            obj5.f = obj2.f;
                            ng0 ng0Var = new ng0(Collections.unmodifiableMap(ng3Var2.A));
                            obj3.a = obj5;
                            obj3.g = ng0Var;
                            if (obj3.b == null) {
                                obj3.b = new Object();
                            }
                            if (obj3.c == null) {
                                obj3.c = new x31(27);
                            }
                            if (obj3.d == null) {
                                obj3.d = new w31(14);
                            }
                            if (obj3.e == null) {
                                obj3.e = new Object();
                            }
                            if (obj3.f == null) {
                                obj3.f = new w31(10);
                            }
                            ?? obj6 = new Object();
                            obj6.a = obj3.a;
                            obj6.b = obj3.b;
                            obj6.c = obj3.c;
                            obj6.d = obj3.d;
                            obj6.e = obj3.e;
                            obj6.f = obj3.f;
                            obj6.g = obj3.g;
                            return new e14(new eb(ebVar), new ap3(4, ng3Var, (Object) obj6), Collections.unmodifiableList(arrayList7));
                        }
                        i.m("No plugins were added to this builder. Use #usePlugin method to add them");
                        return null;
                    case 39:
                        return new wh7(sb1Var.a.a);
                    case 40:
                        return new m40(sb1Var.a.a, (kd6) sb1Var.s.get());
                    case 41:
                        Context context16 = sb1Var.a.a;
                        kd6 kd6Var4 = (kd6) sb1Var.s.get();
                        kd6Var4.getClass();
                        Object systemService = context16.getSystemService(Vibrator.class);
                        systemService.getClass();
                        Vibrator vibrator = (Vibrator) systemService;
                        if (Build.VERSION.SDK_INT >= 26) {
                            opVar = new op(vibrator, 0);
                        } else {
                            opVar = new op(vibrator, 1);
                        }
                        return new u87(opVar, kd6Var4);
                    case 42:
                        Context context17 = sb1Var.a.a;
                        su2 su2Var2 = (su2) sb1Var.w.get();
                        jd6 jd6Var4 = (jd6) sb1Var.e.get();
                        su2Var2.getClass();
                        jd6Var4.getClass();
                        return new ha3(context17, su2Var2, jd6Var4);
                    case 43:
                        Context context18 = sb1Var.a.a;
                        kd6 kd6Var5 = (kd6) sb1Var.s.get();
                        kd6Var5.getClass();
                        return new fb2(context18, kd6Var5);
                    case 44:
                        Context context19 = sb1Var.a.a;
                        kd6 kd6Var6 = (kd6) sb1Var.s.get();
                        nh4 nh4Var = (nh4) sb1Var.U.get();
                        fb2 fb2Var = (fb2) sb1Var.T.get();
                        db1 db1Var = (db1) sb1Var.V.get();
                        kd6Var6.getClass();
                        nh4Var.getClass();
                        fb2Var.getClass();
                        db1Var.getClass();
                        plVar = new fg(context19, kd6Var6, nh4Var, fb2Var, db1Var);
                        return plVar;
                    case 45:
                        return new Object();
                    case 46:
                        return new db1(sb1Var.a.a);
                    case 47:
                        vi viVar = (vi) sb1Var.Z.get();
                        fi fiVar = (fi) sb1Var.a0.get();
                        final cn5 cn5Var3 = (cn5) sb1Var.l.get();
                        viVar.getClass();
                        fiVar.getClass();
                        cn5Var3.getClass();
                        return new oj4(viVar, fiVar, new on2() { // from class: v34
                            @Override // defpackage.on2
                            public final Object c() {
                                boolean z;
                                int i6 = r2;
                                cn5 cn5Var4 = cn5Var3;
                                switch (i6) {
                                    case 0:
                                        z = cn5Var4.a().i;
                                        break;
                                    default:
                                        z = cn5Var4.a().h;
                                        break;
                                }
                                return Boolean.valueOf(z);
                            }
                        });
                    case Compress.DC20 /* 48 */:
                        vi viVar2 = (vi) sb1Var.Y.get();
                        viVar2.getClass();
                        return viVar2;
                    case 49:
                        return new vi((kh) sb1Var.X.get(), sb1Var.a.a);
                    case 50:
                        return new kh(sb1Var.a.a);
                    case 51:
                        return new fi();
                    case 52:
                        return new jf4(sb1Var.a.a);
                    case 53:
                        return new ve4(sb1Var.a.a);
                    case 54:
                        wi wiVar = (wi) sb1Var.f0.get();
                        wiVar.getClass();
                        return new ck4(wiVar);
                    case 55:
                        wi wiVar2 = (wi) sb1Var.e0.get();
                        wiVar2.getClass();
                        return wiVar2;
                    case 56:
                        return new wi((kh) sb1Var.X.get(), sb1Var.a.a);
                    case 57:
                        return new hn5(sb1Var.a.a);
                    case 58:
                        l85 l85Var3 = (l85) sb1Var.m.get();
                        oj4 oj4Var = (oj4) sb1Var.b0.get();
                        ck4 ck4Var = (ck4) sb1Var.g0.get();
                        final cn5 cn5Var4 = (cn5) sb1Var.l.get();
                        l85Var3.getClass();
                        oj4Var.getClass();
                        ck4Var.getClass();
                        cn5Var4.getClass();
                        return new vk6(new s35(l85Var3), oj4Var, ck4Var, new on2() { // from class: v34
                            @Override // defpackage.on2
                            public final Object c() {
                                boolean z;
                                int i6 = r2;
                                cn5 cn5Var42 = cn5Var4;
                                switch (i6) {
                                    case 0:
                                        z = cn5Var42.a().i;
                                        break;
                                    default:
                                        z = cn5Var42.a().h;
                                        break;
                                }
                                return Boolean.valueOf(z);
                            }
                        });
                    case 59:
                        Context context20 = sb1Var.a.a;
                        su2 su2Var3 = (su2) sb1Var.w.get();
                        jd6 jd6Var5 = (jd6) sb1Var.e.get();
                        su2Var3.getClass();
                        jd6Var5.getClass();
                        return new wa3(context20, su2Var3, jd6Var5);
                    case Compress.DC /* 60 */:
                        Context context21 = sb1Var.a.a;
                        c76 c76Var = (c76) sb1Var.M.get();
                        c76Var.getClass();
                        return new ne1(context21, c76Var);
                    case 61:
                        Context context22 = sb1Var.a.a;
                        wa3 wa3Var = (wa3) sb1Var.j0.get();
                        wa3Var.getClass();
                        return new bw5(context22, wa3Var);
                    case 62:
                        Context context23 = sb1Var.a.a;
                        yr2 yr2Var = (yr2) sb1Var.m0.get();
                        SharedPreferences sharedPreferences8 = (SharedPreferences) sb1Var.d.get();
                        yr2Var.getClass();
                        sharedPreferences8.getClass();
                        SharedPreferences sharedPreferences9 = context23.getSharedPreferences("preferences-github", 0);
                        sharedPreferences9.getClass();
                        return new bs2(context23, yr2Var, sharedPreferences8, sharedPreferences9);
                    case 63:
                        id3 id3Var3 = (id3) sb1Var.h.get();
                        id3Var3.getClass();
                        ArrayList arrayList8 = new ArrayList();
                        ArrayList arrayList9 = new ArrayList();
                        xh5 xh5Var = n34.d;
                        arrayList8.add(new e92(xk2.k("application/json"), new s35(id3Var3)));
                        h03 h03Var = new h03(0);
                        h03Var.e(null, "https://api.github.com");
                        i03 b = h03Var.b();
                        ArrayList arrayList10 = b.f;
                        if ("".equals(arrayList10.get(arrayList10.size() - 1))) {
                            xk4 xk4Var2 = new xk4();
                            pi piVar = jx4.a;
                            vs0 vs0Var = jx4.c;
                            ArrayList arrayList11 = new ArrayList(arrayList9);
                            List o = vs0Var.o(piVar);
                            arrayList11.addAll(o);
                            List p = vs0Var.p();
                            ArrayList arrayList12 = new ArrayList(arrayList8.size() + 1 + p.size());
                            arrayList12.add(new e90(0));
                            arrayList12.addAll(arrayList8);
                            arrayList12.addAll(p);
                            List unmodifiableList = Collections.unmodifiableList(arrayList12);
                            List unmodifiableList2 = Collections.unmodifiableList(arrayList11);
                            o.size();
                            pa paVar2 = new pa(xk4Var2, b, unmodifiableList, unmodifiableList2, piVar);
                            if (yr2.class.isInterface()) {
                                ArrayDeque arrayDeque = new ArrayDeque(1);
                                arrayDeque.add(yr2.class);
                                while (!arrayDeque.isEmpty()) {
                                    Class cls = (Class) arrayDeque.removeFirst();
                                    if (cls.getTypeParameters().length != 0) {
                                        StringBuilder sb = new StringBuilder("Type parameters are unsupported on ");
                                        sb.append(cls.getName());
                                        if (cls != yr2.class) {
                                            sb.append(" which is an interface of ");
                                            sb.append(yr2.class.getName());
                                        }
                                        throw new IllegalArgumentException(sb.toString());
                                    }
                                    Collections.addAll(arrayDeque, cls.getInterfaces());
                                }
                                Object newProxyInstance = Proxy.newProxyInstance(yr2.class.getClassLoader(), new Class[]{yr2.class}, new c31(paVar2));
                                newProxyInstance.getClass();
                                return (yr2) newProxyInstance;
                            }
                            i.h("API declarations must be interfaces.");
                            return null;
                        }
                        e41.w(b, "baseUrl must end in /: ");
                        return null;
                    case 64:
                        return new hs2(sb1Var.a.a);
                    case 65:
                        return new jm4();
                    default:
                        throw new AssertionError(i2);
                }
        }
    }
}
