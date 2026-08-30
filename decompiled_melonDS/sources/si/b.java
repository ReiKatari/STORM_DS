package si;

import a0.j;
import java.util.ArrayList;
import java.util.TimeZone;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import p7.n;
import qi.g;
import ri.f;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final c f12929a;

    /* renamed from: b  reason: collision with root package name */
    public final String f12930b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f12931c;

    /* renamed from: d  reason: collision with root package name */
    public a f12932d;

    /* renamed from: e  reason: collision with root package name */
    public final ArrayList f12933e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    public boolean f12934f;

    public b(c cVar, String str) {
        this.f12929a = cVar;
        this.f12930b = str;
    }

    public static void b(b bVar, String str, mc.a aVar) {
        bVar.getClass();
        str.getClass();
        aVar.getClass();
        bVar.c(new f(str, aVar), 0L);
    }

    public final boolean a() {
        a aVar = this.f12932d;
        if (aVar != null && aVar.f12926b) {
            this.f12934f = true;
        }
        ArrayList arrayList = this.f12933e;
        boolean z10 = false;
        for (int size = arrayList.size() - 1; -1 < size; size--) {
            if (((a) arrayList.get(size)).f12926b) {
                Logger logger = this.f12929a.f12938b;
                a aVar2 = (a) arrayList.get(size);
                if (logger.isLoggable(Level.FINE)) {
                    n.b(logger, aVar2, this, "canceled");
                }
                arrayList.remove(size);
                z10 = true;
            }
        }
        return z10;
    }

    public final void c(a aVar, long j2) {
        aVar.getClass();
        synchronized (this.f12929a) {
            if (this.f12931c) {
                boolean z10 = aVar.f12926b;
                Logger logger = this.f12929a.f12938b;
                if (z10) {
                    if (logger.isLoggable(Level.FINE)) {
                        n.b(logger, aVar, this, "schedule canceled (queue is shutdown)");
                    }
                    return;
                }
                if (logger.isLoggable(Level.FINE)) {
                    n.b(logger, aVar, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
            if (e(aVar, j2, false)) {
                this.f12929a.c(this);
            }
        }
    }

    public final boolean e(a aVar, long j2, boolean z10) {
        String concat;
        Logger logger = this.f12929a.f12938b;
        aVar.getClass();
        b bVar = aVar.f12927c;
        if (bVar != this) {
            if (bVar == null) {
                aVar.f12927c = this;
            } else {
                j.p("task is in multiple queues");
                return false;
            }
        }
        long nanoTime = System.nanoTime();
        long j10 = nanoTime + j2;
        ArrayList arrayList = this.f12933e;
        int indexOf = arrayList.indexOf(aVar);
        if (indexOf != -1) {
            if (aVar.f12928d <= j10) {
                if (logger.isLoggable(Level.FINE)) {
                    n.b(logger, aVar, this, "already scheduled");
                    return false;
                }
                return false;
            }
            arrayList.remove(indexOf);
        }
        aVar.f12928d = j10;
        if (logger.isLoggable(Level.FINE)) {
            if (z10) {
                concat = "run again after ".concat(n.h(j10 - nanoTime));
            } else {
                concat = "scheduled after ".concat(n.h(j10 - nanoTime));
            }
            n.b(logger, aVar, this, concat);
        }
        int size = arrayList.size();
        int i2 = 0;
        int i10 = 0;
        while (true) {
            if (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                if (((a) obj).f12928d - nanoTime > j2) {
                    break;
                }
                i2++;
            } else {
                i2 = -1;
                break;
            }
        }
        if (i2 == -1) {
            i2 = arrayList.size();
        }
        arrayList.add(i2, aVar);
        if (i2 != 0) {
            return false;
        }
        return true;
    }

    public final void f() {
        c cVar = this.f12929a;
        TimeZone timeZone = g.f12552a;
        synchronized (cVar) {
            this.f12931c = true;
            if (a()) {
                this.f12929a.c(this);
            }
        }
    }

    public final String toString() {
        return this.f12930b;
    }
}
