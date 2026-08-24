package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: cs  reason: default package */
/* loaded from: classes.dex */
public final class cs extends defpackage.ax3 implements defpackage.es {
    public final android.graphics.Rect A0;
    public int B0;
    public final /* synthetic */ defpackage.fs C0;
    public java.lang.CharSequence y0;
    public defpackage.zr z0;

    public cs(defpackage.fs r3, android.content.Context r4, android.util.AttributeSet r5) {
            r2 = this;
            r2.C0 = r3
            r0 = 2130969779(0x7f0404b3, float:1.754825E38)
            r1 = 0
            r2.<init>(r4, r5, r0, r1)
            android.graphics.Rect r4 = new android.graphics.Rect
            r4.<init>()
            r2.A0 = r4
            r2.k0 = r3
            r3 = 1
            r2.u0 = r3
            pr r4 = r2.v0
            r4.setFocusable(r3)
            as r3 = new as
            r3.<init>(r2, r1)
            r2.l0 = r3
            return
    }

    @Override // defpackage.es
    public final java.lang.CharSequence d() {
            r0 = this;
            java.lang.CharSequence r0 = r0.y0
            return r0
    }

    @Override // defpackage.es
    public final void g(java.lang.CharSequence r1) {
            r0 = this;
            r0.y0 = r1
            return
    }

    @Override // defpackage.es
    public final void k(int r1) {
            r0 = this;
            r0.B0 = r1
            return
    }

    @Override // defpackage.es
    public final void l(int r6, int r7) {
            r5 = this;
            pr r0 = r5.v0
            boolean r1 = r0.isShowing()
            r5.r()
            r2 = 2
            r0.setInputMethodMode(r2)
            r5.e()
            mp1 r2 = r5.L
            r3 = 1
            r2.setChoiceMode(r3)
            r2.setTextDirection(r6)
            r2.setTextAlignment(r7)
            fs r6 = r5.C0
            int r7 = r6.getSelectedItemPosition()
            mp1 r2 = r5.L
            boolean r4 = r0.isShowing()
            if (r4 == 0) goto L3c
            if (r2 == 0) goto L3c
            r4 = 0
            r2.setListSelectionHidden(r4)
            r2.setSelection(r7)
            int r4 = r2.getChoiceMode()
            if (r4 == 0) goto L3c
            r2.setItemChecked(r7, r3)
        L3c:
            if (r1 == 0) goto L3f
            goto L55
        L3f:
            android.view.ViewTreeObserver r6 = r6.getViewTreeObserver()
            if (r6 == 0) goto L55
            wr r7 = new wr
            r7.<init>(r5, r3)
            r6.addOnGlobalLayoutListener(r7)
            bs r6 = new bs
            r6.<init>(r5, r7)
            r0.setOnDismissListener(r6)
        L55:
            return
    }

    @Override // defpackage.ax3, defpackage.es
    public final void n(android.widget.ListAdapter r1) {
            r0 = this;
            super.n(r1)
            zr r1 = (defpackage.zr) r1
            r0.z0 = r1
            return
    }

    public final void r() {
            r10 = this;
            pr r0 = r10.v0
            android.graphics.drawable.Drawable r1 = r0.getBackground()
            fs r2 = r10.C0
            android.graphics.Rect r3 = r2.g0
            r4 = 1
            if (r1 == 0) goto L1f
            r1.getPadding(r3)
            boolean r1 = defpackage.eq7.a
            int r1 = r2.getLayoutDirection()
            if (r1 != r4) goto L1b
            int r1 = r3.right
            goto L24
        L1b:
            int r1 = r3.left
            int r1 = -r1
            goto L24
        L1f:
            r1 = 0
            r3.right = r1
            r3.left = r1
        L24:
            int r5 = r2.getPaddingLeft()
            int r6 = r2.getPaddingRight()
            int r7 = r2.getWidth()
            int r8 = r2.f0
            r9 = -2
            if (r8 != r9) goto L61
            zr r8 = r10.z0
            android.graphics.drawable.Drawable r0 = r0.getBackground()
            int r0 = r2.a(r8, r0)
            android.content.Context r8 = r2.getContext()
            android.content.res.Resources r8 = r8.getResources()
            android.util.DisplayMetrics r8 = r8.getDisplayMetrics()
            int r8 = r8.widthPixels
            int r9 = r3.left
            int r8 = r8 - r9
            int r3 = r3.right
            int r8 = r8 - r3
            if (r0 <= r8) goto L56
            r0 = r8
        L56:
            int r3 = r7 - r5
            int r3 = r3 - r6
            int r0 = java.lang.Math.max(r0, r3)
            r10.q(r0)
            goto L6e
        L61:
            r0 = -1
            if (r8 != r0) goto L6b
            int r0 = r7 - r5
            int r0 = r0 - r6
            r10.q(r0)
            goto L6e
        L6b:
            r10.q(r8)
        L6e:
            boolean r0 = defpackage.eq7.a
            int r0 = r2.getLayoutDirection()
            if (r0 != r4) goto L7f
            int r7 = r7 - r6
            int r0 = r10.X
            int r7 = r7 - r0
            int r0 = r10.B0
            int r7 = r7 - r0
            int r7 = r7 + r1
            goto L84
        L7f:
            int r0 = r10.B0
            int r5 = r5 + r0
            int r7 = r5 + r1
        L84:
            r10.Y = r7
            return
    }
}
