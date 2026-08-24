package androidx.preference.internal;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class PreferenceImageView extends android.widget.ImageView {
    public int A;
    public int B;

    public PreferenceImageView(android.content.Context r4, android.util.AttributeSet r5) {
            r3 = this;
            r0 = 0
            r3.<init>(r4, r5, r0)
            r1 = 2147483647(0x7fffffff, float:NaN)
            r3.A = r1
            r3.B = r1
            int[] r2 = defpackage.i75.j
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r5, r2, r0, r0)
            r5 = 3
            int r5 = r4.getDimensionPixelSize(r5, r1)
            r3.setMaxWidth(r5)
            r5 = 2
            int r5 = r4.getDimensionPixelSize(r5, r1)
            r3.setMaxHeight(r5)
            r4.recycle()
            return
    }

    @Override // android.widget.ImageView
    public int getMaxHeight() {
            r0 = this;
            int r0 = r0.B
            return r0
    }

    @Override // android.widget.ImageView
    public int getMaxWidth() {
            r0 = this;
            int r0 = r0.A
            return r0
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int r6, int r7) {
            r5 = this;
            int r0 = android.view.View.MeasureSpec.getMode(r6)
            r1 = 2147483647(0x7fffffff, float:NaN)
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r2) goto Ld
            if (r0 != 0) goto L1f
        Ld:
            int r3 = android.view.View.MeasureSpec.getSize(r6)
            int r4 = r5.getMaxWidth()
            if (r4 == r1) goto L1f
            if (r4 < r3) goto L1b
            if (r0 != 0) goto L1f
        L1b:
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r2)
        L1f:
            int r0 = android.view.View.MeasureSpec.getMode(r7)
            if (r0 == r2) goto L27
            if (r0 != 0) goto L39
        L27:
            int r3 = android.view.View.MeasureSpec.getSize(r7)
            int r4 = r5.getMaxHeight()
            if (r4 == r1) goto L39
            if (r4 < r3) goto L35
            if (r0 != 0) goto L39
        L35:
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r2)
        L39:
            super.onMeasure(r6, r7)
            return
    }

    @Override // android.widget.ImageView
    public void setMaxHeight(int r1) {
            r0 = this;
            r0.B = r1
            super.setMaxHeight(r1)
            return
    }

    @Override // android.widget.ImageView
    public void setMaxWidth(int r1) {
            r0 = this;
            r0.A = r1
            super.setMaxWidth(r1)
            return
    }
}
