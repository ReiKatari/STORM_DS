package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: n71  reason: default package */
/* loaded from: classes.dex */
public final class n71 extends android.graphics.drawable.Drawable implements android.graphics.drawable.Drawable.Callback, android.graphics.drawable.Animatable {
    public final defpackage.y56 A;
    public final int B;
    public final boolean L;
    public final java.util.ArrayList R;
    public final int X;
    public final int Y;
    public long Z;
    public int d0;
    public int e0;
    public android.graphics.drawable.Drawable f0;
    public final android.graphics.drawable.Drawable g0;

    public n71(android.graphics.drawable.Drawable r1, defpackage.y56 r2, int r3, boolean r4) {
            r0 = this;
            r0.<init>()
            r0.A = r2
            r0.B = r3
            r0.L = r4
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r0.R = r2
            r2 = 0
            if (r1 == 0) goto L1c
            int r4 = r1.getIntrinsicWidth()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            goto L1d
        L1c:
            r4 = r2
        L1d:
            int r4 = r0.a(r2, r4)
            r0.X = r4
            if (r1 == 0) goto L2e
            int r4 = r1.getIntrinsicHeight()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            goto L2f
        L2e:
            r4 = r2
        L2f:
            int r4 = r0.a(r2, r4)
            r0.Y = r4
            r4 = 255(0xff, float:3.57E-43)
            r0.d0 = r4
            r0.f0 = r2
            if (r1 == 0) goto L42
            android.graphics.drawable.Drawable r1 = r1.mutate()
            goto L43
        L42:
            r1 = r2
        L43:
            r0.g0 = r1
            if (r3 <= 0) goto L54
            android.graphics.drawable.Drawable r2 = r0.f0
            if (r2 == 0) goto L4e
            r2.setCallback(r0)
        L4e:
            if (r1 == 0) goto L53
            r1.setCallback(r0)
        L53:
            return
        L54:
            java.lang.String r0 = "durationMillis must be > 0."
            defpackage.i.h(r0)
            throw r2
    }

    public final int a(java.lang.Integer r2, java.lang.Integer r3) {
            r1 = this;
            r1 = -1
            if (r2 != 0) goto L4
            goto La
        L4:
            int r0 = r2.intValue()
            if (r0 == r1) goto L26
        La:
            if (r3 != 0) goto Ld
            goto L14
        Ld:
            int r0 = r3.intValue()
            if (r0 != r1) goto L14
            goto L26
        L14:
            if (r2 == 0) goto L1b
            int r2 = r2.intValue()
            goto L1c
        L1b:
            r2 = r1
        L1c:
            if (r3 == 0) goto L22
            int r1 = r3.intValue()
        L22:
            int r1 = java.lang.Math.max(r2, r1)
        L26:
            return r1
    }

    public final void b() {
            r4 = this;
            r0 = 2
            r4.e0 = r0
            r0 = 0
            r4.f0 = r0
            java.util.ArrayList r0 = r4.R
            int r1 = r0.size()
            r2 = 0
        Ld:
            if (r2 >= r1) goto L21
            java.lang.Object r3 = r0.get(r2)
            g24 r3 = (defpackage.g24) r3
            i24 r3 = r3.b
            android.content.res.ColorStateList r3 = r3.n0
            if (r3 == 0) goto L1e
            r4.setTintList(r3)
        L1e:
            int r2 = r2 + 1
            goto Ld
        L21:
            return
    }

