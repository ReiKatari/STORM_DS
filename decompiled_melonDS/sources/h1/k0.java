package h1;

import androidx.preference.Preference;
import java.util.ArrayList;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class k0 extends a4.k implements a4.h2, s3.c, a4.i {
    public a1 A0;

    /* renamed from: k0  reason: collision with root package name */
    public n1 f5931k0;

    /* renamed from: l0  reason: collision with root package name */
    public mc.l f5932l0;

    /* renamed from: m0  reason: collision with root package name */
    public boolean f5933m0;

    /* renamed from: n0  reason: collision with root package name */
    public j1.i f5934n0;

    /* renamed from: o0  reason: collision with root package name */
    public bd.h f5935o0;
    public j1.b p0;

    /* renamed from: q0  reason: collision with root package name */
    public boolean f5936q0;

    /* renamed from: r0  reason: collision with root package name */
    public boolean f5937r0;

    /* renamed from: s0  reason: collision with root package name */
    public p f5938s0;

    /* renamed from: t0  reason: collision with root package name */
    public s f5939t0;

    /* renamed from: u0  reason: collision with root package name */
    public r f5940u0;

    /* renamed from: v0  reason: collision with root package name */
    public q f5941v0;

    /* renamed from: w0  reason: collision with root package name */
    public b3 f5942w0;

    /* renamed from: x0  reason: collision with root package name */
    public rd.k f5943x0;

    /* renamed from: z0  reason: collision with root package name */
    public c3 f5945z0;

    /* renamed from: y0  reason: collision with root package name */
    public long f5944y0 = 9205357640488583168L;
    public long B0 = 0;

    public k0(mc.l lVar, boolean z10, j1.i iVar, n1 n1Var) {
        this.f5931k0 = n1Var;
        this.f5932l0 = lVar;
        this.f5933m0 = z10;
        this.f5934n0 = iVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object R0(h1.k0 r5, ec.c r6) {
        /*
            boolean r0 = r6 instanceof h1.g0
            if (r0 == 0) goto L13
            r0 = r6
            h1.g0 r0 = (h1.g0) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            h1.g0 r0 = new h1.g0
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.R
            dc.a r1 = dc.a.COROUTINE_SUSPENDED
            int r2 = r0.Y
            r3 = 1
            if (r2 == 0) goto L2e
            if (r2 != r3) goto L27
            p7.j.I(r6)
            goto L47
        L27:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            a0.j.p(r5)
            r5 = 0
            return r5
        L2e:
            p7.j.I(r6)
            j1.b r6 = r5.p0
            if (r6 == 0) goto L4a
            j1.i r2 = r5.f5934n0
            if (r2 == 0) goto L47
            j1.a r4 = new j1.a
            r4.<init>(r6)
            r0.Y = r3
            java.lang.Object r6 = r2.a(r4, r0)
            if (r6 != r1) goto L47
            return r1
        L47:
            r6 = 0
            r5.p0 = r6
        L4a:
            h1.w r6 = new h1.w
            r0 = 0
            r2 = 0
            r6.<init>(r0, r2)
            r5.b1(r6)
            yb.y r5 = yb.y.f14813a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: h1.k0.R0(h1.k0, ec.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0053, code lost:
        if (r2.a(r5, r0) == r1) goto L22;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005f  */
    /* JADX WARN: Type inference failed for: r8v4, types: [j1.h, java.lang.Object, j1.b] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object S0(h1.k0 r6, h1.v r7, ec.c r8) {
        /*
            boolean r0 = r8 instanceof h1.h0
            if (r0 == 0) goto L13
            r0 = r8
            h1.h0 r0 = (h1.h0) r0
            int r1 = r0.f5906b0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5906b0 = r1
            goto L18
        L13:
            h1.h0 r0 = new h1.h0
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.Y
            dc.a r1 = dc.a.COROUTINE_SUSPENDED
            int r2 = r0.f5906b0
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3b
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2e
            j1.b r7 = r0.X
            h1.v r0 = r0.R
            p7.j.I(r8)
            goto L6e
        L2e:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            a0.j.p(r6)
            r6 = 0
            return r6
        L35:
            h1.v r7 = r0.R
            p7.j.I(r8)
            goto L56
        L3b:
            p7.j.I(r8)
            j1.b r8 = r6.p0
            if (r8 == 0) goto L56
            j1.i r2 = r6.f5934n0
            if (r2 == 0) goto L56
            j1.a r5 = new j1.a
            r5.<init>(r8)
            r0.R = r7
            r0.f5906b0 = r4
            java.lang.Object r8 = r2.a(r5, r0)
            if (r8 != r1) goto L56
            goto L6b
        L56:
            j1.b r8 = new j1.b
            r8.<init>()
            j1.i r2 = r6.f5934n0
            if (r2 == 0) goto L70
            r0.R = r7
            r0.X = r8
            r0.f5906b0 = r3
            java.lang.Object r0 = r2.a(r8, r0)
            if (r0 != r1) goto L6c
        L6b:
            return r1
        L6c:
            r0 = r7
            r7 = r8
        L6e:
            r8 = r7
            r7 = r0
        L70:
            r6.p0 = r8
            long r7 = r7.f6015a
            r6.a1(r7)
            yb.y r6 = yb.y.f14813a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: h1.k0.S0(h1.k0, h1.v, ec.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object T0(h1.k0 r5, h1.w r6, ec.c r7) {
        /*
            boolean r0 = r7 instanceof h1.i0
            if (r0 == 0) goto L13
            r0 = r7
            h1.i0 r0 = (h1.i0) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            h1.i0 r0 = new h1.i0
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.X
            dc.a r1 = dc.a.COROUTINE_SUSPENDED
            int r2 = r0.Z
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L29
            h1.w r6 = r0.R
            p7.j.I(r7)
            goto L4b
        L29:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            a0.j.p(r5)
            r5 = 0
            return r5
        L30:
            p7.j.I(r7)
            j1.b r7 = r5.p0
            if (r7 == 0) goto L4e
            j1.i r2 = r5.f5934n0
            if (r2 == 0) goto L4b
            j1.c r4 = new j1.c
            r4.<init>(r7)
            r0.R = r6
            r0.Z = r3
            java.lang.Object r7 = r2.a(r4, r0)
            if (r7 != r1) goto L4b
            return r1
        L4b:
            r7 = 0
            r5.p0 = r7
        L4e:
            r5.b1(r6)
            yb.y r5 = yb.y.f14813a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: h1.k0.T0(h1.k0, h1.w, ec.c):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Object, h1.r] */
    public static void Y0(k0 k0Var, v3.t tVar, long j2, long j10, int i2) {
        if ((i2 & 4) != 0) {
            j10 = 0;
        }
        r rVar = k0Var.f5940u0;
        r rVar2 = rVar;
        if (rVar == null) {
            ?? obj = new Object();
            obj.f6004b = null;
            obj.f6005c = Long.MAX_VALUE;
            obj.f6006d = false;
            k0Var.f5940u0 = obj;
            rVar2 = obj;
        }
        rVar2.f6004b = tVar;
        rVar2.f6005c = j2;
        c3 c3Var = k0Var.f5945z0;
        n1 n1Var = k0Var.f5931k0;
        if (c3Var == null) {
            k0Var.f5945z0 = new c3(n1Var);
        } else {
            c3Var.f5883c = n1Var;
            c3Var.f5882b = j10;
        }
        rVar2.f6006d = false;
        k0Var.f5942w0 = rVar2;
    }

    @Override // s3.c
    public final void B() {
        a1 a1Var = this.A0;
        if (a1Var != null) {
            a1Var.a();
            k0 k0Var = a1Var.f5841a;
            if (k0Var.f5936q0) {
                k0Var.Z0(t.f6008a);
            }
            a1Var.f5847g = null;
            b1 b1Var = a1Var.f5851k;
            b1Var.f5858a = 0;
            b1Var.f5859b.clear();
        }
    }

    @Override // b3.o
    public final void H0() {
        this.f5936q0 = false;
        U0();
        this.B0 = 0L;
    }

    public final void U0() {
        j1.b bVar = this.p0;
        if (bVar != null) {
            j1.i iVar = this.f5934n0;
            if (iVar != null) {
                iVar.b(new j1.a(bVar));
            }
            this.p0 = null;
        }
    }

    public abstract Object V0(j0 j0Var, j0 j0Var2);

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, h1.p] */
    public final void W0() {
        p pVar = this.f5938s0;
        p pVar2 = pVar;
        if (pVar == null) {
            o oVar = o.NotInitialized;
            ?? obj = new Object();
            obj.f5987b = oVar;
            obj.f5988c = false;
            this.f5938s0 = obj;
            pVar2 = obj;
        }
        pVar2.f5987b = o.NotInitialized;
        pVar2.f5988c = false;
        this.f5942w0 = pVar2;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, h1.q] */
    public final void X0(v3.t tVar, long j2, c3 c3Var) {
        q qVar = this.f5941v0;
        q qVar2 = qVar;
        if (qVar == null) {
            ?? obj = new Object();
            obj.f6001b = null;
            obj.f6002c = Long.MAX_VALUE;
            this.f5941v0 = obj;
            qVar2 = obj;
        }
        qVar2.f6001b = tVar;
        qVar2.f6002c = j2;
        c3Var.f5882b = 0L;
        this.f5942w0 = qVar2;
    }

    public final void Z0(x xVar) {
        if ((xVar instanceof v) && !this.f5936q0) {
            this.f5936q0 = true;
            h1();
        }
        c1().a(xVar);
    }

    public abstract void a1(long j2);

    public abstract void b1(w wVar);

    public final bd.l c1() {
        bd.h hVar = this.f5935o0;
        if (hVar != null) {
            return hVar;
        }
        a0.j.h("Events channel not initialized.");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v44, types: [java.lang.Object, h1.y0] */
    /* JADX WARN: Type inference failed for: r3v13, types: [java.lang.Object, h1.y0] */
    /* JADX WARN: Type inference failed for: r6v30, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v38, types: [java.lang.Object, h1.v0] */
    /* JADX WARN: Type inference failed for: r9v27 */
    /* JADX WARN: Type inference failed for: r9v28 */
    /* JADX WARN: Type inference failed for: r9v29, types: [java.lang.Object] */
    @Override // s3.c
    public final void d0(c8.c0 c0Var, v3.l lVar) {
        Object obj;
        Object obj2;
        float f8;
        Object obj3;
        s3.b bVar;
        float intBitsToFloat;
        c3 c3Var;
        s3.b bVar2;
        ?? r92;
        u0 u0Var;
        int i2 = c0Var.f2624b;
        ArrayList arrayList = (ArrayList) c0Var.f2625c;
        if (this.f5933m0) {
            if (this.A0 == null) {
                this.A0 = new a1(this);
            }
            a1 a1Var = this.A0;
            if (a1Var != null) {
                k0 k0Var = a1Var.f5841a;
                if (a1Var.f5846f == null) {
                    v0 v0Var = a1Var.f5842b;
                    v0 v0Var2 = v0Var;
                    if (v0Var == null) {
                        u0 u0Var2 = u0.NotInitialized;
                        ?? obj4 = new Object();
                        obj4.f6016b = u0Var2;
                        obj4.f6017c = false;
                        a1Var.f5842b = obj4;
                        v0Var2 = obj4;
                    }
                    a1Var.f5846f = v0Var2;
                }
                b3 b3Var = a1Var.f5846f;
                if (b3Var != null) {
                    boolean z10 = true;
                    long j2 = 0;
                    if (b3Var instanceof v0) {
                        v0 v0Var3 = (v0) b3Var;
                        if (!arrayList.isEmpty()) {
                            int size = arrayList.size();
                            for (int i10 = 0; i10 < size; i10++) {
                                s3.b bVar3 = (s3.b) arrayList.get(i10);
                                if (bVar3.f12830h || !bVar3.f12826d) {
                                    return;
                                }
                            }
                            s3.b bVar4 = (s3.b) zb.l.R(arrayList);
                            if (z0.f6044a[v0Var3.f6016b.ordinal()] == 1) {
                                if (!k0Var.g1()) {
                                    u0Var = u0.Yes;
                                } else {
                                    u0Var = u0.No;
                                }
                            } else {
                                u0Var = v0Var3.f6016b;
                            }
                            v0Var3.f6016b = u0Var;
                            if (lVar == v3.l.Initial && u0Var == u0.No) {
                                bVar4.f12831i = true;
                                v0Var3.f6017c = true;
                            }
                            if (lVar == v3.l.Main) {
                                if (u0Var == u0.Yes) {
                                    a1.c(a1Var, bVar4, bVar4.f12823a, 0L, 12);
                                    return;
                                } else if (v0Var3.f6017c) {
                                    a1Var.f(bVar4, bVar4, new s3.a(i2), 0L);
                                    a1Var.e(bVar4, new s3.a(i2), 0L);
                                    long j10 = bVar4.f12823a;
                                    y0 y0Var = a1Var.f5843c;
                                    y0 y0Var2 = y0Var;
                                    if (y0Var == null) {
                                        ?? obj5 = new Object();
                                        obj5.f6042b = Long.MAX_VALUE;
                                        a1Var.f5843c = obj5;
                                        y0Var2 = obj5;
                                    }
                                    y0Var2.f6042b = j10;
                                    a1Var.f5846f = y0Var2;
                                    return;
                                } else {
                                    return;
                                }
                            }
                            return;
                        }
                        return;
                    } else if (b3Var instanceof x0) {
                        x0 x0Var = (x0) b3Var;
                        if (lVar != v3.l.Initial) {
                            int size2 = arrayList.size();
                            int i11 = 0;
                            while (true) {
                                if (i11 < size2) {
                                    obj3 = arrayList.get(i11);
                                    f8 = 0.0f;
                                    if (v3.s.e(((s3.b) obj3).f12823a, x0Var.f6038c)) {
                                        break;
                                    }
                                    i11++;
                                } else {
                                    f8 = 0.0f;
                                    obj3 = null;
                                    break;
                                }
                            }
                            s3.b bVar5 = (s3.b) obj3;
                            if (bVar5 == null) {
                                int size3 = arrayList.size();
                                int i12 = 0;
                                while (true) {
                                    if (i12 < size3) {
                                        r92 = arrayList.get(i12);
                                        if (((s3.b) r92).f12826d) {
                                            break;
                                        }
                                        i12++;
                                    } else {
                                        r92 = 0;
                                        break;
                                    }
                                }
                                bVar5 = r92;
                                if (bVar5 == null) {
                                    a1Var.a();
                                    return;
                                }
                                x0Var.f6038c = bVar5.f12823a;
                            }
                            s3.b bVar6 = bVar5;
                            if (lVar == v3.l.Main) {
                                if (!bVar6.f12831i) {
                                    if (b3.b(bVar6)) {
                                        int size4 = arrayList.size();
                                        int i13 = 0;
                                        while (true) {
                                            if (i13 < size4) {
                                                ?? r62 = arrayList.get(i13);
                                                if (((s3.b) r62).f12826d) {
                                                    bVar2 = r62;
                                                    break;
                                                }
                                                i13++;
                                            } else {
                                                bVar2 = null;
                                                break;
                                            }
                                        }
                                        s3.b bVar7 = bVar2;
                                        if (bVar7 == null) {
                                            a1Var.a();
                                        } else {
                                            x0Var.f6038c = bVar7.f12823a;
                                        }
                                    } else {
                                        float f10 = e0.f5886a;
                                        float d4 = ((b4.z2) a4.l.h(k0Var, b4.q1.f1929s)).d();
                                        c3 c3Var2 = a1Var.f5849i;
                                        if (c3Var2 != null) {
                                            long f11 = b3.f(bVar6, k0Var.f5931k0, new s3.a(i2));
                                            n1 n1Var = k0Var.f5931k0;
                                            long j11 = bVar6.f12829g;
                                            if (n1Var == null) {
                                                c3Var = c3Var2;
                                                bVar = bVar6;
                                            } else {
                                                if (i2 == 1) {
                                                    intBitsToFloat = Float.intBitsToFloat((int) (j11 >> 32));
                                                } else if (i2 == 2) {
                                                    intBitsToFloat = Float.intBitsToFloat((int) (j11 & 4294967295L));
                                                } else {
                                                    bVar = bVar6;
                                                    c3Var = c3Var2;
                                                }
                                                if (n1Var == n1.Horizontal) {
                                                    bVar = bVar6;
                                                    j11 = (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(f8) & 4294967295L);
                                                } else {
                                                    bVar = bVar6;
                                                    j11 = (Float.floatToRawIntBits(intBitsToFloat) & 4294967295L) | (Float.floatToRawIntBits(f8) << 32);
                                                }
                                                c3Var = c3Var2;
                                            }
                                            long a10 = c3Var.a(d4, f11, j11);
                                            if ((9223372034707292159L & a10) != 9205357640488583168L) {
                                                bVar.f12831i = true;
                                                s3.b bVar8 = x0Var.f6037b;
                                                bVar8.getClass();
                                                a1Var.f(bVar8, bVar, new s3.a(i2), a10);
                                                a1Var.e(bVar, new s3.a(i2), a10);
                                                long j12 = bVar.f12823a;
                                                y0 y0Var3 = a1Var.f5843c;
                                                y0 y0Var4 = y0Var3;
                                                if (y0Var3 == null) {
                                                    ?? obj6 = new Object();
                                                    obj6.f6042b = Long.MAX_VALUE;
                                                    a1Var.f5843c = obj6;
                                                    y0Var4 = obj6;
                                                }
                                                y0Var4.f6042b = j12;
                                                a1Var.f5846f = y0Var4;
                                            } else {
                                                x0Var.f6039d = true;
                                            }
                                        } else {
                                            a0.j.h("Touch slop detector not initialized.");
                                            return;
                                        }
                                    }
                                } else {
                                    bVar = bVar6;
                                    s3.b bVar9 = x0Var.f6037b;
                                    if (bVar9 != null) {
                                        long j13 = x0Var.f6038c;
                                        c3 c3Var3 = a1Var.f5849i;
                                        if (c3Var3 != null) {
                                            a1Var.b(bVar9, j13, c3Var3);
                                        } else {
                                            a0.j.h("AwaitTouchSlop.touchSlopDetector was not initialized");
                                            return;
                                        }
                                    } else {
                                        a0.j.h("AwaitTouchSlop.initialDown was not initialized");
                                        return;
                                    }
                                }
                                if (lVar != v3.l.Final && x0Var.f6039d) {
                                    if (bVar.f12831i) {
                                        s3.b bVar10 = x0Var.f6037b;
                                        if (bVar10 != null) {
                                            long j14 = x0Var.f6038c;
                                            c3 c3Var4 = a1Var.f5849i;
                                            if (c3Var4 != null) {
                                                a1Var.b(bVar10, j14, c3Var4);
                                                return;
                                            } else {
                                                a0.j.h("AwaitTouchSlop.touchSlopDetector was not initialized");
                                                return;
                                            }
                                        }
                                        a0.j.h("AwaitTouchSlop.initialDown was not initialized");
                                        return;
                                    }
                                    x0Var.f6039d = false;
                                    return;
                                }
                                return;
                            }
                            bVar = bVar6;
                            if (lVar != v3.l.Final) {
                                return;
                            }
                            return;
                        }
                        return;
                    } else if (b3Var instanceof w0) {
                        w0 w0Var = (w0) b3Var;
                        if (lVar == v3.l.Final) {
                            int size5 = arrayList.size();
                            int i14 = 0;
                            while (true) {
                                if (i14 >= size5) {
                                    break;
                                } else if (((s3.b) arrayList.get(i14)).f12831i) {
                                    z10 = false;
                                    break;
                                } else {
                                    i14++;
                                }
                            }
                            int size6 = arrayList.size();
                            int i15 = 0;
                            while (true) {
                                if (i15 >= size6) {
                                    break;
                                } else if (((s3.b) arrayList.get(i15)).f12826d) {
                                    if (!arrayList.isEmpty()) {
                                        if (z10) {
                                            long f12 = b3.f((s3.b) zb.l.R(arrayList), k0Var.f5931k0, new s3.a(i2));
                                            s3.b bVar11 = w0Var.f6024b;
                                            bVar11.getClass();
                                            long d10 = h3.b.d(f12, b3.f(bVar11, k0Var.f5931k0, new s3.a(i2)));
                                            s3.b bVar12 = w0Var.f6024b;
                                            if (bVar12 != null) {
                                                a1.c(a1Var, bVar12, w0Var.f6025c, d10, 8);
                                                return;
                                            } else {
                                                a0.j.h("AwaitGesturePickup.initialDown was not initialized.");
                                                return;
                                            }
                                        }
                                        return;
                                    }
                                } else {
                                    i15++;
                                }
                            }
                            a1Var.a();
                            return;
                        }
                        return;
                    } else if (b3Var instanceof y0) {
                        y0 y0Var5 = (y0) b3Var;
                        if (lVar == v3.l.Main) {
                            long j15 = y0Var5.f6042b;
                            int size7 = arrayList.size();
                            int i16 = 0;
                            while (true) {
                                if (i16 < size7) {
                                    obj = arrayList.get(i16);
                                    if (v3.s.e(((s3.b) obj).f12823a, j15)) {
                                        break;
                                    }
                                    i16++;
                                } else {
                                    obj = null;
                                    break;
                                }
                            }
                            s3.b bVar13 = (s3.b) obj;
                            if (bVar13 != null) {
                                boolean b10 = b3.b(bVar13);
                                t tVar = t.f6008a;
                                if (b10) {
                                    int size8 = arrayList.size();
                                    int i17 = 0;
                                    while (true) {
                                        if (i17 < size8) {
                                            obj2 = arrayList.get(i17);
                                            if (((s3.b) obj2).f12826d) {
                                                break;
                                            }
                                            i17++;
                                        } else {
                                            obj2 = null;
                                            break;
                                        }
                                    }
                                    s3.b bVar14 = (s3.b) obj2;
                                    if (bVar14 == null) {
                                        if (!bVar13.f12831i && b3.b(bVar13)) {
                                            b3.a(a1Var.d(), bVar13, k0Var.f5931k0, new s3.a(i2), a1Var.f5850j, a1Var.f5852l);
                                            float a11 = ((b4.z2) a4.l.h(k0Var, b4.q1.f1929s)).a();
                                            long l10 = a1Var.d().l(p7.a.b(a11, a11));
                                            v0.h hVar = (v0.h) a1Var.d().B;
                                            w3.d dVar = (w3.d) hVar.B;
                                            zb.k.u(dVar.f14120d, null);
                                            dVar.f14121e = 0;
                                            w3.d dVar2 = (w3.d) hVar.L;
                                            zb.k.u(dVar2.f14120d, null);
                                            dVar2.f14121e = 0;
                                            hVar.A = 0L;
                                            k0Var.Z0(new w(n0.b(l10), true));
                                        } else {
                                            k0Var.Z0(tVar);
                                        }
                                        a1Var.a();
                                        return;
                                    }
                                    y0Var5.f6042b = bVar14.f12823a;
                                    return;
                                } else if (bVar13.f12831i) {
                                    k0Var.Z0(tVar);
                                    return;
                                } else {
                                    n1 n1Var2 = k0Var.f5931k0;
                                    s3.a aVar = new s3.a(i2);
                                    if (h3.b.c(h3.b.d(b3.f(bVar13, n1Var2, aVar), b3.g(bVar13, n1Var2, aVar))) != 0.0f) {
                                        n1 n1Var3 = k0Var.f5931k0;
                                        s3.a aVar2 = new s3.a(i2);
                                        long d11 = h3.b.d(b3.f(bVar13, n1Var3, aVar2), b3.g(bVar13, n1Var3, aVar2));
                                        if (!bVar13.f12831i) {
                                            j2 = d11;
                                        }
                                        a1Var.e(bVar13, new s3.a(i2), j2);
                                        bVar13.f12831i = true;
                                        return;
                                    }
                                    return;
                                }
                            }
                            return;
                        }
                        return;
                    } else {
                        m9.o.o();
                        return;
                    }
                }
                a0.j.h("currentDragState should not be null");
            }
        }
    }

    public final rd.k d1() {
        rd.k kVar = this.f5943x0;
        if (kVar != null) {
            return kVar;
        }
        a0.j.h("Velocity Tracker not initialized.");
        return null;
    }

    public final void e1(v3.t tVar, long j2) {
        long a10 = a4.l.s(this.A).a(0L);
        if (!h3.b.b(this.f5944y0, 9205357640488583168L) && !h3.b.b(a10, this.f5944y0)) {
            this.B0 = h3.b.e(this.B0, h3.b.d(a10, this.f5944y0));
        }
        this.f5944y0 = a10;
        zb.k.a(d1(), tVar, this.B0);
        c1().a(new u(j2, false));
    }

    public final void f1(v3.t tVar, v3.t tVar2, long j2) {
        if (this.f5943x0 == null) {
            this.f5943x0 = new rd.k(15);
        }
        zb.k.a(d1(), tVar, 0L);
        long d4 = h3.b.d(tVar2.f13693c, j2);
        this.B0 = 0L;
        if (((Boolean) this.f5932l0.k(new v3.y(tVar.f13699i))).booleanValue()) {
            if (!this.f5936q0) {
                if (this.f5935o0 == null) {
                    this.f5935o0 = ij.a.s(Preference.DEFAULT_ORDER, 6, null);
                }
                h1();
            }
            this.f5944y0 = a4.l.s(this).a(0L);
            c1().a(new v(d4));
        }
    }

    @Override // a4.h2
    public final void g0() {
        if (this.f5937r0) {
            W0();
            if (this.f5936q0) {
                c1().a(t.f6008a);
            }
            this.f5943x0 = null;
        }
        this.f5937r0 = false;
    }

    public abstract boolean g1();

    public final void h1() {
        this.f5936q0 = true;
        if (this.f5935o0 == null) {
            this.f5935o0 = ij.a.s(Preference.DEFAULT_ORDER, 6, null);
        }
        zc.x.v(C0(), null, null, new j0(this, null), 3);
    }

    public final void i1(mc.l lVar, boolean z10, j1.i iVar, n1 n1Var, boolean z11) {
        this.f5932l0 = lVar;
        boolean z12 = true;
        if (this.f5933m0 != z10) {
            this.f5933m0 = z10;
            if (!z10) {
                U0();
                this.A0 = null;
            }
            z11 = true;
        }
        if (!nc.k.a(this.f5934n0, iVar)) {
            U0();
            this.f5934n0 = iVar;
        }
        if (this.f5931k0 != n1Var) {
            this.f5931k0 = n1Var;
        } else {
            z12 = z11;
        }
        if (z12) {
            boolean z13 = this.f5937r0;
            t tVar = t.f6008a;
            if (z13) {
                W0();
                if (this.f5936q0) {
                    c1().a(tVar);
                }
                this.f5943x0 = null;
            }
            a1 a1Var = this.A0;
            if (a1Var != null) {
                a1Var.a();
                k0 k0Var = a1Var.f5841a;
                if (k0Var.f5936q0) {
                    k0Var.Z0(tVar);
                }
                a1Var.f5847g = null;
                b1 b1Var = a1Var.f5851k;
                b1Var.f5858a = 0;
                b1Var.f5859b.clear();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v21, types: [java.util.List, java.util.Collection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v28, types: [java.util.List, java.util.Collection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v43, types: [java.lang.Object, h1.s] */
    /* JADX WARN: Type inference failed for: r1v44, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.util.List, java.util.Collection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List, java.util.Collection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v17, types: [java.lang.Object, h1.s] */
    /* JADX WARN: Type inference failed for: r4v17, types: [java.lang.Object, h1.p] */
    /* JADX WARN: Type inference failed for: r6v25, types: [java.util.List, java.lang.Object] */
    public void s0(v3.k kVar, v3.l lVar, long j2) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        o oVar;
        boolean z10 = true;
        this.f5937r0 = true;
        if (this.f5933m0) {
            if (this.f5942w0 == null) {
                p pVar = this.f5938s0;
                p pVar2 = pVar;
                if (pVar == null) {
                    o oVar2 = o.NotInitialized;
                    ?? obj5 = new Object();
                    obj5.f5987b = oVar2;
                    obj5.f5988c = false;
                    this.f5938s0 = obj5;
                    pVar2 = obj5;
                }
                this.f5942w0 = pVar2;
            }
            b3 b3Var = this.f5942w0;
            if (b3Var != null) {
                if (b3Var instanceof p) {
                    p pVar3 = (p) b3Var;
                    if (!kVar.f13678a.isEmpty() && a3.e(kVar, false)) {
                        v3.t tVar = (v3.t) zb.l.R(kVar.f13678a);
                        if (f0.f5893a[pVar3.f5987b.ordinal()] == 1) {
                            if (!g1()) {
                                oVar = o.Yes;
                            } else {
                                oVar = o.No;
                            }
                        } else {
                            oVar = pVar3.f5987b;
                        }
                        pVar3.f5987b = oVar;
                        if (lVar == v3.l.Initial && oVar == o.No) {
                            tVar.a();
                            pVar3.f5988c = true;
                        }
                        if (lVar == v3.l.Main) {
                            if (oVar == o.Yes) {
                                Y0(this, tVar, tVar.f13691a, 0L, 12);
                                return;
                            } else if (pVar3.f5988c) {
                                f1(tVar, tVar, 0L);
                                e1(tVar, 0L);
                                long j10 = tVar.f13691a;
                                s sVar = this.f5939t0;
                                s sVar2 = sVar;
                                if (sVar == null) {
                                    ?? obj6 = new Object();
                                    obj6.f6007b = Long.MAX_VALUE;
                                    this.f5939t0 = obj6;
                                    sVar2 = obj6;
                                }
                                sVar2.f6007b = j10;
                                this.f5942w0 = sVar2;
                                return;
                            } else {
                                return;
                            }
                        }
                        return;
                    }
                    return;
                }
                Object obj7 = null;
                if (b3Var instanceof r) {
                    r rVar = (r) b3Var;
                    if (lVar != v3.l.Initial) {
                        ?? r12 = kVar.f13678a;
                        int size = r12.size();
                        int i2 = 0;
                        while (true) {
                            if (i2 < size) {
                                obj3 = r12.get(i2);
                                if (v3.s.e(((v3.t) obj3).f13691a, rVar.f6005c)) {
                                    break;
                                }
                                i2++;
                            } else {
                                obj3 = null;
                                break;
                            }
                        }
                        v3.t tVar2 = (v3.t) obj3;
                        if (tVar2 == null) {
                            int size2 = r12.size();
                            int i10 = 0;
                            while (true) {
                                if (i10 < size2) {
                                    obj4 = r12.get(i10);
                                    if (((v3.t) obj4).f13694d) {
                                        break;
                                    }
                                    i10++;
                                } else {
                                    obj4 = null;
                                    break;
                                }
                            }
                            tVar2 = (v3.t) obj4;
                            if (tVar2 == null) {
                                W0();
                                return;
                            }
                            rVar.f6005c = tVar2.f13691a;
                        }
                        if (lVar == v3.l.Main) {
                            if (!tVar2.b()) {
                                if (v3.s.d(tVar2)) {
                                    int size3 = r12.size();
                                    int i11 = 0;
                                    while (true) {
                                        if (i11 >= size3) {
                                            break;
                                        }
                                        Object obj8 = r12.get(i11);
                                        if (((v3.t) obj8).f13694d) {
                                            obj7 = obj8;
                                            break;
                                        }
                                        i11++;
                                    }
                                    v3.t tVar3 = (v3.t) obj7;
                                    if (tVar3 == null) {
                                        W0();
                                    } else {
                                        rVar.f6005c = tVar3.f13691a;
                                    }
                                } else {
                                    float f8 = e0.f((b4.z2) a4.l.h(this, b4.q1.f1929s), tVar2.f13699i);
                                    c3 c3Var = this.f5945z0;
                                    if (c3Var != null) {
                                        long a10 = c3Var.a(f8, tVar2.f13693c, tVar2.f13697g);
                                        if ((9223372034707292159L & a10) != 9205357640488583168L) {
                                            tVar2.a();
                                            v3.t tVar4 = rVar.f6004b;
                                            tVar4.getClass();
                                            f1(tVar4, tVar2, a10);
                                            e1(tVar2, a10);
                                            long j11 = tVar2.f13691a;
                                            s sVar3 = this.f5939t0;
                                            s sVar4 = sVar3;
                                            if (sVar3 == null) {
                                                ?? obj9 = new Object();
                                                obj9.f6007b = Long.MAX_VALUE;
                                                this.f5939t0 = obj9;
                                                sVar4 = obj9;
                                            }
                                            sVar4.f6007b = j11;
                                            this.f5942w0 = sVar4;
                                        } else {
                                            rVar.f6006d = true;
                                        }
                                    } else {
                                        a0.j.h("Touch slop detector not initialized.");
                                        return;
                                    }
                                }
                            } else {
                                v3.t tVar5 = rVar.f6004b;
                                if (tVar5 != null) {
                                    long j12 = rVar.f6005c;
                                    c3 c3Var2 = this.f5945z0;
                                    if (c3Var2 != null) {
                                        X0(tVar5, j12, c3Var2);
                                    } else {
                                        a0.j.h("AwaitTouchSlop.touchSlopDetector was not initialized");
                                        return;
                                    }
                                } else {
                                    a0.j.h("AwaitTouchSlop.initialDown was not initialized");
                                    return;
                                }
                            }
                        }
                        if (lVar == v3.l.Final && rVar.f6006d) {
                            if (tVar2.b()) {
                                v3.t tVar6 = rVar.f6004b;
                                if (tVar6 != null) {
                                    long j13 = rVar.f6005c;
                                    c3 c3Var3 = this.f5945z0;
                                    if (c3Var3 != null) {
                                        X0(tVar6, j13, c3Var3);
                                        return;
                                    } else {
                                        a0.j.h("AwaitTouchSlop.touchSlopDetector was not initialized");
                                        return;
                                    }
                                }
                                a0.j.h("AwaitTouchSlop.initialDown was not initialized");
                                return;
                            }
                            rVar.f6006d = false;
                            return;
                        }
                        return;
                    }
                    return;
                } else if (b3Var instanceof q) {
                    q qVar = (q) b3Var;
                    if (lVar == v3.l.Final) {
                        ?? r13 = kVar.f13678a;
                        int size4 = r13.size();
                        int i12 = 0;
                        while (true) {
                            if (i12 >= size4) {
                                break;
                            } else if (((v3.t) r13.get(i12)).b()) {
                                z10 = false;
                                break;
                            } else {
                                i12++;
                            }
                        }
                        int size5 = r13.size();
                        int i13 = 0;
                        while (true) {
                            if (i13 >= size5) {
                                break;
                            } else if (((v3.t) r13.get(i13)).f13694d) {
                                if (!r13.isEmpty()) {
                                    if (z10) {
                                        long j14 = ((v3.t) zb.l.R(r13)).f13693c;
                                        v3.t tVar7 = qVar.f6001b;
                                        tVar7.getClass();
                                        long d4 = h3.b.d(j14, tVar7.f13693c);
                                        v3.t tVar8 = qVar.f6001b;
                                        if (tVar8 != null) {
                                            Y0(this, tVar8, qVar.f6002c, d4, 8);
                                            return;
                                        } else {
                                            a0.j.h("AwaitGesturePickup.initialDown was not initialized.");
                                            return;
                                        }
                                    }
                                    return;
                                }
                            } else {
                                i13++;
                            }
                        }
                        W0();
                        return;
                    }
                    return;
                } else if (b3Var instanceof s) {
                    s sVar5 = (s) b3Var;
                    if (lVar == v3.l.Main) {
                        long j15 = sVar5.f6007b;
                        ?? r22 = kVar.f13678a;
                        int size6 = r22.size();
                        int i14 = 0;
                        while (true) {
                            if (i14 < size6) {
                                obj = r22.get(i14);
                                if (v3.s.e(((v3.t) obj).f13691a, j15)) {
                                    break;
                                }
                                i14++;
                            } else {
                                obj = null;
                                break;
                            }
                        }
                        v3.t tVar9 = (v3.t) obj;
                        if (tVar9 != null) {
                            boolean d10 = v3.s.d(tVar9);
                            t tVar10 = t.f6008a;
                            if (d10) {
                                ?? r14 = kVar.f13678a;
                                int size7 = r14.size();
                                int i15 = 0;
                                while (true) {
                                    if (i15 < size7) {
                                        obj2 = r14.get(i15);
                                        if (((v3.t) obj2).f13694d) {
                                            break;
                                        }
                                        i15++;
                                    } else {
                                        obj2 = null;
                                        break;
                                    }
                                }
                                v3.t tVar11 = (v3.t) obj2;
                                if (tVar11 == null) {
                                    if (!tVar9.b() && v3.s.d(tVar9)) {
                                        zb.k.a(d1(), tVar9, 0L);
                                        float a11 = ((b4.z2) a4.l.h(this, b4.q1.f1929s)).a();
                                        long l10 = d1().l(p7.a.b(a11, a11));
                                        v0.h hVar = (v0.h) d1().B;
                                        w3.d dVar = (w3.d) hVar.B;
                                        zb.k.u(dVar.f14120d, null);
                                        dVar.f14121e = 0;
                                        w3.d dVar2 = (w3.d) hVar.L;
                                        zb.k.u(dVar2.f14120d, null);
                                        dVar2.f14121e = 0;
                                        hVar.A = 0L;
                                        c1().a(new w(n0.b(l10), false));
                                        this.f5937r0 = false;
                                    } else {
                                        c1().a(tVar10);
                                    }
                                    W0();
                                    return;
                                }
                                sVar5.f6007b = tVar11.f13691a;
                                return;
                            } else if (tVar9.b()) {
                                c1().a(tVar10);
                                return;
                            } else if (h3.b.c(v3.s.h(tVar9, true)) != 0.0f) {
                                e1(tVar9, v3.s.h(tVar9, false));
                                tVar9.a();
                                return;
                            } else {
                                return;
                            }
                        }
                        return;
                    }
                    return;
                } else {
                    m9.o.o();
                    return;
                }
            }
            a0.j.h("currentDragState should not be null");
        }
    }
}
