package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ed3  reason: default package */
/* loaded from: classes.dex */
public class ed3 implements rc3 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater A = AtomicReferenceFieldUpdater.newUpdater(ed3.class, Object.class, "_state$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater B;
    public static final /* synthetic */ long L;
    public static final /* synthetic */ long R;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    static {
        Unsafe unsafe = v36.a;
        R = unsafe.objectFieldOffset(ed3.class.getDeclaredField("_state$volatile"));
        B = AtomicReferenceFieldUpdater.newUpdater(ed3.class, Object.class, "_parentHandle$volatile");
        L = unsafe.objectFieldOffset(ed3.class.getDeclaredField("_parentHandle$volatile"));
    }

    public ed3(boolean z) {
        rt1 rt1Var;
        if (z) {
            rt1Var = fd3.g;
        } else {
            rt1Var = fd3.f;
        }
        this._state$volatile = rt1Var;
    }

    public static iq0 g0(ky3 ky3Var) {
        while (ky3Var.m()) {
            ky3Var = ky3Var.l();
        }
        while (true) {
            ky3Var = ky3Var.k();
            if (!ky3Var.m()) {
                if (ky3Var instanceof iq0) {
                    return (iq0) ky3Var;
                }
                if (ky3Var instanceof gg4) {
                    return null;
                }
            }
        }
    }

    public static String p0(Object obj) {
        if (obj instanceof yc3) {
            yc3 yc3Var = (yc3) obj;
            if (yc3Var.d()) {
                return "Cancelling";
            }
            if (yc3.B.get(yc3Var) != 1) {
                return "Active";
            }
            return "Completing";
        } else if (obj instanceof e43) {
            if (((e43) obj).e()) {
                return "Active";
            }
            return "New";
        } else if (obj instanceof av0) {
            return "Cancelled";
        } else {
            return "Completed";
        }
    }

    public final boolean B(Throwable th) {
        if (!Y()) {
            boolean z = th instanceof CancellationException;
            hq0 P = P();
            if (P != null && P != lg4.A) {
                if (!P.a(th) && !z) {
                    return false;
                }
                return true;
            }
            return z;
        }
        return true;
    }

    public String C() {
        return "Job was cancelled";
    }

    @Override // defpackage.l61
    public final l61 D(k61 k61Var) {
        return jw2.w(this, k61Var);
    }

    public boolean E(Throwable th) {
        if (!(th instanceof CancellationException)) {
            if (s(th) && L()) {
                return true;
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [ug, java.lang.RuntimeException] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Throwable, ug] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.RuntimeException] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r6v0, types: [ed3, java.lang.Object] */
    public final void G(e43 e43Var, Object obj) {
        av0 av0Var;
        Throwable th;
        hq0 P = P();
        if (P != null) {
            P.dispose();
            n0(lg4.A);
        }
        ?? r1 = 0;
        if (obj instanceof av0) {
            av0Var = (av0) obj;
        } else {
            av0Var = null;
        }
        if (av0Var != null) {
            th = av0Var.a;
        } else {
            th = null;
        }
        if (e43Var instanceof uc3) {
            try {
                ((uc3) e43Var).r(th);
                return;
            } catch (Throwable th2) {
                S(new RuntimeException("Exception in completion handler " + e43Var + " for " + ((Object) this), th2));
                return;
            }
        }
        gg4 f = e43Var.f();
        if (f != null) {
            f.b(new lw3(1), 1);
            Object j = f.j();
            j.getClass();
            ky3 ky3Var = (ky3) j;
            while (!ky3Var.equals(f)) {
                if (ky3Var instanceof uc3) {
                    try {
                        ((uc3) ky3Var).r(th);
                    } catch (Throwable th3) {
                        if (r1 != 0) {
                            mb3.q(r1, th3);
                        } else {
                            r1 = new RuntimeException("Exception in completion handler " + ky3Var + " for " + ((Object) this), th3);
                        }
                    }
                }
                ky3Var = ky3Var.k();
                r1 = r1;
            }
            if (r1 != 0) {
                S(r1);
            }
        }
    }

    public final Throwable H(Object obj) {
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
                return new sc3(C(), null, this);
            }
            return th2;
        }
        obj.getClass();
        ed3 ed3Var = (ed3) obj;
        Object Q = ed3Var.Q();
        if (Q instanceof yc3) {
            th = ((yc3) Q).c();
        } else if (Q instanceof av0) {
            th = ((av0) Q).a;
        } else if (!(Q instanceof e43)) {
            th = null;
        } else {
            e41.h(Q, "Cannot be cancelling child in this state: ");
            return null;
        }
        if (th instanceof CancellationException) {
            cancellationException = th;
        }
        if (cancellationException == null) {
            return new sc3("Parent job is ".concat(p0(Q)), th, ed3Var);
        }
        return cancellationException;
    }

    public final Object I(yc3 yc3Var, Object obj) {
        av0 av0Var;
        yc3 yc3Var2;
        Throwable th;
        Throwable K;
        f43 f43Var;
        ed3 ed3Var;
        yc3 yc3Var3;
        Throwable th2 = null;
        if (obj instanceof av0) {
            av0Var = (av0) obj;
        } else {
            av0Var = null;
        }
        if (av0Var != null) {
            th2 = av0Var.a;
        }
        synchronized (yc3Var) {
            try {
                yc3Var.d();
                ArrayList g = yc3Var.g(th2);
                K = K(yc3Var, g);
                if (K != null) {
                    try {
                        if (g.size() > 1) {
                            Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(g.size()));
                            int size = g.size();
                            int i = 0;
                            while (i < size) {
                                Object obj2 = g.get(i);
                                i++;
                                Throwable th3 = (Throwable) obj2;
                                if (th3 != K && th3 != K && !(th3 instanceof CancellationException) && newSetFromMap.add(th3)) {
                                    mb3.q(K, th3);
                                }
                            }
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        yc3Var2 = yc3Var;
                        throw th;
                    }
                }
            } catch (Throwable th5) {
                yc3Var2 = yc3Var;
                th = th5;
            }
        }
        if (K != null && K != th2) {
            obj = new av0(K, false);
        }
        if (K != null && (B(K) || R(K))) {
            obj.getClass();
            av0.b.compareAndSet((av0) obj, 0, 1);
        }
        i0(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = A;
        if (obj instanceof e43) {
            f43Var = new f43((e43) obj);
        } else {
            f43Var = obj;
        }
        while (true) {
            atomicReferenceFieldUpdater.getClass();
            Unsafe unsafe = v36.a;
            long j = R;
            ed3Var = this;
            yc3Var3 = yc3Var;
            if (!unsafe.compareAndSwapObject(ed3Var, j, yc3Var3, f43Var) && unsafe.getObjectVolatile(ed3Var, j) == yc3Var3) {
                this = ed3Var;
                yc3Var = yc3Var3;
            }
        }
        ed3Var.G(yc3Var3, obj);
        return obj;
    }

    public final Object J() {
        Object Q = Q();
        if (!(Q instanceof e43)) {
            if (!(Q instanceof av0)) {
                return fd3.a(Q);
            }
            throw ((av0) Q).a;
        }
        i.m("This job has not completed yet");
        return null;
    }

    public final Throwable K(yc3 yc3Var, ArrayList arrayList) {
        Object obj;
        Object obj2 = null;
        if (arrayList.isEmpty()) {
            if (!yc3Var.d()) {
                return null;
            }
            return new sc3(C(), null, this);
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
        if (th2 instanceof c67) {
            int size2 = arrayList.size();
            while (true) {
                if (i >= size2) {
                    break;
                }
                Object obj3 = arrayList.get(i);
                i++;
                Throwable th3 = (Throwable) obj3;
                if (th3 != th2 && (th3 instanceof c67)) {
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

    public boolean L() {
        return true;
    }

    public boolean M() {
        return this instanceof tu0;
    }

    @Override // defpackage.l61
    public final l61 N(l61 l61Var) {
        return jw2.y(this, l61Var);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [ky3, gg4] */
    public final gg4 O(e43 e43Var) {
        gg4 f = e43Var.f();
        if (f == null) {
            if (e43Var instanceof rt1) {
                return new ky3();
            }
            if (e43Var instanceof uc3) {
                l0((uc3) e43Var);
                return null;
            }
            e41.h(e43Var, "State should have list: ");
            return null;
        }
        return f;
    }

    public final hq0 P() {
        B.getClass();
        return (hq0) v36.a.getObjectVolatile(this, L);
    }

    public final Object Q() {
        A.getClass();
        return v36.a.getObjectVolatile(this, R);
    }

    public boolean R(Throwable th) {
        return false;
    }

    public final void T(rc3 rc3Var) {
        lg4 lg4Var = lg4.A;
        if (rc3Var == null) {
            n0(lg4Var);
            return;
        }
        rc3Var.start();
        hq0 r = rc3Var.r(this);
        n0(r);
        if (W()) {
            r.dispose();
            n0(lg4Var);
        }
    }

    @Override // defpackage.rc3
    public final m44 U() {
        dd3 dd3Var = dd3.d0;
        ge7.p(3, dd3Var);
        return new m44(this, dd3Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0074, code lost:
        return r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final il1 V(boolean z, uc3 uc3Var) {
        ed3 ed3Var;
        uc3 uc3Var2;
        lg4 lg4Var;
        av0 av0Var;
        boolean b;
        yc3 yc3Var;
        uc3Var.Z = this;
        loop0: while (true) {
            Object Q = this.Q();
            if (Q instanceof rt1) {
                rt1 rt1Var = (rt1) Q;
                if (rt1Var.A) {
                    while (true) {
                        A.getClass();
                        Unsafe unsafe = v36.a;
                        long j = R;
                        ed3Var = this;
                        uc3Var2 = uc3Var;
                        if (unsafe.compareAndSwapObject(ed3Var, j, Q, uc3Var2)) {
                            break loop0;
                        } else if (unsafe.getObjectVolatile(ed3Var, j) != Q) {
                            break;
                        } else {
                            this = ed3Var;
                            uc3Var = uc3Var2;
                        }
                    }
                } else {
                    ed3Var = this;
                    uc3Var2 = uc3Var;
                    ed3Var.k0(rt1Var);
                }
                this = ed3Var;
                uc3Var = uc3Var2;
            } else {
                ed3Var = this;
                uc3Var2 = uc3Var;
                boolean z2 = Q instanceof e43;
                lg4Var = lg4.A;
                Throwable th = null;
                if (z2) {
                    e43 e43Var = (e43) Q;
                    gg4 f = e43Var.f();
                    if (f == null) {
                        ed3Var.l0((uc3) Q);
                    } else {
                        if (uc3Var2.q()) {
                            if (e43Var instanceof yc3) {
                                yc3Var = (yc3) e43Var;
                            } else {
                                yc3Var = null;
                            }
                            if (yc3Var != null) {
                                th = yc3Var.c();
                            }
                            if (th == null) {
                                b = f.b(uc3Var2, 5);
                            } else if (z) {
                                uc3Var2.r(th);
                                return lg4Var;
                            }
                        } else {
                            b = f.b(uc3Var2, 1);
                        }
                        if (b) {
                            break;
                        }
                    }
                    this = ed3Var;
                    uc3Var = uc3Var2;
                } else if (z) {
                    Object Q2 = ed3Var.Q();
                    if (Q2 instanceof av0) {
                        av0Var = (av0) Q2;
                    } else {
                        av0Var = null;
                    }
                    if (av0Var != null) {
                        th = av0Var.a;
                    }
                    uc3Var2.r(th);
                }
            }
        }
        return lg4Var;
    }

    public final boolean W() {
        return !(Q() instanceof e43);
    }

    public boolean Y() {
        return this instanceof k50;
    }

    @Override // defpackage.l61
    public final j61 Z(k61 k61Var) {
        return jw2.p(this, k61Var);
    }

    @Override // defpackage.rc3
    public final il1 a0(qn2 qn2Var) {
        return V(true, new cc3(qn2Var));
    }

    public final boolean b0(Object obj) {
        Object s0;
        do {
            s0 = s0(Q(), obj);
            if (s0 == fd3.a) {
                return false;
            }
            if (s0 == fd3.b) {
                return true;
            }
        } while (s0 == fd3.c);
        d(s0);
        return true;
    }

    @Override // defpackage.rc3
    public final Object c0(s41 s41Var) {
        Object Q;
        jg7 jg7Var;
        do {
            Q = Q();
            boolean z = Q instanceof e43;
            jg7Var = jg7.a;
            if (!z) {
                yh2.o(s41Var.b());
                return jg7Var;
            }
        } while (o0(Q) < 0);
        rj0 rj0Var = new rj0(1, np2.V(s41Var));
        rj0Var.v();
        rj0Var.A(new kj0(yh2.y(this, true, new jm5(rj0Var)), 2));
        Object s = rj0Var.s();
        x61 x61Var = x61.COROUTINE_SUSPENDED;
        if (s != x61Var) {
            s = jg7Var;
        }
        if (s == x61Var) {
            return s;
        }
        return jg7Var;
    }

    public final Object d0(Object obj) {
        Object s0;
        av0 av0Var;
        do {
            s0 = s0(Q(), obj);
            if (s0 == fd3.a) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                Throwable th = null;
                if (obj instanceof av0) {
                    av0Var = (av0) obj;
                } else {
                    av0Var = null;
                }
                if (av0Var != null) {
                    th = av0Var.a;
                }
                throw new IllegalStateException(str, th);
            }
        } while (s0 == fd3.c);
        return s0;
    }

    @Override // defpackage.rc3
    public boolean e() {
        Object Q = Q();
        if ((Q instanceof e43) && ((e43) Q).e()) {
            return true;
        }
        return false;
    }

    @Override // defpackage.rc3
    public final il1 e0(boolean z, boolean z2, a0 a0Var) {
        uc3 cc3Var;
        if (z) {
            cc3Var = new bc3(a0Var);
        } else {
            cc3Var = new cc3(a0Var);
        }
        return V(z2, cc3Var);
    }

    public String f0() {
        return getClass().getSimpleName();
    }

    public void g(Object obj) {
        d(obj);
    }

    @Override // defpackage.j61
    public final k61 getKey() {
        return vs0.h0;
    }

    @Override // defpackage.rc3
    public void h(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new sc3(C(), null, this);
        }
        z(cancellationException);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Throwable, ug] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.RuntimeException] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r5v0, types: [ed3, java.lang.Object] */
    public final void h0(gg4 gg4Var, Throwable th) {
        gg4Var.b(new lw3(4), 4);
        Object j = gg4Var.j();
        j.getClass();
        ky3 ky3Var = (ky3) j;
        ?? r1 = 0;
        while (!ky3Var.equals(gg4Var)) {
            if ((ky3Var instanceof uc3) && ((uc3) ky3Var).q()) {
                try {
                    ((uc3) ky3Var).r(th);
                } catch (Throwable th2) {
                    if (r1 != 0) {
                        mb3.q(r1, th2);
                    } else {
                        r1 = new RuntimeException("Exception in completion handler " + ky3Var + " for " + ((Object) this), th2);
                    }
                }
            }
            ky3Var = ky3Var.k();
            r1 = r1;
        }
        if (r1 != 0) {
            S(r1);
        }
        B(th);
    }

    @Override // defpackage.rc3
    public final boolean isCancelled() {
        Object Q = Q();
        if (!(Q instanceof av0)) {
            if (!(Q instanceof yc3) || !((yc3) Q).d()) {
                return false;
            }
            return true;
        }
        return true;
    }

    public Object k() {
        return J();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [ky3, gg4] */
    public final void k0(rt1 rt1Var) {
        b43 b43Var;
        ?? ky3Var = new ky3();
        if (rt1Var.A) {
            b43Var = ky3Var;
        } else {
            b43Var = new b43(ky3Var);
        }
        while (true) {
            A.getClass();
            Unsafe unsafe = v36.a;
            long j = R;
            ed3 ed3Var = this;
            rt1 rt1Var2 = rt1Var;
            if (unsafe.compareAndSwapObject(ed3Var, j, rt1Var2, b43Var) || unsafe.getObjectVolatile(ed3Var, j) != rt1Var2) {
                return;
            }
            this = ed3Var;
            rt1Var = rt1Var2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [ky3, gg4] */
    public final void l0(uc3 uc3Var) {
        uc3Var.d(new ky3());
        ky3 k = uc3Var.k();
        Object obj = uc3Var;
        while (true) {
            A.getClass();
            Unsafe unsafe = v36.a;
            long j = R;
            ed3 ed3Var = this;
            Object obj2 = obj;
            if (unsafe.compareAndSwapObject(ed3Var, j, obj2, k) || unsafe.getObjectVolatile(ed3Var, j) != obj2) {
                return;
            }
            this = ed3Var;
            obj = obj2;
        }
    }

    public final void m0(uc3 uc3Var) {
        ed3 ed3Var;
        while (true) {
            Object Q = this.Q();
            if (Q instanceof uc3) {
                if (Q != uc3Var) {
                    return;
                }
                while (true) {
                    A.getClass();
                    Unsafe unsafe = v36.a;
                    long j = R;
                    ed3Var = this;
                    if (!unsafe.compareAndSwapObject(ed3Var, j, Q, fd3.g)) {
                        if (unsafe.getObjectVolatile(ed3Var, j) != Q) {
                            break;
                        }
                        this = ed3Var;
                    } else {
                        return;
                    }
                }
            } else if ((Q instanceof e43) && ((e43) Q).f() != null) {
                uc3Var.n();
                return;
            } else {
                return;
            }
            this = ed3Var;
        }
    }

    public final void n0(hq0 hq0Var) {
        B.getClass();
        v36.a.putObjectVolatile(this, L, hq0Var);
    }

    public final int o0(Object obj) {
        Unsafe unsafe;
        boolean z = obj instanceof rt1;
        long j = R;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = A;
        if (z) {
            if (((rt1) obj).A) {
                return 0;
            }
            while (true) {
                atomicReferenceFieldUpdater.getClass();
                Unsafe unsafe2 = v36.a;
                ed3 ed3Var = this;
                Object obj2 = obj;
                if (unsafe2.compareAndSwapObject(ed3Var, R, obj2, fd3.g)) {
                    ed3Var.j0();
                    return 1;
                } else if (unsafe2.getObjectVolatile(ed3Var, j) == obj2) {
                    this = ed3Var;
                    obj = obj2;
                } else {
                    return -1;
                }
            }
        } else {
            ed3 ed3Var2 = this;
            Object obj3 = obj;
            if (obj3 instanceof b43) {
                gg4 gg4Var = ((b43) obj3).A;
                do {
                    atomicReferenceFieldUpdater.getClass();
                    ed3 ed3Var3 = ed3Var2;
                    unsafe = v36.a;
                    Object obj4 = obj3;
                    boolean compareAndSwapObject = unsafe.compareAndSwapObject(ed3Var3, R, obj4, gg4Var);
                    ed3Var2 = ed3Var3;
                    obj3 = obj4;
                    if (compareAndSwapObject) {
                        ed3Var2.j0();
                        return 1;
                    }
                } while (unsafe.getObjectVolatile(ed3Var2, j) == obj3);
                return -1;
            }
            return 0;
        }
    }

    public final Object q(r41 r41Var) {
        Object Q;
        do {
            Q = Q();
            if (!(Q instanceof e43)) {
                if (!(Q instanceof av0)) {
                    return fd3.a(Q);
                }
                throw ((av0) Q).a;
            }
        } while (o0(Q) < 0);
        wc3 wc3Var = new wc3(np2.V(r41Var), this);
        wc3Var.v();
        wc3Var.A(new kj0(yh2.y(this, true, new im5(wc3Var)), 2));
        Object s = wc3Var.s();
        x61 x61Var = x61.COROUTINE_SUSPENDED;
        return s;
    }

    public final boolean q0(e43 e43Var, Object obj) {
        f43 f43Var;
        if (obj instanceof e43) {
            f43Var = new f43((e43) obj);
        } else {
            f43Var = obj;
        }
        while (true) {
            A.getClass();
            Unsafe unsafe = v36.a;
            long j = R;
            ed3 ed3Var = this;
            e43 e43Var2 = e43Var;
            if (unsafe.compareAndSwapObject(ed3Var, j, e43Var2, f43Var)) {
                ed3Var.i0(obj);
                ed3Var.G(e43Var2, obj);
                return true;
            } else if (unsafe.getObjectVolatile(ed3Var, j) != e43Var2) {
                return false;
            } else {
                this = ed3Var;
                e43Var = e43Var2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x007a, code lost:
        return r5;
     */
    @Override // defpackage.rc3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final hq0 r(ed3 ed3Var) {
        ed3 ed3Var2;
        av0 av0Var;
        av0 av0Var2;
        iq0 iq0Var = new iq0(ed3Var);
        iq0Var.Z = this;
        loop0: while (true) {
            Object Q = this.Q();
            if (Q instanceof rt1) {
                rt1 rt1Var = (rt1) Q;
                if (rt1Var.A) {
                    while (true) {
                        A.getClass();
                        Unsafe unsafe = v36.a;
                        long j = R;
                        ed3Var2 = this;
                        if (unsafe.compareAndSwapObject(ed3Var2, j, Q, iq0Var)) {
                            break loop0;
                        } else if (unsafe.getObjectVolatile(ed3Var2, j) != Q) {
                            break;
                        } else {
                            this = ed3Var2;
                        }
                    }
                } else {
                    ed3Var2 = this;
                    ed3Var2.k0(rt1Var);
                }
                this = ed3Var2;
            } else {
                ed3Var2 = this;
                boolean z = Q instanceof e43;
                lg4 lg4Var = lg4.A;
                Throwable th = null;
                if (z) {
                    gg4 f = ((e43) Q).f();
                    if (f == null) {
                        ed3Var2.l0((uc3) Q);
                        this = ed3Var2;
                    } else if (!f.b(iq0Var, 7)) {
                        boolean b = f.b(iq0Var, 3);
                        Object Q2 = ed3Var2.Q();
                        if (Q2 instanceof yc3) {
                            th = ((yc3) Q2).c();
                        } else {
                            if (Q2 instanceof av0) {
                                av0Var2 = (av0) Q2;
                            } else {
                                av0Var2 = null;
                            }
                            if (av0Var2 != null) {
                                th = av0Var2.a;
                            }
                        }
                        iq0Var.r(th);
                        if (b) {
                            break loop0;
                        }
                        return lg4Var;
                    }
                } else {
                    Object Q3 = ed3Var2.Q();
                    if (Q3 instanceof av0) {
                        av0Var = (av0) Q3;
                    } else {
                        av0Var = null;
                    }
                    if (av0Var != null) {
                        th = av0Var.a;
                    }
                    iq0Var.r(th);
                    return lg4Var;
                }
            }
        }
    }

    public final boolean r0(e43 e43Var, Throwable th) {
        gg4 O = O(e43Var);
        if (O != null) {
            yc3 yc3Var = new yc3(O, th);
            while (true) {
                A.getClass();
                Unsafe unsafe = v36.a;
                long j = R;
                ed3 ed3Var = this;
                e43 e43Var2 = e43Var;
                if (unsafe.compareAndSwapObject(ed3Var, j, e43Var2, yc3Var)) {
                    ed3Var.h0(O, th);
                    return true;
                } else if (unsafe.getObjectVolatile(ed3Var, j) != e43Var2) {
                    return false;
                } else {
                    this = ed3Var;
                    e43Var = e43Var2;
                }
            }
        } else {
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0038, code lost:
        if (r0 == defpackage.fd3.b) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0059, code lost:
        r0 = r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean s(Object obj) {
        gr1 gr1Var;
        gr1 gr1Var2 = fd3.a;
        if (M()) {
            do {
                Object Q = Q();
                if (Q instanceof e43) {
                    if (Q instanceof yc3) {
                        if (yc3.B.get((yc3) Q) == 1) {
                        }
                    }
                    gr1Var2 = s0(Q, new av0(H(obj), false));
                }
                gr1Var2 = fd3.a;
                break;
            } while (gr1Var2 == fd3.c);
        }
        if (gr1Var2 == fd3.a) {
            Throwable th = null;
            Throwable th2 = null;
            while (true) {
                Object Q2 = Q();
                if (Q2 instanceof yc3) {
                    synchronized (Q2) {
                        if (((yc3) Q2).b() == fd3.e) {
                            gr1Var = fd3.d;
                        } else {
                            boolean d = ((yc3) Q2).d();
                            if (obj != null || !d) {
                                if (th2 == null) {
                                    th2 = H(obj);
                                }
                                ((yc3) Q2).a(th2);
                            }
                            Throwable c = ((yc3) Q2).c();
                            if (!d) {
                                th = c;
                            }
                            if (th != null) {
                                h0(((yc3) Q2).A, th);
                            }
                            gr1Var = fd3.a;
                        }
                    }
                } else if (Q2 instanceof e43) {
                    if (th2 == null) {
                        th2 = H(obj);
                    }
                    e43 e43Var = (e43) Q2;
                    if (e43Var.e()) {
                        if (r0(e43Var, th2)) {
                            gr1Var = fd3.a;
                            break;
                        }
                    } else {
                        Object s0 = s0(Q2, new av0(th2, false));
                        if (s0 != fd3.a) {
                            if (s0 != fd3.c) {
                                gr1Var2 = s0;
                                break;
                            }
                        } else {
                            e41.h(Q2, "Cannot happen in ");
                            return false;
                        }
                    }
                } else {
                    gr1Var = fd3.d;
                    break;
                }
            }
        }
        if (gr1Var2 != fd3.a && gr1Var2 != fd3.b) {
            if (gr1Var2 == fd3.d) {
                return false;
            }
            d(gr1Var2);
            return true;
        }
        return true;
    }

    public final Object s0(Object obj, Object obj2) {
        yc3 yc3Var;
        boolean z;
        av0 av0Var;
        if (!(obj instanceof e43)) {
            return fd3.a;
        }
        if (((obj instanceof rt1) || (obj instanceof uc3)) && !(obj instanceof iq0) && !(obj2 instanceof av0)) {
            if (q0((e43) obj, obj2)) {
                return obj2;
            }
            return fd3.c;
        }
        e43 e43Var = (e43) obj;
        gg4 O = O(e43Var);
        if (O == null) {
            return fd3.c;
        }
        Throwable th = null;
        if (e43Var instanceof yc3) {
            yc3Var = (yc3) e43Var;
        } else {
            yc3Var = null;
        }
        if (yc3Var == null) {
            yc3Var = new yc3(O, null);
        }
        synchronized (yc3Var) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = yc3.B;
            if (atomicIntegerFieldUpdater.get(yc3Var) == 1) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return fd3.a;
            }
            atomicIntegerFieldUpdater.set(yc3Var, 1);
            if (yc3Var != e43Var) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = A;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, e43Var, yc3Var)) {
                    if (atomicReferenceFieldUpdater.get(this) != e43Var) {
                        return fd3.c;
                    }
                }
            }
            boolean d = yc3Var.d();
            if (obj2 instanceof av0) {
                av0Var = (av0) obj2;
            } else {
                av0Var = null;
            }
            if (av0Var != null) {
                yc3Var.a(av0Var.a);
            }
            Throwable c = yc3Var.c();
            if (!d) {
                th = c;
            }
            if (th != null) {
                h0(O, th);
            }
            iq0 g0 = g0(O);
            if (g0 != null && t0(yc3Var, g0, obj2)) {
                return fd3.b;
            }
            O.b(new lw3(2), 2);
            iq0 g02 = g0(O);
            if (g02 != null && t0(yc3Var, g02, obj2)) {
                return fd3.b;
            }
            return I(yc3Var, obj2);
        }
    }

    @Override // defpackage.rc3
    public final boolean start() {
        int o0;
        do {
            o0 = o0(Q());
            if (o0 == 0) {
                return false;
            }
        } while (o0 != 1);
        return true;
    }

    public final boolean t0(yc3 yc3Var, iq0 iq0Var, Object obj) {
        while (yh2.y(iq0Var.d0, false, new xc3(this, yc3Var, iq0Var, obj)) == lg4.A) {
            iq0Var = g0(iq0Var);
            if (iq0Var == null) {
                return false;
            }
        }
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(f0() + '{' + p0(Q()) + '}');
        sb.append('@');
        sb.append(nc1.P(this));
        return sb.toString();
    }

    @Override // defpackage.rc3
    public final CancellationException v() {
        Object Q = Q();
        CancellationException cancellationException = null;
        if (Q instanceof yc3) {
            Throwable c = ((yc3) Q).c();
            if (c != null) {
                String concat = getClass().getSimpleName().concat(" is cancelling");
                if (c instanceof CancellationException) {
                    cancellationException = (CancellationException) c;
                }
                if (cancellationException == null) {
                    return new sc3(concat, c, this);
                }
                return cancellationException;
            }
            e41.h(this, "Job is still new or active: ");
            return null;
        } else if (!(Q instanceof e43)) {
            if (Q instanceof av0) {
                Throwable th = ((av0) Q).a;
                if (th instanceof CancellationException) {
                    cancellationException = (CancellationException) th;
                }
                if (cancellationException == null) {
                    return new sc3(C(), th, this);
                }
                return cancellationException;
            }
            return new sc3(getClass().getSimpleName().concat(" has completed normally"), null, this);
        } else {
            e41.h(this, "Job is still new or active: ");
            return null;
        }
    }

    @Override // defpackage.l61
    public final Object x(eo2 eo2Var, Object obj) {
        return eo2Var.o(obj, this);
    }

    public void z(Throwable th) {
        s(th);
    }

    public void j0() {
    }

    public void S(ug ugVar) {
        throw ugVar;
    }

    public void d(Object obj) {
    }

    public void i0(Object obj) {
    }
}
