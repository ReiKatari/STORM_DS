package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: rr  reason: default package */
/* loaded from: classes.dex */
public final class rr extends android.widget.RatingBar {
    public final defpackage.u63 A;

    public rr(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 2130969682(0x7f040452, float:1.7548053E38)
            r1.<init>(r2, r3, r0)
            android.content.Context r2 = r1.getContext()
            defpackage.h57.a(r1, r2)
            u63 r2 = new u63
            r2.<init>(r1)
            r1.A = r2
            r2.r(r3, r0)
            return
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onMeasure(int r2, int r3) {
            r1 = this;
            monitor-enter(r1)
            super.onMeasure(r2, r3)     // Catch: java.lang.Throwable -> L22
            u63 r3 = r1.A     // Catch: java.lang.Throwable -> L22
            java.lang.Object r3 = r3.L     // Catch: java.lang.Throwable -> L22
            android.graphics.Bitmap r3 = (android.graphics.Bitmap) r3     // Catch: java.lang.Throwable -> L22
            if (r3 == 0) goto L24
            int r3 = r3.getWidth()     // Catch: java.lang.Throwable -> L22
            int r0 = r1.getNumStars()     // Catch: java.lang.Throwable -> L22
            int r3 = r3 * r0
            r0 = 0
            int r2 = android.view.View.resolveSizeAndState(r3, r2, r0)     // Catch: java.lang.Throwable -> L22
            int r3 = r1.getMeasuredHeight()     // Catch: java.lang.Throwable -> L22
            r1.setMeasuredDimension(r2, r3)     // Catch: java.lang.Throwable -> L22
            goto L24
        L22:
            r2 = move-exception
            goto L26
        L24:
            monitor-exit(r1)
            return
        L26:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L22
            throw r2
    }
}
