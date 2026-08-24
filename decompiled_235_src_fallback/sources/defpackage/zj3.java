package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zj3  reason: default package */
/* loaded from: classes.dex */
public final class zj3 {
    public final android.view.View a;
    public final defpackage.nj3 b;
    public float c;
    public boolean d;

    public zj3(android.view.View r1, defpackage.nj3 r2) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r1 = 1065353216(0x3f800000, float:1.0)
            r0.c = r1
            return
    }

    public final defpackage.my4 a() {
            r2 = this;
            my4 r0 = new my4
            r1 = 0
            r0.<init>(r1, r1)
            android.view.View r2 = r2.a
            float r1 = r2.getX()
            int r1 = (int) r1
            r0.a = r1
            float r2 = r2.getY()
            int r2 = (int) r2
            r0.b = r2
            return r0
    }

    public final me.magnum.melonds.domain.model.Rect b() {
            r6 = this;
            android.view.View r6 = r6.a
            android.view.ViewGroup$LayoutParams r0 = r6.getLayoutParams()
            boolean r1 = r0 instanceof android.widget.FrameLayout.LayoutParams
            if (r1 == 0) goto Ld
            android.widget.FrameLayout$LayoutParams r0 = (android.widget.FrameLayout.LayoutParams) r0
            goto Le
        Ld:
            r0 = 0
        Le:
            int r1 = r6.getWidth()
            int r2 = r6.getHeight()
            r3 = 0
            if (r1 <= 0) goto L1b
            r4 = r1
            goto L22
        L1b:
            if (r0 == 0) goto L21
            int r4 = r0.width
            if (r4 >= 0) goto L22
        L21:
            r4 = r3
        L22:
            if (r2 <= 0) goto L26
            r3 = r2
            goto L2e
        L26:
            if (r0 == 0) goto L2e
            int r5 = r0.height
            if (r5 >= 0) goto L2d
            goto L2e
        L2d:
            r3 = r5
        L2e:
            if (r1 <= 0) goto L36
            float r1 = r6.getX()
        L34:
            int r1 = (int) r1
            goto L40
        L36:
            if (r0 == 0) goto L3b
            int r1 = r0.leftMargin
            goto L40
        L3b:
            float r1 = r6.getX()
            goto L34
        L40:
            if (r2 <= 0) goto L48
            float r6 = r6.getY()
        L46:
            int r6 = (int) r6
            goto L52
        L48:
            if (r0 == 0) goto L4d
            int r6 = r0.topMargin
            goto L52
        L4d:
            float r6 = r6.getY()
            goto L46
        L52:
            me.magnum.melonds.domain.model.Rect r0 = new me.magnum.melonds.domain.model.Rect
            r0.<init>(r1, r6, r4, r3)
            return r0
    }

    public final void c(boolean r1) {
            r0 = this;
            android.view.View r0 = r0.a
            r0.setSelected(r1)
            return
    }
}
