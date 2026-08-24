package defpackage;

import java.util.ArrayList;
import java.util.TimeZone;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: pz6  reason: default package */
/* loaded from: classes.dex */
public final class pz6 {
    public final qz6 a;
    public final String b;
    public boolean c;
    public lz6 d;
    public final ArrayList e = new ArrayList();
    public boolean f;

    public pz6(qz6 qz6Var, String str) {
        this.a = qz6Var;
        this.b = str;
    }

    public static void b(pz6 pz6Var, String str, long j, on2 on2Var, int i) {
        boolean z;
        if ((i & 2) != 0) {
            j = 0;
        }
        if ((i & 4) != 0) {
            z = true;
        } else {
            z = false;
        }
        pz6Var.getClass();
        str.getClass();
        on2Var.getClass();
        pz6Var.c(new oz6(str, z, on2Var), j);
    }

    public final boolean a() {
        lz6 lz6Var = this.d;
        if (lz6Var != null && lz6Var.b) {
            this.f = true;
        }
        ArrayList arrayList = this.e;
        boolean z = false;
        for (int size = arrayList.size() - 1; -1 < size; size--) {
            if (((lz6) arrayList.get(size)).b) {
                Logger logger = this.a.b;
                lz6 lz6Var2 = (lz6) arrayList.get(size);
                if (logger.isLoggable(Level.FINE)) {
                    jx2.j(logger, lz6Var2, this, "canceled");
                }
                arrayList.remove(size);
                z = true;
            }
        }
        return z;
    }

    public final void c(lz6 lz6Var, long j) {
        lz6Var.getClass();
        synchronized (this.a) {
            if (this.c) {
                boolean z = lz6Var.b;
                Logger logger = this.a.b;
                if (z) {
                    if (logger.isLoggable(Level.FINE)) {
                        jx2.j(logger, lz6Var, this, "schedule canceled (queue is shutdown)");
                    }
                    return;
                }
                if (logger.isLoggable(Level.FINE)) {
                    jx2.j(logger, lz6Var, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
            if (e(lz6Var, j, false)) {
                this.a.c(this);
            }
        }
    }

    public final boolean e(lz6 lz6Var, long j, boolean z) {
        String concat;
        Logger logger = this.a.b;
        lz6Var.getClass();
        pz6 pz6Var = lz6Var.c;
        if (pz6Var != this) {
            if (pz6Var == null) {
                lz6Var.c = this;
            } else {
                i.m("task is in multiple queues");
                return false;
            }
        }
        long nanoTime = System.nanoTime();
        long j2 = nanoTime + j;
        ArrayList arrayList = this.e;
        int indexOf = arrayList.indexOf(lz6Var);
        if (indexOf != -1) {
            if (lz6Var.d <= j2) {
                if (logger.isLoggable(Level.FINE)) {
                    jx2.j(logger, lz6Var, this, "already scheduled");
                    return false;
                }
                return false;
            }
            arrayList.remove(indexOf);
        }
        lz6Var.d = j2;
        if (logger.isLoggable(Level.FINE)) {
            if (z) {
                concat = "run again after ".concat(jx2.s(j2 - nanoTime));
            } else {
                concat = "scheduled after ".concat(jx2.s(j2 - nanoTime));
            }
            jx2.j(logger, lz6Var, this, concat);
        }
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                if (((lz6) obj).d - nanoTime > j) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        if (i == -1) {
            i = arrayList.size();
        }
        arrayList.add(i, lz6Var);
        if (i != 0) {
            return false;
        }
        return true;
    }

    public final void f() {
        qz6 qz6Var = this.a;
        TimeZone timeZone = az7.a;
        synchronized (qz6Var) {
            this.c = true;
            if (a()) {
                this.a.c(this);
            }
        }
    }

    public final String toString() {
        return this.b;
    }
}
