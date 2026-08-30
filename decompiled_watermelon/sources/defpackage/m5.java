package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Rect;
import android.net.Uri;
import android.util.Log;
import android.view.ScrollCaptureSession;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;
import me.magnum.melonds.debug.ReleaseStateCommandReceiver;
import me.magnum.melonds.domain.model.Cheat;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: m5  reason: default package */
/* loaded from: classes.dex */
public final class m5 extends nk6 implements aj2 {
    public final /* synthetic */ int X;
    public int Y;
    public Object Z;
    public Object c0;
    public /* synthetic */ Object d0;
    public final /* synthetic */ Object e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m5(Object obj, um umVar, k24 k24Var, k24 k24Var2, j11 j11Var) {
        super(2, j11Var);
        this.X = 3;
        this.d0 = obj;
        this.e0 = umVar;
        this.Z = k24Var;
        this.c0 = k24Var2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0044, code lost:
        if (r8.i(r7) == r0) goto L21;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4, types: [z24] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object A(java.lang.Object r8) {
        /*
            r7 = this;
            p31 r0 = defpackage.p31.COROUTINE_SUSPENDED
            int r1 = r7.Y
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L2c
            if (r1 == r3) goto L1d
            if (r1 != r2) goto L17
            java.lang.Object r7 = r7.Z
            z24 r7 = (defpackage.z24) r7
            defpackage.me2.a0(r8)     // Catch: java.lang.Throwable -> L15
            goto L5c
        L15:
            r8 = move-exception
            goto L66
        L17:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r7)
            return r4
        L1d:
            java.lang.Object r1 = r7.c0
            nk6 r1 = (defpackage.nk6) r1
            aj2 r1 = (defpackage.aj2) r1
            java.lang.Object r3 = r7.Z
            z24 r3 = (defpackage.z24) r3
            defpackage.me2.a0(r8)
            r8 = r3
            goto L47
        L2c:
            defpackage.me2.a0(r8)
            java.lang.Object r8 = r7.e0
            b34 r8 = (defpackage.b34) r8
            java.lang.Object r1 = r7.d0
            aj2 r1 = (defpackage.aj2) r1
            r7.Z = r8
            r5 = r1
            nk6 r5 = (defpackage.nk6) r5
            r7.c0 = r5
            r7.Y = r3
            java.lang.Object r3 = r8.i(r7)
            if (r3 != r0) goto L47
            goto L5a
        L47:
            v74 r3 = new v74     // Catch: java.lang.Throwable -> L62
            r5 = 9
            r3.<init>(r1, r4, r5)     // Catch: java.lang.Throwable -> L62
            r7.Z = r8     // Catch: java.lang.Throwable -> L62
            r7.c0 = r4     // Catch: java.lang.Throwable -> L62
            r7.Y = r2     // Catch: java.lang.Throwable -> L62
            java.lang.Object r7 = defpackage.iq2.k(r3, r7)     // Catch: java.lang.Throwable -> L62
            if (r7 != r0) goto L5b
        L5a:
            return r0
        L5b:
            r7 = r8
        L5c:
            r7.d(r4)
            o27 r7 = defpackage.o27.a
            return r7
        L62:
            r7 = move-exception
            r6 = r8
            r8 = r7
            r7 = r6
        L66:
            r7.d(r4)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m5.A(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0041, code lost:
        if (r12 == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object B(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Object r0 = r11.d0
            java.lang.String r0 = (java.lang.String) r0
            p31 r1 = defpackage.p31.COROUTINE_SUSPENDED
            int r2 = r11.Y
            r3 = 33
            java.lang.String r4 = "Failed to open "
            r5 = 1
            java.lang.String r6 = "CXCP"
            r7 = 2
            r8 = 0
            if (r2 == 0) goto L29
            if (r2 == r5) goto L25
            if (r2 != r7) goto L1f
            java.lang.Object r11 = r11.Z
            hd r11 = (defpackage.hd) r11
            defpackage.me2.a0(r12)
            goto L7c
        L1f:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r11)
            return r8
        L25:
            defpackage.me2.a0(r12)
            goto L44
        L29:
            defpackage.me2.a0(r12)
            java.lang.Object r12 = r11.c0
            pf5 r12 = (defpackage.pf5) r12
            java.lang.Object r2 = r11.e0
            ya0 r2 = (defpackage.ya0) r2
            r11.Y = r5
            vu4 r5 = new vu4
            r9 = 25
            r5.<init>(r9)
            java.lang.Object r12 = r12.b(r0, r2, r5, r11)
            if (r12 != r1) goto L44
            goto L78
        L44:
            kd4 r12 = (defpackage.kd4) r12
            hd r12 = r12.a
            if (r12 != 0) goto L66
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>(r4)
            java.lang.String r12 = defpackage.od0.b(r0)
            r11.append(r12)
            r11.append(r3)
            java.lang.String r11 = r11.toString()
            android.util.Log.e(r6, r11)
            dy r11 = new dy
            r11.<init>(r8, r8)
            return r11
        L66:
            ee6 r2 = r12.u
            l8 r5 = new l8
            r9 = 7
            r5.<init>(r7, r9, r8)
            r11.Z = r12
            r11.Y = r7
            java.lang.Object r11 = defpackage.se.v(r2, r5, r11)
            if (r11 != r1) goto L79
        L78:
            return r1
        L79:
            r10 = r12
            r12 = r11
            r11 = r10
        L7c:
            ff0 r12 = (defpackage.ff0) r12
            boolean r1 = r12 instanceof defpackage.mf0
            if (r1 == 0) goto La4
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = defpackage.od0.b(r0)
            r1.append(r0)
            java.lang.String r0 = " opened successfully."
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            android.util.Log.i(r6, r0)
            dy r0 = new dy
            mf0 r12 = (defpackage.mf0) r12
            sc0 r12 = r12.a
            r0.<init>(r12, r11)
            return r0
        La4:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>(r4)
            java.lang.String r12 = defpackage.od0.b(r0)
            r11.append(r12)
            r11.append(r3)
            java.lang.String r11 = r11.toString()
            android.util.Log.e(r6, r11)
            dy r11 = new dy
            r11.<init>(r8, r8)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m5.B(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x013d, code lost:
        if (r0 == r6) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object x(java.lang.Object r21) {
        /*
            Method dump skipped, instructions count: 332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m5.x(java.lang.Object):java.lang.Object");
    }

    private final Object y(Object obj) {
        Object d;
        Object d2;
        String str;
        e31 e31Var = this.B;
        Map map = (Map) this.c0;
        az4 az4Var = (az4) this.Z;
        p31 p31Var = p31.COROUTINE_SUSPENDED;
        int i = this.Y;
        x15 x15Var = null;
        try {
            if (i != 0) {
                if (i == 1) {
                    me2.a0(obj);
                } else {
                    i.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            } else {
                me2.a0(obj);
                ArrayList arrayList = new ArrayList(map.size());
                for (Map.Entry entry : map.entrySet()) {
                    String encode = URLEncoder.encode((String) entry.getKey(), "utf-8");
                    String encode2 = URLEncoder.encode((String) entry.getValue(), "utf-8");
                    arrayList.add(encode + "=" + encode2);
                }
                String S0 = tq0.S0(arrayList, "&", null, null, null, 62);
                r9 r9Var = new r9(13);
                int i2 = ua5.a;
                h85 h85Var = cw3.d;
                r9Var.D("POST", ln2.z(S0, hi2.n("application/x-www-form-urlencoded")));
                id5 id5Var = az4Var.e;
                kd5 kd5Var = id5Var.c;
                if (kd5Var == null) {
                    kd5Var = id5Var.a();
                }
                String str2 = kd5Var.d;
                if (str2 != null) {
                    r9Var.I(str2);
                    ka kaVar = new ka(r9Var);
                    String str3 = (String) map.get("u");
                    if (str3 != null && (str = (String) map.get("t")) != null) {
                        x15Var = new x15(str3, str);
                    }
                    this.Y = 1;
                    obj = az4Var.f(kaVar, x15Var, true, this);
                    if (obj == p31Var) {
                        return p31Var;
                    }
                } else {
                    throw new IllegalStateException("RAOfflineProxy is selected but no active loopback host is available");
                }
            }
            d = (ec5) obj;
        } catch (Throwable th) {
            d = wh1.d(e31Var, e31Var, th);
        }
        qo0 qo0Var = (qo0) this.d0;
        mi2 mi2Var = (mi2) this.e0;
        if (!(d instanceof kc5)) {
            try {
                me2.a0(d);
                ec5 ec5Var = (ec5) d;
                d2 = az4.b(az4Var, qo0Var, ec5Var, mi2Var);
                ec5Var.close();
            } catch (Throwable th2) {
                d2 = wh1.d(e31Var, e31Var, th2);
            }
        } else {
            Throwable a = nc5.a(d);
            a.getClass();
            d2 = new kc5(a);
        }
        return new nc5(d2);
    }

    private final Object z(Object obj) {
        Intent intent = (Intent) this.Z;
        BroadcastReceiver.PendingResult pendingResult = (BroadcastReceiver.PendingResult) this.c0;
        p31 p31Var = p31.COROUTINE_SUSPENDED;
        int i = this.Y;
        try {
            try {
                if (i != 0) {
                    if (i == 1) {
                        me2.a0(obj);
                    } else {
                        i.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    me2.a0(obj);
                    r81 r81Var = r81.a;
                    mc mcVar = new mc((ReleaseStateCommandReceiver) this.d0, (Context) this.e0, intent, null, 3);
                    this.Y = 1;
                    if (r81Var.a(mcVar, this) == p31Var) {
                        return p31Var;
                    }
                }
            } catch (Exception e) {
                String action = intent.getAction();
                Log.w("DebugCommand", "Release state command failed: action=" + action, e);
            }
            pendingResult.finish();
            return o27.a;
        } catch (Throwable th) {
            pendingResult.finish();
            throw th;
        }
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        int i = this.X;
        o27 o27Var = o27.a;
        switch (i) {
            case 0:
                return ((m5) t((j11) obj2, (o31) obj)).v(o27Var);
            case 1:
                return ((m5) t((j11) obj2, (o31) obj)).v(o27Var);
            case 2:
                return ((m5) t((j11) obj2, (fj) obj)).v(o27Var);
            case 3:
                return ((m5) t((j11) obj2, (o31) obj)).v(o27Var);
            case 4:
                return ((m5) t((j11) obj2, (o31) obj)).v(o27Var);
            case 5:
                return ((m5) t((j11) obj2, (o31) obj)).v(o27Var);
            case ig7.b /* 6 */:
                return ((m5) t((j11) obj2, (o31) obj)).v(o27Var);
            case 7:
                return ((m5) t((j11) obj2, (o31) obj)).v(o27Var);
            case 8:
                return ((m5) t((j11) obj2, (o31) obj)).v(o27Var);
            case 9:
                return ((m5) t((j11) obj2, (o31) obj)).v(o27Var);
            case 10:
                return ((m5) t((j11) obj2, (o31) obj)).v(o27Var);
            case 11:
                return ((m5) t((j11) obj2, (o31) obj)).v(o27Var);
            case mj2.L /* 12 */:
                return ((m5) t((j11) obj2, (mu4) obj)).v(o27Var);
            case 13:
                return ((m5) t((j11) obj2, new xj0(((xj0) obj).a))).v(o27Var);
            case 14:
                return ((m5) t((j11) obj2, (p56) obj)).v(o27Var);
            case ig7.e /* 15 */:
                return ((m5) t((j11) obj2, (o31) obj)).v(o27Var);
            case 16:
                return ((m5) t((j11) obj2, (o31) obj)).v(o27Var);
            case 17:
                return ((m5) t((j11) obj2, (o31) obj)).v(o27Var);
            case 18:
                return ((m5) t((j11) obj2, (o31) obj)).v(o27Var);
            case 19:
                return ((m5) t((j11) obj2, (o31) obj)).v(o27Var);
            case 20:
                return ((m5) t((j11) obj2, (o31) obj)).v(o27Var);
            case 21:
                return ((m5) t((j11) obj2, (o31) obj)).v(o27Var);
            case 22:
                return ((m5) t((j11) obj2, (o31) obj)).v(o27Var);
            case 23:
                return ((m5) t((j11) obj2, (o31) obj)).v(o27Var);
            case 24:
                return ((m5) t((j11) obj2, (o31) obj)).v(o27Var);
            case 25:
                return ((m5) t((j11) obj2, (o31) obj)).v(o27Var);
            case 26:
                return ((m5) t((j11) obj2, (o31) obj)).v(o27Var);
            case 27:
                return ((m5) t((j11) obj2, (o31) obj)).v(o27Var);
            case 28:
                return ((m5) t((j11) obj2, (o31) obj)).v(o27Var);
            default:
                return ((m5) t((j11) obj2, (o31) obj)).v(o27Var);
        }
    }

