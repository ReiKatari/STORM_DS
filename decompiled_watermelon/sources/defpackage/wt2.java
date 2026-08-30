package defpackage;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.TimeZone;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: wt2  reason: default package */
/* loaded from: classes.dex */
public final class wt2 implements cb6 {
    public final int A;
    public final pt2 B;
    public final yy6 L;
    public long R;
    public long X;
    public final ArrayDeque Y;
    public boolean Z;
    public final ut2 c0;
    public final tt2 d0;
    public final vt2 e0;
    public final vt2 f0;
    public l12 g0;
    public IOException h0;

    public wt2(int i, pt2 pt2Var, boolean z, boolean z2, xq2 xq2Var) {
        pt2Var.getClass();
        this.A = i;
        this.B = pt2Var;
        this.L = new yy6(i);
        this.X = pt2Var.m0.a();
        ArrayDeque arrayDeque = new ArrayDeque();
        this.Y = arrayDeque;
        this.c0 = new ut2(this, pt2Var.l0.a(), z2);
        this.d0 = new tt2(this, z);
        this.e0 = new vt2(this);
        this.f0 = new vt2(this);
        if (xq2Var != null) {
            if (!g()) {
                arrayDeque.add(xq2Var);
            } else {
                i.n("locally-initiated streams shouldn't have headers yet");
                throw null;
            }
        } else if (g()) {
        } else {
            i.n("remotely-initiated streams should have headers");
            throw null;
        }
    }

    public final void a() {
        boolean z;
        boolean h;
        TimeZone timeZone = ik7.a;
        synchronized (this) {
            try {
                ut2 ut2Var = this.c0;
                if (!ut2Var.B && ut2Var.X) {
                    tt2 tt2Var = this.d0;
                    if (!tt2Var.A) {
                        if (tt2Var.L) {
                        }
                    }
                    z = true;
                    h = h();
                }
                z = false;
                h = h();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            c(l12.CANCEL, null);
        } else if (!h) {
            this.B.p(this.A);
        }
    }

    public final void b() {
        tt2 tt2Var = this.d0;
        if (!tt2Var.L) {
            if (!tt2Var.A) {
                if (f() != null) {
                    IOException iOException = this.h0;
                    if (iOException == null) {
                        l12 f = f();
                        f.getClass();
                        throw new vf6(f);
                    }
                    throw iOException;
                }
                return;
            }
            f81.j("stream finished");
            return;
        }
        f81.j("stream closed");
    }

    public final void c(l12 l12Var, IOException iOException) {
        l12Var.getClass();
        if (!d(l12Var, iOException)) {
            return;
        }
        pt2 pt2Var = this.B;
        pt2Var.getClass();
        pt2Var.r0.C(this.A, l12Var);
    }

    public final boolean d(l12 l12Var, IOException iOException) {
        TimeZone timeZone = ik7.a;
        synchronized (this) {
            if (f() != null) {
                return false;
            }
            this.g0 = l12Var;
            this.h0 = iOException;
            notifyAll();
            if (this.c0.B) {
                if (this.d0.A) {
                    return false;
                }
            }
            this.B.p(this.A);
            return true;
        }
    }

    public final void e(l12 l12Var) {
        l12Var.getClass();
        if (!d(l12Var, null)) {
            return;
        }
        this.B.C(this.A, l12Var);
    }

    public final l12 f() {
        l12 l12Var;
        synchronized (this) {
            l12Var = this.g0;
        }
        return l12Var;
    }

    public final boolean g() {
        boolean z;
        if ((this.A & 1) == 1) {
            z = true;
        } else {
            z = false;
        }
        this.B.getClass();
        if (true == z) {
            return true;
        }
        return false;
    }

    public final boolean h() {
        synchronized (this) {
            try {
                if (f() != null) {
                    return false;
                }
                ut2 ut2Var = this.c0;
                if (!ut2Var.B) {
                    if (ut2Var.X) {
                    }
                    return true;
                }
                tt2 tt2Var = this.d0;
                if (tt2Var.A || tt2Var.L) {
                    if (this.Z) {
                        return false;
                    }
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002d A[Catch: all -> 0x0022, TryCatch #0 {all -> 0x0022, blocks: (B:4:0x0006, B:6:0x000b, B:8:0x0013, B:11:0x001c, B:16:0x002d, B:17:0x0031, B:14:0x0024), top: B:24:0x0006 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(defpackage.xq2 r3, boolean r4) {
        /*
            r2 = this;
            r3.getClass()
            java.util.TimeZone r0 = defpackage.ik7.a
            monitor-enter(r2)
            boolean r0 = r2.Z     // Catch: java.lang.Throwable -> L22
            r1 = 1
            if (r0 == 0) goto L24
            java.lang.String r0 = ":status"
            java.lang.String r0 = r3.b(r0)     // Catch: java.lang.Throwable -> L22
            if (r0 != 0) goto L24
            java.lang.String r0 = ":method"
            java.lang.String r0 = r3.b(r0)     // Catch: java.lang.Throwable -> L22
            if (r0 == 0) goto L1c
            goto L24
        L1c:
            ut2 r3 = r2.c0     // Catch: java.lang.Throwable -> L22
            r3.getClass()     // Catch: java.lang.Throwable -> L22
            goto L2b
        L22:
            r3 = move-exception
            goto L43
        L24:
            r2.Z = r1     // Catch: java.lang.Throwable -> L22
            java.util.ArrayDeque r0 = r2.Y     // Catch: java.lang.Throwable -> L22
            r0.add(r3)     // Catch: java.lang.Throwable -> L22
        L2b:
            if (r4 == 0) goto L31
            ut2 r3 = r2.c0     // Catch: java.lang.Throwable -> L22
            r3.B = r1     // Catch: java.lang.Throwable -> L22
        L31:
            boolean r3 = r2.h()     // Catch: java.lang.Throwable -> L22
            r2.notifyAll()     // Catch: java.lang.Throwable -> L22
            monitor-exit(r2)
            if (r3 != 0) goto L42
            pt2 r3 = r2.B
            int r2 = r2.A
            r3.p(r2)
        L42:
            return
        L43:
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wt2.i(xq2, boolean):void");
    }

    @Override // defpackage.cb6
    public final sb6 j() {
        return this.c0;
    }

    @Override // defpackage.cb6
    public final g76 n() {
        return this.d0;
    }
}
