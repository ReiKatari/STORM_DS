package defpackage;

import android.os.Looper;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: m16  reason: default package */
/* loaded from: classes.dex */
public abstract class m16 {
    public o41 a;
    public l61 b;
    public Executor c;
    public zb6 d;
    public ai1 e;
    public zb3 f;
    public boolean h;
    public final u63 g = new u63(new i4(0, this, m16.class, "onClosed", "onClosed()V", 0, 0, 9));
    public final ThreadLocal i = new ThreadLocal();
    public final LinkedHashMap j = new LinkedHashMap();
    public boolean k = true;

    public final void a() {
        boolean z;
        if (!this.h) {
            if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                return;
            }
            i.m("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    public final void b() {
        a();
        a();
        vm2 I = h().I();
        if (!I.Y()) {
            hi2.L(new a6(g(), null, 25));
        }
        if (I.A.isWriteAheadLoggingEnabled()) {
            I.h();
        } else {
            I.e();
        }
    }

    public List c(LinkedHashMap linkedHashMap) {
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(c14.k0(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            ar0 ar0Var = (ar0) entry.getKey();
            ar0Var.getClass();
            Class a = ar0Var.a();
            a.getClass();
            linkedHashMap2.put(a, entry.getValue());
        }
        return yt1.A;
    }

    public abstract zb3 d();

    public ts1 e() {
        throw new tg4(0);
    }

    public final void f() {
        h().I().n();
        if (!l()) {
            zb3 g = g();
            g.b.e(g.e, g.f);
        }
    }

    public final zb3 g() {
        zb3 zb3Var = this.f;
        if (zb3Var != null) {
            return zb3Var;
        }
        nb3.a0("internalTracker");
        throw null;
    }

    public final pu6 h() {
        ai1 ai1Var = this.e;
        if (ai1Var != null) {
            pu6 pu6Var = (pu6) ai1Var.h;
            if (pu6Var != null) {
                return pu6Var;
            }
            i.m("Cannot return a SupportSQLiteOpenHelper since no SupportSQLiteOpenHelper.Factory was configured with Room.");
            return null;
        }
        nb3.a0("connectionManager");
        throw null;
    }

    public Set i() {
        return gt0.p1(new ArrayList(ht0.v0(du1.A, 10)));
    }

    public LinkedHashMap j() {
        int k0 = c14.k0(ht0.v0(du1.A, 10));
        if (k0 < 16) {
            k0 = 16;
        }
        return new LinkedHashMap(k0);
    }

    public final boolean k() {
        ai1 ai1Var = this.e;
        if (ai1Var != null) {
            if (((pu6) ai1Var.h) != null) {
                return true;
            }
            return false;
        }
        nb3.a0("connectionManager");
        throw null;
    }

    public final boolean l() {
        if (n() && h().I().Y()) {
            return true;
        }
        return false;
    }

    public final void m(e36 e36Var) {
        e36Var.getClass();
        zb3 g = g();
        nc7 nc7Var = g.b;
        nc7Var.getClass();
        j36 i0 = e36Var.i0("PRAGMA query_only");
        try {
            i0.f0();
            boolean z = i0.z();
            lb4.p(i0, null);
            if (!z) {
                ii2.s(e36Var, "PRAGMA temp_store = MEMORY");
                ii2.s(e36Var, "PRAGMA recursive_triggers = 1");
                ii2.s(e36Var, "DROP TABLE IF EXISTS room_table_modification_log");
                if (nc7Var.d) {
                    ii2.s(e36Var, "CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
                } else {
                    ii2.s(e36Var, xs6.e0("CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)", "TEMP", ""));
                }
                di4 di4Var = nc7Var.h;
                ReentrantLock reentrantLock = di4Var.a;
                reentrantLock.lock();
                try {
                    di4Var.d = true;
                } finally {
                    reentrantLock.unlock();
                }
            }
            synchronized (g.g) {
            }
        } finally {
        }
    }

    public final boolean n() {
        ai1 ai1Var = this.e;
        if (ai1Var != null) {
            vm2 vm2Var = (vm2) ai1Var.i;
            if (vm2Var != null) {
                return vm2Var.isOpen();
            }
            return false;
        }
        nb3.a0("connectionManager");
        throw null;
    }

    public final Object o(on2 on2Var) {
        if (k()) {
            b();
            try {
                Object c = on2Var.c();
                p();
                return c;
            } finally {
                f();
            }
        }
        return hv.Q(this, false, true, new mn0(6, on2Var));
    }

    public final void p() {
        h().I().D();
    }

    public final Object q(boolean z, eo2 eo2Var, s41 s41Var) {
        ai1 ai1Var = this.e;
        if (ai1Var != null) {
            return ((qz0) ai1Var.g).s(z, eo2Var, s41Var);
        }
        nb3.a0("connectionManager");
        throw null;
    }
}
