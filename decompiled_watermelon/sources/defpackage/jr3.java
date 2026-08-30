package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: jr3  reason: default package */
/* loaded from: classes.dex */
public class jr3 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater A = AtomicReferenceFieldUpdater.newUpdater(jr3.class, Object.class, "_next$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater B;
    public static final /* synthetic */ AtomicReferenceFieldUpdater L;
    public static final /* synthetic */ long R;
    public static final /* synthetic */ long X;
    public static final /* synthetic */ long Y;
    private volatile /* synthetic */ Object _next$volatile = this;
    private volatile /* synthetic */ Object _prev$volatile = this;
    private volatile /* synthetic */ Object _removedRef$volatile;

    static {
        Unsafe unsafe = ys5.a;
        R = unsafe.objectFieldOffset(jr3.class.getDeclaredField("_next$volatile"));
        B = AtomicReferenceFieldUpdater.newUpdater(jr3.class, Object.class, "_prev$volatile");
        X = unsafe.objectFieldOffset(jr3.class.getDeclaredField("_prev$volatile"));
        L = AtomicReferenceFieldUpdater.newUpdater(jr3.class, Object.class, "_removedRef$volatile");
        Y = unsafe.objectFieldOffset(jr3.class.getDeclaredField("_removedRef$volatile"));
    }

    public static jr3 h(jr3 jr3Var) {
        while (jr3Var.m()) {
            B.getClass();
            jr3Var = (jr3) ys5.a.getObjectVolatile(jr3Var, X);
        }
        return jr3Var;
    }

    public final boolean b(jr3 jr3Var, int i) {
        jr3 l;
        do {
            l = l();
            if (l instanceof jp3) {
                if ((((jp3) l).Z & i) != 0 || !l.b(jr3Var, i)) {
                    return false;
                }
                return true;
            }
        } while (!l.c(jr3Var, this));
        return true;
    }

    public final boolean c(jr3 jr3Var, jr3 jr3Var2) {
        B.getClass();
        Unsafe unsafe = ys5.a;
        unsafe.putObjectVolatile(jr3Var, X, this);
        A.getClass();
        long j = R;
        unsafe.putObjectVolatile(jr3Var, j, jr3Var2);
        while (true) {
            Unsafe unsafe2 = ys5.a;
            jr3 jr3Var3 = this;
            jr3 jr3Var4 = jr3Var;
            jr3 jr3Var5 = jr3Var2;
            if (unsafe2.compareAndSwapObject(jr3Var3, R, jr3Var5, jr3Var4)) {
                jr3Var4.i(jr3Var5);
                return true;
            } else if (unsafe2.getObjectVolatile(jr3Var3, j) != jr3Var5) {
                return false;
            } else {
                this = jr3Var3;
                jr3Var2 = jr3Var5;
                jr3Var = jr3Var4;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0034, code lost:
        r9 = r4;
        r10 = r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(defpackage.o74 r10) {
        /*
            r9 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.jr3.B
            r0.getClass()
            sun.misc.Unsafe r0 = defpackage.ys5.a
            long r1 = defpackage.jr3.X
            r0.putObjectVolatile(r10, r1, r9)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = defpackage.jr3.A
            r1.getClass()
            long r1 = defpackage.jr3.R
            r0.putObjectVolatile(r10, r1, r9)
        L16:
            java.lang.Object r0 = r9.j()
            if (r0 == r9) goto L1d
            return
        L1d:
            sun.misc.Unsafe r3 = defpackage.ys5.a
            long r5 = defpackage.jr3.R
            r7 = r9
            r4 = r9
            r8 = r10
            boolean r9 = r3.compareAndSwapObject(r4, r5, r7, r8)
            if (r9 == 0) goto L2e
            r8.i(r4)
            return
        L2e:
            java.lang.Object r9 = r3.getObjectVolatile(r4, r1)
            if (r9 == r4) goto L37
            r9 = r4
            r10 = r8
            goto L16
        L37:
            r9 = r4
            r10 = r8
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jr3.f(o74):void");
    }

    public final jr3 g() {
        jr3 jr3Var;
        jr3 jr3Var2;
        Unsafe unsafe;
        loop0: while (true) {
            B.getClass();
            Unsafe unsafe2 = ys5.a;
            long j = X;
            jr3 jr3Var3 = (jr3) unsafe2.getObjectVolatile(this, j);
            jr3 jr3Var4 = null;
            jr3Var = jr3Var3;
            while (true) {
                A.getClass();
                if (jr3Var != null) {
                    Unsafe unsafe3 = ys5.a;
                    long j2 = R;
                    Object objectVolatile = unsafe3.getObjectVolatile(jr3Var, j2);
                    if (objectVolatile == this) {
                        if (jr3Var3 == jr3Var) {
                            break;
                        }
                        while (true) {
                            Unsafe unsafe4 = ys5.a;
                            jr3 jr3Var5 = this;
                            boolean compareAndSwapObject = unsafe4.compareAndSwapObject(jr3Var5, X, jr3Var3, jr3Var);
                            jr3 jr3Var6 = jr3Var3;
                            jr3Var2 = jr3Var5;
                            if (compareAndSwapObject) {
                                break loop0;
                            } else if (unsafe4.getObjectVolatile(jr3Var2, j) != jr3Var6) {
                                break;
                            } else {
                                this = jr3Var2;
                                jr3Var3 = jr3Var6;
                            }
                        }
                    } else {
                        jr3 jr3Var7 = jr3Var3;
                        jr3Var2 = this;
                        if (jr3Var2.m()) {
                            return null;
                        }
                        if (objectVolatile instanceof q95) {
                            if (jr3Var4 != null) {
                                jr3 jr3Var8 = ((q95) objectVolatile).a;
                                do {
                                    jr3 jr3Var9 = jr3Var;
                                    unsafe = ys5.a;
                                    boolean compareAndSwapObject2 = unsafe.compareAndSwapObject(jr3Var4, R, jr3Var9, jr3Var8);
                                    jr3Var = jr3Var9;
                                    if (compareAndSwapObject2) {
                                        this = jr3Var2;
                                        jr3Var = jr3Var4;
                                        jr3Var3 = jr3Var7;
                                        jr3Var4 = null;
                                    }
                                } while (unsafe.getObjectVolatile(jr3Var4, j2) == jr3Var);
                            } else if (jr3Var != null) {
                                jr3Var = (jr3) unsafe3.getObjectVolatile(jr3Var, j);
                            } else {
                                c44.b();
                                return null;
                            }
                        } else {
                            objectVolatile.getClass();
                            jr3Var4 = jr3Var;
                            jr3Var = (jr3) objectVolatile;
                        }
                        this = jr3Var2;
                        jr3Var3 = jr3Var7;
                    }
                } else {
                    c44.b();
                    return null;
                }
            }
            this = jr3Var2;
        }
        return jr3Var;
    }

    public final void i(jr3 jr3Var) {
        jr3 jr3Var2;
        while (true) {
            B.getClass();
            if (jr3Var != null) {
                Unsafe unsafe = ys5.a;
                long j = X;
                jr3 jr3Var3 = (jr3) unsafe.getObjectVolatile(jr3Var, j);
                if (this.j() == jr3Var) {
                    while (jr3Var != null) {
                        Unsafe unsafe2 = ys5.a;
                        jr3Var2 = this;
                        jr3 jr3Var4 = jr3Var;
                        if (unsafe2.compareAndSwapObject(jr3Var4, X, jr3Var3, jr3Var2)) {
                            if (jr3Var2.m()) {
                                jr3Var4.g();
                                return;
                            }
                            return;
                        } else if (jr3Var4 != null) {
                            jr3Var = jr3Var4;
                            if (unsafe2.getObjectVolatile(jr3Var4, j) != jr3Var3) {
                                break;
                            }
                            this = jr3Var2;
                        } else {
                            c44.b();
                            return;
                        }
                    }
                    c44.b();
                    return;
                }
                return;
            }
            c44.b();
            return;
            this = jr3Var2;
        }
    }

    public final Object j() {
        A.getClass();
        return ys5.a.getObjectVolatile(this, R);
    }

    public final jr3 k() {
        q95 q95Var;
        Object j = j();
        if (j instanceof q95) {
            q95Var = (q95) j;
        } else {
            q95Var = null;
        }
        if (q95Var != null) {
            return q95Var.a;
        }
        j.getClass();
        return (jr3) j;
    }

    public final jr3 l() {
        jr3 g = g();
        if (g == null) {
            B.getClass();
            return h((jr3) ys5.a.getObjectVolatile(this, X));
        }
        return g;
    }

    public boolean m() {
        return j() instanceof q95;
    }

    public final jr3 n() {
        jr3 jr3Var;
        while (true) {
            Object j = this.j();
            if (j instanceof q95) {
                return ((q95) j).a;
            }
            if (j == this) {
                return (jr3) j;
            }
            j.getClass();
            jr3 jr3Var2 = (jr3) j;
            q95 o = jr3Var2.o();
            while (true) {
                A.getClass();
                Unsafe unsafe = ys5.a;
                long j2 = R;
                jr3Var = this;
                if (unsafe.compareAndSwapObject(jr3Var, j2, j, o)) {
                    jr3Var2.g();
                    return null;
                } else if (unsafe.getObjectVolatile(jr3Var, j2) != j) {
                    break;
                } else {
                    this = jr3Var;
                }
            }
            this = jr3Var;
        }
    }

    public final q95 o() {
        L.getClass();
        Unsafe unsafe = ys5.a;
        long j = Y;
        q95 q95Var = (q95) unsafe.getObjectVolatile(this, j);
        if (q95Var == null) {
            q95 q95Var2 = new q95(this);
            unsafe.putObjectVolatile(this, j, q95Var2);
            return q95Var2;
        }
        return q95Var;
    }

    public String toString() {
        return new sh3(1, 3, w81.class, this, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;") + '@' + w81.s(this);
    }
}
