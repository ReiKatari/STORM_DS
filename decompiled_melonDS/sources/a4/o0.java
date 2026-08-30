package a4;

import androidx.preference.Preference;
import b4.z2;
import java.util.Arrays;
import java.util.List;
import n2.t2;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class o0 implements n2.h, d2, h {
    public static final h0 K0 = new j0("Undefined intrinsics block and it is required");
    public static final g0 L0 = new Object();
    public static final e0 M0 = new e0(0);
    public final boolean A;
    public final n1 A0;
    public int B;
    public final t0 B0;
    public y3.p0 C0;
    public r1 D0;
    public boolean E0;
    public b3.p F0;
    public b3.p G0;
    public boolean H0;
    public int I0;
    public boolean J0;
    public boolean L;
    public long R;
    public long X;
    public long Y;
    public boolean Z;

    /* renamed from: b0  reason: collision with root package name */
    public boolean f278b0;

    /* renamed from: c0  reason: collision with root package name */
    public boolean f279c0;

    /* renamed from: d0  reason: collision with root package name */
    public o0 f280d0;

    /* renamed from: e0  reason: collision with root package name */
    public int f281e0;

    /* renamed from: f0  reason: collision with root package name */
    public final a0.g f282f0;

    /* renamed from: g0  reason: collision with root package name */
    public p2.b f283g0;

    /* renamed from: h0  reason: collision with root package name */
    public boolean f284h0;

    /* renamed from: i0  reason: collision with root package name */
    public o0 f285i0;

    /* renamed from: j0  reason: collision with root package name */
    public c2 f286j0;

    /* renamed from: k0  reason: collision with root package name */
    public int f287k0;

    /* renamed from: l0  reason: collision with root package name */
    public boolean f288l0;

    /* renamed from: m0  reason: collision with root package name */
    public boolean f289m0;

    /* renamed from: n0  reason: collision with root package name */
    public i4.m f290n0;

    /* renamed from: o0  reason: collision with root package name */
    public boolean f291o0;
    public final p2.b p0;

    /* renamed from: q0  reason: collision with root package name */
    public boolean f292q0;

    /* renamed from: r0  reason: collision with root package name */
    public y3.v0 f293r0;

    /* renamed from: s0  reason: collision with root package name */
    public a0.g f294s0;

    /* renamed from: t0  reason: collision with root package name */
    public x4.c f295t0;

    /* renamed from: u0  reason: collision with root package name */
    public x4.m f296u0;

    /* renamed from: v0  reason: collision with root package name */
    public z2 f297v0;

    /* renamed from: w0  reason: collision with root package name */
    public n2.a0 f298w0;

    /* renamed from: x0  reason: collision with root package name */
    public k0 f299x0;

    /* renamed from: y0  reason: collision with root package name */
    public k0 f300y0;

    /* renamed from: z0  reason: collision with root package name */
    public boolean f301z0;

    public o0(int i2, boolean z10) {
        this.A = z10;
        this.B = i2;
        this.R = 9223372034707292159L;
        this.X = 0L;
        this.Y = 9223372034707292159L;
        this.Z = true;
        this.f282f0 = new a0.g(3, new p2.b(new o0[16]), new m0(0, this));
        this.p0 = new p2.b(new o0[16]);
        this.f292q0 = true;
        this.f293r0 = K0;
        this.f295t0 = s0.f332a;
        this.f296u0 = x4.m.Ltr;
        this.f297v0 = L0;
        n2.a0.f9872a0.getClass();
        this.f298w0 = n2.z.f10086b;
        k0 k0Var = k0.NotUsed;
        this.f299x0 = k0Var;
        this.f300y0 = k0Var;
        this.A0 = new n1(this);
        this.B0 = new t0(this);
        this.E0 = true;
        this.F0 = b3.m.f1770a;
    }

    public static boolean Q(o0 o0Var) {
        x4.a aVar;
        i1 i1Var = o0Var.B0.f348p;
        if (i1Var.f223d0) {
            aVar = new x4.a(i1Var.R);
        } else {
            aVar = null;
        }
        return o0Var.P(aVar);
    }

    public static void V(o0 o0Var, boolean z10, int i2) {
        boolean z11;
        o0 u4;
        boolean z12 = false;
        if ((i2 & 1) != 0) {
            z10 = false;
        }
        if ((i2 & 2) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if ((i2 & 4) != 0) {
            z12 = true;
        }
        if (o0Var.f280d0 == null) {
            x3.a.c("Lookahead measure cannot be requested on a node that is not a part of the LookaheadScope");
        }
        c2 c2Var = o0Var.f286j0;
        if (c2Var != null && !o0Var.f288l0 && !o0Var.A) {
            ((b4.x) c2Var).v(o0Var, true, z10, z11);
            if (z12) {
                c1 c1Var = o0Var.B0.f349q;
                c1Var.getClass();
                t0 t0Var = c1Var.Y;
                o0 u10 = t0Var.f334a.u();
                k0 k0Var = t0Var.f334a.f299x0;
                if (u10 != null && k0Var != k0.NotUsed) {
                    while (u10.f299x0 == k0Var && (u4 = u10.u()) != null) {
                        u10 = u4;
                    }
                    int i10 = a1.f155b[k0Var.ordinal()];
                    if (i10 != 1) {
                        if (i10 == 2) {
                            if (u10.f280d0 != null) {
                                u10.U(z10);
                                return;
                            } else {
                                u10.W(z10);
                                return;
                            }
                        }
                        a0.j.p("Intrinsics isn't used by the parent");
                    } else if (u10.f280d0 != null) {
                        V(u10, z10, 6);
                    } else {
                        X(u10, z10, 6);
                    }
                }
            }
        }
    }

    public static void X(o0 o0Var, boolean z10, int i2) {
        boolean z11;
        boolean z12;
        c2 c2Var;
        o0 u4;
        if ((i2 & 1) != 0) {
            z10 = false;
        }
        if ((i2 & 2) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if ((i2 & 4) != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (!o0Var.f288l0 && !o0Var.A && (c2Var = o0Var.f286j0) != null) {
            ((b4.x) c2Var).v(o0Var, false, z10, z11);
            if (z12) {
                t0 t0Var = o0Var.B0.f348p.Y;
                o0 u10 = t0Var.f334a.u();
                k0 k0Var = t0Var.f334a.f299x0;
                if (u10 != null && k0Var != k0.NotUsed) {
                    while (u10.f299x0 == k0Var && (u4 = u10.u()) != null) {
                        u10 = u4;
                    }
                    int i10 = g1.f219b[k0Var.ordinal()];
                    if (i10 != 1) {
                        if (i10 == 2) {
                            u10.W(z10);
                            return;
                        } else {
                            a0.j.p("Intrinsics isn't used by the parent");
                            return;
                        }
                    }
                    X(u10, z10, 6);
                }
            }
        }
    }

    public static void Y(o0 o0Var) {
        int i2 = l0.f255a[o0Var.B0.f337d.ordinal()];
        t0 t0Var = o0Var.B0;
        if (i2 == 1) {
            if (t0Var.f338e) {
                V(o0Var, true, 6);
                return;
            }
            if (t0Var.f339f) {
                o0Var.U(true);
            }
            if (o0Var.q()) {
                X(o0Var, true, 6);
                return;
            } else if (o0Var.p()) {
                o0Var.W(true);
                return;
            } else {
                return;
            }
        }
        a0.j.g(t0Var.f337d, "Unexpected state ");
    }

    private final String j(o0 o0Var) {
        String str;
        StringBuilder sb2 = new StringBuilder("Cannot insert ");
        sb2.append(o0Var);
        sb2.append(" because it already has a parent or an owner. This tree: ");
        sb2.append(g(0));
        sb2.append(" Other tree: ");
        o0 o0Var2 = o0Var.f285i0;
        if (o0Var2 != null) {
            str = o0Var2.g(0);
        } else {
            str = null;
        }
        sb2.append(str);
        return sb2.toString();
    }

    public final void A(long j2, t tVar, int i2, boolean z10) {
        n1 n1Var = this.A0;
        r1 r1Var = n1Var.f266d;
        i3.k0 k0Var = r1.I0;
        n1Var.f266d.c1(r1.L0, r1Var.U0(j2, true), tVar, i2, z10);
    }

    public final void B(int i2, o0 o0Var) {
        if (o0Var.f285i0 != null && o0Var.f286j0 != null) {
            x3.a.c(j(o0Var));
        }
        o0Var.f285i0 = this;
        a0.g gVar = this.f282f0;
        ((p2.b) gVar.B).a(i2, o0Var);
        ((m0) gVar.L).b();
        O();
        if (o0Var.A) {
            this.f281e0++;
        }
        G();
        c2 c2Var = this.f286j0;
        if (c2Var != null) {
            o0Var.d(c2Var);
        }
        if (o0Var.B0.f345l > 0) {
            t0 t0Var = this.B0;
            t0Var.d(t0Var.f345l + 1);
        }
        if (o0Var.I0 > 0) {
            c0(this.I0 + 1);
        }
    }

    public final void C() {
        b2 b2Var;
        if (this.E0) {
            n1 n1Var = this.A0;
            r1 r1Var = n1Var.f265c;
            r1 r1Var2 = n1Var.f266d.f319m0;
            this.D0 = null;
            while (true) {
                if (nc.k.a(r1Var, r1Var2)) {
                    break;
                }
                if (r1Var != null) {
                    b2Var = r1Var.H0;
                } else {
                    b2Var = null;
                }
                if (b2Var != null) {
                    this.D0 = r1Var;
                    break;
                } else if (r1Var != null) {
                    r1Var = r1Var.f319m0;
                } else {
                    r1Var = null;
                }
            }
        }
        r1 r1Var3 = this.D0;
        if (r1Var3 != null && r1Var3.H0 == null) {
            throw w.d.g("layer was not set");
        }
        if (r1Var3 != null) {
            r1Var3.e1();
            return;
        }
        o0 u4 = u();
        if (u4 != null) {
            u4.C();
        }
    }

    public final void D() {
        n1 n1Var = this.A0;
        r1 r1Var = n1Var.f266d;
        v vVar = n1Var.f265c;
        while (r1Var != vVar) {
            r1Var.getClass();
            d0 d0Var = (d0) r1Var;
            b2 b2Var = d0Var.H0;
            if (b2Var != null) {
                ((b4.y1) b2Var).c();
            }
            r1Var = d0Var.f318l0;
        }
        b2 b2Var2 = n1Var.f265c.H0;
        if (b2Var2 != null) {
            ((b4.y1) b2Var2).c();
        }
    }

    public final void E() {
        if (this.A) {
            o0 u4 = u();
            if (u4 != null) {
                u4.E();
            }
        } else if (this.f280d0 != null) {
            V(this, false, 7);
        } else {
            X(this, false, 7);
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [nc.t, java.lang.Object] */
    public final void F() {
        if (this.f291o0) {
            return;
        }
        if (this.A0.f264b.Y != null || this.G0 != null) {
            this.f289m0 = true;
            return;
        }
        i4.m mVar = this.f290n0;
        this.f291o0 = true;
        ?? obj = new Object();
        obj.A = new i4.m();
        e2 snapshotObserver = ((b4.x) s0.a(this)).getSnapshotObserver();
        n0 n0Var = new n0(0, this, obj);
        snapshotObserver.f194a.c(this, snapshotObserver.f197d, n0Var);
        this.f291o0 = false;
        this.f290n0 = (i4.m) obj.A;
        this.f289m0 = false;
        b4.x xVar = (b4.x) s0.a(this);
        xVar.getSemanticsOwner().b(this, mVar);
        xVar.x();
    }

    public final void G() {
        o0 o0Var;
        if (this.f281e0 > 0) {
            this.f284h0 = true;
        }
        if (this.A && (o0Var = this.f285i0) != null) {
            o0Var.G();
        }
    }

    public final boolean H() {
        if (this.f286j0 != null) {
            return true;
        }
        return false;
    }

    public final boolean I() {
        return this.B0.f348p.f232m0;
    }

    public final Boolean J() {
        boolean z10;
        c1 c1Var = this.B0.f349q;
        if (c1Var != null) {
            if (c1Var.f170k0 != z0.IsNotPlaced) {
                z10 = true;
            } else {
                z10 = false;
            }
            return Boolean.valueOf(z10);
        }
        return null;
    }

    public final void K() {
        o0 u4;
        if (this.f299x0 == k0.NotUsed) {
            f();
        }
        c1 c1Var = this.B0.f349q;
        c1Var.getClass();
        boolean z10 = true;
        try {
            c1Var.Z = true;
            if (!c1Var.f165f0) {
                x3.a.c("replace() called on item that was not placed");
            }
            c1Var.f180v0 = false;
            if (c1Var.f170k0 == z0.IsNotPlaced) {
                z10 = false;
            }
            c1Var.D0(c1Var.f168i0, c1Var.f169j0);
            if (z10 && !c1Var.f180v0 && (u4 = c1Var.Y.f334a.u()) != null) {
                u4.U(false);
            }
            c1Var.Z = false;
        } catch (Throwable th2) {
            c1Var.Z = false;
            throw th2;
        }
    }

    public final void L(int i2, int i10, int i11) {
        int i12;
        if (i2 == i10) {
            return;
        }
        for (int i13 = 0; i13 < i11; i13++) {
            if (i2 > i10) {
                i12 = i2 + i13;
            } else {
                i12 = i2;
            }
            int i14 = i2 > i10 ? i10 + i13 : (i10 + i11) - 2;
            a0.g gVar = this.f282f0;
            m0 m0Var = (m0) gVar.L;
            Object k10 = ((p2.b) gVar.B).k(i12);
            m0Var.b();
            ((p2.b) gVar.B).a(i14, (o0) k10);
            m0Var.b();
        }
        O();
        G();
        E();
    }

    public final void M(o0 o0Var) {
        t0 t0Var;
        if (o0Var.B0.f345l > 0) {
            this.B0.d(t0Var.f345l - 1);
        }
        if (this.f286j0 != null) {
            o0Var.h();
        }
        o0Var.f285i0 = null;
        if (o0Var.I0 > 0) {
            c0(this.I0 - 1);
        }
        o0Var.A0.f266d.f319m0 = null;
        if (o0Var.A) {
            this.f281e0--;
            p2.b bVar = (p2.b) o0Var.f282f0.B;
            Object[] objArr = bVar.A;
            int i2 = bVar.L;
            for (int i10 = 0; i10 < i2; i10++) {
                ((o0) objArr[i10]).A0.f266d.f319m0 = null;
            }
        }
        G();
        O();
    }

    public final void N() {
        j4.b rectManager;
        this.Z = true;
        c2 c2Var = this.f286j0;
        if (c2Var != null && (rectManager = ((b4.x) c2Var).getRectManager()) != null) {
            rectManager.e(this);
        }
    }

    public final void O() {
        if (this.A) {
            o0 u4 = u();
            if (u4 != null) {
                u4.O();
                return;
            }
            return;
        }
        this.f292q0 = true;
    }

    public final boolean P(x4.a aVar) {
        if (aVar != null) {
            if (this.f299x0 == k0.NotUsed) {
                e();
            }
            return this.B0.f348p.E0(aVar.f14337a);
        }
        return false;
    }

    public final void R() {
        a0.g gVar = this.f282f0;
        int i2 = ((p2.b) gVar.B).L;
        while (true) {
            i2--;
            p2.b bVar = (p2.b) gVar.B;
            if (-1 < i2) {
                M((o0) bVar.A[i2]);
            } else {
                bVar.g();
                ((m0) gVar.L).b();
                return;
            }
        }
    }

    public final void S(int i2, int i10) {
        if (i10 < 0) {
            x3.a.a("count (" + i10 + ") must be greater than 0");
        }
        int i11 = (i10 + i2) - 1;
        if (i2 > i11) {
            return;
        }
        while (true) {
            a0.g gVar = this.f282f0;
            M((o0) ((p2.b) gVar.B).A[i11]);
            Object k10 = ((p2.b) gVar.B).k(i11);
            ((m0) gVar.L).b();
            o0 o0Var = (o0) k10;
            if (i11 != i2) {
                i11--;
            } else {
                return;
            }
        }
    }

    public final void T() {
        o0 u4;
        if (this.f299x0 == k0.NotUsed) {
            f();
        }
        i1 i1Var = this.B0.f348p;
        t0 t0Var = i1Var.Y;
        try {
            i1Var.Z = true;
            if (!i1Var.f224e0) {
                x3.a.c("replace called on unplaced item");
            }
            boolean z10 = i1Var.f232m0;
            i1Var.D0(i1Var.f227h0, i1Var.f229j0, i1Var.f228i0);
            if (z10 && !i1Var.f244z0 && (u4 = t0Var.f334a.u()) != null) {
                u4.W(false);
            }
        } finally {
        }
    }

    public final void U(boolean z10) {
        c2 c2Var;
        if (!this.A && (c2Var = this.f286j0) != null) {
            ((b4.x) c2Var).w(this, true, z10);
        }
    }

    public final void W(boolean z10) {
        c2 c2Var;
        if (!this.A && (c2Var = this.f286j0) != null) {
            ((b4.x) c2Var).w(this, false, z10);
        }
    }

    public final void Z() {
        p2.b z10 = z();
        Object[] objArr = z10.A;
        int i2 = z10.L;
        for (int i10 = 0; i10 < i2; i10++) {
            o0 o0Var = (o0) objArr[i10];
            k0 k0Var = o0Var.f300y0;
            o0Var.f299x0 = k0Var;
            if (k0Var != k0.NotUsed) {
                o0Var.Z();
            }
        }
    }

    @Override // n2.h
    public final void a() {
        y3.p0 p0Var = this.C0;
        if (p0Var != null) {
            p0Var.a();
        }
        n1 n1Var = this.A0;
        r1 r1Var = n1Var.f265c.f318l0;
        for (r1 r1Var2 = n1Var.f266d; !nc.k.a(r1Var2, r1Var) && r1Var2 != null; r1Var2 = r1Var2.f318l0) {
            r1Var2.j1();
        }
    }

    public final void a0(Throwable th2) {
        n2.a0 a0Var = this.f298w0;
        t2 t2Var = a3.h.f150a;
        v2.g gVar = (v2.g) a0Var;
        gVar.getClass();
        a3.f fVar = (a3.f) n2.s.x(gVar, t2Var);
        if (fVar != null) {
            d0.d.k0(th2, new a3.e(0, fVar, this));
        }
        throw th2;
    }

    @Override // n2.h
    public final void b() {
        c3.d dVar;
        y3.p0 p0Var = this.C0;
        if (p0Var != null) {
            p0Var.i(true);
        }
        this.J0 = true;
        b3.o oVar = this.A0.f267e;
        for (b3.o oVar2 = oVar; oVar2 != null; oVar2 = oVar2.X) {
            if (oVar2.f1777h0) {
                oVar2.J0();
            }
        }
        for (b3.o oVar3 = oVar; oVar3 != null; oVar3 = oVar3.X) {
            if (oVar3.f1777h0) {
                oVar3.L0();
            }
        }
        while (oVar != null) {
            if (oVar.f1777h0) {
                oVar.F0();
            }
            oVar = oVar.X;
        }
        if (H()) {
            this.f290n0 = null;
            this.f289m0 = false;
        }
        c2 c2Var = this.f286j0;
        if (c2Var != null) {
            b4.x xVar = (b4.x) c2Var;
            if (b4.x.e() && (dVar = xVar.H0) != null && dVar.f2558b0.e(this.B)) {
                dVar.A.T(dVar.L, this.B, false);
            }
        }
    }

    public final void b0(x4.c cVar) {
        if (!nc.k.a(this.f295t0, cVar)) {
            this.f295t0 = cVar;
            E();
            o0 u4 = u();
            if (u4 != null) {
                u4.C();
            }
            D();
            for (b3.o oVar = this.A0.f268f; oVar != null; oVar = oVar.Y) {
                oVar.a();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v3, types: [a4.r1, b3.o] */
    public final void c(b3.p pVar) {
        int i2;
        ?? r72;
        boolean z10;
        n1 n1Var;
        m1 m1Var;
        p2.b bVar;
        boolean z11;
        v vVar;
        boolean z12;
        boolean z13;
        p2.b bVar2;
        boolean z14;
        boolean z15;
        a aVar;
        n1 n1Var2 = this.A0;
        boolean d4 = n1Var2.d(16);
        b3.o oVar = n1Var2.f267e;
        boolean d10 = n1Var2.d(1024);
        this.F0 = pVar;
        v vVar2 = n1Var2.f265c;
        o0 o0Var = n1Var2.f263a;
        b3.o oVar2 = n1Var2.f268f;
        m1 m1Var2 = n1Var2.f264b;
        if (oVar2 == m1Var2) {
            x3.a.c("padChain called on already padded chain");
        }
        b3.o oVar3 = n1Var2.f268f;
        oVar3.X = m1Var2;
        m1Var2.Y = oVar3;
        p2.b bVar3 = n1Var2.f269g;
        if (bVar3 != null) {
            i2 = bVar3.L;
        } else {
            i2 = 0;
        }
        p2.b bVar4 = n1Var2.f270h;
        if (bVar4 == null) {
            bVar4 = new p2.b(new b3.n[16]);
        }
        p2.b bVar5 = n1Var2.f271i;
        bVar5.b(pVar);
        a aVar2 = null;
        while (true) {
            int i10 = bVar5.L;
            if (i10 == 0) {
                break;
            }
            b3.p pVar2 = (b3.p) bVar5.k(i10 - 1);
            if (pVar2 instanceof b3.j) {
                b3.j jVar = (b3.j) pVar2;
                bVar5.b(jVar.f1768b);
                bVar5.b(jVar.f1767a);
            } else if (pVar2 instanceof b3.n) {
                bVar4.b(pVar2);
            } else {
                if (aVar2 == null) {
                    aVar = new a(1, bVar4);
                    aVar2 = aVar;
                } else {
                    aVar = aVar2;
                }
                pVar2.a(aVar);
            }
        }
        int i11 = bVar4.L;
        if (i11 == i2) {
            b3.o oVar4 = m1Var2.Y;
            int i12 = 0;
            while (oVar4 != null && i12 < i2) {
                if (bVar3 != null) {
                    b3.n nVar = (b3.n) bVar3.A[i12];
                    b3.n nVar2 = (b3.n) bVar4.A[i12];
                    if (nc.k.a(nVar, nVar2)) {
                        bVar2 = bVar3;
                        z15 = true;
                    } else {
                        bVar2 = bVar3;
                        if (nVar.getClass() == nVar2.getClass()) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                    }
                    if (z15) {
                        if (z15) {
                            n1.h(nVar, nVar2, oVar4);
                        }
                        oVar4 = oVar4.Y;
                        i12++;
                        bVar3 = bVar2;
                    } else {
                        oVar4 = oVar4.X;
                        break;
                    }
                } else {
                    throw w.d.g("expected prior modifier list to be non-empty");
                }
            }
            bVar2 = bVar3;
            if (i12 < i2) {
                if (bVar2 != null) {
                    if (oVar4 != null) {
                        if (o0Var.G0 != null) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        b3.o oVar5 = oVar4;
                        n1Var = n1Var2;
                        bVar = bVar4;
                        bVar3 = bVar2;
                        z13 = false;
                        n1Var.f(i12, bVar3, bVar, oVar5, !z14);
                        m1Var = m1Var2;
                        z11 = true;
                        r72 = z13;
                    } else {
                        throw w.d.g("structuralUpdate requires a non-null tail");
                    }
                } else {
                    throw w.d.g("expected prior modifier list to be non-empty");
                }
            } else {
                n1Var2 = n1Var2;
                bVar3 = bVar2;
                z12 = false;
                n1Var = n1Var2;
                m1Var = m1Var2;
                bVar = bVar4;
                z11 = false;
                r72 = z12;
            }
        } else {
            r72 = 0;
            z13 = false;
            z12 = false;
            b3.p pVar3 = o0Var.G0;
            if (pVar3 != null && i2 == 0) {
                b3.o oVar6 = m1Var2;
                for (int i13 = 0; i13 < bVar4.L; i13++) {
                    oVar6 = n1.b((b3.n) bVar4.A[i13], oVar6);
                }
                int i14 = 0;
                for (b3.o oVar7 = oVar.X; oVar7 != null && oVar7 != m1Var2; oVar7 = oVar7.X) {
                    i14 |= oVar7.L;
                    oVar7.R = i14;
                }
                n1Var = n1Var2;
                m1Var = m1Var2;
                bVar = bVar4;
                z11 = true;
                r72 = z13;
            } else if (i11 == 0) {
                if (bVar3 != null) {
                    b3.o oVar8 = m1Var2.Y;
                    for (int i15 = 0; oVar8 != null && i15 < bVar3.L; i15++) {
                        oVar8 = n1.c(oVar8).Y;
                    }
                    o0 u4 = o0Var.u();
                    if (u4 != null) {
                        vVar = u4.A0.f265c;
                    } else {
                        vVar = null;
                    }
                    vVar2.f319m0 = vVar;
                    n1Var2.f266d = vVar2;
                    n1Var = n1Var2;
                    m1Var = m1Var2;
                    bVar = bVar4;
                    z11 = false;
                    r72 = z12;
                } else {
                    throw w.d.g("expected prior modifier list to be non-empty");
                }
            } else {
                if (bVar3 == null) {
                    bVar3 = new p2.b(new b3.n[16]);
                }
                if (pVar3 != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                n1Var = n1Var2;
                m1Var = m1Var2;
                bVar = bVar4;
                n1Var.f(0, bVar3, bVar, m1Var, !z10);
                z11 = true;
            }
        }
        n1Var.f269g = bVar;
        if (bVar3 != null) {
            bVar3.g();
        } else {
            bVar3 = r72;
        }
        n1Var.f270h = bVar3;
        b3.o oVar9 = m1Var.Y;
        if (oVar9 != null) {
            oVar = oVar9;
        }
        oVar.X = r72;
        m1Var.Y = r72;
        m1Var.R = -1;
        m1Var.f1771b0 = r72;
        if (oVar == m1Var) {
            x3.a.c("trimChain did not update the head");
        }
        n1Var.f268f = oVar;
        if (z11) {
            n1Var.g();
        }
        boolean d11 = n1Var.d(16);
        boolean d12 = n1Var.d(1024);
        this.B0.j();
        if (this.f280d0 == null && n1Var.d(512)) {
            d0(this);
        }
        if (d4 != d11 || d10 != d12) {
            j4.b rectManager = ((b4.x) s0.a(this)).getRectManager();
            rectManager.getClass();
            if (H()) {
                c8.c0 c0Var = rectManager.f7417a;
                int i16 = this.B & 33554431;
                long[] jArr = (long[]) c0Var.f2625c;
                int i17 = c0Var.f2624b;
                for (int i18 = 0; i18 < jArr.length - 2 && i18 < i17; i18 += 3) {
                    int i19 = i18 + 2;
                    long j2 = jArr[i19];
                    if ((((int) j2) & 33554431) == i16) {
                        jArr[i19] = ((d11 ? 1L : 0L) * 4611686018427387904L) | ((-6917529027641081857L) & j2) | ((d12 ? 1L : 0L) * 2305843009213693952L);
                        return;
                    }
                }
            }
        }
    }

    public final void c0(int i2) {
        o0 u4;
        o0 u10;
        int i10 = this.I0;
        if (i10 != i2) {
            if (i2 > 0 && i10 == 0 && (u10 = u()) != null) {
                u10.c0(u10.I0 + 1);
            }
            if (i2 == 0 && this.I0 > 0 && (u4 = u()) != null) {
                u4.c0(u4.I0 - 1);
            }
            this.I0 = i2;
        }
    }

    public final void d(c2 c2Var) {
        v vVar;
        int i2;
        o0 o0Var;
        c3.d dVar;
        i4.m x9;
        c2 c2Var2;
        String str;
        if (this.f286j0 != null) {
            x3.a.c("Cannot attach " + this + " as it already is attached.  Tree: " + g(0));
        }
        o0 o0Var2 = this.f285i0;
        if (o0Var2 != null && !nc.k.a(o0Var2.f286j0, c2Var)) {
            StringBuilder sb2 = new StringBuilder("Attaching to a different owner(");
            sb2.append(c2Var);
            sb2.append(") than the parent's owner(");
            o0 u4 = u();
            if (u4 != null) {
                c2Var2 = u4.f286j0;
            } else {
                c2Var2 = null;
            }
            sb2.append(c2Var2);
            sb2.append("). This tree: ");
            sb2.append(g(0));
            sb2.append(" Parent tree: ");
            o0 o0Var3 = this.f285i0;
            if (o0Var3 != null) {
                str = o0Var3.g(0);
            } else {
                str = null;
            }
            sb2.append(str);
            x3.a.c(sb2.toString());
        }
        o0 u10 = u();
        t0 t0Var = this.B0;
        if (u10 == null) {
            t0Var.f348p.f232m0 = true;
            ((b4.x) c2Var).getRectManager().f(this, false);
            c1 c1Var = t0Var.f349q;
            if (c1Var != null) {
                c1Var.f170k0 = z0.IsPlacedInLookahead;
            }
        }
        n1 n1Var = this.A0;
        r1 r1Var = n1Var.f266d;
        if (u10 != null) {
            vVar = u10.A0.f265c;
        } else {
            vVar = null;
        }
        r1Var.f319m0 = vVar;
        this.f286j0 = c2Var;
        if (u10 != null) {
            i2 = u10.f287k0;
        } else {
            i2 = -1;
        }
        this.f287k0 = i2 + 1;
        b3.p pVar = this.G0;
        if (pVar != null) {
            c(pVar);
        }
        this.G0 = null;
        b4.x xVar = (b4.x) c2Var;
        xVar.getLayoutNodes().i(this.B, this);
        if (this.f279c0) {
            d0(this);
        } else {
            o0 o0Var4 = this.f285i0;
            if (o0Var4 == null || (o0Var = o0Var4.f280d0) == null) {
                o0Var = this.f280d0;
            }
            d0(o0Var);
            if (this.f280d0 == null && n1Var.d(512)) {
                d0(this);
            }
        }
        if (!this.J0) {
            for (b3.o oVar = n1Var.f268f; oVar != null; oVar = oVar.Y) {
                oVar.E0();
            }
        }
        p2.b bVar = (p2.b) this.f282f0.B;
        Object[] objArr = bVar.A;
        int i10 = bVar.L;
        for (int i11 = 0; i11 < i10; i11++) {
            ((o0) objArr[i11]).d(c2Var);
        }
        if (!this.J0) {
            n1Var.e();
        }
        E();
        if (u10 != null) {
            u10.E();
        }
        t0Var.j();
        if (!this.J0 && n1Var.d(8)) {
            F();
        }
        xVar.getClass();
        if (b4.x.e() && (dVar = xVar.H0) != null && (x9 = x()) != null && x9.A.b(i4.t.f6796q)) {
            dVar.f2558b0.a(this.B);
            dVar.A.T(dVar.L, this.B, true);
        }
    }

    public final void d0(o0 o0Var) {
        if (!nc.k.a(o0Var, this.f280d0)) {
            this.f280d0 = o0Var;
            t0 t0Var = this.B0;
            if (o0Var != null) {
                if (t0Var.f349q == null) {
                    t0Var.f349q = new c1(t0Var);
                }
                n1 n1Var = this.A0;
                r1 r1Var = n1Var.f265c.f318l0;
                for (r1 r1Var2 = n1Var.f266d; !nc.k.a(r1Var2, r1Var) && r1Var2 != null; r1Var2 = r1Var2.f318l0) {
                    r1Var2.S0();
                }
            } else {
                t0Var.f349q = null;
                t0Var.f339f = false;
                t0Var.f338e = false;
            }
            E();
        }
    }

    public final void e() {
        this.f300y0 = this.f299x0;
        this.f299x0 = k0.NotUsed;
        p2.b z10 = z();
        Object[] objArr = z10.A;
        int i2 = z10.L;
        for (int i10 = 0; i10 < i2; i10++) {
            o0 o0Var = (o0) objArr[i10];
            if (o0Var.f299x0 != k0.NotUsed) {
                o0Var.e();
            }
        }
    }

    public final void e0(y3.v0 v0Var) {
        if (!nc.k.a(this.f293r0, v0Var)) {
            this.f293r0 = v0Var;
            a0.g gVar = this.f294s0;
            if (gVar != null) {
                ((n2.f1) gVar.L).setValue(v0Var);
            }
            E();
        }
    }

    public final void f() {
        this.f300y0 = this.f299x0;
        this.f299x0 = k0.NotUsed;
        p2.b z10 = z();
        Object[] objArr = z10.A;
        int i2 = z10.L;
        for (int i10 = 0; i10 < i2; i10++) {
            o0 o0Var = (o0) objArr[i10];
            if (o0Var.f299x0 == k0.InLayoutBlock) {
                o0Var.f();
            }
        }
    }

    public final void f0(b3.p pVar) {
        if (this.A && this.F0 != b3.m.f1770a) {
            x3.a.a("Modifiers are not supported on virtual LayoutNodes");
        }
        if (this.J0) {
            x3.a.a("modifier is updated when deactivated");
        }
        if (H()) {
            c(pVar);
            if (this.f289m0) {
                F();
                return;
            }
            return;
        }
        this.G0 = pVar;
    }

    public final String g(int i2) {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < i2; i10++) {
            sb2.append("  ");
        }
        sb2.append("|-");
        sb2.append(toString());
        sb2.append('\n');
        p2.b z10 = z();
        Object[] objArr = z10.A;
        int i11 = z10.L;
        for (int i12 = 0; i12 < i11; i12++) {
            sb2.append(((o0) objArr[i12]).g(i2 + 1));
        }
        String sb3 = sb2.toString();
        if (i2 == 0) {
            return sb3.substring(0, sb3.length() - 1);
        }
        return sb3;
    }

    public final void g0(z2 z2Var) {
        if (!nc.k.a(this.f297v0, z2Var)) {
            this.f297v0 = z2Var;
            b3.o oVar = this.A0.f268f;
            if ((oVar.R & 16) != 0) {
                while (oVar != null) {
                    if ((oVar.L & 16) != 0) {
                        b3.o oVar2 = oVar;
                        p2.b bVar = null;
                        while (oVar2 != null) {
                            if (oVar2 instanceof h2) {
                                ((h2) oVar2).a0();
                            } else if ((oVar2.L & 16) != 0 && (oVar2 instanceof k)) {
                                int i2 = 0;
                                for (b3.o oVar3 = ((k) oVar2).f247j0; oVar3 != null; oVar3 = oVar3.Y) {
                                    if ((oVar3.L & 16) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            oVar2 = oVar3;
                                        } else {
                                            if (bVar == null) {
                                                bVar = new p2.b(new b3.o[16]);
                                            }
                                            if (oVar2 != null) {
                                                bVar.b(oVar2);
                                                oVar2 = null;
                                            }
                                            bVar.b(oVar3);
                                        }
                                    }
                                }
                                if (i2 == 1) {
                                }
                            }
                            oVar2 = l.e(bVar);
                        }
                    }
                    if ((oVar.R & 16) != 0) {
                        oVar = oVar.Y;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public final void h() {
        c3.d dVar;
        p0 p0Var;
        c2 c2Var = this.f286j0;
        String str = null;
        if (c2Var == null) {
            StringBuilder sb2 = new StringBuilder("Cannot detach node that is already detached!  Tree: ");
            o0 u4 = u();
            if (u4 != null) {
                str = u4.g(0);
            }
            sb2.append(str);
            x3.a.d(sb2.toString());
            wa.b.a();
            return;
        }
        o0 u10 = u();
        t0 t0Var = this.B0;
        if (u10 != null) {
            u10.C();
            u10.E();
            i1 i1Var = t0Var.f348p;
            k0 k0Var = k0.NotUsed;
            i1Var.f225f0 = k0Var;
            c1 c1Var = t0Var.f349q;
            if (c1Var != null) {
                c1Var.f163d0 = k0Var;
            }
        }
        p0 p0Var2 = t0Var.f348p.f236r0;
        p0Var2.f306b = true;
        p0Var2.f307c = false;
        p0Var2.f309e = false;
        p0Var2.f308d = false;
        p0Var2.f310f = false;
        p0Var2.f311g = false;
        p0Var2.f312h = null;
        c1 c1Var2 = t0Var.f349q;
        if (c1Var2 != null && (p0Var = c1Var2.f171l0) != null) {
            p0Var.f306b = true;
            p0Var.f307c = false;
            p0Var.f309e = false;
            p0Var.f308d = false;
            p0Var.f310f = false;
            p0Var.f311g = false;
            p0Var.f312h = null;
        }
        n1 n1Var = this.A0;
        b3.o oVar = n1Var.f267e;
        r1 r1Var = n1Var.f265c.f318l0;
        for (r1 r1Var2 = n1Var.f266d; !nc.k.a(r1Var2, r1Var) && r1Var2 != null; r1Var2 = r1Var2.f318l0) {
            r1Var2.p1();
            if (r1Var2.f315i0.I()) {
                r1Var2.k1();
            }
        }
        for (b3.o oVar2 = oVar; oVar2 != null; oVar2 = oVar2.X) {
            if (oVar2.f1777h0) {
                oVar2.L0();
            }
        }
        this.f288l0 = true;
        p2.b bVar = (p2.b) this.f282f0.B;
        Object[] objArr = bVar.A;
        int i2 = bVar.L;
        for (int i10 = 0; i10 < i2; i10++) {
            ((o0) objArr[i10]).h();
        }
        this.f288l0 = false;
        while (oVar != null) {
            if (oVar.f1777h0) {
                oVar.F0();
            }
            oVar = oVar.X;
        }
        b4.x xVar = (b4.x) c2Var;
        xVar.getLayoutNodes().g(this.B);
        f1 f1Var = xVar.Q0;
        n nVar = f1Var.f203b;
        ((a0.b) nVar.B).W(this);
        ((a0.b) nVar.L).W(this);
        ((a0.b) nVar.R).W(this);
        ((p2.b) f1Var.f206e.B).j(this);
        xVar.I0 = true;
        if (b4.x.e() && (dVar = xVar.H0) != null && dVar.f2558b0.e(this.B)) {
            dVar.A.T(dVar.L, this.B, false);
        }
        xVar.getRectManager().h(this);
        this.f286j0 = null;
        d0(null);
        this.f287k0 = 0;
        i1 i1Var2 = t0Var.f348p;
        i1Var2.f222c0 = Preference.DEFAULT_ORDER;
        i1Var2.f221b0 = Preference.DEFAULT_ORDER;
        i1Var2.f232m0 = false;
        c1 c1Var3 = t0Var.f349q;
        if (c1Var3 != null) {
            c1Var3.f162c0 = Preference.DEFAULT_ORDER;
            c1Var3.f161b0 = Preference.DEFAULT_ORDER;
            c1Var3.f170k0 = z0.IsNotPlaced;
        }
        if (n1Var.d(8)) {
            i4.m mVar = this.f290n0;
            this.f290n0 = null;
            this.f289m0 = false;
            xVar.getSemanticsOwner().b(this, mVar);
            xVar.x();
        }
    }

    public final void h0() {
        if (this.f281e0 > 0 && this.f284h0) {
            this.f284h0 = false;
            p2.b bVar = this.f283g0;
            if (bVar == null) {
                bVar = new p2.b(new o0[16]);
                this.f283g0 = bVar;
            }
            bVar.g();
            p2.b bVar2 = (p2.b) this.f282f0.B;
            Object[] objArr = bVar2.A;
            int i2 = bVar2.L;
            for (int i10 = 0; i10 < i2; i10++) {
                o0 o0Var = (o0) objArr[i10];
                if (o0Var.A) {
                    bVar.d(bVar.L, o0Var.z());
                } else {
                    bVar.b(o0Var);
                }
            }
            t0 t0Var = this.B0;
            t0Var.f348p.f238t0 = true;
            c1 c1Var = t0Var.f349q;
            if (c1Var != null) {
                c1Var.f173n0 = true;
            }
        }
    }

    public final void i(i3.q qVar, l3.b bVar) {
        try {
            this.A0.f266d.Q0(qVar, bVar);
        } catch (Throwable th2) {
            a0(th2);
            throw null;
        }
    }

    public final void k() {
        x4.a aVar;
        if (this.f280d0 != null) {
            V(this, false, 5);
        } else {
            X(this, false, 5);
        }
        i1 i1Var = this.B0.f348p;
        if (i1Var.f223d0) {
            aVar = new x4.a(i1Var.R);
        } else {
            aVar = null;
        }
        c2 c2Var = this.f286j0;
        if (aVar != null) {
            if (c2Var != null) {
                ((b4.x) c2Var).s(this, aVar.f14337a);
            }
        } else if (c2Var != null) {
            ((b4.x) c2Var).r(true);
        }
    }

    public final List l() {
        c1 c1Var = this.B0.f349q;
        c1Var.getClass();
        p2.b bVar = c1Var.f172m0;
        t0 t0Var = c1Var.Y;
        t0Var.f334a.n();
        if (!c1Var.f173n0) {
            return bVar.f();
        }
        o0 o0Var = t0Var.f334a;
        p2.b z10 = o0Var.z();
        Object[] objArr = z10.A;
        int i2 = z10.L;
        for (int i10 = 0; i10 < i2; i10++) {
            o0 o0Var2 = (o0) objArr[i10];
            if (bVar.L <= i10) {
                c1 c1Var2 = o0Var2.B0.f349q;
                c1Var2.getClass();
                bVar.b(c1Var2);
            } else {
                c1 c1Var3 = o0Var2.B0.f349q;
                c1Var3.getClass();
                Object[] objArr2 = bVar.A;
                Object obj = objArr2[i10];
                objArr2[i10] = c1Var3;
            }
        }
        bVar.l(((p2.b) ((a1.f0) o0Var.n()).B).L, bVar.L);
        c1Var.f173n0 = false;
        return bVar.f();
    }

    public final List m() {
        return this.B0.f348p.v0();
    }

    public final List n() {
        return z().f();
    }

    public final List o() {
        return ((p2.b) this.f282f0.B).f();
    }

    public final boolean p() {
        return this.B0.f348p.p0;
    }

    public final boolean q() {
        return this.B0.f348p.f234o0;
    }

    public final k0 r() {
        return this.B0.f348p.f225f0;
    }

    public final k0 s() {
        k0 k0Var;
        c1 c1Var = this.B0.f349q;
        if (c1Var != null && (k0Var = c1Var.f163d0) != null) {
            return k0Var;
        }
        return k0.NotUsed;
    }

    public final a0.g t() {
        a0.g gVar = this.f294s0;
        if (gVar == null) {
            a0.g gVar2 = new a0.g(this, this.f293r0);
            this.f294s0 = gVar2;
            return gVar2;
        }
        return gVar;
    }

    public final String toString() {
        return b4.l0.r(this) + " children: " + ((p2.b) ((a1.f0) n()).B).L + " measurePolicy: " + this.f293r0 + " deactivated: " + this.J0;
    }

    public final o0 u() {
        o0 o0Var = this.f285i0;
        while (o0Var != null && o0Var.A) {
            o0Var = o0Var.f285i0;
        }
        return o0Var;
    }

    public final int v() {
        return this.B0.f348p.f222c0;
    }

    @Override // a4.d2
    public final boolean w() {
        return H();
    }

    public final i4.m x() {
        if (H() && !this.J0 && this.A0.d(8)) {
            return this.f290n0;
        }
        return null;
    }

    public final p2.b y() {
        boolean z10 = this.f292q0;
        p2.b bVar = this.p0;
        if (z10) {
            bVar.g();
            bVar.d(bVar.L, z());
            Arrays.sort(bVar.A, 0, bVar.L, M0);
            this.f292q0 = false;
        }
        return bVar;
    }

    public final p2.b z() {
        h0();
        if (this.f281e0 == 0) {
            return (p2.b) this.f282f0.B;
        }
        p2.b bVar = this.f283g0;
        bVar.getClass();
        return bVar;
    }

    public o0(int i2) {
        this(i4.n.f6765a.addAndGet(1), (i2 & 1) == 0);
    }
}
