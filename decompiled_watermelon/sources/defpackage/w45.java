package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: w45  reason: default package */
/* loaded from: classes.dex */
public final class w45 implements Cloneable {
    public final zb4 A;
    public final ka B;
    public final bo1 L;
    public final v45 R;
    public final AtomicBoolean X;
    public Object Y;
    public f22 Z;
    public x45 c0;
    public boolean d0;
    public xf1 e0;
    public boolean f0;
    public boolean g0;
    public boolean h0;
    public boolean i0;
    public boolean j0;
    public volatile boolean k0;
    public volatile xf1 l0;
    public final CopyOnWriteArrayList m0;

    public w45(zb4 zb4Var, ka kaVar) {
        zb4Var.getClass();
        kaVar.getClass();
        this.A = zb4Var;
        this.B = kaVar;
        this.L = (bo1) zb4Var.B.B;
        zb4Var.d.getClass();
        v45 v45Var = new v45(this);
        v45Var.g(0L);
        this.R = v45Var;
        this.X = new AtomicBoolean();
        this.j0 = true;
        this.m0 = new CopyOnWriteArrayList();
        new AtomicReference((io2) kaVar.Y);
    }

    public static final String a(w45 w45Var) {
        String str;
        StringBuilder sb = new StringBuilder();
        if (w45Var.k0) {
            str = "canceled ";
        } else {
            str = "";
        }
        sb.append(str);
        sb.append("call");
        sb.append(" to ");
        sb.append(((hu2) w45Var.B.B).g());
        return sb.toString();
    }

    public final void b(x45 x45Var) {
        x45Var.getClass();
        TimeZone timeZone = ik7.a;
        if (this.c0 == null) {
            this.c0 = x45Var;
            x45Var.p.add(new u45(this, this.Y));
            return;
        }
        i.n("Check failed.");
    }

    public final IOException c(IOException iOException) {
        IOException iOException2;
        Socket l;
        TimeZone timeZone = ik7.a;
        x45 x45Var = this.c0;
        if (x45Var != null) {
            synchronized (x45Var) {
                l = l();
            }
            if (this.c0 == null) {
                if (l != null) {
                    ik7.b(l);
                }
            } else if (l != null) {
                i.n("Check failed.");
                return null;
            }
        }
        if (this.d0 || !this.R.i()) {
            iOException2 = iOException;
        } else {
            iOException2 = new InterruptedIOException("timeout");
            if (iOException != null) {
                iOException2.initCause(iOException);
            }
        }
        if (iOException != null) {
            iOException2.getClass();
        }
        return iOException2;
    }

