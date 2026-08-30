package f2;

import b4.m1;
import java.util.ArrayList;
import u1.k1;
import u1.q1;
import u1.r1;
import zc.l1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b1 {
    public final d0.c A;
    public boolean B;

    /* renamed from: a  reason: collision with root package name */
    public final q1 f4706a;

    /* renamed from: d  reason: collision with root package name */
    public u1.p0 f4709d;

    /* renamed from: g  reason: collision with root package name */
    public mc.a f4712g;

    /* renamed from: h  reason: collision with root package name */
    public m1 f4713h;

    /* renamed from: i  reason: collision with root package name */
    public zc.u f4714i;

    /* renamed from: j  reason: collision with root package name */
    public p f4715j;

    /* renamed from: k  reason: collision with root package name */
    public q3.a f4716k;

    /* renamed from: l  reason: collision with root package name */
    public g3.z f4717l;
    public final n2.f1 m;

    /* renamed from: n  reason: collision with root package name */
    public final n2.f1 f4718n;

    /* renamed from: o  reason: collision with root package name */
    public long f4719o;

    /* renamed from: p  reason: collision with root package name */
    public l4.q0 f4720p;

    /* renamed from: q  reason: collision with root package name */
    public long f4721q;

    /* renamed from: r  reason: collision with root package name */
    public final n2.f1 f4722r;

    /* renamed from: s  reason: collision with root package name */
    public final n2.f1 f4723s;

    /* renamed from: t  reason: collision with root package name */
    public int f4724t;

    /* renamed from: u  reason: collision with root package name */
    public q4.x f4725u;

    /* renamed from: v  reason: collision with root package name */
    public d0.c f4726v;

    /* renamed from: w  reason: collision with root package name */
    public l4.q0 f4727w;

    /* renamed from: x  reason: collision with root package name */
    public final n2.f1 f4728x;

    /* renamed from: y  reason: collision with root package name */
    public final a0.g f4729y;

    /* renamed from: z  reason: collision with root package name */
    public final z0 f4730z;

    /* renamed from: b  reason: collision with root package name */
    public q4.q f4707b = r1.f13423a;

    /* renamed from: c  reason: collision with root package name */
    public mc.l f4708c = new od.x(23);

    /* renamed from: e  reason: collision with root package name */
    public final n2.f1 f4710e = n2.s.w(new q4.x((String) null, 7, 0));

    /* renamed from: f  reason: collision with root package name */
    public q4.g0 f4711f = q4.f0.A;

    public b1(q1 q1Var) {
        this.f4706a = q1Var;
        Boolean bool = Boolean.TRUE;
        this.m = n2.s.w(bool);
        this.f4718n = n2.s.w(bool);
        this.f4719o = 0L;
        this.f4721q = 0L;
        this.f4722r = n2.s.w(null);
        this.f4723s = n2.s.w(null);
        this.f4724t = -1;
        this.f4725u = new q4.x((String) null, 7, 0L);
        this.f4728x = n2.s.w(Boolean.FALSE);
        a0.g gVar = new a0.g(1, false);
        gVar.L = a2.q.Uninitialized;
        this.f4729y = gVar;
        this.f4730z = new z0(this);
        this.A = new d0.c(this);
    }

    public static final yb.j a(b1 b1Var) {
        String str;
        l4.q0 q0Var;
        l4.h m = b1Var.m();
        if (m != null && (str = m.B) != null && (q0Var = b1Var.f4727w) != null) {
            long j2 = q0Var.f8885a;
            return new yb.j(str, new l4.q0(l4.i0.b(b1Var.f4707b.m((int) (j2 >> 32)), b1Var.f4707b.m((int) (j2 & 4294967295L)))));
        }
        return null;
    }

    public static final void b(b1 b1Var, l4.q0 q0Var) {
        l4.h m;
        String str;
        zc.u uVar;
        if (q0Var != null) {
            long j2 = q0Var.f8885a;
            p pVar = b1Var.f4715j;
            if (pVar != null && (m = b1Var.m()) != null && (str = m.B) != null) {
                q4.q qVar = b1Var.f4707b;
                long b10 = l4.i0.b(qVar.m((int) (j2 >> 32)), qVar.m((int) (j2 & 4294967295L)));
                if (str.length() > 0 && !l4.q0.c(b10) && (uVar = b1Var.f4714i) != null) {
                    zc.x.v(uVar, null, null, new y0(pVar, str, b10, q0Var, b1Var, qVar, null), 3);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01c1, code lost:
        r13 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01c4, code lost:
        if ((r6 ^ r13) == false) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01c6, code lost:
        r5 = u1.l0.t(r9, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01cb, code lost:
        r5 = u1.l0.q(r9, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01cf, code lost:
        if (r6 == false) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01d1, code lost:
        r1 = f2.v.a(r4, a.a.l(r1, r3, r5), null, r13, 2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01db, code lost:
        r1 = f2.v.a(r4, null, a.a.l(r7, r3, r5), r13, 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x012b, code lost:
        if (r1.f4794b == r7.f4794b) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0150, code lost:
        if (((l4.o0) r3.f4792e).f8865a.f8853a.B.length() != r5.f4794b) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0154, code lost:
        r5 = (f2.v) r9.L;
        r6 = ((l4.o0) r3.f4792e).f8865a.f8853a.B;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0162, code lost:
        if (r5 == null) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0168, code lost:
        if (r6.length() != 0) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x016c, code lost:
        r6 = r9.B;
        r8 = ((l4.o0) r3.f4792e).f8865a.f8853a.B;
        r9 = r3.f4789b;
        r10 = r8.length();
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x017f, code lost:
        if (r9 != 0) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0181, code lost:
        r5 = u1.l0.q(0, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0186, code lost:
        if (r6 == false) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0188, code lost:
        r1 = f2.v.a(r4, a.a.l(r1, r3, r5), null, true, 2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0193, code lost:
        r1 = f2.v.a(r4, null, a.a.l(r7, r3, r5), false, 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01a0, code lost:
        if (r9 != r10) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01a2, code lost:
        r5 = u1.l0.t(r10, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01a6, code lost:
        if (r6 == false) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01a8, code lost:
        r1 = f2.v.a(r4, a.a.l(r1, r3, r5), null, false, 2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01b2, code lost:
        r1 = f2.v.a(r4, null, a.a.l(r7, r3, r5), true, 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01bd, code lost:
        if (r5.f4798c != true) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01bf, code lost:
        r13 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long c(f2.b1 r22, q4.x r23, long r24, boolean r26, boolean r27, a0.j r28, boolean r29) {
        /*
            Method dump skipped, instructions count: 770
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f2.b1.c(f2.b1, q4.x, long, boolean, boolean, a0.j, boolean):long");
    }

    public static q4.x e(l4.h hVar, long j2) {
        return new q4.x(hVar, j2, (l4.q0) null);
    }

    public final l1 d(boolean z10) {
        zc.u uVar = this.f4714i;
        if (uVar == null) {
            return null;
        }
        return zc.x.v(uVar, null, zc.w.UNDISPATCHED, new ah.z0(this, z10, null, 1), 1);
    }

    public final void f() {
        zc.u uVar = this.f4714i;
        if (uVar != null) {
            zc.x.v(uVar, null, zc.w.UNDISPATCHED, new t0(this, null, 1), 1);
        }
    }

    public final void g(h3.b bVar) {
        u1.d0 d0Var;
        k1 k1Var;
        int e6;
        if (!l4.q0.c(n().f12277b)) {
            u1.p0 p0Var = this.f4709d;
            if (p0Var != null) {
                k1Var = p0Var.d();
            } else {
                k1Var = null;
            }
            if (bVar != null && k1Var != null) {
                e6 = this.f4707b.l(k1Var.b(bVar.f6050a, true));
            } else {
                e6 = l4.q0.e(n().f12277b);
            }
            q4.x a10 = q4.x.a(n(), null, l4.i0.b(e6, e6), 5);
            this.f4708c.k(a10);
            this.f4727w = new l4.q0(a10.f12277b);
        }
        if (bVar != null && n().f12276a.B.length() > 0) {
            d0Var = u1.d0.Cursor;
        } else {
            d0Var = u1.d0.None;
        }
        q(d0Var);
        t(false);
    }

    public final void h(boolean z10) {
        g3.z zVar;
        u1.p0 p0Var = this.f4709d;
        if (p0Var != null && !p0Var.b() && (zVar = this.f4717l) != null) {
            g3.z.a(zVar);
        }
        this.f4725u = n();
        t(z10);
        q(u1.d0.Selection);
    }

    public final h3.b i() {
        return (h3.b) this.f4723s.getValue();
    }

    public final boolean j() {
        return ((Boolean) this.m.getValue()).booleanValue();
    }

    public final boolean k() {
        return ((Boolean) this.f4718n.getValue()).booleanValue();
    }

    public final long l(boolean z10) {
        k1 d4;
        long j2;
        int d10;
        int max;
        boolean z11;
        int d11;
        float i2;
        u1.p0 p0Var = this.f4709d;
        if (p0Var != null && (d4 = p0Var.d()) != null) {
            l4.o0 o0Var = d4.f13358a;
            l4.q qVar = o0Var.f8866b;
            l4.h m = m();
            if (m != null) {
                if (nc.k.a(m.B, o0Var.f8865a.f8853a.B)) {
                    q4.x n10 = n();
                    if (z10) {
                        long j10 = n10.f12277b;
                        int i10 = l4.q0.f8884c;
                        j2 = j10 >> 32;
                    } else {
                        long j11 = n10.f12277b;
                        int i11 = l4.q0.f8884c;
                        j2 = j11 & 4294967295L;
                    }
                    int m10 = this.f4707b.m((int) j2);
                    boolean g10 = l4.q0.g(n().f12277b);
                    long j12 = o0Var.f8867c;
                    if (qVar.d(m10) < qVar.f8880f) {
                        if ((z10 && !g10) || (!z10 && g10)) {
                            max = m10;
                        } else {
                            max = Math.max(m10 - 1, 0);
                        }
                        if (o0Var.a(max) == o0Var.g(m10)) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        qVar.l(m10);
                        int length = ((l4.h) qVar.f8875a.A).B.length();
                        ArrayList arrayList = qVar.f8882h;
                        if (m10 == length) {
                            d11 = p7.t.l(arrayList);
                        } else {
                            d11 = l4.i0.d(m10, arrayList);
                        }
                        l4.s sVar = (l4.s) arrayList.get(d11);
                        l4.b bVar = sVar.f8890a;
                        int d12 = sVar.d(m10);
                        m4.k kVar = bVar.f8783d;
                        if (z11) {
                            i2 = kVar.h(d12, false);
                        } else {
                            i2 = kVar.i(d12, false);
                        }
                        float f8 = p7.j.f(i2, 0.0f, (int) (j12 >> 32));
                        return (Float.floatToRawIntBits(p7.j.f(qVar.b(d10), 0.0f, (int) (j12 & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits(f8) << 32);
                    }
                    return 9205357640488583168L;
                }
                return 9205357640488583168L;
            }
            return 9205357640488583168L;
        }
        return 9205357640488583168L;
    }

    public final l4.h m() {
        u1.p0 p0Var = this.f4709d;
        if (p0Var != null) {
            return p0Var.f13379a.f13443a;
        }
        return null;
    }

    public final q4.x n() {
        return (q4.x) this.f4710e.getValue();
    }

    public final void o() {
        l1 l1Var;
        a2.p pVar = (a2.p) this.f4729y.B;
        if (pVar != null && (l1Var = pVar.f144o0) != null) {
            l1Var.i(null);
            pVar.f144o0 = null;
        }
    }

    public final void p() {
        zc.u uVar = this.f4714i;
        if (uVar != null) {
            zc.x.v(uVar, null, zc.w.UNDISPATCHED, new t0(this, null, 2), 1);
        }
    }

    public final void q(u1.d0 d0Var) {
        u1.p0 p0Var = this.f4709d;
        if (p0Var != null) {
            if (p0Var.a() == d0Var) {
                p0Var = null;
            }
            if (p0Var != null) {
                p0Var.f13389k.setValue(d0Var);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0027, code lost:
        if (((java.lang.Boolean) r4.f13394q.getValue()).booleanValue() == false) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void r() {
        /*
            r8 = this;
            z2.f r0 = z2.q.e()
            r1 = 0
            if (r0 == 0) goto Lc
            mc.l r2 = r0.e()
            goto Ld
        Lc:
            r2 = r1
        Ld:
            z2.f r3 = z2.q.h(r0)
            boolean r4 = r8.k()     // Catch: java.lang.Throwable -> L71
            if (r4 == 0) goto L73
            u1.p0 r4 = r8.f4709d     // Catch: java.lang.Throwable -> L71
            if (r4 == 0) goto L2a
            n2.f1 r4 = r4.f13394q     // Catch: java.lang.Throwable -> L71
            java.lang.Object r4 = r4.getValue()     // Catch: java.lang.Throwable -> L71
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch: java.lang.Throwable -> L71
            boolean r4 = r4.booleanValue()     // Catch: java.lang.Throwable -> L71
            if (r4 != 0) goto L2a
            goto L73
        L2a:
            z2.q.k(r0, r3, r2)
            a0.g r0 = r8.f4729y
            java.lang.Object r2 = r0.L
            a2.q r2 = (a2.q) r2
            a2.q r3 = a2.q.Uninitialized
            if (r2 == r3) goto L38
            goto L3d
        L38:
            java.lang.String r2 = "ToolbarRequester is not initialized."
            k1.b.c(r2)
        L3d:
            java.lang.Object r0 = r0.B
            a2.p r0 = (a2.p) r0
            if (r0 == 0) goto L70
            boolean r2 = r0.f1777h0
            if (r2 == 0) goto L70
            zc.l1 r2 = r0.f144o0
            r3 = 1
            if (r2 == 0) goto L53
            boolean r2 = r2.d()
            if (r2 != r3) goto L53
            goto L70
        L53:
            n2.b0 r2 = b2.i.f1749b
            java.lang.Object r2 = a4.l.h(r0, r2)
            b2.h r2 = (b2.h) r2
            if (r2 != 0) goto L5e
            goto L70
        L5e:
            zc.u r4 = r0.C0()
            zc.w r5 = zc.w.UNDISPATCHED
            a2.o r6 = new a2.o
            r7 = 0
            r6.<init>(r0, r2, r1, r7)
            zc.l1 r1 = zc.x.v(r4, r1, r5, r6, r3)
            r0.f144o0 = r1
        L70:
            return
        L71:
            r1 = move-exception
            goto L77
        L73:
            z2.q.k(r0, r3, r2)
            return
        L77:
            z2.q.k(r0, r3, r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: f2.b1.r():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object s(ec.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof f2.a1
            if (r0 == 0) goto L13
            r0 = r5
            f2.a1 r0 = (f2.a1) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            f2.a1 r0 = new f2.a1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.X
            dc.a r1 = dc.a.COROUTINE_SUSPENDED
            int r2 = r0.Z
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L29
            f2.b1 r0 = r0.R
            p7.j.I(r5)
            goto L5a
        L29:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            a0.j.p(r5)
            r5 = 0
            return r5
        L30:
            p7.j.I(r5)
            b4.m1 r5 = r4.f4713h
            if (r5 == 0) goto L64
            r0.R = r4
            r0.Z = r3
            b4.i r5 = (b4.i) r5
            b4.j r5 = r5.f1856a
            android.content.ClipboardManager r5 = r5.f1864a
            android.content.ClipDescription r5 = r5.getPrimaryClipDescription()
            r0 = 0
            if (r5 == 0) goto L51
            java.lang.String r2 = "text/*"
            boolean r5 = r5.hasMimeType(r2)
            if (r5 != r3) goto L51
            goto L52
        L51:
            r3 = r0
        L52:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            if (r5 != r1) goto L59
            return r1
        L59:
            r0 = r4
        L5a:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            r5.getClass()
            n2.f1 r0 = r0.f4728x
            r0.setValue(r5)
        L64:
            yb.y r5 = yb.y.f14813a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: f2.b1.s(ec.c):java.lang.Object");
    }

    public final void t(boolean z10) {
        u1.p0 p0Var = this.f4709d;
        if (p0Var != null) {
            p0Var.f13390l.setValue(Boolean.valueOf(z10));
        }
        if (z10) {
            r();
        } else {
            o();
        }
    }
}
