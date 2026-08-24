package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: dr  reason: default package */
/* loaded from: classes.dex */
public final class dr extends androidx.appcompat.widget.ContentFrameLayout {
    public final /* synthetic */ defpackage.fr h0;

    public dr(defpackage.fr r1, defpackage.p41 r2) {
            r0 = this;
            r0.h0 = r1
            r1 = 0
            r0.<init>(r2, r1)
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(android.view.KeyEvent r2) {
            r1 = this;
            fr r0 = r1.h0
            boolean r0 = r0.x(r2)
            if (r0 != 0) goto L11
            boolean r1 = super.dispatchKeyEvent(r2)
            if (r1 == 0) goto Lf
            goto L11
        Lf:
            r1 = 0
            return r1
        L11:
            r1 = 1
            return r1
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r4) {
            r3 = this;
            int r0 = r4.getAction()
            if (r0 != 0) goto L31
            float r0 = r4.getX()
            int r0 = (int) r0
            float r1 = r4.getY()
            int r1 = (int) r1
            r2 = -5
            if (r0 < r2) goto L25
            if (r1 < r2) goto L25
            int r2 = r3.getWidth()
            int r2 = r2 + 5
            if (r0 > r2) goto L25
            int r0 = r3.getHeight()
            int r0 = r0 + 5
            if (r1 <= r0) goto L31
        L25:
            r4 = 0
            fr r3 = r3.h0
            er r4 = r3.C(r4)
            r0 = 1
            r3.v(r4, r0)
            return r0
        L31:
            boolean r3 = super.onInterceptTouchEvent(r4)
            return r3
    }

    @Override // android.view.View
    public final void setBackgroundResource(int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            android.graphics.drawable.Drawable r2 = defpackage.hf.S(r0, r2)
            r1.setBackgroundDrawable(r2)
            return
    }
}
