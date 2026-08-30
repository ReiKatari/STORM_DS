package f1;

import a4.h2;
import a4.l2;
import a4.q2;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.view.ViewParent;
import b4.z2;
import java.util.ArrayList;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class g extends a4.k implements h2, t3.e, l2, q2, a4.i, a4.x1, s3.c {
    public static final b F0 = new Object();
    public j1.i A0;
    public boolean B0;
    public a0.g C0;
    public zc.l1 D0;
    public final b E0;

    /* renamed from: k0  reason: collision with root package name */
    public j1.i f4547k0;

    /* renamed from: l0  reason: collision with root package name */
    public a1 f4548l0;

    /* renamed from: m0  reason: collision with root package name */
    public boolean f4549m0;

    /* renamed from: n0  reason: collision with root package name */
    public String f4550n0;

    /* renamed from: o0  reason: collision with root package name */
    public i4.i f4551o0;
    public boolean p0;

    /* renamed from: q0  reason: collision with root package name */
    public mc.a f4552q0;

    /* renamed from: r0  reason: collision with root package name */
    public final l0 f4553r0;

    /* renamed from: s0  reason: collision with root package name */
    public a1 f4554s0;

    /* renamed from: t0  reason: collision with root package name */
    public v3.h0 f4555t0;

    /* renamed from: u0  reason: collision with root package name */
    public a4.j f4556u0;

    /* renamed from: v0  reason: collision with root package name */
    public j1.k f4557v0;

    /* renamed from: w0  reason: collision with root package name */
    public j1.f f4558w0;

    /* renamed from: x0  reason: collision with root package name */
    public final a1.a0 f4559x0;

    /* renamed from: y0  reason: collision with root package name */
    public long f4560y0;

    /* renamed from: z0  reason: collision with root package name */
    public j1.k f4561z0;

    public g(j1.i iVar, a1 a1Var, boolean z10, boolean z11, String str, i4.i iVar2, mc.a aVar) {
        this.f4547k0 = iVar;
        this.f4548l0 = a1Var;
        this.f4549m0 = z10;
        this.f4550n0 = str;
        this.f4551o0 = iVar2;
        this.p0 = z11;
        this.f4552q0 = aVar;
        this.f4553r0 = new l0(iVar, 0, new a2.g(1, this, g.class, "onFocusChange", "onFocusChange(Z)V", 0, 0, 5));
        int i2 = a1.o.f79a;
        this.f4559x0 = new a1.a0(6);
        this.f4560y0 = 0L;
        j1.i iVar3 = this.f4547k0;
        this.A0 = iVar3;
        this.B0 = iVar3 == null;
        this.E0 = F0;
    }

    @Override // s3.c
    public final void B() {
        a0.g gVar = this.C0;
        if (gVar != null) {
            gVar.A();
        }
    }

    @Override // b3.o
    public final boolean D0() {
        return false;
    }

    @Override // b3.o
    public final void G0() {
        J();
        if (!this.B0) {
            Y0();
        }
        if (this.p0) {
            O0(this.f4553r0);
        }
    }

    @Override // b3.o
    public final void H0() {
        U0();
        if (this.A0 == null) {
            this.f4547k0 = null;
        }
        a4.j jVar = this.f4556u0;
        if (jVar != null) {
            P0(jVar);
        }
        this.f4556u0 = null;
    }

    @Override // a4.x1
    public final void J() {
        if (this.f4549m0) {
            a4.l.p(this, new a(this, 0));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0079 A[RETURN] */
    @Override // t3.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean Q(android.view.KeyEvent r11) {
        /*
            r10 = this;
            r10.Y0()
            long r0 = t3.c.b(r11)
            boolean r2 = r10.p0
            r3 = 3
            r4 = 0
            a1.a0 r5 = r10.f4559x0
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L4b
            int r2 = t3.c.c(r11)
            r8 = 2
            if (r2 != r8) goto L4b
            boolean r2 = f1.n.n(r11)
            if (r2 == 0) goto L4b
            boolean r2 = r5.b(r0)
            if (r2 != 0) goto L41
            j1.k r2 = new j1.k
            long r8 = r10.f4560y0
            r2.<init>(r8)
            r5.g(r0, r2)
            j1.i r0 = r10.f4547k0
            if (r0 == 0) goto L3f
            zc.u r0 = r10.C0()
            f1.e r1 = new f1.e
            r5 = 2
            r1.<init>(r10, r2, r4, r5)
            zc.x.v(r0, r4, r4, r1, r3)
        L3f:
            r0 = r6
            goto L42
        L41:
            r0 = r7
        L42:
            boolean r11 = r10.a1(r11)
            if (r11 != 0) goto L79
            if (r0 == 0) goto L7a
            goto L79
        L4b:
            boolean r2 = r10.p0
            if (r2 == 0) goto L7a
            int r2 = t3.c.c(r11)
            if (r2 != r6) goto L7a
            boolean r2 = f1.n.n(r11)
            if (r2 == 0) goto L7a
            java.lang.Object r0 = r5.f(r0)
            j1.k r0 = (j1.k) r0
            if (r0 == 0) goto L77
            j1.i r1 = r10.f4547k0
            if (r1 == 0) goto L74
            zc.u r1 = r10.C0()
            f1.e r2 = new f1.e
            r5 = 3
            r2.<init>(r10, r0, r4, r5)
            zc.x.v(r1, r4, r4, r2, r3)
        L74:
            r10.b1(r11)
        L77:
            if (r0 == 0) goto L7a
        L79:
            return r6
        L7a:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: f1.g.Q(android.view.KeyEvent):boolean");
    }

    public abstract v3.h0 S0();

    /* JADX WARN: Type inference failed for: r0v0, types: [nc.p, java.lang.Object] */
    public final boolean T0() {
        ?? obj = new Object();
        a4.l.w(this, h1.v1.f6018j0, new a2.c(12, obj));
        if (!obj.A) {
            int i2 = z.f4702b;
            ViewParent parent = a4.l.v(this).getParent();
            while (parent != null && (parent instanceof ViewGroup)) {
                ViewGroup viewGroup = (ViewGroup) parent;
                if (!viewGroup.shouldDelayChildPressedState()) {
                    parent = viewGroup.getParent();
                } else {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final void U0() {
        j1.i iVar = this.f4547k0;
        a1.a0 a0Var = this.f4559x0;
        if (iVar != null) {
            j1.k kVar = this.f4557v0;
            if (kVar != null) {
                iVar.b(new j1.j(kVar));
            }
            j1.k kVar2 = this.f4561z0;
            if (kVar2 != null) {
                iVar.b(new j1.j(kVar2));
            }
            j1.f fVar = this.f4558w0;
            if (fVar != null) {
                iVar.b(new j1.g(fVar));
            }
            Object[] objArr = a0Var.f17c;
            long[] jArr = a0Var.f15a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i2 = 0;
                while (true) {
                    long j2 = jArr[i2];
                    if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i10 = 8 - ((~(i2 - length)) >>> 31);
                        for (int i11 = 0; i11 < i10; i11++) {
                            if ((255 & j2) < 128) {
                                iVar.b(new j1.j((j1.k) objArr[(i2 << 3) + i11]));
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
        }
        this.f4557v0 = null;
        this.f4561z0 = null;
        this.f4558w0 = null;
        a0Var.a();
    }

    public final void V0(boolean z10) {
        j1.k kVar;
        zc.i0 i0Var;
        j1.i iVar = this.f4547k0;
        if (iVar != null) {
            zc.l1 l1Var = this.D0;
            if (l1Var != null && l1Var.d()) {
                zc.l1 l1Var2 = this.D0;
                if (l1Var2 != null) {
                    l1Var2.i(null);
                }
            } else {
                if (z10) {
                    kVar = this.f4561z0;
                } else {
                    kVar = this.f4557v0;
                }
                if (kVar != null) {
                    j1.j jVar = new j1.j(kVar);
                    zc.y0 y0Var = (zc.y0) ((ah.h0) C0()).B.t(zc.r.B);
                    if (y0Var != null) {
                        i0Var = y0Var.I(new a7.l(15, iVar, jVar));
                    } else {
                        i0Var = null;
                    }
                    zc.x.v(C0(), null, null, new a2.o(iVar, jVar, i0Var, null, 14), 3);
                }
            }
            if (z10) {
                this.f4561z0 = null;
            } else {
                this.f4557v0 = null;
            }
        }
    }

    public final void W0(long j2, boolean z10) {
        j1.k kVar;
        j1.i iVar = this.f4547k0;
        if (iVar != null) {
            zc.l1 l1Var = this.D0;
            if (l1Var != null && l1Var.d()) {
                l1Var.i(null);
                zc.x.v(C0(), null, null, new a2.j(l1Var, j2, iVar, (cc.c) null, 3), 3);
            } else {
                if (z10) {
                    kVar = this.f4561z0;
                } else {
                    kVar = this.f4557v0;
                }
                if (kVar != null) {
                    zc.x.v(C0(), null, null, new d(kVar, iVar, (cc.c) null), 3);
                }
            }
            if (z10) {
                this.f4561z0 = null;
            } else {
                this.f4557v0 = null;
            }
        }
    }

    public final void X0(long j2, boolean z10) {
        j1.i iVar = this.f4547k0;
        if (iVar != null) {
            j1.k kVar = new j1.k(j2);
            if (T0()) {
                this.D0 = zc.x.v(C0(), null, null, new bi.v(iVar, kVar, z10, this, (cc.c) null), 3);
                return;
            }
            if (z10) {
                this.f4561z0 = kVar;
            } else {
                this.f4557v0 = kVar;
            }
            zc.x.v(C0(), null, null, new d(iVar, kVar, (cc.c) null), 3);
        }
    }

    public final void Y0() {
        a1 a1Var;
        if (this.f4556u0 == null) {
            if (this.f4549m0) {
                a1Var = this.f4554s0;
            } else {
                a1Var = this.f4548l0;
            }
            if (a1Var != null) {
                if (this.f4547k0 == null) {
                    this.f4547k0 = new j1.i();
                }
                this.f4553r0.T0(this.f4547k0);
                j1.i iVar = this.f4547k0;
                iVar.getClass();
                a4.j a10 = a1Var.a(iVar);
                O0(a10);
                this.f4556u0 = a10;
            }
        }
    }

    public abstract boolean a1(KeyEvent keyEvent);

    public abstract void b1(KeyEvent keyEvent);

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0072, code lost:
        if (r3.f4556u0 == null) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c1(j1.i r4, f1.a1 r5, boolean r6, boolean r7, java.lang.String r8, i4.i r9, mc.a r10) {
        /*
            r3 = this;
            j1.i r0 = r3.A0
            boolean r0 = nc.k.a(r0, r4)
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L13
            r3.U0()
            r3.A0 = r4
            r3.f4547k0 = r4
            r4 = r1
            goto L14
        L13:
            r4 = r2
        L14:
            f1.a1 r0 = r3.f4548l0
            boolean r0 = nc.k.a(r0, r5)
            if (r0 != 0) goto L1f
            r3.f4548l0 = r5
            r4 = r1
        L1f:
            boolean r5 = r3.f4549m0
            if (r5 == r6) goto L2b
            r3.f4549m0 = r6
            if (r6 == 0) goto L2a
            r3.J()
        L2a:
            r4 = r1
        L2b:
            boolean r5 = r3.p0
            f1.l0 r6 = r3.f4553r0
            if (r5 == r7) goto L42
            if (r7 == 0) goto L37
            r3.O0(r6)
            goto L3d
        L37:
            r3.P0(r6)
            r3.U0()
        L3d:
            a4.l.l(r3)
            r3.p0 = r7
        L42:
            java.lang.String r5 = r3.f4550n0
            boolean r5 = nc.k.a(r5, r8)
            if (r5 != 0) goto L4f
            r3.f4550n0 = r8
            a4.l.l(r3)
        L4f:
            i4.i r5 = r3.f4551o0
            boolean r5 = nc.k.a(r5, r9)
            if (r5 != 0) goto L5c
            r3.f4551o0 = r9
            a4.l.l(r3)
        L5c:
            r3.f4552q0 = r10
            boolean r5 = r3.B0
            j1.i r7 = r3.A0
            if (r7 != 0) goto L66
            r8 = r1
            goto L67
        L66:
            r8 = r2
        L67:
            if (r5 == r8) goto L75
            if (r7 != 0) goto L6c
            r2 = r1
        L6c:
            r3.B0 = r2
            if (r2 != 0) goto L75
            a4.j r5 = r3.f4556u0
            if (r5 != 0) goto L75
            goto L76
        L75:
            r1 = r4
        L76:
            if (r1 == 0) goto L8b
            a4.j r4 = r3.f4556u0
            if (r4 != 0) goto L80
            boolean r5 = r3.B0
            if (r5 != 0) goto L8b
        L80:
            if (r4 == 0) goto L85
            r3.P0(r4)
        L85:
            r4 = 0
            r3.f4556u0 = r4
            r3.Y0()
        L8b:
            j1.i r4 = r3.f4547k0
            r6.T0(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f1.g.c1(j1.i, f1.a1, boolean, boolean, java.lang.String, i4.i, mc.a):void");
    }

    @Override // s3.c
    public final void d0(c8.c0 c0Var, v3.l lVar) {
        ArrayList arrayList = (ArrayList) c0Var.f2625c;
        Y0();
        if (this.p0) {
            if (this.C0 == null) {
                this.C0 = new a0.g(this);
            }
            a0.g gVar = this.C0;
            if (gVar != null) {
                mc.a aVar = this.f4552q0;
                g gVar2 = (g) gVar.B;
                int i2 = 0;
                if (lVar == v3.l.Main) {
                    s3.b bVar = (s3.b) gVar.L;
                    if (bVar == null) {
                        int size = arrayList.size();
                        for (int i10 = 0; i10 < size; i10++) {
                            s3.b bVar2 = (s3.b) arrayList.get(i10);
                            if (!bVar2.f12830h && bVar2.f12826d) {
                                s3.b bVar3 = (s3.b) arrayList.get(0);
                                gVar.L = bVar3;
                                gVar2.X0(bVar3.f12825c, true);
                                bVar3.f12831i = true;
                                return;
                            }
                        }
                        return;
                    }
                    long j2 = bVar.f12825c;
                    int size2 = arrayList.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        s3.b bVar4 = (s3.b) arrayList.get(i11);
                        if (bVar4.f12830h && bVar4.f12826d) {
                            if (Math.abs(h3.b.c(h3.b.d(((s3.b) arrayList.get(0)).f12825c, j2))) > ((z2) a4.l.h(gVar2, b4.q1.f1929s)).d()) {
                                gVar.A();
                                return;
                            }
                            return;
                        }
                    }
                    int size3 = arrayList.size();
                    for (int i12 = 0; i12 < size3; i12++) {
                        s3.b bVar5 = (s3.b) arrayList.get(i12);
                        if (bVar5.f12831i || !bVar5.f12830h || bVar5.f12826d) {
                            int size4 = arrayList.size();
                            while (i2 < size4) {
                                if (((s3.b) arrayList.get(i2)).f12831i) {
                                    gVar.A();
                                    return;
                                }
                                i2++;
                            }
                            return;
                        }
                    }
                    ((s3.b) arrayList.get(0)).f12831i = true;
                    gVar2.W0(j2, true);
                    aVar.b();
                    gVar.L = null;
                } else if (lVar == v3.l.Final && ((s3.b) gVar.L) != null) {
                    int size5 = arrayList.size();
                    while (i2 < size5) {
                        s3.b bVar6 = (s3.b) arrayList.get(i2);
                        if (bVar6.f12831i && !bVar6.equals((s3.b) gVar.L)) {
                            gVar.A();
                            return;
                        }
                        i2++;
                    }
                }
            }
        }
    }

    @Override // a4.l2
    public final void f0(i4.x xVar) {
        i4.i iVar = this.f4551o0;
        if (iVar != null) {
            i4.v.e(xVar, iVar.f6722a);
        }
        String str = this.f4550n0;
        a aVar = new a(this, 1);
        tc.c[] cVarArr = i4.v.f6808a;
        xVar.a(i4.l.f6741b, new i4.a(str, aVar));
        if (this.p0) {
            this.f4553r0.f0(xVar);
        } else {
            xVar.a(i4.t.f6789i, yb.y.f14813a);
        }
        R0(xVar);
    }

    @Override // a4.h2
    public void g0() {
        j1.f fVar;
        j1.i iVar = this.f4547k0;
        if (iVar != null && (fVar = this.f4558w0) != null) {
            iVar.b(new j1.g(fVar));
        }
        this.f4558w0 = null;
        v3.h0 h0Var = this.f4555t0;
        if (h0Var != null) {
            h0Var.g0();
        }
    }

    @Override // t3.e
    public final boolean h(KeyEvent keyEvent) {
        return false;
    }

    @Override // a4.l2
    public final boolean j0() {
        return true;
    }

    @Override // a4.q2
    public final Object k() {
        return this.E0;
    }

    @Override // a4.h2
    public void s0(v3.k kVar, v3.l lVar, long j2) {
        v3.h0 S0;
        long j10 = ((j2 >> 33) << 32) | (((j2 << 32) >> 33) & 4294967295L);
        this.f4560y0 = (Float.floatToRawIntBits((int) (j10 >> 32)) << 32) | (Float.floatToRawIntBits((int) (j10 & 4294967295L)) & 4294967295L);
        Y0();
        if (this.p0 && lVar == v3.l.Main) {
            int i2 = kVar.f13683f;
            if (i2 == 4) {
                zc.x.v(C0(), null, null, new f(this, null, 0), 3);
            } else if (i2 == 5) {
                zc.x.v(C0(), null, null, new f(this, null, 1), 3);
            }
        }
        if (this.f4555t0 == null && (S0 = S0()) != null) {
            O0(S0);
            this.f4555t0 = S0;
        }
        v3.h0 h0Var = this.f4555t0;
        if (h0Var != null) {
            h0Var.s0(kVar, lVar, j2);
        }
    }

    public void Z0() {
    }

    public void R0(i4.x xVar) {
    }
}
