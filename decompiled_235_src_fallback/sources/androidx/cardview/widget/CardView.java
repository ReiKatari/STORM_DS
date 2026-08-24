package androidx.cardview.widget;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class CardView extends android.widget.FrameLayout {
    public static final int[] e0 = null;
    public boolean A;
    public boolean B;
    public final android.graphics.Rect L;
    public final android.graphics.Rect R;
    public final defpackage.u63 d0;

    static {
            r0 = 16842801(0x1010031, float:2.3693695E-38)
            int[] r0 = new int[]{r0}
            androidx.cardview.widget.CardView.e0 = r0
            return
    }

    public CardView(android.content.Context r10, android.util.AttributeSet r11) {
            r9 = this;
            r0 = 2130968751(0x7f0400af, float:1.7546164E38)
            r9.<init>(r10, r11, r0)
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r9.L = r1
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            r9.R = r2
            u63 r2 = new u63
            r3 = 20
            r2.<init>(r9, r3)
            r9.d0 = r2
            int[] r3 = defpackage.d75.a
            r4 = 2132017464(0x7f140138, float:1.9673207E38)
            android.content.res.TypedArray r10 = r10.obtainStyledAttributes(r11, r3, r0, r4)
            r11 = 2
            boolean r0 = r10.hasValue(r11)
            r3 = 3
            r4 = 0
            if (r0 == 0) goto L34
            android.content.res.ColorStateList r11 = r10.getColorStateList(r11)
            goto L6d
        L34:
            android.content.Context r0 = r9.getContext()
            int[] r5 = androidx.cardview.widget.CardView.e0
            android.content.res.TypedArray r0 = r0.obtainStyledAttributes(r5)
            int r5 = r0.getColor(r4, r4)
            r0.recycle()
            float[] r0 = new float[r3]
            android.graphics.Color.colorToHSV(r5, r0)
            r11 = r0[r11]
            r0 = 1056964608(0x3f000000, float:0.5)
            int r11 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r11 <= 0) goto L5e
            android.content.res.Resources r11 = r9.getResources()
            r0 = 2131099693(0x7f06002d, float:1.7811746E38)
            int r11 = r11.getColor(r0)
            goto L69
        L5e:
            android.content.res.Resources r11 = r9.getResources()
            r0 = 2131099692(0x7f06002c, float:1.7811744E38)
            int r11 = r11.getColor(r0)
        L69:
            android.content.res.ColorStateList r11 = android.content.res.ColorStateList.valueOf(r11)
        L6d:
            r0 = 0
            float r3 = r10.getDimension(r3, r0)
            r5 = 4
            float r5 = r10.getDimension(r5, r0)
            r6 = 5
            float r0 = r10.getDimension(r6, r0)
            r6 = 7
            boolean r6 = r10.getBoolean(r6, r4)
            r9.A = r6
            r6 = 6
            r7 = 1
            boolean r6 = r10.getBoolean(r6, r7)
            r9.B = r6
            r6 = 8
            int r6 = r10.getDimensionPixelSize(r6, r4)
            r8 = 10
            int r8 = r10.getDimensionPixelSize(r8, r6)
            r1.left = r8
            r8 = 12
            int r8 = r10.getDimensionPixelSize(r8, r6)
            r1.top = r8
            r8 = 11
            int r8 = r10.getDimensionPixelSize(r8, r6)
            r1.right = r8
            r8 = 9
            int r6 = r10.getDimensionPixelSize(r8, r6)
            r1.bottom = r6
            int r1 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r1 <= 0) goto Lb6
            r0 = r5
        Lb6:
            r10.getDimensionPixelSize(r4, r4)
            r10.getDimensionPixelSize(r7, r4)
            r10.recycle()
            v16 r10 = new v16
            r10.<init>(r11, r3)
            r2.B = r10
            r9.setBackgroundDrawable(r10)
            r9.setClipToOutline(r7)
            r9.setElevation(r5)
            defpackage.hv.Z(r2, r0)
            return
    }

    public static /* synthetic */ void a(androidx.cardview.widget.CardView r0, int r1, int r2, int r3, int r4) {
            super.setPadding(r1, r2, r3, r4)
            return
    }

    public android.content.res.ColorStateList getCardBackgroundColor() {
            r0 = this;
            u63 r0 = r0.d0
            java.lang.Object r0 = r0.B
            v16 r0 = (defpackage.v16) r0
            android.content.res.ColorStateList r0 = r0.h
            return r0
    }

    public float getCardElevation() {
            r0 = this;
            u63 r0 = r0.d0
            java.lang.Object r0 = r0.L
            androidx.cardview.widget.CardView r0 = (androidx.cardview.widget.CardView) r0
            float r0 = r0.getElevation()
            return r0
    }

    public int getContentPaddingBottom() {
            r0 = this;
            android.graphics.Rect r0 = r0.L
            int r0 = r0.bottom
            return r0
    }

    public int getContentPaddingLeft() {
            r0 = this;
            android.graphics.Rect r0 = r0.L
            int r0 = r0.left
            return r0
    }

    public int getContentPaddingRight() {
            r0 = this;
            android.graphics.Rect r0 = r0.L
            int r0 = r0.right
            return r0
    }

    public int getContentPaddingTop() {
            r0 = this;
            android.graphics.Rect r0 = r0.L
            int r0 = r0.top
            return r0
    }

    public float getMaxCardElevation() {
            r0 = this;
            u63 r0 = r0.d0
            java.lang.Object r0 = r0.B
            v16 r0 = (defpackage.v16) r0
            float r0 = r0.e
            return r0
    }

    public boolean getPreventCornerOverlap() {
            r0 = this;
            boolean r0 = r0.B
            return r0
    }

    public float getRadius() {
            r0 = this;
            u63 r0 = r0.d0
            java.lang.Object r0 = r0.B
            v16 r0 = (defpackage.v16) r0
            float r0 = r0.a
            return r0
    }

    public boolean getUseCompatPadding() {
            r0 = this;
            boolean r0 = r0.A
            return r0
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int r1, int r2) {
            r0 = this;
            super.onMeasure(r1, r2)
            return
    }

    public void setCardBackgroundColor(int r4) {
            r3 = this;
            android.content.res.ColorStateList r4 = android.content.res.ColorStateList.valueOf(r4)
            u63 r3 = r3.d0
            java.lang.Object r3 = r3.B
            v16 r3 = (defpackage.v16) r3
            if (r4 != 0) goto L14
            r3.getClass()
            r4 = 0
            android.content.res.ColorStateList r4 = android.content.res.ColorStateList.valueOf(r4)
        L14:
            r3.h = r4
            android.graphics.Paint r0 = r3.b
            int[] r1 = r3.getState()
            android.content.res.ColorStateList r2 = r3.h
            int r2 = r2.getDefaultColor()
            int r4 = r4.getColorForState(r1, r2)
            r0.setColor(r4)
            r3.invalidateSelf()
            return
    }

    public void setCardBackgroundColor(android.content.res.ColorStateList r4) {
            r3 = this;
            u63 r3 = r3.d0
            java.lang.Object r3 = r3.B
            v16 r3 = (defpackage.v16) r3
            if (r4 != 0) goto L10
            r3.getClass()
            r4 = 0
            android.content.res.ColorStateList r4 = android.content.res.ColorStateList.valueOf(r4)
        L10:
            r3.h = r4
            android.graphics.Paint r0 = r3.b
            int[] r1 = r3.getState()
            android.content.res.ColorStateList r2 = r3.h
            int r2 = r2.getDefaultColor()
            int r4 = r4.getColorForState(r1, r2)
            r0.setColor(r4)
            r3.invalidateSelf()
            return
    }

    public void setCardElevation(float r1) {
            r0 = this;
            u63 r0 = r0.d0
            java.lang.Object r0 = r0.L
            androidx.cardview.widget.CardView r0 = (androidx.cardview.widget.CardView) r0
            r0.setElevation(r1)
            return
    }

    public void setMaxCardElevation(float r1) {
            r0 = this;
            u63 r0 = r0.d0
            defpackage.hv.Z(r0, r1)
            return
    }

    @Override // android.view.View
    public void setMinimumHeight(int r1) {
            r0 = this;
            super.setMinimumHeight(r1)
            return
    }

    @Override // android.view.View
    public void setMinimumWidth(int r1) {
            r0 = this;
            super.setMinimumWidth(r1)
            return
    }

    @Override // android.view.View
    public final void setPadding(int r1, int r2, int r3, int r4) {
            r0 = this;
            return
    }

    @Override // android.view.View
    public final void setPaddingRelative(int r1, int r2, int r3, int r4) {
            r0 = this;
            return
    }

    public void setPreventCornerOverlap(boolean r2) {
            r1 = this;
            boolean r0 = r1.B
            if (r2 == r0) goto L11
            r1.B = r2
            u63 r1 = r1.d0
            java.lang.Object r2 = r1.B
            v16 r2 = (defpackage.v16) r2
            float r2 = r2.e
            defpackage.hv.Z(r1, r2)
        L11:
            return
    }

    public void setRadius(float r2) {
            r1 = this;
            u63 r1 = r1.d0
            java.lang.Object r1 = r1.B
            v16 r1 = (defpackage.v16) r1
            float r0 = r1.a
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 != 0) goto Ld
            return
        Ld:
            r1.a = r2
            r2 = 0
            r1.b(r2)
            r1.invalidateSelf()
            return
    }

    public void setUseCompatPadding(boolean r2) {
            r1 = this;
            boolean r0 = r1.A
            if (r0 == r2) goto L11
            r1.A = r2
            u63 r1 = r1.d0
            java.lang.Object r2 = r1.B
            v16 r2 = (defpackage.v16) r2
            float r2 = r2.e
            defpackage.hv.Z(r1, r2)
        L11:
            return
    }
}
