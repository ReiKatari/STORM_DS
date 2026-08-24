package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fx3  reason: default package */
/* loaded from: classes.dex */
public final class fx3 implements android.view.View.OnTouchListener {
    public static final int n0 = 0;
    public final defpackage.mx A;
    public final android.view.animation.AccelerateInterpolator B;
    public final defpackage.mp1 L;
    public defpackage.g15 R;
    public final float[] X;
    public final float[] Y;
    public final int Z;
    public final int d0;
    public final float[] e0;
    public final float[] f0;
    public final float[] g0;
    public boolean h0;
    public boolean i0;
    public boolean j0;
    public boolean k0;
    public boolean l0;
    public final defpackage.mp1 m0;

    static {
            int r0 = android.view.ViewConfiguration.getTapTimeout()
            defpackage.fx3.n0 = r0
            return
    }

    public fx3(defpackage.mp1 r12) {
            r11 = this;
            r11.<init>()
            mx r0 = new mx
            r0.<init>()
            r1 = -9223372036854775808
            r0.e = r1
            r1 = -1
            r0.g = r1
            r1 = 0
            r0.f = r1
            r11.A = r0
            android.view.animation.AccelerateInterpolator r1 = new android.view.animation.AccelerateInterpolator
            r1.<init>()
            r11.B = r1
            r1 = 2
            float[] r2 = new float[r1]
            r2 = {x0090: FILL_ARRAY_DATA  , data: [0, 0} // fill-array
            r11.X = r2
            float[] r3 = new float[r1]
            r3 = {x0098: FILL_ARRAY_DATA  , data: [2139095039, 2139095039} // fill-array
            r11.Y = r3
            float[] r4 = new float[r1]
            r4 = {x00a0: FILL_ARRAY_DATA  , data: [0, 0} // fill-array
            r11.e0 = r4
            float[] r5 = new float[r1]
            r5 = {x00a8: FILL_ARRAY_DATA  , data: [0, 0} // fill-array
            r11.f0 = r5
            float[] r1 = new float[r1]
            r1 = {x00b0: FILL_ARRAY_DATA  , data: [2139095039, 2139095039} // fill-array
            r11.g0 = r1
            r11.L = r12
            android.content.res.Resources r6 = android.content.res.Resources.getSystem()
            android.util.DisplayMetrics r6 = r6.getDisplayMetrics()
            float r6 = r6.density
            r7 = 1153753088(0x44c4e000, float:1575.0)
            float r7 = r7 * r6
            r8 = 1056964608(0x3f000000, float:0.5)
            float r7 = r7 + r8
            int r7 = (int) r7
            r9 = 1134395392(0x439d8000, float:315.0)
            float r6 = r6 * r9
            float r6 = r6 + r8
            int r6 = (int) r6
            float r7 = (float) r7
            r8 = 1148846080(0x447a0000, float:1000.0)
            float r7 = r7 / r8
            r9 = 0
            r1[r9] = r7
            r10 = 1
            r1[r10] = r7
            float r1 = (float) r6
            float r1 = r1 / r8
            r5[r9] = r1
            r5[r10] = r1
            r11.Z = r10
            r1 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r3[r9] = r1
            r3[r10] = r1
            r1 = 1045220557(0x3e4ccccd, float:0.2)
            r2[r9] = r1
            r2[r10] = r1
            r1 = 981668463(0x3a83126f, float:0.001)
            r4[r9] = r1
            r4[r10] = r1
            int r1 = defpackage.fx3.n0
            r11.d0 = r1
            r1 = 500(0x1f4, float:7.0E-43)
            r0.a = r1
            r0.b = r1
            r11.m0 = r12
            return
    }

    public static float b(float r1, float r2, float r3) {
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L5
            return r3
        L5:
            int r3 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r3 >= 0) goto La
            return r2
        La:
            return r1
    }

    public final float a(float r4, float r5, float r6, int r7) {
            r3 = this;
            float[] r0 = r3.X
            r0 = r0[r7]
            float[] r1 = r3.Y
            r1 = r1[r7]
            float r0 = r0 * r5
            r2 = 0
            float r0 = b(r0, r2, r1)
            float r1 = r3.c(r4, r0)
            float r5 = r5 - r4
            float r4 = r3.c(r5, r0)
            float r4 = r4 - r1
            int r5 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            android.view.animation.AccelerateInterpolator r0 = r3.B
            if (r5 >= 0) goto L25
            float r4 = -r4
            float r4 = r0.getInterpolation(r4)
            float r4 = -r4
            goto L2d
        L25:
            int r5 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r5 <= 0) goto L36
            float r4 = r0.getInterpolation(r4)
        L2d:
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0 = 1065353216(0x3f800000, float:1.0)
            float r4 = b(r4, r5, r0)
            goto L37
        L36:
            r4 = r2
        L37:
            int r5 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r5 != 0) goto L3c
            return r2
        L3c:
            float[] r0 = r3.e0
            r0 = r0[r7]
            float[] r1 = r3.f0
            r1 = r1[r7]
            float[] r3 = r3.g0
            r3 = r3[r7]
            float r0 = r0 * r6
            if (r5 <= 0) goto L51
            float r4 = r4 * r0
            float r3 = b(r4, r1, r3)
            return r3
        L51:
            float r4 = -r4
            float r4 = r4 * r0
            float r3 = b(r4, r1, r3)
            float r3 = -r3
            return r3
    }

    public final float c(float r6, float r7) {
            r5 = this;
            r0 = 0
            int r1 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r1 != 0) goto L6
            goto L2c
        L6:
            r1 = 1
            int r2 = r5.Z
            if (r2 == 0) goto L18
            if (r2 == r1) goto L18
            r5 = 2
            if (r2 == r5) goto L11
            goto L2c
        L11:
            int r5 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r5 >= 0) goto L2c
            float r5 = -r7
            float r6 = r6 / r5
            return r6
        L18:
            int r3 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r3 >= 0) goto L2c
            int r3 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            r4 = 1065353216(0x3f800000, float:1.0)
            if (r3 < 0) goto L25
            float r6 = r6 / r7
            float r4 = r4 - r6
            return r4
        L25:
            boolean r5 = r5.k0
            if (r5 == 0) goto L2c
            if (r2 != r1) goto L2c
            return r4
        L2c:
            return r0
    }

    public final void d() {
            r6 = this;
            boolean r0 = r6.i0
            r1 = 0
            if (r0 == 0) goto L8
            r6.k0 = r1
            return
        L8:
            long r2 = android.view.animation.AnimationUtils.currentAnimationTimeMillis()
            mx r6 = r6.A
            long r4 = r6.e
            long r4 = r2 - r4
            int r0 = (int) r4
            int r4 = r6.b
            if (r0 <= r4) goto L19
            r1 = r4
            goto L1d
        L19:
            if (r0 >= 0) goto L1c
            goto L1d
        L1c:
            r1 = r0
        L1d:
            r6.i = r1
            float r0 = r6.a(r2)
            r6.h = r0
            r6.g = r2
            return
    }

    public final boolean e() {
            r7 = this;
            mx r0 = r7.A
            float r1 = r0.d
            float r2 = java.lang.Math.abs(r1)
            float r1 = r1 / r2
            int r1 = (int) r1
            float r0 = r0.c
            java.lang.Math.abs(r0)
            r0 = 0
            if (r1 == 0) goto L4a
            mp1 r7 = r7.m0
            int r2 = r7.getCount()
            if (r2 != 0) goto L1b
            goto L4a
        L1b:
            int r3 = r7.getChildCount()
            int r4 = r7.getFirstVisiblePosition()
            int r5 = r4 + r3
            r6 = 1
            if (r1 <= 0) goto L3a
            if (r5 < r2) goto L49
            int r3 = r3 - r6
            android.view.View r1 = r7.getChildAt(r3)
            int r1 = r1.getBottom()
            int r7 = r7.getHeight()
            if (r1 > r7) goto L49
            goto L4a
        L3a:
            if (r1 >= 0) goto L4a
            if (r4 > 0) goto L49
            android.view.View r7 = r7.getChildAt(r0)
            int r7 = r7.getTop()
            if (r7 < 0) goto L49
            goto L4a
        L49:
            return r6
        L4a:
            return r0
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View r9, android.view.MotionEvent r10) {
            r8 = this;
            boolean r0 = r8.l0
            r1 = 0
            if (r0 != 0) goto L7
            goto L7c
        L7:
            int r0 = r10.getActionMasked()
            r2 = 2
            r3 = 1
            if (r0 == 0) goto L1b
            if (r0 == r3) goto L17
            if (r0 == r2) goto L1f
            r9 = 3
            if (r0 == r9) goto L17
            goto L7c
        L17:
            r8.d()
            return r1
        L1b:
            r8.j0 = r3
            r8.h0 = r1
        L1f:
            float r0 = r10.getX()
            int r4 = r9.getWidth()
            float r4 = (float) r4
            mp1 r5 = r8.L
            int r6 = r5.getWidth()
            float r6 = (float) r6
            float r0 = r8.a(r0, r4, r6, r1)
            float r10 = r10.getY()
            int r9 = r9.getHeight()
            float r9 = (float) r9
            int r4 = r5.getHeight()
            float r4 = (float) r4
            float r9 = r8.a(r10, r9, r4, r3)
            mx r10 = r8.A
            r10.c = r0
            r10.d = r9
            boolean r9 = r8.k0
            if (r9 != 0) goto L7c
            boolean r9 = r8.e()
            if (r9 == 0) goto L7c
            g15 r9 = r8.R
            if (r9 != 0) goto L60
            g15 r9 = new g15
            r9.<init>(r8, r2)
            r8.R = r9
        L60:
            r8.k0 = r3
            r8.i0 = r3
            boolean r9 = r8.h0
            if (r9 != 0) goto L75
            int r9 = r8.d0
            if (r9 <= 0) goto L75
            g15 r10 = r8.R
            long r6 = (long) r9
            java.util.WeakHashMap r9 = defpackage.ao7.a
            r5.postOnAnimationDelayed(r10, r6)
            goto L7a
        L75:
            g15 r9 = r8.R
            r9.run()
        L7a:
            r8.h0 = r3
        L7c:
            return r1
    }
}
