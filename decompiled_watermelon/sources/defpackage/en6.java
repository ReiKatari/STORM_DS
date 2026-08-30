package defpackage;

import java.util.ArrayList;
import java.util.TimeZone;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: en6  reason: default package */
/* loaded from: classes.dex */
public final class en6 {
    public final fn6 a;
    public final String b;
    public boolean c;
    public bn6 d;
    public final ArrayList e = new ArrayList();
    public boolean f;

    public en6(fn6 fn6Var, String str) {
        this.a = fn6Var;
        this.b = str;
    }

    public static void b(en6 en6Var, String str, ki2 ki2Var) {
        en6Var.getClass();
        str.getClass();
        ki2Var.getClass();
        en6Var.c(new dg1(str, ki2Var), 0L);
    }

    public final boolean a() {
        bn6 bn6Var = this.d;
        if (bn6Var != null && bn6Var.b) {
            this.f = true;
        }
        ArrayList arrayList = this.e;
        boolean z = false;
        for (int size = arrayList.size() - 1; -1 < size; size--) {
            if (((bn6) arrayList.get(size)).b) {
                Logger logger = this.a.b;
                bn6 bn6Var2 = (bn6) arrayList.get(size);
                if (logger.isLoggable(Level.FINE)) {
                    me2.c(logger, bn6Var2, this, "canceled");
                }
                arrayList.remove(size);
                z = true;
            }
        }
        return z;
    }

    public final void c(bn6 bn6Var, long j) {
        bn6Var.getClass();
        synchronized (this.a) {
            if (this.c) {
                boolean z = bn6Var.b;
                Logger logger = this.a.b;
                if (z) {
                    if (logger.isLoggable(Level.FINE)) {
                        me2.c(logger, bn6Var, this, "schedule canceled (queue is shutdown)");
                    }
                    return;
                }
                if (logger.isLoggable(Level.FINE)) {
                    me2.c(logger, bn6Var, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
            if (e(bn6Var, j, false)) {
                this.a.c(this);
            }
        }
    }

    public final boolean e(bn6 bn6Var, long j, boolean z) {
        String concat;
        Logger logger = this.a.b;
        bn6Var.getClass();
        en6 en6Var = bn6Var.c;
        if (en6Var != this) {
            if (en6Var == null) {
                bn6Var.c = this;
            } else {
                i.n("task is in multiple queues");
                return false;
            }
        }
        long nanoTime = System.nanoTime();
        long j2 = nanoTime + j;
        ArrayList arrayList = this.e;
        int indexOf = arrayList.indexOf(bn6Var);
        if (indexOf != -1) {
            if (bn6Var.d <= j2) {
                if (logger.isLoggable(Level.FINE)) {
                    me2.c(logger, bn6Var, this, "already scheduled");
                    return false;
                }
                return false;
            }
            arrayList.remove(indexOf);
        }
        bn6Var.d = j2;
        if (logger.isLoggable(Level.FINE)) {
            if (z) {
                concat = "run again after ".concat(me2.t(j2 - nanoTime));
            } else {
                concat = "scheduled after ".concat(me2.t(j2 - nanoTime));
            }
            me2.c(logger, bn6Var, this, concat);
        }
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                if (((bn6) obj).d - nanoTime > j) {
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
        arrayList.add(i, bn6Var);
        if (i != 0) {
            return false;
        }
        return true;
    }

    public final void f() {
        fn6 fn6Var = this.a;
        TimeZone timeZone = ik7.a;
        synchronized (fn6Var) {
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
