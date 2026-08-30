package defpackage;

import android.content.Context;
import android.os.Trace;
import android.util.Log;
import android.view.textclassifier.TextClassificationContext;
import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import me.magnum.melonds.MelonEmulator;
import me.magnum.melonds.domain.model.VideoRenderer;
import me.magnum.melonds.ui.romdetails.RomDetailsActivity;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: x3  reason: default package */
/* loaded from: classes.dex */
public final class x3 extends nk6 implements aj2 {
    public final /* synthetic */ int X;
    public final /* synthetic */ Object Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x3(j11 j11Var, Object obj, int i) {
        super(2, j11Var);
        this.X = i;
        this.Y = obj;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        int i = this.X;
        o27 o27Var = o27.a;
        switch (i) {
            case 0:
                ((x3) t((j11) obj2, (o31) obj)).v(o27Var);
                return o27Var;
            case 1:
                ((x3) t((j11) obj2, (o31) obj)).v(o27Var);
                return o27Var;
            case 2:
                return ((x3) t((j11) obj2, (o31) obj)).v(o27Var);
            case 3:
                return ((x3) t((j11) obj2, (o31) obj)).v(o27Var);
            case 4:
                ((x3) t((j11) obj2, (o31) obj)).v(o27Var);
                return o27Var;
            case 5:
                ((x3) t((j11) obj2, (sz0) obj)).v(o27Var);
                return o27Var;
            case ig7.b /* 6 */:
                ((x3) t((j11) obj2, (o31) obj)).v(o27Var);
                return o27Var;
            case 7:
                ((x3) t((j11) obj2, (o31) obj)).v(o27Var);
                return o27Var;
            case 8:
                return ((x3) t((j11) obj2, (o31) obj)).v(o27Var);
            case 9:
                return ((x3) t((j11) obj2, (o31) obj)).v(o27Var);
            case 10:
                ((x3) t((j11) obj2, (o31) obj)).v(o27Var);
                return o27Var;
            case 11:
                return ((x3) t((j11) obj2, (o31) obj)).v(o27Var);
            case mj2.L /* 12 */:
                ((x3) t((j11) obj2, (o27) obj)).v(o27Var);
                return o27Var;
            case 13:
                ((x3) t((j11) obj2, (o31) obj)).v(o27Var);
                return o27Var;
            case 14:
                ((x3) t((j11) obj2, (o31) obj)).v(o27Var);
                return o27Var;
            case ig7.e /* 15 */:
                ((x3) t((j11) obj2, (o31) obj)).v(o27Var);
                return o27Var;
            case 16:
                ((x3) t((j11) obj2, (o31) obj)).v(o27Var);
                return o27Var;
            case 17:
                ((x3) t((j11) obj2, (o31) obj)).v(o27Var);
                return o27Var;
            default:
                ((x3) t((j11) obj2, (o31) obj)).v(o27Var);
                return o27Var;
        }
    }