    public final void c(android.graphics.drawable.Drawable r11, android.graphics.Rect r12) {
            r10 = this;
            int r0 = r11.getIntrinsicWidth()
            int r1 = r11.getIntrinsicHeight()
            if (r0 <= 0) goto L3f
            if (r1 > 0) goto Ld
            goto L3f
        Ld:
            int r2 = r12.width()
            int r3 = r12.height()
            y56 r10 = r10.A
            double r4 = defpackage.ak7.N(r0, r1, r2, r3, r10)
            double r6 = (double) r2
            double r8 = (double) r0
            double r8 = r8 * r4
            double r6 = r6 - r8
            r8 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r6 = r6 / r8
            int r10 = defpackage.u24.D(r6)
            double r2 = (double) r3
            double r0 = (double) r1
            double r4 = r4 * r0
            double r2 = r2 - r4
            double r2 = r2 / r8
            int r0 = defpackage.u24.D(r2)
            int r1 = r12.left
            int r1 = r1 + r10
            int r2 = r12.top
            int r2 = r2 + r0
            int r3 = r12.right
            int r3 = r3 - r10
            int r10 = r12.bottom
            int r10 = r10 - r0
            r11.setBounds(r1, r2, r3, r10)
            return
        L3f:
            r11.setBounds(r12)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(android.graphics.Canvas r12) {
            r11 = this;
            int r0 = r11.e0
            if (r0 != 0) goto L1d
            android.graphics.drawable.Drawable r0 = r11.f0
            if (r0 == 0) goto L39
            int r11 = r11.d0
            r0.setAlpha(r11)
            int r11 = r12.save()
            r0.draw(r12)     // Catch: java.lang.Throwable -> L18
            r12.restoreToCount(r11)
            return
        L18:
            r0 = move-exception
            r12.restoreToCount(r11)
            throw r0
        L1d:
            r1 = 2
            android.graphics.drawable.Drawable r2 = r11.g0
            if (r0 != r1) goto L3a
            if (r2 == 0) goto L39
            int r11 = r11.d0
            r2.setAlpha(r11)
            int r11 = r12.save()
            r2.draw(r12)     // Catch: java.lang.Throwable -> L34
            r12.restoreToCount(r11)
            return
        L34:
            r0 = move-exception
            r12.restoreToCount(r11)
            throw r0
        L39:
            return
        L3a:
            long r0 = android.os.SystemClock.uptimeMillis()
            long r3 = r11.Z
            long r0 = r0 - r3
            double r0 = (double) r0
            int r3 = r11.B
            double r3 = (double) r3
            double r5 = r0 / r3
            r7 = 0
            r9 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r0 = defpackage.gi2.o(r5, r7, r9)
            int r3 = r11.d0
            double r7 = (double) r3
            double r0 = r0 * r7
            int r0 = (int) r0
            boolean r1 = r11.L
            if (r1 == 0) goto L59
            int r3 = r3 - r0
        L59:
            r7 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r1 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r1 < 0) goto L61
            r1 = 1
            goto L62
        L61:
            r1 = 0
        L62:
            if (r1 != 0) goto L7c
            android.graphics.drawable.Drawable r4 = r11.f0
            if (r4 == 0) goto L7c
            r4.setAlpha(r3)
            int r3 = r12.save()
            r4.draw(r12)     // Catch: java.lang.Throwable -> L76
            r12.restoreToCount(r3)
            goto L7c
        L76:
            r0 = move-exception
            r11 = r0
            r12.restoreToCount(r3)
            throw r11
        L7c:
            if (r2 == 0) goto L92
            r2.setAlpha(r0)
            int r3 = r12.save()
            r2.draw(r12)     // Catch: java.lang.Throwable -> L8c
            r12.restoreToCount(r3)
            goto L92
        L8c:
            r0 = move-exception
            r11 = r0
            r12.restoreToCount(r3)
            throw r11
        L92:
            if (r1 == 0) goto L98
            r11.b()
            return
        L98:
            r11.invalidateSelf()
            return
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
            r0 = this;
            int r0 = r0.d0
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public final android.graphics.ColorFilter getColorFilter() {
            r3 = this;
            int r0 = r3.e0
            if (r0 == 0) goto L27
            r1 = 1
            android.graphics.drawable.Drawable r2 = r3.g0
            if (r0 == r1) goto L14
            r3 = 2
            if (r0 == r3) goto Ld
            goto L30
        Ld:
            if (r2 == 0) goto L30
            android.graphics.ColorFilter r3 = r2.getColorFilter()
            return r3
        L14:
            if (r2 == 0) goto L1e
            android.graphics.ColorFilter r0 = r2.getColorFilter()
            if (r0 != 0) goto L1d
            goto L1e
        L1d:
            return r0
        L1e:
            android.graphics.drawable.Drawable r3 = r3.f0
            if (r3 == 0) goto L30
            android.graphics.ColorFilter r3 = r3.getColorFilter()
            return r3
        L27:
            android.graphics.drawable.Drawable r3 = r3.f0
            if (r3 == 0) goto L30
            android.graphics.ColorFilter r3 = r3.getColorFilter()
            return r3
        L30:
            r3 = 0
            return r3
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
            r0 = this;
            int r0 = r0.Y
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
            r0 = this;
            int r0 = r0.X
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
            r3 = this;
            android.graphics.drawable.Drawable r0 = r3.f0
            int r1 = r3.e0
            if (r1 != 0) goto Ld
            if (r0 == 0) goto L38
            int r3 = r0.getOpacity()
            return r3
        Ld:
            r2 = 2
            android.graphics.drawable.Drawable r3 = r3.g0
            if (r1 != r2) goto L19
            if (r3 == 0) goto L38
            int r3 = r3.getOpacity()
            return r3
        L19:
            if (r0 == 0) goto L2a
            if (r3 == 0) goto L2a
            int r0 = r0.getOpacity()
            int r3 = r3.getOpacity()
            int r3 = android.graphics.drawable.Drawable.resolveOpacity(r0, r3)
            return r3
        L2a:
            if (r0 == 0) goto L31
            int r3 = r0.getOpacity()
            return r3
        L31:
            if (r3 == 0) goto L38
            int r3 = r3.getOpacity()
            return r3
        L38:
            r3 = -2
            return r3
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(android.graphics.drawable.Drawable r1) {
            r0 = this;
            r0.invalidateSelf()
            return
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
            r1 = this;
            int r1 = r1.e0
            r0 = 1
            if (r1 != r0) goto L6
            return r0
        L6:
            r1 = 0
            return r1
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(android.graphics.Rect r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f0
            if (r0 == 0) goto L7
            r1.c(r0, r2)
        L7:
            android.graphics.drawable.Drawable r0 = r1.g0
            if (r0 == 0) goto Le
            r1.c(r0, r2)
        Le:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int r3) {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.f0
            r1 = 0
            if (r0 == 0) goto La
            boolean r0 = r0.setLevel(r3)
            goto Lb
        La:
            r0 = r1
        Lb:
            android.graphics.drawable.Drawable r2 = r2.g0
            if (r2 == 0) goto L14
            boolean r2 = r2.setLevel(r3)
            goto L15
        L14:
            r2 = r1
        L15:
            if (r0 != 0) goto L1b
            if (r2 == 0) goto L1a
            goto L1b
        L1a:
            return r1
        L1b:
            r2 = 1
            return r2
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] r3) {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.f0
            r1 = 0
            if (r0 == 0) goto La
            boolean r0 = r0.setState(r3)
            goto Lb
        La:
            r0 = r1
        Lb:
            android.graphics.drawable.Drawable r2 = r2.g0
            if (r2 == 0) goto L14
            boolean r2 = r2.setState(r3)
            goto L15
        L14:
            r2 = r1
        L15:
            if (r0 != 0) goto L1b
            if (r2 == 0) goto L1a
            goto L1b
        L1a:
            return r1
        L1b:
            r2 = 1
            return r2
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(android.graphics.drawable.Drawable r1, java.lang.Runnable r2, long r3) {
            r0 = this;
            r0.scheduleSelf(r2, r3)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int r2) {
            r1 = this;
            if (r2 < 0) goto L9
            r0 = 256(0x100, float:3.59E-43)
            if (r2 >= r0) goto L9
            r1.d0 = r2
            return
        L9:
            java.lang.String r1 = "Invalid alpha: "
            java.lang.String r1 = defpackage.lb1.g(r2, r1)
            defpackage.i.f(r1)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(android.graphics.ColorFilter r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f0
            if (r0 == 0) goto L7
            r0.setColorFilter(r2)
        L7:
            android.graphics.drawable.Drawable r1 = r1.g0
            if (r1 == 0) goto Le
            r1.setColorFilter(r2)
        Le:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f0
            if (r0 == 0) goto L7
            r0.setTint(r2)
        L7:
            android.graphics.drawable.Drawable r1 = r1.g0
            if (r1 == 0) goto Le
            r1.setTint(r2)
        Le:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintBlendMode(android.graphics.BlendMode r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f0
            if (r0 == 0) goto L7
            defpackage.yz0.m(r0, r2)
        L7:
            android.graphics.drawable.Drawable r1 = r1.g0
            if (r1 == 0) goto Le
            defpackage.yz0.m(r1, r2)
        Le:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(android.content.res.ColorStateList r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f0
            if (r0 == 0) goto L7
            r0.setTintList(r2)
        L7:
            android.graphics.drawable.Drawable r1 = r1.g0
            if (r1 == 0) goto Le
            r1.setTintList(r2)
        Le:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(android.graphics.PorterDuff.Mode r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f0
            if (r0 == 0) goto L7
            r0.setTintMode(r2)
        L7:
            android.graphics.drawable.Drawable r1 = r1.g0
            if (r1 == 0) goto Le
            r1.setTintMode(r2)
        Le:
            return
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
            r4 = this;
            android.graphics.drawable.Drawable r0 = r4.f0
            boolean r1 = r0 instanceof android.graphics.drawable.Animatable
            r2 = 0
            if (r1 == 0) goto La
            android.graphics.drawable.Animatable r0 = (android.graphics.drawable.Animatable) r0
            goto Lb
        La:
            r0 = r2
        Lb:
            if (r0 == 0) goto L10
            r0.start()
        L10:
            android.graphics.drawable.Drawable r0 = r4.g0
            boolean r1 = r0 instanceof android.graphics.drawable.Animatable
            if (r1 == 0) goto L19
            r2 = r0
            android.graphics.drawable.Animatable r2 = (android.graphics.drawable.Animatable) r2
        L19:
            if (r2 == 0) goto L1e
            r2.start()
        L1e:
            int r0 = r4.e0
            if (r0 == 0) goto L23
            return
        L23:
            r0 = 1
            r4.e0 = r0
            long r0 = android.os.SystemClock.uptimeMillis()
            r4.Z = r0
            java.util.ArrayList r0 = r4.R
            int r1 = r0.size()
            r2 = 0
        L33:
            if (r2 >= r1) goto L41
            java.lang.Object r3 = r0.get(r2)
            g24 r3 = (defpackage.g24) r3
            r3.a(r4)
            int r2 = r2 + 1
            goto L33
        L41:
            r4.invalidateSelf()
            return
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
            r3 = this;
            android.graphics.drawable.Drawable r0 = r3.f0
            boolean r1 = r0 instanceof android.graphics.drawable.Animatable
            r2 = 0
            if (r1 == 0) goto La
            android.graphics.drawable.Animatable r0 = (android.graphics.drawable.Animatable) r0
            goto Lb
        La:
            r0 = r2
        Lb:
            if (r0 == 0) goto L10
            r0.stop()
        L10:
            android.graphics.drawable.Drawable r0 = r3.g0
            boolean r1 = r0 instanceof android.graphics.drawable.Animatable
            if (r1 == 0) goto L19
            r2 = r0
            android.graphics.drawable.Animatable r2 = (android.graphics.drawable.Animatable) r2
        L19:
            if (r2 == 0) goto L1e
            r2.stop()
        L1e:
            int r0 = r3.e0
            r1 = 2
            if (r0 == r1) goto L26
            r3.b()
        L26:
            return
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(android.graphics.drawable.Drawable r1, java.lang.Runnable r2) {
            r0 = this;
            r0.unscheduleSelf(r2)
            return
    }
}
