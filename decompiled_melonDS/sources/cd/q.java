package cd;

import androidx.preference.Preference;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class q {

    /* renamed from: a */
    public static final u1.h1 f2854a = new u1.h1(24);

    /* renamed from: b */
    public static final a0.c f2855b = new a0.c("NO_VALUE", 1);

    /* renamed from: c */
    public static final a0.c f2856c = new a0.c("NONE", 1);

    /* renamed from: d */
    public static final a0.c f2857d = new a0.c("PENDING", 1);

    public static final e1 a(int i2, int i10, bd.a aVar) {
        if (i2 >= 0) {
            if (i10 >= 0) {
                if (i2 <= 0 && i10 <= 0 && aVar != bd.a.SUSPEND) {
                    fj.j.t(aVar, "replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy ");
                    return null;
                }
                int i11 = i10 + i2;
                if (i11 < 0) {
                    i11 = Preference.DEFAULT_ORDER;
                }
                return new e1(i2, i11, aVar);
            }
            a0.j.e(w.d.l(i10, "extraBufferCapacity cannot be negative, but was "));
            return null;
        }
        a0.j.e(w.d.l(i2, "replay cannot be negative, but was "));
        return null;
    }

    public static /* synthetic */ e1 b(int i2, int i10, bd.a aVar, int i11) {
        if ((i11 & 1) != 0) {
            i2 = 0;
        }
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            aVar = bd.a.SUSPEND;
        }
        return a(i2, i10, aVar);
    }

    public static final q1 c(Object obj) {
        if (obj == null) {
            obj = dd.c.f4036b;
        }
        return new q1(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final dc.a d(cd.i r4, java.lang.Object r5, java.lang.Object r6, ec.c r7) {
        /*
            boolean r0 = r7 instanceof cd.e0
            if (r0 == 0) goto L13
            r0 = r7
            cd.e0 r0 = (cd.e0) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            cd.e0 r0 = new cd.e0
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.X
            dc.a r1 = dc.a.COROUTINE_SUSPENDED
            int r2 = r0.Y
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 == r3) goto L2a
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            a0.j.p(r4)
            r4 = 0
            return r4
        L2a:
            java.lang.Object r6 = r0.R
            p7.j.I(r7)
            goto L3e
        L30:
            p7.j.I(r7)
            r0.R = r6
            r0.Y = r3
            java.lang.Object r4 = r4.a(r5, r0)
            if (r4 != r1) goto L3e
            return r1
        L3e:
            dd.a r4 = new dd.a
            r4.<init>(r6)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: cd.q.d(cd.i, java.lang.Object, java.lang.Object, ec.c):dc.a");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object e(cd.w1 r4, mc.q r5, java.lang.Throwable r6, ec.c r7) {
        /*
            boolean r0 = r7 instanceof cd.r
            if (r0 == 0) goto L13
            r0 = r7
            cd.r r0 = (cd.r) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            cd.r r0 = new cd.r
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.X
            dc.a r1 = dc.a.COROUTINE_SUSPENDED
            int r2 = r0.Y
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2b
            java.lang.Throwable r6 = r0.R
            p7.j.I(r7)     // Catch: java.lang.Throwable -> L29
            goto L40
        L29:
            r4 = move-exception
            goto L43
        L2b:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            a0.j.p(r4)
            r4 = 0
            return r4
        L32:
            p7.j.I(r7)
            r0.R = r6     // Catch: java.lang.Throwable -> L29
            r0.Y = r3     // Catch: java.lang.Throwable -> L29
            java.lang.Object r4 = r5.i(r4, r6, r0)     // Catch: java.lang.Throwable -> L29
            if (r4 != r1) goto L40
            return r1
        L40:
            yb.y r4 = yb.y.f14813a
            return r4
        L43:
            if (r6 == 0) goto L4a
            if (r6 == r4) goto L4a
            p7.t.a(r4, r6)
        L4a:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: cd.q.e(cd.w1, mc.q, java.lang.Throwable, ec.c):java.lang.Object");
    }

    public static final void f(Object[] objArr, long j2, Object obj) {
        objArr[((int) j2) & (objArr.length - 1)] = obj;
    }

    public static h g(h hVar, int i2) {
        bd.a aVar = bd.a.SUSPEND;
        if (i2 < 0 && i2 != -2 && i2 != -1) {
            a0.j.e(w.d.l(i2, "Buffer size should be non-negative, BUFFERED, or CONFLATED, but was "));
            return null;
        }
        if (i2 == -1) {
            aVar = bd.a.DROP_OLDEST;
            i2 = 0;
        }
        int i10 = i2;
        bd.a aVar2 = aVar;
        if (hVar instanceof dd.s) {
            return dd.c.b((dd.s) hVar, null, i10, aVar2, 1);
        }
        return new dd.g(hVar, null, i10, aVar2, 2);
    }

    public static final c h(mc.p pVar) {
        return new c(pVar, cc.h.A, -2, bd.a.SUSPEND);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0081 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0082  */
    /* JADX WARN: Type inference failed for: r7v2, types: [nc.t, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.io.Serializable i(cd.h r5, cd.i r6, ec.c r7) {
        /*
            boolean r0 = r7 instanceof cd.y
            if (r0 == 0) goto L13
            r0 = r7
            cd.y r0 = (cd.y) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            cd.y r0 = new cd.y
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.X
            dc.a r1 = dc.a.COROUTINE_SUSPENDED
            int r2 = r0.Y
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2b
            nc.t r5 = r0.R
            p7.j.I(r7)     // Catch: java.lang.Throwable -> L29
            goto L4b
        L29:
            r6 = move-exception
            goto L4f
        L2b:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            a0.j.p(r5)
            r5 = 0
            return r5
        L32:
            p7.j.I(r7)
            nc.t r7 = new nc.t
            r7.<init>()
            cd.a0 r2 = new cd.a0     // Catch: java.lang.Throwable -> L4d
            r4 = 0
            r2.<init>(r4, r6, r7)     // Catch: java.lang.Throwable -> L4d
            r0.R = r7     // Catch: java.lang.Throwable -> L4d
            r0.Y = r3     // Catch: java.lang.Throwable -> L4d
            java.lang.Object r5 = r5.c(r2, r0)     // Catch: java.lang.Throwable -> L4d
            if (r5 != r1) goto L4b
            return r1
        L4b:
            r5 = 0
            return r5
        L4d:
            r6 = move-exception
            r5 = r7
        L4f:
            java.lang.Object r5 = r5.A
            java.lang.Throwable r5 = (java.lang.Throwable) r5
            if (r5 == 0) goto L5b
            boolean r7 = r5.equals(r6)
            if (r7 != 0) goto L7e
        L5b:
            cc.g r7 = r0.B
            r7.getClass()
            zc.r r0 = zc.r.B
            cc.e r7 = r7.t(r0)
            zc.y0 r7 = (zc.y0) r7
            if (r7 == 0) goto L7f
            boolean r0 = r7.isCancelled()
            if (r0 != 0) goto L71
            goto L7f
        L71:
            java.util.concurrent.CancellationException r7 = r7.B()
            if (r7 == 0) goto L7f
            boolean r7 = r7.equals(r6)
            if (r7 != 0) goto L7e
            goto L7f
        L7e:
            throw r6
        L7f:
            if (r5 != 0) goto L82
            return r6
        L82:
            boolean r7 = r6 instanceof java.util.concurrent.CancellationException
            if (r7 == 0) goto L8a
            p7.t.a(r5, r6)
            throw r5
        L8a:
            p7.t.a(r6, r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: cd.q.i(cd.h, cd.i, ec.c):java.io.Serializable");
    }

    public static final Object j(h hVar, mc.p pVar, cc.c cVar) {
        int i2 = j0.f2836a;
        Object c4 = g(z(hVar, new ah.n0(pVar, (cc.c) null)), 0).c(dd.u.A, cVar);
        dc.a aVar = dc.a.COROUTINE_SUSPENDED;
        yb.y yVar = yb.y.f14813a;
        if (c4 != aVar) {
            c4 = yVar;
        }
        if (c4 == aVar) {
            return c4;
        }
        return yVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x002e, code lost:
        if (r4 == 0) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final cd.h1 k(cd.h r7, int r8) {
        /*
            bd.k r0 = bd.l.f2189b
            r0.getClass()
            int r0 = bd.k.f2188b
            if (r8 >= r0) goto La
            goto Lb
        La:
            r0 = r8
        Lb:
            int r0 = r0 - r8
            boolean r1 = r7 instanceof dd.e
            if (r1 == 0) goto L3b
            r1 = r7
            dd.e r1 = (dd.e) r1
            bd.a r2 = r1.L
            cd.h r3 = r1.g()
            if (r3 == 0) goto L3b
            cd.h1 r7 = new cd.h1
            int r4 = r1.B
            r5 = -3
            if (r4 == r5) goto L29
            r5 = -2
            if (r4 == r5) goto L29
            if (r4 == 0) goto L29
            r0 = r4
            goto L35
        L29:
            bd.a r5 = bd.a.SUSPEND
            r6 = 0
            if (r2 != r5) goto L32
            if (r4 != 0) goto L35
        L30:
            r0 = r6
            goto L35
        L32:
            if (r8 != 0) goto L30
            r0 = 1
        L35:
            cc.g r8 = r1.A
            r7.<init>(r0, r2, r8, r3)
            return r7
        L3b:
            cd.h1 r8 = new cd.h1
            bd.a r1 = bd.a.SUSPEND
            cc.h r2 = cc.h.A
            r8.<init>(r0, r1, r2, r7)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: cd.q.k(cd.h, int):cd.h1");
    }

    public static final h l(h hVar, long j2) {
        int i2 = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
        if (i2 >= 0) {
            if (i2 == 0) {
                return hVar;
            }
            return new z0(new m(new k(0, j2), hVar, null));
        }
        a0.j.h("Debounce timeout should not be negative");
        return null;
    }

    public static final h m(h hVar) {
        if (hVar instanceof o1) {
            return hVar;
        }
        return n(hVar, f2854a);
    }

    public static final f n(h hVar, mc.l lVar) {
        if (hVar instanceof f) {
            f fVar = (f) hVar;
            if (fVar.B == lVar) {
                return fVar;
            }
        }
        return new f(hVar, lVar);
    }

    public static final Object o(i iVar, h hVar, ec.j jVar) {
        if (!(iVar instanceof w1)) {
            Object c4 = hVar.c(iVar, jVar);
            if (c4 == dc.a.COROUTINE_SUSPENDED) {
                return c4;
            }
            return yb.y.f14813a;
        }
        throw ((w1) iVar).A;
    }

    /* JADX WARN: Code restructure failed: missing block: B:86:0x0084, code lost:
        if (r2.a(r10, r0) == r1) goto L17;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0072 A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #1 {all -> 0x0035, blocks: (B:67:0x002f, B:79:0x0055, B:83:0x006a, B:85:0x0072, B:74:0x0046, B:78:0x0051), top: B:106:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0087  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:86:0x0084 -> B:68:0x0032). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object p(cd.i r7, bd.l r8, boolean r9, cc.c r10) {
        /*
            boolean r0 = r10 instanceof cd.j
            if (r0 == 0) goto L13
            r0 = r10
            cd.j r0 = (cd.j) r0
            int r1 = r0.f2835c0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2835c0 = r1
            goto L18
        L13:
            cd.j r0 = new cd.j
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f2834b0
            dc.a r1 = dc.a.COROUTINE_SUSPENDED
            int r2 = r0.f2835c0
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L4a
            if (r2 == r5) goto L3e
            if (r2 != r4) goto L37
            boolean r9 = r0.Z
            bd.c r7 = r0.Y
            bd.l r8 = r0.X
            cd.i r2 = r0.R
            p7.j.I(r10)     // Catch: java.lang.Throwable -> L35
        L32:
            r10 = r7
            r7 = r2
            goto L55
        L35:
            r7 = move-exception
            goto L8f
        L37:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            a0.j.p(r7)
            r7 = 0
            return r7
        L3e:
            boolean r9 = r0.Z
            bd.c r7 = r0.Y
            bd.l r8 = r0.X
            cd.i r2 = r0.R
            p7.j.I(r10)     // Catch: java.lang.Throwable -> L35
            goto L6a
        L4a:
            p7.j.I(r10)
            boolean r10 = r7 instanceof cd.w1
            if (r10 != 0) goto Laa
            bd.c r10 = r8.iterator()     // Catch: java.lang.Throwable -> L35
        L55:
            r0.R = r7     // Catch: java.lang.Throwable -> L35
            r0.X = r8     // Catch: java.lang.Throwable -> L35
            r0.Y = r10     // Catch: java.lang.Throwable -> L35
            r0.Z = r9     // Catch: java.lang.Throwable -> L35
            r0.f2835c0 = r5     // Catch: java.lang.Throwable -> L35
            java.lang.Object r2 = r10.a(r0)     // Catch: java.lang.Throwable -> L35
            if (r2 != r1) goto L66
            goto L86
        L66:
            r6 = r2
            r2 = r7
            r7 = r10
            r10 = r6
        L6a:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L35
            boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L35
            if (r10 == 0) goto L87
            java.lang.Object r10 = r7.c()     // Catch: java.lang.Throwable -> L35
            r0.R = r2     // Catch: java.lang.Throwable -> L35
            r0.X = r8     // Catch: java.lang.Throwable -> L35
            r0.Y = r7     // Catch: java.lang.Throwable -> L35
            r0.Z = r9     // Catch: java.lang.Throwable -> L35
            r0.f2835c0 = r4     // Catch: java.lang.Throwable -> L35
            java.lang.Object r10 = r2.a(r10, r0)     // Catch: java.lang.Throwable -> L35
            if (r10 != r1) goto L32
        L86:
            return r1
        L87:
            if (r9 == 0) goto L8c
            r8.i(r3)
        L8c:
            yb.y r7 = yb.y.f14813a
            return r7
        L8f:
            throw r7     // Catch: java.lang.Throwable -> L90
        L90:
            r10 = move-exception
            if (r9 == 0) goto La9
            boolean r9 = r7 instanceof java.util.concurrent.CancellationException
            if (r9 == 0) goto L9a
            r3 = r7
            java.util.concurrent.CancellationException r3 = (java.util.concurrent.CancellationException) r3
        L9a:
            if (r3 != 0) goto La6
            java.util.concurrent.CancellationException r3 = new java.util.concurrent.CancellationException
            java.lang.String r9 = "Channel was consumed, consumer had failed"
            r3.<init>(r9)
            r3.initCause(r7)
        La6:
            r8.i(r3)
        La9:
            throw r10
        Laa:
            cd.w1 r7 = (cd.w1) r7
            java.lang.Throwable r7 = r7.A
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: cd.q.p(cd.i, bd.l, boolean, cc.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0069 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0070  */
    /* JADX WARN: Type inference failed for: r7v2, types: [nc.t, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object q(cd.h r6, ec.c r7) {
        /*
            a0.c r0 = dd.c.f4036b
            boolean r1 = r7 instanceof cd.m0
            if (r1 == 0) goto L15
            r1 = r7
            cd.m0 r1 = (cd.m0) r1
            int r2 = r1.Z
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.Z = r2
            goto L1a
        L15:
            cd.m0 r1 = new cd.m0
            r1.<init>(r7)
        L1a:
            java.lang.Object r7 = r1.Y
            dc.a r2 = dc.a.COROUTINE_SUSPENDED
            int r3 = r1.Z
            r4 = 1
            if (r3 == 0) goto L36
            if (r3 != r4) goto L2f
            cd.k0 r6 = r1.X
            nc.t r2 = r1.R
            p7.j.I(r7)     // Catch: dd.a -> L2d
            goto L65
        L2d:
            r7 = move-exception
            goto L59
        L2f:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            a0.j.p(r6)
        L34:
            r6 = 0
            return r6
        L36:
            p7.j.I(r7)
            nc.t r7 = new nc.t
            r7.<init>()
            r7.A = r0
            cd.k0 r3 = new cd.k0
            r5 = 0
            r3.<init>(r7, r5)
            r1.R = r7     // Catch: dd.a -> L55
            r1.X = r3     // Catch: dd.a -> L55
            r1.Z = r4     // Catch: dd.a -> L55
            java.lang.Object r6 = r6.c(r3, r1)     // Catch: dd.a -> L55
            if (r6 != r2) goto L53
            return r2
        L53:
            r2 = r7
            goto L65
        L55:
            r6 = move-exception
            r2 = r7
            r7 = r6
            r6 = r3
        L59:
            java.lang.Object r3 = r7.A
            if (r3 != r6) goto L70
            cc.g r6 = r1.B
            r6.getClass()
            zc.x.j(r6)
        L65:
            java.lang.Object r6 = r2.A
            if (r6 == r0) goto L6a
            return r6
        L6a:
            java.lang.String r6 = "Expected at least one element"
            m9.o.x(r6)
            goto L34
        L70:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: cd.q.q(cd.h, ec.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0069 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0070  */
    /* JADX WARN: Type inference failed for: r8v2, types: [nc.t, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object r(cd.h r6, mc.p r7, ec.c r8) {
        /*
            a0.c r0 = dd.c.f4036b
            boolean r1 = r8 instanceof cd.n0
            if (r1 == 0) goto L15
            r1 = r8
            cd.n0 r1 = (cd.n0) r1
            int r2 = r1.Z
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.Z = r2
            goto L1a
        L15:
            cd.n0 r1 = new cd.n0
            r1.<init>(r8)
        L1a:
            java.lang.Object r8 = r1.Y
            dc.a r2 = dc.a.COROUTINE_SUSPENDED
            int r3 = r1.Z
            r4 = 1
            if (r3 == 0) goto L36
            if (r3 != r4) goto L2f
            cd.a0 r6 = r1.X
            nc.t r7 = r1.R
            p7.j.I(r8)     // Catch: dd.a -> L2d
            goto L65
        L2d:
            r8 = move-exception
            goto L59
        L2f:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            a0.j.p(r6)
        L34:
            r6 = 0
            return r6
        L36:
            p7.j.I(r8)
            nc.t r8 = new nc.t
            r8.<init>()
            r8.A = r0
            cd.a0 r3 = new cd.a0
            r5 = 3
            r3.<init>(r5, r7, r8)
            r1.R = r8     // Catch: dd.a -> L55
            r1.X = r3     // Catch: dd.a -> L55
            r1.Z = r4     // Catch: dd.a -> L55
            java.lang.Object r6 = r6.c(r3, r1)     // Catch: dd.a -> L55
            if (r6 != r2) goto L53
            return r2
        L53:
            r7 = r8
            goto L65
        L55:
            r6 = move-exception
            r7 = r8
            r8 = r6
            r6 = r3
        L59:
            java.lang.Object r2 = r8.A
            if (r2 != r6) goto L70
            cc.g r6 = r1.B
            r6.getClass()
            zc.x.j(r6)
        L65:
            java.lang.Object r6 = r7.A
            if (r6 == r0) goto L6a
            return r6
        L6a:
            java.lang.String r6 = "Expected at least one element matching the predicate"
            m9.o.x(r6)
            goto L34
        L70:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: cd.q.r(cd.h, mc.p, ec.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0064  */
    /* JADX WARN: Type inference failed for: r6v2, types: [nc.t, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object s(cd.h r5, ec.c r6) {
        /*
            boolean r0 = r6 instanceof cd.o0
            if (r0 == 0) goto L13
            r0 = r6
            cd.o0 r0 = (cd.o0) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            cd.o0 r0 = new cd.o0
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.Y
            dc.a r1 = dc.a.COROUTINE_SUSPENDED
            int r2 = r0.Z
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2d
            cd.k0 r5 = r0.X
            nc.t r1 = r0.R
            p7.j.I(r6)     // Catch: dd.a -> L2b
            goto L61
        L2b:
            r6 = move-exception
            goto L55
        L2d:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            a0.j.p(r5)
            r5 = 0
            return r5
        L34:
            p7.j.I(r6)
            nc.t r6 = new nc.t
            r6.<init>()
            cd.k0 r2 = new cd.k0
            r4 = 1
            r2.<init>(r6, r4)
            r0.R = r6     // Catch: dd.a -> L51
            r0.X = r2     // Catch: dd.a -> L51
            r0.Z = r3     // Catch: dd.a -> L51
            java.lang.Object r5 = r5.c(r2, r0)     // Catch: dd.a -> L51
            if (r5 != r1) goto L4f
            return r1
        L4f:
            r1 = r6
            goto L61
        L51:
            r5 = move-exception
            r1 = r6
            r6 = r5
            r5 = r2
        L55:
            java.lang.Object r2 = r6.A
            if (r2 != r5) goto L64
            cc.g r5 = r0.B
            r5.getClass()
            zc.x.j(r5)
        L61:
            java.lang.Object r5 = r1.A
            return r5
        L64:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: cd.q.s(cd.h, ec.c):java.lang.Object");
    }

    public static final h t(h hVar, cc.g gVar) {
        if (gVar.t(zc.r.B) == null) {
            if (gVar.equals(cc.h.A)) {
                return hVar;
            }
            if (hVar instanceof dd.s) {
                return dd.c.b((dd.s) hVar, gVar, 0, null, 6);
            }
            return new dd.g(hVar, gVar, 0, null, 12);
        }
        fj.j.t(gVar, "Flow context cannot contain job in it. Had ");
        return null;
    }

    public static final h u(a1 a1Var, cc.g gVar, int i2, bd.a aVar) {
        if ((i2 == 0 || i2 == -3) && aVar == bd.a.SUSPEND) {
            return a1Var;
        }
        return new dd.f(i2, aVar, gVar, a1Var);
    }

    public static final void v(h hVar, zc.u uVar) {
        zc.x.v(uVar, null, null, new a9.b(5, null, hVar), 3);
    }

    public static final dd.l w(h... hVarArr) {
        Iterable gVar;
        int i2 = j0.f2836a;
        if (hVarArr.length == 0) {
            gVar = zb.q.A;
        } else {
            gVar = new ld.g(2, hVarArr);
        }
        return new dd.l(gVar, cc.h.A, -2, bd.a.SUSPEND);
    }

    public static final d x(bd.h hVar) {
        return new d(hVar, false);
    }

    public static final x0 y(h hVar, zc.u uVar, j1 j1Var, int i2) {
        zc.w wVar;
        h1 k10 = k(hVar, i2);
        e1 a10 = a(i2, k10.A, (bd.a) k10.L);
        cc.g gVar = (cc.g) k10.R;
        h hVar2 = (h) k10.B;
        if (j1Var.equals(i1.f2832a)) {
            wVar = zc.w.DEFAULT;
        } else {
            wVar = zc.w.UNDISPATCHED;
        }
        zc.x.u(uVar, gVar, wVar, new a9.d(j1Var, hVar2, a10, f2855b, (cc.c) null));
        return new x0(a10);
    }

    public static final dd.k z(h hVar, mc.q qVar) {
        int i2 = j0.f2836a;
        return new dd.k(qVar, hVar, cc.h.A, -2, bd.a.SUSPEND);
    }
}
