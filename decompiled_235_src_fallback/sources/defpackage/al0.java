package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: al0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class al0 implements android.view.View.OnLayoutChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ al0(java.lang.Object r1, int r2) {
            r0 = this;
            r0.a = r2
            r0.b = r1
            r0.<init>()
            return
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(android.view.View r3, int r4, int r5, int r6, int r7, int r8, int r9, int r10, int r11) {
            r2 = this;
            int r0 = r2.a
            r1 = 0
            java.lang.Object r2 = r2.b
            switch(r0) {
                case 0: goto L6d;
                case 1: goto L33;
                case 2: goto L2d;
                default: goto L8;
            }
        L8:
            me.magnum.melonds.ui.layouteditor.LayoutEditorActivity r2 = (me.magnum.melonds.ui.layouteditor.LayoutEditorActivity) r2
            int r3 = me.magnum.melonds.ui.layouteditor.LayoutEditorActivity.N0
            int r10 = r10 - r8
            int r11 = r11 - r9
            int r6 = r6 - r4
            int r7 = r7 - r5
            if (r6 != r10) goto L14
            if (r7 == r11) goto L2c
        L14:
            r2.D()
            yl3 r2 = r2.C()
            ci0 r2 = r2.d
            java.lang.Object r2 = r2.b
            tp6 r2 = (defpackage.tp6) r2
            my4 r3 = new my4
            r3.<init>(r6, r7)
            r2.getClass()
            r2.m(r1, r3)
        L2c:
            return
        L2d:
            c92 r2 = (defpackage.c92) r2
            r2.b()
            return
        L33:
            me.magnum.melonds.ui.emulator.EmulatorActivity r2 = (me.magnum.melonds.ui.emulator.EmulatorActivity) r2
            int r3 = me.magnum.melonds.ui.emulator.EmulatorActivity.Z1
            int r10 = r10 - r8
            int r11 = r11 - r9
            int r6 = r6 - r4
            int r7 = r7 - r5
            if (r6 != r10) goto L3f
            if (r7 == r11) goto L66
        L3f:
            r2.L0 = r1
            r2.M0 = r1
            sz1 r3 = r2.W()
            ci0 r3 = r3.u
            java.lang.Object r3 = r3.b
            tp6 r3 = (defpackage.tp6) r3
            my4 r4 = new my4
            r4.<init>(r6, r7)
            r3.getClass()
            r3.m(r1, r4)
            android.os.Handler r3 = r2.N0
            if (r3 == 0) goto L67
            yu1 r4 = new yu1
            r5 = 12
            r4.<init>(r2, r5)
            r3.post(r4)
        L66:
            return
        L67:
            java.lang.String r2 = "handler"
            defpackage.nb3.a0(r2)
            throw r1
        L6d:
            com.google.android.material.carousel.CarouselLayoutManager r2 = (com.google.android.material.carousel.CarouselLayoutManager) r2
            int r6 = r6 - r4
            int r10 = r10 - r8
            if (r6 != r10) goto L77
            int r7 = r7 - r5
            int r11 = r11 - r9
            if (r7 == r11) goto L81
        L77:
            n0 r4 = new n0
            r5 = 10
            r4.<init>(r2, r5)
            r3.post(r4)
        L81:
            return
    }
}
