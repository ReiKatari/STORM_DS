package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: p63  reason: default package */
/* loaded from: classes.dex */
public class p63 implements c63 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater A = AtomicReferenceFieldUpdater.newUpdater(p63.class, Object.class, "_state$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater B;
    public static final /* synthetic */ long L;
    public static final /* synthetic */ long R;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    static {
        Unsafe unsafe = ys5.a;
        R = unsafe.objectFieldOffset(p63.class.getDeclaredField("_state$volatile"));
        B = AtomicReferenceFieldUpdater.newUpdater(p63.class, Object.class, "_parentHandle$volatile");
        L = unsafe.objectFieldOffset(p63.class.getDeclaredField("_parentHandle$volatile"));
    }

    public p63(boolean z) {
        ip1 ip1Var;
        if (z) {
            ip1Var = q63.g;
        } else {
            ip1Var = q63.f;
        }
        this._state$volatile = ip1Var;
    }

    public static yn0 g0(jr3 jr3Var) {
        while (jr3Var.m()) {
            jr3Var = jr3Var.l();
        }
        while (true) {
            jr3Var = jr3Var.k();
            if (!jr3Var.m()) {
                if (jr3Var instanceof yn0) {
                    return (yn0) jr3Var;
                }
                if (jr3Var instanceof o74) {
                    return null;
                }
            }
        }
    }

    public static String p0(Object obj) {
        if (obj instanceof j63) {
            j63 j63Var = (j63) obj;
            if (j63Var.f()) {
                return "Cancelling";
            }
            if (j63.B.get(j63Var) != 1) {
                return "Active";
            }
            return "Completing";
        } else if (obj instanceof ay2) {
            if (((ay2) obj).d()) {
                return "Active";
            }
            return "New";
        } else if (obj instanceof ns0) {
            return "Cancelled";
        } else {
            return "Completed";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.RuntimeException, hg] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Throwable, hg] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.RuntimeException] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, p63] */
    public final void A(ay2 ay2Var, Object obj) {
        ns0 ns0Var;
        Throwable th;
        xn0 Q = Q();
        if (Q != null) {
            Q.dispose();
            n0(t74.A);
        }
        ?? r1 = 0;
        if (obj instanceof ns0) {
            ns0Var = (ns0) obj;
        } else {
            ns0Var = null;
        }
        if (ns0Var != null) {
            th = ns0Var.a;
        } else {
            th = null;
        }
        if (ay2Var instanceof f63) {
            try {
                ((f63) ay2Var).r(th);
                return;
            } catch (Throwable th2) {
                W(new RuntimeException("Exception in completion handler " + ay2Var + " for " + ((Object) this), th2));
                return;
            }
        }
        o74 e = ay2Var.e();
        if (e != null) {
            e.b(new jp3(1), 1);
            Object j = e.j();
            j.getClass();
            jr3 jr3Var = (jr3) j;
            while (!jr3Var.equals(e)) {
                if (jr3Var instanceof f63) {
                    try {
                        ((f63) jr3Var).r(th);
                    } catch (Throwable th3) {
                        if (r1 != 0) {
                            pu.k(r1, th3);
                        } else {
                            r1 = new RuntimeException("Exception in completion handler " + jr3Var + " for " + ((Object) this), th3);
                        }
                    }
                }
                jr3Var = jr3Var.k();
                r1 = r1;
            }
            if (r1 != 0) {
                W(r1);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x007a, code lost:
        return r5;
     */
    @Override // defpackage.c63
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.xn0 B(defpackage.p63 r7) {
        /*
            r6 = this;
            yn0 r5 = new yn0
            r5.<init>(r7)
            r5.Z = r6
        L7:
            java.lang.Object r4 = r6.S()
            boolean r7 = r4 instanceof defpackage.ip1
            if (r7 == 0) goto L35
            r7 = r4
            ip1 r7 = (defpackage.ip1) r7
            boolean r0 = r7.A
            if (r0 == 0) goto L30
        L16:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = defpackage.p63.A
            r7.getClass()
            sun.misc.Unsafe r0 = defpackage.ys5.a
            long r2 = defpackage.p63.R
            r1 = r6
            boolean r6 = r0.compareAndSwapObject(r1, r2, r4, r5)
            if (r6 == 0) goto L27
            goto L7a
        L27:
            java.lang.Object r6 = r0.getObjectVolatile(r1, r2)
            if (r6 == r4) goto L2e
            goto L4b
        L2e:
            r6 = r1
            goto L16
        L30:
            r1 = r6
            r1.k0(r7)
            goto L4b
        L35:
            r1 = r6
            boolean r6 = r4 instanceof defpackage.ay2
            t74 r7 = defpackage.t74.A
            r0 = 0
            if (r6 == 0) goto L7c
            r6 = r4
            ay2 r6 = (defpackage.ay2) r6
            o74 r6 = r6.e()
            if (r6 != 0) goto L4d
            f63 r4 = (defpackage.f63) r4
            r1.l0(r4)
        L4b:
            r6 = r1
            goto L7
        L4d:
            r2 = 7
            boolean r2 = r6.b(r5, r2)
            if (r2 == 0) goto L55
            goto L7a
        L55:
            r2 = 3
            boolean r6 = r6.b(r5, r2)
            java.lang.Object r1 = r1.S()
            boolean r2 = r1 instanceof defpackage.j63
            if (r2 == 0) goto L69
            j63 r1 = (defpackage.j63) r1
            java.lang.Throwable r0 = r1.c()
            goto L75
        L69:
            boolean r2 = r1 instanceof defpackage.ns0
            if (r2 == 0) goto L70
            ns0 r1 = (defpackage.ns0) r1
            goto L71
        L70:
            r1 = r0
        L71:
            if (r1 == 0) goto L75
            java.lang.Throwable r0 = r1.a
        L75:
            r5.r(r0)
            if (r6 == 0) goto L7b
        L7a:
            return r5
        L7b:
            return r7
        L7c:
            java.lang.Object r6 = r1.S()
            boolean r1 = r6 instanceof defpackage.ns0
            if (r1 == 0) goto L87
            ns0 r6 = (defpackage.ns0) r6
            goto L88
        L87:
            r6 = r0
        L88:
            if (r6 == 0) goto L8c
            java.lang.Throwable r0 = r6.a
        L8c:
            r5.r(r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p63.B(p63):xn0");
    }

    @Override // defpackage.e31
    public final e31 C(e31 e31Var) {
        return se.O(this, e31Var);
    }

    @Override // defpackage.c63
    public final n85 D() {
        o63 o63Var = o63.c0;
        l07.q(3, o63Var);
        return new n85(this, o63Var);
    }

    public final Throwable E(Object obj) {
        boolean z;
        Throwable th;
        if (obj == null) {
            z = true;
        } else {
            z = obj instanceof Throwable;
        }
        CancellationException cancellationException = null;
        if (z) {
            Throwable th2 = (Throwable) obj;
            if (th2 == null) {
                return new d63(y(), null, this);
            }
            return th2;
        }
        obj.getClass();
        p63 p63Var = (p63) obj;
        Object S = p63Var.S();
        if (S instanceof j63) {
            th = ((j63) S).c();
        } else if (S instanceof ns0) {
            th = ((ns0) S).a;
        } else if (!(S instanceof ay2)) {
            th = null;
        } else {
            f81.p(S, "Cannot be cancelling child in this state: ");
            return null;
        }
        if (th instanceof CancellationException) {
            cancellationException = th;
        }
        if (cancellationException == null) {
            return new d63("Parent job is ".concat(p0(S)), th, p63Var);
        }
        return cancellationException;
    }

    public final Object G(j63 j63Var, Object obj) {
        ns0 ns0Var;
        j63 j63Var2;
        Throwable th;
        Throwable L2;
        by2 by2Var;
        p63 p63Var;
        j63 j63Var3;
        Throwable th2 = null;
        if (obj instanceof ns0) {
            ns0Var = (ns0) obj;
        } else {
            ns0Var = null;
        }
        if (ns0Var != null) {
            th2 = ns0Var.a;
        }
        synchronized (j63Var) {
            try {
                j63Var.f();
                ArrayList g = j63Var.g(th2);
                L2 = L(j63Var, g);
                if (L2 != null) {
                    try {
                        if (g.size() > 1) {
                            Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(g.size()));
                            int size = g.size();
                            int i = 0;
                            while (i < size) {
                                Object obj2 = g.get(i);
                                i++;
                                Throwable th3 = (Throwable) obj2;
                                if (th3 != L2 && th3 != L2 && !(th3 instanceof CancellationException) && newSetFromMap.add(th3)) {
                                    pu.k(L2, th3);
                                }
                            }
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        j63Var2 = j63Var;
                        throw th;
                    }
                }
            } catch (Throwable th5) {
                j63Var2 = j63Var;
                th = th5;
            }
        }
        if (L2 != null && L2 != th2) {
            obj = new ns0(L2, false);
        }
        if (L2 != null && (v(L2) || U(L2))) {
            obj.getClass();
            ns0.b.compareAndSet((ns0) obj, 0, 1);
        }
        i0(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = A;
        if (obj instanceof ay2) {
            by2Var = new by2((ay2) obj);
        } else {
            by2Var = obj;
        }
        while (true) {
            atomicReferenceFieldUpdater.getClass();
            Unsafe unsafe = ys5.a;
            long j = R;
            p63Var = this;
            j63Var3 = j63Var;
            if (!unsafe.compareAndSwapObject(p63Var, j, j63Var3, by2Var) && unsafe.getObjectVolatile(p63Var, j) == j63Var3) {
                this = p63Var;
                j63Var = j63Var3;
            }
        }
        p63Var.A(j63Var3, obj);
        return obj;
    }

    public final Object H() {
        Object S = S();
        if (!(S instanceof ay2)) {
            if (!(S instanceof ns0)) {
                return q63.a(S);
            }
            throw ((ns0) S).a;
        }
        i.n("This job has not completed yet");
        return null;
    }

    @Override // defpackage.e31
    public final c31 I(d31 d31Var) {
        return se.z(this, d31Var);
    }

    @Override // defpackage.c63
    public final CancellationException K() {
        Object S = S();
        CancellationException cancellationException = null;
        if (S instanceof j63) {
            Throwable c = ((j63) S).c();
            if (c != null) {
                String concat = getClass().getSimpleName().concat(" is cancelling");
                if (c instanceof CancellationException) {
                    cancellationException = (CancellationException) c;
                }
                if (cancellationException == null) {
                    return new d63(concat, c, this);
                }
                return cancellationException;
            }
            f81.p(this, "Job is still new or active: ");
            return null;
        } else if (!(S instanceof ay2)) {
            if (S instanceof ns0) {
                Throwable th = ((ns0) S).a;
                if (th instanceof CancellationException) {
                    cancellationException = (CancellationException) th;
                }
                if (cancellationException == null) {
                    return new d63(y(), th, this);
                }
                return cancellationException;
            }
            return new d63(getClass().getSimpleName().concat(" has completed normally"), null, this);
        } else {
            f81.p(this, "Job is still new or active: ");
            return null;
        }
    }

    public final Throwable L(j63 j63Var, ArrayList arrayList) {
        Object obj;
        Object obj2 = null;
        if (arrayList.isEmpty()) {
            if (!j63Var.f()) {
                return null;
            }
            return new d63(y(), null, this);
        }
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 < size) {
                obj = arrayList.get(i2);
                i2++;
                if (!(((Throwable) obj) instanceof CancellationException)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        Throwable th = (Throwable) obj;
        if (th != null) {
            return th;
        }
        Throwable th2 = (Throwable) arrayList.get(0);
        if (th2 instanceof lt6) {
            int size2 = arrayList.size();
            while (true) {
                if (i >= size2) {
                    break;
                }
                Object obj3 = arrayList.get(i);
                i++;
                Throwable th3 = (Throwable) obj3;
                if (th3 != th2 && (th3 instanceof lt6)) {
                    obj2 = obj3;
                    break;
                }
            }
            Throwable th4 = (Throwable) obj2;
            if (th4 != null) {
                return th4;
            }
        }
        return th2;
    }

    public boolean M() {
        return true;
    }

    @Override // defpackage.e31
    public final Object N(aj2 aj2Var, Object obj) {
        return aj2Var.j(obj, this);
    }

    public boolean O() {
        return this instanceof gs0;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [jr3, o74] */
    public final o74 P(ay2 ay2Var) {
        o74 e = ay2Var.e();
        if (e == null) {
            if (ay2Var instanceof ip1) {
                return new jr3();
            }
            if (ay2Var instanceof f63) {
                l0((f63) ay2Var);
                return null;
            }
            f81.p(ay2Var, "State should have list: ");
            return null;
        }
        return e;
    }

    public final xn0 Q() {
        B.getClass();
        return (xn0) ys5.a.getObjectVolatile(this, L);
    }

    @Override // defpackage.c63
    public final eh1 R(mi2 mi2Var) {
        return Y(true, new p53(mi2Var));
    }

    public final Object S() {
        A.getClass();
        return ys5.a.getObjectVolatile(this, R);
    }

    @Override // defpackage.e31
    public final e31 T(d31 d31Var) {
        return se.J(this, d31Var);
    }

    public boolean U(Throwable th) {
        return false;
    }

    public final void X(c63 c63Var) {
        t74 t74Var = t74.A;
        if (c63Var == null) {
            n0(t74Var);
            return;
        }
        c63Var.start();
        xn0 B2 = c63Var.B(this);
        n0(B2);
        if (a0()) {
            B2.dispose();
            n0(t74Var);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0074, code lost:
        return r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.eh1 Y(boolean r7, defpackage.f63 r8) {
        /*
            r6 = this;
            r8.Z = r6
        L2:
            java.lang.Object r4 = r6.S()
            boolean r0 = r4 instanceof defpackage.ip1
            if (r0 == 0) goto L33
            r0 = r4
            ip1 r0 = (defpackage.ip1) r0
            boolean r1 = r0.A
            if (r1 == 0) goto L2d
        L11:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.p63.A
            r0.getClass()
            sun.misc.Unsafe r0 = defpackage.ys5.a
            long r2 = defpackage.p63.R
            r1 = r6
            r5 = r8
            boolean r6 = r0.compareAndSwapObject(r1, r2, r4, r5)
            if (r6 == 0) goto L23
            goto L74
        L23:
            java.lang.Object r6 = r0.getObjectVolatile(r1, r2)
            if (r6 == r4) goto L2a
            goto L75
        L2a:
            r6 = r1
            r8 = r5
            goto L11
        L2d:
            r1 = r6
            r5 = r8
            r1.k0(r0)
            goto L75
        L33:
            r1 = r6
            r5 = r8
            boolean r6 = r4 instanceof defpackage.ay2
            t74 r8 = defpackage.t74.A
            r0 = 0
            if (r6 == 0) goto L78
            r6 = r4
            ay2 r6 = (defpackage.ay2) r6
            o74 r2 = r6.e()
            if (r2 != 0) goto L4b
            f63 r4 = (defpackage.f63) r4
            r1.l0(r4)
            goto L75
        L4b:
            boolean r3 = r5.q()
            if (r3 == 0) goto L6d
            boolean r3 = r6 instanceof defpackage.j63
            if (r3 == 0) goto L58
            j63 r6 = (defpackage.j63) r6
            goto L59
        L58:
            r6 = r0
        L59:
            if (r6 == 0) goto L5f
            java.lang.Throwable r0 = r6.c()
        L5f:
            if (r0 != 0) goto L67
            r6 = 5
            boolean r6 = r2.b(r5, r6)
            goto L72
        L67:
            if (r7 == 0) goto L8d
            r5.r(r0)
            return r8
        L6d:
            r6 = 1
            boolean r6 = r2.b(r5, r6)
        L72:
            if (r6 == 0) goto L75
        L74:
            return r5
        L75:
            r6 = r1
            r8 = r5
            goto L2
        L78:
            if (r7 == 0) goto L8d
            java.lang.Object r6 = r1.S()
            boolean r7 = r6 instanceof defpackage.ns0
            if (r7 == 0) goto L85
            ns0 r6 = (defpackage.ns0) r6
            goto L86
        L85:
            r6 = r0
        L86:
            if (r6 == 0) goto L8a
            java.lang.Throwable r0 = r6.a
        L8a:
            r5.r(r0)
        L8d:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p63.Y(boolean, f63):eh1");
    }

    @Override // defpackage.c63
    public final Object Z(k11 k11Var) {
        Object S;
        o27 o27Var;
        do {
            S = S();
            boolean z = S instanceof ay2;
            o27Var = o27.a;
            if (!z) {
                ln2.B(k11Var.a());
                return o27Var;
            }
        } while (o0(S) < 0);
        ih0 ih0Var = new ih0(1, nk2.J(k11Var));
        ih0Var.x();
        ih0Var.A(new bh0(2, ln2.E(this, true, new pc5(ih0Var))));
        Object v = ih0Var.v();
        p31 p31Var = p31.COROUTINE_SUSPENDED;
        if (v != p31Var) {
            v = o27Var;
        }
        if (v == p31Var) {
            return v;
        }
        return o27Var;
    }

    public final boolean a0() {
        return !(S() instanceof ay2);
    }

    public boolean b0() {
        return this instanceof m30;
    }

    public final boolean c0(Object obj) {
        Object s0;
        do {
            s0 = s0(S(), obj);
            if (s0 == q63.a) {
                return false;
            }
            if (s0 == q63.b) {
                return true;
            }
        } while (s0 == q63.c);
        e(s0);
        return true;
    }

    @Override // defpackage.c63
    public boolean d() {
        Object S = S();
        if ((S instanceof ay2) && ((ay2) S).d()) {
            return true;
        }
        return false;
    }

    public final Object d0(Object obj) {
        Object s0;
        ns0 ns0Var;
        do {
            s0 = s0(S(), obj);
            if (s0 == q63.a) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                Throwable th = null;
                if (obj instanceof ns0) {
                    ns0Var = (ns0) obj;
                } else {
                    ns0Var = null;
                }
                if (ns0Var != null) {
                    th = ns0Var.a;
                }
                throw new IllegalStateException(str, th);
            }
        } while (s0 == q63.c);
        return s0;
    }

    public String e0() {
        return getClass().getSimpleName();
    }

    public void f(Object obj) {
        e(obj);
    }

    @Override // defpackage.c63
    public final eh1 f0(boolean z, boolean z2, z zVar) {
        f63 p53Var;
        if (z) {
            p53Var = new o53(zVar);
        } else {
            p53Var = new p53(zVar);
        }
        return Y(z2, p53Var);
    }

    @Override // defpackage.c31
    public final d31 getKey() {
        return k45.d0;
    }

    public final Object h(j11 j11Var) {
        Object S;
        do {
            S = S();
            if (!(S instanceof ay2)) {
                if (!(S instanceof ns0)) {
                    return q63.a(S);
                }
                throw ((ns0) S).a;
            }
        } while (o0(S) < 0);
        h63 h63Var = new h63(nk2.J(j11Var), this);
        h63Var.x();
        h63Var.A(new bh0(2, ln2.E(this, true, new oc5(h63Var))));
        Object v = h63Var.v();
        p31 p31Var = p31.COROUTINE_SUSPENDED;
        return v;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Throwable, hg] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.RuntimeException] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, p63] */
    public final void h0(o74 o74Var, Throwable th) {
        o74Var.b(new jp3(4), 4);
        Object j = o74Var.j();
        j.getClass();
        jr3 jr3Var = (jr3) j;
        ?? r1 = 0;
        while (!jr3Var.equals(o74Var)) {
            if ((jr3Var instanceof f63) && ((f63) jr3Var).q()) {
                try {
                    ((f63) jr3Var).r(th);
                } catch (Throwable th2) {
                    if (r1 != 0) {
                        pu.k(r1, th2);
                    } else {
                        r1 = new RuntimeException("Exception in completion handler " + jr3Var + " for " + ((Object) this), th2);
                    }
                }
            }
            jr3Var = jr3Var.k();
            r1 = r1;
        }
        if (r1 != 0) {
            W(r1);
        }
        v(th);
    }

    @Override // defpackage.c63, defpackage.lj0
    public void i(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new d63(y(), null, this);
        }
        u(cancellationException);
    }

    @Override // defpackage.c63
    public final boolean isCancelled() {
        Object S = S();
        if (!(S instanceof ns0)) {
            if (!(S instanceof j63) || !((j63) S).f()) {
                return false;
            }
            return true;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [jr3, o74] */
    public final void k0(ip1 ip1Var) {
        xx2 xx2Var;
        ?? jr3Var = new jr3();
        if (ip1Var.A) {
            xx2Var = jr3Var;
        } else {
            xx2Var = new xx2(jr3Var);
        }
        while (true) {
            A.getClass();
            Unsafe unsafe = ys5.a;
            long j = R;
            p63 p63Var = this;
            ip1 ip1Var2 = ip1Var;
            if (unsafe.compareAndSwapObject(p63Var, j, ip1Var2, xx2Var) || unsafe.getObjectVolatile(p63Var, j) != ip1Var2) {
                return;
            }
            this = p63Var;
            ip1Var = ip1Var2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [jr3, o74] */
    public final void l0(f63 f63Var) {
        f63Var.f(new jr3());
        jr3 k = f63Var.k();
        Object obj = f63Var;
        while (true) {
            A.getClass();
            Unsafe unsafe = ys5.a;
            long j = R;
            p63 p63Var = this;
            Object obj2 = obj;
            if (unsafe.compareAndSwapObject(p63Var, j, obj2, k) || unsafe.getObjectVolatile(p63Var, j) != obj2) {
                return;
            }
            this = p63Var;
            obj = obj2;
        }
    }

    public final void m0(f63 f63Var) {
        p63 p63Var;
        while (true) {
            Object S = this.S();
            if (S instanceof f63) {
                if (S != f63Var) {
                    return;
                }
                while (true) {
                    A.getClass();
                    Unsafe unsafe = ys5.a;
                    long j = R;
                    p63Var = this;
                    if (!unsafe.compareAndSwapObject(p63Var, j, S, q63.g)) {
                        if (unsafe.getObjectVolatile(p63Var, j) != S) {
                            break;
                        }
                        this = p63Var;
                    } else {
                        return;
                    }
                }
            } else if ((S instanceof ay2) && ((ay2) S).e() != null) {
                f63Var.n();
                return;
            } else {
                return;
            }
            this = p63Var;
        }
    }

    public final void n0(xn0 xn0Var) {
        B.getClass();
        ys5.a.putObjectVolatile(this, L, xn0Var);
    }

    public final int o0(Object obj) {
        Unsafe unsafe;
        boolean z = obj instanceof ip1;
        long j = R;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = A;
        if (z) {
            if (((ip1) obj).A) {
                return 0;
            }
            while (true) {
                atomicReferenceFieldUpdater.getClass();
                Unsafe unsafe2 = ys5.a;
                p63 p63Var = this;
                Object obj2 = obj;
                if (unsafe2.compareAndSwapObject(p63Var, R, obj2, q63.g)) {
                    p63Var.j0();
                    return 1;
                } else if (unsafe2.getObjectVolatile(p63Var, j) == obj2) {
                    this = p63Var;
                    obj = obj2;
                } else {
                    return -1;
                }
            }
        } else {
            p63 p63Var2 = this;
            Object obj3 = obj;
            if (obj3 instanceof xx2) {
                o74 o74Var = ((xx2) obj3).A;
                do {
                    atomicReferenceFieldUpdater.getClass();
                    p63 p63Var3 = p63Var2;
                    unsafe = ys5.a;
                    Object obj4 = obj3;
                    boolean compareAndSwapObject = unsafe.compareAndSwapObject(p63Var3, R, obj4, o74Var);
                    p63Var2 = p63Var3;
                    obj3 = obj4;
                    if (compareAndSwapObject) {
                        p63Var2.j0();
                        return 1;
                    }
                } while (unsafe.getObjectVolatile(p63Var2, j) == obj3);
                return -1;
            }
            return 0;
        }
    }

    public Object p() {
        return H();
    }

    public final boolean q0(ay2 ay2Var, Object obj) {
        by2 by2Var;
        if (obj instanceof ay2) {
            by2Var = new by2((ay2) obj);
        } else {
            by2Var = obj;
        }
        while (true) {
            A.getClass();
            Unsafe unsafe = ys5.a;
            long j = R;
            p63 p63Var = this;
            ay2 ay2Var2 = ay2Var;
            if (unsafe.compareAndSwapObject(p63Var, j, ay2Var2, by2Var)) {
                p63Var.i0(obj);
                p63Var.A(ay2Var2, obj);
                return true;
            } else if (unsafe.getObjectVolatile(p63Var, j) != ay2Var2) {
                return false;
            } else {
                this = p63Var;
                ay2Var = ay2Var2;
            }
        }
    }

    public final boolean r0(ay2 ay2Var, Throwable th) {
        o74 P = P(ay2Var);
        if (P != null) {
            j63 j63Var = new j63(P, th);
            while (true) {
                A.getClass();
                Unsafe unsafe = ys5.a;
                long j = R;
                p63 p63Var = this;
                ay2 ay2Var2 = ay2Var;
                if (unsafe.compareAndSwapObject(p63Var, j, ay2Var2, j63Var)) {
                    p63Var.h0(P, th);
                    return true;
                } else if (unsafe.getObjectVolatile(p63Var, j) != ay2Var2) {
                    return false;
                } else {
                    this = p63Var;
                    ay2Var = ay2Var2;
                }
            }
        } else {
            return false;
        }
    }

    public final Object s0(Object obj, Object obj2) {
        j63 j63Var;
        boolean z;
        ns0 ns0Var;
        if (!(obj instanceof ay2)) {
            return q63.a;
        }
        if (((obj instanceof ip1) || (obj instanceof f63)) && !(obj instanceof yn0) && !(obj2 instanceof ns0)) {
            if (q0((ay2) obj, obj2)) {
                return obj2;
            }
            return q63.c;
        }
        ay2 ay2Var = (ay2) obj;
        o74 P = P(ay2Var);
        if (P == null) {
            return q63.c;
        }
        Throwable th = null;
        if (ay2Var instanceof j63) {
            j63Var = (j63) ay2Var;
        } else {
            j63Var = null;
        }
        if (j63Var == null) {
            j63Var = new j63(P, null);
        }
        synchronized (j63Var) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = j63.B;
            if (atomicIntegerFieldUpdater.get(j63Var) == 1) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return q63.a;
            }
            atomicIntegerFieldUpdater.set(j63Var, 1);
            if (j63Var != ay2Var) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = A;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, ay2Var, j63Var)) {
                    if (atomicReferenceFieldUpdater.get(this) != ay2Var) {
                        return q63.c;
                    }
                }
            }
            boolean f = j63Var.f();
            if (obj2 instanceof ns0) {
                ns0Var = (ns0) obj2;
            } else {
                ns0Var = null;
            }
            if (ns0Var != null) {
                j63Var.a(ns0Var.a);
            }
            Throwable c = j63Var.c();
            if (!f) {
                th = c;
            }
            if (th != null) {
                h0(P, th);
            }
            yn0 g0 = g0(P);
            if (g0 != null && t0(j63Var, g0, obj2)) {
                return q63.b;
            }
            P.b(new jp3(2), 2);
            yn0 g02 = g0(P);
            if (g02 != null && t0(j63Var, g02, obj2)) {
                return q63.b;
            }
            return G(j63Var, obj2);
        }
    }

    @Override // defpackage.c63
    public final boolean start() {
        int o0;
        do {
            o0 = o0(S());
            if (o0 == 0) {
                return false;
            }
        } while (o0 != 1);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0038, code lost:
        if (r0 == defpackage.q63.b) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0059, code lost:
        r0 = r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean t(java.lang.Object r8) {
        /*
            Method dump skipped, instructions count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p63.t(java.lang.Object):boolean");
    }

    public final boolean t0(j63 j63Var, yn0 yn0Var, Object obj) {
        while (ln2.E(yn0Var.c0, false, new i63(this, j63Var, yn0Var, obj)) == t74.A) {
            yn0Var = g0(yn0Var);
            if (yn0Var == null) {
                return false;
            }
        }
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(e0() + '{' + p0(S()) + '}');
        sb.append('@');
        sb.append(w81.s(this));
        return sb.toString();
    }

    public void u(Throwable th) {
        t(th);
    }

    public final boolean v(Throwable th) {
        if (!b0()) {
            boolean z = th instanceof CancellationException;
            xn0 Q = Q();
            if (Q != null && Q != t74.A) {
                if (!Q.a(th) && !z) {
                    return false;
                }
                return true;
            }
            return z;
        }
        return true;
    }

    public String y() {
        return "Job was cancelled";
    }

    public boolean z(Throwable th) {
        if (!(th instanceof CancellationException)) {
            if (t(th) && M()) {
                return true;
            }
            return false;
        }
        return true;
    }

    public void j0() {
    }

    public void W(hg hgVar) {
        throw hgVar;
    }

    public void e(Object obj) {
    }

    public void i0(Object obj) {
    }
}
