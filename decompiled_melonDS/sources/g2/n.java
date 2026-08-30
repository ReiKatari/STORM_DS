package g2;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class n {

    /* renamed from: a  reason: collision with root package name */
    public final mc.l f5263a;

    /* renamed from: b  reason: collision with root package name */
    public final mc.a f5264b;

    /* renamed from: c  reason: collision with root package name */
    public final d1.j f5265c;

    /* renamed from: d  reason: collision with root package name */
    public final mc.l f5266d;

    /* renamed from: g  reason: collision with root package name */
    public final n2.f1 f5269g;

    /* renamed from: k  reason: collision with root package name */
    public final n2.b1 f5273k;

    /* renamed from: l  reason: collision with root package name */
    public final n2.f1 f5274l;
    public final n2.f1 m;

    /* renamed from: n  reason: collision with root package name */
    public final k f5275n;

    /* renamed from: e  reason: collision with root package name */
    public final f2 f5267e = new f2();

    /* renamed from: f  reason: collision with root package name */
    public final a0.g f5268f = new a0.g(this);

    /* renamed from: h  reason: collision with root package name */
    public final n2.e0 f5270h = n2.s.q(new g(this, 0));

    /* renamed from: i  reason: collision with root package name */
    public final n2.e0 f5271i = n2.s.q(new g(this, 1));

    /* renamed from: j  reason: collision with root package name */
    public final n2.b1 f5272j = new n2.b1(Float.NaN);

    public n(Object obj, mc.l lVar, mc.a aVar, d1.j jVar, mc.l lVar2) {
        this.f5263a = lVar;
        this.f5264b = aVar;
        this.f5265c = jVar;
        this.f5266d = lVar2;
        this.f5269g = n2.s.w(obj);
        n2.s.r(new g(this, 2), n2.e.Z);
        this.f5273k = new n2.b1(0.0f);
        this.f5274l = n2.s.w(null);
        this.m = n2.s.w(new g2(zb.r.A));
        this.f5275n = new k(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(f1.f1 r10, g2.l r11, ec.c r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof g2.h
            if (r0 == 0) goto L13
            r0 = r12
            g2.h r0 = (g2.h) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            g2.h r0 = new g2.h
            r0.<init>(r9, r12)
        L18:
            java.lang.Object r12 = r0.R
            dc.a r1 = dc.a.COROUTINE_SUSPENDED
            int r2 = r0.Y
            mc.l r3 = r9.f5266d
            r4 = 1056964608(0x3f000000, float:0.5)
            r5 = 1
            n2.b1 r6 = r9.f5272j
            if (r2 == 0) goto L36
            if (r2 != r5) goto L2f
            p7.j.I(r12)     // Catch: java.lang.Throwable -> L2d
            goto L53
        L2d:
            r10 = move-exception
            goto L88
        L2f:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            a0.j.p(r10)
            r10 = 0
            return r10
        L36:
            p7.j.I(r12)
            g2.f2 r12 = r9.f5267e     // Catch: java.lang.Throwable -> L2d
            b2.c r2 = new b2.c     // Catch: java.lang.Throwable -> L2d
            r7 = 2
            r8 = 0
            r2.<init>(r9, r11, r8, r7)     // Catch: java.lang.Throwable -> L2d
            r0.Y = r5     // Catch: java.lang.Throwable -> L2d
            r12.getClass()     // Catch: java.lang.Throwable -> L2d
            b4.i3 r11 = new b4.i3     // Catch: java.lang.Throwable -> L2d
            r11.<init>(r10, r12, r2, r8)     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r10 = zc.x.g(r11, r0)     // Catch: java.lang.Throwable -> L2d
            if (r10 != r1) goto L53
            return r1
        L53:
            g2.g2 r10 = r9.d()
            float r11 = r6.g()
            java.lang.Object r10 = r10.a(r11)
            if (r10 == 0) goto L85
            float r11 = r6.g()
            g2.g2 r12 = r9.d()
            float r12 = r12.c(r10)
            float r11 = r11 - r12
            float r11 = java.lang.Math.abs(r11)
            int r11 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r11 > 0) goto L85
            java.lang.Object r11 = r3.k(r10)
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto L85
            r9.f(r10)
        L85:
            yb.y r10 = yb.y.f14813a
            return r10
        L88:
            g2.g2 r11 = r9.d()
            float r12 = r6.g()
            java.lang.Object r11 = r11.a(r12)
            if (r11 == 0) goto Lba
            float r12 = r6.g()
            g2.g2 r0 = r9.d()
            float r0 = r0.c(r11)
            float r12 = r12 - r0
            float r12 = java.lang.Math.abs(r12)
            int r12 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r12 > 0) goto Lba
            java.lang.Object r12 = r3.k(r11)
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 == 0) goto Lba
            r9.f(r11)
        Lba:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: g2.n.a(f1.f1, g2.l, ec.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r10, f1.f1 r11, g2.d r12, ec.c r13) {
        /*
            r9 = this;
            boolean r0 = r13 instanceof g2.i
            if (r0 == 0) goto L13
            r0 = r13
            g2.i r0 = (g2.i) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            g2.i r0 = new g2.i
            r0.<init>(r9, r13)
        L18:
            java.lang.Object r13 = r0.R
            dc.a r1 = dc.a.COROUTINE_SUSPENDED
            int r2 = r0.Y
            n2.f1 r3 = r9.f5274l
            mc.l r4 = r9.f5266d
            r5 = 1056964608(0x3f000000, float:0.5)
            r6 = 1
            r7 = 0
            n2.b1 r8 = r9.f5272j
            if (r2 == 0) goto L39
            if (r2 != r6) goto L32
            p7.j.I(r13)     // Catch: java.lang.Throwable -> L30
            goto L60
        L30:
            r10 = move-exception
            goto L96
        L32:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            a0.j.p(r10)
            r10 = 0
            return r10
        L39:
            p7.j.I(r13)
            g2.g2 r13 = r9.d()
            java.util.Map r13 = r13.f5159a
            boolean r13 = r13.containsKey(r10)
            if (r13 == 0) goto Lcc
            g2.f2 r13 = r9.f5267e     // Catch: java.lang.Throwable -> L30
            g2.j r2 = new g2.j     // Catch: java.lang.Throwable -> L30
            r2.<init>(r9, r10, r12, r7)     // Catch: java.lang.Throwable -> L30
            r0.Y = r6     // Catch: java.lang.Throwable -> L30
            r13.getClass()     // Catch: java.lang.Throwable -> L30
            b4.i3 r10 = new b4.i3     // Catch: java.lang.Throwable -> L30
            r10.<init>(r11, r13, r2, r7)     // Catch: java.lang.Throwable -> L30
            java.lang.Object r10 = zc.x.g(r10, r0)     // Catch: java.lang.Throwable -> L30
            if (r10 != r1) goto L60
            return r1
        L60:
            r3.setValue(r7)
            g2.g2 r10 = r9.d()
            float r11 = r8.g()
            java.lang.Object r10 = r10.a(r11)
            if (r10 == 0) goto Lcf
            float r11 = r8.g()
            g2.g2 r12 = r9.d()
            float r12 = r12.c(r10)
            float r11 = r11 - r12
            float r11 = java.lang.Math.abs(r11)
            int r11 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r11 > 0) goto Lcf
            java.lang.Object r11 = r4.k(r10)
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto Lcf
            r9.f(r10)
            goto Lcf
        L96:
            r3.setValue(r7)
            g2.g2 r11 = r9.d()
            float r12 = r8.g()
            java.lang.Object r11 = r11.a(r12)
            if (r11 == 0) goto Lcb
            float r12 = r8.g()
            g2.g2 r13 = r9.d()
            float r13 = r13.c(r11)
            float r12 = r12 - r13
            float r12 = java.lang.Math.abs(r12)
            int r12 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r12 > 0) goto Lcb
            java.lang.Object r12 = r4.k(r11)
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 == 0) goto Lcb
            r9.f(r11)
        Lcb:
            throw r10
        Lcc:
            r9.f(r10)
        Lcf:
            yb.y r10 = yb.y.f14813a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: g2.n.b(java.lang.Object, f1.f1, g2.d, ec.c):java.lang.Object");
    }

    public final Object c(float f8, float f10, Object obj) {
        g2 d4 = d();
        float c4 = d4.c(obj);
        float floatValue = ((Number) this.f5264b.b()).floatValue();
        int i2 = (c4 > f8 ? 1 : (c4 == f8 ? 0 : -1));
        if (i2 != 0 && !Float.isNaN(c4)) {
            mc.l lVar = this.f5263a;
            if (i2 < 0) {
                if (f10 >= floatValue) {
                    Object b10 = d4.b(f8, true);
                    b10.getClass();
                    return b10;
                }
                Object b11 = d4.b(f8, true);
                b11.getClass();
                if (f8 >= Math.abs(Math.abs(((Number) lVar.k(Float.valueOf(Math.abs(d4.c(b11) - c4)))).floatValue()) + c4)) {
                    return b11;
                }
            } else if (f10 <= (-floatValue)) {
                Object b12 = d4.b(f8, false);
                b12.getClass();
                return b12;
            } else {
                Object b13 = d4.b(f8, false);
                b13.getClass();
                float abs = Math.abs(c4 - Math.abs(((Number) lVar.k(Float.valueOf(Math.abs(c4 - d4.c(b13))))).floatValue()));
                if (f8 >= 0.0f ? f8 <= abs : Math.abs(f8) >= abs) {
                    return b13;
                }
            }
        }
        return obj;
    }

    public final g2 d() {
        return (g2) this.m.getValue();
    }

    public final float e() {
        n2.b1 b1Var = this.f5272j;
        if (!Float.isNaN(b1Var.g())) {
            return b1Var.g();
        }
        a0.j.p("The offset was read before being initialized. Did you access the offset in a phase before layout, like effects or composition?");
        return 0.0f;
    }

    public final void f(Object obj) {
        this.f5269g.setValue(obj);
    }
}
