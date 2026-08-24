package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ir0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ir0 implements android.view.View.OnFocusChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ ir0(java.lang.Object r1, int r2) {
            r0 = this;
            r0.a = r2
            r0.b = r1
            r0.<init>()
            return
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(android.view.View r6, boolean r7) {
            r5 = this;
            int r0 = r5.a
            r1 = 0
            java.lang.Object r5 = r5.b
            switch(r0) {
                case 0: goto L70;
                case 1: goto L61;
                default: goto L8;
            }
        L8:
            wp5 r5 = (defpackage.wp5) r5
            if (r7 == 0) goto L60
            androidx.recyclerview.widget.RecyclerView r5 = r5.d
            if (r5 == 0) goto L60
            gg5 r7 = r5.getLayoutManager()
            boolean r0 = r7 instanceof androidx.recyclerview.widget.LinearLayoutManager
            r2 = 0
            if (r0 == 0) goto L1c
            androidx.recyclerview.widget.LinearLayoutManager r7 = (androidx.recyclerview.widget.LinearLayoutManager) r7
            goto L1d
        L1c:
            r7 = r2
        L1d:
            if (r7 != 0) goto L20
            goto L60
        L20:
            int r0 = defpackage.gg5.G(r6)
            int r5 = r5.getWidth()
            int r3 = r6.getWidth()
            int r5 = r5 - r3
            android.view.ViewGroup$LayoutParams r3 = r6.getLayoutParams()
            boolean r4 = r3 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r4 == 0) goto L38
            android.view.ViewGroup$MarginLayoutParams r3 = (android.view.ViewGroup.MarginLayoutParams) r3
            goto L39
        L38:
            r3 = r2
        L39:
            if (r3 == 0) goto L3e
            int r3 = r3.rightMargin
            goto L3f
        L3e:
            r3 = r1
        L3f:
            int r5 = r5 - r3
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            boolean r3 = r6 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r3 == 0) goto L4b
            r2 = r6
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
        L4b:
            if (r2 == 0) goto L4f
            int r1 = r2.leftMargin
        L4f:
            int r5 = r5 - r1
            int r5 = r5 / 2
            r7.x = r0
            r7.y = r5
            hv3 r5 = r7.z
            if (r5 == 0) goto L5d
            r6 = -1
            r5.A = r6
        L5d:
            r7.o0()
        L60:
            return
        L61:
            vp1 r5 = (defpackage.vp1) r5
            r5.l = r7
            r5.p()
            if (r7 != 0) goto L6f
            r5.s(r1)
            r5.m = r1
        L6f:
            return
        L70:
            lr0 r5 = (defpackage.lr0) r5
            boolean r6 = r5.t()
            r5.s(r6)
            return
    }
}
