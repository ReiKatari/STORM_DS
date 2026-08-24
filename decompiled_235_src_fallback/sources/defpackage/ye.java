package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ye  reason: default package */
/* loaded from: classes.dex */
public final class ye extends defpackage.aj3 implements defpackage.qn2 {
    public final /* synthetic */ int B;
    public final /* synthetic */ defpackage.ze L;

    public /* synthetic */ ye(defpackage.ze r1, int r2) {
            r0 = this;
            r0.B = r2
            r0.L = r1
            r1 = 1
            r0.<init>(r1)
            return
    }

    @Override // defpackage.qn2
    public final java.lang.Object g(java.lang.Object r5) {
            r4 = this;
            int r0 = r4.B
            ze r4 = r4.L
            switch(r0) {
                case 0: goto L28;
                default: goto L7;
            }
        L7:
            o76 r5 = (defpackage.o76) r5
            java.util.List r0 = r5.B
            boolean r0 = r0.contains(r5)
            if (r0 != 0) goto L12
            goto L25
        L12:
            te r0 = r4.R
            bq4 r0 = r0.getSnapshotObserver()
            ye r1 = r4.I0
            le r2 = new le
            r3 = 1
            r2.<init>(r3, r5, r4)
            qm6 r4 = r0.a
            r4.d(r5, r1, r2)
        L25:
            jg7 r4 = defpackage.jg7.a
            return r4
        L28:
            android.view.accessibility.AccessibilityEvent r5 = (android.view.accessibility.AccessibilityEvent) r5
            te r4 = r4.R
            android.view.ViewParent r0 = r4.getParent()
            boolean r4 = r0.requestSendAccessibilityEvent(r4, r5)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            return r4
    }
}
