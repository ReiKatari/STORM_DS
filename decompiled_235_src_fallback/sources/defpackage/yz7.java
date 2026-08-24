package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yz7  reason: default package */
/* loaded from: classes.dex */
public final class yz7 extends android.graphics.drawable.Drawable implements android.graphics.drawable.Drawable.Callback {
    public int A;
    public long B;
    public int L;
    public int R;
    public int X;
    public int Y;
    public final boolean Z;
    public boolean d0;
    public final defpackage.wz7 e0;
    public android.graphics.drawable.Drawable f0;
    public android.graphics.drawable.Drawable g0;
    public boolean h0;
    public boolean i0;
    public boolean j0;
    public int k0;

    public yz7(defpackage.wz7 r3) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.A = r0
            r1 = 255(0xff, float:3.57E-43)
            r2.R = r1
            r2.Y = r0
            r0 = 1
            r2.Z = r0
            wz7 r0 = new wz7
            r0.<init>()
            if (r3 == 0) goto L1e
            int r1 = r3.a
            r0.a = r1
            int r3 = r3.b
            r0.b = r3
        L1e:
            r2.e0 = r0
            return
    }

    public final boolean a() {
            r3 = this;
            boolean r0 = r3.h0
            if (r0 != 0) goto L1b
            android.graphics.drawable.Drawable r0 = r3.f0
            android.graphics.drawable.Drawable$ConstantState r0 = r0.getConstantState()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L17
            android.graphics.drawable.Drawable r0 = r3.g0
            android.graphics.drawable.Drawable$ConstantState r0 = r0.getConstantState()
            if (r0 == 0) goto L17
            r1 = r2
        L17:
            r3.i0 = r1
            r3.h0 = r2
        L1b:
            boolean r3 = r3.i0
            return r3
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(android.graphics.Canvas r8) {
            r7 = this;
            int r0 = r7.A
            r1 = 2
            r2 = 0
            r3 = 1
            if (r0 == r3) goto L3a
            if (r0 == r1) goto Lb
        L9:
            r4 = r3
            goto L43
        Lb:
            long r0 = r7.B
            r4 = 0
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 < 0) goto L9
            long r0 = android.os.SystemClock.uptimeMillis()
            long r4 = r7.B
            long r0 = r0 - r4
            int r4 = r7.X
            float r4 = (float) r4
            float r0 = (float) r0
            float r0 = r0 / r4
            r1 = 1065353216(0x3f800000, float:1.0)
            int r4 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r4 < 0) goto L27
            r4 = r3
            goto L28
        L27:
            r4 = r2
        L28:
            if (r4 == 0) goto L2c
            r7.A = r2
        L2c:
            float r0 = java.lang.Math.min(r0, r1)
            int r1 = r7.L
            float r1 = (float) r1
            float r1 = r1 * r0
            r0 = 0
            float r1 = r1 + r0
            int r0 = (int) r1
            r7.Y = r0
            goto L43
        L3a:
            long r4 = android.os.SystemClock.uptimeMillis()
            r7.B = r4
            r7.A = r1
            r4 = r2
        L43:
            int r0 = r7.Y
            android.graphics.drawable.Drawable r1 = r7.f0
            android.graphics.drawable.Drawable r5 = r7.g0
            boolean r6 = r7.Z
            if (r4 == 0) goto L62
            if (r6 == 0) goto L52
            if (r0 != 0) goto L57
            goto L53
        L52:
            r2 = r0
        L53:
            r1.draw(r8)
            r0 = r2
        L57:
            int r7 = r7.R
            if (r0 != r7) goto L61
            r5.setAlpha(r7)
            r5.draw(r8)
        L61:
            return
        L62:
            if (r6 == 0) goto L6b
            int r2 = r7.R
            int r2 = r2 - r0
            r1.setAlpha(r2)
            r2 = r3
        L6b:
            r1.draw(r8)
            if (r2 == 0) goto L75
            int r2 = r7.R
            r1.setAlpha(r2)
        L75:
            if (r0 <= 0) goto L82
            r5.setAlpha(r0)
            r5.draw(r8)
            int r8 = r7.R
            r5.setAlpha(r8)
        L82:
            r7.invalidateSelf()
            return
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
            r2 = this;
            int r0 = super.getChangingConfigurations()
            wz7 r2 = r2.e0
            int r1 = r2.a
            r0 = r0 | r1
            int r2 = r2.b
            r2 = r2 | r0
            return r2
    }

    @Override // android.graphics.drawable.Drawable
    public final android.graphics.drawable.Drawable.ConstantState getConstantState() {
            r1 = this;
            boolean r0 = r1.a()
            if (r0 == 0) goto Lf
            int r0 = r1.getChangingConfigurations()
            wz7 r1 = r1.e0
            r1.a = r0
            return r1
        Lf:
            r1 = 0
            return r1
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f0
            int r0 = r0.getIntrinsicHeight()
            android.graphics.drawable.Drawable r1 = r1.g0
            int r1 = r1.getIntrinsicHeight()
            int r1 = java.lang.Math.max(r0, r1)
            return r1
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f0
            int r0 = r0.getIntrinsicWidth()
            android.graphics.drawable.Drawable r1 = r1.g0
            int r1 = r1.getIntrinsicWidth()
            int r1 = java.lang.Math.max(r0, r1)
            return r1
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
            r2 = this;
            boolean r0 = r2.j0
            if (r0 != 0) goto L19
            android.graphics.drawable.Drawable r0 = r2.f0
            int r0 = r0.getOpacity()
            android.graphics.drawable.Drawable r1 = r2.g0
            int r1 = r1.getOpacity()
            int r0 = android.graphics.drawable.Drawable.resolveOpacity(r0, r1)
            r2.k0 = r0
            r0 = 1
            r2.j0 = r0
        L19:
            int r2 = r2.k0
            return r2
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(android.graphics.drawable.Drawable r1) {
            r0 = this;
            android.graphics.drawable.Drawable$Callback r1 = r0.getCallback()
            if (r1 == 0) goto L9
            r1.invalidateDrawable(r0)
        L9:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public final android.graphics.drawable.Drawable mutate() {
            r1 = this;
            boolean r0 = r1.d0
            if (r0 != 0) goto L24
            android.graphics.drawable.Drawable r0 = super.mutate()
            if (r0 != r1) goto L24
            boolean r0 = r1.a()
            if (r0 == 0) goto L1e
            android.graphics.drawable.Drawable r0 = r1.f0
            r0.mutate()
            android.graphics.drawable.Drawable r0 = r1.g0
            r0.mutate()
            r0 = 1
            r1.d0 = r0
            return r1
        L1e:
            java.lang.String r1 = "One or more children of this LayerDrawable does not have constant state; this drawable cannot be mutated."
            defpackage.i.m(r1)
            r1 = 0
        L24:
            return r1
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(android.graphics.Rect r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f0
            r0.setBounds(r2)
            android.graphics.drawable.Drawable r1 = r1.g0
            r1.setBounds(r2)
            return
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(android.graphics.drawable.Drawable r1, java.lang.Runnable r2, long r3) {
            r0 = this;
            android.graphics.drawable.Drawable$Callback r1 = r0.getCallback()
            if (r1 == 0) goto L9
            r1.scheduleDrawable(r0, r2, r3)
        L9:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int r3) {
            r2 = this;
            int r0 = r2.Y
            int r1 = r2.R
            if (r0 != r1) goto L8
            r2.Y = r3
        L8:
            r2.R = r3
            r2.invalidateSelf()
            return
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(android.graphics.ColorFilter r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f0
            r0.setColorFilter(r2)
            android.graphics.drawable.Drawable r1 = r1.g0
            r1.setColorFilter(r2)
            return
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(android.graphics.drawable.Drawable r1, java.lang.Runnable r2) {
            r0 = this;
            android.graphics.drawable.Drawable$Callback r1 = r0.getCallback()
            if (r1 == 0) goto L9
            r1.unscheduleDrawable(r0, r2)
        L9:
            return
    }
}
