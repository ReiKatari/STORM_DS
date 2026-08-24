package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: cl3  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class cl3 implements java.lang.Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ me.magnum.melonds.ui.layouteditor.b B;

    public /* synthetic */ cl3(me.magnum.melonds.ui.layouteditor.b r1, int r2) {
            r0 = this;
            r0.A = r2
            r0.B = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r5 = this;
            int r0 = r5.A
            r1 = 100
            r3 = 0
            me.magnum.melonds.ui.layouteditor.b r5 = r5.B
            switch(r0) {
                case 0: goto L4b;
                case 1: goto L40;
                case 2: goto L13;
                default: goto La;
            }
        La:
            boolean r0 = r5.v()
            if (r0 != 0) goto L12
            r5.v0 = r3
        L12:
            return
        L13:
            nb1 r5 = r5.L
            java.lang.Object r0 = r5.k
            android.widget.ScrollView r0 = (android.widget.ScrollView) r0
            android.view.ViewPropertyAnimator r0 = r0.animate()
            java.lang.Object r4 = r5.a
            android.widget.RelativeLayout r4 = (android.widget.RelativeLayout) r4
            int r4 = r4.getBottom()
            float r4 = (float) r4
            java.lang.Object r5 = r5.k
            android.widget.ScrollView r5 = (android.widget.ScrollView) r5
            int r5 = r5.getHeight()
            float r5 = (float) r5
            float r4 = r4 - r5
            android.view.ViewPropertyAnimator r5 = r0.y(r4)
            android.view.ViewPropertyAnimator r5 = r5.setDuration(r1)
            android.view.ViewPropertyAnimator r5 = r5.withEndAction(r3)
            r5.start()
            return
        L40:
            nb1 r5 = r5.L
            java.lang.Object r5 = r5.k
            android.widget.ScrollView r5 = (android.widget.ScrollView) r5
            r0 = 4
            r5.setVisibility(r0)
            return
        L4b:
            nb1 r0 = r5.L
            java.lang.Object r3 = r0.k
            android.widget.ScrollView r3 = (android.widget.ScrollView) r3
            android.view.ViewPropertyAnimator r3 = r3.animate()
            java.lang.Object r0 = r0.a
            android.widget.RelativeLayout r0 = (android.widget.RelativeLayout) r0
            int r0 = r0.getBottom()
            float r0 = (float) r0
            android.view.ViewPropertyAnimator r0 = r3.y(r0)
            android.view.ViewPropertyAnimator r0 = r0.setDuration(r1)
            cl3 r1 = new cl3
            r2 = 1
            r1.<init>(r5, r2)
            android.view.ViewPropertyAnimator r5 = r0.withEndAction(r1)
            r5.start()
            return
    }
}
