package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: p43  reason: default package */
/* loaded from: classes.dex */
public final class p43 extends android.view.View.AccessibilityDelegate {
    public final /* synthetic */ defpackage.q43 a;

    public p43(defpackage.q43 r1) {
            r0 = this;
            r0.a = r1
            r0.<init>()
            return
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(android.view.View r1, android.view.accessibility.AccessibilityNodeInfo r2) {
            r0 = this;
            super.onInitializeAccessibilityNodeInfo(r1, r2)
            q43 r0 = r0.a
            com.google.android.material.textfield.TextInputLayout r0 = r0.h
            android.widget.EditText r0 = r0.getEditText()
            if (r0 == 0) goto L10
            r2.setLabeledBy(r0)
        L10:
            return
    }
}
