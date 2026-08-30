package kf;

import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.app.RemoteAction;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import androidx.work.Worker;
import androidx.work.impl.WorkDatabase;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import me.magnum.melonds.R;
import me.magnum.melonds.common.camera.DSiCameraSource;
import me.magnum.melonds.domain.model.Cheat;
import me.magnum.melonds.ui.dsiwaremanager.DSiWareManagerActivity;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class s0 implements mc.a {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;

    public /* synthetic */ s0(int i2, Object obj) {
        this.A = i2;
        this.B = obj;
    }

    @Override // mc.a
    public final Object b() {
        boolean z10;
        v7.g gVar;
        PendingIntent actionIntent;
        ActivityOptions pendingIntentBackgroundActivityStartMode;
        Object obj;
        Object[] objArr;
        int i2 = 2;
        boolean z11 = true;
        switch (this.A) {
            case 0:
                return new ve.f(null, ((b1) this.B).f8143a.getString(R.string.use_global_layout), ve.e.DEFAULT, ve.d.FOLLOW_SYSTEM, false, 0, zb.r.A);
            case DSiCameraSource.FrontCamera /* 1 */:
                a4.l.j((l2.a) this.B);
                return yb.y.f14813a;
            case 2:
                ld.f fVar = (ld.f) this.B;
                return Integer.valueOf(nd.a1.e(fVar, fVar.f9040k));
            case 3:
                return ((jb.c) this.B).d(":memory:");
            case 4:
                m7.r rVar = (m7.r) this.B;
                return rVar.A.d(rVar.B);
            case l1.c.f8511g /* 5 */:
                kg.d dVar = (kg.d) this.B;
                if (dVar instanceof kg.a) {
                    Cheat cheat = ((kg.a) dVar).f8291b;
                    String name = cheat.getName();
                    String description = cheat.getDescription();
                    if (description == null) {
                        description = "";
                    }
                    return new mg.l(name, description, cheat.getCode(), false);
                }
                return new mg.l(true);
            case l1.c.f8509e /* 6 */:
                return ((Worker) this.B).c();
            case 7:
                q7.f fVar2 = (q7.f) this.B;
                fVar2.getLifecycle().a(new q7.a(0, fVar2));
                return yb.y.f14813a;
            case 8:
                q8.m mVar = (q8.m) this.B;
                String str = y8.b.f14791a;
                q8.p pVar = mVar.f12359a;
                WorkDatabase workDatabase = pVar.f12373c;
                HashSet hashSet = new HashSet();
                hashSet.addAll(mVar.f12363e);
                HashSet b10 = q8.m.b(mVar);
                Iterator it = hashSet.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (b10.contains((String) it.next())) {
                            z10 = true;
                        }
                    } else {
                        hashSet.removeAll(mVar.f12363e);
                        z10 = false;
                    }
                }
                if (!z10) {
                    p8.b bVar = pVar.f12372b;
                    workDatabase.b();
                    try {
                        y8.g.b(workDatabase, bVar, mVar);
                        boolean a10 = y8.b.a(mVar);
                        workDatabase.p();
                        if (a10) {
                            q8.i.b(bVar, workDatabase, pVar.f12375e);
                        }
                        return yb.y.f14813a;
                    } finally {
                        workDatabase.f();
                    }
                }
                a0.j.o(mVar, ")", "WorkContinuation has cycles (");
                return null;
            case l1.c.f8508d /* 9 */:
                q8.p pVar2 = (q8.p) this.B;
                WorkDatabase workDatabase2 = pVar2.f12373c;
                Context context = pVar2.f12371a;
                String str2 = s8.d.Y;
                if (Build.VERSION.SDK_INT >= 34) {
                    s8.a.a(context).cancelAll();
                }
                JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
                ArrayList d4 = s8.d.d(context, jobScheduler);
                if (d4 != null && !d4.isEmpty()) {
                    int size = d4.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj2 = d4.get(i10);
                        i10++;
                        s8.d.b(jobScheduler, ((JobInfo) obj2).getId());
                    }
                }
                ((Number) q8.r.K(workDatabase2.w().f14444a, false, true, new u1.h1(22))).intValue();
                q8.i.b(pVar2.f12372b, workDatabase2, pVar2.f12375e);
                return yb.y.f14813a;
            case l1.c.f8510f /* 10 */:
                qg.b bVar2 = (qg.b) this.B;
                bVar2.g();
                return new cd.y0(bVar2.f12533d);
            case 11:
                return (h3.c) this.B;
            case 12:
                return (l4.h) this.B;
            case 13:
                return ((u1.p0) this.B).d();
            case 14:
                return new u1.i1((h1.n1) this.B, 0.0f);
            case l1.c.f8512h /* 15 */:
                return new x4.j(((x4.k) this.B).b());
            case 16:
                return this.B;
            case 17:
                v4.b bVar3 = (v4.b) this.B;
                n2.f1 f1Var = bVar3.L;
                if (((h3.e) f1Var.getValue()).f6064a == 9205357640488583168L || h3.e.f(((h3.e) f1Var.getValue()).f6064a)) {
                    return null;
                }
                return bVar3.A.b(((h3.e) f1Var.getValue()).f6064a);
            case 18:
                v7.h hVar = (v7.h) this.B;
                String str3 = hVar.B;
                if (str3 != null && hVar.R) {
                    Context context2 = hVar.A;
                    context2.getClass();
                    File noBackupFilesDir = context2.getNoBackupFilesDir();
                    noBackupFilesDir.getClass();
                    gVar = new v7.g(hVar.A, new File(noBackupFilesDir, str3).getAbsolutePath(), new rd.k(10), hVar.L, hVar.X);
                } else {
                    gVar = new v7.g(hVar.A, hVar.B, new rd.k(10), hVar.L, hVar.X);
                }
                gVar.setWriteAheadLoggingEnabled(hVar.Z);
                return gVar;
            case 19:
                Context context3 = ((wd.a) this.B).f14210a;
                String str4 = context3.getPackageManager().getPackageInfo(context3.getPackageName(), 0).versionName;
                str4.getClass();
                String lowerCase = str4.toLowerCase(Locale.ROOT);
                lowerCase.getClass();
                String replace = lowerCase.replace(' ', '-');
                replace.getClass();
                return "melonDS-android/".concat(vc.o.T(vc.o.T(replace, "(", ""), ")", ""));
            case 20:
                wi.p pVar3 = (wi.p) this.B;
                pVar3.getClass();
                try {
                    pVar3.f14273q0.w(2, false, 0);
                } catch (IOException e6) {
                    wi.c cVar = wi.c.PROTOCOL_ERROR;
                    pVar3.d(cVar, cVar, e6);
                }
                return yb.y.f14813a;
            case 21:
                int i11 = DSiWareManagerActivity.f9498y0;
                ((DSiWareManagerActivity) this.B).x();
                return yb.y.f14813a;
            case 22:
                y2.c cVar2 = (y2.c) this.B;
                y2.j jVar = cVar2.A;
                Object obj3 = cVar2.R;
                if (obj3 != null) {
                    return jVar.d(cVar2, obj3);
                }
                a0.j.h("Value should be initialized");
                return null;
            case 23:
                q7.e eVar = ((y2.i) this.B).L;
                if (eVar == null) {
                    return null;
                }
                Bundle b11 = zb.k.b((yb.j[]) Arrays.copyOf(new yb.j[0], 0));
                eVar.c(b11);
                if (b11.isEmpty()) {
                    return null;
                }
                return b11;
            case 24:
                yh.j jVar2 = (yh.j) this.B;
                cd.q1 c4 = cd.q.c(zh.f.f15126a);
                zc.x.v(androidx.lifecycle.s0.h(jVar2), null, null, new mh.m(jVar2, c4, null, 18), 3);
                return new cd.y0(c4);
            case 25:
                return ((b2.g) this.B).v0();
            case 26:
                ((x1.g) this.B).close();
                return yb.y.f14813a;
            case 27:
                actionIntent = ((RemoteAction) this.B).getActionIntent();
                if (Build.VERSION.SDK_INT >= 34) {
                    try {
                        pendingIntentBackgroundActivityStartMode = ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(1);
                        actionIntent.send(pendingIntentBackgroundActivityStartMode.toBundle());
                    } catch (PendingIntent.CanceledException e10) {
                        Log.e("TextClassification", "error sending pendingIntent: " + actionIntent + " error: " + e10);
                    }
                } else {
                    actionIntent.send();
                }
                return yb.y.f14813a;
            case 28:
                z2.u uVar = (z2.u) this.B;
                while (true) {
                    Object obj4 = uVar.f14951g;
                    synchronized (obj4) {
                        try {
                            if (!uVar.f14947c) {
                                uVar.f14947c = z11;
                                try {
                                    p2.b bVar4 = uVar.f14950f;
                                    Object[] objArr2 = bVar4.A;
                                    int i12 = bVar4.L;
                                    int i13 = 0;
                                    while (i13 < i12) {
                                        z2.t tVar = (z2.t) objArr2[i13];
                                        a1.n0 n0Var = tVar.f14939g;
                                        mc.l lVar = tVar.f14933a;
                                        Object[] objArr3 = n0Var.f75b;
                                        long[] jArr = n0Var.f74a;
                                        int length = jArr.length - i2;
                                        obj = obj4;
                                        if (length >= 0) {
                                            int i14 = 0;
                                            while (true) {
                                                try {
                                                    long j2 = jArr[i14];
                                                    objArr = objArr2;
                                                    if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i15 = 8 - ((~(i14 - length)) >>> 31);
                                                        for (int i16 = 0; i16 < i15; i16++) {
                                                            if ((j2 & 255) < 128) {
                                                                lVar.k(objArr3[(i14 << 3) + i16]);
                                                            }
                                                            j2 >>= 8;
                                                        }
                                                        if (i15 != 8) {
                                                        }
                                                    }
                                                    if (i14 != length) {
                                                        i14++;
                                                        objArr2 = objArr;
                                                    }
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                    uVar.f14947c = false;
                                                    throw th;
                                                }
                                            }
                                        } else {
                                            objArr = objArr2;
                                        }
                                        n0Var.b();
                                        i13++;
                                        obj4 = obj;
                                        objArr2 = objArr;
                                        i2 = 2;
                                    }
                                    obj = obj4;
                                    try {
                                        uVar.f14947c = false;
                                    } catch (Throwable th3) {
                                        th = th3;
                                        throw th;
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                    obj = obj4;
                                }
                            } else {
                                obj = obj4;
                            }
                            if (!uVar.b()) {
                                return yb.y.f14813a;
                            }
                            i2 = 2;
                            z11 = true;
                        } catch (Throwable th5) {
                            th = th5;
                            obj = obj4;
                        }
                    }
                }
            default:
                return new a1.z0((Object[]) this.B);
        }
    }
}
