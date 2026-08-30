package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: jy5  reason: default package */
/* loaded from: classes.dex */
public final class jy5 implements ch0, fd7 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater Y = AtomicReferenceFieldUpdater.newUpdater(jy5.class, Object.class, "state$volatile");
    public static final /* synthetic */ long Z = ys5.a.objectFieldOffset(jy5.class.getDeclaredField("state$volatile"));
    public final e31 A;
    public Object L;
    private volatile /* synthetic */ Object state$volatile = ky5.a;
    public ArrayList B = new ArrayList(2);
    public int R = -1;
    public Object X = ky5.d;

    public jy5(e31 e31Var) {
        this.A = e31Var;
    }

    @Override // defpackage.ch0
    public final void a(Throwable th) {
        jy5 jy5Var;
        while (true) {
            Y.getClass();
            Unsafe unsafe = ys5.a;
            long j = Z;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (objectVolatile == ky5.b) {
                return;
            }
            while (true) {
                Unsafe unsafe2 = ys5.a;
                jy5Var = this;
                if (unsafe2.compareAndSwapObject(jy5Var, Z, objectVolatile, ky5.c)) {
                    ArrayList arrayList = jy5Var.B;
                    if (arrayList == null) {
                        return;
                    }
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        ((hy5) obj).a();
                    }
                    jy5Var.X = ky5.d;
                    jy5Var.B = null;
                    return;
                } else if (unsafe2.getObjectVolatile(jy5Var, j) != objectVolatile) {
                    break;
                } else {
                    this = jy5Var;
                }
            }
            this = jy5Var;
        }
    }

    @Override // defpackage.fd7
    public final void b(dy5 dy5Var, int i) {
        this.L = dy5Var;
        this.R = i;
    }

    public final void c(hy5 hy5Var) {
        ArrayList arrayList = this.B;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            hy5 hy5Var2 = (hy5) obj;
            if (hy5Var2 != hy5Var) {
                hy5Var2.a();
            }
        }
        Y.getClass();
        ys5.a.putObjectVolatile(this, Z, ky5.b);
        this.X = ky5.d;
        this.B = null;
    }

    public final Object d(k11 k11Var) {
        Y.getClass();
        Object objectVolatile = ys5.a.getObjectVolatile(this, Z);
        objectVolatile.getClass();
        hy5 hy5Var = (hy5) objectVolatile;
        Object obj = this.X;
        c(hy5Var);
        bj2 bj2Var = hy5Var.c;
        Object obj2 = hy5Var.a;
        Object obj3 = hy5Var.d;
        Object i = bj2Var.i(obj2, obj3, obj);
        nk6 nk6Var = hy5Var.e;
        if (obj3 == ky5.e) {
            return ((mi2) nk6Var).n(k11Var);
        }
        return ((aj2) nk6Var).j(i, k11Var);
    }

    public final Object e(nk6 nk6Var) {
        if (i()) {
            return d(nk6Var);
        }
        return f(nk6Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0042, code lost:
        if (m(r0) == r1) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0050 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.k11 r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.iy5
            if (r0 == 0) goto L13
            r0 = r7
            iy5 r0 = (defpackage.iy5) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            iy5 r0 = new iy5
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.X
            p31 r1 = defpackage.p31.COROUTINE_SUSPENDED
            int r2 = r0.Z
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L37
            if (r2 == r5) goto L31
            if (r2 != r4) goto L2b
            defpackage.me2.a0(r7)
            return r7
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r6)
            return r3
        L31:
            jy5 r6 = r0.R
            defpackage.me2.a0(r7)
            goto L45
        L37:
            defpackage.me2.a0(r7)
            r0.R = r6
            r0.Z = r5
            java.lang.Object r7 = r6.m(r0)
            if (r7 != r1) goto L45
            goto L4f
        L45:
            r0.R = r3
            r0.Z = r4
            java.lang.Object r6 = r6.d(r0)
            if (r6 != r1) goto L50
        L4f:
            return r1
        L50:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jy5.f(k11):java.lang.Object");
    }

    public final hy5 g(Object obj) {
        ArrayList arrayList = this.B;
        Object obj2 = null;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            Object obj3 = arrayList.get(i);
            i++;
            if (((hy5) obj3).a == obj) {
                obj2 = obj3;
                break;
            }
        }
        hy5 hy5Var = (hy5) obj2;
        if (hy5Var != null) {
            return hy5Var;
        }
        throw new IllegalStateException(("Clause with object " + obj + " is not found").toString());
    }

    public final void h(q9 q9Var, aj2 aj2Var) {
        j(new hy5(this, q9Var.B, (bj2) q9Var.L, (bj2) q9Var.R, null, (nk6) aj2Var, (bj2) q9Var.X), false);
    }

    public final boolean i() {
        Y.getClass();
        return ys5.a.getObjectVolatile(this, Z) instanceof hy5;
    }

    public final void j(hy5 hy5Var, boolean z) {
        Object obj = hy5Var.a;
        Y.getClass();
        Unsafe unsafe = ys5.a;
        long j = Z;
        if (unsafe.getObjectVolatile(this, j) instanceof hy5) {
            return;
        }
        if (!z) {
            ArrayList arrayList = this.B;
            arrayList.getClass();
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj2 = arrayList.get(i);
                    i++;
                    if (((hy5) obj2).a == obj) {
                        c44.h(obj, "Cannot use select clauses on the same object: ");
                        return;
                    }
                }
            }
        }
        hy5Var.b.i(obj, this, hy5Var.d);
        if (this.X == ky5.d) {
            if (!z) {
                ArrayList arrayList2 = this.B;
                arrayList2.getClass();
                arrayList2.add(hy5Var);
            }
            hy5Var.g = this.L;
            hy5Var.h = this.R;
            this.L = null;
            this.R = -1;
            return;
        }
        ys5.a.putObjectVolatile(this, j, hy5Var);
    }

    public final boolean k(Object obj, Object obj2) {
        if (l(obj, obj2) == 0) {
            return true;
        }
        return false;
    }

    public final int l(Object obj, Object obj2) {
        jy5 jy5Var;
        Unsafe unsafe;
        Unsafe unsafe2;
        bj2 bj2Var;
        while (true) {
            Y.getClass();
            Unsafe unsafe3 = ys5.a;
            long j = Z;
            Object objectVolatile = unsafe3.getObjectVolatile(this, j);
            if (objectVolatile instanceof hh0) {
                hy5 g = this.g(obj);
                if (g != null) {
                    bj2 bj2Var2 = g.f;
                    if (bj2Var2 != null) {
                        bj2Var = (bj2) bj2Var2.i(this, g.d, obj2);
                    } else {
                        bj2Var = null;
                    }
                    while (true) {
                        Unsafe unsafe4 = ys5.a;
                        jy5Var = this;
                        if (unsafe4.compareAndSwapObject(jy5Var, Z, objectVolatile, g)) {
                            hh0 hh0Var = (hh0) objectVolatile;
                            jy5Var.X = obj2;
                            an1 m = hh0Var.m(o27.a, bj2Var);
                            if (m == null) {
                                jy5Var.X = ky5.d;
                                return 2;
                            }
                            hh0Var.s(m);
                            return 0;
                        } else if (unsafe4.getObjectVolatile(jy5Var, j) != objectVolatile) {
                            break;
                        } else {
                            this = jy5Var;
                        }
                    }
                } else {
                    continue;
                }
            } else {
                jy5Var = this;
                if (!b53.x(objectVolatile, ky5.b) && !(objectVolatile instanceof hy5)) {
                    if (b53.x(objectVolatile, ky5.c)) {
                        return 2;
                    }
                    if (b53.x(objectVolatile, ky5.a)) {
                        List b0 = l07.b0(obj);
                        do {
                            unsafe2 = ys5.a;
                            if (unsafe2.compareAndSwapObject(jy5Var, Z, objectVolatile, b0)) {
                                return 1;
                            }
                        } while (unsafe2.getObjectVolatile(jy5Var, j) == objectVolatile);
                    } else if (objectVolatile instanceof List) {
                        ArrayList Y0 = tq0.Y0((Collection) objectVolatile, obj);
                        do {
                            unsafe = ys5.a;
                            if (unsafe.compareAndSwapObject(jy5Var, Z, objectVolatile, Y0)) {
                                return 1;
                            }
                        } while (unsafe.getObjectVolatile(jy5Var, j) == objectVolatile);
                    } else {
                        f81.p(objectVolatile, "Unexpected state: ");
                        return 0;
                    }
                } else {
                    return 3;
                }
            }
            this = jy5Var;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x008c, code lost:
        r0 = r10.v();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0092, code lost:
        if (r0 != defpackage.p31.COROUTINE_SUSPENDED) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0094, code lost:
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0095, code lost:
        return r9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(defpackage.iy5 r13) {
        /*
            r12 = this;
            ih0 r5 = new ih0
            j11 r0 = defpackage.nk2.J(r13)
            r6 = 1
            r5.<init>(r6, r0)
            r5.x()
        Ld:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.jy5.Y
            r0.getClass()
            sun.misc.Unsafe r0 = defpackage.ys5.a
            long r7 = defpackage.jy5.Z
            java.lang.Object r4 = r0.getObjectVolatile(r12, r7)
            o27 r9 = defpackage.o27.a
            r0 = r5
            an1 r5 = defpackage.ky5.a
            if (r4 != r5) goto L3b
            r5 = r0
        L22:
            sun.misc.Unsafe r0 = defpackage.ys5.a
            long r2 = defpackage.jy5.Z
            r1 = r12
            boolean r2 = r0.compareAndSwapObject(r1, r2, r4, r5)
            r10 = r5
            if (r2 == 0) goto L32
            r10.A(r12)
            goto L8c
        L32:
            java.lang.Object r0 = r0.getObjectVolatile(r12, r7)
            if (r0 == r4) goto L39
            goto L72
        L39:
            r5 = r10
            goto L22
        L3b:
            r10 = r0
            boolean r0 = r4 instanceof java.util.List
            r11 = 0
            if (r0 == 0) goto L74
        L41:
            sun.misc.Unsafe r0 = defpackage.ys5.a
            long r2 = defpackage.jy5.Z
            r1 = r12
            boolean r2 = r0.compareAndSwapObject(r1, r2, r4, r5)
            if (r2 == 0) goto L6c
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.Iterator r0 = r4.iterator()
        L52:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L72
            java.lang.Object r2 = r0.next()
            hy5 r2 = r12.g(r2)
            r2.getClass()
            r2.g = r11
            r3 = -1
            r2.h = r3
            r12.j(r2, r6)
            goto L52
        L6c:
            java.lang.Object r0 = r0.getObjectVolatile(r12, r7)
            if (r0 == r4) goto L41
        L72:
            r5 = r10
            goto Ld
        L74:
            boolean r0 = r4 instanceof defpackage.hy5
            if (r0 == 0) goto L96
            hy5 r4 = (defpackage.hy5) r4
            java.lang.Object r0 = r12.X
            bj2 r2 = r4.f
            if (r2 == 0) goto L89
            java.lang.Object r3 = r4.d
            java.lang.Object r0 = r2.i(r12, r3, r0)
            r11 = r0
            bj2 r11 = (defpackage.bj2) r11
        L89:
            r10.l(r9, r11)
        L8c:
            java.lang.Object r0 = r10.v()
            p31 r1 = defpackage.p31.COROUTINE_SUSPENDED
            if (r0 != r1) goto L95
            return r0
        L95:
            return r9
        L96:
            java.lang.String r0 = "unexpected state: "
            defpackage.f81.p(r4, r0)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jy5.m(iy5):java.lang.Object");
    }
}
