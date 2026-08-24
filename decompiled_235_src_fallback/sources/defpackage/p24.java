package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: p24  reason: default package */
/* loaded from: classes.dex */
public class p24 extends android.graphics.drawable.Drawable implements defpackage.xe6 {
    public static final android.graphics.Paint A0 = null;
    public static final defpackage.o24[] B0 = null;
    public final defpackage.m24 A;
    public defpackage.n24 B;
    public final defpackage.ve6[] L;
    public final defpackage.ve6[] R;
    public final java.util.BitSet X;
    public boolean Y;
    public boolean Z;
    public final android.graphics.Matrix d0;
    public final android.graphics.Path e0;
    public final android.graphics.Path f0;
    public final android.graphics.RectF g0;
    public final android.graphics.RectF h0;
    public final android.graphics.Region i0;
    public final android.graphics.Region j0;
    public final android.graphics.Paint k0;
    public final android.graphics.Paint l0;
    public final defpackage.ie6 m0;
    public final defpackage.m24 n0;
    public final defpackage.oe6 o0;
    public android.graphics.PorterDuffColorFilter p0;
    public android.graphics.PorterDuffColorFilter q0;
    public final android.graphics.RectF r0;
    public final boolean s0;
    public boolean t0;
    public defpackage.me6 u0;
    public defpackage.go6 v0;
    public final defpackage.fo6[] w0;
    public float[] x0;
    public float[] y0;
    public defpackage.h61 z0;

    static {
            android.graphics.Paint r0 = new android.graphics.Paint
            r1 = 1
            r0.<init>(r1)
            defpackage.p24.A0 = r0
            r1 = -1
            r0.setColor(r1)
            android.graphics.PorterDuffXfermode r1 = new android.graphics.PorterDuffXfermode
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.DST_OUT
            r1.<init>(r2)
            r0.setXfermode(r1)
            r0 = 4
            o24[] r0 = new defpackage.o24[r0]
            defpackage.p24.B0 = r0
            r0 = 0
        L1c:
            o24[] r1 = defpackage.p24.B0
            int r2 = r1.length
            if (r0 >= r2) goto L2b
            o24 r2 = new o24
            r2.<init>(r0)
            r1[r0] = r2
            int r0 = r0 + 1
            goto L1c
        L2b:
            return
    }

    public p24() {
            r1 = this;
            me6 r0 = new me6
            r0.<init>()
            r1.<init>(r0)
            return
    }

    public p24(android.content.Context r1, android.util.AttributeSet r2, int r3, int r4) {
            r0 = this;
            le6 r1 = defpackage.me6.b(r1, r2, r3, r4)
            me6 r1 = r1.a()
            r0.<init>(r1)
            return
    }

    public p24(defpackage.me6 r2) {
            r1 = this;
            n24 r0 = new n24
            r0.<init>(r2)
            r1.<init>(r0)
            return
    }

    public p24(defpackage.n24 r7) {
            r6 = this;
            r6.<init>()
            m24 r0 = new m24
            r0.<init>(r6)
            r6.A = r0
            r0 = 4
            ve6[] r1 = new defpackage.ve6[r0]
            r6.L = r1
            ve6[] r1 = new defpackage.ve6[r0]
            r6.R = r1
            java.util.BitSet r1 = new java.util.BitSet
            r2 = 8
            r1.<init>(r2)
            r6.X = r1
            android.graphics.Matrix r1 = new android.graphics.Matrix
            r1.<init>()
            r6.d0 = r1
            android.graphics.Path r1 = new android.graphics.Path
            r1.<init>()
            r6.e0 = r1
            android.graphics.Path r1 = new android.graphics.Path
            r1.<init>()
            r6.f0 = r1
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>()
            r6.g0 = r1
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>()
            r6.h0 = r1
            android.graphics.Region r1 = new android.graphics.Region
            r1.<init>()
            r6.i0 = r1
            android.graphics.Region r1 = new android.graphics.Region
            r1.<init>()
            r6.j0 = r1
            android.graphics.Paint r1 = new android.graphics.Paint
            r2 = 1
            r1.<init>(r2)
            r6.k0 = r1
            android.graphics.Paint r3 = new android.graphics.Paint
            r3.<init>(r2)
            r6.l0 = r3
            ie6 r4 = new ie6
            r4.<init>()
            r6.m0 = r4
            android.os.Looper r4 = android.os.Looper.getMainLooper()
            java.lang.Thread r4 = r4.getThread()
            java.lang.Thread r5 = java.lang.Thread.currentThread()
            if (r4 != r5) goto L74
            oe6 r4 = defpackage.ne6.a
            goto L79
        L74:
            oe6 r4 = new oe6
            r4.<init>()
        L79:
            r6.o0 = r4
            android.graphics.RectF r4 = new android.graphics.RectF
            r4.<init>()
            r6.r0 = r4
            r6.s0 = r2
            r6.t0 = r2
            fo6[] r0 = new defpackage.fo6[r0]
            r6.w0 = r0
            r6.B = r7
            android.graphics.Paint$Style r7 = android.graphics.Paint.Style.STROKE
            r3.setStyle(r7)
            android.graphics.Paint$Style r7 = android.graphics.Paint.Style.FILL
            r1.setStyle(r7)
            r6.r()
            int[] r7 = r6.getState()
            r6.p(r7)
            m24 r7 = new m24
            r7.<init>(r6)
            r6.n0 = r7
            return
    }

