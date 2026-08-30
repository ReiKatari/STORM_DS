package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: s55  reason: default package */
/* loaded from: classes.dex */
public final class s55 extends dv0 {
    public final im a;
    public final os b;
    public final Object c;
    public c63 d;
    public Throwable e;
    public final ArrayList f;
    public List g;
    public e24 h;
    public final o24 i;
    public final ArrayList j;
    public final ArrayList k;
    public final d24 l;
    public final ci3 m;
    public final d24 n;
    public final d24 o;
    public ArrayList p;
    public e24 q;
    public ih0 r;
    public final ee6 s;
    public boolean t;
    public final ee6 u;
    public final n85 v;
    public final e63 w;
    public final e31 x;
    public final jo1 y;
    public static final ee6 z = fe6.a(cn4.R);
    public static final AtomicReference A = new AtomicReference(Boolean.FALSE);

    public s55(e31 e31Var) {
        im imVar = new im(new n55(this, 0));
        this.a = imVar;
        this.b = new os(new n55(this, 1));
        this.c = new Object();
        this.f = new ArrayList();
        this.h = new e24();
        this.i = new o24(new iv0[16]);
        this.j = new ArrayList();
        this.k = new ArrayList();
        this.l = new d24();
        this.m = new ci3(5);
        this.n = new d24();
        this.o = new d24();
        this.s = fe6.a(null);
        this.u = fe6.a(p55.Inactive);
        this.v = new n85(8, (byte) 0);
        e63 e63Var = new e63((c63) e31Var.I(k45.d0));
        e63Var.R(new kb2(28, this));
        this.w = e63Var;
        this.x = e31Var.C(imVar).C(e63Var);
        this.y = new jo1(19);
    }

    public static final void G(ArrayList arrayList, s55 s55Var, iv0 iv0Var) {
        arrayList.clear();
        synchronized (s55Var.c) {
            Iterator it = s55Var.k.iterator();
            if (it.hasNext()) {
                ((j04) it.next()).getClass();
                throw null;
            }
        }
    }

    public static void w(i24 i24Var) {
        try {
            if (!(i24Var.w() instanceof ha6)) {
                return;
            }
            throw new IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.");
        } finally {
            i24Var.c();
        }
    }

    public final boolean A() {
        if (this.i.L == 0 && !z() && !B() && !this.l.j()) {
            return false;
        }
        return true;
    }

    public final boolean B() {
        if (!this.t && (((dw) ((r9) this.b.L).c).get() & 134217727) > 0) {
            return true;
        }
        return false;
    }

    public final boolean C() {
        boolean z2;
        synchronized (this.c) {
            if (!this.h.h() && this.i.L == 0 && !z()) {
                if (!B()) {
                    z2 = false;
                }
            }
            z2 = true;
        }
        return z2;
    }

    public final List D() {
        List arrayList;
        List list = this.g;
        if (list != null) {
            return list;
        }
        ArrayList arrayList2 = this.f;
        if (arrayList2.isEmpty()) {
            arrayList = pp1.A;
        } else {
            arrayList = new ArrayList(arrayList2);
        }
        this.g = arrayList;
        return arrayList;
    }

    public final void E() {
        hh0 y;
        synchronized (this.c) {
            y = y();
            if (((p55) this.u.getValue()).compareTo(p55.ShuttingDown) <= 0) {
                Throwable th = this.e;
                CancellationException cancellationException = new CancellationException("Recomposer shutdown; frame clock awaiter will never resume");
                cancellationException.initCause(th);
                throw cancellationException;
            }
        }
        if (y != null) {
            ((ih0) y).k(o27.a);
        }
    }

