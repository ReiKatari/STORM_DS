package q8;

import ah.h0;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Trace;
import androidx.work.impl.WorkDatabase;
import java.util.List;
import kf.s0;
import l.i0;
import me.magnum.melonds.MelonDSApplication;
import u1.h1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class p {

    /* renamed from: k  reason: collision with root package name */
    public static p f12369k;

    /* renamed from: l  reason: collision with root package name */
    public static p f12370l;
    public static final Object m;

    /* renamed from: a  reason: collision with root package name */
    public final Context f12371a;

    /* renamed from: b  reason: collision with root package name */
    public final p8.b f12372b;

    /* renamed from: c  reason: collision with root package name */
    public final WorkDatabase f12373c;

    /* renamed from: d  reason: collision with root package name */
    public final z8.a f12374d;

    /* renamed from: e  reason: collision with root package name */
    public final List f12375e;

    /* renamed from: f  reason: collision with root package name */
    public final d f12376f;

    /* renamed from: g  reason: collision with root package name */
    public final y8.e f12377g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f12378h = false;

    /* renamed from: i  reason: collision with root package name */
    public BroadcastReceiver.PendingResult f12379i;

    /* renamed from: j  reason: collision with root package name */
    public final v8.j f12380j;

    static {
        p8.v.g("WorkManagerImpl");
        f12369k = null;
        f12370l = null;
        m = new Object();
    }

    public p(Context context, final p8.b bVar, z8.a aVar, final WorkDatabase workDatabase, final List list, d dVar, v8.j jVar) {
        Context applicationContext = context.getApplicationContext();
        if (!applicationContext.isDeviceProtectedStorage()) {
            p8.v vVar = new p8.v(bVar.f11459h);
            synchronized (p8.v.f11507b) {
                try {
                    if (p8.v.f11508c == null) {
                        p8.v.f11508c = vVar;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.f12371a = applicationContext;
            this.f12374d = aVar;
            this.f12373c = workDatabase;
            this.f12376f = dVar;
            this.f12380j = jVar;
            this.f12372b = bVar;
            this.f12375e = list;
            zc.q qVar = aVar.f14970b;
            qVar.getClass();
            h0 a10 = zc.x.a(qVar);
            this.f12377g = new y8.e(workDatabase, 1);
            final k7.a0 a0Var = aVar.f14969a;
            String str = i.f12354a;
            dVar.a(new a() { // from class: q8.g
                @Override // q8.a
                public final void b(x8.i iVar, boolean z10) {
                    a0Var.execute(new h(list, iVar, bVar, workDatabase, 0));
                }
            });
            aVar.f14969a.execute(new y8.c(applicationContext, this));
            String str2 = l.f12356a;
            if (y8.i.a(applicationContext, bVar)) {
                cd.q.v(new cd.v(cd.q.m(cd.q.g(new cd.x(1, r.r(workDatabase.w().f14444a, false, new String[]{"workspec"}, new h1(20)), new ec.j(4, null)), -1)), new bi.m(applicationContext, null, 2), 2), a10);
                return;
            }
            return;
        }
        a0.j.p("Cannot initialize WorkManager in direct boot mode");
        throw null;
    }

    public static p a(Context context) {
        p pVar;
        Object obj = m;
        synchronized (obj) {
            try {
                synchronized (obj) {
                    pVar = f12369k;
                    if (pVar == null) {
                        pVar = f12370l;
                    }
                }
                return pVar;
            } finally {
            }
        }
        if (pVar == null) {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext instanceof MelonDSApplication) {
                i0 i0Var = new i0(19, false);
                s6.a aVar = ((MelonDSApplication) applicationContext).L;
                if (aVar != null) {
                    i0Var.B = aVar;
                    b(applicationContext, new p8.b(i0Var));
                    pVar = a(applicationContext);
                } else {
                    nc.k.f("workerFactory");
                    throw null;
                }
            } else {
                throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
            }
        }
        return pVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0018, code lost:
        r3 = r3.getApplicationContext();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x001e, code lost:
        if (q8.p.f12370l != null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0020, code lost:
        q8.p.f12370l = q8.r.u(r3, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0026, code lost:
        q8.p.f12369k = q8.p.f12370l;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void b(android.content.Context r3, p8.b r4) {
        /*
            java.lang.Object r0 = q8.p.m
            monitor-enter(r0)
            q8.p r1 = q8.p.f12369k     // Catch: java.lang.Throwable -> L14
            if (r1 == 0) goto L16
            q8.p r2 = q8.p.f12370l     // Catch: java.lang.Throwable -> L14
            if (r2 != 0) goto Lc
            goto L16
        Lc:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L14
            java.lang.String r4 = "WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information."
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L14
            throw r3     // Catch: java.lang.Throwable -> L14
        L14:
            r3 = move-exception
            goto L2c
        L16:
            if (r1 != 0) goto L2a
            android.content.Context r3 = r3.getApplicationContext()     // Catch: java.lang.Throwable -> L14
            q8.p r1 = q8.p.f12370l     // Catch: java.lang.Throwable -> L14
            if (r1 != 0) goto L26
            q8.p r3 = q8.r.u(r3, r4)     // Catch: java.lang.Throwable -> L14
            q8.p.f12370l = r3     // Catch: java.lang.Throwable -> L14
        L26:
            q8.p r3 = q8.p.f12370l     // Catch: java.lang.Throwable -> L14
            q8.p.f12369k = r3     // Catch: java.lang.Throwable -> L14
        L2a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            return
        L2c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: q8.p.b(android.content.Context, p8.b):void");
    }

    public final void c() {
        synchronized (m) {
            try {
                this.f12378h = true;
                BroadcastReceiver.PendingResult pendingResult = this.f12379i;
                if (pendingResult != null) {
                    pendingResult.finish();
                    this.f12379i = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void d() {
        p8.x xVar = this.f12372b.m;
        s0 s0Var = new s0(9, this);
        xVar.getClass();
        boolean N = aj.g.N();
        if (N) {
            try {
                Trace.beginSection(aj.g.v0("ReschedulingWork"));
            } finally {
                if (N) {
                    Trace.endSection();
                }
            }
        }
        s0Var.b();
    }
}
