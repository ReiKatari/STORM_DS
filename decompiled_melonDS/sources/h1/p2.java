package h1;

import android.view.ViewTreeObserver;
import java.lang.reflect.Method;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class p2 {

    /* renamed from: a  reason: collision with root package name */
    public j2 f5989a;

    /* renamed from: b  reason: collision with root package name */
    public f1.i f5990b;

    /* renamed from: c  reason: collision with root package name */
    public q0 f5991c;

    /* renamed from: d  reason: collision with root package name */
    public n1 f5992d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f5993e;

    /* renamed from: f  reason: collision with root package name */
    public b9.e f5994f;

    /* renamed from: g  reason: collision with root package name */
    public final i2 f5995g;

    /* renamed from: h  reason: collision with root package name */
    public final d2 f5996h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f5997i;

    /* renamed from: j  reason: collision with root package name */
    public int f5998j = 1;

    /* renamed from: k  reason: collision with root package name */
    public u1 f5999k = b2.f5861b;

    /* renamed from: l  reason: collision with root package name */
    public final n2 f6000l = new n2(this);
    public final a2.c m = new a2.c(20, this);

    public p2(j2 j2Var, f1.i iVar, q0 q0Var, n1 n1Var, boolean z10, b9.e eVar, i2 i2Var, d2 d2Var) {
        this.f5989a = j2Var;
        this.f5990b = iVar;
        this.f5991c = q0Var;
        this.f5992d = n1Var;
        this.f5993e = z10;
        this.f5994f = eVar;
        this.f5995g = i2Var;
        this.f5996h = d2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARN: Type inference failed for: r7v0, types: [nc.s, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(long r12, ec.c r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof h1.k2
            if (r0 == 0) goto L13
            r0 = r14
            h1.k2 r0 = (h1.k2) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            h1.k2 r0 = new h1.k2
            r0.<init>(r11, r14)
        L18:
            java.lang.Object r14 = r0.X
            dc.a r1 = dc.a.COROUTINE_SUSPENDED
            int r2 = r0.Z
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 != r4) goto L2f
            nc.s r12 = r0.R
            p7.j.I(r14)     // Catch: java.lang.Throwable -> L2b
            r6 = r11
            goto L58
        L2b:
            r0 = move-exception
            r12 = r0
            r6 = r11
            goto L68
        L2f:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            a0.j.p(r12)
            r12 = 0
            return r12
        L36:
            p7.j.I(r14)
            nc.s r7 = new nc.s
            r7.<init>()
            r7.A = r12
            r11.f5997i = r4
            f1.f1 r14 = f1.f1.Default     // Catch: java.lang.Throwable -> L65
            h1.m2 r5 = new h1.m2     // Catch: java.lang.Throwable -> L65
            r10 = 0
            r6 = r11
            r8 = r12
            r5.<init>(r6, r7, r8, r10)     // Catch: java.lang.Throwable -> L62
            r0.R = r7     // Catch: java.lang.Throwable -> L62
            r0.Z = r4     // Catch: java.lang.Throwable -> L62
            java.lang.Object r12 = r11.f(r14, r5, r0)     // Catch: java.lang.Throwable -> L62
            if (r12 != r1) goto L57
            return r1
        L57:
            r12 = r7
        L58:
            r6.f5997i = r3
            long r12 = r12.A
            x4.q r14 = new x4.q
            r14.<init>(r12)
            return r14
        L62:
            r0 = move-exception
        L63:
            r12 = r0
            goto L68
        L65:
            r0 = move-exception
            r6 = r11
            goto L63
        L68:
            r6.f5997i = r3
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: h1.p2.a(long, ec.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x000a, code lost:
        if ((r6 instanceof h1.l) != false) goto L5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(long r4, boolean r6, ec.j r7) {
        /*
            r3 = this;
            yb.y r0 = yb.y.f14813a
            if (r6 == 0) goto Ld
            h1.q0 r6 = r3.f5991c
            g2.l5 r1 = h1.b2.f5860a
            boolean r6 = r6 instanceof h1.l
            if (r6 == 0) goto Ld
            goto L51
        Ld:
            h1.n1 r6 = r3.f5992d
            h1.n1 r1 = h1.n1.Horizontal
            r2 = 0
            if (r6 != r1) goto L1a
            r6 = 1
        L15:
            long r4 = x4.q.a(r4, r2, r2, r6)
            goto L1c
        L1a:
            r6 = 2
            goto L15
        L1c:
            h1.o2 r6 = new h1.o2
            r1 = 0
            r6.<init>(r3, r1)
            f1.i r1 = r3.f5990b
            if (r1 == 0) goto L3f
            h1.j2 r2 = r3.f5989a
            boolean r2 = r2.d()
            if (r2 != 0) goto L36
            h1.j2 r2 = r3.f5989a
            boolean r2 = r2.a()
            if (r2 == 0) goto L3f
        L36:
            java.lang.Object r4 = r1.b(r4, r6, r7)
            dc.a r5 = dc.a.COROUTINE_SUSPENDED
            if (r4 != r5) goto L51
            return r4
        L3f:
            h1.o2 r1 = new h1.o2
            h1.p2 r6 = r6.f5986b0
            r1.<init>(r6, r7)
            r1.Z = r4
            java.lang.Object r4 = r1.v(r0)
            dc.a r5 = dc.a.COROUTINE_SUSPENDED
            if (r4 != r5) goto L51
            return r4
        L51:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: h1.p2.b(long, boolean, ec.j):java.lang.Object");
    }

    public final long c(u1 u1Var, long j2, int i2) {
        int i10;
        u3.h hVar;
        long j10;
        long a10;
        u3.h hVar2;
        long j11;
        long j12;
        a4.q2 q2Var;
        a4.n1 n1Var;
        a4.q2 q2Var2;
        a4.n1 n1Var2;
        u3.h hVar3 = (u3.h) this.f5994f.B;
        int i11 = 262144;
        int i12 = 1;
        p2.b bVar = null;
        if (hVar3 != null && hVar3.f1777h0) {
            if (!hVar3.A.f1777h0) {
                x3.a.c("visitAncestors called on an unattached node");
            }
            b3.o oVar = hVar3.A.X;
            a4.o0 t5 = a4.l.t(hVar3);
            loop0: while (true) {
                if (t5 != null) {
                    if ((t5.A0.f268f.R & i11) != 0) {
                        while (oVar != null) {
                            if ((oVar.L & i11) != 0) {
                                p2.b bVar2 = null;
                                b3.o oVar2 = oVar;
                                while (oVar2 != null) {
                                    if (oVar2 instanceof a4.q2) {
                                        q2Var2 = (a4.q2) oVar2;
                                        i10 = i11;
                                        if (nc.k.a(hVar3.k(), q2Var2.k()) && u3.h.class == q2Var2.getClass()) {
                                            break loop0;
                                        }
                                    } else {
                                        i10 = i11;
                                        if ((oVar2.L & i10) != 0 && (oVar2 instanceof a4.k)) {
                                            int i13 = 0;
                                            for (b3.o oVar3 = ((a4.k) oVar2).f247j0; oVar3 != null; oVar3 = oVar3.Y) {
                                                if ((oVar3.L & i10) != 0) {
                                                    i13++;
                                                    if (i13 == 1) {
                                                        oVar2 = oVar3;
                                                    } else {
                                                        if (bVar2 == null) {
                                                            bVar2 = new p2.b(new b3.o[16]);
                                                        }
                                                        if (oVar2 != null) {
                                                            bVar2.b(oVar2);
                                                            oVar2 = null;
                                                        }
                                                        bVar2.b(oVar3);
                                                    }
                                                }
                                            }
                                            if (i13 == 1) {
                                                i11 = i10;
                                            }
                                        }
                                    }
                                    oVar2 = a4.l.e(bVar2);
                                    i11 = i10;
                                }
                                continue;
                            }
                            oVar = oVar.X;
                            i11 = i11;
                        }
                    }
                    int i14 = i11;
                    t5 = t5.u();
                    if (t5 != null && (n1Var2 = t5.A0) != null) {
                        oVar = n1Var2.f267e;
                    } else {
                        oVar = null;
                    }
                    i11 = i14;
                } else {
                    i10 = i11;
                    q2Var2 = null;
                    break;
                }
            }
            hVar = (u3.h) q2Var2;
        } else {
            i10 = 262144;
            hVar = null;
        }
        if (hVar != null) {
            j10 = hVar.n0(i2, j2);
        } else {
            j10 = 0;
        }
        long d4 = h3.b.d(j2, j10);
        if (this.f5992d == n1.Horizontal) {
            a10 = h3.b.a(d4, 0.0f, 1);
        } else {
            a10 = h3.b.a(d4, 0.0f, 2);
        }
        long e6 = e(h(u1Var.a(g(e(a10)))));
        i2 i2Var = this.f5995g;
        if (i2Var.f1777h0) {
            ViewTreeObserver viewTreeObserver = ((b4.x) a4.l.u(i2Var)).getViewTreeObserver();
            try {
                if (b4.x.I1 == null) {
                    Method declaredMethod = viewTreeObserver.getClass().getDeclaredMethod("dispatchOnScrollChanged", null);
                    declaredMethod.setAccessible(true);
                    b4.x.I1 = declaredMethod;
                }
                Method method = b4.x.I1;
                if (method != null) {
                    method.invoke(viewTreeObserver, null);
                }
            } catch (Exception unused) {
            }
        }
        long d10 = h3.b.d(d4, e6);
        u3.h hVar4 = (u3.h) this.f5994f.B;
        if (hVar4 != null && hVar4.f1777h0) {
            if (!hVar4.A.f1777h0) {
                x3.a.c("visitAncestors called on an unattached node");
            }
            b3.o oVar4 = hVar4.A.X;
            a4.o0 t10 = a4.l.t(hVar4);
            loop3: while (true) {
                if (t10 != null) {
                    if ((t10.A0.f268f.R & i10) != 0) {
                        while (oVar4 != null) {
                            if ((oVar4.L & i10) != 0) {
                                b3.o oVar5 = oVar4;
                                p2.b bVar3 = bVar;
                                while (oVar5 != null) {
                                    if (oVar5 instanceof a4.q2) {
                                        a4.q2 q2Var3 = (a4.q2) oVar5;
                                        if (nc.k.a(hVar4.k(), q2Var3.k()) && u3.h.class == q2Var3.getClass()) {
                                            q2Var = q2Var3;
                                            break loop3;
                                        }
                                    } else if ((oVar5.L & i10) != 0 && (oVar5 instanceof a4.k)) {
                                        b3.o oVar6 = ((a4.k) oVar5).f247j0;
                                        int i15 = 0;
                                        while (oVar6 != null) {
                                            if ((oVar6.L & i10) != 0) {
                                                i15++;
                                                if (i15 == i12) {
                                                    oVar5 = oVar6;
                                                } else {
                                                    if (bVar3 == null) {
                                                        bVar3 = new p2.b(new b3.o[16]);
                                                    }
                                                    if (oVar5 != null) {
                                                        bVar3.b(oVar5);
                                                        oVar5 = null;
                                                    }
                                                    bVar3.b(oVar6);
                                                    oVar6 = oVar6.Y;
                                                    i12 = 1;
                                                }
                                            }
                                            oVar6 = oVar6.Y;
                                            i12 = 1;
                                        }
                                        if (i15 == i12) {
                                        }
                                    }
                                    oVar5 = a4.l.e(bVar3);
                                }
                                continue;
                            }
                            oVar4 = oVar4.X;
                            bVar = null;
                        }
                    }
                    t10 = t10.u();
                    if (t10 != null && (n1Var = t10.A0) != null) {
                        oVar4 = n1Var.f267e;
                    } else {
                        oVar4 = null;
                    }
                    bVar = null;
                } else {
                    q2Var = null;
                    break;
                }
            }
            hVar2 = (u3.h) q2Var;
        } else {
            hVar2 = null;
        }
        if (hVar2 != null) {
            j12 = hVar2.Z(e6, d10, i2);
            j11 = e6;
        } else {
            j11 = e6;
            j12 = 0;
        }
        return h3.b.e(h3.b.e(j10, j11), j12);
    }

    public final float d(float f8) {
        if (this.f5993e) {
            return f8 * (-1);
        }
        return f8;
    }

    public final long e(long j2) {
        if (this.f5993e) {
            return h3.b.f(j2, -1.0f);
        }
        return j2;
    }

    public final Object f(f1.f1 f1Var, mc.p pVar, ec.c cVar) {
        Object c4 = this.f5989a.c(f1Var, new a2.o(this, pVar, (cc.c) null, 28), cVar);
        if (c4 == dc.a.COROUTINE_SUSPENDED) {
            return c4;
        }
        return yb.y.f14813a;
    }

    public final float g(long j2) {
        long j10;
        if (this.f5992d == n1.Horizontal) {
            j10 = j2 >> 32;
        } else {
            j10 = j2 & 4294967295L;
        }
        return Float.intBitsToFloat((int) j10);
    }

    public final long h(float f8) {
        long floatToRawIntBits;
        long floatToRawIntBits2;
        if (f8 == 0.0f) {
            return 0L;
        }
        if (this.f5992d == n1.Horizontal) {
            long floatToRawIntBits3 = Float.floatToRawIntBits(f8);
            floatToRawIntBits = Float.floatToRawIntBits(0.0f);
            floatToRawIntBits2 = floatToRawIntBits3 << 32;
        } else {
            floatToRawIntBits = Float.floatToRawIntBits(f8);
            floatToRawIntBits2 = Float.floatToRawIntBits(0.0f) << 32;
        }
        return floatToRawIntBits2 | (floatToRawIntBits & 4294967295L);
    }

    public final float i(long j2) {
        int i2 = (int) (4294967295L & j2);
        int i10 = (int) (j2 >> 32);
        int i11 = (((float) Math.atan2(Math.abs(Float.intBitsToFloat(i2)), Math.abs(Float.intBitsToFloat(i10)))) > 0.7853981633974483d ? 1 : (((float) Math.atan2(Math.abs(Float.intBitsToFloat(i2)), Math.abs(Float.intBitsToFloat(i10)))) == 0.7853981633974483d ? 0 : -1));
        n1 n1Var = this.f5992d;
        if (i11 >= 0) {
            if (n1Var != n1.Vertical) {
                return 0.0f;
            }
            return Float.intBitsToFloat(i2);
        } else if (n1Var != n1.Horizontal) {
            return 0.0f;
        } else {
            return Float.intBitsToFloat(i10);
        }
    }
}
