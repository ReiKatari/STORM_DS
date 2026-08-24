package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: eg5  reason: default package */
/* loaded from: classes.dex */
public final class eg5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ defpackage.gg5 b;

    public /* synthetic */ eg5(defpackage.gg5 r1, int r2) {
            r0 = this;
            r0.a = r2
            r0.b = r1
            r0.<init>()
            return
    }

    public final int a(android.view.View r2) {
            r1 = this;
            int r1 = r1.a
            switch(r1) {
                case 0: goto L1e;
                default: goto L5;
            }
        L5:
            android.view.ViewGroup$LayoutParams r1 = r2.getLayoutParams()
            hg5 r1 = (defpackage.hg5) r1
            int r0 = r2.getBottom()
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            hg5 r2 = (defpackage.hg5) r2
            android.graphics.Rect r2 = r2.b
            int r2 = r2.bottom
            int r0 = r0 + r2
            int r1 = r1.bottomMargin
        L1c:
            int r0 = r0 + r1
            return r0
        L1e:
            android.view.ViewGroup$LayoutParams r1 = r2.getLayoutParams()
            hg5 r1 = (defpackage.hg5) r1
            int r0 = r2.getRight()
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            hg5 r2 = (defpackage.hg5) r2
            android.graphics.Rect r2 = r2.b
            int r2 = r2.right
            int r0 = r0 + r2
            int r1 = r1.rightMargin
            goto L1c
    }

    public final int b(android.view.View r2) {
            r1 = this;
            int r1 = r1.a
            switch(r1) {
                case 0: goto L1e;
                default: goto L5;
            }
        L5:
            android.view.ViewGroup$LayoutParams r1 = r2.getLayoutParams()
            hg5 r1 = (defpackage.hg5) r1
            int r0 = r2.getTop()
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            hg5 r2 = (defpackage.hg5) r2
            android.graphics.Rect r2 = r2.b
            int r2 = r2.top
            int r0 = r0 - r2
            int r1 = r1.topMargin
        L1c:
            int r0 = r0 - r1
            return r0
        L1e:
            android.view.ViewGroup$LayoutParams r1 = r2.getLayoutParams()
            hg5 r1 = (defpackage.hg5) r1
            int r0 = r2.getLeft()
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            hg5 r2 = (defpackage.hg5) r2
            android.graphics.Rect r2 = r2.b
            int r2 = r2.left
            int r0 = r0 - r2
            int r1 = r1.leftMargin
            goto L1c
    }

    public final int c() {
            r1 = this;
            int r0 = r1.a
            gg5 r1 = r1.b
            switch(r0) {
                case 0: goto Lf;
                default: goto L7;
            }
        L7:
            int r0 = r1.o
            int r1 = r1.C()
        Ld:
            int r0 = r0 - r1
            return r0
        Lf:
            int r0 = r1.n
            int r1 = r1.E()
            goto Ld
    }

    public final int d() {
            r1 = this;
            int r0 = r1.a
            gg5 r1 = r1.b
            switch(r0) {
                case 0: goto Lc;
                default: goto L7;
            }
        L7:
            int r1 = r1.F()
            return r1
        Lc:
            int r1 = r1.D()
            return r1
    }
}
