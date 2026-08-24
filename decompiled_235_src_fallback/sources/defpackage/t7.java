package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: t7  reason: default package */
/* loaded from: classes.dex */
public final class t7 implements java.lang.Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ androidx.appcompat.widget.ActionBarOverlayLayout B;

    public /* synthetic */ t7(androidx.appcompat.widget.ActionBarOverlayLayout r1, int r2) {
            r0 = this;
            r0.A = r2
            r0.B = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r2 = this;
            int r0 = r2.A
            androidx.appcompat.widget.ActionBarOverlayLayout r2 = r2.B
            switch(r0) {
                case 0: goto L25;
                default: goto L7;
            }
        L7:
            r2.h()
            androidx.appcompat.widget.ActionBarContainer r0 = r2.R
            android.view.ViewPropertyAnimator r0 = r0.animate()
            androidx.appcompat.widget.ActionBarContainer r1 = r2.R
            int r1 = r1.getHeight()
            int r1 = -r1
            float r1 = (float) r1
            android.view.ViewPropertyAnimator r0 = r0.translationY(r1)
            s7 r1 = r2.w0
            android.view.ViewPropertyAnimator r0 = r0.setListener(r1)
            r2.v0 = r0
            return
        L25:
            r2.h()
            androidx.appcompat.widget.ActionBarContainer r0 = r2.R
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r1 = 0
            android.view.ViewPropertyAnimator r0 = r0.translationY(r1)
            s7 r1 = r2.w0
            android.view.ViewPropertyAnimator r0 = r0.setListener(r1)
            r2.v0 = r0
            return
    }
}
