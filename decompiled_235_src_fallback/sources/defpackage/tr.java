package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: tr  reason: default package */
/* loaded from: classes.dex */
public final class tr extends android.widget.SeekBar {
    public final defpackage.ur A;

    public tr(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 2130969717(0x7f040475, float:1.7548124E38)
            r1.<init>(r2, r3, r0)
            android.content.Context r2 = r1.getContext()
            defpackage.h57.a(r1, r2)
            ur r2 = new ur
            r2.<init>(r1)
            r1.A = r2
            r2.r(r3, r0)
            return
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void drawableStateChanged() {
            r2 = this;
            super.drawableStateChanged()
            ur r2 = r2.A
            tr r0 = r2.Y
            android.graphics.drawable.Drawable r2 = r2.Z
            if (r2 == 0) goto L1e
            boolean r1 = r2.isStateful()
            if (r1 == 0) goto L1e
            int[] r1 = r0.getDrawableState()
            boolean r1 = r2.setState(r1)
            if (r1 == 0) goto L1e
            r0.invalidateDrawable(r2)
        L1e:
            return
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void jumpDrawablesToCurrentState() {
            r0 = this;
            super.jumpDrawablesToCurrentState()
            ur r0 = r0.A
            android.graphics.drawable.Drawable r0 = r0.Z
            if (r0 == 0) goto Lc
            r0.jumpToCurrentState()
        Lc:
            return
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(android.graphics.Canvas r2) {
            r1 = this;
            monitor-enter(r1)
            super.onDraw(r2)     // Catch: java.lang.Throwable -> Lb
            ur r0 = r1.A     // Catch: java.lang.Throwable -> Lb
            r0.K(r2)     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r1)
            return
        Lb:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lb
            throw r2
    }
}