    @Override // defpackage.m00
    public final j11 t(j11 j11Var, Object obj) {
        int i = this.X;
        Object obj2 = this.e0;
        switch (i) {
            case 0:
                return new m5((aj2) this.d0, (j15) obj2, (k24) this.c0, j11Var);
            case 1:
                return new m5((qf) this.d0, (Uri) obj2, j11Var, 1);
            case 2:
                m5 m5Var = new m5((mi2) this.c0, (yh) this.d0, (cm3) obj2, j11Var, 2);
                m5Var.Z = obj;
                return m5Var;
            case 3:
                return new m5(this.d0, (um) obj2, (k24) this.Z, (k24) this.c0, j11Var);
            case 4:
                return new m5((r96) this.Z, (Resources) this.c0, (Cheat) this.d0, (pn0) obj2, j11Var, 4);
            case 5:
                return new m5((yj2) this.c0, (pn0) this.d0, (String) obj2, j11Var, 5);
            case ig7.b /* 6 */:
                return new m5((hu0) this.Z, (ScrollCaptureSession) this.c0, (Rect) this.d0, (Consumer) obj2, j11Var, 6);
            case 7:
                return new m5((vq2) this.Z, (xh7) this.c0, (AtomicInteger) this.d0, (fq3) obj2, j11Var, 7);
            case 8:
                return new m5((ConstraintTrackingWorker) this.Z, (mq3) this.c0, (vq2) this.d0, (xh7) obj2, j11Var, 8);
            case 9:
                return new m5((yq1) this.Z, (hv1) this.c0, (st1) this.d0, (ft5) obj2, j11Var, 9);
            case 10:
                return new m5((jm4) this.Z, (hv1) this.c0, (rg5) this.d0, (q60) obj2, j11Var, 10);
            case 11:
                return new m5((hv1) this.Z, (String) this.c0, (String) this.d0, (ya4) obj2, j11Var, 11);
            case mj2.L /* 12 */:
                m5 m5Var2 = new m5((rm3) this.c0, (qm3) this.d0, (u92) obj2, j11Var, 12);
                m5Var2.Z = obj;
                return m5Var2;
            case 13:
                m5 m5Var3 = new m5((n75) this.d0, (w92) obj2, j11Var, 13);
                m5Var3.c0 = obj;
                return m5Var3;
            case 14:
                m5 m5Var4 = new m5((u92) this.c0, (h24) this.d0, this.e0, j11Var, 14);
                m5Var4.Z = obj;
                return m5Var4;
            case ig7.e /* 15 */:
                return new m5((r56) this.Z, (u92) this.c0, (h24) this.d0, this.e0, j11Var, 15);
            case 16:
                m5 m5Var5 = new m5((k24) this.Z, (dz2) obj2, j11Var);
                m5Var5.d0 = obj;
                return m5Var5;
            case 17:
                return new m5((UUID) this.d0, (k24) this.c0, (k24) obj2, j11Var);
            case 18:
                return new m5((h24) this.Z, (r96) this.c0, (Resources) this.d0, (mi2) obj2, j11Var, 18);
            case 19:
                m5 m5Var6 = new m5((Object) ((bq0) obj2), (aj2) this.d0, j11Var, 19);
                m5Var6.c0 = obj;
                return m5Var6;
            case 20:
                m5 m5Var7 = new m5((by5) this.c0, (l34) this.d0, (kx6) obj2, j11Var, 20);
                m5Var7.Z = obj;
                return m5Var7;
            case 21:
                return new m5((ra4) this.Z, (String) this.c0, (String) this.d0, (ba4) obj2, j11Var, 21);
            case 22:
                return new m5((Object) ((vo4) obj2), (aj2) this.d0, j11Var, 22);
            case 23:
                return new m5((az4) this.Z, (Map) this.c0, (qo0) this.d0, (mi2) obj2, j11Var, 23);
            case 24:
                return new m5((gs0) this.c0, (q35) this.d0, (v35) obj2, j11Var, 24);
            case 25:
                return new m5((Intent) this.Z, (BroadcastReceiver.PendingResult) this.c0, (ReleaseStateCommandReceiver) this.d0, (Context) obj2, j11Var, 25);
            case 26:
                return new m5((Object) ((b34) obj2), (aj2) this.d0, j11Var, 26);
            case 27:
                m5 m5Var8 = new m5((rm3) this.c0, (qm3) obj2, (aj2) this.d0, j11Var);
                m5Var8.Z = obj;
                return m5Var8;
            case 28:
                return new m5((pf5) this.c0, (String) this.d0, (ya0) obj2, j11Var, 28);
            default:
                return new m5((ri5) this.Z, (ki3) this.c0, (pk3) this.d0, (za6) obj2, j11Var, 29);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0051, code lost:
        if (defpackage.pk3.l(r1, 0, r23) == r3) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x0390, code lost:
        if (defpackage.se.v(r3, r5, r23) == r0) goto L206;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x03ee, code lost:
        if (defpackage.se.v(r1, r2, r23) == r0) goto L225;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005e, code lost:
        if (defpackage.ki3.j(r0, 0, r23) == r3) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:352:0x06a4, code lost:
        if (r3 == r2) goto L405;
     */
    /* JADX WARN: Removed duplicated region for block: B:181:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x06bb  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x06be  */
    /* JADX WARN: Removed duplicated region for block: B:483:0x09a1  */
    /* JADX WARN: Removed duplicated region for block: B:484:0x09cc  */
    /* JADX WARN: Removed duplicated region for block: B:558:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:605:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x018d  */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, l75] */
    /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.Object, l75] */
    /* JADX WARN: Type inference failed for: r2v74, types: [k75, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v11, types: [nk6, aj2] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:186:0x0376 -> B:190:0x0394). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:188:0x0390 -> B:190:0x0394). Please submit an issue!!! */
    @Override // defpackage.m00
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(java.lang.Object r24) {
        /*
            Method dump skipped, instructions count: 2830
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m5.v(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m5(rm3 rm3Var, qm3 qm3Var, aj2 aj2Var, j11 j11Var) {
        super(2, j11Var);
        this.X = 27;
        this.c0 = rm3Var;
        this.e0 = qm3Var;
        this.d0 = aj2Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m5(k24 k24Var, dz2 dz2Var, j11 j11Var) {
        super(2, j11Var);
        this.X = 16;
        this.Z = k24Var;
        this.e0 = dz2Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m5(aj2 aj2Var, j15 j15Var, k24 k24Var, j11 j11Var) {
        super(2, j11Var);
        this.X = 0;
        this.d0 = aj2Var;
        this.e0 = j15Var;
        this.c0 = k24Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m5(Object obj, aj2 aj2Var, j11 j11Var, int i) {
        super(2, j11Var);
        this.X = i;
        this.e0 = obj;
        this.d0 = aj2Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m5(Object obj, Object obj2, j11 j11Var, int i) {
        super(2, j11Var);
        this.X = i;
        this.d0 = obj;
        this.e0 = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m5(Object obj, Object obj2, Object obj3, j11 j11Var, int i) {
        super(2, j11Var);
        this.X = i;
        this.c0 = obj;
        this.d0 = obj2;
        this.e0 = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m5(Object obj, Object obj2, Object obj3, Object obj4, j11 j11Var, int i) {
        super(2, j11Var);
        this.X = i;
        this.Z = obj;
        this.c0 = obj2;
        this.d0 = obj3;
        this.e0 = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m5(UUID uuid, k24 k24Var, k24 k24Var2, j11 j11Var) {
        super(2, j11Var);
        this.X = 17;
        this.d0 = uuid;
        this.c0 = k24Var;
        this.e0 = k24Var2;
    }
}
