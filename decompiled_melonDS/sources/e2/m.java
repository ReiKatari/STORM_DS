package e2;

import a2.n;
import a4.a0;
import a4.l2;
import a4.p;
import b3.o;
import i3.t;
import i4.v;
import i4.w;
import i4.x;
import java.util.HashMap;
import l4.r0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class m extends o implements a0, p, l2 {

    /* renamed from: i0  reason: collision with root package name */
    public String f4239i0;

    /* renamed from: j0  reason: collision with root package name */
    public r0 f4240j0;

    /* renamed from: k0  reason: collision with root package name */
    public p4.d f4241k0;

    /* renamed from: l0  reason: collision with root package name */
    public int f4242l0;

    /* renamed from: m0  reason: collision with root package name */
    public boolean f4243m0;

    /* renamed from: n0  reason: collision with root package name */
    public int f4244n0;

    /* renamed from: o0  reason: collision with root package name */
    public int f4245o0;
    public t p0;

    /* renamed from: q0  reason: collision with root package name */
    public HashMap f4246q0;

    /* renamed from: r0  reason: collision with root package name */
    public e f4247r0;

    /* renamed from: s0  reason: collision with root package name */
    public k f4248s0;

    /* renamed from: t0  reason: collision with root package name */
    public l f4249t0;

    /* JADX WARN: Code restructure failed: missing block: B:10:0x000e, code lost:
        if (r3 != null) goto L9;
     */
    @Override // a4.a0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int B0(a4.x0 r2, y3.u0 r3, int r4) {
        /*
            r1 = this;
            e2.l r3 = r1.f4249t0
            if (r3 == 0) goto L10
            boolean r0 = r3.f4237c
            if (r0 == 0) goto L9
            goto La
        L9:
            r3 = 0
        La:
            if (r3 == 0) goto L10
            e2.e r3 = r3.f4238d
            if (r3 != 0) goto L14
        L10:
            e2.e r3 = r1.O0()
        L14:
            r3.d(r2)
            x4.m r2 = r2.getLayoutDirection()
            int r2 = r3.a(r4, r2)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: e2.m.B0(a4.x0, y3.u0, int):int");
    }

    @Override // b3.o
    public final boolean D0() {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x000e, code lost:
        if (r3 != null) goto L9;
     */
    @Override // a4.a0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int K(a4.x0 r2, y3.u0 r3, int r4) {
        /*
            r1 = this;
            e2.l r3 = r1.f4249t0
            if (r3 == 0) goto L10
            boolean r0 = r3.f4237c
            if (r0 == 0) goto L9
            goto La
        L9:
            r3 = 0
        La:
            if (r3 == 0) goto L10
            e2.e r3 = r3.f4238d
            if (r3 != 0) goto L14
        L10:
            e2.e r3 = r1.O0()
        L14:
            r3.d(r2)
            x4.m r2 = r2.getLayoutDirection()
            int r2 = r3.a(r4, r2)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: e2.m.K(a4.x0, y3.u0, int):int");
    }

    public final e O0() {
        if (this.f4247r0 == null) {
            this.f4247r0 = new e(this.f4239i0, this.f4240j0, this.f4241k0, this.f4242l0, this.f4243m0, this.f4244n0, this.f4245o0);
        }
        e eVar = this.f4247r0;
        eVar.getClass();
        return eVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0013, code lost:
        if (r0 != null) goto L11;
     */
    @Override // a4.a0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final y3.w0 d(y3.x0 r5, y3.u0 r6, long r7) {
        /*
            r4 = this;
            java.lang.String r0 = "TextStringSimpleNode::measure"
            android.os.Trace.beginSection(r0)
            e2.l r0 = r4.f4249t0     // Catch: java.lang.Throwable -> L4a
            if (r0 == 0) goto L15
            boolean r1 = r0.f4237c     // Catch: java.lang.Throwable -> L4a
            if (r1 == 0) goto Le
            goto Lf
        Le:
            r0 = 0
        Lf:
            if (r0 == 0) goto L15
            e2.e r0 = r0.f4238d     // Catch: java.lang.Throwable -> L4a
            if (r0 != 0) goto L19
        L15:
            e2.e r0 = r4.O0()     // Catch: java.lang.Throwable -> L4a
        L19:
            r0.d(r5)     // Catch: java.lang.Throwable -> L4a
            x4.m r1 = r5.getLayoutDirection()     // Catch: java.lang.Throwable -> L4a
            boolean r7 = r0.b(r7, r1)     // Catch: java.lang.Throwable -> L4a
            l4.u r8 = r0.f4190n     // Catch: java.lang.Throwable -> L4a
            if (r8 == 0) goto L2b
            r8.b()     // Catch: java.lang.Throwable -> L4a
        L2b:
            l4.b r8 = r0.f4187j     // Catch: java.lang.Throwable -> L4a
            r8.getClass()     // Catch: java.lang.Throwable -> L4a
            m4.k r8 = r8.f8783d     // Catch: java.lang.Throwable -> L4a
            long r0 = r0.f4189l     // Catch: java.lang.Throwable -> L4a
            if (r7 == 0) goto L73
            r7 = 2
            a4.r1 r2 = a4.l.r(r4, r7)     // Catch: java.lang.Throwable -> L4a
            r2.e1()     // Catch: java.lang.Throwable -> L4a
            java.util.HashMap r2 = r4.f4246q0     // Catch: java.lang.Throwable -> L4a
            if (r2 != 0) goto L4c
            java.util.HashMap r2 = new java.util.HashMap     // Catch: java.lang.Throwable -> L4a
            r2.<init>(r7)     // Catch: java.lang.Throwable -> L4a
            r4.f4246q0 = r2     // Catch: java.lang.Throwable -> L4a
            goto L4c
        L4a:
            r5 = move-exception
            goto L9a
        L4c:
            y3.q r7 = y3.c.f14665a     // Catch: java.lang.Throwable -> L4a
            r3 = 0
            float r3 = r8.d(r3)     // Catch: java.lang.Throwable -> L4a
            int r3 = java.lang.Math.round(r3)     // Catch: java.lang.Throwable -> L4a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L4a
            r2.put(r7, r3)     // Catch: java.lang.Throwable -> L4a
            y3.q r7 = y3.c.f14666b     // Catch: java.lang.Throwable -> L4a
            int r3 = r8.f9222g     // Catch: java.lang.Throwable -> L4a
            int r3 = r3 + (-1)
            float r8 = r8.d(r3)     // Catch: java.lang.Throwable -> L4a
            int r8 = java.lang.Math.round(r8)     // Catch: java.lang.Throwable -> L4a
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Throwable -> L4a
            r2.put(r7, r8)     // Catch: java.lang.Throwable -> L4a
        L73:
            r7 = 32
            long r7 = r0 >> r7
            int r7 = (int) r7     // Catch: java.lang.Throwable -> L4a
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r2
            int r8 = (int) r0     // Catch: java.lang.Throwable -> L4a
            long r0 = p7.k.n(r7, r7, r8, r8)     // Catch: java.lang.Throwable -> L4a
            y3.i1 r6 = r6.e(r0)     // Catch: java.lang.Throwable -> L4a
            java.util.HashMap r0 = r4.f4246q0     // Catch: java.lang.Throwable -> L4a
            r0.getClass()     // Catch: java.lang.Throwable -> L4a
            c9.o r1 = new c9.o     // Catch: java.lang.Throwable -> L4a
            r2 = 3
            r1.<init>(r6, r2)     // Catch: java.lang.Throwable -> L4a
            y3.w0 r5 = r5.u0(r7, r8, r0, r1)     // Catch: java.lang.Throwable -> L4a
            android.os.Trace.endSection()
            return r5
        L9a:
            android.os.Trace.endSection()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: e2.m.d(y3.x0, y3.u0, long):y3.w0");
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [e2.k] */
    @Override // a4.l2
    public final void f0(x xVar) {
        k kVar = this.f4248s0;
        k kVar2 = kVar;
        if (kVar == null) {
            ?? r02 = new mc.l(this) { // from class: e2.k
                public final /* synthetic */ m B;

                {
                    this.B = this;
                }

                /* JADX WARN: Removed duplicated region for block: B:39:0x0127  */
                /* JADX WARN: Removed duplicated region for block: B:41:0x012d  */
                /* JADX WARN: Removed duplicated region for block: B:42:0x012f  */
                @Override // mc.l
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object k(java.lang.Object r29) {
                    /*
                        Method dump skipped, instructions count: 318
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: e2.k.k(java.lang.Object):java.lang.Object");
                }
            };
            this.f4248s0 = r02;
            kVar2 = r02;
        }
        l4.h hVar = new l4.h(this.f4239i0);
        tc.c[] cVarArr = v.f6808a;
        xVar.a(i4.t.B, p7.t.x(hVar));
        l lVar = this.f4249t0;
        if (lVar != null) {
            boolean z10 = lVar.f4237c;
            w wVar = i4.t.D;
            tc.c[] cVarArr2 = v.f6808a;
            tc.c cVar = cVarArr2[17];
            xVar.a(wVar, Boolean.valueOf(z10));
            l4.h hVar2 = new l4.h(lVar.f4236b);
            w wVar2 = i4.t.C;
            tc.c cVar2 = cVarArr2[16];
            xVar.a(wVar2, hVar2);
        }
        xVar.a(i4.l.f6751l, new i4.a(null, new mc.l(this) { // from class: e2.k
            public final /* synthetic */ m B;

            {
                this.B = this;
            }

            @Override // mc.l
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object k(java.lang.Object r29) {
                /*
                    Method dump skipped, instructions count: 318
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: e2.k.k(java.lang.Object):java.lang.Object");
            }
        }));
        xVar.a(i4.l.m, new i4.a(null, new mc.l(this) { // from class: e2.k
            public final /* synthetic */ m B;

            {
                this.B = this;
            }

            @Override // mc.l
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object k(java.lang.Object r29) {
                /*
                    Method dump skipped, instructions count: 318
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: e2.k.k(java.lang.Object):java.lang.Object");
            }
        }));
        xVar.a(i4.l.f6752n, new i4.a(null, new n(15, this)));
        v.a(xVar, kVar2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x000e, code lost:
        if (r2 != null) goto L9;
     */
    @Override // a4.a0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int p0(a4.x0 r1, y3.u0 r2, int r3) {
        /*
            r0 = this;
            e2.l r2 = r0.f4249t0
            if (r2 == 0) goto L10
            boolean r3 = r2.f4237c
            if (r3 == 0) goto L9
            goto La
        L9:
            r2 = 0
        La:
            if (r2 == 0) goto L10
            e2.e r2 = r2.f4238d
            if (r2 != 0) goto L14
        L10:
            e2.e r2 = r0.O0()
        L14:
            r2.d(r1)
            x4.m r1 = r1.getLayoutDirection()
            l4.u r1 = r2.e(r1)
            float r1 = r1.c()
            int r1 = u1.l0.o(r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: e2.m.p0(a4.x0, y3.u0, int):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x000e, code lost:
        if (r2 != null) goto L9;
     */
    @Override // a4.a0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int y0(a4.x0 r1, y3.u0 r2, int r3) {
        /*
            r0 = this;
            e2.l r2 = r0.f4249t0
            if (r2 == 0) goto L10
            boolean r3 = r2.f4237c
            if (r3 == 0) goto L9
            goto La
        L9:
            r2 = 0
        La:
            if (r2 == 0) goto L10
            e2.e r2 = r2.f4238d
            if (r2 != 0) goto L14
        L10:
            e2.e r2 = r0.O0()
        L14:
            r2.d(r1)
            x4.m r1 = r1.getLayoutDirection()
            l4.u r1 = r2.e(r1)
            float r1 = r1.a()
            int r1 = u1.l0.o(r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: e2.m.y0(a4.x0, y3.u0, int):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0014, code lost:
        if (r0 != null) goto L11;
     */
    @Override // a4.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void z(a4.r0 r11) {
        /*
            r10 = this;
            boolean r0 = r10.f1777h0
            if (r0 != 0) goto L6
            goto La2
        L6:
            e2.l r0 = r10.f4249t0
            if (r0 == 0) goto L16
            boolean r1 = r0.f4237c
            if (r1 == 0) goto Lf
            goto L10
        Lf:
            r0 = 0
        L10:
            if (r0 == 0) goto L16
            e2.e r0 = r0.f4238d
            if (r0 != 0) goto L1a
        L16:
            e2.e r0 = r10.O0()
        L1a:
            l4.b r1 = r0.f4187j
            if (r1 == 0) goto La9
            k3.b r11 = r11.A
            a4.n r11 = r11.B
            i3.q r2 = r11.p()
            boolean r11 = r0.f4188k
            if (r11 == 0) goto L43
            long r3 = r0.f4189l
            r0 = 32
            long r5 = r3 >> r0
            int r0 = (int) r5
            float r5 = (float) r0
            r6 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r3 = r3 & r6
            int r0 = (int) r3
            float r6 = (float) r0
            r2.p()
            r4 = 0
            r7 = 1
            r3 = 0
            r2.j(r3, r4, r5, r6, r7)
        L43:
            l4.r0 r0 = r10.f4240j0     // Catch: java.lang.Throwable -> L4f
            l4.j0 r0 = r0.f8887a     // Catch: java.lang.Throwable -> L4f
            w4.l r3 = r0.m     // Catch: java.lang.Throwable -> L4f
            if (r3 != 0) goto L4d
            w4.l r3 = w4.l.f14143b     // Catch: java.lang.Throwable -> L4f
        L4d:
            r6 = r3
            goto L51
        L4f:
            r0 = move-exception
            goto La3
        L51:
            i3.m0 r3 = r0.f8839n     // Catch: java.lang.Throwable -> L4f
            if (r3 != 0) goto L57
            i3.m0 r3 = i3.m0.f6659d     // Catch: java.lang.Throwable -> L4f
        L57:
            r5 = r3
            k3.e r3 = r0.f8841p     // Catch: java.lang.Throwable -> L4f
            if (r3 != 0) goto L5e
            k3.g r3 = k3.g.f7961a     // Catch: java.lang.Throwable -> L4f
        L5e:
            r7 = r3
            w4.o r0 = r0.f8827a     // Catch: java.lang.Throwable -> L4f
            i3.o r3 = r0.c()     // Catch: java.lang.Throwable -> L4f
            if (r3 == 0) goto L75
            l4.r0 r0 = r10.f4240j0     // Catch: java.lang.Throwable -> L4f
            l4.j0 r0 = r0.f8887a     // Catch: java.lang.Throwable -> L4f
            w4.o r0 = r0.f8827a     // Catch: java.lang.Throwable -> L4f
            float r4 = r0.a()     // Catch: java.lang.Throwable -> L4f
            r1.g(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L4f
            goto L9d
        L75:
            i3.t r0 = r10.p0     // Catch: java.lang.Throwable -> L4f
            if (r0 == 0) goto L7e
            long r3 = r0.a()     // Catch: java.lang.Throwable -> L4f
            goto L80
        L7e:
            long r3 = i3.s.f6687h     // Catch: java.lang.Throwable -> L4f
        L80:
            r8 = 16
            int r0 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r0 == 0) goto L87
            goto L9a
        L87:
            l4.r0 r0 = r10.f4240j0     // Catch: java.lang.Throwable -> L4f
            long r3 = r0.b()     // Catch: java.lang.Throwable -> L4f
            int r0 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r0 == 0) goto L98
            l4.r0 r0 = r10.f4240j0     // Catch: java.lang.Throwable -> L4f
            long r3 = r0.b()     // Catch: java.lang.Throwable -> L4f
            goto L9a
        L98:
            long r3 = i3.s.f6681b     // Catch: java.lang.Throwable -> L4f
        L9a:
            r1.f(r2, r3, r5, r6, r7)     // Catch: java.lang.Throwable -> L4f
        L9d:
            if (r11 == 0) goto La2
            r2.m()
        La2:
            return
        La3:
            if (r11 == 0) goto La8
            r2.m()
        La8:
            throw r0
        La9:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r0 = "Internal Error: ParagraphLayoutCache could not provide a Paragraph during the draw phase. Please report this bug on the official Issue Tracker with the following diagnostic information: (layoutCache="
            r11.<init>(r0)
            e2.e r0 = r10.f4247r0
            r11.append(r0)
            java.lang.String r0 = ", textSubstitution="
            r11.append(r0)
            e2.l r0 = r10.f4249t0
            r11.append(r0)
            r0 = 41
            r11.append(r0)
            java.lang.String r11 = r11.toString()
            k1.b.b(r11)
            wa.b.a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e2.m.z(a4.r0):void");
    }
}
