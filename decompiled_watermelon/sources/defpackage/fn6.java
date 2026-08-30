package defpackage;

import androidx.preference.Preference;
import java.util.ArrayList;
import java.util.TimeZone;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: fn6  reason: default package */
/* loaded from: classes.dex */
public final class fn6 {
    public static final Logger k;
    public static final fn6 l;
    public final dz4 a;
    public final Logger b;
    public int c;
    public boolean d;
    public long e;
    public int f;
    public int g;
    public final ArrayList h;
    public final ArrayList i;
    public final es4 j;

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, dz4] */
    static {
        Logger logger = Logger.getLogger(fn6.class.getName());
        logger.getClass();
        k = logger;
        hk7 hk7Var = new hk7(b31.q(new StringBuilder(), ik7.b, " TaskRunner"), true);
        ?? obj = new Object();
        obj.A = new ThreadPoolExecutor(0, (int) Preference.DEFAULT_ORDER, 60L, TimeUnit.SECONDS, new SynchronousQueue(), hk7Var);
        l = new fn6(obj);
    }

    public fn6(dz4 dz4Var) {
        Logger logger = k;
        logger.getClass();
        this.a = dz4Var;
        this.b = logger;
        this.c = 10000;
        this.h = new ArrayList();
        this.i = new ArrayList();
        this.j = new es4(23, this);
    }

    public static final void a(fn6 fn6Var, bn6 bn6Var, long j, boolean z) {
        TimeZone timeZone = ik7.a;
        en6 en6Var = bn6Var.c;
        en6Var.getClass();
        if (en6Var.d == bn6Var) {
            boolean z2 = en6Var.f;
            en6Var.f = false;
            en6Var.d = null;
            fn6Var.h.remove(en6Var);
            if (j != -1 && !z2 && !en6Var.c) {
                en6Var.e(bn6Var, j, true);
            }
            if (!en6Var.e.isEmpty()) {
                fn6Var.i.add(en6Var);
                if (!z) {
                    fn6Var.e();
                    return;
                }
                return;
            }
            return;
        }
        i.n("Check failed.");
    }

    public final bn6 b() {
        long j;
        bn6 bn6Var;
        boolean z;
        TimeZone timeZone = ik7.a;
        while (true) {
            ArrayList arrayList = this.i;
            if (arrayList.isEmpty()) {
                return null;
            }
            long nanoTime = System.nanoTime();
            int size = arrayList.size();
            long j2 = Long.MAX_VALUE;
            int i = 0;
            bn6 bn6Var2 = null;
            while (true) {
                if (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    bn6 bn6Var3 = (bn6) ((en6) obj).e.get(0);
                    j = nanoTime;
                    bn6Var = null;
                    long max = Math.max(0L, bn6Var3.d - j);
                    if (max > 0) {
                        j2 = Math.min(max, j2);
                    } else if (bn6Var2 != null) {
                        z = true;
                        break;
                    } else {
                        bn6Var2 = bn6Var3;
                    }
                    nanoTime = j;
                } else {
                    j = nanoTime;
                    bn6Var = null;
                    z = false;
                    break;
                }
            }
            ArrayList arrayList2 = this.h;
            if (bn6Var2 != null) {
                TimeZone timeZone2 = ik7.a;
                bn6Var2.d = -1L;
                en6 en6Var = bn6Var2.c;
                en6Var.getClass();
                en6Var.e.remove(bn6Var2);
                arrayList.remove(en6Var);
                en6Var.d = bn6Var2;
                arrayList2.add(en6Var);
                if (z || (!this.d && !arrayList.isEmpty())) {
                    e();
                }
                return bn6Var2;
            } else if (this.d) {
                if (j2 < this.e - j) {
                    notify();
                    return bn6Var;
                }
                return bn6Var;
            } else {
                this.d = true;
                this.e = j + j2;
                try {
                    try {
                        TimeZone timeZone3 = ik7.a;
                        int i2 = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
                        if (i2 > 0) {
                            long j3 = j2 / 1000000;
                            long j4 = j2 - (1000000 * j3);
                            if (j3 > 0 || i2 > 0) {
                                wait(j3, (int) j4);
                            }
                        }
                    } catch (InterruptedException unused) {
                        TimeZone timeZone4 = ik7.a;
                        for (int size2 = arrayList2.size() - 1; -1 < size2; size2--) {
                            ((en6) arrayList2.get(size2)).a();
                        }
                        for (int size3 = arrayList.size() - 1; -1 < size3; size3--) {
                            en6 en6Var2 = (en6) arrayList.get(size3);
                            en6Var2.a();
                            if (en6Var2.e.isEmpty()) {
                                arrayList.remove(size3);
                            }
                        }
                    }
                } finally {
                    this.d = false;
                }
            }
        }
    }

    public final void c(en6 en6Var) {
        en6Var.getClass();
        TimeZone timeZone = ik7.a;
        if (en6Var.d == null) {
            boolean isEmpty = en6Var.e.isEmpty();
            ArrayList arrayList = this.i;
            if (!isEmpty) {
                byte[] bArr = gk7.a;
                arrayList.getClass();
                if (!arrayList.contains(en6Var)) {
                    arrayList.add(en6Var);
                }
            } else {
                arrayList.remove(en6Var);
            }
        }
        if (this.d) {
            notify();
        } else {
            e();
        }
    }

    public final en6 d() {
        int i;
        synchronized (this) {
            i = this.c;
            this.c = i + 1;
        }
        return new en6(this, wh1.g(i, "Q"));
    }

    public final void e() {
        TimeZone timeZone = ik7.a;
        int i = this.f;
        if (i > this.g) {
            return;
        }
        this.f = i + 1;
        es4 es4Var = this.j;
        es4Var.getClass();
        ((ThreadPoolExecutor) this.a.A).execute(es4Var);
    }
}
