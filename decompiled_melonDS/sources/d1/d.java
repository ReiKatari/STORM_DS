package d1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a */
    public static final l f3536a = new l(Float.POSITIVE_INFINITY);

    /* renamed from: b */
    public static final m f3537b = new m(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    /* renamed from: c */
    public static final n f3538c = new n(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    /* renamed from: d */
    public static final o f3539d = new o(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    /* renamed from: e */
    public static final l f3540e = new l(Float.NEGATIVE_INFINITY);

    /* renamed from: f */
    public static final m f3541f = new m(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    /* renamed from: g */
    public static final n f3542g = new n(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    /* renamed from: h */
    public static final o f3543h = new o(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    /* renamed from: i */
    public static final float[] f3544i = new float[91];

    /* renamed from: j */
    public static final w1 f3545j = new w1(new a7.a(18), new x1(5));

    /* renamed from: k */
    public static final w1 f3546k = new w1(new a7.a(19), new a7.a(20));

    /* renamed from: l */
    public static final w1 f3547l = new w1(new a7.a(21), new a7.a(22));
    public static final w1 m = new w1(new a7.a(23), new a7.a(24));

    /* renamed from: n */
    public static final w1 f3548n = new w1(new a7.a(25), new a7.a(26));

    /* renamed from: o */
    public static final w1 f3549o = new w1(new a7.a(27), new a7.a(28));

    /* renamed from: p */
    public static final w1 f3550p = new w1(new a7.a(29), new x1(0));

    /* renamed from: q */
    public static final w1 f3551q = new w1(new x1(1), new x1(2));

    /* renamed from: r */
    public static final w1 f3552r = new w1(new x1(3), new x1(4));

    public static c a(float f8) {
        return new c(Float.valueOf(f8), f3545j, Float.valueOf(0.01f), 8);
    }

    public static k b(float f8, float f10, int i2) {
        if ((i2 & 2) != 0) {
            f10 = 0.0f;
        }
        return new k(f3545j, Float.valueOf(f8), new l(f10), Long.MIN_VALUE, Long.MIN_VALUE, false);
    }

    public static final Object c(float f8, float f10, float f11, j jVar, mc.p pVar, ec.c cVar) {
        Float f12 = new Float(f8);
        Float f13 = new Float(f10);
        Float f14 = new Float(f11);
        w1 w1Var = f3545j;
        mc.l lVar = w1Var.f3690a;
        p pVar2 = (p) lVar.k(f14);
        if (pVar2 == null) {
            pVar2 = ((p) lVar.k(f12)).c();
        }
        p pVar3 = pVar2;
        Object d4 = d(new k(w1Var, f12, pVar3, 56), new h1(jVar, w1Var, f12, f13, pVar3), Long.MIN_VALUE, new a2.c(8, pVar), cVar);
        dc.a aVar = dc.a.COROUTINE_SUSPENDED;
        yb.y yVar = yb.y.f14813a;
        if (d4 != aVar) {
            d4 = yVar;
        }
        if (d4 == aVar) {
            return d4;
        }
        return yVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:1|(2:3|(8:5|6|7|(3:(1:(1:11)(2:53|54))(1:55)|12|13)(8:56|(11:66|67|68|69|70|71|72|73|(2:75|(1:77)(2:80|81))(1:82)|(1:79)|29)(7:58|59|60|61|15|16|(7:18|19|20|21|22|23|(1:34)(2:25|(1:27)(2:31|32)))(2:47|48))|65|38|(1:40)|41|(1:45)|46)|14|15|16|(0)(0)))|91|6|7|(0)(0)|14|15|16|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0182, code lost:
        if (r1 == r10) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x018b, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x018c, code lost:
        r2 = r1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x011f A[Catch: CancellationException -> 0x018b, TRY_LEAVE, TryCatch #2 {CancellationException -> 0x018b, blocks: (B:146:0x010a, B:148:0x011f), top: B:183:0x010a }] */
    /* JADX WARN: Removed duplicated region for block: B:166:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x01a9  */
    /* JADX WARN: Type inference failed for: r1v5, types: [nc.t, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:160:0x0182 -> B:134:0x00c4). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(d1.k r23, d1.f r24, long r25, final mc.l r27, ec.c r28) {
        /*
            Method dump skipped, instructions count: 437
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d1.d.d(d1.k, d1.f, long, mc.l, ec.c):java.lang.Object");
    }

    public static /* synthetic */ Object e(float f8, float f10, float f11, j jVar, mc.p pVar, ec.c cVar, int i2) {
        if ((i2 & 4) != 0) {
            f11 = 0.0f;
        }
        float f12 = f11;
        if ((i2 & 8) != 0) {
            jVar = q(7, null);
        }
        return c(f8, f10, f12, jVar, pVar, cVar);
    }

    public static final Object f(k kVar, t tVar, boolean z10, mc.l lVar, ec.c cVar) {
        long j2;
        s sVar = new s(tVar, kVar.A, kVar.B.getValue(), kVar.L);
        if (z10) {
            j2 = kVar.R;
        } else {
            j2 = Long.MIN_VALUE;
        }
        Object d4 = d(kVar, sVar, j2, lVar, cVar);
        if (d4 == dc.a.COROUTINE_SUSPENDED) {
            return d4;
        }
        return yb.y.f14813a;
    }

    public static final c0 g(e0 e0Var, float f8, b0 b0Var, n2.m mVar, int i2) {
        return j(e0Var, Float.valueOf(0.0f), Float.valueOf(f8), f3545j, b0Var, mVar, (i2 & 1022) | 32768, 0);
    }

    public static final Object h(k kVar, Float f8, j jVar, boolean z10, mc.l lVar, ec.c cVar) {
        long j2;
        h1 h1Var = new h1(jVar, kVar.A, kVar.B.getValue(), f8, kVar.L);
        if (z10) {
            j2 = kVar.R;
        } else {
            j2 = Long.MIN_VALUE;
        }
        Object d4 = d(kVar, h1Var, j2, lVar, cVar);
        if (d4 == dc.a.COROUTINE_SUSPENDED) {
            return d4;
        }
        return yb.y.f14813a;
    }

    public static /* synthetic */ Object i(k kVar, Float f8, a1 a1Var, boolean z10, mc.l lVar, ec.c cVar, int i2) {
        if ((i2 & 2) != 0) {
            a1Var = q(7, null);
        }
        a1 a1Var2 = a1Var;
        if ((i2 & 8) != 0) {
            lVar = new a7.a(15);
        }
        return h(kVar, f8, a1Var2, z10, lVar, cVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0047, code lost:
        if (r1.h(r4) == false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final d1.c0 j(d1.e0 r12, java.lang.Number r13, java.lang.Number r14, d1.w1 r15, d1.b0 r16, n2.m r17, int r18, int r19) {
        /*
            r0 = r18
            r1 = r17
            n2.r r1 = (n2.r) r1
            java.lang.Object r2 = r1.L()
            n2.e r3 = n2.l.f9953a
            if (r2 != r3) goto L1d
            d1.c0 r4 = new d1.c0
            r5 = r12
            r6 = r13
            r7 = r14
            r8 = r15
            r9 = r16
            r4.<init>(r5, r6, r7, r8, r9)
            r1.h0(r4)
            r2 = r4
        L1d:
            r8 = r2
            d1.c0 r8 = (d1.c0) r8
            r2 = r0 & 896(0x380, float:1.256E-42)
            r2 = r2 ^ 384(0x180, float:5.38E-43)
            r4 = 256(0x100, float:3.59E-43)
            r6 = 1
            r7 = 0
            if (r2 <= r4) goto L30
            boolean r2 = r1.h(r14)
            if (r2 != 0) goto L34
        L30:
            r2 = r0 & 384(0x180, float:5.38E-43)
            if (r2 != r4) goto L36
        L34:
            r2 = r6
            goto L37
        L36:
            r2 = r7
        L37:
            r4 = 57344(0xe000, float:8.0356E-41)
            r4 = r4 & r0
            r4 = r4 ^ 24576(0x6000, float:3.4438E-41)
            r10 = 16384(0x4000, float:2.2959E-41)
            if (r4 <= r10) goto L4a
            r4 = r16
            boolean r11 = r1.h(r4)
            if (r11 != 0) goto L52
            goto L4c
        L4a:
            r4 = r16
        L4c:
            r0 = r0 & 24576(0x6000, float:3.4438E-41)
            if (r0 != r10) goto L51
            goto L52
        L51:
            r6 = r7
        L52:
            r0 = r2 | r6
            java.lang.Object r2 = r1.L()
            if (r0 != 0) goto L5c
            if (r2 != r3) goto L69
        L5c:
            ai.z r6 = new ai.z
            r11 = 1
            r7 = r13
            r9 = r14
            r10 = r4
            r6.<init>(r7, r8, r9, r10, r11)
            r1.h0(r6)
            r2 = r6
        L69:
            mc.a r2 = (mc.a) r2
            n2.s.h(r2, r1)
            boolean r0 = r1.h(r12)
            java.lang.Object r2 = r1.L()
            if (r0 != 0) goto L7a
            if (r2 != r3) goto L84
        L7a:
            a7.l r2 = new a7.l
            r0 = 8
            r2.<init>(r0, r12, r8)
            r1.h0(r2)
        L84:
            mc.l r2 = (mc.l) r2
            n2.s.d(r8, r2, r1)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: d1.d.j(d1.e0, java.lang.Number, java.lang.Number, d1.w1, d1.b0, n2.m, int, int):d1.c0");
    }

    public static final p k(p pVar) {
        p c4 = pVar.c();
        int b10 = c4.b();
        for (int i2 = 0; i2 < b10; i2++) {
            c4.e(i2, pVar.a(i2));
        }
        return c4;
    }

    public static k l(k kVar, float f8, float f10, int i2) {
        if ((i2 & 1) != 0) {
            f8 = ((Number) kVar.B.getValue()).floatValue();
        }
        if ((i2 & 2) != 0) {
            f10 = ((l) kVar.L).f3600a;
        }
        return new k(kVar.A, Float.valueOf(f8), new l(f10), kVar.R, kVar.X, kVar.Y);
    }

    public static final void m(i iVar, long j2, float f8, f fVar, k kVar, mc.l lVar) {
        long j10;
        if (f8 == 0.0f) {
            j10 = fVar.c();
        } else {
            j10 = ((float) (j2 - iVar.f3588c)) / f8;
        }
        iVar.f3592g = j2;
        iVar.f3590e.setValue(fVar.b(j10));
        iVar.f3591f = fVar.f(j10);
        if (fVar.g(j10)) {
            iVar.f3593h = iVar.f3592g;
            iVar.f3594i.setValue(Boolean.FALSE);
        }
        s(iVar, kVar);
        lVar.k(iVar);
    }

    public static final float n(cc.g gVar) {
        float f8;
        b3.r rVar = (b3.r) gVar.t(b3.c.f1761j0);
        if (rVar != null) {
            f8 = rVar.K();
        } else {
            f8 = 1.0f;
        }
        if (f8 >= 0.0f) {
            return f8;
        }
        n0.b("negative scale factor");
        return f8;
    }

    public static b0 o(u uVar, o0 o0Var, int i2) {
        if ((i2 & 2) != 0) {
            o0Var = o0.Restart;
        }
        return new b0(uVar, o0Var, 0);
    }

    public static final e0 p(n2.m mVar, int i2) {
        n2.r rVar = (n2.r) mVar;
        Object L = rVar.L();
        if (L == n2.l.f9953a) {
            L = new e0();
            rVar.h0(L);
        }
        e0 e0Var = (e0) L;
        e0Var.a(rVar, 0);
        return e0Var;
    }

    public static a1 q(int i2, Object obj) {
        float f8;
        if ((i2 & 2) != 0) {
            f8 = 1500.0f;
        } else {
            f8 = 400.0f;
        }
        if ((i2 & 4) != 0) {
            obj = null;
        }
        return new a1(1.0f, f8, obj);
    }

    public static v1 r(int i2, int i10, v vVar, int i11) {
        if ((i11 & 1) != 0) {
            i2 = 300;
        }
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            vVar = w.f3687a;
        }
        return new v1(i2, i10, vVar);
    }

    public static final void s(i iVar, k kVar) {
        kVar.B.setValue(iVar.f3590e.getValue());
        p pVar = kVar.L;
        p pVar2 = iVar.f3591f;
        int b10 = pVar.b();
        for (int i2 = 0; i2 < b10; i2++) {
            pVar.e(i2, pVar2.a(i2));
        }
        kVar.X = iVar.f3593h;
        kVar.R = iVar.f3592g;
        kVar.Y = ((Boolean) iVar.f3594i.getValue()).booleanValue();
    }
}
