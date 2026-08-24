package defpackage;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: x2  reason: default package */
/* loaded from: classes.dex */
public final class x2 extends w2 {
    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final void addExtraDataToAccessibilityNodeInfo(int i, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
        this.a.N(i, new v2(accessibilityNodeInfo), str, bundle);
    }
}
