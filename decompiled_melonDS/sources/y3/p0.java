package y3;

import a4.a2;
import android.os.Handler;
import java.util.List;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class p0 implements n2.h {
    public final a4.o0 A;
    public n2.v B;
    public s1 L;
    public int R;
    public int X;
    public final a1.m0 Y;
    public final a1.m0 Z;

    /* renamed from: b0  reason: collision with root package name */
    public final j0 f14719b0;

    /* renamed from: c0  reason: collision with root package name */
    public final g0 f14720c0;

    /* renamed from: d0  reason: collision with root package name */
    public final a1.m0 f14721d0;

    /* renamed from: e0  reason: collision with root package name */
    public final a1.a1 f14722e0;

    /* renamed from: f0  reason: collision with root package name */
    public final a1.m0 f14723f0;

    /* renamed from: g0  reason: collision with root package name */
    public final p2.b f14724g0;

    /* renamed from: h0  reason: collision with root package name */
    public int f14725h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f14726i0;

    /* renamed from: j0  reason: collision with root package name */
    public final String f14727j0;

    public p0(a4.o0 o0Var, s1 s1Var) {
        this.A = o0Var;
        this.L = s1Var;
        long[] jArr = a1.u0.f103a;
        this.Y = new a1.m0();
        this.Z = new a1.m0();
        this.f14719b0 = new j0(this);
        this.f14720c0 = new g0(this);
        this.f14721d0 = new a1.m0();
        this.f14722e0 = new a1.a1();
        this.f14723f0 = new a1.m0();
        this.f14724g0 = new p2.b(new Object[16]);
        this.f14727j0 = "Asking for intrinsic measurements of SubcomposeLayout layouts is not supported. This includes components that are built on top of SubcomposeLayout, such as lazy lists, BoxWithConstraints, TabRow, etc. To mitigate this:\n- if intrinsic measurements are used to achieve 'match parent' sizing, consider replacing the parent of the component with a custom layout which controls the order in which children are measured, making intrinsic measurement not needed\n- adding a size modifier to the component, in order to fast return the queried intrinsic measurement.";
    }

    public static final void c(p0 p0Var, Object obj) {
        a4.o0 o0Var = p0Var.A;
        p0Var.h();
        a4.o0 o0Var2 = (a4.o0) p0Var.f14721d0.k(obj);
        if (o0Var2 != null) {
            if (p0Var.f14726i0 <= 0) {
                x3.a.c("No pre-composed items to dispose");
            }
            int i2 = ((p2.b) ((a1.f0) o0Var.o()).B).i(o0Var2);
            if (i2 < ((p2.b) ((a1.f0) o0Var.o()).B).L - p0Var.f14726i0) {
                x3.a.c("Item is not in pre-composed item range");
            }
            p0Var.f14725h0++;
            p0Var.f14726i0--;
            h0 h0Var = (h0) p0Var.Y.g(o0Var2);
            if (h0Var != null) {
                e(h0Var);
            }
            int i10 = (((p2.b) ((a1.f0) o0Var.o()).B).L - p0Var.f14726i0) - p0Var.f14725h0;
            p0Var.j(i2, i10);
            p0Var.g(i10);
        }
        if (p0Var.f14724g0.h(obj)) {
            a4.o0.X(o0Var, true, 6);
        }
    }

    public static void e(h0 h0Var) {
        a1.n0 n0Var;
        n2.i1 i1Var = h0Var.f14686f;
        if (i1Var != null) {
            i1Var.f9936h.set(n2.j1.Cancelled);
            v2.i iVar = i1Var.f9939k;
            if (iVar.f13617d.h()) {
                n0Var = iVar.f13617d;
                a1.n0 n0Var2 = a1.v0.f110a;
                iVar.f13617d = new a1.n0();
                iVar.f13616c.g();
            } else {
                n0Var = null;
            }
            iVar.b();
            n2.y yVar = i1Var.f9929a;
            yVar.f10076k0 = null;
            if (n0Var != null) {
                yVar.f10080o0.f13624k = n0Var;
                yVar.f10081q0 = 2;
            }
            h0Var.f14686f = null;
            n2.y yVar2 = h0Var.f14683c;
            if (yVar2 != null) {
                yVar2.m();
            }
            h0Var.f14683c = null;
        }
    }

    @Override // n2.h
    public final void a() {
        n2.y yVar;
        a4.o0 o0Var = this.A;
        o0Var.f288l0 = true;
        a1.m0 m0Var = this.Y;
        Object[] objArr = m0Var.f69c;
        long[] jArr = m0Var.f67a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j2 = jArr[i2];
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i10 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i11 = 0; i11 < i10; i11++) {
                        if ((255 & j2) < 128 && (yVar = ((h0) objArr[(i2 << 3) + i11]).f14683c) != null) {
                            yVar.m();
                        }
                        j2 >>= 8;
                    }
                    if (i10 != 8) {
                        break;
                    }
                }
                if (i2 == length) {
                    break;
                }
                i2++;
            }
        }
        o0Var.R();
        o0Var.f288l0 = false;
        m0Var.a();
        this.Z.a();
        this.f14726i0 = 0;
        this.f14725h0 = 0;
        this.f14721d0.a();
        h();
    }

    @Override // n2.h
    public final void b() {
        i(true);
    }

    public final void d(h0 h0Var, boolean z10) {
        mc.l lVar;
        n2.i1 i1Var = h0Var.f14686f;
        if (i1Var != null) {
            z2.f e6 = z2.q.e();
            if (e6 != null) {
                lVar = e6.e();
            } else {
                lVar = null;
            }
            z2.f h2 = z2.q.h(e6);
            try {
                a4.o0 o0Var = this.A;
                o0Var.f288l0 = true;
                if (z10) {
                    while (!i1Var.c()) {
                        i1Var.e(new wa.b(12));
                    }
                }
                i1Var.a();
                h0Var.f14686f = null;
                o0Var.f288l0 = false;
            } finally {
                z2.q.k(e6, h2, lVar);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [y3.o1, java.lang.Object] */
    public final o1 f(Object obj) {
        if (!this.A.H()) {
            return new Object();
        }
        return new n0(this, obj);
    }

    public final void g(int i2) {
        boolean z10;
        mc.l lVar;
        boolean z11 = false;
        this.f14725h0 = 0;
        List o5 = this.A.o();
        a1.f0 f0Var = (a1.f0) o5;
        int i10 = (((p2.b) f0Var.B).L - this.f14726i0) - 1;
        if (i2 <= i10) {
            this.f14722e0.clear();
            if (i2 <= i10) {
                int i11 = i2;
                while (true) {
                    Object g10 = this.Y.g((a4.o0) f0Var.get(i11));
                    g10.getClass();
                    ((a1.i0) this.f14722e0.B).a(((h0) g10).f14681a);
                    if (i11 == i10) {
                        break;
                    }
                    i11++;
                }
            }
            this.L.i(this.f14722e0);
            z2.f e6 = z2.q.e();
            if (e6 != null) {
                lVar = e6.e();
            } else {
                lVar = null;
            }
            z2.f h2 = z2.q.h(e6);
            z10 = false;
            while (i10 >= i2) {
                try {
                    a4.o0 o0Var = (a4.o0) ((a1.f0) o5).get(i10);
                    Object g11 = this.Y.g(o0Var);
                    g11.getClass();
                    h0 h0Var = (h0) g11;
                    Object obj = h0Var.f14681a;
                    if (((a1.i0) this.f14722e0.B).c(obj)) {
                        this.f14725h0++;
                        if (((Boolean) h0Var.f14687g.getValue()).booleanValue()) {
                            a4.t0 t0Var = o0Var.B0;
                            a4.i1 i1Var = t0Var.f348p;
                            a4.k0 k0Var = a4.k0.NotUsed;
                            i1Var.f225f0 = k0Var;
                            a4.c1 c1Var = t0Var.f349q;
                            if (c1Var != null) {
                                c1Var.f163d0 = k0Var;
                            }
                            l(h0Var, false);
                            if (h0Var.f14688h) {
                                z10 = true;
                            }
                        }
                    } else {
                        a4.o0 o0Var2 = this.A;
                        o0Var2.f288l0 = true;
                        this.Y.k(o0Var);
                        n2.y yVar = h0Var.f14683c;
                        if (yVar != null) {
                            yVar.m();
                        }
                        this.A.S(i10, 1);
                        o0Var2.f288l0 = false;
                    }
                    this.Z.k(obj);
                    i10--;
                } catch (Throwable th2) {
                    z2.q.k(e6, h2, lVar);
                    throw th2;
                }
            }
            z2.q.k(e6, h2, lVar);
        } else {
            z10 = false;
        }
        if (z10) {
            synchronized (z2.l.f14919c) {
                a1.n0 n0Var = z2.l.f14926j.f14888h;
                if (n0Var != null) {
                    if (n0Var.h()) {
                        z11 = true;
                    }
                }
            }
            if (z11) {
                z2.l.a();
            }
        }
        h();
    }

    public final void h() {
        int i2 = ((p2.b) ((a1.f0) this.A.o()).B).L;
        a1.m0 m0Var = this.Y;
        if (m0Var.f71e != i2) {
            x3.a.a("Inconsistency between the count of nodes tracked by the state (" + m0Var.f71e + ") and the children count on the SubcomposeLayout (" + i2 + "). Are you trying to use the state of the disposed SubcomposeLayout?");
        }
        if ((i2 - this.f14725h0) - this.f14726i0 < 0) {
            StringBuilder i10 = kc.a.i("Incorrect state. Total children ", i2, ". Reusable children ");
            i10.append(this.f14725h0);
            i10.append(". Precomposed children ");
            i10.append(this.f14726i0);
            x3.a.a(i10.toString());
        }
        a1.m0 m0Var2 = this.f14721d0;
        if (m0Var2.f71e == this.f14726i0) {
            return;
        }
        x3.a.a("Incorrect state. Precomposed children " + this.f14726i0 + ". Map size " + m0Var2.f71e);
    }

    public final void i(boolean z10) {
        mc.l lVar;
        this.f14726i0 = 0;
        this.f14721d0.a();
        List o5 = this.A.o();
        int i2 = ((p2.b) ((a1.f0) o5).B).L;
        if (this.f14725h0 != i2) {
            this.f14725h0 = i2;
            z2.f e6 = z2.q.e();
            if (e6 != null) {
                lVar = e6.e();
            } else {
                lVar = null;
            }
            z2.f h2 = z2.q.h(e6);
            for (int i10 = 0; i10 < i2; i10++) {
                try {
                    a4.o0 o0Var = (a4.o0) ((a1.f0) o5).get(i10);
                    h0 h0Var = (h0) this.Y.g(o0Var);
                    if (h0Var != null && ((Boolean) h0Var.f14687g.getValue()).booleanValue()) {
                        a4.t0 t0Var = o0Var.B0;
                        a4.i1 i1Var = t0Var.f348p;
                        a4.k0 k0Var = a4.k0.NotUsed;
                        i1Var.f225f0 = k0Var;
                        a4.c1 c1Var = t0Var.f349q;
                        if (c1Var != null) {
                            c1Var.f163d0 = k0Var;
                        }
                        l(h0Var, z10);
                        h0Var.f14681a = c0.f14667a;
                    }
                } catch (Throwable th2) {
                    z2.q.k(e6, h2, lVar);
                    throw th2;
                }
            }
            z2.q.k(e6, h2, lVar);
            this.Z.a();
        }
        h();
    }

    public final void j(int i2, int i10) {
        a4.o0 o0Var = this.A;
        o0Var.f288l0 = true;
        o0Var.L(i2, i10, 1);
        o0Var.f288l0 = false;
    }

    public final void k(Object obj, mc.p pVar, boolean z10) {
        a4.o0 o0Var = this.A;
        if (o0Var.H()) {
            h();
            if (!this.Z.c(obj)) {
                this.f14723f0.k(obj);
                a1.m0 m0Var = this.f14721d0;
                Object g10 = m0Var.g(obj);
                a4.o0 o0Var2 = g10;
                if (g10 == null) {
                    a4.o0 n10 = n(obj);
                    if (n10 != null) {
                        j(((p2.b) ((a1.f0) o0Var.o()).B).i(n10), ((p2.b) ((a1.f0) o0Var.o()).B).L);
                        this.f14726i0++;
                    } else {
                        int i2 = ((p2.b) ((a1.f0) o0Var.o()).B).L;
                        a4.o0 o0Var3 = new a4.o0(2);
                        o0Var.f288l0 = true;
                        o0Var.B(i2, o0Var3);
                        o0Var.f288l0 = false;
                        this.f14726i0++;
                        n10 = o0Var3;
                    }
                    m0Var.m(obj, n10);
                    o0Var2 = n10;
                }
                m(o0Var2, obj, z10, pVar);
            }
        }
    }

    public final void l(h0 h0Var, boolean z10) {
        n2.y yVar;
        if (!z10 && h0Var.f14688h) {
            h0Var.f14687g.setValue(Boolean.FALSE);
        } else {
            h0Var.f14687g = n2.s.w(Boolean.FALSE);
        }
        if (h0Var.f14686f != null) {
            e(h0Var);
        } else if (z10) {
            n2.y yVar2 = h0Var.f14683c;
            if (yVar2 != null) {
                yVar2.l();
            }
        } else {
            a2 outOfFrameExecutor = ((b4.x) a4.s0.a(this.A)).getOutOfFrameExecutor();
            if (outOfFrameExecutor != null) {
                a4.m0 m0Var = new a4.m0(17, h0Var);
                b4.x xVar = (b4.x) outOfFrameExecutor;
                zb.j jVar = xVar.f1962e0;
                boolean isEmpty = jVar.isEmpty();
                jVar.addLast(m0Var);
                if (isEmpty) {
                    Handler handler = xVar.getHandler();
                    if (handler != null) {
                        handler.postAtFrontOfQueue(xVar.f1964f0);
                    } else {
                        a0.j.h("schedule is called when outOfFrameExecutor is not available (view is detached)");
                    }
                }
            } else if (!h0Var.f14688h && (yVar = h0Var.f14683c) != null) {
                yVar.l();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00bf A[Catch: all -> 0x008d, TryCatch #0 {all -> 0x008d, blocks: (B:44:0x0076, B:47:0x0082, B:59:0x00ad, B:61:0x00bf, B:64:0x00d4, B:66:0x00d8, B:72:0x010e, B:67:0x00e5, B:68:0x00f0, B:70:0x00f4, B:71:0x010b, B:62:0x00c2, B:56:0x0092, B:58:0x00a0, B:75:0x0118, B:76:0x0122), top: B:79:0x0076 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00c2 A[Catch: all -> 0x008d, TryCatch #0 {all -> 0x008d, blocks: (B:44:0x0076, B:47:0x0082, B:59:0x00ad, B:61:0x00bf, B:64:0x00d4, B:66:0x00d8, B:72:0x010e, B:67:0x00e5, B:68:0x00f0, B:70:0x00f4, B:71:0x010b, B:62:0x00c2, B:56:0x0092, B:58:0x00a0, B:75:0x0118, B:76:0x0122), top: B:79:0x0076 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00d4 A[Catch: all -> 0x008d, TryCatch #0 {all -> 0x008d, blocks: (B:44:0x0076, B:47:0x0082, B:59:0x00ad, B:61:0x00bf, B:64:0x00d4, B:66:0x00d8, B:72:0x010e, B:67:0x00e5, B:68:0x00f0, B:70:0x00f4, B:71:0x010b, B:62:0x00c2, B:56:0x0092, B:58:0x00a0, B:75:0x0118, B:76:0x0122), top: B:79:0x0076 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00f0 A[Catch: all -> 0x008d, TryCatch #0 {all -> 0x008d, blocks: (B:44:0x0076, B:47:0x0082, B:59:0x00ad, B:61:0x00bf, B:64:0x00d4, B:66:0x00d8, B:72:0x010e, B:67:0x00e5, B:68:0x00f0, B:70:0x00f4, B:71:0x010b, B:62:0x00c2, B:56:0x0092, B:58:0x00a0, B:75:0x0118, B:76:0x0122), top: B:79:0x0076 }] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, y3.h0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m(a4.o0 r10, java.lang.Object r11, boolean r12, mc.p r13) {
        /*
            Method dump skipped, instructions count: 295
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y3.p0.m(a4.o0, java.lang.Object, boolean, mc.p):void");
    }

    public final a4.o0 n(Object obj) {
        a1.m0 m0Var;
        int i2;
        if (this.f14725h0 != 0) {
            a1.f0 f0Var = (a1.f0) this.A.o();
            int i10 = ((p2.b) f0Var.B).L - this.f14726i0;
            int i11 = i10 - this.f14725h0;
            int i12 = i10 - 1;
            int i13 = i12;
            while (true) {
                m0Var = this.Y;
                if (i13 >= i11) {
                    Object g10 = m0Var.g((a4.o0) f0Var.get(i13));
                    g10.getClass();
                    if (nc.k.a(((h0) g10).f14681a, obj)) {
                        i2 = i13;
                        break;
                    }
                    i13--;
                } else {
                    i2 = -1;
                    break;
                }
            }
            if (i2 == -1) {
                while (i12 >= i11) {
                    Object g11 = m0Var.g((a4.o0) f0Var.get(i12));
                    g11.getClass();
                    h0 h0Var = (h0) g11;
                    Object obj2 = h0Var.f14681a;
                    if (obj2 != c0.f14667a && !this.L.o(obj, obj2)) {
                        i12--;
                    } else {
                        h0Var.f14681a = obj;
                        i13 = i12;
                        i2 = i13;
                        break;
                    }
                }
                i13 = i12;
            }
            if (i2 == -1) {
                return null;
            }
            if (i13 != i11) {
                j(i13, i11);
            }
            this.f14725h0--;
            a4.o0 o0Var = (a4.o0) f0Var.get(i11);
            Object g12 = m0Var.g(o0Var);
            g12.getClass();
            h0 h0Var2 = (h0) g12;
            h0Var2.f14687g = n2.s.w(Boolean.TRUE);
            h0Var2.f14685e = true;
            h0Var2.f14684d = true;
            return o0Var;
        }
        return null;
    }
}
