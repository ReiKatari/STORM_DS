package androidx.constraintlayout.helper.widget;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class Flow extends defpackage.qq7 {
    public defpackage.me2 i0;

    public Flow(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    @Override // defpackage.qq7, defpackage.l11
    public final void h(android.util.AttributeSet r8) {
            r7 = this;
            super.h(r8)
            me2 r0 = new me2
            r0.<init>()
            r7.i0 = r0
            if (r8 == 0) goto L192
            android.content.Context r0 = r7.getContext()
            int[] r1 = defpackage.e75.b
            android.content.res.TypedArray r8 = r0.obtainStyledAttributes(r8, r1)
            int r0 = r8.getIndexCount()
            r1 = 0
            r2 = r1
        L1c:
            if (r2 >= r0) goto L18f
            int r3 = r8.getIndex(r2)
            if (r3 != 0) goto L2e
            me2 r4 = r7.i0
            int r3 = r8.getInt(r3, r1)
            r4.Y0 = r3
            goto L18b
        L2e:
            r4 = 1
            if (r3 != r4) goto L41
            me2 r4 = r7.i0
            int r3 = r8.getDimensionPixelSize(r3, r1)
            r4.v0 = r3
            r4.w0 = r3
            r4.x0 = r3
            r4.y0 = r3
            goto L18b
        L41:
            r4 = 18
            if (r3 != r4) goto L53
            me2 r4 = r7.i0
            int r3 = r8.getDimensionPixelSize(r3, r1)
            r4.x0 = r3
            r4.z0 = r3
            r4.A0 = r3
            goto L18b
        L53:
            r4 = 19
            if (r3 != r4) goto L61
            me2 r4 = r7.i0
            int r3 = r8.getDimensionPixelSize(r3, r1)
            r4.y0 = r3
            goto L18b
        L61:
            r4 = 2
            if (r3 != r4) goto L6e
            me2 r4 = r7.i0
            int r3 = r8.getDimensionPixelSize(r3, r1)
            r4.z0 = r3
            goto L18b
        L6e:
            r5 = 3
            if (r3 != r5) goto L7b
            me2 r4 = r7.i0
            int r3 = r8.getDimensionPixelSize(r3, r1)
            r4.v0 = r3
            goto L18b
        L7b:
            r5 = 4
            if (r3 != r5) goto L88
            me2 r4 = r7.i0
            int r3 = r8.getDimensionPixelSize(r3, r1)
            r4.A0 = r3
            goto L18b
        L88:
            r5 = 5
            if (r3 != r5) goto L95
            me2 r4 = r7.i0
            int r3 = r8.getDimensionPixelSize(r3, r1)
            r4.w0 = r3
            goto L18b
        L95:
            r5 = 54
            if (r3 != r5) goto La3
            me2 r4 = r7.i0
            int r3 = r8.getInt(r3, r1)
            r4.W0 = r3
            goto L18b
        La3:
            r5 = 44
            if (r3 != r5) goto Lb1
            me2 r4 = r7.i0
            int r3 = r8.getInt(r3, r1)
            r4.G0 = r3
            goto L18b
        Lb1:
            r5 = 53
            if (r3 != r5) goto Lbf
            me2 r4 = r7.i0
            int r3 = r8.getInt(r3, r1)
            r4.H0 = r3
            goto L18b
        Lbf:
            r5 = 38
            if (r3 != r5) goto Lcd
            me2 r4 = r7.i0
            int r3 = r8.getInt(r3, r1)
            r4.I0 = r3
            goto L18b
        Lcd:
            r5 = 46
            if (r3 != r5) goto Ldb
            me2 r4 = r7.i0
            int r3 = r8.getInt(r3, r1)
            r4.K0 = r3
            goto L18b
        Ldb:
            r5 = 40
            if (r3 != r5) goto Le9
            me2 r4 = r7.i0
            int r3 = r8.getInt(r3, r1)
            r4.J0 = r3
            goto L18b
        Le9:
            r5 = 48
            if (r3 != r5) goto Lf7
            me2 r4 = r7.i0
            int r3 = r8.getInt(r3, r1)
            r4.L0 = r3
            goto L18b
        Lf7:
            r5 = 42
            r6 = 1056964608(0x3f000000, float:0.5)
            if (r3 != r5) goto L107
            me2 r4 = r7.i0
            float r3 = r8.getFloat(r3, r6)
            r4.M0 = r3
            goto L18b
        L107:
            r5 = 37
            if (r3 != r5) goto L115
            me2 r4 = r7.i0
            float r3 = r8.getFloat(r3, r6)
            r4.O0 = r3
            goto L18b
        L115:
            r5 = 45
            if (r3 != r5) goto L123
            me2 r4 = r7.i0
            float r3 = r8.getFloat(r3, r6)
            r4.Q0 = r3
            goto L18b
        L123:
            r5 = 39
            if (r3 != r5) goto L130
            me2 r4 = r7.i0
            float r3 = r8.getFloat(r3, r6)
            r4.P0 = r3
            goto L18b
        L130:
            r5 = 47
            if (r3 != r5) goto L13d
            me2 r4 = r7.i0
            float r3 = r8.getFloat(r3, r6)
            r4.R0 = r3
            goto L18b
        L13d:
            r5 = 51
            if (r3 != r5) goto L14a
            me2 r4 = r7.i0
            float r3 = r8.getFloat(r3, r6)
            r4.N0 = r3
            goto L18b
        L14a:
            r5 = 41
            if (r3 != r5) goto L157
            me2 r5 = r7.i0
            int r3 = r8.getInt(r3, r4)
            r5.U0 = r3
            goto L18b
        L157:
            r5 = 50
            if (r3 != r5) goto L164
            me2 r5 = r7.i0
            int r3 = r8.getInt(r3, r4)
            r5.V0 = r3
            goto L18b
        L164:
            r4 = 43
            if (r3 != r4) goto L171
            me2 r4 = r7.i0
            int r3 = r8.getDimensionPixelSize(r3, r1)
            r4.S0 = r3
            goto L18b
        L171:
            r4 = 52
            if (r3 != r4) goto L17e
            me2 r4 = r7.i0
            int r3 = r8.getDimensionPixelSize(r3, r1)
            r4.T0 = r3
            goto L18b
        L17e:
            r4 = 49
            if (r3 != r4) goto L18b
            me2 r4 = r7.i0
            r5 = -1
            int r3 = r8.getInt(r3, r5)
            r4.X0 = r3
        L18b:
            int r2 = r2 + 1
            goto L1c
        L18f:
            r8.recycle()
        L192:
            me2 r8 = r7.i0
            r7.R = r8
            r7.k()
            return
    }

    @Override // defpackage.l11
    public final void i(defpackage.u11 r1, defpackage.gx2 r2, defpackage.o21 r3, android.util.SparseArray r4) {
            r0 = this;
            super.i(r1, r2, r3, r4)
            boolean r0 = r2 instanceof defpackage.me2
            if (r0 == 0) goto L10
            me2 r2 = (defpackage.me2) r2
            int r0 = r3.V
            r1 = -1
            if (r0 == r1) goto L10
            r2.Y0 = r0
        L10:
            return
    }

    @Override // defpackage.l11
    public final void j(defpackage.l21 r2, boolean r3) {
            r1 = this;
            me2 r1 = r1.i0
            int r2 = r1.x0
            if (r2 > 0) goto Lc
            int r0 = r1.y0
            if (r0 <= 0) goto Lb
            goto Lc
        Lb:
            return
        Lc:
            if (r3 == 0) goto L15
            int r3 = r1.y0
            r1.z0 = r3
            r1.A0 = r2
            return
        L15:
            r1.z0 = r2
            int r2 = r1.y0
            r1.A0 = r2
            return
    }

    @Override // defpackage.qq7
    public final void l(defpackage.rq7 r3, int r4, int r5) {
            r2 = this;
            int r0 = android.view.View.MeasureSpec.getMode(r4)
            int r4 = android.view.View.MeasureSpec.getSize(r4)
            int r1 = android.view.View.MeasureSpec.getMode(r5)
            int r5 = android.view.View.MeasureSpec.getSize(r5)
            if (r3 == 0) goto L1d
            r3.V(r0, r4, r1, r5)
            int r4 = r3.C0
            int r3 = r3.D0
            r2.setMeasuredDimension(r4, r3)
            return
        L1d:
            r3 = 0
            r2.setMeasuredDimension(r3, r3)
            return
    }

    @Override // defpackage.l11, android.view.View
    public final void onMeasure(int r2, int r3) {
            r1 = this;
            me2 r0 = r1.i0
            r1.l(r0, r2, r3)
            return
    }

    public void setFirstHorizontalBias(float r2) {
            r1 = this;
            me2 r0 = r1.i0
            r0.O0 = r2
            r1.requestLayout()
            return
    }

    public void setFirstHorizontalStyle(int r2) {
            r1 = this;
            me2 r0 = r1.i0
            r0.I0 = r2
            r1.requestLayout()
            return
    }

    public void setFirstVerticalBias(float r2) {
            r1 = this;
            me2 r0 = r1.i0
            r0.P0 = r2
            r1.requestLayout()
            return
    }

    public void setFirstVerticalStyle(int r2) {
            r1 = this;
            me2 r0 = r1.i0
            r0.J0 = r2
            r1.requestLayout()
            return
    }

    public void setHorizontalAlign(int r2) {
            r1 = this;
            me2 r0 = r1.i0
            r0.U0 = r2
            r1.requestLayout()
            return
    }

    public void setHorizontalBias(float r2) {
            r1 = this;
            me2 r0 = r1.i0
            r0.M0 = r2
            r1.requestLayout()
            return
    }

    public void setHorizontalGap(int r2) {
            r1 = this;
            me2 r0 = r1.i0
            r0.S0 = r2
            r1.requestLayout()
            return
    }

    public void setHorizontalStyle(int r2) {
            r1 = this;
            me2 r0 = r1.i0
            r0.G0 = r2
            r1.requestLayout()
            return
    }

    public void setLastHorizontalBias(float r2) {
            r1 = this;
            me2 r0 = r1.i0
            r0.Q0 = r2
            r1.requestLayout()
            return
    }

    public void setLastHorizontalStyle(int r2) {
            r1 = this;
            me2 r0 = r1.i0
            r0.K0 = r2
            r1.requestLayout()
            return
    }

    public void setLastVerticalBias(float r2) {
            r1 = this;
            me2 r0 = r1.i0
            r0.R0 = r2
            r1.requestLayout()
            return
    }

    public void setLastVerticalStyle(int r2) {
            r1 = this;
            me2 r0 = r1.i0
            r0.L0 = r2
            r1.requestLayout()
            return
    }

    public void setMaxElementsWrap(int r2) {
            r1 = this;
            me2 r0 = r1.i0
            r0.X0 = r2
            r1.requestLayout()
            return
    }

    public void setOrientation(int r2) {
            r1 = this;
            me2 r0 = r1.i0
            r0.Y0 = r2
            r1.requestLayout()
            return
    }

    public void setPadding(int r2) {
            r1 = this;
            me2 r0 = r1.i0
            r0.v0 = r2
            r0.w0 = r2
            r0.x0 = r2
            r0.y0 = r2
            r1.requestLayout()
            return
    }

    public void setPaddingBottom(int r2) {
            r1 = this;
            me2 r0 = r1.i0
            r0.w0 = r2
            r1.requestLayout()
            return
    }

    public void setPaddingLeft(int r2) {
            r1 = this;
            me2 r0 = r1.i0
            r0.z0 = r2
            r1.requestLayout()
            return
    }

    public void setPaddingRight(int r2) {
            r1 = this;
            me2 r0 = r1.i0
            r0.A0 = r2
            r1.requestLayout()
            return
    }

    public void setPaddingTop(int r2) {
            r1 = this;
            me2 r0 = r1.i0
            r0.v0 = r2
            r1.requestLayout()
            return
    }

    public void setVerticalAlign(int r2) {
            r1 = this;
            me2 r0 = r1.i0
            r0.V0 = r2
            r1.requestLayout()
            return
    }

    public void setVerticalBias(float r2) {
            r1 = this;
            me2 r0 = r1.i0
            r0.N0 = r2
            r1.requestLayout()
            return
    }

    public void setVerticalGap(int r2) {
            r1 = this;
            me2 r0 = r1.i0
            r0.T0 = r2
            r1.requestLayout()
            return
    }

    public void setVerticalStyle(int r2) {
            r1 = this;
            me2 r0 = r1.i0
            r0.H0 = r2
            r1.requestLayout()
            return
    }

    public void setWrapMode(int r2) {
            r1 = this;
            me2 r0 = r1.i0
            r0.W0 = r2
            r1.requestLayout()
            return
    }
}