    public static float b(android.graphics.RectF r3, defpackage.me6 r4, float[] r5) {
            if (r5 != 0) goto Lf
            boolean r5 = r4.e(r3)
            if (r5 == 0) goto L2d
            f61 r4 = r4.e
            float r3 = r4.a(r3)
            return r3
        Lf:
            int r3 = r5.length
            r0 = 0
            r1 = 1
            if (r3 > r1) goto L15
            goto L24
        L15:
            r3 = r5[r0]
        L17:
            int r2 = r5.length
            if (r1 >= r2) goto L24
            r2 = r5[r1]
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 == 0) goto L21
            goto L2d
        L21:
            int r1 = r1 + 1
            goto L17
        L24:
            boolean r3 = r4.d()
            if (r3 == 0) goto L2d
            r3 = r5[r0]
            return r3
        L2d:
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            return r3
    }

    public final void a(android.graphics.RectF r9, android.graphics.Path r10) {
            r8 = this;
            n24 r0 = r8.B
            me6 r2 = r0.a
            float[] r3 = r8.x0
            float r4 = r0.j
            m24 r6 = r8.n0
            oe6 r1 = r8.o0
            r5 = r9
            r7 = r10
            r1.a(r2, r3, r4, r5, r6, r7)
            n24 r9 = r8.B
            float r9 = r9.i
            r10 = 1065353216(0x3f800000, float:1.0)
            int r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r9 == 0) goto L36
            android.graphics.Matrix r9 = r8.d0
            r9.reset()
            n24 r10 = r8.B
            float r10 = r10.i
            float r0 = r5.width()
            r1 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 / r1
            float r2 = r5.height()
            float r2 = r2 / r1
            r9.setScale(r10, r10, r0, r2)
            r7.transform(r9)
        L36:
            android.graphics.RectF r8 = r8.r0
            r9 = 1
            r7.computeBounds(r8, r9)
            return
    }

    public final int c(int r6) {
            r5 = this;
            n24 r5 = r5.B
            float r0 = r5.n
            r1 = 0
            float r0 = r0 + r1
            float r2 = r5.m
            float r0 = r0 + r2
            ps1 r5 = r5.c
            if (r5 == 0) goto L63
            boolean r2 = r5.a
            if (r2 == 0) goto L63
            r2 = 255(0xff, float:3.57E-43)
            int r3 = defpackage.tt0.d(r6, r2)
            int r4 = r5.d
            if (r3 != r4) goto L63
            float r3 = r5.e
            int r4 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r4 <= 0) goto L3d
            int r4 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r4 > 0) goto L26
            goto L3d
        L26:
            float r0 = r0 / r3
            double r3 = (double) r0
            double r3 = java.lang.Math.log1p(r3)
            float r0 = (float) r3
            r3 = 1083179008(0x40900000, float:4.5)
            float r0 = r0 * r3
            r3 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 + r3
            r3 = 1120403456(0x42c80000, float:100.0)
            float r0 = r0 / r3
            r3 = 1065353216(0x3f800000, float:1.0)
            float r0 = java.lang.Math.min(r0, r3)
            goto L3e
        L3d:
            r0 = r1
        L3e:
            int r3 = android.graphics.Color.alpha(r6)
            int r6 = defpackage.tt0.d(r6, r2)
            int r2 = r5.b
            int r6 = defpackage.mp2.Q(r0, r6, r2)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L5e
            int r5 = r5.c
            if (r5 == 0) goto L5e
            int r0 = defpackage.ps1.f
            int r5 = defpackage.tt0.d(r5, r0)
            int r6 = defpackage.tt0.b(r5, r6)
        L5e:
            int r5 = defpackage.tt0.d(r6, r3)
            return r5
        L63:
            return r6
    }

    public final void d(android.graphics.Canvas r9) {
            r8 = this;
            java.util.BitSet r0 = r8.X
            int r0 = r0.cardinality()
            if (r0 <= 0) goto Lf
            java.lang.String r0 = "p24"
            java.lang.String r1 = "Compatibility shadow requested but can't be drawn for all operations in this shape."
            android.util.Log.w(r0, r1)
        Lf:
            n24 r0 = r8.B
            int r0 = r0.p
            android.graphics.Path r1 = r8.e0
            ie6 r2 = r8.m0
            if (r0 == 0) goto L1e
            android.graphics.Paint r0 = r2.a
            r9.drawPath(r1, r0)
        L1e:
            r0 = 0
        L1f:
            r3 = 4
            if (r0 >= r3) goto L3d
            ve6[] r3 = r8.L
            r3 = r3[r0]
            n24 r4 = r8.B
            int r4 = r4.o
            android.graphics.Matrix r5 = defpackage.ve6.b
            r3.a(r5, r2, r4, r9)
            ve6[] r3 = r8.R
            r3 = r3[r0]
            n24 r4 = r8.B
            int r4 = r4.o
            r3.a(r5, r2, r4, r9)
            int r0 = r0 + 1
            goto L1f
        L3d:
            boolean r0 = r8.s0
            if (r0 == 0) goto L72
            n24 r0 = r8.B
            int r0 = r0.p
            double r2 = (double) r0
            r4 = 0
            double r6 = java.lang.Math.toRadians(r4)
            double r6 = java.lang.Math.sin(r6)
            double r6 = r6 * r2
            int r0 = (int) r6
            n24 r8 = r8.B
            int r8 = r8.p
            double r2 = (double) r8
            double r4 = java.lang.Math.toRadians(r4)
            double r4 = java.lang.Math.cos(r4)
            double r4 = r4 * r2
            int r8 = (int) r4
            int r2 = -r0
            float r2 = (float) r2
            int r3 = -r8
            float r3 = (float) r3
            r9.translate(r2, r3)
            android.graphics.Paint r2 = defpackage.p24.A0
            r9.drawPath(r1, r2)
            float r0 = (float) r0
            float r8 = (float) r8
            r9.translate(r0, r8)
        L72:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas r20) {
            r19 = this;
            r0 = r19
            r1 = r20
            android.graphics.PorterDuffColorFilter r2 = r0.p0
            android.graphics.Paint r3 = r0.k0
            r3.setColorFilter(r2)
            int r7 = r3.getAlpha()
            n24 r2 = r0.B
            int r2 = r2.l
            int r4 = r2 >>> 7
            int r2 = r2 + r4
            int r2 = r2 * r7
            int r2 = r2 >>> 8
            r3.setAlpha(r2)
            android.graphics.PorterDuffColorFilter r2 = r0.q0
            android.graphics.Paint r8 = r0.l0
            r8.setColorFilter(r2)
            n24 r2 = r0.B
            float r2 = r2.k
            r8.setStrokeWidth(r2)
            int r9 = r8.getAlpha()
            n24 r2 = r0.B
            int r2 = r2.l
            int r4 = r2 >>> 7
            int r2 = r2 + r4
            int r2 = r2 * r9
            int r2 = r2 >>> 8
            r8.setAlpha(r2)
            n24 r2 = r0.B
            android.graphics.Paint$Style r2 = r2.q
            android.graphics.Paint$Style r4 = android.graphics.Paint.Style.FILL_AND_STROKE
            r10 = 0
            r11 = 0
            if (r2 == r4) goto L4d
            android.graphics.Paint$Style r4 = android.graphics.Paint.Style.FILL
            if (r2 != r4) goto L4a
            goto L4d
        L4a:
            r2 = r3
            goto L15f
        L4d:
            boolean r2 = r0.Y
            r4 = r2
            r2 = r3
            android.graphics.Path r3 = r0.e0
            if (r4 == 0) goto L5e
            android.graphics.RectF r4 = r0.g()
            r0.a(r4, r3)
            r0.Y = r11
        L5e:
            n24 r4 = r0.B
            r4.getClass()
            int r5 = r4.o
            if (r5 <= 0) goto L152
            me6 r4 = r4.a
            android.graphics.RectF r5 = r0.g()
            boolean r4 = r4.e(r5)
            if (r4 != 0) goto L152
            float[] r4 = r0.x0
            if (r4 == 0) goto L97
            int r5 = r4.length
            r6 = 1
            if (r5 > r6) goto L7c
            goto L8b
        L7c:
            r5 = r4[r11]
        L7e:
            int r12 = r4.length
            if (r6 >= r12) goto L8b
            r12 = r4[r6]
            int r12 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r12 == 0) goto L88
            goto L97
        L88:
            int r6 = r6 + 1
            goto L7e
        L8b:
            n24 r4 = r0.B
            me6 r4 = r4.a
            boolean r4 = r4.d()
            if (r4 == 0) goto L97
            goto L152
        L97:
            boolean r4 = r3.isConvex()
            if (r4 != 0) goto L152
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 29
            if (r4 >= r5) goto L152
            r1.save()
            n24 r4 = r0.B
            int r4 = r4.p
            double r4 = (double) r4
            r12 = 0
            double r14 = java.lang.Math.toRadians(r12)
            double r14 = java.lang.Math.sin(r14)
            double r14 = r14 * r4
            int r4 = (int) r14
            n24 r5 = r0.B
            int r5 = r5.p
            double r5 = (double) r5
            double r12 = java.lang.Math.toRadians(r12)
            double r12 = java.lang.Math.cos(r12)
            double r12 = r12 * r5
            int r5 = (int) r12
            float r4 = (float) r4
            float r5 = (float) r5
            r1.translate(r4, r5)
            boolean r4 = r0.s0
            if (r4 != 0) goto Ld7
            r19.d(r20)
            r1.restore()
            goto L152
        Ld7:
            android.graphics.RectF r4 = r0.r0
            float r5 = r4.width()
            android.graphics.Rect r6 = r0.getBounds()
            int r6 = r6.width()
            float r6 = (float) r6
            float r5 = r5 - r6
            int r5 = (int) r5
            float r6 = r4.height()
            android.graphics.Rect r12 = r0.getBounds()
            int r12 = r12.height()
            float r12 = (float) r12
            float r6 = r6 - r12
            int r6 = (int) r6
            if (r5 < 0) goto L14c
            if (r6 < 0) goto L14c
            float r12 = r4.width()
            int r12 = (int) r12
            n24 r13 = r0.B
            int r13 = r13.o
            int r13 = r13 * 2
            int r13 = r13 + r12
            int r13 = r13 + r5
            float r4 = r4.height()
            int r4 = (int) r4
            n24 r12 = r0.B
            int r12 = r12.o
            int r12 = r12 * 2
            int r12 = r12 + r4
            int r12 = r12 + r6
            android.graphics.Bitmap$Config r4 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r4 = android.graphics.Bitmap.createBitmap(r13, r12, r4)
            android.graphics.Canvas r12 = new android.graphics.Canvas
            r12.<init>(r4)
            android.graphics.Rect r13 = r0.getBounds()
            int r13 = r13.left
            n24 r14 = r0.B
            int r14 = r14.o
            int r13 = r13 - r14
            int r13 = r13 - r5
            float r5 = (float) r13
            android.graphics.Rect r13 = r0.getBounds()
            int r13 = r13.top
            n24 r14 = r0.B
            int r14 = r14.o
            int r13 = r13 - r14
            int r13 = r13 - r6
            float r6 = (float) r13
            float r13 = -r5
            float r14 = -r6
            r12.translate(r13, r14)
            r0.d(r12)
            r1.drawBitmap(r4, r5, r6, r10)
            r4.recycle()
            r1.restore()
            goto L152
        L14c:
            java.lang.String r0 = "Invalid shadow bounds. Check that the treatments result in a valid path."
            defpackage.i.m(r0)
            return
        L152:
            n24 r4 = r0.B
            me6 r4 = r4.a
            float[] r5 = r0.x0
            android.graphics.RectF r6 = r0.g()
            r0.e(r1, r2, r3, r4, r5, r6)
        L15f:
            boolean r1 = r0.j()
            if (r1 == 0) goto L1ec
            boolean r1 = r0.Z
            if (r1 == 0) goto L1e9
            n24 r1 = r0.B
            me6 r1 = r1.a
            le6 r3 = r1.f()
            f61 r4 = r1.e
            m24 r5 = r0.A
            f61 r4 = r5.a(r4)
            r3.e = r4
            f61 r4 = r1.f
            f61 r4 = r5.a(r4)
            r3.f = r4
            f61 r4 = r1.h
            f61 r4 = r5.a(r4)
            r3.h = r4
            f61 r1 = r1.g
            f61 r1 = r5.a(r1)
            r3.g = r1
            me6 r1 = r3.a()
            r0.u0 = r1
            float[] r1 = r0.x0
            if (r1 != 0) goto L1a0
            r0.y0 = r10
            goto L1c2
        L1a0:
            float[] r3 = r0.y0
            if (r3 != 0) goto L1a9
            int r1 = r1.length
            float[] r1 = new float[r1]
            r0.y0 = r1
        L1a9:
            float r1 = r0.i()
            r3 = r11
        L1ae:
            float[] r4 = r0.x0
            int r5 = r4.length
            if (r3 >= r5) goto L1c2
            float[] r5 = r0.y0
            r4 = r4[r3]
            float r4 = r4 - r1
            r6 = 0
            float r4 = java.lang.Math.max(r6, r4)
            r5[r3] = r4
            int r3 = r3 + 1
            goto L1ae
        L1c2:
            me6 r13 = r0.u0
            float[] r14 = r0.y0
            n24 r1 = r0.B
            float r15 = r1.j
            android.graphics.RectF r1 = r0.g()
            android.graphics.RectF r3 = r0.h0
            r3.set(r1)
            float r1 = r0.i()
            r3.inset(r1, r1)
            r17 = 0
            android.graphics.Path r1 = r0.f0
            oe6 r12 = r0.o0
            r18 = r1
            r16 = r3
            r12.a(r13, r14, r15, r16, r17, r18)
            r0.Z = r11
        L1e9:
            r19.f(r20)
        L1ec:
            r2.setAlpha(r7)
            r8.setAlpha(r9)
            return
    }

    public final void e(android.graphics.Canvas r1, android.graphics.Paint r2, android.graphics.Path r3, defpackage.me6 r4, float[] r5, android.graphics.RectF r6) {
            r0 = this;
            float r4 = b(r6, r4, r5)
            r5 = 0
            int r5 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r5 < 0) goto L12
            n24 r0 = r0.B
            float r0 = r0.j
            float r4 = r4 * r0
            r1.drawRoundRect(r6, r4, r4, r2)
            return
        L12:
            r1.drawPath(r3, r2)
            return
    }

    public void f(android.graphics.Canvas r8) {
            r7 = this;
            me6 r4 = r7.u0
            float[] r5 = r7.y0
            android.graphics.RectF r0 = r7.g()
            android.graphics.RectF r6 = r7.h0
            r6.set(r0)
            float r0 = r7.i()
            r6.inset(r0, r0)
            android.graphics.Paint r2 = r7.l0
            android.graphics.Path r3 = r7.f0
            r0 = r7
            r1 = r8
            r0.e(r1, r2, r3, r4, r5, r6)
            return
    }

    public final android.graphics.RectF g() {
            r1 = this;
            android.graphics.Rect r0 = r1.getBounds()
            android.graphics.RectF r1 = r1.g0
            r1.set(r0)
            return r1
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
            r0 = this;
            n24 r0 = r0.B
            int r0 = r0.l
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public final android.graphics.drawable.Drawable.ConstantState getConstantState() {
            r0 = this;
            n24 r0 = r0.B
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
            r0 = this;
            r0 = -3
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(android.graphics.Outline r4) {
            r3 = this;
            n24 r0 = r3.B
            r0.getClass()
            android.graphics.RectF r0 = r3.g()
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L10
            goto L53
        L10:
            n24 r1 = r3.B
            me6 r1 = r1.a
            float[] r2 = r3.x0
            float r1 = b(r0, r1, r2)
            r2 = 0
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 < 0) goto L2c
            android.graphics.Rect r0 = r3.getBounds()
            n24 r3 = r3.B
            float r3 = r3.j
            float r1 = r1 * r3
            r4.setRoundRect(r0, r1)
            return
        L2c:
            boolean r1 = r3.Y
            android.graphics.Path r2 = r3.e0
            if (r1 == 0) goto L38
            r3.a(r0, r2)
            r0 = 0
            r3.Y = r0
        L38:
            int r3 = android.os.Build.VERSION.SDK_INT
            r0 = 30
            if (r3 < r0) goto L42
            defpackage.ap1.a(r4, r2)
            return
        L42:
            r0 = 29
            if (r3 < r0) goto L4a
            defpackage.zo1.a(r4, r2)     // Catch: java.lang.IllegalArgumentException -> L49
        L49:
            return
        L4a:
            boolean r3 = r2.isConvex()
            if (r3 == 0) goto L53
            defpackage.zo1.a(r4, r2)
        L53:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(android.graphics.Rect r2) {
            r1 = this;
            n24 r0 = r1.B
            android.graphics.Rect r0 = r0.h
            if (r0 == 0) goto Lb
            r2.set(r0)
            r1 = 1
            return r1
        Lb:
            boolean r1 = super.getPadding(r2)
            return r1
    }

    @Override // android.graphics.drawable.Drawable
    public final android.graphics.Region getTransparentRegion() {
            r3 = this;
            android.graphics.Rect r0 = r3.getBounds()
            android.graphics.Region r1 = r3.i0
            r1.set(r0)
            android.graphics.RectF r0 = r3.g()
            android.graphics.Path r2 = r3.e0
            r3.a(r0, r2)
            android.graphics.Region r3 = r3.j0
            r3.setPath(r2, r1)
            android.graphics.Region$Op r0 = android.graphics.Region.Op.DIFFERENCE
            r1.op(r3, r0)
            return r1
    }

    public final float h() {
            r5 = this;
            float[] r0 = r5.x0
            r1 = 1073741824(0x40000000, float:2.0)
            if (r0 == 0) goto L17
            r5 = 3
            r5 = r0[r5]
            r2 = 2
            r2 = r0[r2]
            float r5 = r5 + r2
            r2 = 1
            r2 = r0[r2]
            float r5 = r5 - r2
            r2 = 0
            r0 = r0[r2]
            float r5 = r5 - r0
            float r5 = r5 / r1
            return r5
        L17:
            android.graphics.RectF r0 = r5.g()
            n24 r2 = r5.B
            me6 r2 = r2.a
            oe6 r3 = r5.o0
            r3.getClass()
            f61 r2 = r2.e
            float r2 = r2.a(r0)
            n24 r4 = r5.B
            me6 r4 = r4.a
            r3.getClass()
            f61 r4 = r4.h
            float r4 = r4.a(r0)
            float r4 = r4 + r2
            n24 r2 = r5.B
            me6 r2 = r2.a
            r3.getClass()
            f61 r2 = r2.g
            float r2 = r2.a(r0)
            float r4 = r4 - r2
            n24 r5 = r5.B
            me6 r5 = r5.a
            r3.getClass()
            f61 r5 = r5.f
            float r5 = r5.a(r0)
            float r4 = r4 - r5
            float r4 = r4 / r1
            return r4
    }

    public final float i() {
            r1 = this;
            boolean r0 = r1.j()
            if (r0 == 0) goto L10
            android.graphics.Paint r1 = r1.l0
            float r1 = r1.getStrokeWidth()
            r0 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r0
            return r1
        L10:
            r1 = 0
            return r1
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
            r1 = this;
            r0 = 1
            r1.Y = r0
            r1.Z = r0
            super.invalidateSelf()
            return
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
            r1 = this;
            boolean r0 = super.isStateful()
            if (r0 != 0) goto L3e
            n24 r0 = r1.B
            android.content.res.ColorStateList r0 = r0.f
            if (r0 == 0) goto L12
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L3e
        L12:
            n24 r0 = r1.B
            r0.getClass()
            n24 r0 = r1.B
            android.content.res.ColorStateList r0 = r0.e
            if (r0 == 0) goto L23
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L3e
        L23:
            n24 r0 = r1.B
            android.content.res.ColorStateList r0 = r0.d
            if (r0 == 0) goto L2f
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L3e
        L2f:
            n24 r1 = r1.B
            xp6 r1 = r1.b
            if (r1 == 0) goto L3c
            boolean r1 = r1.d()
            if (r1 == 0) goto L3c
            goto L3e
        L3c:
            r1 = 0
            return r1
        L3e:
            r1 = 1
            return r1
    }

    public final boolean j() {
            r2 = this;
            n24 r0 = r2.B
            android.graphics.Paint$Style r0 = r0.q
            android.graphics.Paint$Style r1 = android.graphics.Paint.Style.FILL_AND_STROKE
            if (r0 == r1) goto Lc
            android.graphics.Paint$Style r1 = android.graphics.Paint.Style.STROKE
            if (r0 != r1) goto L19
        Lc:
            android.graphics.Paint r2 = r2.l0
            float r2 = r2.getStrokeWidth()
            r0 = 0
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 <= 0) goto L19
            r2 = 1
            return r2
        L19:
            r2 = 0
            return r2
    }

    public final void k(android.content.Context r3) {
            r2 = this;
            n24 r0 = r2.B
            ps1 r1 = new ps1
            r1.<init>(r3)
            r0.c = r1
            r2.s()
            return
    }

    public final void l(defpackage.go6 r6) {
            r5 = this;
            go6 r0 = r5.v0
            if (r0 == r6) goto L3f
            r5.v0 = r6
            r0 = 0
        L7:
            fo6[] r1 = r5.w0
            int r2 = r1.length
            if (r0 >= r2) goto L34
            r2 = r1[r0]
            if (r2 != 0) goto L1b
            fo6 r2 = new fo6
            o24[] r3 = defpackage.p24.B0
            r3 = r3[r0]
            r2.<init>(r5, r3)
            r1[r0] = r2
        L1b:
            r1 = r1[r0]
            go6 r2 = new go6
            r2.<init>()
            double r3 = r6.b
            float r3 = (float) r3
            r2.a(r3)
            double r3 = r6.a
            double r3 = r3 * r3
            float r3 = (float) r3
            r2.b(r3)
            r1.m = r2
            int r0 = r0 + 1
            goto L7
        L34:
            int[] r6 = r5.getState()
            r0 = 1
            r5.q(r6, r0)
            r5.invalidateSelf()
        L3f:
            return
    }

    public final void m(float r3) {
            r2 = this;
            n24 r0 = r2.B
            float r1 = r0.n
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto Ld
            r0.n = r3
            r2.s()
        Ld:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public android.graphics.drawable.Drawable mutate() {
            r2 = this;
            n24 r0 = new n24
            n24 r1 = r2.B
            r0.<init>(r1)
            r2.B = r0
            return r2
    }

    public final void n(android.content.res.ColorStateList r3) {
            r2 = this;
            n24 r0 = r2.B
            android.content.res.ColorStateList r1 = r0.d
            if (r1 == r3) goto Lf
            r0.d = r3
            int[] r3 = r2.getState()
            r2.onStateChange(r3)
        Lf:
            return
    }

    public final void o(defpackage.xp6 r3) {
            r2 = this;
            n24 r0 = r2.B
            xp6 r1 = r0.b
            if (r1 == r3) goto L13
            r0.b = r3
            int[] r3 = r2.getState()
            r0 = 1
            r2.q(r3, r0)
            r2.invalidateSelf()
        L13:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(android.graphics.Rect r3) {
            r2 = this;
            r0 = 1
            r2.Y = r0
            r2.Z = r0
            super.onBoundsChange(r3)
            n24 r0 = r2.B
            xp6 r0 = r0.b
            if (r0 == 0) goto L1d
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L1d
            int[] r0 = r2.getState()
            boolean r1 = r2.t0
            r2.q(r0, r1)
        L1d:
            boolean r3 = r3.isEmpty()
            r2.t0 = r3
            return
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] r3) {
            r2 = this;
            n24 r0 = r2.B
            xp6 r0 = r0.b
            r1 = 0
            if (r0 == 0) goto La
            r2.q(r3, r1)
        La:
            boolean r3 = r2.p(r3)
            boolean r0 = r2.r()
            if (r3 != 0) goto L16
            if (r0 == 0) goto L17
        L16:
            r1 = 1
        L17:
            if (r1 == 0) goto L1c
            r2.invalidateSelf()
        L1c:
            return r1
    }

    public final boolean p(int[] r5) {
            r4 = this;
            n24 r0 = r4.B
            android.content.res.ColorStateList r0 = r0.d
            r1 = 1
            if (r0 == 0) goto L1c
            android.graphics.Paint r0 = r4.k0
            int r2 = r0.getColor()
            n24 r3 = r4.B
            android.content.res.ColorStateList r3 = r3.d
            int r3 = r3.getColorForState(r5, r2)
            if (r2 == r3) goto L1c
            r0.setColor(r3)
            r0 = r1
            goto L1d
        L1c:
            r0 = 0
        L1d:
            n24 r2 = r4.B
            android.content.res.ColorStateList r2 = r2.e
            if (r2 == 0) goto L37
            android.graphics.Paint r2 = r4.l0
            int r3 = r2.getColor()
            n24 r4 = r4.B
            android.content.res.ColorStateList r4 = r4.e
            int r4 = r4.getColorForState(r5, r3)
            if (r3 == r4) goto L37
            r2.setColor(r4)
            return r1
        L37:
            return r0
    }

    public final void q(int[] r17, boolean r18) {
            r16 = this;
            r0 = r16
            r1 = r17
            android.graphics.RectF r2 = r0.g()
            n24 r3 = r0.B
            xp6 r3 = r3.b
            if (r3 == 0) goto Ld3
            boolean r3 = r2.isEmpty()
            if (r3 == 0) goto L16
            goto Ld3
        L16:
            go6 r3 = r0.v0
            r5 = 1
            if (r3 != 0) goto L1d
            r3 = r5
            goto L1e
        L1d:
            r3 = 0
        L1e:
            r3 = r18 | r3
            float[] r6 = r0.x0
            r7 = 4
            if (r6 != 0) goto L29
            float[] r6 = new float[r7]
            r0.x0 = r6
        L29:
            n24 r6 = r0.B
            xp6 r6 = r6.b
            me6[] r8 = r6.d
            int r9 = r6.a
            int[][] r10 = r6.c
            wp6 r11 = r6.h
            wp6 r12 = r6.g
            wp6 r13 = r6.f
            wp6 r6 = r6.e
            r14 = 0
        L3c:
            if (r14 >= r9) goto L4a
            r4 = r10[r14]
            boolean r4 = android.util.StateSet.stateSetMatches(r4, r1)
            if (r4 == 0) goto L47
            goto L4b
        L47:
            int r14 = r14 + 1
            goto L3c
        L4a:
            r14 = -1
        L4b:
            if (r14 >= 0) goto L61
            int[] r4 = android.util.StateSet.WILD_CARD
            r14 = 0
        L50:
            if (r14 >= r9) goto L5f
            r15 = r10[r14]
            boolean r15 = android.util.StateSet.stateSetMatches(r15, r4)
            if (r15 == 0) goto L5c
            r15 = r14
            goto L60
        L5c:
            int r14 = r14 + 1
            goto L50
        L5f:
            r15 = -1
        L60:
            r14 = r15
        L61:
            if (r6 != 0) goto L6c
            if (r13 != 0) goto L6c
            if (r12 != 0) goto L6c
            if (r11 != 0) goto L6c
            r1 = r8[r14]
            goto L96
        L6c:
            r4 = r8[r14]
            le6 r4 = r4.f()
            if (r6 == 0) goto L7a
            f61 r6 = r6.c(r1)
            r4.e = r6
        L7a:
            if (r13 == 0) goto L82
            f61 r6 = r13.c(r1)
            r4.f = r6
        L82:
            if (r12 == 0) goto L8a
            f61 r6 = r12.c(r1)
            r4.h = r6
        L8a:
            if (r11 == 0) goto L92
            f61 r1 = r11.c(r1)
            r4.g = r1
        L92:
            me6 r1 = r4.a()
        L96:
            r4 = 0
        L97:
            if (r4 >= r7) goto Lce
            oe6 r6 = r0.o0
            r6.getClass()
            if (r4 == r5) goto Laf
            r6 = 2
            if (r4 == r6) goto Lac
            r6 = 3
            if (r4 == r6) goto La9
            f61 r6 = r1.f
            goto Lb1
        La9:
            f61 r6 = r1.e
            goto Lb1
        Lac:
            f61 r6 = r1.h
            goto Lb1
        Laf:
            f61 r6 = r1.g
        Lb1:
            float r6 = r6.a(r2)
            if (r3 == 0) goto Lbb
            float[] r8 = r0.x0
            r8[r4] = r6
        Lbb:
            fo6[] r8 = r0.w0
            r9 = r8[r4]
            if (r9 == 0) goto Lcb
            r9.a(r6)
            if (r3 == 0) goto Lcb
            r6 = r8[r4]
            r6.d()
        Lcb:
            int r4 = r4 + 1
            goto L97
        Lce:
            if (r3 == 0) goto Ld3
            r0.invalidateSelf()
        Ld3:
            return
    }

    public final boolean r() {
            r8 = this;
            android.graphics.PorterDuffColorFilter r0 = r8.p0
            android.graphics.PorterDuffColorFilter r1 = r8.q0
            n24 r2 = r8.B
            android.content.res.ColorStateList r3 = r2.f
            android.graphics.PorterDuff$Mode r2 = r2.g
            r4 = 0
            r5 = 0
            r6 = 1
            if (r3 == 0) goto L24
            if (r2 != 0) goto L12
            goto L24
        L12:
            int[] r7 = r8.getState()
            int r3 = r3.getColorForState(r7, r5)
            int r3 = r8.c(r3)
            android.graphics.PorterDuffColorFilter r7 = new android.graphics.PorterDuffColorFilter
            r7.<init>(r3, r2)
            goto L39
        L24:
            android.graphics.Paint r2 = r8.k0
            int r2 = r2.getColor()
            int r3 = r8.c(r2)
            if (r3 == r2) goto L38
            android.graphics.PorterDuffColorFilter r7 = new android.graphics.PorterDuffColorFilter
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.SRC_IN
            r7.<init>(r3, r2)
            goto L39
        L38:
            r7 = r4
        L39:
            r8.p0 = r7
            n24 r2 = r8.B
            r2.getClass()
            r8.q0 = r4
            n24 r2 = r8.B
            r2.getClass()
            android.graphics.PorterDuffColorFilter r2 = r8.p0
            boolean r0 = java.util.Objects.equals(r0, r2)
            if (r0 == 0) goto L59
            android.graphics.PorterDuffColorFilter r8 = r8.q0
            boolean r8 = java.util.Objects.equals(r1, r8)
            if (r8 != 0) goto L58
            goto L59
        L58:
            return r5
        L59:
            return r6
    }

    public final void s() {
            r4 = this;
            n24 r0 = r4.B
            float r1 = r0.n
            r2 = 0
            float r1 = r1 + r2
            r2 = 1061158912(0x3f400000, float:0.75)
            float r2 = r2 * r1
            double r2 = (double) r2
            double r2 = java.lang.Math.ceil(r2)
            int r2 = (int) r2
            r0.o = r2
            n24 r0 = r4.B
            r2 = 1048576000(0x3e800000, float:0.25)
            float r1 = r1 * r2
            double r1 = (double) r1
            double r1 = java.lang.Math.ceil(r1)
            int r1 = (int) r1
            r0.p = r1
            r4.r()
            super.invalidateSelf()
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int r3) {
            r2 = this;
            n24 r0 = r2.B
            int r1 = r0.l
            if (r1 == r3) goto Lb
            r0.l = r3
            super.invalidateSelf()
        Lb:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter r1) {
            r0 = this;
            n24 r1 = r0.B
            r1.getClass()
            super.invalidateSelf()
            return
    }

    @Override // defpackage.xe6
    public final void setShapeAppearanceModel(defpackage.me6 r2) {
            r1 = this;
            n24 r0 = r1.B
            r0.a = r2
            r2 = 0
            r0.b = r2
            r1.x0 = r2
            r1.y0 = r2
            r1.invalidateSelf()
            return
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int r1) {
            r0 = this;
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r1)
            r0.setTintList(r1)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(android.content.res.ColorStateList r2) {
            r1 = this;
            n24 r0 = r1.B
            r0.f = r2
            r1.r()
            super.invalidateSelf()
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(android.graphics.PorterDuff.Mode r3) {
            r2 = this;
            n24 r0 = r2.B
            android.graphics.PorterDuff$Mode r1 = r0.g
            if (r1 == r3) goto Le
            r0.g = r3
            r2.r()
            super.invalidateSelf()
        Le:
            return
    }
}
