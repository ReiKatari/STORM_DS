package defpackage;

import java.util.ArrayList;
import java.util.TimeZone;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qz6  reason: default package */
/* loaded from: classes.dex */
public final class qz6 {
    public static final Logger k;
    public static final qz6 l;
    public final s35 a;
    public final Logger b;
    public int c;
    public boolean d;
    public long e;
    public int f;
    public int g;
    public final ArrayList h;
    public final ArrayList i;
    public final g15 j;

    /* JADX WARN: Type inference failed for: r1v0, types: [s35, java.lang.Object] */
    static {
        Logger logger = Logger.getLogger(qz6.class.getName());
        logger.getClass();
        k = logger;
        zy7 zy7Var = new zy7(i61.n(new StringBuilder(), az7.b, " TaskRunner"), true);
        ?? obj = new Object();
        obj.A = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), zy7Var);
        l = new qz6(obj);
    }

    public qz6(s35 s35Var) {
        Logger logger = k;
        logger.getClass();
        this.a = s35Var;
        this.b = logger;
        this.c = 10000;
        this.h = new ArrayList();
        this.i = new ArrayList();
        this.j = new g15(this, 22);
    }

    public static final void a(qz6 qz6Var, lz6 lz6Var, long j, boolean z) {
        TimeZone timeZone = az7.a;
        pz6 pz6Var = lz6Var.c;
        pz6Var.getClass();
        if (pz6Var.d == lz6Var) {
            boolean z2 = pz6Var.f;
            pz6Var.f = false;
            pz6Var.d = null;
            qz6Var.h.remove(pz6Var);
            if (j != -1 && !z2 && !pz6Var.c) {
                pz6Var.e(lz6Var, j, true);
            }
            if (!pz6Var.e.isEmpty()) {
                qz6Var.i.add(pz6Var);
                if (!z) {
                    qz6Var.e();
                    return;
                }
                return;
            }
            return;
        }
        i.m("Check failed.");
    }

    public final lz6 b() {
        long j;
        lz6 lz6Var;
        boolean z;
        TimeZone timeZone = az7.a;
        while (true) {
            ArrayList arrayList = this.i;
            if (arrayList.isEmpty()) {
                return null;
            }
            long nanoTime = System.nanoTime();
            int size = arrayList.size();
            long j2 = Long.MAX_VALUE;
            int i = 0;
            lz6 lz6Var2 = null;
            while (true) {
                if (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    lz6 lz6Var3 = (lz6) ((pz6) obj).e.get(0);
                    j = nanoTime;
                    lz6Var = null;
                    long max = Math.max(0L, lz6Var3.d - j);
                    if (max > 0) {
                        j2 = Math.min(max, j2);
                    } else if (lz6Var2 != null) {
                        z = true;
                        break;
                    } else {
                        lz6Var2 = lz6Var3;
                    }
                    nanoTime = j;
                } else {
                    j = nanoTime;
                    lz6Var = null;
                    z = false;
                    break;
                }
            }
            ArrayList arrayList2 = this.h;
            if (lz6Var2 != null) {
                TimeZone timeZone2 = az7.a;
                lz6Var2.d = -1L;
                pz6 pz6Var = lz6Var2.c;
                pz6Var.getClass();
                pz6Var.e.remove(lz6Var2);
                arrayList.remove(pz6Var);
                pz6Var.d = lz6Var2;
                arrayList2.add(pz6Var);
                if (z || (!this.d && !arrayList.isEmpty())) {
                    e();
                }
                return lz6Var2;
            } else if (this.d) {
                if (j2 < this.e - j) {
                    notify();
                    return lz6Var;
                }
                return lz6Var;
            } else {
                this.d = true;
                this.e = j + j2;
                try {
                    try {
                        TimeZone timeZone3 = az7.a;
                        int i2 = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
                        if (i2 > 0) {
                            long j3 = j2 / 1000000;
                            long j4 = j2 - (1000000 * j3);
                            if (j3 > 0 || i2 > 0) {
                                wait(j3, (int) j4);
                            }
                        }
                    } catch (InterruptedException unused) {
                        TimeZone timeZone4 = az7.a;
                        for (int size2 = arrayList2.size() - 1; -1 < size2; size2--) {
                            ((pz6) arrayList2.get(size2)).a();
                        }
                        for (int size3 = arrayList.size() - 1; -1 < size3; size3--) {
                            pz6 pz6Var2 = (pz6) arrayList.get(size3);
                            pz6Var2.a();
                            if (pz6Var2.e.isEmpty()) {
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

    public final void c(pz6 pz6Var) {
        pz6Var.getClass();
        TimeZone timeZone = az7.a;
        if (pz6Var.d == null) {
            boolean isEmpty = pz6Var.e.isEmpty();
            ArrayList arrayList = this.i;
            if (!isEmpty) {
                byte[] bArr = yy7.a;
                arrayList.getClass();
                if (!arrayList.contains(pz6Var)) {
                    arrayList.add(pz6Var);
                }
            } else {
                arrayList.remove(pz6Var);
            }
        }
        if (this.d) {
            notify();
        } else {
            e();
        }
    }

    public final pz6 d() {
        int i;
        synchronized (this) {
            i = this.c;
            this.c = i + 1;
        }
        return new pz6(this, lb1.g(i, "Q"));
    }

    public final void e() {
        TimeZone timeZone = az7.a;
        int i = this.f;
        if (i > this.g) {
            return;
        }
        this.f = i + 1;
        g15 g15Var = this.j;
        g15Var.getClass();
        ((ThreadPoolExecutor) this.a.A).execute(g15Var);
    }
}
