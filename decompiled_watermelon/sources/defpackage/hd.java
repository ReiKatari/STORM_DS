package defpackage;

import android.hardware.camera2.CameraDevice;
import android.os.Build;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Log;
import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: hd  reason: default package */
/* loaded from: classes.dex */
public final class hd extends CameraDevice.StateCallback {
    public final String a;
    public final ce0 b;
    public final int c;
    public final long d;
    public final cm6 e;
    public final ab0 f;
    public final ya0 g;
    public final fb0 h;
    public final ct6 i;
    public final jw j;
    public final CameraDevice.StateCallback k;
    public final q03 l;
    public final int m;
    public final Object n;
    public boolean o;
    public gd p;
    public boolean q;
    public final CountDownLatch r;
    public final long s;
    public pt6 t;
    public final ee6 u;

    public hd(String str, ce0 ce0Var, int i, long j, cm6 cm6Var, ab0 ab0Var, ya0 ya0Var, fb0 fb0Var, ct6 ct6Var, jw jwVar, CameraDevice.StateCallback stateCallback, q03 q03Var) {
        str.getClass();
        ce0Var.getClass();
        cm6Var.getClass();
        ab0Var.getClass();
        ya0Var.getClass();
        fb0Var.getClass();
        ct6Var.getClass();
        jwVar.getClass();
        this.a = str;
        this.b = ce0Var;
        this.c = i;
        this.d = j;
        this.e = cm6Var;
        this.f = ab0Var;
        this.g = ya0Var;
        this.h = fb0Var;
        this.i = ct6Var;
        this.j = jwVar;
        this.k = stateCallback;
        this.l = q03Var;
        cw cwVar = mc7.b;
        cwVar.getClass();
        this.m = cw.b.incrementAndGet(cwVar);
        this.n = new Object();
        this.r = new CountDownLatch(1);
        this.u = fe6.a(uf0.a);
        Log.i("CXCP", "Opening " + ((Object) od0.b(str)));
        this.s = i != 1 ? SystemClock.elapsedRealtimeNanos() : j;
    }

