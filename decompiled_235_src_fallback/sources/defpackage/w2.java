package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: w2  reason: default package */
/* loaded from: classes.dex */
public class w2 extends android.view.accessibility.AccessibilityNodeProvider {
    public final defpackage.os0 a;

    public w2(defpackage.os0 r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final android.view.accessibility.AccessibilityNodeInfo createAccessibilityNodeInfo(int r1) {
            r0 = this;
            os0 r0 = r0.a
            v2 r0 = r0.R(r1)
            if (r0 != 0) goto La
            r0 = 0
            return r0
        La:
            android.view.accessibility.AccessibilityNodeInfo r0 = r0.a
            return r0
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final java.util.List findAccessibilityNodeInfosByText(java.lang.String r1, int r2) {
            r0 = this;
            os0 r0 = r0.a
            r0.getClass()
            r0 = 0
            return r0
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final android.view.accessibility.AccessibilityNodeInfo findFocus(int r1) {
            r0 = this;
            os0 r0 = r0.a
            v2 r0 = r0.X(r1)
            if (r0 != 0) goto La
            r0 = 0
            return r0
        La:
            android.view.accessibility.AccessibilityNodeInfo r0 = r0.a
            return r0
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final boolean performAction(int r1, int r2, android.os.Bundle r3) {
            r0 = this;
            os0 r0 = r0.a
            boolean r0 = r0.d0(r1, r2, r3)
            return r0
    }
}
