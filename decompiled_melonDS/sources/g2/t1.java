package g2;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class t1 {

    /* renamed from: a  reason: collision with root package name */
    public float f5402a;

    /* renamed from: b  reason: collision with root package name */
    public float f5403b;

    /* renamed from: c  reason: collision with root package name */
    public float f5404c;

    /* renamed from: d  reason: collision with root package name */
    public float f5405d;

    /* renamed from: e  reason: collision with root package name */
    public final d1.c f5406e;

    /* renamed from: f  reason: collision with root package name */
    public j1.h f5407f;

    /* renamed from: g  reason: collision with root package name */
    public j1.h f5408g;

    public t1(float f8, float f10, float f11, float f12) {
        this.f5402a = f8;
        this.f5403b = f10;
        this.f5404c = f11;
        this.f5405d = f12;
        this.f5406e = new d1.c(new x4.f(f8), d1.d.f3547l, null, 12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARN: Type inference failed for: r6v0, types: [j1.h] */
    /* JADX WARN: Type inference failed for: r6v1, types: [j1.h] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, yb.y] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(j1.h r6, ec.c r7) {
        /*
            r5 = this;
            d1.c r0 = r5.f5406e
            boolean r1 = r7 instanceof g2.r1
            if (r1 == 0) goto L15
            r1 = r7
            g2.r1 r1 = (g2.r1) r1
            int r2 = r1.Z
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.Z = r2
            goto L1a
        L15:
            g2.r1 r1 = new g2.r1
            r1.<init>(r5, r7)
        L1a:
            java.lang.Object r7 = r1.X
            dc.a r2 = dc.a.COROUTINE_SUSPENDED
            int r3 = r1.Z
            r4 = 1
            if (r3 == 0) goto L34
            if (r3 != r4) goto L2d
            j1.h r6 = r1.R
            p7.j.I(r7)     // Catch: java.lang.Throwable -> L2b
            goto L6d
        L2b:
            r7 = move-exception
            goto L72
        L2d:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            a0.j.p(r6)
            r6 = 0
            return r6
        L34:
            p7.j.I(r7)
            boolean r7 = r6 instanceof j1.k
            if (r7 == 0) goto L3e
            float r7 = r5.f5403b
            goto L4e
        L3e:
            boolean r7 = r6 instanceof j1.f
            if (r7 == 0) goto L45
            float r7 = r5.f5404c
            goto L4e
        L45:
            boolean r7 = r6 instanceof j1.d
            if (r7 == 0) goto L4c
            float r7 = r5.f5405d
            goto L4e
        L4c:
            float r7 = r5.f5402a
        L4e:
            r5.f5408g = r6
            n2.f1 r3 = r0.f3527e     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r3 = r3.getValue()     // Catch: java.lang.Throwable -> L2b
            x4.f r3 = (x4.f) r3     // Catch: java.lang.Throwable -> L2b
            float r3 = r3.A     // Catch: java.lang.Throwable -> L2b
            boolean r3 = x4.f.b(r3, r7)     // Catch: java.lang.Throwable -> L2b
            if (r3 != 0) goto L6d
            j1.h r3 = r5.f5407f     // Catch: java.lang.Throwable -> L2b
            r1.R = r6     // Catch: java.lang.Throwable -> L2b
            r1.Z = r4     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r7 = g2.n1.a(r0, r7, r3, r6, r1)     // Catch: java.lang.Throwable -> L2b
            if (r7 != r2) goto L6d
            return r2
        L6d:
            r5.f5407f = r6
            yb.y r6 = yb.y.f14813a
            return r6
        L72:
            r5.f5407f = r6
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: g2.t1.a(j1.h, ec.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(ec.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof g2.s1
            if (r0 == 0) goto L13
            r0 = r6
            g2.s1 r0 = (g2.s1) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            g2.s1 r0 = new g2.s1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.R
            dc.a r1 = dc.a.COROUTINE_SUSPENDED
            int r2 = r0.Y
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L29
            p7.j.I(r6)     // Catch: java.lang.Throwable -> L27
            goto L6c
        L27:
            r6 = move-exception
            goto L71
        L29:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            a0.j.p(r6)
            r6 = 0
            return r6
        L30:
            p7.j.I(r6)
            j1.h r6 = r5.f5408g
            boolean r2 = r6 instanceof j1.k
            if (r2 == 0) goto L3c
            float r6 = r5.f5403b
            goto L4c
        L3c:
            boolean r2 = r6 instanceof j1.f
            if (r2 == 0) goto L43
            float r6 = r5.f5404c
            goto L4c
        L43:
            boolean r6 = r6 instanceof j1.d
            if (r6 == 0) goto L4a
            float r6 = r5.f5405d
            goto L4c
        L4a:
            float r6 = r5.f5402a
        L4c:
            d1.c r2 = r5.f5406e
            n2.f1 r4 = r2.f3527e
            java.lang.Object r4 = r4.getValue()
            x4.f r4 = (x4.f) r4
            float r4 = r4.A
            boolean r4 = x4.f.b(r4, r6)
            if (r4 != 0) goto L76
            x4.f r4 = new x4.f     // Catch: java.lang.Throwable -> L27
            r4.<init>(r6)     // Catch: java.lang.Throwable -> L27
            r0.Y = r3     // Catch: java.lang.Throwable -> L27
            java.lang.Object r6 = r2.f(r0, r4)     // Catch: java.lang.Throwable -> L27
            if (r6 != r1) goto L6c
            return r1
        L6c:
            j1.h r6 = r5.f5408g
            r5.f5407f = r6
            goto L76
        L71:
            j1.h r0 = r5.f5408g
            r5.f5407f = r0
            throw r6
        L76:
            yb.y r6 = yb.y.f14813a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: g2.t1.b(ec.c):java.lang.Object");
    }
}
