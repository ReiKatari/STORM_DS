package q1;

import androidx.preference.Preference;
import h1.j2;
import java.util.List;
import n2.b1;
import n2.c1;
import n2.f1;
import n2.w0;
import p1.i0;
import p1.l0;
import p1.m0;
import p1.n0;
import p1.o0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class a0 implements j2 {
    public long A;
    public final l0 B;
    public final w0 C;
    public final w0 D;
    public final f1 E;
    public final f1 F;
    public final f1 G;
    public final f1 H;

    /* renamed from: a  reason: collision with root package name */
    public boolean f12093a;

    /* renamed from: b  reason: collision with root package name */
    public s f12094b;

    /* renamed from: c  reason: collision with root package name */
    public final f1 f12095c;

    /* renamed from: d  reason: collision with root package name */
    public final u f12096d;

    /* renamed from: e  reason: collision with root package name */
    public int f12097e;

    /* renamed from: f  reason: collision with root package name */
    public int f12098f;

    /* renamed from: g  reason: collision with root package name */
    public long f12099g;

    /* renamed from: h  reason: collision with root package name */
    public long f12100h;

    /* renamed from: i  reason: collision with root package name */
    public float f12101i;

    /* renamed from: j  reason: collision with root package name */
    public float f12102j;

    /* renamed from: k  reason: collision with root package name */
    public final h1.n f12103k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f12104l;
    public int m;

    /* renamed from: n  reason: collision with root package name */
    public n0 f12105n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f12106o;

    /* renamed from: p  reason: collision with root package name */
    public final f1 f12107p;

    /* renamed from: q  reason: collision with root package name */
    public x4.c f12108q;

    /* renamed from: r  reason: collision with root package name */
    public final j1.i f12109r;

    /* renamed from: s  reason: collision with root package name */
    public final c1 f12110s;

    /* renamed from: t  reason: collision with root package name */
    public final c1 f12111t;

    /* renamed from: u  reason: collision with root package name */
    public final o0 f12112u;

    /* renamed from: v  reason: collision with root package name */
    public final k f12113v;

    /* renamed from: w  reason: collision with root package name */
    public final h1.a f12114w;

    /* renamed from: x  reason: collision with root package name */
    public final p1.d f12115x;

    /* renamed from: y  reason: collision with root package name */
    public final f1 f12116y;

    /* renamed from: z  reason: collision with root package name */
    public final n1.v f12117z;

    /* JADX WARN: Type inference failed for: r5v4, types: [p1.d, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.lang.Object, q1.h] */
    public a0(int i2, float f8) {
        double d4 = f8;
        if (-0.5d > d4 || d4 > 0.5d) {
            k1.b.a("currentPageOffsetFraction " + f8 + " is not within the range -0.5 to 0.5");
        }
        this.f12095c = n2.s.w(new h3.b(0L));
        this.f12096d = new u(i2, f8, this);
        this.f12097e = i2;
        this.f12099g = Long.MAX_VALUE;
        this.f12103k = new h1.n(new mc.l(this) { // from class: q1.w
            public final /* synthetic */ a0 B;

            {
                this.B = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.Float] */
            /* JADX WARN: Type inference failed for: r14v3, types: [java.lang.Number] */
            /* JADX WARN: Type inference failed for: r14v4, types: [java.lang.Long] */
            @Override // mc.l
            public final Object k(Object obj) {
                boolean z10;
                s sVar;
                boolean z11;
                mc.l lVar;
                switch (r2) {
                    case 0:
                        ?? r14 = (Float) obj;
                        float floatValue = r14.floatValue();
                        a0 a0Var = this.B;
                        long r5 = p7.m.r(a0Var);
                        float f10 = a0Var.f12101i + floatValue;
                        long N = pc.a.N(f10);
                        a0Var.f12101i = f10 - ((float) N);
                        if (Math.abs(floatValue) >= 1.0E-4f) {
                            long j2 = r5 + N;
                            long h2 = p7.j.h(j2, a0Var.f12100h, a0Var.f12099g);
                            boolean z12 = false;
                            if (j2 != h2) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            long j10 = h2 - r5;
                            float f11 = (float) j10;
                            a0Var.f12102j = f11;
                            float f12 = 0.0f;
                            if (Math.abs(j10) != 0) {
                                f1 f1Var = a0Var.G;
                                if (f11 > 0.0f) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                f1Var.setValue(Boolean.valueOf(z11));
                                f1 f1Var2 = a0Var.H;
                                if (f11 < 0.0f) {
                                    z12 = true;
                                }
                                f1Var2.setValue(Boolean.valueOf(z12));
                            }
                            int i10 = (int) j10;
                            int i11 = -i10;
                            s f13 = ((s) a0Var.f12107p.getValue()).f(i11);
                            if (f13 != null && (sVar = a0Var.f12094b) != null) {
                                s f14 = sVar.f(i11);
                                if (f14 != null) {
                                    a0Var.f12094b = f14;
                                } else {
                                    f13 = null;
                                }
                            }
                            if (f13 != null) {
                                a0Var.g(f13, a0Var.f12093a, true);
                                a0Var.C.setValue(yb.y.f14813a);
                            } else {
                                u uVar = a0Var.f12096d;
                                a0 a0Var2 = (a0) uVar.f12195b;
                                b1 b1Var = (b1) uVar.f12197d;
                                if (a0Var2.p() != 0) {
                                    f12 = i10 / a0Var2.p();
                                }
                                b1Var.h(b1Var.g() + f12);
                                a4.o0 o0Var = (a4.o0) a0Var.f12116y.getValue();
                                if (o0Var != null) {
                                    o0Var.k();
                                }
                            }
                            if (z10) {
                                r14 = Long.valueOf(j10);
                            }
                            floatValue = r14.floatValue();
                        }
                        return Float.valueOf(floatValue);
                    default:
                        a0 a0Var3 = this.B;
                        m0 m0Var = (m0) obj;
                        z2.f e6 = z2.q.e();
                        if (e6 != null) {
                            lVar = e6.e();
                        } else {
                            lVar = null;
                        }
                        z2.f h10 = z2.q.h(e6);
                        try {
                            m0Var.a(a0Var3.f12097e);
                            z2.q.k(e6, h10, lVar);
                            return yb.y.f14813a;
                        } catch (Throwable th2) {
                            z2.q.k(e6, h10, lVar);
                            throw th2;
                        }
                }
            }
        });
        this.f12104l = true;
        this.m = -1;
        this.f12107p = new f1(d0.f12128c, n2.e.R);
        this.f12108q = d0.f12127b;
        this.f12109r = new j1.i();
        this.f12110s = new c1(-1);
        this.f12111t = new c1(i2);
        n2.e eVar = n2.e.Z;
        n2.s.r(new c(this, 2), eVar);
        n2.s.r(new c(this, 3), eVar);
        o0 o0Var = new o0(new mc.l(this) { // from class: q1.w
            public final /* synthetic */ a0 B;

            {
                this.B = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.Float] */
            /* JADX WARN: Type inference failed for: r14v3, types: [java.lang.Number] */
            /* JADX WARN: Type inference failed for: r14v4, types: [java.lang.Long] */
            @Override // mc.l
            public final Object k(Object obj) {
                boolean z10;
                s sVar;
                boolean z11;
                mc.l lVar;
                switch (r2) {
                    case 0:
                        ?? r14 = (Float) obj;
                        float floatValue = r14.floatValue();
                        a0 a0Var = this.B;
                        long r5 = p7.m.r(a0Var);
                        float f10 = a0Var.f12101i + floatValue;
                        long N = pc.a.N(f10);
                        a0Var.f12101i = f10 - ((float) N);
                        if (Math.abs(floatValue) >= 1.0E-4f) {
                            long j2 = r5 + N;
                            long h2 = p7.j.h(j2, a0Var.f12100h, a0Var.f12099g);
                            boolean z12 = false;
                            if (j2 != h2) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            long j10 = h2 - r5;
                            float f11 = (float) j10;
                            a0Var.f12102j = f11;
                            float f12 = 0.0f;
                            if (Math.abs(j10) != 0) {
                                f1 f1Var = a0Var.G;
                                if (f11 > 0.0f) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                f1Var.setValue(Boolean.valueOf(z11));
                                f1 f1Var2 = a0Var.H;
                                if (f11 < 0.0f) {
                                    z12 = true;
                                }
                                f1Var2.setValue(Boolean.valueOf(z12));
                            }
                            int i10 = (int) j10;
                            int i11 = -i10;
                            s f13 = ((s) a0Var.f12107p.getValue()).f(i11);
                            if (f13 != null && (sVar = a0Var.f12094b) != null) {
                                s f14 = sVar.f(i11);
                                if (f14 != null) {
                                    a0Var.f12094b = f14;
                                } else {
                                    f13 = null;
                                }
                            }
                            if (f13 != null) {
                                a0Var.g(f13, a0Var.f12093a, true);
                                a0Var.C.setValue(yb.y.f14813a);
                            } else {
                                u uVar = a0Var.f12096d;
                                a0 a0Var2 = (a0) uVar.f12195b;
                                b1 b1Var = (b1) uVar.f12197d;
                                if (a0Var2.p() != 0) {
                                    f12 = i10 / a0Var2.p();
                                }
                                b1Var.h(b1Var.g() + f12);
                                a4.o0 o0Var2 = (a4.o0) a0Var.f12116y.getValue();
                                if (o0Var2 != null) {
                                    o0Var2.k();
                                }
                            }
                            if (z10) {
                                r14 = Long.valueOf(j10);
                            }
                            floatValue = r14.floatValue();
                        }
                        return Float.valueOf(floatValue);
                    default:
                        a0 a0Var3 = this.B;
                        m0 m0Var = (m0) obj;
                        z2.f e6 = z2.q.e();
                        if (e6 != null) {
                            lVar = e6.e();
                        } else {
                            lVar = null;
                        }
                        z2.f h10 = z2.q.h(e6);
                        try {
                            m0Var.a(a0Var3.f12097e);
                            z2.q.k(e6, h10, lVar);
                            return yb.y.f14813a;
                        } catch (Throwable th2) {
                            z2.q.k(e6, h10, lVar);
                            throw th2;
                        }
                }
            }
        });
        this.f12112u = o0Var;
        this.f12113v = new k(new Object(), o0Var, new c(this, 4));
        this.f12114w = new h1.a(1);
        this.f12115x = new Object();
        this.f12116y = n2.s.w(null);
        this.f12117z = new n1.v(this, 2);
        this.A = x4.b.b(0, 0, 15);
        this.B = new l0();
        this.C = p1.l.h();
        this.D = p1.l.h();
        Boolean bool = Boolean.FALSE;
        this.E = n2.s.w(bool);
        this.F = n2.s.w(bool);
        this.G = n2.s.w(bool);
        this.H = n2.s.w(bool);
    }

    public static int i(boolean z10, s sVar) {
        List list = sVar.f12173a;
        int i2 = sVar.f12180h;
        if (z10) {
            int i10 = i2 + 1;
            if (i10 < 0) {
                return Preference.DEFAULT_ORDER;
            }
            return ((g) zb.l.Z(list)).f12133a + i10;
        }
        return (((g) zb.l.R(list)).f12133a - i2) - 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0052, code lost:
        if (r5.h(r0) == r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0075, code lost:
        if (r8.c(r6, r7, r0) != r1) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0077, code lost:
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object t(q1.a0 r5, f1.f1 r6, mc.p r7, cc.c r8) {
        /*
            boolean r0 = r8 instanceof q1.z
            if (r0 == 0) goto L13
            r0 = r8
            q1.z r0 = (q1.z) r0
            int r1 = r0.f12205c0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12205c0 = r1
            goto L18
        L13:
            q1.z r0 = new q1.z
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.Z
            dc.a r1 = dc.a.COROUTINE_SUSPENDED
            int r2 = r0.f12205c0
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2c
            q1.a0 r5 = r0.R
            p7.j.I(r8)
            goto L78
        L2c:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            a0.j.p(r5)
            r5 = 0
            return r5
        L33:
            ec.j r5 = r0.Y
            r7 = r5
            mc.p r7 = (mc.p) r7
            f1.f1 r6 = r0.X
            q1.a0 r5 = r0.R
            p7.j.I(r8)
            goto L55
        L40:
            p7.j.I(r8)
            r0.R = r5
            r0.X = r6
            r8 = r7
            ec.j r8 = (ec.j) r8
            r0.Y = r8
            r0.f12205c0 = r4
            java.lang.Object r8 = r5.h(r0)
            if (r8 != r1) goto L55
            goto L77
        L55:
            h1.n r8 = r5.f12103k
            boolean r8 = r8.b()
            if (r8 != 0) goto L66
            int r8 = r5.k()
            n2.c1 r2 = r5.f12111t
            r2.h(r8)
        L66:
            h1.n r8 = r5.f12103k
            r0.R = r5
            r2 = 0
            r0.X = r2
            r0.Y = r2
            r0.f12205c0 = r3
            java.lang.Object r6 = r8.c(r6, r7, r0)
            if (r6 != r1) goto L78
        L77:
            return r1
        L78:
            r6 = -1
            n2.c1 r5 = r5.f12110s
            r5.h(r6)
            yb.y r5 = yb.y.f14813a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: q1.a0.t(q1.a0, f1.f1, mc.p, cc.c):java.lang.Object");
    }

    @Override // h1.j2
    public final boolean a() {
        return ((Boolean) this.F.getValue()).booleanValue();
    }

    @Override // h1.j2
    public final boolean b() {
        return this.f12103k.b();
    }

    @Override // h1.j2
    public final Object c(f1.f1 f1Var, mc.p pVar, cc.c cVar) {
        return t(this, f1Var, pVar, cVar);
    }

    @Override // h1.j2
    public final boolean d() {
        return ((Boolean) this.E.getValue()).booleanValue();
    }

    @Override // h1.j2
    public final float e(float f8) {
        return this.f12103k.e(f8);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a9 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(int r13, d1.a1 r14, ec.c r15) {
        /*
            r12 = this;
            boolean r0 = r15 instanceof q1.x
            if (r0 == 0) goto L13
            r0 = r15
            q1.x r0 = (q1.x) r0
            int r1 = r0.f12200b0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12200b0 = r1
            goto L18
        L13:
            q1.x r0 = new q1.x
            r0.<init>(r12, r15)
        L18:
            java.lang.Object r15 = r0.Y
            dc.a r1 = dc.a.COROUTINE_SUSPENDED
            int r2 = r0.f12200b0
            r3 = 0
            yb.y r4 = yb.y.f14813a
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L3d
            if (r2 == r6) goto L34
            if (r2 != r5) goto L2d
            p7.j.I(r15)
            return r4
        L2d:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            a0.j.p(r13)
            r13 = 0
            return r13
        L34:
            int r13 = r0.R
            d1.a1 r14 = r0.X
            p7.j.I(r15)
        L3b:
            r10 = r14
            goto L65
        L3d:
            p7.j.I(r15)
            int r15 = r12.k()
            if (r13 != r15) goto L50
            float r15 = r12.l()
            int r15 = (r15 > r3 ? 1 : (r15 == r3 ? 0 : -1))
            if (r15 != 0) goto L50
        L4e:
            r7 = r12
            goto La9
        L50:
            int r15 = r12.n()
            if (r15 != 0) goto L57
            goto L4e
        L57:
            r0.X = r14
            r0.R = r13
            r0.f12200b0 = r6
            java.lang.Object r15 = r12.h(r0)
            if (r15 != r1) goto L3b
            r7 = r12
            goto La8
        L65:
            double r14 = (double) r3
            r6 = -4620693217682128896(0xbfe0000000000000, double:-0.5)
            int r2 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
            if (r2 > 0) goto L73
            r6 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            int r14 = (r14 > r6 ? 1 : (r14 == r6 ? 0 : -1))
            if (r14 > 0) goto L73
            goto L89
        L73:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            java.lang.String r15 = "pageOffsetFraction "
            r14.<init>(r15)
            r14.append(r3)
            java.lang.String r15 = " is not within the range -0.5 to 0.5"
            r14.append(r15)
            java.lang.String r14 = r14.toString()
            k1.b.a(r14)
        L89:
            int r8 = r12.j(r13)
            int r13 = r12.p()
            float r13 = (float) r13
            float r9 = r3 * r13
            q1.y r6 = new q1.y
            r11 = 0
            r7 = r12
            r6.<init>(r7, r8, r9, r10, r11)
            r13 = 0
            r0.X = r13
            r0.f12200b0 = r5
            f1.f1 r13 = f1.f1.Default
            java.lang.Object r13 = r12.c(r13, r6, r0)
            if (r13 != r1) goto La9
        La8:
            return r1
        La9:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: q1.a0.f(int, d1.a1, ec.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0129 A[Catch: all -> 0x0163, TRY_LEAVE, TryCatch #0 {all -> 0x0163, blocks: (B:53:0x00bd, B:57:0x00cc, B:60:0x00d5, B:63:0x00e2, B:65:0x00ee, B:77:0x0129, B:71:0x011e, B:68:0x0106), top: B:92:0x00bd }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(q1.s r10, boolean r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q1.a0.g(q1.s, boolean, boolean):void");
    }

    public final Object h(ec.c cVar) {
        Object h2;
        if (this.f12107p.getValue() == d0.f12128c && (h2 = this.f12115x.h(cVar)) == dc.a.COROUTINE_SUSPENDED) {
            return h2;
        }
        return yb.y.f14813a;
    }

    public final int j(int i2) {
        if (n() <= 0) {
            return 0;
        }
        return p7.j.g(i2, 0, n() - 1);
    }

    public final int k() {
        return ((c1) this.f12096d.f12196c).g();
    }

    public final float l() {
        return ((b1) this.f12096d.f12197d).g();
    }

    public final s m() {
        return (s) this.f12107p.getValue();
    }

    public abstract int n();

    public final int o() {
        return ((s) this.f12107p.getValue()).f12174b;
    }

    public final int p() {
        return ((s) this.f12107p.getValue()).f12175c + o();
    }

    public final long q() {
        return ((h3.b) this.f12095c.getValue()).f6050a;
    }

    public final boolean r() {
        if (((int) Float.intBitsToFloat((int) (q() >> 32))) == 0 && ((int) Float.intBitsToFloat((int) (q() & 4294967295L))) == 0) {
            return true;
        }
        return false;
    }

    public final void s(float f8, s sVar) {
        boolean z10;
        n0 n0Var;
        n0 n0Var2;
        n0 n0Var3;
        List list = sVar.f12173a;
        if (this.f12104l && !list.isEmpty()) {
            if (f8 > 0.0f) {
                z10 = true;
            } else {
                z10 = false;
            }
            int i2 = i(z10, sVar);
            if (i2 >= 0 && i2 < n()) {
                if (i2 != this.m) {
                    if (this.f12106o != z10 && (n0Var3 = this.f12105n) != null) {
                        n0Var3.cancel();
                    }
                    this.f12106o = z10;
                    this.m = i2;
                    this.f12105n = this.f12112u.a(i2, this.A, true, null);
                }
                if (z10) {
                    if ((((g) zb.l.Z(list)).f12142j + (sVar.f12174b + sVar.f12175c)) - sVar.f12179g < f8 && (n0Var2 = this.f12105n) != null) {
                        n0Var2.a();
                    }
                } else if (sVar.f12178f - ((g) zb.l.R(list)).f12142j < (-f8) && (n0Var = this.f12105n) != null) {
                    n0Var.a();
                }
            }
        }
    }

    public final void u(int i2, float f8, boolean z10) {
        u uVar = this.f12096d;
        b1 b1Var = (b1) uVar.f12197d;
        if (((c1) uVar.f12196c).g() != i2 || b1Var.g() != f8) {
            this.f12113v.b();
        }
        ((c1) uVar.f12196c).h(i2);
        ((i0) uVar.f12199f).a(i2);
        b1Var.h(f8);
        uVar.f12198e = null;
        if (z10) {
            a4.o0 o0Var = (a4.o0) this.f12116y.getValue();
            if (o0Var != null) {
                o0Var.k();
                return;
            }
            return;
        }
        this.D.setValue(yb.y.f14813a);
    }
}
