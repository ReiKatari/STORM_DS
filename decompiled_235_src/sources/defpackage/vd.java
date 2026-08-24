package defpackage;

import android.hardware.camera2.CameraDevice;
import android.os.Build;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Log;
import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vd  reason: default package */
/* loaded from: classes.dex */
public final class vd extends CameraDevice.StateCallback {
    public final String a;
    public final lg0 b;
    public final int c;
    public final long d;
    public final yx6 e;
    public final id0 f;
    public final gd0 g;
    public final nd0 h;
    public final t57 i;
    public final bx j;
    public final CameraDevice.StateCallback k;
    public final u63 l;
    public final int m;
    public final Object n;
    public boolean o;
    public ud p;
    public boolean q;
    public final CountDownLatch r;
    public final long s;
    public g67 t;
    public final tp6 u;

    public vd(String str, lg0 lg0Var, int i, long j, yx6 yx6Var, id0 id0Var, gd0 gd0Var, nd0 nd0Var, t57 t57Var, bx bxVar, CameraDevice.StateCallback stateCallback, u63 u63Var) {
        str.getClass();
        lg0Var.getClass();
        yx6Var.getClass();
        id0Var.getClass();
        gd0Var.getClass();
        nd0Var.getClass();
        t57Var.getClass();
        bxVar.getClass();
        this.a = str;
        this.b = lg0Var;
        this.c = i;
        this.d = j;
        this.e = yx6Var;
        this.f = id0Var;
        this.g = gd0Var;
        this.h = nd0Var;
        this.i = t57Var;
        this.j = bxVar;
        this.k = stateCallback;
        this.l = u63Var;
        uw uwVar = oq7.b;
        uwVar.getClass();
        this.m = uw.b.incrementAndGet(uwVar);
        this.n = new Object();
        this.r = new CountDownLatch(1);
        this.u = up6.a(di0.a);
        Log.i("CXCP", "Opening " + ((Object) xf0.b(str)));
        this.s = i != 1 ? SystemClock.elapsedRealtimeNanos() : j;
    }

