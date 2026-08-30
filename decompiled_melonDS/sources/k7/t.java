package k7;

import android.os.Looper;
import f2.g1;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class t {

    /* renamed from: a  reason: collision with root package name */
    public ah.h0 f8073a;

    /* renamed from: b  reason: collision with root package name */
    public cc.g f8074b;

    /* renamed from: c  reason: collision with root package name */
    public Executor f8075c;

    /* renamed from: d  reason: collision with root package name */
    public a0 f8076d;

    /* renamed from: e  reason: collision with root package name */
    public f5.e f8077e;

    /* renamed from: f  reason: collision with root package name */
    public g f8078f;

    /* renamed from: h  reason: collision with root package name */
    public boolean f8080h;

    /* renamed from: g  reason: collision with root package name */
    public final jb.c f8079g = new jb.c(new b4.o(0, this, t.class, "onClosed", "onClosed()V", 0, 0, 3));

    /* renamed from: i  reason: collision with root package name */
    public final ThreadLocal f8081i = new ThreadLocal();

    /* renamed from: j  reason: collision with root package name */
    public final LinkedHashMap f8082j = new LinkedHashMap();

    /* renamed from: k  reason: collision with root package name */
    public boolean f8083k = true;

    public final void a() {
        boolean z10;
        if (!this.f8080h) {
            if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                return;
            }
            a0.j.p("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    public final void b() {
        a();
        a();
        v7.b R = h().R();
        if (!R.x()) {
            a.a.V(new a9.b(18, null, g()));
        }
        if (R.A.isWriteAheadLoggingEnabled()) {
            R.i();
        } else {
            R.d();
        }
    }

    public List c(LinkedHashMap linkedHashMap) {
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(zb.v.E(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            nc.e eVar = (nc.e) entry.getKey();
            eVar.getClass();
            Class a10 = eVar.a();
            a10.getClass();
            linkedHashMap2.put(a10, entry.getValue());
        }
        return zb.q.A;
    }

    public abstract g d();

    public j7.e0 e() {
        throw new yb.i(0);
    }

    public final void f() {
        h().R().t();
        if (!l()) {
            g g10 = g();
            g10.f8009b.e(g10.f8012e, g10.f8013f);
        }
    }

    public final g g() {
        g gVar = this.f8078f;
        if (gVar != null) {
            return gVar;
        }
        nc.k.f("internalTracker");
        throw null;
    }

    public final u7.c h() {
        f5.e eVar = this.f8077e;
        if (eVar != null) {
            u7.c cVar = (u7.c) eVar.f4861h;
            if (cVar != null) {
                return cVar;
            }
            a0.j.p("Cannot return a SupportSQLiteOpenHelper since no SupportSQLiteOpenHelper.Factory was configured with Room.");
            return null;
        }
        nc.k.f("connectionManager");
        throw null;
    }

    public Set i() {
        return zb.l.s0(new ArrayList(zb.m.G(zb.s.A, 10)));
    }

    public LinkedHashMap j() {
        int E = zb.v.E(zb.m.G(zb.s.A, 10));
        if (E < 16) {
            E = 16;
        }
        return new LinkedHashMap(E);
    }

    public final boolean k() {
        f5.e eVar = this.f8077e;
        if (eVar != null) {
            if (((u7.c) eVar.f4861h) != null) {
                return true;
            }
            return false;
        }
        nc.k.f("connectionManager");
        throw null;
    }

    public final boolean l() {
        if (n() && h().R().x()) {
            return true;
        }
        return false;
    }

    public final void m(t7.a aVar) {
        aVar.getClass();
        g g10 = g();
        m0 m0Var = g10.f8009b;
        m0Var.getClass();
        t7.c T = aVar.T("PRAGMA query_only");
        try {
            T.N();
            boolean E = T.E();
            q8.r.q(T, null);
            if (!E) {
                zb.k.r(aVar, "PRAGMA temp_store = MEMORY");
                zb.k.r(aVar, "PRAGMA recursive_triggers = 1");
                zb.k.r(aVar, "DROP TABLE IF EXISTS room_table_modification_log");
                if (m0Var.f8045d) {
                    zb.k.r(aVar, "CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
                } else {
                    zb.k.r(aVar, vc.o.T("CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)", "TEMP", ""));
                }
                k kVar = m0Var.f8049h;
                ReentrantLock reentrantLock = kVar.f8027a;
                reentrantLock.lock();
                try {
                    kVar.f8030d = true;
                } finally {
                    reentrantLock.unlock();
                }
            }
            synchronized (g10.f8014g) {
            }
        } finally {
        }
    }

    public final boolean n() {
        f5.e eVar = this.f8077e;
        if (eVar != null) {
            v7.b bVar = (v7.b) eVar.f4862i;
            if (bVar != null) {
                return bVar.isOpen();
            }
            return false;
        }
        nc.k.f("connectionManager");
        throw null;
    }

    public final Object o(mc.a aVar) {
        if (k()) {
            b();
            try {
                Object b10 = aVar.b();
                p();
                return b10;
            } finally {
                f();
            }
        }
        return q8.r.K(this, false, true, new g1(2, aVar));
    }

    public final void p() {
        h().R().F();
    }

    public final Object q(boolean z10, mc.p pVar, ec.c cVar) {
        f5.e eVar = this.f8077e;
        if (eVar != null) {
            return ((m7.b) eVar.f4860g).y(z10, pVar, cVar);
        }
        nc.k.f("connectionManager");
        throw null;
    }
}
