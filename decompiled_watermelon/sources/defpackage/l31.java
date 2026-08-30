package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: l31  reason: default package */
/* loaded from: classes.dex */
public final class l31 extends Thread {
    public static final /* synthetic */ AtomicIntegerFieldUpdater d0 = AtomicIntegerFieldUpdater.newUpdater(l31.class, "workerCtl$volatile");
    public final th7 A;
    public final n75 B;
    public m31 L;
    public long R;
    public long X;
    public int Y;
    public boolean Z;
    public final /* synthetic */ n31 c0;
    private volatile int indexInArray;
    private volatile Object nextParkedWorker;
    private volatile /* synthetic */ int workerCtl$volatile;

    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, n75] */
    public l31(n31 n31Var, int i) {
        this.c0 = n31Var;
        setDaemon(true);
        setContextClassLoader(n31.class.getClassLoader());
        this.A = new th7();
        this.B = new Object();
        this.L = m31.DORMANT;
        this.nextParkedWorker = n31.f0;
        int nanoTime = (int) System.nanoTime();
        this.Y = nanoTime == 0 ? 42 : nanoTime;
        f(i);
    }

    public final cn6 a(boolean z) {
        cn6 e;
        cn6 e2;
        long j;
        m31 m31Var = this.L;
        m31 m31Var2 = m31.CPU_ACQUIRED;
        n31 n31Var = this.c0;
        boolean z2 = true;
        th7 th7Var = this.A;
        if (m31Var != m31Var2) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = n31.d0;
            do {
                j = atomicLongFieldUpdater.get(n31Var);
                if (((int) ((9223367638808264704L & j) >> 42)) == 0) {
                    cn6 g = th7Var.g();
                    if (g == null && (g = (cn6) n31Var.Y.d()) == null) {
                        return i(1);
                    }
                    return g;
                }
            } while (!n31.d0.compareAndSet(n31Var, j, j - 4398046511104L));
            this.L = m31.CPU_ACQUIRED;
        }
        if (z) {
            if (d(n31Var.A * 2) != 0) {
                z2 = false;
            }
            if (z2 && (e2 = e()) != null) {
                return e2;
            }
            cn6 e3 = th7Var.e();
            if (e3 != null) {
                return e3;
            }
            if (!z2 && (e = e()) != null) {
                return e;
            }
        } else {
            cn6 e4 = e();
            if (e4 != null) {
                return e4;
            }
        }
        return i(3);
    }

    public final int b() {
        return this.indexInArray;
    }

    public final Object c() {
        return this.nextParkedWorker;
    }

    public final int d(int i) {
        int i2 = this.Y;
        int i3 = i2 ^ (i2 << 13);
        int i4 = i3 ^ (i3 >> 17);
        int i5 = i4 ^ (i4 << 5);
        this.Y = i5;
        int i6 = i - 1;
        if ((i6 & i) == 0) {
            return i6 & i5;
        }
        return (Integer.MAX_VALUE & i5) % i;
    }

    public final cn6 e() {
        int d = d(2);
        n31 n31Var = this.c0;
        gm2 gm2Var = n31Var.Y;
        gm2 gm2Var2 = n31Var.X;
        if (d == 0) {
            cn6 cn6Var = (cn6) gm2Var2.d();
            if (cn6Var != null) {
                return cn6Var;
            }
            return (cn6) gm2Var.d();
        }
        cn6 cn6Var2 = (cn6) gm2Var.d();
        if (cn6Var2 != null) {
            return cn6Var2;
        }
        return (cn6) gm2Var2.d();
    }

    public final void f(int i) {
        String valueOf;
        StringBuilder sb = new StringBuilder();
        sb.append(this.c0.R);
        sb.append("-worker-");
        if (i == 0) {
            valueOf = "TERMINATED";
        } else {
            valueOf = String.valueOf(i);
        }
        sb.append(valueOf);
        setName(sb.toString());
        this.indexInArray = i;
    }

    public final void g(Object obj) {
        this.nextParkedWorker = obj;
    }

    public final boolean h(m31 m31Var) {
        boolean z;
        m31 m31Var2 = this.L;
        if (m31Var2 == m31.CPU_ACQUIRED) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            n31.d0.addAndGet(this.c0, 4398046511104L);
        }
        if (m31Var2 != m31Var) {
            this.L = m31Var;
        }
        return z;
    }

    public final cn6 i(int i) {
        cn6 cn6Var;
        long i2;
        AtomicLongFieldUpdater atomicLongFieldUpdater = n31.d0;
        n31 n31Var = this.c0;
        int i3 = (int) (atomicLongFieldUpdater.get(n31Var) & 2097151);
        if (i3 < 2) {
            return null;
        }
        int d = d(i3);
        long j = Long.MAX_VALUE;
        for (int i4 = 0; i4 < i3; i4++) {
            boolean z = true;
            d++;
            if (d > i3) {
                d = 1;
            }
            l31 l31Var = (l31) n31Var.Z.b(d);
            if (l31Var != null && l31Var != this) {
                th7 th7Var = l31Var.A;
                if (i == 3) {
                    cn6Var = th7Var.f();
                } else {
                    th7Var.getClass();
                    int i5 = th7.d.get(th7Var);
                    int i6 = th7.c.get(th7Var);
                    if (i != 1) {
                        z = false;
                    }
                    while (i5 != i6 && (!z || th7.e.get(th7Var) != 0)) {
                        int i7 = i5 + 1;
                        cn6Var = th7Var.h(i5, z);
                        if (cn6Var != null) {
                            break;
                        }
                        i5 = i7;
                    }
                    cn6Var = null;
                }
                n75 n75Var = this.B;
                if (cn6Var != null) {
                    n75Var.A = cn6Var;
                    i2 = -1;
                } else {
                    i2 = th7Var.i(i, n75Var);
                }
                if (i2 == -1) {
                    cn6 cn6Var2 = (cn6) n75Var.A;
                    n75Var.A = null;
                    return cn6Var2;
                } else if (i2 > 0) {
                    j = Math.min(j, i2);
                }
            }
        }
        if (j == Long.MAX_VALUE) {
            j = 0;
        }
        this.X = j;
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:124:0x0004, code lost:
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0004, code lost:
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0004, code lost:
        continue;
     */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 417
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l31.run():void");
    }
}