    public final void F(iv0 iv0Var) {
        synchronized (this.c) {
            ArrayList arrayList = this.k;
            if (arrayList.size() > 0) {
                ((j04) arrayList.get(0)).getClass();
                throw null;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x0139, code lost:
        r3 = r11.size();
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x013e, code lost:
        if (r4 >= r3) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0148, code lost:
        if (((defpackage.ti4) r11.get(r4)).B == null) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x014a, code lost:
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x014d, code lost:
        r3 = new java.util.ArrayList(r11.size());
        r4 = r11.size();
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x015b, code lost:
        if (r9 >= r4) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x015d, code lost:
        r12 = (defpackage.ti4) r11.get(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0165, code lost:
        if (r12.B != null) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0167, code lost:
        r12 = (defpackage.j04) r12.A;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x016e, code lost:
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0171, code lost:
        r4 = r18.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0173, code lost:
        monitor-enter(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0174, code lost:
        defpackage.tq0.D0(r18.k, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0179, code lost:
        monitor-exit(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x017a, code lost:
        r3 = new java.util.ArrayList(r11.size());
        r4 = r11.size();
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0188, code lost:
        if (r9 >= r4) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x018a, code lost:
        r12 = r11.get(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0193, code lost:
        if (((defpackage.ti4) r12).B == null) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0195, code lost:
        r3.add(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0198, code lost:
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x019b, code lost:
        r11 = r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List H(java.util.List r19, defpackage.e24 r20) {
        /*
            Method dump skipped, instructions count: 456
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s55.H(java.util.List, e24):java.util.List");
    }

    public final iv0 I(iv0 iv0Var, e24 e24Var) {
        i24 i24Var;
        i24 C;
        if (iv0Var.q0.F || iv0Var.r0 == 3) {
            return null;
        }
        e24 e24Var2 = this.q;
        if (e24Var2 == null || !e24Var2.c(iv0Var)) {
            kb2 kb2Var = new kb2(27, iv0Var);
            zr4 zr4Var = new zr4(3, iv0Var, e24Var);
            ga6 j = ma6.j();
            if (j instanceof i24) {
                i24Var = (i24) j;
            } else {
                i24Var = null;
            }
            if (i24Var != null && (C = i24Var.C(kb2Var, zr4Var)) != null) {
                try {
                    ga6 j2 = C.j();
                    if (e24Var != null && e24Var.h()) {
                        jd2 jd2Var = new jd2(18, e24Var, iv0Var);
                        sk2 sk2Var = iv0Var.q0;
                        if (sk2Var.F) {
                            xu0.a("Preparing a composition while composing is not supported");
                        }
                        sk2Var.F = true;
                        try {
                            jd2Var.c();
                            sk2Var.F = false;
                        } catch (Throwable th) {
                            sk2Var.F = false;
                            throw th;
                        }
                    }
                    boolean w = iv0Var.w();
                    ga6.q(j2);
                    if (w) {
                        return iv0Var;
                    }
                } finally {
                    w(C);
                }
            } else {
                i.n("Cannot create a mutable snapshot of an read-only snapshot");
            }
        }
        return null;
    }

    public final void J(Throwable th, iv0 iv0Var) {
        if (((Boolean) A.get()).booleanValue() && !(th instanceof fu0)) {
            synchronized (this.c) {
                try {
                    Log.e("ComposeInternal", "Error was captured in composition while live edit was enabled.", th);
                    this.j.clear();
                    this.i.h();
                    this.h = new e24();
                    this.k.clear();
                    this.l.a();
                    this.n.a();
                    ee6 ee6Var = this.s;
                    o55 o55Var = new o55(th);
                    ee6Var.getClass();
                    ee6Var.l(null, o55Var);
                    if (iv0Var != null) {
                        L(iv0Var);
                    }
                    if (y() != null) {
                        xu0.a("expected to go to inactive state due to composition error");
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return;
        }
        synchronized (this.c) {
            Log.e("ComposeInternal", "Error was captured in composition.", th);
            o55 o55Var2 = (o55) this.s.getValue();
            if (o55Var2 == null) {
                ee6 ee6Var2 = this.s;
                o55 o55Var3 = new o55(th);
                ee6Var2.getClass();
                ee6Var2.l(null, o55Var3);
            } else {
                throw o55Var2.a;
            }
        }
        throw th;
    }

    public final boolean K() {
        boolean A2;
        synchronized (this.c) {
            if (this.h.g()) {
                return A();
            }
            List D = D();
            yu5<Object> yu5Var = new yu5(this.h);
            this.h = new e24();
            try {
                int size = D.size();
                for (int i = 0; i < size; i++) {
                    ((iv0) D.get(i)).x(yu5Var);
                    if (((p55) this.u.getValue()).compareTo(p55.ShuttingDown) <= 0) {
                        break;
                    }
                }
                synchronized (this.c) {
                    if (y() == null) {
                        A2 = A();
                    } else {
                        throw new IllegalStateException("called outside of runRecomposeAndApplyChanges");
                    }
                }
                return A2;
            } catch (Throwable th) {
                synchronized (this.c) {
                    e24 e24Var = this.h;
                    e24Var.getClass();
                    for (Object obj : yu5Var) {
                        e24Var.k(obj);
                    }
                    throw th;
                }
            }
        }
    }

    public final void L(iv0 iv0Var) {
        ArrayList arrayList = this.p;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.p = arrayList;
        }
        if (!arrayList.contains(iv0Var)) {
            arrayList.add(iv0Var);
        }
        if (this.f.remove(iv0Var)) {
            this.g = null;
        }
    }

    @Override // defpackage.dv0
    public final void a(iv0 iv0Var, aj2 aj2Var) {
        p55 p55Var;
        boolean z2;
        i24 i24Var;
        i24 C;
        boolean z3 = iv0Var.q0.F;
        synchronized (this.c) {
            p55Var = p55.ShuttingDown;
            z2 = true;
            if (((p55) this.u.getValue()).compareTo(p55Var) > 0) {
                z2 = true ^ D().contains(iv0Var);
            }
        }
        try {
            kb2 kb2Var = new kb2(27, iv0Var);
            zr4 zr4Var = new zr4(3, iv0Var, (Object) null);
            ga6 j = ma6.j();
            if (j instanceof i24) {
                i24Var = (i24) j;
            } else {
                i24Var = null;
            }
            if (i24Var != null && (C = i24Var.C(kb2Var, zr4Var)) != null) {
                ga6 j2 = C.j();
                try {
                    iv0Var.j(aj2Var);
                    w(C);
                    synchronized (this.c) {
                        if (((p55) this.u.getValue()).compareTo(p55Var) > 0 && !D().contains(iv0Var)) {
                            this.f.add(iv0Var);
                            this.g = null;
                        }
                    }
                    if (!z3) {
                        ma6.j().m();
                    }
                    try {
                        F(iv0Var);
                        try {
                            iv0Var.d();
                            iv0Var.f();
                            if (!z3) {
                                ma6.j().m();
                                return;
                            }
                            return;
                        } catch (Throwable th) {
                            J(th, null);
                            return;
                        }
                    } catch (Throwable th2) {
                        J(th2, iv0Var);
                        return;
                    }
                } finally {
                    ga6.q(j2);
                }
            }
            throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
        } catch (Throwable th3) {
            if (z2) {
                synchronized (this.c) {
                }
            }
            J(th3, iv0Var);
        }
    }

    @Override // defpackage.dv0
    public final e24 b(iv0 iv0Var, x56 x56Var, aj2 aj2Var) {
        n85 n85Var = this.v;
        try {
            x56 x56Var2 = iv0Var.k0;
            iv0Var.k0 = x56Var;
            a(iv0Var, aj2Var);
            e24 e24Var = (e24) n85Var.d();
            if (e24Var == null) {
                e24Var = xu5.a;
                e24Var.getClass();
            }
            iv0Var.k0 = x56Var2;
            return e24Var;
        } finally {
            n85Var.u(null);
        }
    }

    @Override // defpackage.dv0
    public final boolean d() {
        return ((Boolean) A.get()).booleanValue();
    }

    @Override // defpackage.dv0
    public final boolean e() {
        return false;
    }

    @Override // defpackage.dv0
    public final boolean f() {
        return false;
    }

    @Override // defpackage.dv0
    public final long g() {
        return 1000L;
    }

    @Override // defpackage.dv0
    public final cv0 h() {
        return null;
    }

    @Override // defpackage.dv0
    public final e31 j() {
        return this.x;
    }

    @Override // defpackage.dv0
    public final boolean k() {
        return false;
    }

    @Override // defpackage.dv0
    public final void l(iv0 iv0Var) {
        hh0 hh0Var;
        synchronized (this.c) {
            if (!this.i.i(iv0Var)) {
                this.i.b(iv0Var);
                hh0Var = y();
            } else {
                hh0Var = null;
            }
        }
        if (hh0Var != null) {
            ((ih0) hh0Var).k(o27.a);
        }
    }

    @Override // defpackage.dv0
    public final i04 m(j04 j04Var) {
        i04 i04Var;
        synchronized (this.c) {
            i04Var = (i04) this.n.k(j04Var);
        }
        return i04Var;
    }

    @Override // defpackage.dv0
    public final e24 n(iv0 iv0Var, x56 x56Var, e24 e24Var) {
        n85 n85Var = this.v;
        try {
            K();
            iv0Var.x(new yu5(e24Var));
            x56 x56Var2 = iv0Var.k0;
            iv0Var.k0 = x56Var;
            iv0 I = I(iv0Var, null);
            if (I != null) {
                F(iv0Var);
                I.d();
                I.f();
            }
            e24 e24Var2 = (e24) n85Var.d();
            if (e24Var2 == null) {
                e24Var2 = xu5.a;
                e24Var2.getClass();
            }
            iv0Var.k0 = x56Var2;
            return e24Var2;
        } finally {
            n85Var.u(null);
        }
    }

    @Override // defpackage.dv0
    public final void q(m55 m55Var) {
        n85 n85Var = this.v;
        e24 e24Var = (e24) n85Var.d();
        if (e24Var == null) {
            e24 e24Var2 = xu5.a;
            e24Var = new e24();
            n85Var.u(e24Var);
        }
        e24Var.a(m55Var);
    }

    @Override // defpackage.dv0
    public final void r(iv0 iv0Var) {
        synchronized (this.c) {
            try {
                e24 e24Var = this.q;
                if (e24Var == null) {
                    e24 e24Var2 = xu5.a;
                    e24Var = new e24();
                    this.q = e24Var;
                }
                e24Var.a(iv0Var);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [ey, z64, java.lang.Object] */
    @Override // defpackage.dv0
    public final kh0 s(dj djVar) {
        os osVar = this.b;
        ?? obj = new Object();
        obj.a = djVar;
        return ((r9) osVar.L).i(obj, (jd2) osVar.R);
    }

    @Override // defpackage.dv0
    public final void v(iv0 iv0Var) {
        synchronized (this.c) {
            if (this.f.remove(iv0Var)) {
                this.g = null;
            }
            this.i.k(iv0Var);
            this.j.remove(iv0Var);
        }
    }

    public final void x() {
        synchronized (this.c) {
            if (((p55) this.u.getValue()).compareTo(p55.Idle) >= 0) {
                this.u.k(p55.ShuttingDown);
            }
        }
        this.w.i(null);
    }

    public final hh0 y() {
        p55 p55Var;
        ee6 ee6Var = this.u;
        int compareTo = ((p55) ee6Var.getValue()).compareTo(p55.ShuttingDown);
        ee6 ee6Var2 = this.s;
        ArrayList arrayList = this.k;
        ArrayList arrayList2 = this.j;
        o24 o24Var = this.i;
        if (compareTo <= 0) {
            List D = D();
            int size = D.size();
            for (int i = 0; i < size; i++) {
                iv0 iv0Var = (iv0) D.get(i);
            }
            this.f.clear();
            this.g = pp1.A;
            this.h = new e24();
            o24Var.h();
            arrayList2.clear();
            arrayList.clear();
            this.p = null;
            ih0 ih0Var = this.r;
            if (ih0Var != null) {
                ih0Var.r(null);
            }
            this.r = null;
            ee6Var2.k(null);
            return null;
        }
        if (ee6Var2.getValue() != null) {
            p55Var = p55.Inactive;
        } else if (this.d == null) {
            this.h = new e24();
            o24Var.h();
            if (!z() && !B()) {
                p55Var = p55.Inactive;
            } else {
                p55Var = p55.InactivePendingWork;
            }
        } else if (o24Var.L == 0 && !this.h.h() && arrayList2.isEmpty() && arrayList.isEmpty() && !z() && !B() && !this.l.j()) {
            p55Var = p55.Idle;
        } else {
            p55Var = p55.PendingWork;
        }
        ee6Var.k(p55Var);
        if (p55Var != p55.PendingWork) {
            return null;
        }
        ih0 ih0Var2 = this.r;
        this.r = null;
        return ih0Var2;
    }

    public final boolean z() {
        if (!this.t && (((dw) ((r9) this.a.L).c).get() & 134217727) > 0) {
            return true;
        }
        return false;
    }

    @Override // defpackage.dv0
    public final void o(Set set) {
    }
}
