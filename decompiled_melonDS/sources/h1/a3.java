package h1;

import g2.n4;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class a3 {

    /* renamed from: a */
    public static final m0 f5853a = new m0(3, 2, null);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x003f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x004c A[LOOP:0: B:51:0x004a->B:52:0x004c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0060  */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List, java.util.Collection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.util.List, java.util.Collection, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x003d -> B:50:0x0040). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(v3.f0 r8, ec.a r9) {
        /*
            boolean r0 = r9 instanceof h1.r2
            if (r0 == 0) goto L13
            r0 = r9
            h1.r2 r0 = (h1.r2) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            h1.r2 r0 = new h1.r2
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.X
            dc.a r1 = dc.a.COROUTINE_SUSPENDED
            int r2 = r0.Y
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L29
            v3.f0 r8 = r0.R
            p7.j.I(r9)
            goto L40
        L29:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            a0.j.p(r8)
            r8 = 0
            return r8
        L30:
            p7.j.I(r9)
        L33:
            r0.R = r8
            r0.Y = r3
            v3.l r9 = v3.l.Main
            java.lang.Object r9 = r8.a(r9, r0)
            if (r9 != r1) goto L40
            return r1
        L40:
            v3.k r9 = (v3.k) r9
            java.lang.Object r2 = r9.f13678a
            int r4 = r2.size()
            r5 = 0
            r6 = r5
        L4a:
            if (r6 >= r4) goto L58
            java.lang.Object r7 = r2.get(r6)
            v3.t r7 = (v3.t) r7
            r7.a()
            int r6 = r6 + 1
            goto L4a
        L58:
            java.lang.Object r9 = r9.f13678a
            int r2 = r9.size()
        L5e:
            if (r5 >= r2) goto L6e
            java.lang.Object r4 = r9.get(r5)
            v3.t r4 = (v3.t) r4
            boolean r4 = r4.f13694d
            if (r4 == 0) goto L6b
            goto L33
        L6b:
            int r5 = r5 + 1
            goto L5e
        L6e:
            yb.y r8 = yb.y.f14813a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: h1.a3.a(v3.f0, ec.a):java.lang.Object");
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
        */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0049 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0052  */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0047 -> B:40:0x004a). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(v3.f0 r5, boolean r6, v3.l r7, ec.a r8) {
        /*
            boolean r0 = r8 instanceof h1.q2
            if (r0 == 0) goto L13
            r0 = r8
            h1.q2 r0 = (h1.q2) r0
            int r1 = r0.f6003b0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6003b0 = r1
            goto L18
        L13:
            h1.q2 r0 = new h1.q2
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.Z
            dc.a r1 = dc.a.COROUTINE_SUSPENDED
            int r2 = r0.f6003b0
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L31
            boolean r5 = r0.Y
            v3.l r6 = r0.X
            v3.f0 r7 = r0.R
            p7.j.I(r8)
            r4 = r6
            r6 = r5
            r5 = r7
            r7 = r4
            goto L4a
        L31:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            a0.j.p(r5)
            r5 = 0
            return r5
        L38:
            p7.j.I(r8)
        L3b:
            r0.R = r5
            r0.X = r7
            r0.Y = r6
            r0.f6003b0 = r3
            java.lang.Object r8 = r5.a(r7, r0)
            if (r8 != r1) goto L4a
            return r1
        L4a:
            v3.k r8 = (v3.k) r8
            boolean r2 = e(r8, r6)
            if (r2 == 0) goto L3b
            java.lang.Object r5 = r8.f13678a
            r6 = 0
            java.lang.Object r5 = r5.get(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: h1.a3.b(v3.f0, boolean, v3.l, ec.a):java.lang.Object");
    }

    public static /* synthetic */ Object c(v3.f0 f0Var, ec.i iVar, int i2) {
        boolean z10 = true;
        if ((i2 & 1) == 0) {
            z10 = false;
        }
        return b(f0Var, z10, v3.l.Main, iVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v3, types: [h1.m0] */
    public static Object d(v3.w wVar, n4 n4Var, mc.l lVar, cc.c cVar, int i2) {
        n4 n4Var2 = n4Var;
        if ((i2 & 4) != 0) {
            n4Var2 = f5853a;
        }
        Object g10 = zc.x.g(new a9.e(wVar, n4Var2, null, null, lVar, null, 4), cVar);
        if (g10 == dc.a.COROUTINE_SUSPENDED) {
            return g10;
        }
        return yb.y.f14813a;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List, java.util.Collection, java.lang.Object] */
    public static boolean e(v3.k kVar, boolean z10) {
        boolean b10;
        ?? r42 = kVar.f13678a;
        int size = r42.size();
        for (int i2 = 0; i2 < size; i2++) {
            v3.t tVar = (v3.t) r42.get(i2);
            if (z10) {
                b10 = v3.s.a(tVar);
            } else {
                b10 = v3.s.b(tVar);
            }
            if (!b10) {
                return false;
            }
        }
        return true;
    }

    public static zc.l1 f(zc.u uVar, zc.y0 y0Var, mc.p pVar) {
        return zc.x.v(uVar, null, zc.w.UNDISPATCHED, new x2(y0Var, pVar, (cc.c) null), 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0030  */
    /* JADX WARN: Type inference failed for: r9v2, types: [nc.t, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object g(v3.f0 r7, v3.l r8, ec.a r9) {
        /*
            boolean r0 = r9 instanceof h1.y2
            if (r0 == 0) goto L13
            r0 = r9
            h1.y2 r0 = (h1.y2) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            h1.y2 r0 = new h1.y2
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.X
            dc.a r1 = dc.a.COROUTINE_SUSPENDED
            int r2 = r0.Y
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L29
            nc.t r7 = r0.R
            p7.j.I(r9)     // Catch: v3.m -> L59
            goto L56
        L29:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            a0.j.p(r7)
            r7 = 0
            return r7
        L30:
            p7.j.I(r9)
            nc.t r9 = new nc.t
            r9.<init>()
            h1.c1 r2 = h1.c1.f5880a
            r9.A = r2
            b4.z2 r2 = r7.k()     // Catch: v3.m -> L59
            long r4 = r2.c()     // Catch: v3.m -> L59
            h1.s0 r2 = new h1.s0     // Catch: v3.m -> L59
            r6 = 0
            r2.<init>(r8, r9, r6)     // Catch: v3.m -> L59
            r0.R = r9     // Catch: v3.m -> L59
            r0.Y = r3     // Catch: v3.m -> L59
            java.lang.Object r7 = r7.l(r4, r2, r0)     // Catch: v3.m -> L59
            if (r7 != r1) goto L55
            return r1
        L55:
            r7 = r9
        L56:
            java.lang.Object r7 = r7.A
            return r7
        L59:
            h1.e1 r7 = h1.e1.f5887a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: h1.a3.g(v3.f0, v3.l, ec.a):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:91:0x009d, code lost:
        if (r15 == r1) goto L47;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0060  */
    /* JADX WARN: Type inference failed for: r15v10, types: [java.util.List, java.util.Collection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v4, types: [java.util.List, java.util.Collection, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:91:0x009d -> B:69:0x002e). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object h(v3.f0 r13, v3.l r14, ec.a r15) {
        /*
            boolean r0 = r15 instanceof h1.z2
            if (r0 == 0) goto L13
            r0 = r15
            h1.z2 r0 = (h1.z2) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            h1.z2 r0 = new h1.z2
            r0.<init>(r15)
        L18:
            java.lang.Object r15 = r0.Y
            dc.a r1 = dc.a.COROUTINE_SUSPENDED
            int r2 = r0.Z
            r3 = 2
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L42
            if (r2 == r5) goto L3a
            if (r2 != r3) goto L33
            v3.l r13 = r0.X
            v3.f0 r14 = r0.R
            p7.j.I(r15)
        L2e:
            r12 = r14
            r14 = r13
            r13 = r12
            goto La0
        L33:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            a0.j.p(r13)
            r13 = 0
            return r13
        L3a:
            v3.l r13 = r0.X
            v3.f0 r14 = r0.R
            p7.j.I(r15)
            goto L55
        L42:
            p7.j.I(r15)
        L45:
            r0.R = r13
            r0.X = r14
            r0.Z = r5
            java.lang.Object r15 = r13.a(r14, r0)
            if (r15 != r1) goto L52
            goto L9f
        L52:
            r12 = r14
            r14 = r13
            r13 = r12
        L55:
            v3.k r15 = (v3.k) r15
            java.lang.Object r15 = r15.f13678a
            int r2 = r15.size()
            r6 = r4
        L5e:
            if (r6 >= r2) goto Lbf
            java.lang.Object r7 = r15.get(r6)
            v3.t r7 = (v3.t) r7
            boolean r7 = v3.s.c(r7)
            if (r7 != 0) goto Lbc
            int r2 = r15.size()
            r6 = r4
        L71:
            if (r6 >= r2) goto L91
            java.lang.Object r7 = r15.get(r6)
            v3.t r7 = (v3.t) r7
            boolean r8 = r7.b()
            if (r8 != 0) goto Lb7
            v3.h0 r8 = r14.Y
            long r8 = r8.f13667s0
            long r10 = r14.d()
            boolean r7 = v3.s.f(r7, r8, r10)
            if (r7 == 0) goto L8e
            goto Lb7
        L8e:
            int r6 = r6 + 1
            goto L71
        L91:
            v3.l r15 = v3.l.Final
            r0.R = r14
            r0.X = r13
            r0.Z = r3
            java.lang.Object r15 = r14.a(r15, r0)
            if (r15 != r1) goto L2e
        L9f:
            return r1
        La0:
            v3.k r15 = (v3.k) r15
            java.lang.Object r15 = r15.f13678a
            int r2 = r15.size()
            r6 = r4
        La9:
            if (r6 >= r2) goto L45
            java.lang.Object r7 = r15.get(r6)
            v3.t r7 = (v3.t) r7
            boolean r7 = r7.b()
            if (r7 == 0) goto Lb9
        Lb7:
            r13 = 0
            return r13
        Lb9:
            int r6 = r6 + 1
            goto La9
        Lbc:
            int r6 = r6 + 1
            goto L5e
        Lbf:
            java.lang.Object r13 = r15.get(r4)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: h1.a3.h(v3.f0, v3.l, ec.a):java.lang.Object");
    }
}
