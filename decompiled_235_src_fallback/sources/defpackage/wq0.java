package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wq0  reason: default package */
/* loaded from: classes.dex */
public final class wq0 extends android.graphics.drawable.Drawable implements android.graphics.drawable.Animatable {
    public static final android.view.animation.LinearInterpolator Z = null;
    public static final defpackage.q92 d0 = null;
    public static final int[] e0 = null;
    public final defpackage.vq0 A;
    public float B;
    public final android.content.res.Resources L;
    public final android.animation.ValueAnimator R;
    public float X;
    public boolean Y;

    static {
            android.view.animation.LinearInterpolator r0 = new android.view.animation.LinearInterpolator
            r0.<init>()
            defpackage.wq0.Z = r0
            q92 r0 = new q92
            r1 = 1
            r0.<init>(r1)
            defpackage.wq0.d0 = r0
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            int[] r0 = new int[]{r0}
            defpackage.wq0.e0 = r0
            return
    }

    public wq0(android.content.Context r3) {
            r2 = this;
            r2.<init>()
            r3.getClass()
            android.content.res.Resources r3 = r3.getResources()
            r2.L = r3
            vq0 r3 = new vq0
            r3.<init>()
            r2.A = r3
            int[] r0 = defpackage.wq0.e0
            r3.i = r0
            r0 = 0
            r3.a(r0)
            r0 = 1075838976(0x40200000, float:2.5)
            r3.h = r0
            android.graphics.Paint r1 = r3.b
            r1.setStrokeWidth(r0)
            r2.invalidateSelf()
            r0 = 2
            float[] r0 = new float[r0]
            r0 = {x0052: FILL_ARRAY_DATA  , data: [0, 1065353216} // fill-array
            android.animation.ValueAnimator r0 = android.animation.ValueAnimator.ofFloat(r0)
            tq0 r1 = new tq0
            r1.<init>(r2, r3)
            r0.addUpdateListener(r1)
            r1 = -1
            r0.setRepeatCount(r1)
            r1 = 1
            r0.setRepeatMode(r1)
            android.view.animation.LinearInterpolator r1 = defpackage.wq0.Z
            r0.setInterpolator(r1)
            uq0 r1 = new uq0
            r1.<init>(r2, r3)
            r0.addListener(r1)
            r2.R = r0
            return
    }

    public static void d(float r8, defpackage.vq0 r9) {
            r0 = 1061158912(0x3f400000, float:0.75)
            int r1 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r1 <= 0) goto L53
            float r8 = r8 - r0
            r0 = 1048576000(0x3e800000, float:0.25)
            float r8 = r8 / r0
            int[] r0 = r9.i
            int r1 = r9.j
            r2 = r0[r1]
            int r1 = r1 + 1
            int r3 = r0.length
            int r1 = r1 % r3
            r0 = r0[r1]
            int r1 = r2 >> 24
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r3 = r2 >> 16
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r4 = r2 >> 8
            r4 = r4 & 255(0xff, float:3.57E-43)
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r5 = r0 >> 24
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r6 = r0 >> 16
            r6 = r6 & 255(0xff, float:3.57E-43)
            int r7 = r0 >> 8
            r7 = r7 & 255(0xff, float:3.57E-43)
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r5 = r5 - r1
            float r5 = (float) r5
            float r5 = r5 * r8
            int r5 = (int) r5
            int r1 = r1 + r5
            int r1 = r1 << 24
            int r6 = r6 - r3
            float r5 = (float) r6
            float r5 = r5 * r8
            int r5 = (int) r5
            int r3 = r3 + r5
            int r3 = r3 << 16
            r1 = r1 | r3
            int r7 = r7 - r4
            float r3 = (float) r7
            float r3 = r3 * r8
            int r3 = (int) r3
            int r4 = r4 + r3
            int r3 = r4 << 8
            r1 = r1 | r3
            int r0 = r0 - r2
            float r0 = (float) r0
            float r8 = r8 * r0
            int r8 = (int) r8
            int r2 = r2 + r8
            r8 = r1 | r2
            r9.u = r8
            return
        L53:
            int[] r8 = r9.i
            int r0 = r9.j
            r8 = r8[r0]
            r9.u = r8
            return
    }

