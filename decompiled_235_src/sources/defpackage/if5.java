package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: if5  reason: default package */
/* loaded from: classes.dex */
public final class if5 extends zx0 {
    public final um a;
    public final m44 b;
    public final Object c;
    public rc3 d;
    public Throwable e;
    public final ArrayList f;
    public List g;
    public ka4 h;
    public final ua4 i;
    public final ArrayList j;
    public final ArrayList k;
    public final ja4 l;
    public final ap3 m;
    public final ja4 n;
    public final ja4 o;
    public ArrayList p;
    public ka4 q;
    public rj0 r;
    public final tp6 s;
    public boolean t;
    public final tp6 u;
    public final m44 v;
    public final tc3 w;
    public final l61 x;
    public final q61 y;
    public static final tp6 z = up6.a(hw4.R);
    public static final AtomicReference A = new AtomicReference(Boolean.FALSE);

    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, q61] */
    public if5(l61 l61Var) {
        um umVar = new um(new df5(this, 0));
        this.a = umVar;
        this.b = new m44(new df5(this, 1));
        this.c = new Object();
        this.f = new ArrayList();
        this.h = new ka4();
        this.i = new ua4(new ey0[16]);
        this.j = new ArrayList();
        this.k = new ArrayList();
        this.l = new ja4();
        this.m = new ap3(7);
        this.n = new ja4();
        this.o = new ja4();
        this.s = up6.a(null);
        this.u = up6.a(ff5.Inactive);
        this.v = new m44(19, (byte) 0);
        tc3 tc3Var = new tc3((rc3) l61Var.Z(vs0.h0));
        tc3Var.a0(new bg2(this, 26));
        this.w = tc3Var;
        this.x = l61Var.N(umVar).N(tc3Var);
        this.y = new Object();
    }

    public static final void G(ArrayList arrayList, if5 if5Var, ey0 ey0Var) {
        arrayList.clear();
        synchronized (if5Var.c) {
            Iterator it = if5Var.k.iterator();
            if (it.hasNext()) {
                ((o84) it.next()).getClass();
                throw null;
            }
        }
    }

    public static void w(oa4 oa4Var) {
        try {
            if (!(oa4Var.w() instanceof wl6)) {
                return;
            }
            throw new IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.");
        } finally {
            oa4Var.c();
        }
    }

    public final boolean A() {
        if (this.i.L == 0 && !z() && !B() && !this.l.j()) {
            return false;
        }
        return true;
    }

    public final boolean B() {
        if (!this.t && (((vw) ((s9) this.b.L).c).get() & 134217727) > 0) {
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
            arrayList = yt1.A;
        } else {
            arrayList = new ArrayList(arrayList2);
        }
        this.g = arrayList;
        return arrayList;
    }

    public final void E() {
        qj0 y;
        synchronized (this.c) {
            y = y();
            if (((ff5) this.u.getValue()).compareTo(ff5.ShuttingDown) <= 0) {
                Throwable th = this.e;
                CancellationException cancellationException = new CancellationException("Recomposer shutdown; frame clock awaiter will never resume");
                cancellationException.initCause(th);
                throw cancellationException;
            }
        }
        if (y != null) {
            ((rj0) y).i(jg7.a);
        }
    }

    public final void F(ey0 ey0Var) {
        synchronized (this.c) {
            ArrayList arrayList = this.k;
            if (arrayList.size() > 0) {
                ((o84) arrayList.get(0)).getClass();
                throw null;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x013a, code lost:
        r3 = r11.size();
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x013f, code lost:
        if (r4 >= r3) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0149, code lost:
        if (((defpackage.vr4) r11.get(r4)).B == null) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x014b, code lost:
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x014e, code lost:
        r3 = new java.util.ArrayList(r11.size());
        r4 = r11.size();
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x015c, code lost:
        if (r9 >= r4) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x015e, code lost:
        r12 = (defpackage.vr4) r11.get(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0166, code lost:
        if (r12.B != null) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0168, code lost:
        r12 = (defpackage.o84) r12.A;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x016f, code lost:
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0172, code lost:
        r4 = r18.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0174, code lost:
        monitor-enter(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0175, code lost:
        defpackage.gt0.A0(r18.k, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x017a, code lost:
        monitor-exit(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x017b, code lost:
        r3 = new java.util.ArrayList(r11.size());
        r4 = r11.size();
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0189, code lost:
        if (r9 >= r4) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x018b, code lost:
        r12 = r11.get(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0194, code lost:
        if (((defpackage.vr4) r12).B == null) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0196, code lost:
        r3.add(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0199, code lost:
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x019c, code lost:
        r11 = r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List H(List list, ka4 ka4Var) {
        oa4 oa4Var;
        oa4 C;
        ArrayList arrayList;
        HashMap hashMap = new HashMap(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object obj = list.get(i);
            ((o84) obj).getClass();
            Object obj2 = hashMap.get(null);
            if (obj2 == null) {
                obj2 = new ArrayList();
                hashMap.put(null, obj2);
            }
            ((ArrayList) obj2).add(obj);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            ey0 ey0Var = (ey0) entry.getKey();
            List list2 = (List) entry.getValue();
            if (ey0Var.r0.F) {
                tx0.a("Check failed");
            }
            bg2 bg2Var = new bg2(ey0Var, 25);
            qk4 qk4Var = new qk4(8, ey0Var, ka4Var);
            vl6 j = bm6.j();
            if (j instanceof oa4) {
                oa4Var = (oa4) j;
            } else {
                oa4Var = null;
            }
            if (oa4Var != null && (C = oa4Var.C(bg2Var, qk4Var)) != null) {
                try {
                    vl6 j2 = C.j();
                    synchronized (this.c) {
                        try {
                            arrayList = new ArrayList(list2.size());
                            int size2 = list2.size();
                            for (int i2 = 0; i2 < size2; i2++) {
                                o84 o84Var = (o84) list2.get(i2);
                                ja4 ja4Var = this.l;
                                o84Var.getClass();
                                Object a = g94.a(ja4Var);
                                o84 o84Var2 = (o84) a;
                                arrayList.add(new vr4(o84Var, a));
                            }
                            int size3 = arrayList.size();
                            int i3 = 0;
                            while (true) {
                                if (i3 >= size3) {
                                    break;
                                }
                                vr4 vr4Var = (vr4) arrayList.get(i3);
                                if (vr4Var.B == null) {
                                    ap3 ap3Var = this.m;
                                    ((o84) vr4Var.A).getClass();
                                    if (((ja4) ap3Var.B).b(null)) {
                                        ArrayList arrayList2 = new ArrayList(arrayList.size());
                                        int size4 = arrayList.size();
                                        for (int i4 = 0; i4 < size4; i4++) {
                                            vr4 vr4Var2 = (vr4) arrayList.get(i4);
                                            if (vr4Var2.B == null) {
                                                ap3 ap3Var2 = this.m;
                                                ((o84) vr4Var2.A).getClass();
                                                ja4 ja4Var2 = (ja4) ap3Var2.B;
                                                wd4 wd4Var = (wd4) g94.a(ja4Var2);
                                                if (ja4Var2.i()) {
                                                    ((ja4) ap3Var2.L).a();
                                                }
                                            }
                                            arrayList2.add(vr4Var2);
                                        }
                                        arrayList = arrayList2;
                                    }
                                }
                                i3++;
                            }
                        } finally {
                        }
                    }
                    int size5 = arrayList.size();
                    int i5 = 0;
                    while (true) {
                        if (i5 >= size5) {
                            break;
                        }
                        if (((vr4) arrayList.get(i5)).B != null) {
                            break;
                        }
                        i5++;
                    }
                    ey0Var.r(arrayList);
                    vl6.q(j2);
                } finally {
                    w(C);
                }
            } else {
                i.m("Cannot create a mutable snapshot of an read-only snapshot");
                return null;
            }
        }
        return gt0.k1(hashMap.keySet());
    }

    public final ey0 I(ey0 ey0Var, ka4 ka4Var) {
        oa4 oa4Var;
        oa4 C;
        if (ey0Var.r0.F || ey0Var.s0 == 3) {
            return null;
        }
        ka4 ka4Var2 = this.q;
        if (ka4Var2 == null || !ka4Var2.c(ey0Var)) {
            bg2 bg2Var = new bg2(ey0Var, 25);
            qk4 qk4Var = new qk4(8, ey0Var, ka4Var);
            vl6 j = bm6.j();
            if (j instanceof oa4) {
                oa4Var = (oa4) j;
            } else {
                oa4Var = null;
            }
            if (oa4Var != null && (C = oa4Var.C(bg2Var, qk4Var)) != null) {
                try {
                    vl6 j2 = C.j();
                    if (ka4Var != null && ka4Var.h()) {
                        ci2 ci2Var = new ci2(19, ka4Var, ey0Var);
                        xq2 xq2Var = ey0Var.r0;
                        if (xq2Var.F) {
                            tx0.a("Preparing a composition while composing is not supported");
                        }
                        xq2Var.F = true;
                        try {
                            ci2Var.c();
                            xq2Var.F = false;
                        } catch (Throwable th) {
                            xq2Var.F = false;
                            throw th;
                        }
                    }
                    boolean w = ey0Var.w();
                    vl6.q(j2);
                    if (w) {
                        return ey0Var;
                    }
                } finally {
                    w(C);
                }
            } else {
                i.m("Cannot create a mutable snapshot of an read-only snapshot");
            }
        }
        return null;
    }

    public final void J(Throwable th, ey0 ey0Var) {
        if (((Boolean) A.get()).booleanValue() && !(th instanceof bx0)) {
            synchronized (this.c) {
                try {
                    Log.e("ComposeInternal", "Error was captured in composition while live edit was enabled.", th);
                    this.j.clear();
                    this.i.g();
                    this.h = new ka4();
                    this.k.clear();
                    this.l.a();
                    this.n.a();
                    tp6 tp6Var = this.s;
                    ef5 ef5Var = new ef5(th);
                    tp6Var.getClass();
                    tp6Var.m(null, ef5Var);
                    if (ey0Var != null) {
                        L(ey0Var);
                    }
                    if (y() != null) {
                        tx0.a("expected to go to inactive state due to composition error");
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return;
        }
        synchronized (this.c) {
            Log.e("ComposeInternal", "Error was captured in composition.", th);
            ef5 ef5Var2 = (ef5) this.s.getValue();
            if (ef5Var2 == null) {
                tp6 tp6Var2 = this.s;
                ef5 ef5Var3 = new ef5(th);
                tp6Var2.getClass();
                tp6Var2.m(null, ef5Var3);
            } else {
                throw ef5Var2.a;
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
            d66<Object> d66Var = new d66(this.h);
            this.h = new ka4();
            try {
                int size = D.size();
                for (int i = 0; i < size; i++) {
                    ((ey0) D.get(i)).x(d66Var);
                    if (((ff5) this.u.getValue()).compareTo(ff5.ShuttingDown) <= 0) {
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
                    ka4 ka4Var = this.h;
                    ka4Var.getClass();
                    for (Object obj : d66Var) {
                        ka4Var.k(obj);
                    }
                    throw th;
                }
            }
        }
    }

    public final void L(ey0 ey0Var) {
        ArrayList arrayList = this.p;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.p = arrayList;
        }
        if (!arrayList.contains(ey0Var)) {
            arrayList.add(ey0Var);
        }
        if (this.f.remove(ey0Var)) {
            this.g = null;
        }
    }

    @Override // defpackage.zx0
    public final void a(ey0 ey0Var, eo2 eo2Var) {
        ff5 ff5Var;
        boolean z2;
        oa4 oa4Var;
        oa4 C;
        boolean z3 = ey0Var.r0.F;
        synchronized (this.c) {
            ff5Var = ff5.ShuttingDown;
            z2 = true;
            if (((ff5) this.u.getValue()).compareTo(ff5Var) > 0) {
                z2 = true ^ D().contains(ey0Var);
            }
        }
        try {
            bg2 bg2Var = new bg2(ey0Var, 25);
            qk4 qk4Var = new qk4(8, ey0Var, (Object) null);
            vl6 j = bm6.j();
            if (j instanceof oa4) {
                oa4Var = (oa4) j;
            } else {
                oa4Var = null;
            }
            if (oa4Var != null && (C = oa4Var.C(bg2Var, qk4Var)) != null) {
                vl6 j2 = C.j();
                try {
                    ey0Var.j(eo2Var);
                    w(C);
                    synchronized (this.c) {
                        if (((ff5) this.u.getValue()).compareTo(ff5Var) > 0 && !D().contains(ey0Var)) {
                            this.f.add(ey0Var);
                            this.g = null;
                        }
                    }
                    if (!z3) {
                        bm6.j().m();
                    }
                    try {
                        F(ey0Var);
                        try {
                            ey0Var.d();
                            ey0Var.f();
                            if (!z3) {
                                bm6.j().m();
                                return;
                            }
                            return;
                        } catch (Throwable th) {
                            J(th, null);
                            return;
                        }
                    } catch (Throwable th2) {
                        J(th2, ey0Var);
                        return;
                    }
                } finally {
                    vl6.q(j2);
                }
            }
            throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
        } catch (Throwable th3) {
            if (z2) {
                synchronized (this.c) {
                }
            }
            J(th3, ey0Var);
        }
    }

    @Override // defpackage.zx0
    public final ka4 b(ey0 ey0Var, kh6 kh6Var, eo2 eo2Var) {
        m44 m44Var = this.v;
        try {
            kh6 kh6Var2 = ey0Var.l0;
            ey0Var.l0 = kh6Var;
            a(ey0Var, eo2Var);
            ka4 ka4Var = (ka4) m44Var.f();
            if (ka4Var == null) {
                ka4Var = c66.a;
                ka4Var.getClass();
            }
            ey0Var.l0 = kh6Var2;
            return ka4Var;
        } finally {
            m44Var.F(null);
        }
    }

    @Override // defpackage.zx0
    public final boolean d() {
        return ((Boolean) A.get()).booleanValue();
    }

    @Override // defpackage.zx0
    public final boolean e() {
        return false;
    }

    @Override // defpackage.zx0
    public final boolean f() {
        return false;
    }

    @Override // defpackage.zx0
    public final long g() {
        return 1000L;
    }

    @Override // defpackage.zx0
    public final yx0 h() {
        return null;
    }

    @Override // defpackage.zx0
    public final l61 j() {
        return this.x;
    }

    @Override // defpackage.zx0
    public final boolean k() {
        return false;
    }

    @Override // defpackage.zx0
    public final void l(ey0 ey0Var) {
        qj0 qj0Var;
        synchronized (this.c) {
            if (!this.i.h(ey0Var)) {
                this.i.b(ey0Var);
                qj0Var = y();
            } else {
                qj0Var = null;
            }
        }
        if (qj0Var != null) {
            ((rj0) qj0Var).i(jg7.a);
        }
    }

    @Override // defpackage.zx0
    public final n84 m(o84 o84Var) {
        n84 n84Var;
        synchronized (this.c) {
            n84Var = (n84) this.n.k(o84Var);
        }
        return n84Var;
    }

    @Override // defpackage.zx0
    public final ka4 n(ey0 ey0Var, kh6 kh6Var, ka4 ka4Var) {
        m44 m44Var = this.v;
        try {
            K();
            ey0Var.x(new d66(ka4Var));
            kh6 kh6Var2 = ey0Var.l0;
            ey0Var.l0 = kh6Var;
            ey0 I = I(ey0Var, null);
            if (I != null) {
                F(ey0Var);
                I.d();
                I.f();
            }
            ka4 ka4Var2 = (ka4) m44Var.f();
            if (ka4Var2 == null) {
                ka4Var2 = c66.a;
                ka4Var2.getClass();
            }
            ey0Var.l0 = kh6Var2;
            return ka4Var2;
        } finally {
            m44Var.F(null);
        }
    }

    @Override // defpackage.zx0
    public final void q(cf5 cf5Var) {
        m44 m44Var = this.v;
        ka4 ka4Var = (ka4) m44Var.f();
        if (ka4Var == null) {
            ka4 ka4Var2 = c66.a;
            ka4Var = new ka4();
            m44Var.F(ka4Var);
        }
        ka4Var.a(cf5Var);
    }

    @Override // defpackage.zx0
    public final void r(ey0 ey0Var) {
        synchronized (this.c) {
            try {
                ka4 ka4Var = this.q;
                if (ka4Var == null) {
                    ka4 ka4Var2 = c66.a;
                    ka4Var = new ka4();
                    this.q = ka4Var;
                }
                ka4Var.a(ey0Var);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [vz, java.lang.Object, of4] */
    @Override // defpackage.zx0
    public final tj0 s(pj pjVar) {
        m44 m44Var = this.b;
        ?? obj = new Object();
        obj.a = pjVar;
        return ((s9) m44Var.L).i(obj, (ci2) m44Var.R);
    }

    @Override // defpackage.zx0
    public final void v(ey0 ey0Var) {
        synchronized (this.c) {
            if (this.f.remove(ey0Var)) {
                this.g = null;
            }
            this.i.j(ey0Var);
            this.j.remove(ey0Var);
        }
    }

    public final void x() {
        synchronized (this.c) {
            if (((ff5) this.u.getValue()).compareTo(ff5.Idle) >= 0) {
                this.u.l(ff5.ShuttingDown);
            }
        }
        this.w.h(null);
    }

    public final qj0 y() {
        ff5 ff5Var;
        tp6 tp6Var = this.u;
        int compareTo = ((ff5) tp6Var.getValue()).compareTo(ff5.ShuttingDown);
        tp6 tp6Var2 = this.s;
        ArrayList arrayList = this.k;
        ArrayList arrayList2 = this.j;
        ua4 ua4Var = this.i;
        if (compareTo <= 0) {
            List D = D();
            int size = D.size();
            for (int i = 0; i < size; i++) {
                ey0 ey0Var = (ey0) D.get(i);
            }
            this.f.clear();
            this.g = yt1.A;
            this.h = new ka4();
            ua4Var.g();
            arrayList2.clear();
            arrayList.clear();
            this.p = null;
            rj0 rj0Var = this.r;
            if (rj0Var != null) {
                rj0Var.w(null);
            }
            this.r = null;
            tp6Var2.l(null);
            return null;
        }
        if (tp6Var2.getValue() != null) {
            ff5Var = ff5.Inactive;
        } else if (this.d == null) {
            this.h = new ka4();
            ua4Var.g();
            if (!z() && !B()) {
                ff5Var = ff5.Inactive;
            } else {
                ff5Var = ff5.InactivePendingWork;
            }
        } else if (ua4Var.L == 0 && !this.h.h() && arrayList2.isEmpty() && arrayList.isEmpty() && !z() && !B() && !this.l.j()) {
            ff5Var = ff5.Idle;
        } else {
            ff5Var = ff5.PendingWork;
        }
        tp6Var.l(ff5Var);
        if (ff5Var != ff5.PendingWork) {
            return null;
        }
        rj0 rj0Var2 = this.r;
        this.r = null;
        return rj0Var2;
    }

    public final boolean z() {
        if (!this.t && (((vw) ((s9) this.a.L).c).get() & 134217727) > 0) {
            return true;
        }
        return false;
    }

    @Override // defpackage.zx0
    public final void o(Set set) {
    }
}
