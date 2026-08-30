package n2;

import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class u1 extends v {

    /* renamed from: a  reason: collision with root package name */
    public final b4.a1 f10039a;

    /* renamed from: b  reason: collision with root package name */
    public final a4.n f10040b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f10041c;

    /* renamed from: d  reason: collision with root package name */
    public zc.y0 f10042d;

    /* renamed from: e  reason: collision with root package name */
    public Throwable f10043e;

    /* renamed from: f  reason: collision with root package name */
    public final ArrayList f10044f;

    /* renamed from: g  reason: collision with root package name */
    public Object f10045g;

    /* renamed from: h  reason: collision with root package name */
    public a1.n0 f10046h;

    /* renamed from: i  reason: collision with root package name */
    public final p2.b f10047i;

    /* renamed from: j  reason: collision with root package name */
    public final ArrayList f10048j;

    /* renamed from: k  reason: collision with root package name */
    public final ArrayList f10049k;

    /* renamed from: l  reason: collision with root package name */
    public final a1.m0 f10050l;
    public final jb.c m;

    /* renamed from: n  reason: collision with root package name */
    public final a1.m0 f10051n;

    /* renamed from: o  reason: collision with root package name */
    public final a1.m0 f10052o;

    /* renamed from: p  reason: collision with root package name */
    public ArrayList f10053p;

    /* renamed from: q  reason: collision with root package name */
    public LinkedHashSet f10054q;

    /* renamed from: r  reason: collision with root package name */
    public zc.h f10055r;

    /* renamed from: s  reason: collision with root package name */
    public l.i0 f10056s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f10057t;

    /* renamed from: u  reason: collision with root package name */
    public final cd.q1 f10058u;

    /* renamed from: v  reason: collision with root package name */
    public final p1.c1 f10059v;

    /* renamed from: w  reason: collision with root package name */
    public final zc.a1 f10060w;

    /* renamed from: x  reason: collision with root package name */
    public final cc.g f10061x;

    /* renamed from: y  reason: collision with root package name */
    public final e f10062y;

    /* renamed from: z  reason: collision with root package name */
    public static final cd.q1 f10038z = cd.q.c(t2.b.R);
    public static final AtomicReference A = new AtomicReference(Boolean.FALSE);

    public u1(cc.g gVar) {
        b4.a1 a1Var = new b4.a1(new q1(this, 0));
        this.f10039a = a1Var;
        this.f10040b = new a4.n(new q1(this, 1));
        this.f10041c = new Object();
        this.f10044f = new ArrayList();
        this.f10046h = new a1.n0();
        this.f10047i = new p2.b(new y[16]);
        this.f10048j = new ArrayList();
        this.f10049k = new ArrayList();
        this.f10050l = new a1.m0();
        this.m = new jb.c(18);
        this.f10051n = new a1.m0();
        this.f10052o = new a1.m0();
        this.f10058u = cd.q.c(r1.Inactive);
        this.f10059v = new p1.c1(10);
        zc.a1 a1Var2 = new zc.a1((zc.y0) gVar.t(zc.r.B));
        a1Var2.I(new mh.z(5, this));
        this.f10060w = a1Var2;
        this.f10061x = gVar.H(a1Var).H(a1Var2);
        this.f10062y = new e(9);
    }

    public static final void G(ArrayList arrayList, u1 u1Var, y yVar) {
        arrayList.clear();
        synchronized (u1Var.f10041c) {
            Iterator it = u1Var.f10049k.iterator();
            if (it.hasNext()) {
                ((v0) it.next()).getClass();
                throw null;
            }
        }
    }

    public static void w(z2.b bVar) {
        try {
            if (!(bVar.w() instanceof z2.g)) {
                return;
            }
            throw new IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.");
        } finally {
            bVar.c();
        }
    }

    public final boolean A() {
        if (this.f10047i.L == 0 && !z() && !B() && !this.f10050l.j()) {
            return false;
        }
        return true;
    }

    public final boolean B() {
        if (!this.f10057t && (((v2.a) ((a7.v) this.f10040b.L).L).get() & 134217727) > 0) {
            return true;
        }
        return false;
    }

    public final boolean C() {
        boolean z10;
        synchronized (this.f10041c) {
            if (!this.f10046h.h() && this.f10047i.L == 0 && !z()) {
                if (!B()) {
                    z10 = false;
                }
            }
            z10 = true;
        }
        return z10;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List, java.lang.Object] */
    public final List D() {
        List arrayList;
        ?? r02 = this.f10045g;
        if (r02 != 0) {
            return r02;
        }
        ArrayList arrayList2 = this.f10044f;
        if (arrayList2.isEmpty()) {
            arrayList = zb.q.A;
        } else {
            arrayList = new ArrayList(arrayList2);
        }
        this.f10045g = arrayList;
        return arrayList;
    }

    public final void E() {
        zc.g y10;
        synchronized (this.f10041c) {
            y10 = y();
            if (((r1) this.f10058u.getValue()).compareTo(r1.ShuttingDown) <= 0) {
                Throwable th2 = this.f10043e;
                CancellationException cancellationException = new CancellationException("Recomposer shutdown; frame clock awaiter will never resume");
                cancellationException.initCause(th2);
                throw cancellationException;
            }
        }
        if (y10 != null) {
            ((zc.h) y10).h(yb.y.f14813a);
        }
    }

    public final void F(y yVar) {
        synchronized (this.f10041c) {
            ArrayList arrayList = this.f10049k;
            if (arrayList.size() > 0) {
                ((v0) arrayList.get(0)).getClass();
                throw null;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x013a, code lost:
        r3 = r10.size();
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x013f, code lost:
        if (r4 >= r3) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0149, code lost:
        if (((yb.j) r10.get(r4)).B == null) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x014b, code lost:
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x014e, code lost:
        r3 = new java.util.ArrayList(r10.size());
        r4 = r10.size();
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x015c, code lost:
        if (r8 >= r4) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x015e, code lost:
        r11 = (yb.j) r10.get(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0166, code lost:
        if (r11.B != null) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0168, code lost:
        r11 = (n2.v0) r11.A;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x016f, code lost:
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0172, code lost:
        r4 = r17.f10041c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0174, code lost:
        monitor-enter(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0175, code lost:
        zb.l.L(r3, r17.f10049k);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x017a, code lost:
        monitor-exit(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x017b, code lost:
        r3 = new java.util.ArrayList(r10.size());
        r4 = r10.size();
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0189, code lost:
        if (r8 >= r4) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x018b, code lost:
        r11 = r10.get(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0194, code lost:
        if (((yb.j) r11).B == null) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0196, code lost:
        r3.add(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0199, code lost:
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x019c, code lost:
        r10 = r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List H(java.util.List r18, a1.n0 r19) {
        /*
            Method dump skipped, instructions count: 458
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n2.u1.H(java.util.List, a1.n0):java.util.List");
    }

    public final y I(y yVar, a1.n0 n0Var) {
        z2.b bVar;
        z2.b C;
        if (yVar.p0.F || yVar.f10081q0 == 3) {
            return null;
        }
        LinkedHashSet linkedHashSet = this.f10054q;
        if (linkedHashSet == null || !linkedHashSet.contains(yVar)) {
            mh.z zVar = new mh.z(4, yVar);
            he.g gVar = new he.g(11, yVar, n0Var);
            z2.f j2 = z2.l.j();
            if (j2 instanceof z2.b) {
                bVar = (z2.b) j2;
            } else {
                bVar = null;
            }
            if (bVar != null && (C = bVar.C(zVar, gVar)) != null) {
                try {
                    z2.f j10 = C.j();
                    if (n0Var != null && n0Var.h()) {
                        a3.e eVar = new a3.e(24, n0Var, yVar);
                        r rVar = yVar.p0;
                        if (rVar.F) {
                            t.a("Preparing a composition while composing is not supported");
                        }
                        rVar.F = true;
                        try {
                            eVar.b();
                            rVar.F = false;
                        } catch (Throwable th2) {
                            rVar.F = false;
                            throw th2;
                        }
                    }
                    boolean x9 = yVar.x();
                    z2.f.q(j10);
                    if (x9) {
                        return yVar;
                    }
                } finally {
                    w(C);
                }
            } else {
                a0.j.p("Cannot create a mutable snapshot of an read-only snapshot");
                return null;
            }
        }
        return null;
    }

    public final void J(Throwable th2, y yVar) {
        if (((Boolean) A.get()).booleanValue() && !(th2 instanceof k)) {
            synchronized (this.f10041c) {
                try {
                    Log.e("ComposeInternal", "Error was captured in composition while live edit was enabled.", th2);
                    this.f10048j.clear();
                    this.f10047i.g();
                    this.f10046h = new a1.n0();
                    this.f10049k.clear();
                    this.f10050l.a();
                    this.f10051n.a();
                    this.f10056s = new l.i0(9, th2);
                    if (yVar != null) {
                        L(yVar);
                    }
                    y();
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            return;
        }
        synchronized (this.f10041c) {
            Log.e("ComposeInternal", "Error was captured in composition.", th2);
            l.i0 i0Var = this.f10056s;
            if (i0Var == null) {
                this.f10056s = new l.i0(9, th2);
            } else {
                throw ((Throwable) i0Var.B);
            }
        }
        throw th2;
    }

    public final boolean K() {
        boolean A2;
        synchronized (this.f10041c) {
            if (this.f10046h.g()) {
                return A();
            }
            List D = D();
            p2.d<Object> dVar = new p2.d(this.f10046h);
            this.f10046h = new a1.n0();
            try {
                int size = D.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((y) D.get(i2)).y(dVar);
                    if (((r1) this.f10058u.getValue()).compareTo(r1.ShuttingDown) <= 0) {
                        break;
                    }
                }
                synchronized (this.f10041c) {
                    if (y() == null) {
                        A2 = A();
                    } else {
                        throw new IllegalStateException("called outside of runRecomposeAndApplyChanges");
                    }
                }
                return A2;
            } catch (Throwable th2) {
                synchronized (this.f10041c) {
                    a1.n0 n0Var = this.f10046h;
                    n0Var.getClass();
                    for (Object obj : dVar) {
                        n0Var.k(obj);
                    }
                    throw th2;
                }
            }
        }
    }

    public final void L(y yVar) {
        ArrayList arrayList = this.f10053p;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.f10053p = arrayList;
        }
        if (!arrayList.contains(yVar)) {
            arrayList.add(yVar);
        }
        if (this.f10044f.remove(yVar)) {
            this.f10045g = null;
        }
    }

    @Override // n2.v
    public final void a(y yVar, mc.p pVar) {
        r1 r1Var;
        boolean z10;
        z2.b bVar;
        z2.b C;
        boolean z11 = yVar.p0.F;
        synchronized (this.f10041c) {
            r1Var = r1.ShuttingDown;
            z10 = true;
            if (((r1) this.f10058u.getValue()).compareTo(r1Var) > 0) {
                z10 = true ^ D().contains(yVar);
            }
        }
        try {
            mh.z zVar = new mh.z(4, yVar);
            he.g gVar = new he.g(11, yVar, null);
            z2.f j2 = z2.l.j();
            if (j2 instanceof z2.b) {
                bVar = (z2.b) j2;
            } else {
                bVar = null;
            }
            if (bVar != null && (C = bVar.C(zVar, gVar)) != null) {
                z2.f j10 = C.j();
                try {
                    yVar.j(pVar);
                    w(C);
                    synchronized (this.f10041c) {
                        if (((r1) this.f10058u.getValue()).compareTo(r1Var) > 0 && !D().contains(yVar)) {
                            this.f10044f.add(yVar);
                            this.f10045g = null;
                        }
                    }
                    if (!z11) {
                        z2.l.j().m();
                    }
                    try {
                        F(yVar);
                        try {
                            yVar.d();
                            yVar.f();
                            if (!z11) {
                                z2.l.j().m();
                                return;
                            }
                            return;
                        } catch (Throwable th2) {
                            J(th2, null);
                            return;
                        }
                    } catch (Throwable th3) {
                        J(th3, yVar);
                        return;
                    }
                } finally {
                    z2.f.q(j10);
                }
            }
            throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
        } catch (Throwable th4) {
            if (z10) {
                synchronized (this.f10041c) {
                }
            }
            J(th4, yVar);
        }
    }

    @Override // n2.v
    public final a1.n0 b(y yVar, c2 c2Var, mc.p pVar) {
        p1.c1 c1Var = this.f10059v;
        try {
            c2 c2Var2 = yVar.f10075j0;
            yVar.f10075j0 = c2Var;
            a(yVar, pVar);
            a1.n0 n0Var = (a1.n0) c1Var.d();
            if (n0Var == null) {
                n0Var = a1.v0.f110a;
                n0Var.getClass();
            }
            yVar.f10075j0 = c2Var2;
            return n0Var;
        } finally {
            c1Var.r(null);
        }
    }

    @Override // n2.v
    public final boolean d() {
        return ((Boolean) A.get()).booleanValue();
    }

    @Override // n2.v
    public final boolean e() {
        return false;
    }

    @Override // n2.v
    public final boolean f() {
        return false;
    }

    @Override // n2.v
    public final long g() {
        return 1000;
    }

    @Override // n2.v
    public final u h() {
        return null;
    }

    @Override // n2.v
    public final cc.g j() {
        return this.f10061x;
    }

    @Override // n2.v
    public final boolean k() {
        return false;
    }

    @Override // n2.v
    public final void l(y yVar) {
        zc.g gVar;
        synchronized (this.f10041c) {
            if (!this.f10047i.h(yVar)) {
                this.f10047i.b(yVar);
                gVar = y();
            } else {
                gVar = null;
            }
        }
        if (gVar != null) {
            ((zc.h) gVar).h(yb.y.f14813a);
        }
    }

    @Override // n2.v
    public final u0 m(v0 v0Var) {
        u0 u0Var;
        synchronized (this.f10041c) {
            u0Var = (u0) this.f10051n.k(v0Var);
        }
        return u0Var;
    }

    @Override // n2.v
    public final a1.n0 n(y yVar, c2 c2Var, a1.n0 n0Var) {
        p1.c1 c1Var = this.f10059v;
        try {
            K();
            yVar.y(new p2.d(n0Var));
            c2 c2Var2 = yVar.f10075j0;
            yVar.f10075j0 = c2Var;
            y I = I(yVar, null);
            if (I != null) {
                F(yVar);
                I.d();
                I.f();
            }
            a1.n0 n0Var2 = (a1.n0) c1Var.d();
            if (n0Var2 == null) {
                n0Var2 = a1.v0.f110a;
                n0Var2.getClass();
            }
            yVar.f10075j0 = c2Var2;
            return n0Var2;
        } finally {
            c1Var.r(null);
        }
    }

    @Override // n2.v
    public final void q(p1 p1Var) {
        p1.c1 c1Var = this.f10059v;
        a1.n0 n0Var = (a1.n0) c1Var.d();
        if (n0Var == null) {
            a1.n0 n0Var2 = a1.v0.f110a;
            n0Var = new a1.n0();
            c1Var.r(n0Var);
        }
        n0Var.a(p1Var);
    }

    @Override // n2.v
    public final void r(y yVar) {
        synchronized (this.f10041c) {
            try {
                LinkedHashSet linkedHashSet = this.f10054q;
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                    this.f10054q = linkedHashSet;
                }
                linkedHashSet.add(yVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [n2.y0, v2.b, java.lang.Object] */
    @Override // n2.v
    public final f s(a4.m0 m0Var) {
        a4.n nVar = this.f10040b;
        ?? obj = new Object();
        obj.f10082a = m0Var;
        return ((a7.v) nVar.L).f(obj, (a3.e) nVar.R);
    }

    @Override // n2.v
    public final void v(y yVar) {
        synchronized (this.f10041c) {
            if (this.f10044f.remove(yVar)) {
                this.f10045g = null;
            }
            this.f10047i.j(yVar);
            this.f10048j.remove(yVar);
        }
    }

    public final void x() {
        synchronized (this.f10041c) {
            if (((r1) this.f10058u.getValue()).compareTo(r1.Idle) >= 0) {
                this.f10058u.j(r1.ShuttingDown);
            }
        }
        this.f10060w.i(null);
    }

    public final zc.g y() {
        r1 r1Var;
        cd.q1 q1Var = this.f10058u;
        int compareTo = ((r1) q1Var.getValue()).compareTo(r1.ShuttingDown);
        ArrayList arrayList = this.f10049k;
        ArrayList arrayList2 = this.f10048j;
        p2.b bVar = this.f10047i;
        if (compareTo <= 0) {
            List D = D();
            int size = D.size();
            for (int i2 = 0; i2 < size; i2++) {
                y yVar = (y) D.get(i2);
            }
            this.f10044f.clear();
            this.f10045g = zb.q.A;
            this.f10046h = new a1.n0();
            bVar.g();
            arrayList2.clear();
            arrayList.clear();
            this.f10053p = null;
            zc.h hVar = this.f10055r;
            if (hVar != null) {
                hVar.n(null);
            }
            this.f10055r = null;
            this.f10056s = null;
            return null;
        }
        if (this.f10056s != null) {
            r1Var = r1.Inactive;
        } else if (this.f10042d == null) {
            this.f10046h = new a1.n0();
            bVar.g();
            if (!z() && !B()) {
                r1Var = r1.Inactive;
            } else {
                r1Var = r1.InactivePendingWork;
            }
        } else if (bVar.L == 0 && !this.f10046h.h() && arrayList2.isEmpty() && arrayList.isEmpty() && !z() && !B() && !this.f10050l.j()) {
            r1Var = r1.Idle;
        } else {
            r1Var = r1.PendingWork;
        }
        q1Var.j(r1Var);
        if (r1Var != r1.PendingWork) {
            return null;
        }
        zc.h hVar2 = this.f10055r;
        this.f10055r = null;
        return hVar2;
    }

    public final boolean z() {
        if (!this.f10057t && (((v2.a) ((a7.v) this.f10039a.L).L).get() & 134217727) > 0) {
            return true;
        }
        return false;
    }

    @Override // n2.v
    public final void o(Set set) {
    }
}