    public final void cancel() {
        if (this.k0) {
            return;
        }
        this.k0 = true;
        xf1 xf1Var = this.l0;
        if (xf1Var != null) {
            ((e22) xf1Var.R).cancel();
        }
        Iterator it = this.m0.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((or5) it.next()).cancel();
        }
    }

    public final Object clone() {
        return new w45(this.A, this.B);
    }

    public final void e(f90 f90Var) {
        if (this.X.compareAndSet(false, true)) {
            fo4 fo4Var = fo4.a;
            this.Y = fo4.a.g();
            q9 q9Var = this.A.a;
            t45 t45Var = new t45(this, f90Var);
            q9Var.getClass();
            q9.K(q9Var, t45Var, null, null, 6);
            return;
        }
        i.n("Already Executed");
    }

    public final ec5 f() {
        if (this.X.compareAndSet(false, true)) {
            this.R.h();
            fo4 fo4Var = fo4.a;
            this.Y = fo4.a.g();
            try {
                q9 q9Var = this.A.a;
                synchronized (q9Var) {
                    ((ArrayDeque) q9Var.X).add(this);
                }
                return h();
            } finally {
                q9 q9Var2 = this.A.a;
                q9Var2.getClass();
                q9.K(q9Var2, null, this, null, 5);
            }
        }
        i.n("Already Executed");
        return null;
    }

    public final void g(boolean z) {
        xf1 xf1Var;
        synchronized (this) {
            if (!this.j0) {
                throw new IllegalStateException("released");
            }
        }
        if (z && (xf1Var = this.l0) != null) {
            ((e22) xf1Var.R).cancel();
            ((w45) xf1Var.L).j(xf1Var, true, true, true, true, null);
        }
        this.e0 = null;
    }

    public final ec5 h() {
        ArrayList arrayList = new ArrayList();
        tq0.D0(arrayList, this.A.b);
        arrayList.add(new j50(this.A));
        arrayList.add(new j50(this.A.j));
        arrayList.add(new j50(this.A.k));
        arrayList.add(b90.c);
        tq0.D0(arrayList, this.A.c);
        arrayList.add(b90.b);
        ka kaVar = this.B;
        zb4 zb4Var = this.A;
        try {
            try {
                ec5 f = new fi3(this, arrayList, 0, null, kaVar, zb4Var.w, zb4Var.x, zb4Var.y).f(this.B);
                if (!this.k0) {
                    k(null);
                    return f;
                }
                gk7.b(f);
                throw new IOException("Canceled");
            } catch (IOException e) {
                IOException k = k(e);
                k.getClass();
                throw k;
            }
        } catch (Throwable th) {
            if (0 == 0) {
                k(null);
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x002d A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:8:0x0012, B:23:0x002d, B:25:0x0031, B:27:0x0035, B:29:0x0039, B:30:0x003b, B:32:0x003f, B:34:0x0043, B:36:0x0047, B:41:0x0050, B:14:0x001b, B:17:0x0021, B:20:0x0027), top: B:63:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0031 A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:8:0x0012, B:23:0x002d, B:25:0x0031, B:27:0x0035, B:29:0x0039, B:30:0x003b, B:32:0x003f, B:34:0x0043, B:36:0x0047, B:41:0x0050, B:14:0x001b, B:17:0x0021, B:20:0x0027), top: B:63:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0035 A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:8:0x0012, B:23:0x002d, B:25:0x0031, B:27:0x0035, B:29:0x0039, B:30:0x003b, B:32:0x003f, B:34:0x0043, B:36:0x0047, B:41:0x0050, B:14:0x001b, B:17:0x0021, B:20:0x0027), top: B:63:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0039 A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:8:0x0012, B:23:0x002d, B:25:0x0031, B:27:0x0035, B:29:0x0039, B:30:0x003b, B:32:0x003f, B:34:0x0043, B:36:0x0047, B:41:0x0050, B:14:0x001b, B:17:0x0021, B:20:0x0027), top: B:63:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0050 A[Catch: all -> 0x0017, TRY_LEAVE, TryCatch #0 {all -> 0x0017, blocks: (B:8:0x0012, B:23:0x002d, B:25:0x0031, B:27:0x0035, B:29:0x0039, B:30:0x003b, B:32:0x003f, B:34:0x0043, B:36:0x0047, B:41:0x0050, B:14:0x001b, B:17:0x0021, B:20:0x0027), top: B:63:0x0012 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.IOException j(defpackage.xf1 r4, boolean r5, boolean r6, boolean r7, boolean r8, java.io.IOException r9) {
        /*
            r3 = this;
            r4.getClass()
            xf1 r0 = r3.l0
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto Ld
            goto L78
        Ld:
            monitor-enter(r3)
            r4 = 1
            r0 = 0
            if (r5 == 0) goto L19
            boolean r1 = r3.f0     // Catch: java.lang.Throwable -> L17
            if (r1 != 0) goto L2b
            goto L19
        L17:
            r4 = move-exception
            goto L59
        L19:
            if (r6 == 0) goto L1f
            boolean r1 = r3.g0     // Catch: java.lang.Throwable -> L17
            if (r1 != 0) goto L2b
        L1f:
            if (r8 == 0) goto L25
            boolean r1 = r3.h0     // Catch: java.lang.Throwable -> L17
            if (r1 != 0) goto L2b
        L25:
            if (r7 == 0) goto L5b
            boolean r1 = r3.i0     // Catch: java.lang.Throwable -> L17
            if (r1 == 0) goto L5b
        L2b:
            if (r5 == 0) goto L2f
            r3.f0 = r0     // Catch: java.lang.Throwable -> L17
        L2f:
            if (r6 == 0) goto L33
            r3.g0 = r0     // Catch: java.lang.Throwable -> L17
        L33:
            if (r8 == 0) goto L37
            r3.h0 = r0     // Catch: java.lang.Throwable -> L17
        L37:
            if (r7 == 0) goto L3b
            r3.i0 = r0     // Catch: java.lang.Throwable -> L17
        L3b:
            boolean r5 = r3.f0     // Catch: java.lang.Throwable -> L17
            if (r5 != 0) goto L4d
            boolean r5 = r3.g0     // Catch: java.lang.Throwable -> L17
            if (r5 != 0) goto L4d
            boolean r5 = r3.h0     // Catch: java.lang.Throwable -> L17
            if (r5 != 0) goto L4d
            boolean r5 = r3.i0     // Catch: java.lang.Throwable -> L17
            if (r5 != 0) goto L4d
            r5 = r4
            goto L4e
        L4d:
            r5 = r0
        L4e:
            if (r5 == 0) goto L55
            boolean r6 = r3.j0     // Catch: java.lang.Throwable -> L17
            if (r6 != 0) goto L55
            r0 = r4
        L55:
            r2 = r0
            r0 = r5
            r5 = r2
            goto L5c
        L59:
            monitor-exit(r3)
            throw r4
        L5b:
            r5 = r0
        L5c:
            monitor-exit(r3)
            if (r0 == 0) goto L71
            r6 = 0
            r3.l0 = r6
            x45 r6 = r3.c0
            if (r6 == 0) goto L71
            monitor-enter(r6)
            int r7 = r6.m     // Catch: java.lang.Throwable -> L6e
            int r7 = r7 + r4
            r6.m = r7     // Catch: java.lang.Throwable -> L6e
            monitor-exit(r6)
            goto L71
        L6e:
            r3 = move-exception
            monitor-exit(r6)
            throw r3
        L71:
            if (r5 == 0) goto L78
            java.io.IOException r3 = r3.c(r9)
            return r3
        L78:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w45.j(xf1, boolean, boolean, boolean, boolean, java.io.IOException):java.io.IOException");
    }

    public final IOException k(IOException iOException) {
        boolean z;
        synchronized (this) {
            z = false;
            if (this.j0) {
                this.j0 = false;
                if (!this.f0 && !this.g0 && !this.h0) {
                    if (!this.i0) {
                        z = true;
                    }
                }
            }
        }
        if (z) {
            return c(iOException);
        }
        return iOException;
    }

    public final Socket l() {
        x45 x45Var = this.c0;
        x45Var.getClass();
        TimeZone timeZone = ik7.a;
        ArrayList arrayList = x45Var.p;
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                if (b53.x(((Reference) obj).get(), this)) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        if (i != -1) {
            arrayList.remove(i);
            this.c0 = null;
            if (!arrayList.isEmpty()) {
                return null;
            }
            x45Var.q = System.nanoTime();
            bo1 bo1Var = this.L;
            ConcurrentLinkedQueue concurrentLinkedQueue = (ConcurrentLinkedQueue) bo1Var.d;
            TimeZone timeZone2 = ik7.a;
            if (!x45Var.j) {
                ((en6) bo1Var.b).c((dg1) bo1Var.c, 0L);
                return null;
            }
            x45Var.j = true;
            concurrentLinkedQueue.remove(x45Var);
            if (concurrentLinkedQueue.isEmpty()) {
                en6 en6Var = (en6) bo1Var.b;
                synchronized (en6Var.a) {
                    if (en6Var.a()) {
                        en6Var.a.c(en6Var);
                    }
                }
            }
            return x45Var.e;
        }
        i.n("Check failed.");
        return null;
    }
}
