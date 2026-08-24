package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: o14  reason: default package */
/* loaded from: classes.dex */
public final class o14 extends android.widget.ArrayAdapter {
    public android.content.res.ColorStateList A;
    public android.content.res.ColorStateList B;
    public final /* synthetic */ defpackage.p14 L;

    public o14(defpackage.p14 r1, android.content.Context r2, int r3, java.lang.String[] r4) {
            r0 = this;
            r0.L = r1
            r0.<init>(r2, r3, r4)
            r0.a()
            return
    }

    public final void a() {
            r7 = this;
            p14 r0 = r7.L
            android.content.res.ColorStateList r1 = r0.k0
            r2 = 0
            r3 = 0
            if (r1 == 0) goto L23
            r4 = 16842919(0x10100a7, float:2.3694026E-38)
            int[] r4 = new int[]{r4}
            int r1 = r1.getColorForState(r4, r3)
            int[] r1 = new int[]{r1, r3}
            int[] r5 = new int[r3]
            int[][] r4 = new int[][]{r4, r5}
            android.content.res.ColorStateList r5 = new android.content.res.ColorStateList
            r5.<init>(r4, r1)
            goto L24
        L23:
            r5 = r2
        L24:
            r7.B = r5
            int r1 = r0.j0
            if (r1 == 0) goto L68
            android.content.res.ColorStateList r1 = r0.k0
            if (r1 == 0) goto L68
            r1 = 16843623(0x1010367, float:2.3696E-38)
            r2 = -16842919(0xfffffffffefeff59, float:-1.6947488E38)
            int[] r1 = new int[]{r1, r2}
            r4 = 16842913(0x10100a1, float:2.369401E-38)
            int[] r2 = new int[]{r4, r2}
            android.content.res.ColorStateList r4 = r0.k0
            int r4 = r4.getColorForState(r2, r3)
            android.content.res.ColorStateList r5 = r0.k0
            int r5 = r5.getColorForState(r1, r3)
            int r6 = r0.j0
            int r4 = defpackage.tt0.b(r4, r6)
            int r6 = r0.j0
            int r5 = defpackage.tt0.b(r5, r6)
            int r0 = r0.j0
            int[] r0 = new int[]{r4, r5, r0}
            int[] r3 = new int[r3]
            int[][] r1 = new int[][]{r2, r1, r3}
            android.content.res.ColorStateList r2 = new android.content.res.ColorStateList
            r2.<init>(r1, r0)
        L68:
            r7.A = r2
            return
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final android.view.View getView(int r3, android.view.View r4, android.view.ViewGroup r5) {
            r2 = this;
            android.view.View r3 = super.getView(r3, r4, r5)
            boolean r4 = r3 instanceof android.widget.TextView
            if (r4 == 0) goto L41
            r4 = r3
            android.widget.TextView r4 = (android.widget.TextView) r4
            p14 r5 = r2.L
            android.text.Editable r0 = r5.getText()
            java.lang.String r0 = r0.toString()
            java.lang.CharSequence r1 = r4.getText()
            boolean r0 = r0.contentEquals(r1)
            r1 = 0
            if (r0 == 0) goto L3e
            int r0 = r5.j0
            if (r0 == 0) goto L3e
            android.graphics.drawable.ColorDrawable r0 = new android.graphics.drawable.ColorDrawable
            int r5 = r5.j0
            r0.<init>(r5)
            android.content.res.ColorStateList r5 = r2.B
            if (r5 == 0) goto L3d
            android.content.res.ColorStateList r5 = r2.A
            r0.setTintList(r5)
            android.graphics.drawable.RippleDrawable r5 = new android.graphics.drawable.RippleDrawable
            android.content.res.ColorStateList r2 = r2.B
            r5.<init>(r2, r0, r1)
            r1 = r5
            goto L3e
        L3d:
            r1 = r0
        L3e:
            r4.setBackground(r1)
        L41:
            return r3
    }
}
