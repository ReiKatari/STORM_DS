package w9;

import android.view.View;
import android.view.accessibility.AccessibilityManager;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.behavior.HideViewOnScrollBehavior;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements AccessibilityManager.TouchExplorationStateChangeListener {
    public final /* synthetic */ int A;
    public final /* synthetic */ View B;
    public final /* synthetic */ k5.a L;

    public /* synthetic */ a(k5.a aVar, View view, int i2) {
        this.A = i2;
        this.L = aVar;
        this.B = view;
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z10) {
        switch (this.A) {
            case 0:
                HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior = (HideBottomViewOnScrollBehavior) this.L;
                if (z10 && hideBottomViewOnScrollBehavior.f2925j == 1) {
                    hideBottomViewOnScrollBehavior.r(this.B);
                    return;
                }
                return;
            default:
                HideViewOnScrollBehavior hideViewOnScrollBehavior = (HideViewOnScrollBehavior) this.L;
                if (z10 && hideViewOnScrollBehavior.f2936j == 1) {
                    hideViewOnScrollBehavior.s(this.B);
                    return;
                }
                return;
        }
    }
}
