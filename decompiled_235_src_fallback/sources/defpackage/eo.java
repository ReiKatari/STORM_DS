package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: eo  reason: default package */
/* loaded from: classes.dex */
public final class eo extends defpackage.sk7 implements android.graphics.drawable.Animatable {
    public final defpackage.bo B;
    public final android.content.Context L;
    public defpackage.s7 R;
    public java.util.ArrayList X;
    public final defpackage.ao Y;

    public eo(android.content.Context r3) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.R = r0
            r2.X = r0
            ao r0 = new ao
            r1 = 0
            r0.<init>(r2, r1)
            r2.Y = r0
            r2.L = r3
            bo r3 = new bo
            r3.<init>()
            r2.B = r3
            return
    }

    @Override // defpackage.sk7, android.graphics.drawable.Drawable
    public final void applyTheme(android.content.res.Resources.Theme r1) {
            r0 = this;
            android.graphics.drawable.Drawable r0 = r0.A
            if (r0 == 0) goto L7
            r0.applyTheme(r1)
        L7:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
            r0 = this;
            android.graphics.drawable.Drawable r0 = r0.A
            if (r0 == 0) goto L9
            boolean r0 = r0.canApplyTheme()
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(android.graphics.Canvas r3) {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.A
            if (r0 == 0) goto L8
            r0.draw(r3)
            return
        L8:
            bo r0 = r2.B
            bl7 r1 = r0.a
            r1.draw(r3)
            android.animation.AnimatorSet r3 = r0.b
            boolean r3 = r3.isStarted()
            if (r3 == 0) goto L1a
            r2.invalidateSelf()
        L1a:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.A
            if (r0 == 0) goto L9
            int r1 = r0.getAlpha()
            return r1
        L9:
            bo r1 = r1.B
            bl7 r1 = r1.a
            int r1 = r1.getAlpha()
            return r1
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.A
            if (r0 == 0) goto L9
            int r1 = r0.getChangingConfigurations()
            return r1
        L9:
            int r0 = super.getChangingConfigurations()
            bo r1 = r1.B
            r1.getClass()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public final android.graphics.ColorFilter getColorFilter() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.A
            if (r0 == 0) goto L9
            android.graphics.ColorFilter r1 = r0.getColorFilter()
            return r1
        L9:
            bo r1 = r1.B
            bl7 r1 = r1.a
            android.graphics.ColorFilter r1 = r1.getColorFilter()
            return r1
    }

    @Override // android.graphics.drawable.Drawable
    public final android.graphics.drawable.Drawable.ConstantState getConstantState() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.A
            if (r0 == 0) goto L10
            co r0 = new co
            android.graphics.drawable.Drawable r1 = r1.A
            android.graphics.drawable.Drawable$ConstantState r1 = r1.getConstantState()
            r0.<init>(r1)
            return r0
        L10:
            r1 = 0
            return r1
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.A
            if (r0 == 0) goto L9
            int r1 = r0.getIntrinsicHeight()
            return r1
        L9:
            bo r1 = r1.B
            bl7 r1 = r1.a
            int r1 = r1.getIntrinsicHeight()
            return r1
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.A
            if (r0 == 0) goto L9
            int r1 = r0.getIntrinsicWidth()
            return r1
        L9:
            bo r1 = r1.B
            bl7 r1 = r1.a
            int r1 = r1.getIntrinsicWidth()
            return r1
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.A
            if (r0 == 0) goto L9
            int r1 = r0.getOpacity()
            return r1
        L9:
            bo r1 = r1.B
            bl7 r1 = r1.a
            int r1 = r1.getOpacity()
            return r1
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(android.content.res.Resources r2, org.xmlpull.v1.XmlPullParser r3, android.util.AttributeSet r4) {
            r1 = this;
            r0 = 0
            r1.inflate(r2, r3, r4, r0)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(android.content.res.Resources r9, org.xmlpull.v1.XmlPullParser r10, android.util.AttributeSet r11, android.content.res.Resources.Theme r12) {
            r8 = this;
            android.graphics.drawable.Drawable r0 = r8.A
            if (r0 == 0) goto L8
            r0.inflate(r9, r10, r11, r12)
            return
        L8:
            int r0 = r10.getEventType()
            int r1 = r10.getDepth()
            r2 = 1
            int r1 = r1 + r2
        L12:
            bo r3 = r8.B
            if (r0 == r2) goto Lc6
            int r4 = r10.getDepth()
            if (r4 >= r1) goto L1f
            r4 = 3
            if (r0 == r4) goto Lc6
        L1f:
            r4 = 2
            if (r0 != r4) goto Lc0
            java.lang.String r0 = r10.getName()
            java.lang.String r4 = "animated-vector"
            boolean r4 = r4.equals(r0)
            r5 = 0
            if (r4 == 0) goto L68
            int[] r0 = defpackage.jw2.e
            android.content.res.TypedArray r0 = defpackage.xk2.D(r9, r12, r11, r0)
            int r4 = r0.getResourceId(r5, r5)
            if (r4 == 0) goto L64
            bl7 r6 = new bl7
            r6.<init>()
            java.lang.ThreadLocal r7 = defpackage.sl5.a
            android.graphics.drawable.Drawable r4 = r9.getDrawable(r4, r12)
            r6.A = r4
            al7 r4 = new al7
            android.graphics.drawable.Drawable r7 = r6.A
            android.graphics.drawable.Drawable$ConstantState r7 = r7.getConstantState()
            r4.<init>(r7)
            r6.Y = r5
            ao r4 = r8.Y
            r6.setCallback(r4)
            bl7 r4 = r3.a
            if (r4 == 0) goto L62
            r5 = 0
            r4.setCallback(r5)
        L62:
            r3.a = r6
        L64:
            r0.recycle()
            goto Lc0
        L68:
            java.lang.String r4 = "target"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto Lc0
            int[] r0 = defpackage.jw2.f
            android.content.res.TypedArray r0 = r9.obtainAttributes(r11, r0)
            java.lang.String r4 = r0.getString(r5)
            int r6 = r0.getResourceId(r2, r5)
            if (r6 == 0) goto Lbd
            android.content.Context r7 = r8.L
            if (r7 == 0) goto Lb4
            android.animation.Animator r6 = android.animation.AnimatorInflater.loadAnimator(r7, r6)
            bl7 r7 = r3.a
            zk7 r7 = r7.B
            yk7 r7 = r7.b
            wu r7 = r7.o
            java.lang.Object r7 = r7.get(r4)
            r6.setTarget(r7)
            java.util.ArrayList r7 = r3.c
            if (r7 != 0) goto La9
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r3.c = r7
            wu r7 = new wu
            r7.<init>(r5)
            r3.d = r7
        La9:
            java.util.ArrayList r5 = r3.c
            r5.add(r6)
            wu r3 = r3.d
            r3.put(r6, r4)
            goto Lbd
        Lb4:
            r0.recycle()
            java.lang.String r8 = "Context can't be null when inflating animators"
            defpackage.i.m(r8)
            return
        Lbd:
            r0.recycle()
        Lc0:
            int r0 = r10.next()
            goto L12
        Lc6:
            android.animation.AnimatorSet r8 = r3.b
            if (r8 != 0) goto Ld1
            android.animation.AnimatorSet r8 = new android.animation.AnimatorSet
            r8.<init>()
            r3.b = r8
        Ld1:
            android.animation.AnimatorSet r8 = r3.b
            java.util.ArrayList r9 = r3.c
            r8.playTogether(r9)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.A
            if (r0 == 0) goto L9
            boolean r1 = r0.isAutoMirrored()
            return r1
        L9:
            bo r1 = r1.B
            bl7 r1 = r1.a
            boolean r1 = r1.isAutoMirrored()
            return r1
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.A
            if (r0 == 0) goto Lb
            android.graphics.drawable.AnimatedVectorDrawable r0 = (android.graphics.drawable.AnimatedVectorDrawable) r0
            boolean r1 = r0.isRunning()
            return r1
        Lb:
            bo r1 = r1.B
            android.animation.AnimatorSet r1 = r1.b
            boolean r1 = r1.isRunning()
            return r1
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.A
            if (r0 == 0) goto L9
            boolean r1 = r0.isStateful()
            return r1
        L9:
            bo r1 = r1.B
            bl7 r1 = r1.a
            boolean r1 = r1.isStateful()
            return r1
    }

    @Override // android.graphics.drawable.Drawable
    public final android.graphics.drawable.Drawable mutate() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.A
            if (r0 == 0) goto L7
            r0.mutate()
        L7:
            return r1
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(android.graphics.Rect r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.A
            if (r0 == 0) goto L8
            r0.setBounds(r2)
            return
        L8:
            bo r1 = r1.B
            bl7 r1 = r1.a
            r1.setBounds(r2)
            return
    }

    @Override // defpackage.sk7, android.graphics.drawable.Drawable
    public final boolean onLevelChange(int r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.A
            if (r0 == 0) goto L9
            boolean r1 = r0.setLevel(r2)
            return r1
        L9:
            bo r1 = r1.B
            bl7 r1 = r1.a
            boolean r1 = r1.setLevel(r2)
            return r1
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.A
            if (r0 == 0) goto L9
            boolean r1 = r0.setState(r2)
            return r1
        L9:
            bo r1 = r1.B
            bl7 r1 = r1.a
            boolean r1 = r1.setState(r2)
            return r1
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.A
            if (r0 == 0) goto L8
            r0.setAlpha(r2)
            return
        L8:
            bo r1 = r1.B
            bl7 r1 = r1.a
            r1.setAlpha(r2)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.A
            if (r0 == 0) goto L8
            r0.setAutoMirrored(r2)
            return
        L8:
            bo r1 = r1.B
            bl7 r1 = r1.a
            r1.setAutoMirrored(r2)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(android.graphics.ColorFilter r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.A
            if (r0 == 0) goto L8
            r0.setColorFilter(r2)
            return
        L8:
            bo r1 = r1.B
            bl7 r1 = r1.a
            r1.setColorFilter(r2)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.A
            if (r0 == 0) goto L8
            r0.setTint(r2)
            return
        L8:
            bo r1 = r1.B
            bl7 r1 = r1.a
            r1.setTint(r2)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(android.content.res.ColorStateList r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.A
            if (r0 == 0) goto L8
            r0.setTintList(r2)
            return
        L8:
            bo r1 = r1.B
            bl7 r1 = r1.a
            r1.setTintList(r2)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(android.graphics.PorterDuff.Mode r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.A
            if (r0 == 0) goto L8
            r0.setTintMode(r2)
            return
        L8:
            bo r1 = r1.B
            bl7 r1 = r1.a
            r1.setTintMode(r2)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean r2, boolean r3) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.A
            if (r0 == 0) goto L9
            boolean r1 = r0.setVisible(r2, r3)
            return r1
        L9:
            bo r0 = r1.B
            bl7 r0 = r0.a
            r0.setVisible(r2, r3)
            boolean r1 = super.setVisible(r2, r3)
            return r1
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.A
            if (r0 == 0) goto La
            android.graphics.drawable.AnimatedVectorDrawable r0 = (android.graphics.drawable.AnimatedVectorDrawable) r0
            r0.start()
            return
        La:
            bo r0 = r2.B
            android.animation.AnimatorSet r1 = r0.b
            boolean r1 = r1.isStarted()
            if (r1 == 0) goto L15
            return
        L15:
            android.animation.AnimatorSet r0 = r0.b
            r0.start()
            r2.invalidateSelf()
            return
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.A
            if (r0 == 0) goto La
            android.graphics.drawable.AnimatedVectorDrawable r0 = (android.graphics.drawable.AnimatedVectorDrawable) r0
            r0.stop()
            return
        La:
            bo r1 = r1.B
            android.animation.AnimatorSet r1 = r1.b
            r1.end()
            return
    }
}
