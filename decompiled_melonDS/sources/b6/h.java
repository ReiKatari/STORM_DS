package b6;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class h extends AccessibilityNodeProvider {

    /* renamed from: a  reason: collision with root package name */
    public final a0.b f2080a;

    public h(a0.b bVar) {
        this.f2080a = bVar;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i2) {
        g P = this.f2080a.P(i2);
        if (P == null) {
            return null;
        }
        return P.f2077a;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final List findAccessibilityNodeInfosByText(String str, int i2) {
        this.f2080a.getClass();
        return null;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo findFocus(int i2) {
        g Q = this.f2080a.Q(i2);
        if (Q == null) {
            return null;
        }
        return Q.f2077a;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final boolean performAction(int i2, int i10, Bundle bundle) {
        return this.f2080a.V(i2, i10, bundle);
    }
}