    @Override // defpackage.m00
    public final j11 t(j11 j11Var, Object obj) {
        int i = this.X;
        Object obj2 = this.Y;
        switch (i) {
            case 0:
                return new x3((os) obj2, j11Var, 0);
            case 1:
                return new x3((ct1) obj2, j11Var, 1);
            case 2:
                return new x3((ArrayList) obj2, j11Var, 2);
            case 3:
                return new x3((File) obj2, j11Var, 3);
            case 4:
                return new x3((qi0) obj2, j11Var, 4);
            case 5:
                return new x3((xh7) obj2, j11Var, 5);
            case ig7.b /* 6 */:
                return new x3((w61) obj2, j11Var, 6);
            case 7:
                return new x3(j11Var, (pc1) obj2, 7);
            case 8:
                return new x3((hg1) obj2, j11Var, 8);
            case 9:
                return new x3((VideoRenderer) obj2, j11Var, 9);
            case 10:
                return new x3((z33) obj2, j11Var, 10);
            case 11:
                return new x3((vo4) obj2, j11Var, 11);
            case mj2.L /* 12 */:
                return new x3((n75) obj2, j11Var, 12);
            case 13:
                return new x3((RomDetailsActivity) obj2, j11Var, 13);
            case 14:
                return new x3((d16) obj2, j11Var, 14);
            case ig7.e /* 15 */:
                return new x3((v16) obj2, j11Var, 15);
            case 16:
                return new x3((ki2) obj2, j11Var, 16);
            case 17:
                return new x3(j11Var, (k47) obj2, 17);
            default:
                return new x3((l24) obj2, j11Var, 18);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v41, types: [g76, java.lang.Object] */
    @Override // defpackage.m00
    public final Object v(Object obj) {
        Object obj2;
        w25 w25Var;
        Object obj3;
        String str;
        TextClassificationContext build;
        TextClassifier createTextClassificationSession;
        z06 z06Var;
        d16 d16Var;
        gs0 gs0Var;
        Object obj4;
        int i = 4;
        boolean z = false;
        Long l = null;
        switch (this.X) {
            case 0:
                p31 p31Var = p31.COROUTINE_SUSPENDED;
                me2.a0(obj);
                os osVar = (os) this.Y;
                if (((Boolean) ((tj4) osVar.R).getValue()).booleanValue()) {
                    ((ki2) osVar.B).c();
                } else {
                    ((n24) osVar.L).c.setValue(Boolean.TRUE);
                }
                return o27.a;
            case 1:
                p31 p31Var2 = p31.COROUTINE_SUSPENDED;
                me2.a0(obj);
                ct1 ct1Var = (ct1) this.Y;
                ee6 ee6Var = ct1Var.d;
                lp5 lp5Var = lp5.a;
                ee6Var.getClass();
                ee6Var.l(null, lp5Var);
                ct1Var.m();
                return o27.a;
            case 2:
                pp1 pp1Var = pp1.A;
                p31 p31Var3 = p31.COROUTINE_SUSPENDED;
                me2.a0(obj);
                long[] retryPendingRetroAchievementsSubmissions = MelonEmulator.a.retryPendingRetroAchievementsSubmissions(tq0.o1((ArrayList) this.Y));
                if (retryPendingRetroAchievementsSubmissions != null && retryPendingRetroAchievementsSubmissions.length >= 4) {
                    long j = retryPendingRetroAchievementsSubmissions[0];
                    long j2 = retryPendingRetroAchievementsSubmissions[1];
                    long j3 = retryPendingRetroAchievementsSubmissions[2];
                    long j4 = retryPendingRetroAchievementsSubmissions[3];
                    if (j > 0 && 0 <= j2 && j2 < 2147483648L && 0 <= j3 && j3 < 2147483648L && 0 <= j4 && j4 < 2 && retryPendingRetroAchievementsSubmissions.length == (j3 * 4) + 4) {
                        if (j4 == 1) {
                            return new u25(j, (int) j2, pp1Var, true);
                        }
                        int i2 = (int) j3;
                        ArrayList arrayList = new ArrayList(i2);
                        int i3 = 4;
                        int i4 = 0;
                        while (i4 < i2) {
                            long j5 = retryPendingRetroAchievementsSubmissions[i3];
                            long j6 = retryPendingRetroAchievementsSubmissions[i3 + 1];
                            int i5 = i3 + 3;
                            long j7 = retryPendingRetroAchievementsSubmissions[i3 + 2];
                            i3 += i;
                            long j8 = retryPendingRetroAchievementsSubmissions[i5];
                            Long valueOf = Long.valueOf(j6);
                            if (-2147483648L > j6 || j6 >= 2147483648L) {
                                valueOf = l;
                            }
                            if (valueOf != null) {
                                y25.Companion.getClass();
                                obj2 = x25.a((int) valueOf.longValue());
                            } else {
                                obj2 = l;
                            }
                            Long valueOf2 = Long.valueOf(j7);
                            if (-2147483648L > j7 || j7 >= 2147483648L) {
                                valueOf2 = l;
                            }
                            int i6 = i4;
                            if (valueOf2 != null) {
                                int longValue = (int) valueOf2.longValue();
                                w25.Companion.getClass();
                                Iterator<E> it = w25.getEntries().iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        obj3 = it.next();
                                        if (((w25) obj3).getWireValue() == longValue) {
                                        }
                                    } else {
                                        obj3 = null;
                                    }
                                }
                                w25Var = (w25) obj3;
                            } else {
                                w25Var = null;
                            }
                            if (j5 > 0 && obj2 != null && w25Var != null && -2147483648L <= j8 && j8 < 2147483648L) {
                                arrayList.add(new t25(j5, obj2, w25Var, (int) j8));
                                i4 = i6 + 1;
                                i = 4;
                                l = null;
                            } else {
                                return new u25(j, (int) j2, pp1Var, true);
                            }
                        }
                        return new u25(j, (int) j2, arrayList, false);
                    }
                    return new u25(0L, 0, pp1Var, true);
                }
                return new u25(0L, 0, pp1Var, true);
            case 3:
                p31 p31Var4 = p31.COROUTINE_SUSPENDED;
                me2.a0(obj);
                return Boolean.valueOf(((File) this.Y).delete());
            case 4:
                p31 p31Var5 = p31.COROUTINE_SUSPENDED;
                me2.a0(obj);
                ((qi0) this.Y).m(true);
                return o27.a;
            case 5:
                p31 p31Var6 = p31.COROUTINE_SUSPENDED;
                me2.a0(obj);
                String str2 = dz0.a;
                y70.f().b(str2, "Constraints changed for " + ((xh7) this.Y));
                return o27.a;
            case ig7.b /* 6 */:
                p31 p31Var7 = p31.COROUTINE_SUSPENDED;
                me2.a0(obj);
                ee6 ee6Var2 = ((w61) this.Y).e;
                o61 o61Var = o61.a;
                ee6Var2.getClass();
                ee6Var2.l(null, o61Var);
                return o27.a;
            case 7:
                p31 p31Var8 = p31.COROUTINE_SUSPENDED;
                me2.a0(obj);
                t47 t47Var = ((pc1) this.Y).c;
                if (t47Var != null) {
                    t47Var.close();
                }
                return o27.a;
            case 8:
                p31 p31Var9 = p31.COROUTINE_SUSPENDED;
                me2.a0(obj);
                hg1 hg1Var = (hg1) this.Y;
                synchronized (hg1Var) {
                    if (hg1Var.g0 && !hg1Var.h0) {
                        try {
                            hg1Var.I();
                        } catch (IOException unused) {
                            hg1Var.i0 = true;
                        }
                        try {
                            if (hg1Var.d0 >= 2000) {
                                z = true;
                            }
                            if (z) {
                                hg1Var.K();
                            }
                        } catch (IOException unused2) {
                            hg1Var.j0 = true;
                            hg1Var.e0 = new r45(new Object());
                        }
                        return o27.a;
                    }
                    return o27.a;
                }
            case 9:
                p31 p31Var10 = p31.COROUTINE_SUSPENDED;
                me2.a0(obj);
                da5.Companion.getClass();
                return ga5.a.e((VideoRenderer) this.Y, null, null, da5.access$getAllKinds$cp());
            case 10:
                p31 p31Var11 = p31.COROUTINE_SUSPENDED;
                me2.a0(obj);
                z33 z33Var = (z33) this.Y;
                File file = new File(z33Var.a.getFilesDir(), "backgrounds.json");
                try {
                    String f = z33Var.b.f(pu.q((List) z33Var.f.getValue()));
                    OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file));
                    outputStreamWriter.write(f);
                    outputStreamWriter.close();
                    z33Var.c.i();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                return o27.a;
            case 11:
                p31 p31Var12 = p31.COROUTINE_SUSPENDED;
                me2.a0(obj);
                vo4 vo4Var = (vo4) this.Y;
                Context context = vo4Var.b;
                py5 py5Var = vo4Var.c;
                TextClassificationManager i7 = go4.i(context.getSystemService(go4.m()));
                int i8 = wn6.a[py5Var.ordinal()];
                if (i8 != 1) {
                    if (i8 == 2) {
                        str = "textview";
                    } else {
                        i.c();
                        return null;
                    }
                } else {
                    str = "edittext";
                }
                lr4.i();
                build = lr4.e(context.getPackageName(), str).build();
                createTextClassificationSession = i7.createTextClassificationSession(build);
                vo4Var.f = createTextClassificationSession;
                return createTextClassificationSession;
            case mj2.L /* 12 */:
                p31 p31Var13 = p31.COROUTINE_SUSPENDED;
                me2.a0(obj);
                ((n75) this.Y).A = null;
                return o27.a;
            case 13:
                p31 p31Var14 = p31.COROUTINE_SUSPENDED;
                me2.a0(obj);
                int i9 = RomDetailsActivity.I0;
                ((RomDetailsActivity) this.Y).A().p();
                return o27.a;
            case 14:
                p31 p31Var15 = p31.COROUTINE_SUSPENDED;
                me2.a0(obj);
                d16 d16Var2 = (d16) this.Y;
                if (d16Var2 != null && (z06Var = d16Var2.f) != null) {
                    z06Var.a(d16Var2, a16.SESSION_ERROR_SURFACE_NEEDS_RESET);
                }
                return o27.a;
            case ig7.e /* 15 */:
                v16 v16Var = (v16) this.Y;
                AtomicBoolean atomicBoolean = v16Var.e;
                p31 p31Var16 = p31.COROUTINE_SUSPENDED;
                me2.a0(obj);
                try {
                    try {
                        v16.a(v16Var);
                    } catch (Exception e2) {
                        Log.w("SettingsBackupManager", "Failed to write settings mirror", e2);
                    }
                    return o27.a;
                } finally {
                    atomicBoolean.set(false);
                }
            case 16:
                p31 p31Var17 = p31.COROUTINE_SUSPENDED;
                me2.a0(obj);
                ((ki2) this.Y).c();
                return o27.a;
            case 17:
                p31 p31Var18 = p31.COROUTINE_SUSPENDED;
                me2.a0(obj);
                if (((k47) this.Y).h.b()) {
                    if (ve2.D("CXCP")) {
                        Log.d("CXCP", "UseCaseCamera is closed before starting the CameraGraph, skipping setup.");
                    }
                } else {
                    jd0 a = ((k47) this.Y).a.a();
                    g57 g57Var = ((k47) this.Y).a;
                    g57Var.c.b = g57Var.a();
                    jf0 jf0Var = g57Var.b;
                    jd0 a2 = g57Var.a();
                    synchronized (jf0Var.a) {
                        try {
                            if (ve2.D("CXCP")) {
                                Log.d("CXCP", "Camera graph updated from " + jf0Var.d + " to " + a2);
                            }
                            ud0 ud0Var = jf0Var.e;
                            ud0 ud0Var2 = ud0.CLOSED;
                            if (ud0Var != ud0Var2) {
                                jf0Var.c(ud0.CLOSING, null);
                                jf0Var.c(ud0Var2, null);
                            }
                            jf0Var.d = a2;
                            jf0Var.e = ud0Var2;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    if (!a.j0.b()) {
                        Trace.beginSection(a + "#start");
                        StringBuilder sb = new StringBuilder("Starting ");
                        sb.append(a);
                        Log.i("CXCP", sb.toString());
                        an2 an2Var = a.B;
                        an2Var.getClass();
                        Log.d("CXCP", an2Var + " onGraphStarting");
                        an2Var.d.k(fn2.c);
                        for (kn2 kn2Var : an2Var.c) {
                            kn2Var.a.b(kn2Var.a(), fn2.c);
                        }
                        ca0 ca0Var = a.X;
                        synchronized (ca0Var.q) {
                            ca0Var.f();
                        }
                        Trace.endSection();
                        Map map = (Map) ((k47) this.Y).a.f.getValue();
                        k47 k47Var = (k47) this.Y;
                        f16 f16Var = (f16) k47Var.j.getValue();
                        if (((b16) f16Var.e.getValue()).c()) {
                            d16Var = (d16) f16Var.f.getValue();
                        } else {
                            d16Var = null;
                        }
                        if (d16Var != null) {
                            List unmodifiableList = Collections.unmodifiableList(d16Var.g.a);
                            unmodifiableList.getClass();
                            List b = d16Var.b();
                            b.getClass();
                            Iterator it2 = b.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    obj4 = it2.next();
                                    if (!unmodifiableList.contains((hc1) obj4)) {
                                    }
                                } else {
                                    obj4 = null;
                                }
                            }
                            hc1 hc1Var = (hc1) obj4;
                            if (hc1Var != null) {
                                uf6 uf6Var = (uf6) tq0.L0(k47Var.a.b(l07.b0(hc1Var)));
                            }
                        }
                        if (ve2.D("CXCP")) {
                            Log.d("CXCP", "Setting up Surfaces with UseCaseSurfaceManager");
                        }
                        if (((b16) ((f16) ((k47) this.Y).j.getValue()).e.getValue()).c()) {
                            m57 m57Var = (m57) ((k47) this.Y).i.getValue();
                            m57Var.getClass();
                            f16 f16Var2 = (f16) ((k47) this.Y).j.getValue();
                            f16Var2.getClass();
                            map.getClass();
                            synchronized (m57Var.e) {
                                try {
                                    if (m57Var.f == null) {
                                        if (m57Var.i == null) {
                                            if (m57Var.h == null) {
                                                Object value = f16Var2.g.getValue();
                                                value.getClass();
                                                List list = (List) value;
                                                try {
                                                    mh7.R(list);
                                                    jc1 e3 = tq5.e(m57Var.a.a, null, null, new vm(f16Var2, m57Var, list, map, a, null, 8), 3);
                                                    e3.R(new n95(27, list));
                                                    m57Var.f = e3;
                                                    gs0Var = e3;
                                                } catch (gc1 e4) {
                                                    if (ve2.I()) {
                                                        Log.w("CXCP", "Failed to increment DeferrableSurfaces: Surfaces closed");
                                                    }
                                                    tq5.w(m57Var.a.a, null, null, new zr5(f16Var2, e4, (j11) null, 4), 3);
                                                    gs0Var = a53.d(Boolean.FALSE);
                                                }
                                            } else {
                                                throw new IllegalStateException("Check failed.");
                                            }
                                        } else {
                                            throw new IllegalStateException("Surfaces being setup after stopped!");
                                        }
                                    } else {
                                        throw new IllegalStateException("Surfaces should only be set up once!");
                                    }
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                            }
                            gs0Var.R(wi3.Z);
                        } else if (ve2.E()) {
                            Log.e("CXCP", "Unable to create capture session due to conflicting configurations");
                        }
                    } else {
                        i.m(a, " after calling close()", "Cannot start ");
                        return null;
                    }
                }
                return o27.a;
            default:
                p31 p31Var19 = p31.COROUTINE_SUSPENDED;
                me2.a0(obj);
                ((p6) ((l24) this.Y).e).c();
                return o27.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x3(Object obj, j11 j11Var, int i) {
        super(2, j11Var);
        this.X = i;
        this.Y = obj;
    }
}
