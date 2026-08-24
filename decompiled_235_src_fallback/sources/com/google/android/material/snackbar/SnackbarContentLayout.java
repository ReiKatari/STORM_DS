package com.google.android.material.snackbar;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class SnackbarContentLayout extends android.widget.LinearLayout {
    public android.widget.TextView A;
    public android.widget.Button B;
    public int L;

    public SnackbarContentLayout(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r0 = 2130969539(0x7f0403c3, float:1.7547763E38)
            q92 r2 = defpackage.vo.b
            defpackage.kj2.X(r1, r0, r2)
            return
    }

    public final boolean a(int r3, int r4, int r5) {
            r2 = this;
            int r0 = r2.getOrientation()
            r1 = 1
            if (r3 == r0) goto Lc
            r2.setOrientation(r3)
            r3 = r1
            goto Ld
        Lc:
            r3 = 0
        Ld:
            android.widget.TextView r0 = r2.A
            int r0 = r0.getPaddingTop()
            if (r0 != r4) goto L1f
            android.widget.TextView r0 = r2.A
            int r0 = r0.getPaddingBottom()
            if (r0 == r5) goto L1e
            goto L1f
        L1e:
            return r3
        L1f:
            android.widget.TextView r2 = r2.A
            boolean r3 = r2.isPaddingRelative()
            if (r3 == 0) goto L33
            int r3 = r2.getPaddingStart()
            int r0 = r2.getPaddingEnd()
            r2.setPaddingRelative(r3, r4, r0, r5)
            return r1
        L33:
            int r3 = r2.getPaddingLeft()
            int r0 = r2.getPaddingRight()
            r2.setPadding(r3, r4, r0, r5)
            return r1
    }

    public android.widget.Button getActionView() {
            r0 = this;
            android.widget.Button r0 = r0.B
            return r0
    }

    public android.widget.TextView getMessageView() {
            r0 = this;
            android.widget.TextView r0 = r0.A
            return r0
    }

    @Override // android.view.View
    public final void onFinishInflate() {
            r1 = this;
            super.onFinishInflate()
            r0 = 2131427896(0x7f0b0238, float:1.8477421E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1.A = r0
            r0 = 2131427895(0x7f0b0237, float:1.847742E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.Button r0 = (android.widget.Button) r0
            r1.B = r0
            return
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int r8, int r9) {
            r7 = this;
            super.onMeasure(r8, r9)
            int r0 = r7.getOrientation()
            r1 = 1
            if (r0 != r1) goto Lb
            goto L59
        Lb:
            android.content.res.Resources r0 = r7.getResources()
            r2 = 2131165321(0x7f070089, float:1.7944856E38)
            int r0 = r0.getDimensionPixelSize(r2)
            android.content.res.Resources r2 = r7.getResources()
            r3 = 2131165320(0x7f070088, float:1.7944854E38)
            int r2 = r2.getDimensionPixelSize(r3)
            android.widget.TextView r3 = r7.A
            android.text.Layout r3 = r3.getLayout()
            r4 = 0
            if (r3 == 0) goto L32
            int r3 = r3.getLineCount()
            if (r3 <= r1) goto L32
            r3 = r1
            goto L33
        L32:
            r3 = r4
        L33:
            if (r3 == 0) goto L4c
            int r5 = r7.L
            if (r5 <= 0) goto L4c
            android.widget.Button r5 = r7.B
            int r5 = r5.getMeasuredWidth()
            int r6 = r7.L
            if (r5 <= r6) goto L4c
            int r2 = r0 - r2
            boolean r0 = r7.a(r1, r0, r2)
            if (r0 == 0) goto L59
            goto L56
        L4c:
            if (r3 == 0) goto L4f
            goto L50
        L4f:
            r0 = r2
        L50:
            boolean r0 = r7.a(r4, r0, r0)
            if (r0 == 0) goto L59
        L56:
            super.onMeasure(r8, r9)
        L59:
            return
    }

    public void setMaxInlineActionWidth(int r1) {
            r0 = this;
            r0.L = r1
            return
    }
}
