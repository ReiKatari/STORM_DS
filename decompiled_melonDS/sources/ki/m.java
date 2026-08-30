package ki;

import bd.u;
import gk.w;
import pi.x;
import ti.n;
import w.x0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    public final x f8314a;

    /* renamed from: b  reason: collision with root package name */
    public final od.c f8315b;

    /* renamed from: c  reason: collision with root package name */
    public final yd.b f8316c;

    public m(x xVar, od.c cVar, yd.b bVar, yd.a aVar) {
        this.f8314a = xVar;
        this.f8315b = cVar;
        this.f8316c = bVar;
    }

    public static final Object a(m mVar, x0 x0Var, ec.j jVar) {
        zc.h hVar = new zc.h(1, pc.a.A(jVar));
        hVar.v();
        n nVar = new n(mVar.f8314a, x0Var);
        nVar.e(new w(hVar, 3));
        hVar.x(new u(1, nVar));
        Object u4 = hVar.u();
        dc.a aVar = dc.a.COROUTINE_SUSPENDED;
        return u4;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(ki.m r11, nc.e r12, java.util.Map r13, mc.l r14, ec.c r15) {
        /*
            boolean r0 = r15 instanceof ki.c
            if (r0 == 0) goto L13
            r0 = r15
            ki.c r0 = (ki.c) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            ki.c r0 = new ki.c
            r0.<init>(r11, r15)
        L18:
            java.lang.Object r15 = r0.R
            dc.a r1 = dc.a.COROUTINE_SUSPENDED
            int r2 = r0.Y
            r3 = 1
            if (r2 == 0) goto L2e
            if (r2 != r3) goto L27
            p7.j.I(r15)
            goto L49
        L27:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            a0.j.p(r11)
            r11 = 0
            return r11
        L2e:
            p7.j.I(r15)
            gd.f r15 = zc.g0.f15015a
            gd.e r15 = gd.e.L
            ki.d r4 = new ki.d
            r9 = 0
            r10 = 0
            r5 = r11
            r8 = r12
            r6 = r13
            r7 = r14
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r0.Y = r3
            java.lang.Object r15 = zc.x.F(r15, r4, r0)
            if (r15 != r1) goto L49
            return r1
        L49:
            yb.l r15 = (yb.l) r15
            java.lang.Object r11 = r15.A
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: ki.m.b(ki.m, nc.e, java.util.Map, mc.l, ec.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(ki.m r11, nc.e r12, java.util.Map r13, ki.b r14, ec.c r15) {
        /*
            boolean r0 = r15 instanceof ki.i
            if (r0 == 0) goto L13
            r0 = r15
            ki.i r0 = (ki.i) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            ki.i r0 = new ki.i
            r0.<init>(r11, r15)
        L18:
            java.lang.Object r15 = r0.R
            dc.a r1 = dc.a.COROUTINE_SUSPENDED
            int r2 = r0.Y
            r3 = 1
            if (r2 == 0) goto L2e
            if (r2 != r3) goto L27
            p7.j.I(r15)
            goto L49
        L27:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            a0.j.p(r11)
            r11 = 0
            return r11
        L2e:
            p7.j.I(r15)
            gd.f r15 = zc.g0.f15015a
            gd.e r15 = gd.e.L
            ki.d r4 = new ki.d
            r9 = 0
            r10 = 1
            r5 = r11
            r8 = r12
            r6 = r13
            r7 = r14
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r0.Y = r3
            java.lang.Object r15 = zc.x.F(r15, r4, r0)
            if (r15 != r1) goto L49
            return r1
        L49:
            yb.l r15 = (yb.l) r15
            java.lang.Object r11 = r15.A
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: ki.m.c(ki.m, nc.e, java.util.Map, ki.b, ec.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x005a, code lost:
        if (r4 == r3) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0116, code lost:
        if (r1 == r3) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0118, code lost:
        return r3;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(long r22, boolean r24, ec.c r25) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ki.m.d(long, boolean, ec.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0048, code lost:
        if (r9 == r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0095, code lost:
        if (r8 == r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0097, code lost:
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(java.lang.String r8, ec.c r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof ki.e
            if (r0 == 0) goto L13
            r0 = r9
            ki.e r0 = (ki.e) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            ki.e r0 = new ki.e
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.X
            dc.a r1 = dc.a.COROUTINE_SUSPENDED
            int r2 = r0.Z
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3b
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2e
            p7.j.I(r9)
            yb.l r9 = (yb.l) r9
            java.lang.Object r8 = r9.A
            goto L98
        L2e:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            a0.j.p(r8)
            r8 = 0
            return r8
        L35:
            java.lang.String r8 = r0.R
            p7.j.I(r9)
            goto L4b
        L3b:
            p7.j.I(r9)
            r0.R = r8
            r0.Z = r4
            yd.b r9 = r7.f8316c
            oi.j r9 = r9.a()
            if (r9 != r1) goto L4b
            goto L97
        L4b:
            oi.j r9 = (oi.j) r9
            if (r9 != 0) goto L5a
            ch.a r8 = new ch.a
            r8.<init>()
            yb.k r9 = new yb.k
            r9.<init>(r8)
            return r9
        L5a:
            yb.j r2 = new yb.j
            java.lang.String r4 = "r"
            java.lang.String r5 = "achievementsets"
            r2.<init>(r4, r5)
            java.lang.String r4 = r9.f11050a
            yb.j r5 = new yb.j
            java.lang.String r6 = "u"
            r5.<init>(r6, r4)
            java.lang.String r9 = r9.f11051b
            yb.j r4 = new yb.j
            java.lang.String r6 = "t"
            r4.<init>(r6, r9)
            yb.j r9 = new yb.j
            java.lang.String r6 = "m"
            r9.<init>(r6, r8)
            yb.j[] r8 = new yb.j[]{r2, r5, r4, r9}
            java.util.Map r8 = zb.v.F(r8)
            ki.b r9 = ki.b.B
            java.lang.Class<li.d> r2 = li.d.class
            nc.e r2 = nc.u.a(r2)
            r4 = 0
            r0.R = r4
            r0.Z = r3
            java.lang.Object r8 = b(r7, r2, r8, r9, r0)
            if (r8 != r1) goto L98
        L97:
            return r1
        L98:
            boolean r9 = r8 instanceof yb.k
            if (r9 != 0) goto Lb5
            p7.j.I(r8)     // Catch: java.lang.Throwable -> La6
            li.d r8 = (li.d) r8     // Catch: java.lang.Throwable -> La6
            oi.f r8 = mi.b.a(r8)     // Catch: java.lang.Throwable -> La6
            return r8
        La6:
            r8 = move-exception
            cc.g r9 = r0.B
            r9.getClass()
            zc.x.j(r9)
            yb.k r9 = new yb.k
            r9.<init>(r8)
            return r9
        Lb5:
            java.lang.Throwable r8 = yb.l.a(r8)
            r8.getClass()
            yb.k r9 = new yb.k
            r9.<init>(r8)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: ki.m.e(java.lang.String, ec.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0094 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(ec.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof ki.f
            if (r0 == 0) goto L13
            r0 = r6
            ki.f r0 = (ki.f) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            ki.f r0 = new ki.f
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.R
            dc.a r1 = dc.a.COROUTINE_SUSPENDED
            int r2 = r0.Y
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2b
            p7.j.I(r6)
            yb.l r6 = (yb.l) r6
            java.lang.Object r6 = r6.A
            goto L51
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            a0.j.p(r6)
            r6 = 0
            return r6
        L32:
            p7.j.I(r6)
            java.lang.String r6 = "r"
            java.lang.String r2 = "hashlibrary"
            java.util.Map r6 = java.util.Collections.singletonMap(r6, r2)
            r6.getClass()
            ki.b r2 = ki.b.B
            java.lang.Class<li.e> r4 = li.e.class
            nc.e r4 = nc.u.a(r4)
            r0.Y = r3
            java.lang.Object r6 = b(r5, r4, r6, r2, r0)
            if (r6 != r1) goto L51
            return r1
        L51:
            boolean r0 = r6 instanceof yb.k
            if (r0 != 0) goto L94
            li.e r6 = (li.e) r6
            java.util.Map r6 = r6.f9142a
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            int r1 = r6.size()
            int r1 = zb.v.E(r1)
            r0.<init>(r1)
            java.util.Set r6 = r6.entrySet()
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r6 = r6.iterator()
        L70:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L93
            java.lang.Object r1 = r6.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.Object r1 = r1.getValue()
            java.lang.Number r1 = (java.lang.Number) r1
            long r3 = r1.longValue()
            oi.g r1 = new oi.g
            r1.<init>(r3)
            r0.put(r2, r1)
            goto L70
        L93:
            return r0
        L94:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ki.m.f(ec.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004d, code lost:
        if (r13 == r1) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ad, code lost:
        if (r10 == r1) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00af, code lost:
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(long r10, boolean r12, ec.c r13) {
        /*
            r9 = this;
            boolean r0 = r13 instanceof ki.g
            if (r0 == 0) goto L13
            r0 = r13
            ki.g r0 = (ki.g) r0
            int r1 = r0.f8306b0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8306b0 = r1
            goto L18
        L13:
            ki.g r0 = new ki.g
            r0.<init>(r9, r13)
        L18:
            java.lang.Object r13 = r0.Y
            dc.a r1 = dc.a.COROUTINE_SUSPENDED
            int r2 = r0.f8306b0
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2f
            p7.j.I(r13)
            yb.l r13 = (yb.l) r13
            java.lang.Object r10 = r13.A
            goto Lb0
        L2f:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            a0.j.p(r10)
            r10 = 0
            return r10
        L36:
            boolean r12 = r0.X
            long r10 = r0.R
            p7.j.I(r13)
            goto L50
        L3e:
            p7.j.I(r13)
            r0.R = r10
            r0.X = r12
            r0.f8306b0 = r4
            yd.b r13 = r9.f8316c
            oi.j r13 = r13.a()
            if (r13 != r1) goto L50
            goto Laf
        L50:
            oi.j r13 = (oi.j) r13
            if (r13 != 0) goto L5f
            ch.a r10 = new ch.a
            r10.<init>()
            yb.k r11 = new yb.k
            r11.<init>(r10)
            return r11
        L5f:
            yb.j r2 = new yb.j
            java.lang.String r4 = "r"
            java.lang.String r5 = "unlocks"
            r2.<init>(r4, r5)
            java.lang.String r4 = r13.f11050a
            yb.j r5 = new yb.j
            java.lang.String r6 = "u"
            r5.<init>(r6, r4)
            java.lang.String r13 = r13.f11051b
            yb.j r4 = new yb.j
            java.lang.String r6 = "t"
            r4.<init>(r6, r13)
            java.lang.String r13 = java.lang.String.valueOf(r10)
            yb.j r6 = new yb.j
            java.lang.String r7 = "g"
            r6.<init>(r7, r13)
            if (r12 == 0) goto L8a
            java.lang.String r13 = "1"
            goto L8c
        L8a:
            java.lang.String r13 = "0"
        L8c:
            yb.j r7 = new yb.j
            java.lang.String r8 = "h"
            r7.<init>(r8, r13)
            yb.j[] r13 = new yb.j[]{r2, r5, r4, r6, r7}
            java.util.Map r13 = zb.v.F(r13)
            ki.b r2 = ki.b.B
            java.lang.Class<li.k> r4 = li.k.class
            nc.e r4 = nc.u.a(r4)
            r0.R = r10
            r0.X = r12
            r0.f8306b0 = r3
            java.lang.Object r10 = b(r9, r4, r13, r2, r0)
            if (r10 != r1) goto Lb0
        Laf:
            return r1
        Lb0:
            boolean r11 = r10 instanceof yb.k
            if (r11 != 0) goto Lb8
            li.k r10 = (li.k) r10
            java.util.List r10 = r10.f9166a
        Lb8:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: ki.m.g(long, boolean, ec.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x007c, code lost:
        if (r12 == r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a9, code lost:
        if (r3 == r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ab, code lost:
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b3 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(java.lang.String r11, java.lang.String r12, ec.c r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof ki.h
            if (r0 == 0) goto L13
            r0 = r13
            ki.h r0 = (ki.h) r0
            int r1 = r0.f8307b0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8307b0 = r1
            goto L18
        L13:
            ki.h r0 = new ki.h
            r0.<init>(r10, r13)
        L18:
            java.lang.Object r13 = r0.Y
            dc.a r1 = dc.a.COROUTINE_SUSPENDED
            int r2 = r0.f8307b0
            yb.y r3 = yb.y.f14813a
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L48
            if (r2 == r5) goto L37
            if (r2 != r4) goto L30
            java.lang.Object r11 = r0.X
            p7.j.I(r13)
            goto Lac
        L30:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            a0.j.p(r11)
            r11 = 0
            return r11
        L37:
            java.lang.Object r11 = r0.X
            ki.m r11 = (ki.m) r11
            java.lang.String r11 = r0.R
            p7.j.I(r13)
            yb.l r13 = (yb.l) r13
            java.lang.Object r12 = r13.A
        L44:
            r9 = r12
            r12 = r11
            r11 = r9
            goto L7f
        L48:
            p7.j.I(r13)
            yb.j r13 = new yb.j
            java.lang.String r2 = "r"
            java.lang.String r7 = "login2"
            r13.<init>(r2, r7)
            yb.j r2 = new yb.j
            java.lang.String r7 = "u"
            r2.<init>(r7, r11)
            yb.j r7 = new yb.j
            java.lang.String r8 = "p"
            r7.<init>(r8, r12)
            yb.j[] r12 = new yb.j[]{r13, r2, r7}
            java.util.Map r12 = zb.v.F(r12)
            ki.b r13 = ki.b.B
            java.lang.Class<li.j> r2 = li.j.class
            nc.e r2 = nc.u.a(r2)
            r0.R = r11
            r0.X = r6
            r0.f8307b0 = r5
            java.lang.Object r12 = b(r10, r2, r12, r13, r0)
            if (r12 != r1) goto L44
            goto Lab
        L7f:
            boolean r13 = r11 instanceof yb.k
            if (r13 != 0) goto Lac
            r13 = r11
            li.j r13 = (li.j) r13
            java.lang.String r13 = r13.f9161a
            r12.getClass()
            r13.getClass()
            r0.R = r6
            r0.X = r11
            r0.f8307b0 = r4
            yd.b r0 = r10.f8316c
            android.content.SharedPreferences r0 = r0.f14814a
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r2 = "ra_username"
            r0.putString(r2, r12)
            java.lang.String r12 = "ra_token"
            r0.putString(r12, r13)
            r0.apply()
            if (r3 != r1) goto Lac
        Lab:
            return r1
        Lac:
            boolean r12 = r11 instanceof yb.k
            if (r12 != 0) goto Lb3
            li.j r11 = (li.j) r11
            return r3
        Lb3:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: ki.m.h(java.lang.String, java.lang.String, ec.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(long r18, java.lang.String r20, boolean r21, java.lang.String r22, ec.c r23) {
        /*
            Method dump skipped, instructions count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ki.m.i(long, java.lang.String, boolean, java.lang.String, ec.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(long r19, java.lang.String r21, boolean r22, ec.c r23) {
        /*
            Method dump skipped, instructions count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ki.m.j(long, java.lang.String, boolean, ec.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004d, code lost:
        if (r15 == r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00f8, code lost:
        if (r12 == r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00fa, code lost:
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(long r12, int r14, ec.c r15) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ki.m.k(long, int, ec.c):java.lang.Object");
    }
}
