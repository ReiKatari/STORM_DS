package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: u92  reason: default package */
/* loaded from: classes.dex */
public final class u92 extends defpackage.dg5 {
    public static final int[] C = null;
    public static final int[] D = null;
    public int A;
    public final defpackage.g15 B;
    public final int a;
    public final int b;
    public final android.graphics.drawable.StateListDrawable c;
    public final android.graphics.drawable.Drawable d;
    public final int e;
    public final int f;
    public final android.graphics.drawable.StateListDrawable g;
    public final android.graphics.drawable.Drawable h;
    public final int i;
    public final int j;
    public int k;
    public int l;
    public float m;
    public int n;
    public int o;
    public float p;
    public int q;
    public int r;
    public final androidx.recyclerview.widget.RecyclerView s;
    public boolean t;
    public boolean u;
    public int v;
    public int w;
    public final int[] x;
    public final int[] y;
    public final android.animation.ValueAnimator z;

    static {
            r0 = 16842919(0x10100a7, float:2.3694026E-38)
            int[] r0 = new int[]{r0}
            defpackage.u92.C = r0
            r0 = 0
            int[] r0 = new int[r0]
            defpackage.u92.D = r0
            return
    }

    public u92(androidx.recyclerview.widget.RecyclerView r7, android.graphics.drawable.StateListDrawable r8, android.graphics.drawable.Drawable r9, android.graphics.drawable.StateListDrawable r10, android.graphics.drawable.Drawable r11, int r12, int r13, int r14) {
            r6 = this;
            r6.<init>()
            r0 = 0
            r6.q = r0
            r6.r = r0
            r6.t = r0
            r6.u = r0
            r6.v = r0
            r6.w = r0
            r1 = 2
            int[] r2 = new int[r1]
            r6.x = r2
            int[] r2 = new int[r1]
            r6.y = r2
            float[] r2 = new float[r1]
            r2 = {x00da: FILL_ARRAY_DATA  , data: [0, 1065353216} // fill-array
            android.animation.ValueAnimator r2 = android.animation.ValueAnimator.ofFloat(r2)
            r6.z = r2
            r6.A = r0
            g15 r3 = new g15
            r4 = 8
            r3.<init>(r6, r4)
            r6.B = r3
            s92 r4 = new s92
            r4.<init>(r6)
            r6.c = r8
            r6.d = r9
            r6.g = r10
            r6.h = r11
            int r5 = r8.getIntrinsicWidth()
            int r5 = java.lang.Math.max(r12, r5)
            r6.e = r5
            int r5 = r9.getIntrinsicWidth()
            int r5 = java.lang.Math.max(r12, r5)
            r6.f = r5
            int r10 = r10.getIntrinsicWidth()
            int r10 = java.lang.Math.max(r12, r10)
            r6.i = r10
            int r10 = r11.getIntrinsicWidth()
            int r10 = java.lang.Math.max(r12, r10)
            r6.j = r10
            r6.a = r13
            r6.b = r14
            r10 = 255(0xff, float:3.57E-43)
            r8.setAlpha(r10)
            r9.setAlpha(r10)
            t92 r8 = new t92
            r8.<init>(r6)
            r2.addListener(r8)
            f60 r8 = new f60
            r9 = 1
            r8.<init>(r6, r9)
            r2.addUpdateListener(r8)
            androidx.recyclerview.widget.RecyclerView r8 = r6.s
            if (r8 != r7) goto L86
            return
        L86:
            if (r8 == 0) goto Lc8
            java.util.ArrayList r10 = r8.o0
            gg5 r11 = r8.m0
            if (r11 == 0) goto L93
            java.lang.String r12 = "Cannot remove item decoration during a scroll  or layout"
            r11.c(r12)
        L93:
            r10.remove(r6)
            boolean r10 = r10.isEmpty()
            if (r10 == 0) goto La6
            int r10 = r8.getOverScrollMode()
            if (r10 != r1) goto La3
            r0 = r9
        La3:
            r8.setWillNotDraw(r0)
        La6:
            r8.S()
            r8.requestLayout()
            androidx.recyclerview.widget.RecyclerView r8 = r6.s
            java.util.ArrayList r9 = r8.p0
            r9.remove(r6)
            u92 r9 = r8.q0
            if (r9 != r6) goto Lba
            r9 = 0
            r8.q0 = r9
        Lba:
            androidx.recyclerview.widget.RecyclerView r8 = r6.s
            java.util.ArrayList r8 = r8.f1
            if (r8 == 0) goto Lc3
            r8.remove(r4)
        Lc3:
            androidx.recyclerview.widget.RecyclerView r8 = r6.s
            r8.removeCallbacks(r3)
        Lc8:
            r6.s = r7
            r7.i(r6)
            androidx.recyclerview.widget.RecyclerView r7 = r6.s
            java.util.ArrayList r7 = r7.p0
            r7.add(r6)
            androidx.recyclerview.widget.RecyclerView r6 = r6.s
            r6.j(r4)
            return
    }

    public static int f(float r2, float r3, int[] r4, int r5, int r6, int r7) {
            r0 = 1
            r0 = r4[r0]
            r1 = 0
            r4 = r4[r1]
            int r0 = r0 - r4
            if (r0 != 0) goto La
            goto L17
        La:
            float r3 = r3 - r2
            float r2 = (float) r0
            float r3 = r3 / r2
            int r5 = r5 - r7
            float r2 = (float) r5
            float r3 = r3 * r2
            int r2 = (int) r3
            int r6 = r6 + r2
            if (r6 >= r5) goto L17
            if (r6 < 0) goto L17
            return r2
        L17:
            return r1
    }

    @Override // defpackage.dg5
    public final void c(android.graphics.Canvas r10, androidx.recyclerview.widget.RecyclerView r11) {
            r9 = this;
            int r11 = r9.q
            androidx.recyclerview.widget.RecyclerView r0 = r9.s
            int r1 = r0.getWidth()
            r2 = 0
            if (r11 != r1) goto La5
            int r11 = r9.r
            int r1 = r0.getHeight()
            if (r11 == r1) goto L15
            goto La5
        L15:
            int r11 = r9.A
            if (r11 == 0) goto La4
            boolean r11 = r9.t
            r1 = 0
            if (r11 == 0) goto L71
            int r11 = r9.q
            int r3 = r9.e
            int r11 = r11 - r3
            int r4 = r9.l
            int r5 = r9.k
            int r6 = r5 / 2
            int r4 = r4 - r6
            android.graphics.drawable.StateListDrawable r6 = r9.c
            r6.setBounds(r2, r2, r3, r5)
            int r5 = r9.f
            int r7 = r9.r
            android.graphics.drawable.Drawable r8 = r9.d
            r8.setBounds(r2, r2, r5, r7)
            int r0 = r0.getLayoutDirection()
            r5 = 1
            if (r0 != r5) goto L5c
            r8.draw(r10)
            float r11 = (float) r3
            float r0 = (float) r4
            r10.translate(r11, r0)
            r11 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0 = 1065353216(0x3f800000, float:1.0)
            r10.scale(r11, r0)
            r6.draw(r10)
            r10.scale(r11, r0)
            int r11 = -r3
            float r11 = (float) r11
            int r0 = -r4
            float r0 = (float) r0
            r10.translate(r11, r0)
            goto L71
        L5c:
            float r0 = (float) r11
            r10.translate(r0, r1)
            r8.draw(r10)
            float r0 = (float) r4
            r10.translate(r1, r0)
            r6.draw(r10)
            int r11 = -r11
            float r11 = (float) r11
            int r0 = -r4
            float r0 = (float) r0
            r10.translate(r11, r0)
        L71:
            boolean r11 = r9.u
            if (r11 == 0) goto La4
            int r11 = r9.r
            int r0 = r9.i
            int r11 = r11 - r0
            int r3 = r9.o
            int r4 = r9.n
            int r5 = r4 / 2
            int r3 = r3 - r5
            android.graphics.drawable.StateListDrawable r5 = r9.g
            r5.setBounds(r2, r2, r4, r0)
            int r0 = r9.q
            int r4 = r9.j
            android.graphics.drawable.Drawable r9 = r9.h
            r9.setBounds(r2, r2, r0, r4)
            float r0 = (float) r11
            r10.translate(r1, r0)
            r9.draw(r10)
            float r9 = (float) r3
            r10.translate(r9, r1)
            r5.draw(r10)
            int r9 = -r3
            float r9 = (float) r9
            int r11 = -r11
            float r11 = (float) r11
            r10.translate(r9, r11)
        La4:
            return
        La5:
            int r10 = r0.getWidth()
            r9.q = r10
            int r10 = r0.getHeight()
            r9.r = r10
            r9.g(r2)
            return
    }

    public final boolean d(float r3, float r4) {
            r2 = this;
            int r0 = r2.r
            int r1 = r2.i
            int r0 = r0 - r1
            float r0 = (float) r0
            int r4 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r4 < 0) goto L21
            int r4 = r2.o
            int r2 = r2.n
            int r0 = r2 / 2
            int r0 = r4 - r0
            float r0 = (float) r0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 < 0) goto L21
            int r2 = r2 / 2
            int r2 = r2 + r4
            float r2 = (float) r2
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 > 0) goto L21
            r2 = 1
            return r2
        L21:
            r2 = 0
            return r2
    }

    public final boolean e(float r4, float r5) {
            r3 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r3.s
            int r0 = r0.getLayoutDirection()
            int r1 = r3.e
            r2 = 1
            if (r0 != r2) goto L11
            float r0 = (float) r1
            int r4 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r4 > 0) goto L2d
            goto L19
        L11:
            int r0 = r3.q
            int r0 = r0 - r1
            float r0 = (float) r0
            int r4 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r4 < 0) goto L2d
        L19:
            int r4 = r3.l
            int r3 = r3.k
            int r3 = r3 / 2
            int r0 = r4 - r3
            float r0 = (float) r0
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 < 0) goto L2d
            int r3 = r3 + r4
            float r3 = (float) r3
            int r3 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r3 > 0) goto L2d
            return r2
        L2d:
            r3 = 0
            return r3
    }

    public final void g(int r6) {
            r5 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r5.s
            g15 r1 = r5.B
            android.graphics.drawable.StateListDrawable r2 = r5.c
            r3 = 2
            if (r6 != r3) goto L15
            int r4 = r5.v
            if (r4 == r3) goto L15
            int[] r4 = defpackage.u92.C
            r2.setState(r4)
            r0.removeCallbacks(r1)
        L15:
            if (r6 != 0) goto L1b
            r0.invalidate()
            goto L1e
        L1b:
            r5.h()
        L1e:
            int r4 = r5.v
            if (r4 != r3) goto L32
            if (r6 == r3) goto L32
            int[] r3 = defpackage.u92.D
            r2.setState(r3)
            r0.removeCallbacks(r1)
            r2 = 1200(0x4b0, double:5.93E-321)
            r0.postDelayed(r1, r2)
            goto L3d
        L32:
            r2 = 1
            if (r6 != r2) goto L3d
            r0.removeCallbacks(r1)
            r2 = 1500(0x5dc, double:7.41E-321)
            r0.postDelayed(r1, r2)
        L3d:
            r5.v = r6
            return
    }

    public final void h() {
            r4 = this;
            int r0 = r4.A
            android.animation.ValueAnimator r1 = r4.z
            if (r0 == 0) goto Ld
            r2 = 3
            if (r0 == r2) goto La
            return
        La:
            r1.cancel()
        Ld:
            r0 = 1
            r4.A = r0
            java.lang.Object r4 = r1.getAnimatedValue()
            java.lang.Float r4 = (java.lang.Float) r4
            float r4 = r4.floatValue()
            r2 = 2
            float[] r2 = new float[r2]
            r3 = 0
            r2[r3] = r4
            r4 = 1065353216(0x3f800000, float:1.0)
            r2[r0] = r4
            r1.setFloatValues(r2)
            r2 = 500(0x1f4, double:2.47E-321)
            r1.setDuration(r2)
            r2 = 0
            r1.setStartDelay(r2)
            r1.start()
            return
    }
}
