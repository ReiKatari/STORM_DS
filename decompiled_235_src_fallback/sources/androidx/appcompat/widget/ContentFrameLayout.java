package androidx.appcompat.widget;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class ContentFrameLayout extends android.widget.FrameLayout {
    public android.util.TypedValue A;
    public android.util.TypedValue B;
    public android.util.TypedValue L;
    public android.util.TypedValue R;
    public android.util.TypedValue d0;
    public android.util.TypedValue e0;
    public final android.graphics.Rect f0;
    public defpackage.k31 g0;

    public ContentFrameLayout(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            r1.f0 = r2
            return
    }

    public android.util.TypedValue getFixedHeightMajor() {
            r1 = this;
            android.util.TypedValue r0 = r1.d0
            if (r0 != 0) goto Lb
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            r1.d0 = r0
        Lb:
            android.util.TypedValue r1 = r1.d0
            return r1
    }

    public android.util.TypedValue getFixedHeightMinor() {
            r1 = this;
            android.util.TypedValue r0 = r1.e0
            if (r0 != 0) goto Lb
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            r1.e0 = r0
        Lb:
            android.util.TypedValue r1 = r1.e0
            return r1
    }

    public android.util.TypedValue getFixedWidthMajor() {
            r1 = this;
            android.util.TypedValue r0 = r1.L
            if (r0 != 0) goto Lb
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            r1.L = r0
        Lb:
            android.util.TypedValue r1 = r1.L
            return r1
    }

    public android.util.TypedValue getFixedWidthMinor() {
            r1 = this;
            android.util.TypedValue r0 = r1.R
            if (r0 != 0) goto Lb
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            r1.R = r0
        Lb:
            android.util.TypedValue r1 = r1.R
            return r1
    }

    public android.util.TypedValue getMinWidthMajor() {
            r1 = this;
            android.util.TypedValue r0 = r1.A
            if (r0 != 0) goto Lb
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            r1.A = r0
        Lb:
            android.util.TypedValue r1 = r1.A
            return r1
    }

    public android.util.TypedValue getMinWidthMinor() {
            r1 = this;
            android.util.TypedValue r0 = r1.B
            if (r0 != 0) goto Lb
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            r1.B = r0
        Lb:
            android.util.TypedValue r1 = r1.B
            return r1
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
            r0 = this;
            super.onAttachedToWindow()
            k31 r0 = r0.g0
            if (r0 == 0) goto La
            r0.getClass()
        La:
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
            r2 = this;
            super.onDetachedFromWindow()
            k31 r2 = r2.g0
            if (r2 == 0) goto L65
            vq r2 = (defpackage.vq) r2
            fr r2 = r2.B
            androidx.appcompat.widget.ActionBarOverlayLayout r0 = r2.m0
            if (r0 == 0) goto L32
            r0.k()
            tc1 r0 = r0.d0
            l87 r0 = (defpackage.l87) r0
            androidx.appcompat.widget.Toolbar r0 = r0.a
            androidx.appcompat.widget.ActionMenuView r0 = r0.A
            if (r0 == 0) goto L32
            g8 r0 = r0.s0
            if (r0 == 0) goto L32
            r0.e()
            d8 r0 = r0.p0
            if (r0 == 0) goto L32
            boolean r1 = r0.b()
            if (r1 == 0) goto L32
            t44 r0 = r0.i
            r0.dismiss()
        L32:
            android.widget.PopupWindow r0 = r2.r0
            if (r0 == 0) goto L51
            android.view.Window r0 = r2.h0
            android.view.View r0 = r0.getDecorView()
            uq r1 = r2.s0
            r0.removeCallbacks(r1)
            android.widget.PopupWindow r0 = r2.r0
            boolean r0 = r0.isShowing()
            if (r0 == 0) goto L4e
            android.widget.PopupWindow r0 = r2.r0     // Catch: java.lang.IllegalArgumentException -> L4e
            r0.dismiss()     // Catch: java.lang.IllegalArgumentException -> L4e
        L4e:
            r0 = 0
            r2.r0 = r0
        L51:
            ip7 r0 = r2.t0
            if (r0 == 0) goto L58
            r0.b()
        L58:
            r0 = 0
            er r2 = r2.C(r0)
            i44 r2 = r2.h
            if (r2 == 0) goto L65
            r0 = 1
            r2.c(r0)
        L65:
            return
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int r17, int r18) {
            r16 = this;
            r0 = r16
            android.content.Context r1 = r0.getContext()
            android.content.res.Resources r1 = r1.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            int r2 = r1.widthPixels
            int r3 = r1.heightPixels
            r4 = 1
            r5 = 0
            if (r2 >= r3) goto L18
            r2 = r4
            goto L19
        L18:
            r2 = r5
        L19:
            int r3 = android.view.View.MeasureSpec.getMode(r17)
            int r6 = android.view.View.MeasureSpec.getMode(r18)
            android.graphics.Rect r7 = r0.f0
            r8 = 6
            r9 = 5
            r10 = -2147483648(0xffffffff80000000, float:-0.0)
            r11 = 1073741824(0x40000000, float:2.0)
            if (r3 != r10) goto L62
            if (r2 == 0) goto L30
            android.util.TypedValue r12 = r0.R
            goto L32
        L30:
            android.util.TypedValue r12 = r0.L
        L32:
            if (r12 == 0) goto L62
            int r13 = r12.type
            if (r13 == 0) goto L62
            if (r13 != r9) goto L40
            float r12 = r12.getDimension(r1)
        L3e:
            int r12 = (int) r12
            goto L4c
        L40:
            if (r13 != r8) goto L4b
            int r13 = r1.widthPixels
            float r14 = (float) r13
            float r13 = (float) r13
            float r12 = r12.getFraction(r14, r13)
            goto L3e
        L4b:
            r12 = r5
        L4c:
            if (r12 <= 0) goto L62
            int r13 = r7.left
            int r14 = r7.right
            int r13 = r13 + r14
            int r12 = r12 - r13
            int r13 = android.view.View.MeasureSpec.getSize(r17)
            int r12 = java.lang.Math.min(r12, r13)
            int r12 = android.view.View.MeasureSpec.makeMeasureSpec(r12, r11)
            r13 = r4
            goto L65
        L62:
            r12 = r17
            r13 = r5
        L65:
            if (r6 != r10) goto L9d
            if (r2 == 0) goto L6c
            android.util.TypedValue r6 = r0.d0
            goto L6e
        L6c:
            android.util.TypedValue r6 = r0.e0
        L6e:
            if (r6 == 0) goto L9d
            int r14 = r6.type
            if (r14 == 0) goto L9d
            if (r14 != r9) goto L7c
            float r6 = r6.getDimension(r1)
        L7a:
            int r6 = (int) r6
            goto L88
        L7c:
            if (r14 != r8) goto L87
            int r14 = r1.heightPixels
            float r15 = (float) r14
            float r14 = (float) r14
            float r6 = r6.getFraction(r15, r14)
            goto L7a
        L87:
            r6 = r5
        L88:
            if (r6 <= 0) goto L9d
            int r14 = r7.top
            int r15 = r7.bottom
            int r14 = r14 + r15
            int r6 = r6 - r14
            int r14 = android.view.View.MeasureSpec.getSize(r18)
            int r6 = java.lang.Math.min(r6, r14)
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r11)
            goto L9f
        L9d:
            r6 = r18
        L9f:
            super.onMeasure(r12, r6)
            int r12 = r0.getMeasuredWidth()
            int r14 = android.view.View.MeasureSpec.makeMeasureSpec(r12, r11)
            if (r13 != 0) goto Lde
            if (r3 != r10) goto Lde
            if (r2 == 0) goto Lb3
            android.util.TypedValue r2 = r0.B
            goto Lb5
        Lb3:
            android.util.TypedValue r2 = r0.A
        Lb5:
            if (r2 == 0) goto Lde
            int r3 = r2.type
            if (r3 == 0) goto Lde
            if (r3 != r9) goto Lc3
            float r1 = r2.getDimension(r1)
        Lc1:
            int r1 = (int) r1
            goto Lcf
        Lc3:
            if (r3 != r8) goto Lce
            int r1 = r1.widthPixels
            float r3 = (float) r1
            float r1 = (float) r1
            float r1 = r2.getFraction(r3, r1)
            goto Lc1
        Lce:
            r1 = r5
        Lcf:
            if (r1 <= 0) goto Ld7
            int r2 = r7.left
            int r3 = r7.right
            int r2 = r2 + r3
            int r1 = r1 - r2
        Ld7:
            if (r12 >= r1) goto Lde
            int r14 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r11)
            goto Ldf
        Lde:
            r4 = r5
        Ldf:
            if (r4 == 0) goto Le4
            super.onMeasure(r14, r6)
        Le4:
            return
    }

    public void setAttachListener(defpackage.k31 r1) {
            r0 = this;
            r0.g0 = r1
            return
    }
}
