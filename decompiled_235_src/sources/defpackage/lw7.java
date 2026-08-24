package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Trace;
import androidx.work.impl.WorkDatabase;
import java.util.List;
import me.magnum.melonds.MelonDSApplication;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: lw7  reason: default package */
/* loaded from: classes.dex */
public final class lw7 {
    public static lw7 k;
    public static lw7 l;
    public static final Object m;
    public final Context a;
    public final az0 b;
    public final WorkDatabase c;
    public final ow7 d;
    public final List e;
    public final o35 f;
    public final k13 g;
    public boolean h = false;
    public BroadcastReceiver.PendingResult i;
    public final w87 j;

    static {
        ga0.h("WorkManagerImpl");
        k = null;
        l = null;
        m = new Object();
    }

    public lw7(Context context, final az0 az0Var, ow7 ow7Var, final WorkDatabase workDatabase, final List list, o35 o35Var, w87 w87Var) {
        Context applicationContext = context.getApplicationContext();
        if (!applicationContext.isDeviceProtectedStorage()) {
            ga0 ga0Var = new ga0(az0Var.h, 2);
            synchronized (ga0.e) {
                try {
                    if (ga0.f == null) {
                        ga0.f = ga0Var;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.a = applicationContext;
            this.d = ow7Var;
            this.c = workDatabase;
            this.f = o35Var;
            this.j = w87Var;
            this.b = az0Var;
            this.e = list;
            n61 n61Var = ow7Var.b;
            n61Var.getClass();
            o41 i = g04.i(n61Var);
            this.g = new k13(workDatabase, 1);
            final zb6 zb6Var = ow7Var.a;
            String str = h66.a;
            o35Var.a(new b72() { // from class: g66
                @Override // defpackage.b72
                public final void b(gw7 gw7Var, boolean z) {
                    zb6Var.execute(new vd0(list, gw7Var, az0Var, workDatabase, 2));
                }
            });
            ow7Var.a.execute(new vj2(applicationContext, this));
            String str2 = hg7.a;
            if (l35.a(applicationContext, az0Var)) {
                hv.L(i, null, null, new a6(new cf2(f04.z(f04.o(new wp0(2, yv7.a(workDatabase.w().a, false, new String[]{"workspec"}, new rk7(19)), new hw6(4, null)), -1)), new lo0(applicationContext, (r41) null, 3), 2), null, 20), 3);
                return;
            }
            return;
        }
        i.m("Cannot initialize WorkManager in direct boot mode");
        throw null;
    }

    public static lw7 b(Context context) {
        lw7 lw7Var;
        Object obj = m;
        synchronized (obj) {
            try {
                synchronized (obj) {
                    lw7Var = k;
                    if (lw7Var == null) {
                        lw7Var = l;
                    }
                }
                return lw7Var;
            } finally {
            }
        }
        if (lw7Var == null) {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext instanceof MelonDSApplication) {
                os0 os0Var = new os0(26, false);
                rx2 rx2Var = ((MelonDSApplication) applicationContext).L;
                if (rx2Var != null) {
                    os0Var.B = rx2Var;
                    d(applicationContext, new az0(os0Var));
                    lw7Var = b(applicationContext);
                } else {
                    nb3.a0("workerFactory");
                    throw null;
                }
            } else {
                throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
            }
        }
        return lw7Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0018, code lost:
        r3 = r3.getApplicationContext();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x001e, code lost:
        if (defpackage.lw7.l != null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0020, code lost:
        defpackage.lw7.l = defpackage.nw7.U(r3, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0026, code lost:
        defpackage.lw7.k = defpackage.lw7.l;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void d(Context context, az0 az0Var) {
        synchronized (m) {
            try {
                lw7 lw7Var = k;
                if (lw7Var != null && l != null) {
                    throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
                }
            } finally {
            }
        }
    }

    public final void a(String str, y72 y72Var, gm4 gm4Var) {
        y72Var.getClass();
        new aw7(this, str, y72Var, hf.b0(gm4Var)).a();
    }

    public final le2 c(String str) {
        dx7 w = this.c.w();
        n61 n61Var = this.d.b;
        w.getClass();
        n61Var.getClass();
        return f04.E(f04.z(new a16(yv7.a(w.a, true, new String[]{"WorkTag", "WorkProgress", "workspec", "workname"}, new ja7(11, str, w)), 1)), n61Var);
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
        xd5 xd5Var = this.b.m;
        oj0 oj0Var = new oj0(this, 1);
        xd5Var.getClass();
        boolean H = ln2.H();
        if (H) {
            try {
                Trace.beginSection(ln2.f0("ReschedulingWork"));
            } finally {
                if (H) {
                    Trace.endSection();
                }
            }
        }
        oj0Var.c();
    }
}
