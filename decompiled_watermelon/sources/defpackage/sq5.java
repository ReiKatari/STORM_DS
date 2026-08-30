package defpackage;

import android.os.Looper;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: sq5  reason: default package */
/* loaded from: classes.dex */
public abstract class sq5 {
    public g11 a;
    public e31 b;
    public Executor c;
    public k06 d;
    public wd1 e;
    public m53 f;
    public boolean h;
    public final q03 g = new q03(new i4(0, this, sq5.class, "onClosed", "onClosed()V", 0, 0, 9));
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
            i.n("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    public final void b() {
        a();
        a();
        vh2 e0 = h().e0();
        if (!e0.G()) {
            ve2.Q(new a6(g(), null, 24));
        }
        if (e0.A.isWriteAheadLoggingEnabled()) {
            e0.i();
        } else {
            e0.d();
        }
    }

    public List c(LinkedHashMap linkedHashMap) {
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(zt3.j0(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            qo0 qo0Var = (qo0) entry.getKey();
            qo0Var.getClass();
            Class a = qo0Var.a();
            a.getClass();
            linkedHashMap2.put(a, entry.getValue());
        }
        return pp1.A;
    }

    public abstract m53 d();

    public io1 e() {
        throw new c84(0);
    }

    public final void f() {
        h().e0().w();
        if (!l()) {
            m53 g = g();
            g.b.e(g.e, g.f);
        }
    }

    public final m53 g() {
        m53 m53Var = this.f;
        if (m53Var != null) {
            return m53Var;
        }
        b53.g0("internalTracker");
        throw null;
    }

    public final vi6 h() {
        wd1 wd1Var = this.e;
        if (wd1Var != null) {
            vi6 vi6Var = (vi6) wd1Var.h;
            if (vi6Var != null) {
                return vi6Var;
            }
            i.n("Cannot return a SupportSQLiteOpenHelper since no SupportSQLiteOpenHelper.Factory was configured with Room.");
            return null;
        }
        b53.g0("connectionManager");
        throw null;
    }

    public Set i() {
        return tq0.s1(new ArrayList(uq0.y0(up1.A, 10)));
    }

    public LinkedHashMap j() {
        int j0 = zt3.j0(uq0.y0(up1.A, 10));
        if (j0 < 16) {
            j0 = 16;
        }
        return new LinkedHashMap(j0);
    }

    public final boolean k() {
        wd1 wd1Var = this.e;
        if (wd1Var != null) {
            if (((vi6) wd1Var.h) != null) {
                return true;
            }
            return false;
        }
        b53.g0("connectionManager");
        throw null;
    }

    public final boolean l() {
        if (n() && h().e0().G()) {
            return true;
        }
        return false;
    }

    public final void m(ls5 ls5Var) {
        ls5Var.getClass();
        m53 g = g();
        sy6 sy6Var = g.b;
        sy6Var.getClass();
        ns5 i0 = ls5Var.i0("PRAGMA query_only");
        try {
            i0.a0();
            boolean P = i0.P();
            iq2.h(i0, null);
            if (!P) {
                yf2.o(ls5Var, "PRAGMA temp_store = MEMORY");
                yf2.o(ls5Var, "PRAGMA recursive_triggers = 1");
                yf2.o(ls5Var, "DROP TABLE IF EXISTS room_table_modification_log");
                if (sy6Var.d) {
                    yf2.o(ls5Var, "CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
                } else {
                    yf2.o(ls5Var, gh6.l0("CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)", "TEMP", ""));
                }
                j94 j94Var = sy6Var.h;
                ReentrantLock reentrantLock = j94Var.a;
                reentrantLock.lock();
                try {
                    j94Var.d = true;
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
        wd1 wd1Var = this.e;
        if (wd1Var != null) {
            vh2 vh2Var = (vh2) wd1Var.i;
            if (vh2Var != null) {
                return vh2Var.isOpen();
            }
            return false;
        }
        b53.g0("connectionManager");
        throw null;
    }

    public final Object o(ki2 ki2Var) {
        if (k()) {
            b();
            try {
                Object c = ki2Var.c();
                p();
                return c;
            } finally {
                f();
            }
        }
        return mh7.X(this, false, true, new el0(6, ki2Var));
    }

    public final void p() {
        h().e0().I();
    }

    public final Object q(boolean z, aj2 aj2Var, k11 k11Var) {
        wd1 wd1Var = this.e;
        if (wd1Var != null) {
            return ((tw0) wd1Var.g).E(z, aj2Var, k11Var);
        }
        b53.g0("connectionManager");
        throw null;
    }
}
