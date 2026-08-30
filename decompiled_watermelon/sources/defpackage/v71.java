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
import defpackage.h03;
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
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: v71  reason: default package */
/* loaded from: classes.dex */
public final class v71 implements gw4 {
    public final /* synthetic */ int a;
    public final int b;
    public final Object c;

    public /* synthetic */ v71(int i, int i2, Object obj) {
        this.a = i2;
        this.c = obj;
        this.b = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, n75] */
    /* JADX WARN: Type inference failed for: r0v217, types: [java.lang.Object, au3] */
    /* JADX WARN: Type inference failed for: r0v259, types: [iw3] */
    /* JADX WARN: Type inference failed for: r1v16, types: [java.lang.Object, rc0] */
    /* JADX WARN: Type inference failed for: r1v92, types: [java.lang.Object, au3] */
    /* JADX WARN: Type inference failed for: r3v35, types: [java.util.concurrent.ThreadPoolExecutor, qn4] */
    /* JADX WARN: Type inference failed for: r3v51, types: [iw3] */
    /* JADX WARN: Type inference failed for: r4v25, types: [cu3, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v41, types: [pu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v21, types: [cu3, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v10, types: [ij7, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object, n75] */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.Object, tf0] */
    @Override // defpackage.fw4
    public final Object get() {
        Object p90Var;
        Object wa0Var;
        String string;
        Object dlVar;
        cp cpVar;
        int i = this.a;
        int i2 = this.b;
        Object obj = this.c;
        da0 da0Var = null;
        int i3 = 0;
        switch (i) {
            case 0:
                w71 w71Var = (w71) obj;
                switch (i2) {
                    case 0:
                        return new qe0((c63) w71Var.d.get());
                    case 1:
                        return ln2.h();
                    case 2:
                        return new tc0((jb0) w71Var.w.get());
                    case 3:
                        v71 v71Var = w71Var.v;
                        Context a = w71Var.a();
                        ct6 ct6Var = (ct6) w71Var.f.get();
                        qe0 qe0Var = (qe0) w71Var.e.get();
                        v71Var.getClass();
                        ct6Var.getClass();
                        qe0Var.getClass();
                        ee0 ee0Var = ((ge0) w71Var.a.B).d;
                        ee0Var.getClass();
                        Map map = ee0Var.a;
                        try {
                            Trace.beginSection("Initialize defaultCameraBackend");
                            p90 p90Var2 = (p90) v71Var.get();
                            Trace.endSection();
                            if (!map.containsKey(new ib0("CXCP-Camera2"))) {
                                Map o0 = zt3.o0(map, new ti4(new ib0("CXCP-Camera2"), new re0(p90Var2)));
                                if (o0.containsKey(new ib0("CXCP-Camera2"))) {
                                    return new jb0("CXCP-Camera2", o0, a, ct6Var, qe0Var);
                                }
                                StringBuilder sb = new StringBuilder("Failed to find ");
                                sb.append((Object) ib0.a("CXCP-Camera2"));
                                i.k(sb, " in the list of available CameraPipe backends! Available values are ", o0.keySet());
                                return null;
                            }
                            i.m(ib0.a("CXCP-Camera2"), ". Use CameraBackendConfig#internalBackend field instead.", "CameraBackendConfig#cameraBackends should not contain a backend with ");
                            return null;
                        } catch (Throwable th) {
                            Trace.endSection();
                            throw th;
                        }
                    case 4:
                        p90Var = new p90((ct6) w71Var.f.get(), (wa0) w71Var.k.get(), (db0) w71Var.n.get(), (ww4) w71Var.u.get(), new t71(0, w71Var), w71Var.a());
                        return p90Var;
                    case 5:
                        xn1 xn1Var = w71Var.b;
                        qe0 qe0Var2 = (qe0) w71Var.e.get();
                        c63 c63Var = (c63) w71Var.d.get();
                        int i4 = xn1Var.X;
                        qe0Var2.getClass();
                        c63Var.getClass();
                        ArrayList arrayList = new ArrayList();
                        ((ie0) xn1Var.Y).getClass();
                        ThreadFactory threadFactory = dm.b;
                        ScheduledExecutorService a2 = dm.a(new am(i4, dm.b(threadFactory, "CXCP-IO-")), 8);
                        arrayList.add(a2);
                        g31 n = w81.n(a2);
                        ScheduledExecutorService a3 = dm.a(new am(i4, dm.b(threadFactory, "CXCP-BG-")), xn1Var.L);
                        arrayList.add(a3);
                        g31 n2 = w81.n(a3);
                        ScheduledExecutorService a4 = dm.a(new am(xn1Var.R, dm.b(threadFactory, "CXCP-")), xn1Var.B);
                        arrayList.add(a4);
                        g31 n3 = w81.n(a4);
                        qe0Var2.a(ne0.THREAD, new nb1(1, arrayList));
                        ss6 ss6Var = new ss6(xn1Var, qe0Var2, 0);
                        ss6 ss6Var2 = new ss6(xn1Var, qe0Var2, 1);
                        ?? obj2 = new Object();
                        ?? obj3 = new Object();
                        obj2.A = iq2.c(se.O(new e63(c63Var), n3).C(new j31("CXCP")));
                        obj3.A = iq2.c(se.O(new e63(c63Var), new j31("CXCP-Dispatch")));
                        qe0Var2.a(ne0.SCOPE, new xc4(6, obj2, obj3));
                        return new ct6((o31) obj2.A, (o31) obj3.A, a2, n, a3, n2, a4, n3, ss6Var, ss6Var2);
                    case ig7.b /* 6 */:
                        wa0Var = new wa0(w71Var.g, (ct6) w71Var.f.get(), w71Var.a(), (PackageManager) w71Var.h.get(), (ab0) w71Var.i.get(), w71Var.j, (qe0) w71Var.e.get(), (c63) w71Var.d.get());
                        return wa0Var;
                    case 7:
                        Object systemService = w71Var.a().getSystemService("camera");
                        systemService.getClass();
                        return (CameraManager) systemService;
                    case 8:
                        PackageManager packageManager = w71Var.a().getPackageManager();
                        packageManager.getClass();
                        return packageManager;
                    case 9:
                        return new ab0();
                    case 10:
                        Context a5 = w71Var.a();
                        ?? obj4 = new Object();
                        if (Build.VERSION.SDK_INT >= 35) {
                            obj4.b = new da0(a5);
                        }
                        try {
                            ServiceInfo[] serviceInfoArr = a5.getPackageManager().getPackageInfo(a5.getPackageName(), 132).services;
                            if (serviceInfoArr != null) {
                                int length = serviceInfoArr.length;
                                String str = null;
                                while (i3 < length) {
                                    Bundle bundle = serviceInfoArr[i3].metaData;
                                    if (bundle != null && (string = bundle.getString("androidx.camera.featurecombinationquery.PLAY_SERVICES_IMPL_PROVIDER_KEY")) != null) {
                                        if (str == null) {
                                            str = string;
                                        } else {
                                            i.n("Multiple Play Services CameraDeviceSetupCompat implementations found in the manifest.");
                                            return null;
                                        }
                                    }
                                    i3++;
                                }
                                if (str != null) {
                                    try {
                                        da0Var = (da0) Class.forName(str).getConstructor(Context.class).newInstance(a5);
                                    } catch (Exception e) {
                                        throw new IllegalStateException("Failed to instantiate Play Services CameraDeviceSetupCompat implementation", e);
                                    }
                                }
                            }
                        } catch (PackageManager.NameNotFoundException unused) {
                        }
                        obj4.a = da0Var;
                        return obj4;
                    case 11:
                        Context a6 = w71Var.a();
                        ct6 ct6Var2 = (ct6) w71Var.f.get();
                        qm4 qm4Var = (qm4) w71Var.l.get();
                        q03 q03Var = ((ge0) w71Var.a.B).c;
                        nk2.t(q03Var);
                        wa0Var = new db0(a6, ct6Var2, qm4Var, q03Var, (cm6) w71Var.m.get());
                        return wa0Var;
                    case mj2.L /* 12 */:
                        return new qm4(w71Var.a());
                    case 13:
                        return new Object();
                    case 14:
                        p90Var = new ww4((qm4) w71Var.l.get(), (pf5) w71Var.s.get(), (ya0) w71Var.t.get(), (ab0) w71Var.i.get(), (ct6) w71Var.f.get());
                        return p90Var;
                    case ig7.e /* 15 */:
                        gw4 gw4Var = w71Var.g;
                        bq0 bq0Var = w71Var.a;
                        q03 q03Var2 = new q03(gw4Var, (ct6) w71Var.f.get());
                        db0 db0Var = (db0) w71Var.n.get();
                        ab0 ab0Var = (ab0) w71Var.i.get();
                        fb0 fb0Var = (fb0) w71Var.p.get();
                        cm6 cm6Var = (cm6) w71Var.m.get();
                        fe0 fe0Var = ((ge0) bq0Var.B).e;
                        nk2.t(fe0Var);
                        ct6 ct6Var3 = (ct6) w71Var.f.get();
                        db0Var.getClass();
                        ab0Var.getClass();
                        fb0Var.getClass();
                        cm6Var.getClass();
                        ct6Var3.getClass();
                        ?? obj5 = new Object();
                        obj5.A = q03Var2;
                        obj5.B = db0Var;
                        obj5.L = ab0Var;
                        obj5.R = fb0Var;
                        obj5.X = cm6Var;
                        obj5.Y = fe0Var;
                        obj5.Z = ct6Var3;
                        obj5.c0 = new gs0();
                        ab0 ab0Var2 = (ab0) w71Var.i.get();
                        q9 q9Var = new q9(w71Var.g, (ct6) w71Var.f.get(), (c63) w71Var.d.get());
                        cm6 cm6Var2 = (cm6) w71Var.m.get();
                        rf rfVar = (rf) w71Var.q.get();
                        jw jwVar = (jw) w71Var.r.get();
                        fe0 fe0Var2 = ((ge0) bq0Var.B).e;
                        nk2.t(fe0Var2);
                        wa0Var = new pf5(obj5, ab0Var2, q9Var, cm6Var2, rfVar, jwVar, fe0Var2, (ct6) w71Var.f.get());
                        return wa0Var;
                    case 16:
                        return new fb0((db0) w71Var.n.get(), (tg6) w71Var.o.get());
                    case 17:
                        nk2.t(((ge0) w71Var.a.B).f);
                        return new Object();
                    case 18:
                        Object systemService2 = w71Var.a().getSystemService("device_policy");
                        systemService2.getClass();
                        return new rf((DevicePolicyManager) systemService2);
                    case 19:
                        return new jw((ct6) w71Var.f.get(), (qe0) w71Var.e.get(), (c63) w71Var.d.get());
                    case 20:
                        return new ya0((ct6) w71Var.f.get(), (fb0) w71Var.p.get(), (pf5) w71Var.s.get());
                    case 21:
                        w71Var.a();
                        ((ct6) w71Var.f.get()).getClass();
                        ((jb0) w71Var.w.get()).getClass();
                        return new Object();
                    case 22:
                        return new fg0();
                    case 23:
                        return new aw0();
                    default:
                        throw new AssertionError(i2);
                }
            default:
                b81 b81Var = (b81) obj;
                switch (i2) {
                    case 0:
                        return new a81(this, 0);
                    case 1:
                        Context context = b81Var.a.A;
                        MelonDatabase melonDatabase = (MelonDatabase) b81Var.c.get();
                        v16 v16Var = (v16) b81Var.e.get();
                        melonDatabase.getClass();
                        v16Var.getClass();
                        return new nq5(context, melonDatabase, v16Var);
                    case 2:
                        Context context2 = b81Var.a.A;
                        Set<qq5> singleton = Collections.singleton(new Object());
                        singleton.getClass();
                        pq5 I = nl2.I(context2, MelonDatabase.class, "melon-database");
                        for (qq5 qq5Var : singleton) {
                            qq5Var.getClass();
                            I.d.add(qq5Var);
                        }
                        I.a(new qy3(1, 2, 12), new qy3(4, 5, 13), new qy3(5, 6, 14), new qy3(7, 8, 15), new qy3(8, 9, 16));
                        return (MelonDatabase) I.b();
                    case 3:
                        Context context3 = b81Var.a.A;
                        SharedPreferences sharedPreferences = (SharedPreferences) b81Var.d.get();
                        MelonDatabase melonDatabase2 = (MelonDatabase) b81Var.c.get();
                        sharedPreferences.getClass();
                        melonDatabase2.getClass();
                        return new v16(context3, sharedPreferences, melonDatabase2);
                    case 4:
                        Context context4 = b81Var.a.A;
                        SharedPreferences sharedPreferences2 = context4.getSharedPreferences(ts4.b(context4), 0);
                        sharedPreferences2.getClass();
                        return sharedPreferences2;
                    case 5:
                        return new a81(this, 1);
                    case ig7.b /* 6 */:
                        az4 az4Var = (az4) b81Var.m.get();
                        MelonDatabase melonDatabase3 = (MelonDatabase) b81Var.c.get();
                        melonDatabase3.getClass();
                        b74 b74Var = new b74(melonDatabase3.r());
                        vj vjVar = (vj) b81Var.i.get();
                        xj xjVar = (xj) b81Var.j.get();
                        SharedPreferences sharedPreferences3 = (SharedPreferences) b81Var.d.get();
                        id5 id5Var = (id5) b81Var.l.get();
                        Context context5 = b81Var.a.A;
                        az4Var.getClass();
                        vjVar.getClass();
                        xjVar.getClass();
                        sharedPreferences3.getClass();
                        id5Var.getClass();
                        dlVar = new dl(az4Var, b74Var, vjVar, xjVar, sharedPreferences3, context5, id5Var);
                        break;
                    case 7:
                        kw3 kw3Var = new kw3(b81Var.a.A);
                        yb4 yb4Var = new yb4();
                        yb4Var.c.add(kw3Var);
                        yb4Var.i = false;
                        yb4Var.j = false;
                        zb4 zb4Var = new zb4(yb4Var);
                        t63 t63Var = (t63) b81Var.h.get();
                        vj vjVar2 = (vj) b81Var.i.get();
                        xj xjVar2 = (xj) b81Var.j.get();
                        sj sjVar = (sj) b81Var.k.get();
                        id5 id5Var2 = (id5) b81Var.l.get();
                        t63Var.getClass();
                        vjVar2.getClass();
                        xjVar2.getClass();
                        sjVar.getClass();
                        id5Var2.getClass();
                        return new az4(zb4Var, t63Var, vjVar2, xjVar2, sjVar, id5Var2);
                    case 8:
                        return oo2.d(new k4(12));
                    case 9:
                        SharedPreferences sharedPreferences4 = (SharedPreferences) b81Var.d.get();
                        sharedPreferences4.getClass();
                        return new vj(sharedPreferences4);
                    case 10:
                        SharedPreferences sharedPreferences5 = (SharedPreferences) b81Var.d.get();
                        sharedPreferences5.getClass();
                        return new xj(sharedPreferences5);
                    case 11:
                        return new Object();
                    case mj2.L /* 12 */:
                        SharedPreferences sharedPreferences6 = (SharedPreferences) b81Var.d.get();
                        sharedPreferences6.getClass();
                        return new id5(sharedPreferences6);
                    case 13:
                        return new a81(this, 2);
                    case 14:
                        return new gf5(b81Var.a.A, (SharedPreferences) b81Var.d.get());
                    case ig7.e /* 15 */:
                        Context context6 = b81Var.a.A;
                        SharedPreferences sharedPreferences7 = (SharedPreferences) b81Var.d.get();
                        ?? obj6 = new Object();
                        t63 t63Var2 = (t63) b81Var.h.get();
                        w37 w37Var = (w37) b81Var.r.get();
                        v16 v16Var2 = (v16) b81Var.e.get();
                        gf5 gf5Var = (gf5) b81Var.p.get();
                        sharedPreferences7.getClass();
                        t63Var2.getClass();
                        w37Var.getClass();
                        v16Var2.getClass();
                        gf5Var.getClass();
                        bb1 bb1Var = tg1.a;
                        dlVar = new b56(context6, sharedPreferences7, obj6, t63Var2, w37Var, iq2.c(ha1.L), v16Var2, gf5Var);
                        break;
                    case 16:
                        return new bv0(b81Var.a.A, 0);
                    case 17:
                        Context context7 = b81Var.a.A;
                        ap apVar = (ap) b81Var.u.get();
                        apVar.getClass();
                        return new vm5(context7, apVar);
                    case 18:
                        Context context8 = b81Var.a.A;
                        w37 w37Var2 = (w37) b81Var.r.get();
                        o54 o54Var = (o54) b81Var.t.get();
                        w37Var2.getClass();
                        o54Var.getClass();
                        return new ap(context8, w37Var2, o54Var);
                    case 19:
                        Context context9 = b81Var.a.A;
                        w16 w16Var = (w16) b81Var.s.get();
                        w16Var.getClass();
                        return new o54(context9, w16Var);
                    case 20:
                        Context context10 = b81Var.a.A;
                        qo2 qo2Var = (qo2) b81Var.w.get();
                        w16 w16Var2 = (w16) b81Var.s.get();
                        ap apVar2 = (ap) b81Var.u.get();
                        w37 w37Var3 = (w37) b81Var.r.get();
                        v16 v16Var3 = (v16) b81Var.e.get();
                        qo2Var.getClass();
                        w16Var2.getClass();
                        apVar2.getClass();
                        w37Var3.getClass();
                        v16Var3.getClass();
                        dlVar = new d72(context10, qo2Var, w16Var2, apVar2, w37Var3, v16Var3);
                        break;
                    case 21:
                        ro2 ro2Var = new ro2();
                        ro2Var.f.add(new cy6(new z37(), null, false, Uri.class));
                        ro2Var.c(n11.class, new p11());
                        ro2Var.c(h03.b.class, new zz2());
                        return new qo2(ro2Var);
                    case 22:
                        return new uf1(b81Var.a.A);
                    case 23:
                        return new wp2(b81Var.a.A);
                    case 24:
                        return new ss(b81Var.a.A, (w16) b81Var.s.get());
                    case 25:
                        w16 w16Var3 = (w16) b81Var.s.get();
                        et5 et5Var = (et5) b81Var.C.get();
                        w37 w37Var4 = (w37) b81Var.r.get();
                        w16Var3.getClass();
                        et5Var.getClass();
                        w37Var4.getClass();
                        return new e72(w16Var3, et5Var, w37Var4);
                    case 26:
                        Context context11 = b81Var.a.A;
                        nn4 nn4Var = (nn4) b81Var.B.get();
                        nn4Var.getClass();
                        return new et5(context11, nn4Var);
                    case 27:
                        Context applicationContext = b81Var.a.A.getApplicationContext();
                        ka3 ka3Var = new ka3(applicationContext, 19);
                        ka3 ka3Var2 = new ka3(applicationContext, 11);
                        ?? threadPoolExecutor = new ThreadPoolExecutor(3, 3, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new jr2(2));
                        af6 af6Var = new af6(ka3Var2);
                        return new nn4(applicationContext, new qg1(applicationContext, threadPoolExecutor, nn4.i, ka3Var, ka3Var2, af6Var), ka3Var2, af6Var);
                    case 28:
                        Context context12 = b81Var.a.A;
                        tz tzVar = (tz) b81Var.E.get();
                        tzVar.getClass();
                        jq0 jq0Var = new jq0(0, tzVar);
                        vm5 vm5Var = (vm5) b81Var.v.get();
                        vm5Var.getClass();
                        jq0 jq0Var2 = new jq0(1, vm5Var);
                        ka kaVar = new ka(context12);
                        ArrayList arrayList2 = new ArrayList();
                        ArrayList arrayList3 = new ArrayList();
                        ArrayList arrayList4 = new ArrayList();
                        ArrayList arrayList5 = new ArrayList();
                        ArrayList arrayList6 = new ArrayList();
                        arrayList3.add(new ti4(new l70(1), URL.class));
                        arrayList5.add(new ti4(jq0Var, vy.class));
                        arrayList5.add(new ti4(jq0Var2, rg5.class));
                        kaVar.Y = new ct0(pu.K(arrayList2), pu.K(arrayList3), pu.K(arrayList4), pu.K(arrayList5), pu.K(arrayList6));
                        kaVar.R = new il6(new vg0(context12, 1));
                        kaVar.X = new il6(new vg0(context12, 2));
                        i41 i41Var = new i41(100);
                        ab1 ab1Var = (ab1) kaVar.L;
                        kaVar.L = new ab1(ab1Var.a, ab1Var.b, ab1Var.c, ab1Var.d, i41Var, ab1Var.f, ab1Var.g, ab1Var.h, ab1Var.i, ab1Var.j, ab1Var.k, ab1Var.l, ab1Var.m, ab1Var.n, ab1Var.o);
                        return kaVar.e();
                    case 29:
                        return new tz(b81Var.a.A);
                    case 30:
                        return new ns();
                    case 31:
                        Context context13 = b81Var.a.A;
                        if (b53.x(Build.MANUFACTURER, "AYN") && b53.x(Build.MODEL, "AYN Thor")) {
                            return new le1(context13);
                        }
                        return new le1(context13);
                    case 32:
                        return new pm4(b81Var.a.A);
                    case 33:
                        return new a50(b81Var.a.A);
                    case 34:
                        return new o26(b81Var.a.A);
                    case 35:
                        return new q26(b81Var.a.A);
                    case 36:
                        return new pv5(b81Var.a.A);
                    case 37:
                        return new rp5(b81Var.a.A, (w16) b81Var.s.get(), (w37) b81Var.r.get());
                    case 38:
                        Context context14 = b81Var.a.A;
                        ((nn4) b81Var.B.get()).getClass();
                        ArrayList arrayList7 = new ArrayList(3);
                        TextView.BufferType bufferType = TextView.BufferType.SPANNABLE;
                        arrayList7.add(new e21());
                        arrayList7.add(new rn4());
                        arrayList7.add(new Object());
                        if (!arrayList7.isEmpty()) {
                            n85 n85Var = new n85(arrayList7);
                            int size = arrayList7.size();
                            int i5 = 0;
                            while (i5 < size) {
                                Object obj7 = arrayList7.get(i5);
                                i5++;
                                n85Var.a((a1) obj7);
                            }
                            ArrayList arrayList8 = (ArrayList) n85Var.L;
                            q9 q9Var2 = new q9(15);
                            float f = context14.getResources().getDisplayMetrics().density;
                            ?? obj8 = new Object();
                            obj8.d = (int) ((8.0f * f) + 0.5f);
                            obj8.a = (int) ((24.0f * f) + 0.5f);
                            int i6 = (int) ((4.0f * f) + 0.5f);
                            obj8.b = i6;
                            int i7 = (int) ((1.0f * f) + 0.5f);
                            obj8.c = i7;
                            obj8.e = i7;
                            obj8.f = i6;
                            ?? obj9 = new Object();
                            u93 u93Var = new u93(2);
                            u93 u93Var2 = new u93(1);
                            int size2 = arrayList8.size();
                            while (i3 < size2) {
                                Object obj10 = arrayList8.get(i3);
                                i3++;
                                a1 a1Var = (a1) obj10;
                                a1Var.getClass();
                                a1Var.b(obj9);
                                a1Var.d(u93Var);
                                a1Var.c(u93Var2);
                            }
                            ?? obj11 = new Object();
                            obj11.a = obj8.a;
                            obj11.b = obj8.b;
                            obj11.c = obj8.c;
                            obj11.d = obj8.d;
                            obj11.e = obj8.e;
                            obj11.f = obj8.f;
                            ee0 ee0Var2 = new ee0(Collections.unmodifiableMap(u93Var2.a));
                            obj9.a = obj11;
                            obj9.g = ee0Var2;
                            if (obj9.b == null) {
                                obj9.b = new Object();
                            }
                            if (obj9.c == null) {
                                obj9.c = new so1(24);
                            }
                            if (obj9.d == null) {
                                obj9.d = new vn1(12);
                            }
                            if (obj9.e == null) {
                                obj9.e = new so1(7);
                            }
                            if (obj9.f == null) {
                                obj9.f = new vn1(8);
                            }
                            ?? obj12 = new Object();
                            obj12.a = obj9.a;
                            obj12.b = obj9.b;
                            obj12.c = obj9.c;
                            obj12.d = obj9.d;
                            obj12.e = obj9.e;
                            obj12.f = obj9.f;
                            obj12.g = obj9.g;
                            return new bu3(new q9(q9Var2), new ci3(3, u93Var, (Object) obj12), Collections.unmodifiableList(arrayList8));
                        }
                        i.n("No plugins were added to this builder. Use #usePlugin method to add them");
                        return null;
                    case 39:
                        return new y37(b81Var.a.A);
                    case 40:
                        Context context15 = b81Var.a.A;
                        w16 w16Var4 = (w16) b81Var.s.get();
                        w16Var4.getClass();
                        Object systemService3 = context15.getSystemService(Vibrator.class);
                        systemService3.getClass();
                        Vibrator vibrator = (Vibrator) systemService3;
                        if (Build.VERSION.SDK_INT >= 26) {
                            cpVar = new cp(vibrator, 0);
                        } else {
                            cpVar = new cp(vibrator, 1);
                        }
                        return new hw6(cpVar, w16Var4);
                    case 41:
                        Context context16 = b81Var.a.A;
                        qo2 qo2Var2 = (qo2) b81Var.w.get();
                        v16 v16Var4 = (v16) b81Var.e.get();
                        qo2Var2.getClass();
                        v16Var4.getClass();
                        return new z33(context16, qo2Var2, v16Var4);
                    case 42:
                        Context context17 = b81Var.a.A;
                        w16 w16Var5 = (w16) b81Var.s.get();
                        w16Var5.getClass();
                        return new l62(context17, w16Var5);
                    case 43:
                        Context context18 = b81Var.a.A;
                        w16 w16Var6 = (w16) b81Var.s.get();
                        w84 w84Var = (w84) b81Var.T.get();
                        l62 l62Var = (l62) b81Var.S.get();
                        w16Var6.getClass();
                        w84Var.getClass();
                        l62Var.getClass();
                        return new qf(context18, w16Var6, w84Var, l62Var);
                    case 44:
                        return new Object();
                    case 45:
                        ji jiVar = (ji) b81Var.X.get();
                        th thVar = (th) b81Var.Y.get();
                        final id5 id5Var3 = (id5) b81Var.l.get();
                        jiVar.getClass();
                        thVar.getClass();
                        id5Var3.getClass();
                        return new ra4(jiVar, thVar, new ki2() { // from class: iw3
                            @Override // defpackage.ki2
                            public final Object c() {
                                boolean z;
                                int i8 = r2;
                                id5 id5Var4 = id5Var3;
                                switch (i8) {
                                    case 0:
                                        z = id5Var4.a().i;
                                        break;
                                    default:
                                        z = id5Var4.a().h;
                                        break;
                                }
                                return Boolean.valueOf(z);
                            }
                        });
                    case 46:
                        ji jiVar2 = (ji) b81Var.W.get();
                        jiVar2.getClass();
                        return jiVar2;
                    case 47:
                        return new ji((yg) b81Var.V.get(), b81Var.a.A);
                    case 48:
                        return new yg(b81Var.a.A);
                    case 49:
                        return new th();
                    case 50:
                        return new u64(b81Var.a.A);
                    case 51:
                        return new h64(b81Var.a.A);
                    case 52:
                        ki kiVar = (ki) b81Var.d0.get();
                        kiVar.getClass();
                        return new fb4(kiVar);
                    case 53:
                        ki kiVar2 = (ki) b81Var.c0.get();
                        kiVar2.getClass();
                        return kiVar2;
                    case 54:
                        return new ki((yg) b81Var.V.get(), b81Var.a.A);
                    case 55:
                        return new md5(b81Var.a.A);
                    case 56:
                        az4 az4Var2 = (az4) b81Var.m.get();
                        ra4 ra4Var = (ra4) b81Var.Z.get();
                        fb4 fb4Var = (fb4) b81Var.e0.get();
                        final id5 id5Var4 = (id5) b81Var.l.get();
                        az4Var2.getClass();
                        ra4Var.getClass();
                        fb4Var.getClass();
                        id5Var4.getClass();
                        return new g96(new dz4(az4Var2), ra4Var, fb4Var, new ki2() { // from class: iw3
                            @Override // defpackage.ki2
                            public final Object c() {
                                boolean z;
                                int i8 = r2;
                                id5 id5Var42 = id5Var4;
                                switch (i8) {
                                    case 0:
                                        z = id5Var42.a().i;
                                        break;
                                    default:
                                        z = id5Var42.a().h;
                                        break;
                                }
                                return Boolean.valueOf(z);
                            }
                        });
                    case 57:
                        Context context19 = b81Var.a.A;
                        qo2 qo2Var3 = (qo2) b81Var.w.get();
                        v16 v16Var5 = (v16) b81Var.e.get();
                        qo2Var3.getClass();
                        v16Var5.getClass();
                        return new k43(context19, qo2Var3, v16Var5);
                    case 58:
                        Context context20 = b81Var.a.A;
                        pv5 pv5Var = (pv5) b81Var.M.get();
                        pv5Var.getClass();
                        return new ra1(context20, pv5Var);
                    case 59:
                        Context context21 = b81Var.a.A;
                        k43 k43Var = (k43) b81Var.h0.get();
                        k43Var.getClass();
                        return new ml5(context21, k43Var);
                    case 60:
                        Context context22 = b81Var.a.A;
                        tl2 tl2Var = (tl2) b81Var.k0.get();
                        SharedPreferences sharedPreferences8 = (SharedPreferences) b81Var.d.get();
                        tl2Var.getClass();
                        sharedPreferences8.getClass();
                        SharedPreferences sharedPreferences9 = context22.getSharedPreferences("preferences-github", 0);
                        sharedPreferences9.getClass();
                        return new wl2(context22, tl2Var, sharedPreferences8, sharedPreferences9);
                    case 61:
                        t63 t63Var3 = (t63) b81Var.h.get();
                        t63Var3.getClass();
                        ArrayList arrayList9 = new ArrayList();
                        ArrayList arrayList10 = new ArrayList();
                        h85 h85Var = cw3.d;
                        arrayList9.add(new m42(hi2.n("application/json"), new dz4(t63Var3)));
                        gu2 gu2Var = new gu2(0);
                        gu2Var.e(null, "https://api.github.com");
                        hu2 b = gu2Var.b();
                        ArrayList arrayList11 = b.f;
                        if ("".equals(arrayList11.get(arrayList11.size() - 1))) {
                            zb4 zb4Var2 = new zb4();
                            di diVar = eo4.a;
                            k45 k45Var = eo4.c;
                            ArrayList arrayList12 = new ArrayList(arrayList10);
                            List f2 = k45Var.f(diVar);
                            arrayList12.addAll(f2);
                            List j = k45Var.j();
                            ArrayList arrayList13 = new ArrayList(arrayList9.size() + 1 + j.size());
                            arrayList13.add(new z60(0));
                            arrayList13.addAll(arrayList9);
                            arrayList13.addAll(j);
                            List unmodifiableList = Collections.unmodifiableList(arrayList13);
                            List unmodifiableList2 = Collections.unmodifiableList(arrayList12);
                            f2.size();
                            ka kaVar2 = new ka(zb4Var2, b, unmodifiableList, unmodifiableList2, diVar);
                            if (tl2.class.isInterface()) {
                                ArrayDeque arrayDeque = new ArrayDeque(1);
                                arrayDeque.add(tl2.class);
                                while (!arrayDeque.isEmpty()) {
                                    Class cls = (Class) arrayDeque.removeFirst();
                                    if (cls.getTypeParameters().length != 0) {
                                        StringBuilder sb2 = new StringBuilder("Type parameters are unsupported on ");
                                        sb2.append(cls.getName());
                                        if (cls != tl2.class) {
                                            sb2.append(" which is an interface of ");
                                            sb2.append(tl2.class.getName());
                                        }
                                        throw new IllegalArgumentException(sb2.toString());
                                    }
                                    Collections.addAll(arrayDeque, cls.getInterfaces());
                                }
                                Object newProxyInstance = Proxy.newProxyInstance(tl2.class.getClassLoader(), new Class[]{tl2.class}, new xz0(kaVar2));
                                newProxyInstance.getClass();
                                return (tl2) newProxyInstance;
                            }
                            i.i("API declarations must be interfaces.");
                            return null;
                        }
                        f81.x(b, "baseUrl must end in /: ");
                        return null;
                    case 62:
                        return new cm2(b81Var.a.A);
                    default:
                        throw new AssertionError(i2);
                }
                return dlVar;
        }
    }
}
