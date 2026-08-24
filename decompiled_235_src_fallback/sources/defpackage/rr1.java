package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: rr1  reason: default package */
/* loaded from: classes.dex */
public final class rr1 extends defpackage.dg5 {
    public final /* synthetic */ int a;

    public /* synthetic */ rr1() {
            r1 = this;
            r0 = 0
            r1.a = r0
            r1.<init>()
            return
    }

    public rr1(defpackage.f24 r1) {
            r0 = this;
            r1 = 1
            r0.a = r1
            r0.<init>()
            r0 = 0
            defpackage.uj7.c(r0)
            defpackage.uj7.c(r0)
            return
    }

    public static int d(android.view.View r4, androidx.recyclerview.widget.RecyclerView r5) {
            int r0 = r4.getWidth()
            r1 = 0
            if (r0 != 0) goto Lf
            r4.measure(r1, r1)
            int r0 = r4.getMeasuredWidth()
            goto L13
        Lf:
            int r0 = r4.getWidth()
        L13:
            int r5 = r5.getWidth()
            int r5 = r5 - r0
            android.view.ViewGroup$LayoutParams r0 = r4.getLayoutParams()
            boolean r2 = r0 instanceof android.view.ViewGroup.MarginLayoutParams
            r3 = 0
            if (r2 == 0) goto L24
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
            goto L25
        L24:
            r0 = r3
        L25:
            if (r0 == 0) goto L2a
            int r0 = r0.leftMargin
            goto L2b
        L2a:
            r0 = r1
        L2b:
            int r5 = r5 - r0
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            boolean r0 = r4 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto L37
            r3 = r4
            android.view.ViewGroup$MarginLayoutParams r3 = (android.view.ViewGroup.MarginLayoutParams) r3
        L37:
            if (r3 == 0) goto L3b
            int r1 = r3.rightMargin
        L3b:
            int r5 = r5 - r1
            int r5 = r5 / 2
            return r5
    }

    @Override // defpackage.dg5
    public void a(android.graphics.Rect r3, android.view.View r4, androidx.recyclerview.widget.RecyclerView r5, defpackage.sg5 r6) {
            r2 = this;
            int r0 = r2.a
            switch(r0) {
                case 0: goto L9;
                default: goto L5;
            }
        L5:
            super.a(r3, r4, r5, r6)
            return
        L9:
            r3.getClass()
            r4.getClass()
            r6.getClass()
            super.a(r3, r4, r5, r6)
            wg5 r2 = androidx.recyclerview.widget.RecyclerView.N(r4)
            r0 = -1
            if (r2 == 0) goto L25
            androidx.recyclerview.widget.RecyclerView r1 = r2.r
            if (r1 != 0) goto L21
            goto L25
        L21:
            int r0 = r1.K(r2)
        L25:
            if (r0 != 0) goto L2e
            int r2 = d(r4, r5)
            r3.right = r2
            goto L3c
        L2e:
            int r2 = r6.b()
            int r2 = r2 + (-1)
            if (r0 != r2) goto L3c
            int r2 = d(r4, r5)
            r3.left = r2
        L3c:
            return
    }

    @Override // defpackage.dg5
    public void b(androidx.recyclerview.widget.RecyclerView r1) {
            r0 = this;
            int r0 = r0.a
            switch(r0) {
                case 1: goto L6;
                default: goto L5;
            }
        L5:
            return
        L6:
            wf5 r0 = r1.getAdapter()
            boolean r0 = r0 instanceof defpackage.hy7
            if (r0 == 0) goto L25
            gg5 r0 = r1.getLayoutManager()
            boolean r0 = r0 instanceof androidx.recyclerview.widget.GridLayoutManager
            if (r0 != 0) goto L17
            goto L25
        L17:
            wf5 r0 = r1.getAdapter()
            hy7 r0 = (defpackage.hy7) r0
            gg5 r0 = r1.getLayoutManager()
            androidx.recyclerview.widget.GridLayoutManager r0 = (androidx.recyclerview.widget.GridLayoutManager) r0
            r0 = 0
            throw r0
        L25:
            return
    }
}
