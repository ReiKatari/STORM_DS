package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ix2  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ix2 implements android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener {
    public final /* synthetic */ int A;
    public final /* synthetic */ android.view.View B;
    public final /* synthetic */ defpackage.e51 L;

    public /* synthetic */ ix2(defpackage.e51 r1, android.view.View r2, int r3) {
            r0 = this;
            r0.A = r3
            r0.L = r1
            r0.B = r2
            r0.<init>()
            return
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean r4) {
            r3 = this;
            int r0 = r3.A
            r1 = 1
            android.view.View r2 = r3.B
            e51 r3 = r3.L
            switch(r0) {
                case 0: goto L16;
                default: goto La;
            }
        La:
            com.google.android.material.behavior.HideViewOnScrollBehavior r3 = (com.google.android.material.behavior.HideViewOnScrollBehavior) r3
            if (r4 == 0) goto L15
            int r4 = r3.j
            if (r4 != r1) goto L15
            r3.w(r2)
        L15:
            return
        L16:
            com.google.android.material.behavior.HideBottomViewOnScrollBehavior r3 = (com.google.android.material.behavior.HideBottomViewOnScrollBehavior) r3
            if (r4 == 0) goto L21
            int r4 = r3.j
            if (r4 != r1) goto L21
            r3.v(r2)
        L21:
            return
    }
}
