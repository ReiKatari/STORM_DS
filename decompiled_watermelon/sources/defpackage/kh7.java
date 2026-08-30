package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Trace;
import androidx.work.impl.WorkDatabase;
import java.util.List;
import me.magnum.melonds.MelonDSApplication;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: kh7  reason: default package */
/* loaded from: classes.dex */
public final class kh7 {
    public static kh7 k;
    public static kh7 l;
    public static final Object m;
    public final Context a;
    public final ew0 b;
    public final WorkDatabase c;
    public final nh7 d;
    public final List e;
    public final ku4 f;
    public final gv2 g;
    public boolean h = false;
    public BroadcastReceiver.PendingResult i;
    public final jw6 j;

    static {
        y70.h("WorkManagerImpl");
        k = null;
        l = null;
        m = new Object();
    }

    public kh7(Context context, final ew0 ew0Var, nh7 nh7Var, final WorkDatabase workDatabase, final List list, ku4 ku4Var, jw6 jw6Var) {
        Context applicationContext = context.getApplicationContext();
        if (!applicationContext.isDeviceProtectedStorage()) {
            y70 y70Var = new y70(ew0Var.h, 2);
            synchronized (y70.e) {
                try {
                    if (y70.f == null) {
                        y70.f = y70Var;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.a = applicationContext;
            this.d = nh7Var;
            this.c = workDatabase;
            this.f = ku4Var;
            this.j = jw6Var;
            this.b = ew0Var;
            this.e = list;
            g31 g31Var = nh7Var.b;
            g31Var.getClass();
            g11 c = iq2.c(g31Var);
            this.g = new gv2(workDatabase, 1);
            final k06 k06Var = nh7Var.a;
            String str = bv5.a;
            ku4Var.a(new k22() { // from class: av5
                @Override // defpackage.k22
                public final void d(gh7 gh7Var, boolean z) {
                    k06Var.execute(new mb0(list, gh7Var, ew0Var, workDatabase, 2));
                }
            });
            nh7Var.a.execute(new we2(applicationContext, this));
            String str2 = m27.a;
            if (hu4.a(applicationContext, ew0Var)) {
                tq5.w(c, null, null, new a6(new la2(se.q(se.j(new ln0(2, yg7.a(workDatabase.w().a, false, new String[]{"workspec"}, new ci7(1)), new nk6(4, null)), -1)), new dm0(applicationContext, (j11) null, 3), 2), null, 19), 3);
                return;
            }
            return;
        }
        i.n("Cannot initialize WorkManager in direct boot mode");
        throw null;
    }

    public static kh7 b(Context context) {
        kh7 kh7Var;
        Object obj = m;
        synchronized (obj) {
            try {
                synchronized (obj) {
                    kh7Var = k;
                    if (kh7Var == null) {
                        kh7Var = l;
                    }
                }
                return kh7Var;
            } finally {
            }
        }
        if (kh7Var == null) {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext instanceof MelonDSApplication) {
                bq0 bq0Var = new bq0(24, false);
                qr2 qr2Var = ((MelonDSApplication) applicationContext).L;
                if (qr2Var != null) {
                    bq0Var.B = qr2Var;
                    d(applicationContext, new ew0(bq0Var));
                    kh7Var = b(applicationContext);
                } else {
                    b53.g0("workerFactory");
                    throw null;
                }
            } else {
                throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
            }
        }
        return kh7Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0018, code lost:
        r3 = r3.getApplicationContext();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x001e, code lost:
        if (defpackage.kh7.l != null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0020, code lost:
        defpackage.kh7.l = defpackage.mh7.s(r3, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0026, code lost:
        defpackage.kh7.k = defpackage.kh7.l;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void d(android.content.Context r3, defpackage.ew0 r4) {
        /*
            java.lang.Object r0 = defpackage.kh7.m
            monitor-enter(r0)
            kh7 r1 = defpackage.kh7.k     // Catch: java.lang.Throwable -> L14
            if (r1 == 0) goto L16
            kh7 r2 = defpackage.kh7.l     // Catch: java.lang.Throwable -> L14
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
            kh7 r1 = defpackage.kh7.l     // Catch: java.lang.Throwable -> L14
            if (r1 != 0) goto L26
            kh7 r3 = defpackage.mh7.s(r3, r4)     // Catch: java.lang.Throwable -> L14
            defpackage.kh7.l = r3     // Catch: java.lang.Throwable -> L14
        L26:
            kh7 r3 = defpackage.kh7.l     // Catch: java.lang.Throwable -> L14
            defpackage.kh7.k = r3     // Catch: java.lang.Throwable -> L14
        L2a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            return
        L2c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kh7.d(android.content.Context, ew0):void");
    }

    public final void a(String str, g32 g32Var, id4 id4Var) {
        g32Var.getClass();
        new ah7(this, str, g32Var, l07.b0(id4Var)).a();
    }

    public final u92 c(String str) {
        di7 w = this.c.w();
        g31 g31Var = this.d.b;
        w.getClass();
        g31Var.getClass();
        return se.x(se.q(new gq5(yg7.a(w.a, true, new String[]{"WorkTag", "WorkProgress", "workspec", "workname"}, new h57(4, str, w)), 1)), g31Var);
    }

    public final void e() {
        synchronized (m) {
            try {
                this.h = true;
                BroadcastReceiver.PendingResult pendingResult = this.i;
                if (pendingResult != null) {
                    pendingResult.finish();
                    this.i = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void f() {
        y60 y60Var = this.b.m;
        fh0 fh0Var = new fh0(this, 1);
        y60Var.getClass();
        boolean R = io2.R();
        if (R) {
            try {
                Trace.beginSection(io2.p0("ReschedulingWork"));
            } finally {
                if (R) {
                    Trace.endSection();
                }
            }
        }
        fh0Var.c();
    }
}