    public static boolean e(fb0 fb0Var, String str, uc0 uc0Var) {
        fb0Var.getClass();
        str.getClass();
        fb0Var.b.getClass();
        if (Build.VERSION.SDK_INT < 29) {
            be0 be0Var = ce0.g;
            ce0 d = fb0Var.a.d(str);
            be0Var.getClass();
            if (be0.c(d) && uc0Var == null) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void a() {
        sc0 sc0Var;
        CameraDevice cameraDevice;
        ff0 ff0Var = (ff0) this.u.getValue();
        if (ff0Var instanceof mf0) {
            sc0Var = ((mf0) ff0Var).a;
        } else {
            sc0Var = null;
        }
        if (sc0Var != null) {
            cameraDevice = (CameraDevice) sc0Var.p(q75.a(CameraDevice.class));
        } else {
            cameraDevice = null;
        }
        b(cameraDevice, new gd(qp0.APP_CLOSED, null, null, 14));
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001f, code lost:
        if (r10.o == false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(android.hardware.camera2.CameraDevice r11, defpackage.gd r12) {
        /*
            r10 = this;
            ee6 r0 = r10.u
            java.lang.Object r0 = r0.getValue()
            ff0 r0 = (defpackage.ff0) r0
            boolean r1 = r0 instanceof defpackage.mf0
            r2 = 0
            if (r1 == 0) goto L13
            mf0 r0 = (defpackage.mf0) r0
            sc0 r0 = r0.a
            r4 = r0
            goto L14
        L13:
            r4 = r2
        L14:
            java.lang.Object r1 = r10.n
            monitor-enter(r1)
            gd r0 = r10.p     // Catch: java.lang.Throwable -> L22
            if (r0 != 0) goto L26
            r10.p = r12     // Catch: java.lang.Throwable -> L22
            boolean r0 = r10.o     // Catch: java.lang.Throwable -> L22
            if (r0 != 0) goto L26
            goto L27
        L22:
            r0 = move-exception
            r10 = r0
            goto L98
        L26:
            r12 = r2
        L27:
            monitor-exit(r1)
            if (r12 == 0) goto L97
            uc0 r0 = r12.c
            r1 = 0
            if (r0 == 0) goto L3e
            qp0 r3 = r12.a
            qp0 r5 = defpackage.qp0.CAMERA2_EXCEPTION
            if (r3 == r5) goto L3e
            ab0 r3 = r10.f
            java.lang.String r5 = r10.a
            int r0 = r0.a
            r3.a(r5, r0, r1)
        L3e:
            ee6 r0 = r10.u
            lf0 r3 = new lf0
            uc0 r5 = r12.c
            r3.<init>(r5)
            r0.getClass()
            r0.l(r2, r3)
            qp0 r0 = r12.a
            qp0 r3 = defpackage.qp0.CAMERA2_CLOSED
            if (r0 == r3) goto L8a
            fb0 r0 = r10.h
            java.lang.String r3 = r10.a
            uc0 r5 = r12.c
            boolean r5 = e(r0, r3, r5)
            r6 = 1
            if (r5 == 0) goto L68
            boolean r0 = r0.a(r3)
            if (r0 == 0) goto L68
            r8 = r6
            goto L69
        L68:
            r8 = r1
        L69:
            if (r8 == 0) goto L76
            java.lang.Object r1 = r10.n
            monitor-enter(r1)
            r10.q = r6     // Catch: java.lang.Throwable -> L72
            monitor-exit(r1)
            goto L76
        L72:
            r0 = move-exception
            r10 = r0
            monitor-exit(r1)
            throw r10
        L76:
            ya0 r3 = r10.g
            jw r7 = r10.j
            fb0 r0 = r10.h
            java.lang.String r1 = r10.a
            uc0 r5 = r12.c
            boolean r9 = e(r0, r1, r5)
            r6 = r10
            r5 = r11
            r3.b(r4, r5, r6, r7, r8, r9)
            goto L8b
        L8a:
            r6 = r10
        L8b:
            ee6 r10 = r6.u
            kf0 r11 = r6.c(r12)
            r10.getClass()
            r10.l(r2, r11)
        L97:
            return
        L98:
            monitor-exit(r1)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hd.b(android.hardware.camera2.CameraDevice, gd):void");
    }

    public final kf0 c(gd gdVar) {
        mm1 mm1Var;
        mm1 mm1Var2;
        mm1 mm1Var3;
        this.e.getClass();
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        pt6 pt6Var = this.t;
        long j = gdVar.b;
        if (pt6Var != null) {
            mm1Var = new mm1(pt6Var.a - this.d);
        } else {
            mm1Var = null;
        }
        if (pt6Var != null) {
            mm1Var2 = new mm1(pt6Var.a - this.s);
        } else {
            mm1Var2 = null;
        }
        if (pt6Var == null) {
            mm1Var3 = null;
        } else {
            mm1Var3 = new mm1(j - pt6Var.a);
        }
        long j2 = elapsedRealtimeNanos - j;
        qp0 qp0Var = gdVar.a;
        uc0 uc0Var = gdVar.c;
        return new kf0(this.a, qp0Var, Integer.valueOf(this.c - 1), mm1Var, gdVar.d, mm1Var2, mm1Var3, new mm1(j2), uc0Var);
    }

    public final void d(CameraDevice cameraDevice) {
        Trace.beginSection(((Object) od0.b(this.a)) + "#onFinalized");
        Log.d("CXCP", this + ": onFinalized");
        b(cameraDevice, new gd(qp0.CAMERA2_CLOSED, null, null, 14));
        CameraDevice.StateCallback stateCallback = this.k;
        if (stateCallback != null) {
            stateCallback.onClosed(cameraDevice);
        }
        Trace.endSection();
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onClosed(CameraDevice cameraDevice) {
        cameraDevice.getClass();
        if (b53.x(cameraDevice.getId(), this.a)) {
            Log.d("CXCP", ((Object) od0.b(this.a)) + ": onClosed");
            this.r.countDown();
            synchronized (this.n) {
                if (this.q) {
                    Log.i("CXCP", this + "#onClosed: Delaying finalizing.");
                    return;
                }
                d(cameraDevice);
                return;
            }
        }
        i.n("Check failed.");
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onDisconnected(CameraDevice cameraDevice) {
        cameraDevice.getClass();
        String id = cameraDevice.getId();
        String str = this.a;
        if (b53.x(id, str)) {
            Trace.beginSection(((Object) od0.b(str)) + "#onDisconnected");
            Log.d("CXCP", ((Object) od0.b(str)) + ": onDisconnected");
            this.r.countDown();
            b(cameraDevice, new gd(qp0.CAMERA2_DISCONNECTED, new uc0(6), null, 10));
            CameraDevice.StateCallback stateCallback = this.k;
            if (stateCallback != null) {
                stateCallback.onDisconnected(cameraDevice);
            }
            Trace.endSection();
            return;
        }
        i.n("Check failed.");
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onError(CameraDevice cameraDevice, int i) {
        cameraDevice.getClass();
        String id = cameraDevice.getId();
        String str = this.a;
        if (b53.x(id, str)) {
            Trace.beginSection(((Object) od0.b(str)) + "#onError-" + i);
            Log.d("CXCP", ((Object) od0.b(str)) + ": onError " + i);
            this.r.countDown();
            qp0 qp0Var = qp0.CAMERA2_ERROR;
            int i2 = 1;
            if (i != 1) {
                i2 = 2;
                if (i != 2) {
                    i2 = 3;
                    if (i != 3) {
                        i2 = 4;
                        if (i != 4) {
                            i2 = 5;
                            if (i != 5) {
                                i.i(wh1.g(i, "Unexpected StateCallback error code: "));
                                return;
                            }
                        }
                    }
                }
            }
            b(cameraDevice, new gd(qp0Var, new uc0(i2), null, 10));
            CameraDevice.StateCallback stateCallback = this.k;
            if (stateCallback != null) {
                stateCallback.onError(cameraDevice, i);
            }
            Trace.endSection();
            return;
        }
        i.n("Check failed.");
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onOpened(CameraDevice cameraDevice) {
        String m;
        gd gdVar;
        gd gdVar2;
        boolean z;
        cameraDevice.getClass();
        if (b53.x(cameraDevice.getId(), this.a)) {
            this.e.getClass();
            long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            this.t = new pt6(elapsedRealtimeNanos);
            Trace.beginSection(((Object) od0.b(this.a)) + "#onOpened");
            long j = elapsedRealtimeNanos - this.s;
            long j2 = elapsedRealtimeNanos - this.d;
            int i = this.c;
            String str = this.a;
            boolean z2 = true;
            if (i == 1) {
                StringBuilder sb = new StringBuilder("Opened ");
                sb.append((Object) od0.b(str));
                sb.append(" in ");
                m = b31.r(new Object[]{Double.valueOf(j / 1000000.0d)}, 1, null, "%.3f ms", sb);
            } else {
                StringBuilder sb2 = new StringBuilder("Opened ");
                sb2.append((Object) od0.b(str));
                sb2.append(" in ");
                sb2.append(String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(j / 1000000.0d)}, 1)));
                sb2.append(" (");
                sb2.append(String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(j2 / 1000000.0d)}, 1)));
                sb2.append(" total) after ");
                m = wh1.m(sb2, this.c, " attempts.");
            }
            Log.i("CXCP", m);
            synchronized (this.n) {
                gdVar = this.p;
                if (gdVar == null) {
                    this.o = true;
                }
            }
            CameraDevice.StateCallback stateCallback = this.k;
            if (stateCallback != null) {
                stateCallback.onOpened(cameraDevice);
            }
            if (gdVar != null) {
                ya0 ya0Var = this.g;
                jw jwVar = this.j;
                fb0 fb0Var = this.h;
                String str2 = this.a;
                if (!e(fb0Var, str2, gdVar.c) || !fb0Var.a(str2)) {
                    z2 = false;
                }
                ya0Var.b(null, cameraDevice, this, jwVar, z2, e(this.h, this.a, gdVar.c));
                return;
            }
            cd cdVar = new cd(this.b, cameraDevice, this.a, this.f, this.l, this.i);
            jw jwVar2 = this.j;
            jwVar2.getClass();
            if (Build.VERSION.SDK_INT >= 30) {
                synchronized (jwVar2.c) {
                    jwVar2.e.add(cdVar);
                    kw a = jwVar2.a();
                    if (a != null) {
                        bq0 bq0Var = jwVar2.b;
                        g11 g11Var = jwVar2.a;
                        n5 n5Var = new n5(cdVar, a, (j11) null, 2);
                        bq0Var.getClass();
                        g11Var.getClass();
                        tq5.w(g11Var, null, s31.UNDISPATCHED, new m5((Object) bq0Var, (aj2) n5Var, (j11) null, 19), 1);
                    }
                }
            }
            ee6 ee6Var = this.u;
            mf0 mf0Var = new mf0(cdVar);
            ee6Var.getClass();
            ee6Var.l(null, mf0Var);
            synchronized (this.n) {
                this.o = false;
                gdVar2 = this.p;
            }
            if (gdVar2 != null) {
                ee6 ee6Var2 = this.u;
                lf0 lf0Var = new lf0(gdVar2.c);
                ee6Var2.getClass();
                ee6Var2.l(null, lf0Var);
                ya0 ya0Var2 = this.g;
                jw jwVar3 = this.j;
                fb0 fb0Var2 = this.h;
                String str3 = this.a;
                if (e(fb0Var2, str3, gdVar2.c) && fb0Var2.a(str3)) {
                    z = true;
                } else {
                    z = false;
                }
                ya0Var2.b(cdVar, cameraDevice, this, jwVar3, z, e(this.h, this.a, gdVar2.c));
                ee6 ee6Var3 = this.u;
                kf0 c = c(gdVar2);
                ee6Var3.getClass();
                ee6Var3.l(null, c);
            }
            Trace.endSection();
            return;
        }
        i.n("Check failed.");
    }

    public final String toString() {
        return "CameraState-" + this.m;
    }
}