    public static boolean e(nd0 nd0Var, String str, df0 df0Var) {
        nd0Var.getClass();
        str.getClass();
        nd0Var.b.getClass();
        if (Build.VERSION.SDK_INT < 29) {
            kg0 kg0Var = lg0.g;
            lg0 d = nd0Var.a.d(str);
            kg0Var.getClass();
            if (kg0.c(d) && df0Var == null) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void a() {
        bf0 bf0Var;
        CameraDevice cameraDevice;
        oh0 oh0Var = (oh0) this.u.getValue();
        if (oh0Var instanceof vh0) {
            bf0Var = ((vh0) oh0Var).a;
        } else {
            bf0Var = null;
        }
        if (bf0Var != null) {
            cameraDevice = (CameraDevice) bf0Var.e(gh5.a(CameraDevice.class));
        } else {
            cameraDevice = null;
        }
        b(cameraDevice, new ud(ds0.APP_CLOSED, null, null, 14));
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001f, code lost:
        if (r10.o == false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(CameraDevice cameraDevice, ud udVar) {
        bf0 bf0Var;
        vd vdVar;
        boolean z;
        oh0 oh0Var = (oh0) this.u.getValue();
        if (oh0Var instanceof vh0) {
            bf0Var = ((vh0) oh0Var).a;
        } else {
            bf0Var = null;
        }
        synchronized (this.n) {
            if (this.p == null) {
                this.p = udVar;
            }
            udVar = null;
        }
        if (udVar != null) {
            df0 df0Var = udVar.c;
            if (df0Var != null && udVar.a != ds0.CAMERA2_EXCEPTION) {
                this.f.a(this.a, df0Var.a, false);
            }
            tp6 tp6Var = this.u;
            uh0 uh0Var = new uh0(udVar.c);
            tp6Var.getClass();
            tp6Var.m(null, uh0Var);
            if (udVar.a != ds0.CAMERA2_CLOSED) {
                nd0 nd0Var = this.h;
                String str = this.a;
                if (e(nd0Var, str, udVar.c) && nd0Var.a(str)) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    synchronized (this.n) {
                        this.q = true;
                    }
                }
                vdVar = this;
                this.g.b(bf0Var, cameraDevice, vdVar, this.j, z, e(this.h, this.a, udVar.c));
            } else {
                vdVar = this;
            }
            tp6 tp6Var2 = vdVar.u;
            th0 c = vdVar.c(udVar);
            tp6Var2.getClass();
            tp6Var2.m(null, c);
        }
    }

    public final th0 c(ud udVar) {
        sq1 sq1Var;
        sq1 sq1Var2;
        sq1 sq1Var3;
        this.e.getClass();
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        g67 g67Var = this.t;
        long j = udVar.b;
        if (g67Var != null) {
            sq1Var = new sq1(g67Var.a - this.d);
        } else {
            sq1Var = null;
        }
        if (g67Var != null) {
            sq1Var2 = new sq1(g67Var.a - this.s);
        } else {
            sq1Var2 = null;
        }
        if (g67Var == null) {
            sq1Var3 = null;
        } else {
            sq1Var3 = new sq1(j - g67Var.a);
        }
        long j2 = elapsedRealtimeNanos - j;
        ds0 ds0Var = udVar.a;
        df0 df0Var = udVar.c;
        return new th0(this.a, ds0Var, Integer.valueOf(this.c - 1), sq1Var, udVar.d, sq1Var2, sq1Var3, new sq1(j2), df0Var);
    }

    public final void d(CameraDevice cameraDevice) {
        Trace.beginSection(((Object) xf0.b(this.a)) + "#onFinalized");
        Log.d("CXCP", this + ": onFinalized");
        b(cameraDevice, new ud(ds0.CAMERA2_CLOSED, null, null, 14));
        CameraDevice.StateCallback stateCallback = this.k;
        if (stateCallback != null) {
            stateCallback.onClosed(cameraDevice);
        }
        Trace.endSection();
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onClosed(CameraDevice cameraDevice) {
        cameraDevice.getClass();
        if (nb3.k(cameraDevice.getId(), this.a)) {
            Log.d("CXCP", ((Object) xf0.b(this.a)) + ": onClosed");
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
        i.m("Check failed.");
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onDisconnected(CameraDevice cameraDevice) {
        cameraDevice.getClass();
        String id = cameraDevice.getId();
        String str = this.a;
        if (nb3.k(id, str)) {
            Trace.beginSection(((Object) xf0.b(str)) + "#onDisconnected");
            Log.d("CXCP", ((Object) xf0.b(str)) + ": onDisconnected");
            this.r.countDown();
            b(cameraDevice, new ud(ds0.CAMERA2_DISCONNECTED, new df0(6), null, 10));
            CameraDevice.StateCallback stateCallback = this.k;
            if (stateCallback != null) {
                stateCallback.onDisconnected(cameraDevice);
            }
            Trace.endSection();
            return;
        }
        i.m("Check failed.");
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onError(CameraDevice cameraDevice, int i) {
        cameraDevice.getClass();
        String id = cameraDevice.getId();
        String str = this.a;
        if (nb3.k(id, str)) {
            Trace.beginSection(((Object) xf0.b(str)) + "#onError-" + i);
            Log.d("CXCP", ((Object) xf0.b(str)) + ": onError " + i);
            this.r.countDown();
            ds0 ds0Var = ds0.CAMERA2_ERROR;
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
                                i.h(lb1.g(i, "Unexpected StateCallback error code: "));
                                return;
                            }
                        }
                    }
                }
            }
            b(cameraDevice, new ud(ds0Var, new df0(i2), null, 10));
            CameraDevice.StateCallback stateCallback = this.k;
            if (stateCallback != null) {
                stateCallback.onError(cameraDevice, i);
            }
            Trace.endSection();
            return;
        }
        i.m("Check failed.");
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onOpened(CameraDevice cameraDevice) {
        String o;
        ud udVar;
        ud udVar2;
        boolean z;
        cameraDevice.getClass();
        if (nb3.k(cameraDevice.getId(), this.a)) {
            this.e.getClass();
            long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            this.t = new g67(elapsedRealtimeNanos);
            Trace.beginSection(((Object) xf0.b(this.a)) + "#onOpened");
            long j = elapsedRealtimeNanos - this.s;
            long j2 = elapsedRealtimeNanos - this.d;
            int i = this.c;
            String str = this.a;
            boolean z2 = true;
            if (i == 1) {
                StringBuilder sb = new StringBuilder("Opened ");
                sb.append((Object) xf0.b(str));
                sb.append(" in ");
                o = i61.p(new Object[]{Double.valueOf(j / 1000000.0d)}, 1, null, "%.3f ms", sb);
            } else {
                StringBuilder sb2 = new StringBuilder("Opened ");
                sb2.append((Object) xf0.b(str));
                sb2.append(" in ");
                sb2.append(String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(j / 1000000.0d)}, 1)));
                sb2.append(" (");
                sb2.append(String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(j2 / 1000000.0d)}, 1)));
                sb2.append(" total) after ");
                o = lb1.o(sb2, this.c, " attempts.");
            }
            Log.i("CXCP", o);
            synchronized (this.n) {
                udVar = this.p;
                if (udVar == null) {
                    this.o = true;
                }
            }
            CameraDevice.StateCallback stateCallback = this.k;
            if (stateCallback != null) {
                stateCallback.onOpened(cameraDevice);
            }
            if (udVar != null) {
                gd0 gd0Var = this.g;
                bx bxVar = this.j;
                nd0 nd0Var = this.h;
                String str2 = this.a;
                if (!e(nd0Var, str2, udVar.c) || !nd0Var.a(str2)) {
                    z2 = false;
                }
                gd0Var.b(null, cameraDevice, this, bxVar, z2, e(this.h, this.a, udVar.c));
                return;
            }
            rd rdVar = new rd(this.b, cameraDevice, this.a, this.f, this.l, this.i);
            bx bxVar2 = this.j;
            bxVar2.getClass();
            if (Build.VERSION.SDK_INT >= 30) {
                synchronized (bxVar2.c) {
                    bxVar2.e.add(rdVar);
                    cx a = bxVar2.a();
                    if (a != null) {
                        d51 d51Var = bxVar2.b;
                        o41 o41Var = bxVar2.a;
                        m5 m5Var = new m5(rdVar, a, (r41) null, 2);
                        d51Var.getClass();
                        o41Var.getClass();
                        hv.L(o41Var, null, a71.UNDISPATCHED, new l5(d51Var, m5Var, (r41) null, 21), 1);
                    }
                }
            }
            tp6 tp6Var = this.u;
            vh0 vh0Var = new vh0(rdVar);
            tp6Var.getClass();
            tp6Var.m(null, vh0Var);
            synchronized (this.n) {
                this.o = false;
                udVar2 = this.p;
            }
            if (udVar2 != null) {
                tp6 tp6Var2 = this.u;
                uh0 uh0Var = new uh0(udVar2.c);
                tp6Var2.getClass();
                tp6Var2.m(null, uh0Var);
                gd0 gd0Var2 = this.g;
                bx bxVar3 = this.j;
                nd0 nd0Var2 = this.h;
                String str3 = this.a;
                if (e(nd0Var2, str3, udVar2.c) && nd0Var2.a(str3)) {
                    z = true;
                } else {
                    z = false;
                }
                gd0Var2.b(rdVar, cameraDevice, this, bxVar3, z, e(this.h, this.a, udVar2.c));
                tp6 tp6Var3 = this.u;
                th0 c = c(udVar2);
                tp6Var3.getClass();
                tp6Var3.m(null, c);
            }
            Trace.endSection();
            return;
        }
        i.m("Check failed.");
    }

    public final String toString() {
        return "CameraState-" + this.m;
    }
}
