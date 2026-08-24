package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ky3  reason: default package */
/* loaded from: classes.dex */
public class ky3 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater A = AtomicReferenceFieldUpdater.newUpdater(ky3.class, Object.class, "_next$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater B;
    public static final /* synthetic */ AtomicReferenceFieldUpdater L;
    public static final /* synthetic */ long R;
    public static final /* synthetic */ long X;
    public static final /* synthetic */ long Y;
    private volatile /* synthetic */ Object _next$volatile = this;
    private volatile /* synthetic */ Object _prev$volatile = this;
    private volatile /* synthetic */ Object _removedRef$volatile;

    static {
        Unsafe unsafe = v36.a;
        R = unsafe.objectFieldOffset(ky3.class.getDeclaredField("_next$volatile"));
        B = AtomicReferenceFieldUpdater.newUpdater(ky3.class, Object.class, "_prev$volatile");
        X = unsafe.objectFieldOffset(ky3.class.getDeclaredField("_prev$volatile"));
        L = AtomicReferenceFieldUpdater.newUpdater(ky3.class, Object.class, "_removedRef$volatile");
        Y = unsafe.objectFieldOffset(ky3.class.getDeclaredField("_removedRef$volatile"));
    }

    public static ky3 h(ky3 ky3Var) {
        while (ky3Var.m()) {
            B.getClass();
            ky3Var = (ky3) v36.a.getObjectVolatile(ky3Var, X);
        }
        return ky3Var;
    }

    public final boolean b(ky3 ky3Var, int i) {
        ky3 l;
        do {
            l = l();
            if (l instanceof lw3) {
                if ((((lw3) l).Z & i) != 0 || !l.b(ky3Var, i)) {
                    return false;
                }
                return true;
            }
        } while (!l.c(ky3Var, this));
        return true;
    }

    public final boolean c(ky3 ky3Var, ky3 ky3Var2) {
        B.getClass();
        Unsafe unsafe = v36.a;
        unsafe.putObjectVolatile(ky3Var, X, this);
        A.getClass();
        long j = R;
        unsafe.putObjectVolatile(ky3Var, j, ky3Var2);
        while (true) {
            Unsafe unsafe2 = v36.a;
            ky3 ky3Var3 = this;
            ky3 ky3Var4 = ky3Var;
            ky3 ky3Var5 = ky3Var2;
            if (unsafe2.compareAndSwapObject(ky3Var3, R, ky3Var5, ky3Var4)) {
                ky3Var4.i(ky3Var5);
                return true;
            } else if (unsafe2.getObjectVolatile(ky3Var3, j) != ky3Var5) {
                return false;
            } else {
                this = ky3Var3;
                ky3Var2 = ky3Var5;
                ky3Var = ky3Var4;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0034, code lost:
        r9 = r4;
        r10 = r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(gg4 gg4Var) {
        B.getClass();
        Unsafe unsafe = v36.a;
        unsafe.putObjectVolatile(gg4Var, X, this);
        A.getClass();
        long j = R;
        unsafe.putObjectVolatile(gg4Var, j, this);
        while (this.j() == this) {
            while (true) {
                Unsafe unsafe2 = v36.a;
                ky3 ky3Var = this;
                gg4 gg4Var2 = gg4Var;
                if (unsafe2.compareAndSwapObject(ky3Var, R, this, gg4Var2)) {
                    gg4Var2.i(ky3Var);
                    return;
                } else if (unsafe2.getObjectVolatile(ky3Var, j) != ky3Var) {
                    break;
                } else {
                    this = ky3Var;
                    gg4Var = gg4Var2;
                }
            }
        }
    }

    public final ky3 g() {
        ky3 ky3Var;
        ky3 ky3Var2;
        Unsafe unsafe;
        loop0: while (true) {
            B.getClass();
            Unsafe unsafe2 = v36.a;
            long j = X;
            ky3 ky3Var3 = (ky3) unsafe2.getObjectVolatile(this, j);
            ky3 ky3Var4 = null;
            ky3Var = ky3Var3;
            while (true) {
                A.getClass();
                if (ky3Var != null) {
                    Unsafe unsafe3 = v36.a;
                    long j2 = R;
                    Object objectVolatile = unsafe3.getObjectVolatile(ky3Var, j2);
                    if (objectVolatile == this) {
                        if (ky3Var3 == ky3Var) {
                            break;
                        }
                        while (true) {
                            Unsafe unsafe4 = v36.a;
                            ky3 ky3Var5 = this;
                            boolean compareAndSwapObject = unsafe4.compareAndSwapObject(ky3Var5, X, ky3Var3, ky3Var);
                            ky3 ky3Var6 = ky3Var3;
                            ky3Var2 = ky3Var5;
                            if (compareAndSwapObject) {
                                break loop0;
                            } else if (unsafe4.getObjectVolatile(ky3Var2, j) != ky3Var6) {
                                break;
                            } else {
                                this = ky3Var2;
                                ky3Var3 = ky3Var6;
                            }
                        }
                    } else {
                        ky3 ky3Var7 = ky3Var3;
                        ky3Var2 = this;
                        if (ky3Var2.m()) {
                            return null;
                        }
                        if (objectVolatile instanceof hj5) {
                            if (ky3Var4 != null) {
                                ky3 ky3Var8 = ((hj5) objectVolatile).a;
                                do {
                                    ky3 ky3Var9 = ky3Var;
                                    unsafe = v36.a;
                                    boolean compareAndSwapObject2 = unsafe.compareAndSwapObject(ky3Var4, R, ky3Var9, ky3Var8);
                                    ky3Var = ky3Var9;
                                    if (compareAndSwapObject2) {
                                        this = ky3Var2;
                                        ky3Var = ky3Var4;
                                        ky3Var3 = ky3Var7;
                                        ky3Var4 = null;
                                    }
                                } while (unsafe.getObjectVolatile(ky3Var4, j2) == ky3Var);
                            } else if (ky3Var != null) {
                                ky3Var = (ky3) unsafe3.getObjectVolatile(ky3Var, j);
                            } else {
                                u34.a();
                                return null;
                            }
                        } else {
                            objectVolatile.getClass();
                            ky3Var4 = ky3Var;
                            ky3Var = (ky3) objectVolatile;
                        }
                        this = ky3Var2;
                        ky3Var3 = ky3Var7;
                    }
                } else {
                    u34.a();
                    return null;
                }
            }
            this = ky3Var2;
        }
        return ky3Var;
    }

    public final void i(ky3 ky3Var) {
        ky3 ky3Var2;
        while (true) {
            B.getClass();
            if (ky3Var != null) {
                Unsafe unsafe = v36.a;
                long j = X;
                ky3 ky3Var3 = (ky3) unsafe.getObjectVolatile(ky3Var, j);
                if (this.j() == ky3Var) {
                    while (ky3Var != null) {
                        Unsafe unsafe2 = v36.a;
                        ky3Var2 = this;
                        ky3 ky3Var4 = ky3Var;
                        if (unsafe2.compareAndSwapObject(ky3Var4, X, ky3Var3, ky3Var2)) {
                            if (ky3Var2.m()) {
                                ky3Var4.g();
                                return;
                            }
                            return;
                        } else if (ky3Var4 != null) {
                            ky3Var = ky3Var4;
                            if (unsafe2.getObjectVolatile(ky3Var4, j) != ky3Var3) {
                                break;
                            }
                            this = ky3Var2;
                        } else {
                            u34.a();
                            return;
                        }
                    }
                    u34.a();
                    return;
                }
                return;
            }
            u34.a();
            return;
            this = ky3Var2;
        }
    }

    public final Object j() {
        A.getClass();
        return v36.a.getObjectVolatile(this, R);
    }

    public final ky3 k() {
        hj5 hj5Var;
        Object j = j();
        if (j instanceof hj5) {
            hj5Var = (hj5) j;
        } else {
            hj5Var = null;
        }
        if (hj5Var != null) {
            return hj5Var.a;
        }
        j.getClass();
        return (ky3) j;
    }

    public final ky3 l() {
        ky3 g = g();
        if (g == null) {
            B.getClass();
            return h((ky3) v36.a.getObjectVolatile(this, X));
        }
        return g;
    }

    public boolean m() {
        return j() instanceof hj5;
    }

    public final ky3 n() {
        ky3 ky3Var;
        while (true) {
            Object j = this.j();
            if (j instanceof hj5) {
                return ((hj5) j).a;
            }
            if (j == this) {
                return (ky3) j;
            }
            j.getClass();
            ky3 ky3Var2 = (ky3) j;
            hj5 o = ky3Var2.o();
            while (true) {
                A.getClass();
                Unsafe unsafe = v36.a;
                long j2 = R;
                ky3Var = this;
                if (unsafe.compareAndSwapObject(ky3Var, j2, j, o)) {
                    ky3Var2.g();
                    return null;
                } else if (unsafe.getObjectVolatile(ky3Var, j2) != j) {
                    break;
                } else {
                    this = ky3Var;
                }
            }
            this = ky3Var;
        }
    }

    public final hj5 o() {
        L.getClass();
        Unsafe unsafe = v36.a;
        long j = Y;
        hj5 hj5Var = (hj5) unsafe.getObjectVolatile(this, j);
        if (hj5Var == null) {
            hj5 hj5Var2 = new hj5(this);
            unsafe.putObjectVolatile(this, j, hj5Var2);
            return hj5Var2;
        }
        return hj5Var;
    }

    public String toString() {
        return new qo3(1, 3, nc1.class, this, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;") + '@' + nc1.P(this);
    }
}
