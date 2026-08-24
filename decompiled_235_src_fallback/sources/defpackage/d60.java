package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: d60  reason: default package */
/* loaded from: classes.dex */
public final class d60 implements android.view.View.OnLayoutChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ d60(java.lang.Object r1, int r2) {
            r0 = this;
            r0.a = r2
            r0.b = r1
            r0.<init>()
            return
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(android.view.View r1, int r2, int r3, int r4, int r5, int r6, int r7, int r8, int r9) {
            r0 = this;
            int r1 = r0.a
            switch(r1) {
                case 0: goto L69;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r0.b
            androidx.appcompat.widget.SearchView r0 = (androidx.appcompat.widget.SearchView) r0
            androidx.appcompat.widget.SearchView$SearchAutoComplete r1 = r0.o0
            android.view.View r2 = r0.w0
            int r3 = r2.getWidth()
            r4 = 1
            if (r3 <= r4) goto L68
            android.content.Context r3 = r0.getContext()
            android.content.res.Resources r3 = r3.getResources()
            android.view.View r5 = r0.q0
            int r5 = r5.getPaddingLeft()
            android.graphics.Rect r6 = new android.graphics.Rect
            r6.<init>()
            boolean r7 = defpackage.eq7.a
            int r7 = r0.getLayoutDirection()
            r8 = 0
            if (r7 != r4) goto L31
            goto L32
        L31:
            r4 = r8
        L32:
            boolean r0 = r0.M0
            if (r0 == 0) goto L46
            r0 = 2131165225(0x7f070029, float:1.7944661E38)
            int r0 = r3.getDimensionPixelSize(r0)
            r7 = 2131165226(0x7f07002a, float:1.7944663E38)
            int r3 = r3.getDimensionPixelSize(r7)
            int r8 = r3 + r0
        L46:
            android.graphics.drawable.Drawable r0 = r1.getDropDownBackground()
            r0.getPadding(r6)
            int r0 = r6.left
            if (r4 == 0) goto L53
            int r0 = -r0
            goto L56
        L53:
            int r0 = r0 + r8
            int r0 = r5 - r0
        L56:
            r1.setDropDownHorizontalOffset(r0)
            int r0 = r2.getWidth()
            int r2 = r6.left
            int r0 = r0 + r2
            int r2 = r6.right
            int r0 = r0 + r2
            int r0 = r0 + r8
            int r0 = r0 - r5
            r1.setDropDownWidth(r0)
        L68:
            return
        L69:
            r0 = 0
            throw r0
    }
}