    public final void a(float r8, defpackage.vq0 r9, boolean r10) {
            r7 = this;
            boolean r0 = r7.Y
            r1 = 1008981770(0x3c23d70a, float:0.01)
            if (r0 == 0) goto L2f
            d(r8, r9)
            float r7 = r9.m
            r10 = 1061997773(0x3f4ccccd, float:0.8)
            float r7 = r7 / r10
            double r2 = (double) r7
            double r2 = java.lang.Math.floor(r2)
            r4 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r2 = r2 + r4
            float r7 = (float) r2
            float r10 = r9.k
            float r0 = r9.l
            float r1 = r0 - r1
            float r1 = r1 - r10
            float r1 = r1 * r8
            float r1 = r1 + r10
            r9.e = r1
            r9.f = r0
            float r10 = r9.m
            float r7 = defpackage.i61.a(r7, r10, r8, r10)
            r9.g = r7
            return
        L2f:
            r0 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r2 != 0) goto L39
            if (r10 == 0) goto L38
            goto L39
        L38:
            return
        L39:
            float r10 = r9.m
            r2 = 1056964608(0x3f000000, float:0.5)
            int r3 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            float r4 = r9.k
            q92 r5 = defpackage.wq0.d0
            r6 = 1061830001(0x3f4a3d71, float:0.79)
            if (r3 >= 0) goto L52
            float r0 = r8 / r2
            float r0 = r5.getInterpolation(r0)
            float r0 = r0 * r6
            float r0 = r0 + r1
            float r0 = r0 + r4
            goto L61
        L52:
            float r3 = r8 - r2
            float r3 = r3 / r2
            float r2 = r4 + r6
            float r3 = r5.getInterpolation(r3)
            float r0 = r0 - r3
            float r0 = r0 * r6
            float r0 = r0 + r1
            float r4 = r2 - r0
            r0 = r2
        L61:
            r1 = 1045891644(0x3e570a3c, float:0.20999998)
            float r1 = r1 * r8
            float r1 = r1 + r10
            float r10 = r7.X
            float r8 = r8 + r10
            r10 = 1129840640(0x43580000, float:216.0)
            float r8 = r8 * r10
            r9.e = r4
            r9.f = r0
            r9.g = r1
            r7.B = r8
            return
    }

    public final void b(float r3, float r4, float r5, float r6) {
            r2 = this;
            android.content.res.Resources r0 = r2.L
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            float r4 = r4 * r0
            vq0 r2 = r2.A
            r2.h = r4
            android.graphics.Paint r1 = r2.b
            r1.setStrokeWidth(r4)
            float r3 = r3 * r0
            r2.q = r3
            r3 = 0
            r2.a(r3)
            float r5 = r5 * r0
            float r6 = r6 * r0
            int r3 = (int) r5
            r2.r = r3
            int r3 = (int) r6
            r2.s = r3
            return
    }

    public final void c(int r4) {
            r3 = this;
            if (r4 != 0) goto Le
            r4 = 1094713344(0x41400000, float:12.0)
            r0 = 1086324736(0x40c00000, float:6.0)
            r1 = 1093664768(0x41300000, float:11.0)
            r2 = 1077936128(0x40400000, float:3.0)
            r3.b(r1, r2, r4, r0)
            goto L19
        Le:
            r4 = 1092616192(0x41200000, float:10.0)
            r0 = 1084227584(0x40a00000, float:5.0)
            r1 = 1089470464(0x40f00000, float:7.5)
            r2 = 1075838976(0x40200000, float:2.5)
            r3.b(r1, r2, r4, r0)
        L19:
            r3.invalidateSelf()
            return
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(android.graphics.Canvas r12) {
            r11 = this;
            android.graphics.Rect r0 = r11.getBounds()
            r12.save()
            float r1 = r11.B
            float r2 = r0.exactCenterX()
            float r3 = r0.exactCenterY()
            r12.rotate(r1, r2, r3)
            vq0 r11 = r11.A
            android.graphics.Paint r6 = r11.b
            android.graphics.RectF r2 = r11.a
            float r1 = r11.q
            float r3 = r11.h
            r7 = 1073741824(0x40000000, float:2.0)
            float r3 = r3 / r7
            float r3 = r3 + r1
            r8 = 0
            int r1 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r1 > 0) goto L45
            int r1 = r0.width()
            int r3 = r0.height()
            int r1 = java.lang.Math.min(r1, r3)
            float r1 = (float) r1
            float r1 = r1 / r7
            int r3 = r11.r
            float r3 = (float) r3
            float r4 = r11.p
            float r3 = r3 * r4
            float r3 = r3 / r7
            float r4 = r11.h
            float r4 = r4 / r7
            float r3 = java.lang.Math.max(r3, r4)
            float r3 = r1 - r3
        L45:
            int r1 = r0.centerX()
            float r1 = (float) r1
            float r1 = r1 - r3
            int r4 = r0.centerY()
            float r4 = (float) r4
            float r4 = r4 - r3
            int r5 = r0.centerX()
            float r5 = (float) r5
            float r5 = r5 + r3
            int r0 = r0.centerY()
            float r0 = (float) r0
            float r0 = r0 + r3
            r2.set(r1, r4, r5, r0)
            float r0 = r11.e
            float r1 = r11.g
            float r0 = r0 + r1
            r3 = 1135869952(0x43b40000, float:360.0)
            float r0 = r0 * r3
            float r4 = r11.f
            float r4 = r4 + r1
            float r4 = r4 * r3
            float r4 = r4 - r0
            int r1 = r11.u
            r6.setColor(r1)
            int r1 = r11.t
            r6.setAlpha(r1)
            float r1 = r11.h
            float r1 = r1 / r7
            r2.inset(r1, r1)
            float r3 = r2.centerX()
            float r5 = r2.centerY()
            float r9 = r2.width()
            float r9 = r9 / r7
            android.graphics.Paint r10 = r11.d
            r12.drawCircle(r3, r5, r9, r10)
            float r1 = -r1
            r2.inset(r1, r1)
            r5 = 0
            r1 = r12
            r3 = r0
            r1.drawArc(r2, r3, r4, r5, r6)
            android.graphics.Paint r12 = r11.c
            boolean r0 = r11.n
            if (r0 == 0) goto L121
            android.graphics.Path r0 = r11.o
            if (r0 != 0) goto Lb0
            android.graphics.Path r0 = new android.graphics.Path
            r0.<init>()
            r11.o = r0
            android.graphics.Path$FillType r5 = android.graphics.Path.FillType.EVEN_ODD
            r0.setFillType(r5)
            goto Lb3
        Lb0:
            r0.reset()
        Lb3:
            float r0 = r2.width()
            float r5 = r2.height()
            float r0 = java.lang.Math.min(r0, r5)
            float r0 = r0 / r7
            int r5 = r11.r
            float r5 = (float) r5
            float r6 = r11.p
            float r5 = r5 * r6
            float r5 = r5 / r7
            android.graphics.Path r6 = r11.o
            r6.moveTo(r8, r8)
            android.graphics.Path r6 = r11.o
            int r9 = r11.r
            float r9 = (float) r9
            float r10 = r11.p
            float r9 = r9 * r10
            r6.lineTo(r9, r8)
            android.graphics.Path r6 = r11.o
            int r8 = r11.r
            float r8 = (float) r8
            float r9 = r11.p
            float r8 = r8 * r9
            float r8 = r8 / r7
            int r10 = r11.s
            float r10 = (float) r10
            float r10 = r10 * r9
            r6.lineTo(r8, r10)
            android.graphics.Path r6 = r11.o
            float r8 = r2.centerX()
            float r8 = r8 + r0
            float r8 = r8 - r5
            float r0 = r2.centerY()
            float r5 = r11.h
            float r5 = r5 / r7
            float r5 = r5 + r0
            r6.offset(r8, r5)
            android.graphics.Path r0 = r11.o
            r0.close()
            int r0 = r11.u
            r12.setColor(r0)
            int r0 = r11.t
            r12.setAlpha(r0)
            r1.save()
            float r0 = r3 + r4
            float r3 = r2.centerX()
            float r2 = r2.centerY()
            r1.rotate(r0, r3, r2)
            android.graphics.Path r11 = r11.o
            r1.drawPath(r11, r12)
            r1.restore()
        L121:
            r1.restore()
            return
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
            r0 = this;
            vq0 r0 = r0.A
            int r0 = r0.t
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
            r0 = this;
            r0 = -3
            return r0
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
            r0 = this;
            android.animation.ValueAnimator r0 = r0.R
            boolean r0 = r0.isRunning()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int r2) {
            r1 = this;
            vq0 r0 = r1.A
            r0.t = r2
            r1.invalidateSelf()
            return
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(android.graphics.ColorFilter r2) {
            r1 = this;
            vq0 r0 = r1.A
            android.graphics.Paint r0 = r0.b
            r0.setColorFilter(r2)
            r1.invalidateSelf()
            return
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
            r5 = this;
            android.animation.ValueAnimator r0 = r5.R
            r0.cancel()
            vq0 r1 = r5.A
            float r2 = r1.e
            r1.k = r2
            float r3 = r1.f
            r1.l = r3
            float r4 = r1.g
            r1.m = r4
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 == 0) goto L23
            r1 = 1
            r5.Y = r1
            r1 = 666(0x29a, double:3.29E-321)
            r0.setDuration(r1)
            r0.start()
            return
        L23:
            r5 = 0
            r1.a(r5)
            r5 = 0
            r1.k = r5
            r1.l = r5
            r1.m = r5
            r1.e = r5
            r1.f = r5
            r1.g = r5
            r1 = 1332(0x534, double:6.58E-321)
            r0.setDuration(r1)
            r0.start()
            return
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
            r4 = this;
            android.animation.ValueAnimator r0 = r4.R
            r0.cancel()
            r0 = 0
            r4.B = r0
            vq0 r1 = r4.A
            boolean r2 = r1.n
            r3 = 0
            if (r2 == 0) goto L11
            r1.n = r3
        L11:
            r1.a(r3)
            r1.k = r0
            r1.l = r0
            r1.m = r0
            r1.e = r0
            r1.f = r0
            r1.g = r0
            r4.invalidateSelf()
            return
    }
}
