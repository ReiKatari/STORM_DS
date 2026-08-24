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
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: y3  reason: default package */
/* loaded from: classes.dex */
public final class y3 extends hw6 implements eo2 {
    public final /* synthetic */ int X;
    public final /* synthetic */ Object Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y3(r41 r41Var, Object obj, int i) {
        super(2, r41Var);
        this.X = i;
        this.Y = obj;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        int i = this.X;
        jg7 jg7Var = jg7.a;
        switch (i) {
            case 0:
                ((y3) q((r41) obj2, (w61) obj)).s(jg7Var);
                return jg7Var;
            case 1:
                ((y3) q((r41) obj2, (w61) obj)).s(jg7Var);
                return jg7Var;
            case 2:
                return ((y3) q((r41) obj2, (w61) obj)).s(jg7Var);
            case 3:
                return ((y3) q((r41) obj2, (w61) obj)).s(jg7Var);
            case 4:
                ((y3) q((r41) obj2, (w61) obj)).s(jg7Var);
                return jg7Var;
            case 5:
                ((y3) q((r41) obj2, (w61) obj)).s(jg7Var);
                return jg7Var;
            case 6:
                ((y3) q((r41) obj2, (x21) obj)).s(jg7Var);
                return jg7Var;
            case 7:
                ((y3) q((r41) obj2, (w61) obj)).s(jg7Var);
                return jg7Var;
            case 8:
                ((y3) q((r41) obj2, (w61) obj)).s(jg7Var);
                return jg7Var;
            case 9:
                return ((y3) q((r41) obj2, (w61) obj)).s(jg7Var);
            case 10:
                return ((y3) q((r41) obj2, (w61) obj)).s(jg7Var);
            case 11:
                ((y3) q((r41) obj2, (w61) obj)).s(jg7Var);
                return jg7Var;
            case 12:
                return ((y3) q((r41) obj2, (w61) obj)).s(jg7Var);
            case 13:
                ((y3) q((r41) obj2, (jg7) obj)).s(jg7Var);
                return jg7Var;
            case 14:
                ((y3) q((r41) obj2, (w61) obj)).s(jg7Var);
                return jg7Var;
            case 15:
                ((y3) q((r41) obj2, (w61) obj)).s(jg7Var);
                return jg7Var;
            case 16:
                ((y3) q((r41) obj2, (w61) obj)).s(jg7Var);
                return jg7Var;
            case 17:
                ((y3) q((r41) obj2, (w61) obj)).s(jg7Var);
                return jg7Var;
            case 18:
                ((y3) q((r41) obj2, (w61) obj)).s(jg7Var);
                return jg7Var;
            default:
                ((y3) q((r41) obj2, (w61) obj)).s(jg7Var);
                return jg7Var;
        }
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        int i = this.X;
        Object obj2 = this.Y;
        switch (i) {
            case 0:
                return new y3((bt) obj2, r41Var, 0);
            case 1:
                return new y3((nx1) obj2, r41Var, 1);
            case 2:
                return new y3((ArrayList) obj2, r41Var, 2);
            case 3:
                return new y3((File) obj2, r41Var, 3);
            case 4:
                return new y3((e70) obj2, r41Var, 4);
            case 5:
                return new y3((yk0) obj2, r41Var, 5);
            case 6:
                return new y3((yw7) obj2, r41Var, 6);
            case 7:
                return new y3((la1) obj2, r41Var, 7);
            case 8:
                return new y3(r41Var, (qg1) obj2, 8);
            case 9:
                return new y3((lk1) obj2, r41Var, 9);
            case 10:
                return new y3((VideoRenderer) obj2, r41Var, 10);
            case 11:
                return new y3((ha3) obj2, r41Var, 11);
            case 12:
                return new y3((zx4) obj2, r41Var, 12);
            case 13:
                return new y3((dh5) obj2, r41Var, 13);
            case 14:
                return new y3((RomDetailsActivity) obj2, r41Var, 14);
            case 15:
                return new y3((rc6) obj2, r41Var, 15);
            case 16:
                return new y3((jd6) obj2, r41Var, 16);
            case 17:
                return new y3((on2) obj2, r41Var, 17);
            case 18:
                return new y3(r41Var, (ii7) obj2, 18);
            default:
                return new y3((ra4) obj2, r41Var, 19);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v43, types: [ui6, java.lang.Object] */
    @Override // defpackage.d20
    public final Object s(Object obj) {
        Object obj2;
        gc5 gc5Var;
        Object obj3;
        String str;
        TextClassificationContext build;
        TextClassifier createTextClassificationSession;
        nc6 nc6Var;
        rc6 rc6Var;
        tu0 tu0Var;
        Object obj4;
        boolean z = false;
        Long l = null;
        switch (this.X) {
            case 0:
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                bt btVar = (bt) this.Y;
                if (((Boolean) ((vs4) btVar.R).getValue()).booleanValue()) {
                    ((on2) btVar.B).c();
                } else {
                    ((ta4) btVar.L).c.setValue(Boolean.TRUE);
                }
                return jg7.a;
            case 1:
                x61 x61Var2 = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                nx1 nx1Var = (nx1) this.Y;
                tp6 tp6Var = nx1Var.d;
                f06 f06Var = f06.a;
                tp6Var.getClass();
                tp6Var.m(null, f06Var);
                nx1Var.m();
                return jg7.a;
            case 2:
                yt1 yt1Var = yt1.A;
                x61 x61Var3 = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                long[] retryPendingRetroAchievementsSubmissions = MelonEmulator.a.retryPendingRetroAchievementsSubmissions(gt0.l1((ArrayList) this.Y));
                if (retryPendingRetroAchievementsSubmissions != null) {
                    int i = 4;
                    if (retryPendingRetroAchievementsSubmissions.length >= 4) {
                        long j = retryPendingRetroAchievementsSubmissions[0];
                        long j2 = retryPendingRetroAchievementsSubmissions[1];
                        long j3 = retryPendingRetroAchievementsSubmissions[2];
                        long j4 = retryPendingRetroAchievementsSubmissions[3];
                        if (j > 0 && 0 <= j2 && j2 < 2147483648L && 0 <= j3 && j3 < 2147483648L && 0 <= j4 && j4 < 2) {
                            if (retryPendingRetroAchievementsSubmissions.length != (j3 * 4) + 4) {
                                yt1Var = yt1Var;
                            } else if (j4 == 1) {
                                return new ec5(j, (int) j2, yt1Var, true);
                            } else {
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
                                        int longValue = (int) valueOf.longValue();
                                        ic5.Companion.getClass();
                                        obj2 = hc5.a(longValue);
                                    } else {
                                        obj2 = l;
                                    }
                                    Long valueOf2 = Long.valueOf(j7);
                                    if (-2147483648L > j7 || j7 >= 2147483648L) {
                                        valueOf2 = l;
                                    }
                                    if (valueOf2 != null) {
                                        int longValue2 = (int) valueOf2.longValue();
                                        gc5.Companion.getClass();
                                        Iterator<E> it = gc5.getEntries().iterator();
                                        while (true) {
                                            if (it.hasNext()) {
                                                obj3 = it.next();
                                                if (((gc5) obj3).getWireValue() == longValue2) {
                                                }
                                            } else {
                                                obj3 = null;
                                            }
                                        }
                                        gc5Var = (gc5) obj3;
                                    } else {
                                        gc5Var = null;
                                    }
                                    if (j5 > 0 && obj2 != null && gc5Var != null && -2147483648L <= j8 && j8 < 2147483648L) {
                                        arrayList.add(new dc5(j5, obj2, gc5Var, (int) j8));
                                        i4++;
                                        l = null;
                                        i = 4;
                                    } else {
                                        return new ec5(j, (int) j2, yt1Var, true);
                                    }
                                }
                                return new ec5(j, (int) j2, arrayList, false);
                            }
                        }
                        return new ec5(0L, 0, yt1Var, true);
                    }
                }
                return new ec5(0L, 0, yt1Var, true);
            case 3:
                x61 x61Var4 = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                return Boolean.valueOf(((File) this.Y).delete());
            case 4:
                x61 x61Var5 = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                e70.c((e70) this.Y);
                return jg7.a;
            case 5:
                x61 x61Var6 = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                ((yk0) this.Y).m(true);
                return jg7.a;
            case 6:
                x61 x61Var7 = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                String str2 = i21.a;
                ga0.f().b(str2, "Constraints changed for " + ((yw7) this.Y));
                return jg7.a;
            case 7:
                x61 x61Var8 = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                tp6 tp6Var2 = ((la1) this.Y).g;
                ca1 ca1Var = ca1.a;
                tp6Var2.getClass();
                tp6Var2.m(null, ca1Var);
                return jg7.a;
            case 8:
                x61 x61Var9 = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                ri7 ri7Var = ((qg1) this.Y).c;
                if (ri7Var != null) {
                    ri7Var.close();
                }
                return jg7.a;
            case 9:
                x61 x61Var10 = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                lk1 lk1Var = (lk1) this.Y;
                synchronized (lk1Var) {
                    if (lk1Var.h0 && !lk1Var.i0) {
                        try {
                            lk1Var.D();
                        } catch (IOException unused) {
                            lk1Var.j0 = true;
                        }
                        try {
                            if (lk1Var.e0 >= 2000) {
                                z = true;
                            }
                            if (z) {
                                lk1Var.J();
                            }
                        } catch (IOException unused2) {
                            lk1Var.k0 = true;
                            lk1Var.f0 = new ee5(new Object());
                        }
                        return jg7.a;
                    }
                    return jg7.a;
                }
            case 10:
                x61 x61Var11 = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                vj5.Companion.getClass();
                return yj5.a.e((VideoRenderer) this.Y, null, null, vj5.access$getAllKinds$cp());
            case 11:
                x61 x61Var12 = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                ha3 ha3Var = (ha3) this.Y;
                File file = new File(ha3Var.a.getFilesDir(), "backgrounds.json");
                try {
                    String f = ha3Var.b.f(mb3.z((List) ha3Var.f.getValue()));
                    OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file));
                    outputStreamWriter.write(f);
                    outputStreamWriter.close();
                    ha3Var.c.i();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                return jg7.a;
            case 12:
                x61 x61Var13 = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                zx4 zx4Var = (zx4) this.Y;
                Context context = zx4Var.b;
                ca6 ca6Var = zx4Var.c;
                TextClassificationManager k = q66.k(context.getSystemService(q66.n()));
                int i6 = i07.a[ca6Var.ordinal()];
                if (i6 != 1) {
                    if (i6 == 2) {
                        str = "textview";
                    } else {
                        i.d();
                        return null;
                    }
                } else {
                    str = "edittext";
                }
                o05.j();
                build = o05.e(context.getPackageName(), str).build();
                createTextClassificationSession = k.createTextClassificationSession(build);
                zx4Var.f = createTextClassificationSession;
                return createTextClassificationSession;
            case 13:
                x61 x61Var14 = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                ((dh5) this.Y).A = null;
                return jg7.a;
            case 14:
                x61 x61Var15 = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                int i7 = RomDetailsActivity.J0;
                ((RomDetailsActivity) this.Y).A().p();
                return jg7.a;
            case 15:
                x61 x61Var16 = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                rc6 rc6Var2 = (rc6) this.Y;
                if (rc6Var2 != null && (nc6Var = rc6Var2.f) != null) {
                    nc6Var.a(rc6Var2, oc6.SESSION_ERROR_SURFACE_NEEDS_RESET);
                }
                return jg7.a;
            case 16:
                jd6 jd6Var = (jd6) this.Y;
                AtomicBoolean atomicBoolean = jd6Var.e;
                x61 x61Var17 = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                try {
                    try {
                        jd6.a(jd6Var);
                    } catch (Exception e2) {
                        Log.w("SettingsBackupManager", "Failed to write settings mirror", e2);
                    }
                    return jg7.a;
                } finally {
                    atomicBoolean.set(false);
                }
            case 17:
                x61 x61Var18 = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                ((on2) this.Y).c();
                return jg7.a;
            case 18:
                x61 x61Var19 = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                if (((ii7) this.Y).h.b()) {
                    if (kj2.F("CXCP")) {
                        Log.d("CXCP", "UseCaseCamera is closed before starting the CameraGraph, skipping setup.");
                    }
                } else {
                    sf0 a = ((ii7) this.Y).a.a();
                    ej7 ej7Var = ((ii7) this.Y).a;
                    ej7Var.c.b = ej7Var.a();
                    sh0 sh0Var = ej7Var.b;
                    sf0 a2 = ej7Var.a();
                    synchronized (sh0Var.a) {
                        try {
                            if (kj2.F("CXCP")) {
                                Log.d("CXCP", "Camera graph updated from " + sh0Var.d + " to " + a2);
                            }
                            dg0 dg0Var = sh0Var.e;
                            dg0 dg0Var2 = dg0.CLOSED;
                            if (dg0Var != dg0Var2) {
                                sh0Var.c(dg0.CLOSING, null);
                                sh0Var.c(dg0Var2, null);
                            }
                            sh0Var.d = a2;
                            sh0Var.e = dg0Var2;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    if (!a.k0.b()) {
                        Trace.beginSection(a + "#start");
                        StringBuilder sb = new StringBuilder("Starting ");
                        sb.append(a);
                        Log.i("CXCP", sb.toString());
                        gt2 gt2Var = a.B;
                        gt2Var.getClass();
                        Log.d("CXCP", gt2Var + " onGraphStarting");
                        gt2Var.d.l(lt2.c);
                        for (qt2 qt2Var : gt2Var.c) {
                            qt2Var.a.b(qt2Var.a(), lt2.c);
                        }
                        kc0 kc0Var = a.X;
                        synchronized (kc0Var.q) {
                            kc0Var.f();
                        }
                        Trace.endSection();
                        Map map = (Map) ((ii7) this.Y).a.f.getValue();
                        ii7 ii7Var = (ii7) this.Y;
                        tc6 tc6Var = (tc6) ii7Var.j.getValue();
                        if (((pc6) tc6Var.e.getValue()).c()) {
                            rc6Var = (rc6) tc6Var.f.getValue();
                        } else {
                            rc6Var = null;
                        }
                        if (rc6Var != null) {
                            List unmodifiableList = Collections.unmodifiableList(rc6Var.g.a);
                            unmodifiableList.getClass();
                            List b = rc6Var.b();
                            b.getClass();
                            Iterator it2 = b.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    obj4 = it2.next();
                                    if (!unmodifiableList.contains((ig1) obj4)) {
                                    }
                                } else {
                                    obj4 = null;
                                }
                            }
                            ig1 ig1Var = (ig1) obj4;
                            if (ig1Var != null) {
                                kr6 kr6Var = (kr6) gt0.I0(ii7Var.a.b(hf.b0(ig1Var)));
                            }
                        }
                        if (kj2.F("CXCP")) {
                            Log.d("CXCP", "Setting up Surfaces with UseCaseSurfaceManager");
                        }
                        if (((pc6) ((tc6) ((ii7) this.Y).j.getValue()).e.getValue()).c()) {
                            jj7 jj7Var = (jj7) ((ii7) this.Y).i.getValue();
                            jj7Var.getClass();
                            tc6 tc6Var2 = (tc6) ((ii7) this.Y).j.getValue();
                            tc6Var2.getClass();
                            map.getClass();
                            synchronized (jj7Var.e) {
                                try {
                                    if (jj7Var.f == null) {
                                        if (jj7Var.i == null) {
                                            if (jj7Var.h == null) {
                                                Object value = tc6Var2.g.getValue();
                                                value.getClass();
                                                List list = (List) value;
                                                try {
                                                    hv.J(list);
                                                    kg1 i8 = hv.i(jj7Var.a.a, null, null, new hn(tc6Var2, jj7Var, list, map, a, (r41) null, 12), 3);
                                                    i8.a0(new ro5(list, 26));
                                                    jj7Var.f = i8;
                                                    tu0Var = i8;
                                                } catch (hg1 e3) {
                                                    if (kj2.L()) {
                                                        Log.w("CXCP", "Failed to increment DeferrableSurfaces: Surfaces closed");
                                                    }
                                                    hv.L(jj7Var.a.a, null, null, new xy5(tc6Var2, e3, (r41) null, 5), 3);
                                                    tu0Var = u24.b(Boolean.FALSE);
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
                            tu0Var.a0(up3.d0);
                        } else if (kj2.G()) {
                            Log.e("CXCP", "Unable to create capture session due to conflicting configurations");
                        }
                    } else {
                        e41.g(a, " after calling close()", "Cannot start ");
                        return null;
                    }
                }
                return jg7.a;
            default:
                x61 x61Var20 = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                ((q6) ((ra4) this.Y).e).c();
                return jg7.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y3(Object obj, r41 r41Var, int i) {
        super(2, r41Var);
        this.X = i;
        this.Y = obj;
    }
}
