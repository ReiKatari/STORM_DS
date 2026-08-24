package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import java.util.Iterator;
import java.util.concurrent.Executor;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: dj0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class dj0 implements Runnable {
    public final /* synthetic */ int A = 0;
    public final /* synthetic */ gj0 B;
    public final /* synthetic */ Executor L;
    public final /* synthetic */ long R;
    public final /* synthetic */ int X;
    public final /* synthetic */ Context Y;
    public final /* synthetic */ qb0 Z;

    public /* synthetic */ dj0(gj0 gj0Var, Context context, Executor executor, int i, qb0 qb0Var, long j) {
        this.B = gj0Var;
        this.Y = context;
        this.L = executor;
        this.X = i;
        this.Z = qb0Var;
        this.R = j;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01cd A[Catch: all -> 0x022c, TRY_ENTER, TryCatch #6 {all -> 0x022f, blocks: (B:7:0x0034, B:9:0x003c, B:11:0x0061, B:13:0x0089, B:15:0x00aa, B:22:0x00bc, B:23:0x00e5, B:25:0x00eb, B:26:0x00fb, B:28:0x012d, B:29:0x0130, B:30:0x0132, B:34:0x013a, B:38:0x0144, B:39:0x0145, B:40:0x0151, B:41:0x0152, B:42:0x015e, B:43:0x015f, B:44:0x016b, B:45:0x016c, B:49:0x0183, B:51:0x01bb, B:76:0x0224, B:52:0x01bf, B:53:0x01c9, B:54:0x01cc, B:57:0x01d2, B:59:0x01d6, B:60:0x01d8, B:64:0x01df, B:69:0x01e7, B:71:0x01eb, B:72:0x0214, B:74:0x0218, B:75:0x021c, B:61:0x01d9, B:62:0x01dd, B:55:0x01cd, B:56:0x01d1), top: B:87:0x0034 }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        ip5 b;
        jf0 d;
        switch (this.A) {
            case 0:
                gj0 gj0Var = this.B;
                Context context = this.Y;
                Executor executor = this.L;
                int i = this.X;
                qb0 qb0Var = this.Z;
                long j = this.R;
                Trace.beginSection(ln2.f0("CX:initAndRetryRecursively"));
                try {
                    try {
                        d = gj0Var.c.d();
                    } finally {
                        Trace.endSection();
                    }
                } catch (bj0 e) {
                    e = e;
                    ou ouVar = new ou(j, e);
                    b = gj0Var.l.b(ouVar);
                    gj0.b(ouVar);
                    if (!b.b && i < Integer.MAX_VALUE) {
                        kj2.g0("CameraX", "Retry init. Start time " + j + " current time " + SystemClock.elapsedRealtime(), e);
                        Handler handler = gj0Var.e;
                        dj0 dj0Var = new dj0(gj0Var, executor, j, i, context, qb0Var);
                        long j2 = b.a;
                        if (Build.VERSION.SDK_INT >= 28) {
                            pp.t(handler, dj0Var, j2);
                        } else {
                            Message obtain = Message.obtain(handler, dj0Var);
                            obtain.obj = "retry_token";
                            handler.sendMessageDelayed(obtain, j2);
                        }
                    } else {
                        synchronized (gj0Var.b) {
                            gj0Var.p = fj0.INITIALIZING_ERROR;
                        }
                        if (b.c) {
                            synchronized (gj0Var.b) {
                                gj0Var.p = fj0.INITIALIZED;
                            }
                            qb0Var.a(null);
                            return;
                        } else if (e instanceof bj0) {
                            String str = "Device reporting less cameras than anticipated. On real devices: Retrying initialization might resolve temporary camera errors. On emulators: Ensure virtual camera configuration matches supported camera features as reported by PackageManager#hasSystemFeature. Available cameras: " + ((bj0) e).A;
                            kj2.w("CameraX", str, e);
                            qb0Var.c(new Exception(new Exception(str)));
                        } else if (e instanceof i53) {
                            qb0Var.c(e);
                        } else {
                            qb0Var.c(new Exception(e));
                        }
                    }
                    gj0Var.n.f();
                    return;
                } catch (i53 e2) {
                    e = e2;
                    ou ouVar2 = new ou(j, e);
                    b = gj0Var.l.b(ouVar2);
                    gj0.b(ouVar2);
                    if (!b.b) {
                    }
                    synchronized (gj0Var.b) {
                    }
                } catch (RuntimeException e3) {
                    e = e3;
                    ou ouVar22 = new ou(j, e);
                    b = gj0Var.l.b(ouVar22);
                    gj0.b(ouVar22);
                    if (!b.b) {
                    }
                    synchronized (gj0Var.b) {
                    }
                }
                if (d != null) {
                    ux uxVar = new ux(gj0Var.d, gj0Var.e);
                    mh0 a = gj0Var.c.a();
                    context.getClass();
                    g60 g60Var = new g60(context, a);
                    long k = gj0Var.c.k();
                    if (gj0Var.c.m() != null) {
                        aj0 aj0Var = new aj0(context);
                        gj0Var.i = aj0Var;
                        rr6 rr6Var = new rr6(aj0Var);
                        gj0Var.j = rr6Var;
                        gj0Var.g = d.a(context, uxVar, a, k, gj0Var.c, rr6Var);
                        if (gj0Var.c.l() != null) {
                            mi0 mi0Var = new mi0(context, (eb1) ((ex6) gj0Var.g.c).getValue(), gj0Var.g.e());
                            gj0Var.h = mi0Var;
                            gj0Var.j.L = mi0Var;
                            if (executor instanceof gf0) {
                                ((gf0) executor).e(gj0Var.g);
                            }
                            gj0Var.a.d(gj0Var.g);
                            ze0 ze0Var = (ze0) gj0Var.g.g;
                            ze0Var.b(gj0Var.a);
                            gj0Var.k = new eb(gj0Var.a, ze0Var, gj0Var.i, gj0Var.j);
                            Iterator it = gj0Var.a.c().iterator();
                            while (it.hasNext()) {
                                ((eg0) it.next()).q().g(gj0Var.k);
                            }
                            gj0Var.n.g(g60Var, gj0Var.g, gj0Var.a);
                            gh0 gh0Var = gj0Var.n;
                            mi0 mi0Var2 = gj0Var.h;
                            gh0Var.getClass();
                            mi0Var2.getClass();
                            gh0Var.m.add(mi0Var2);
                            gh0 gh0Var2 = gj0Var.n;
                            ze0 ze0Var2 = (ze0) gj0Var.g.g;
                            gh0Var2.getClass();
                            ze0Var2.getClass();
                            gh0Var2.m.add(ze0Var2);
                            g60Var.o(gj0Var.a);
                            if (i > 1) {
                                gj0.b(null);
                            }
                            synchronized (gj0Var.b) {
                                gj0Var.p = fj0.INITIALIZED;
                            }
                            qb0Var.a(null);
                            return;
                        }
                        throw new Exception(new IllegalArgumentException("Invalid app configuration provided. Missing CameraDeviceSurfaceManager."));
                    }
                    throw new Exception(new IllegalArgumentException("Invalid app configuration provided. Missing UseCaseConfigFactory."));
                }
                throw new Exception(new IllegalArgumentException("Invalid app configuration provided. Missing CameraFactory."));
            default:
                gj0 gj0Var2 = this.B;
                Executor executor2 = this.L;
                executor2.execute(new dj0(gj0Var2, this.Y, executor2, this.X + 1, this.Z, this.R));
                return;
        }
    }

    public /* synthetic */ dj0(gj0 gj0Var, Executor executor, long j, int i, Context context, qb0 qb0Var) {
        this.B = gj0Var;
        this.L = executor;
        this.R = j;
        this.X = i;
        this.Y = context;
        this.Z = qb0Var;
    }
}
