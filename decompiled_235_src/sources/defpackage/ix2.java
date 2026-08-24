package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityManager;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.behavior.HideViewOnScrollBehavior;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ix2  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ix2 implements AccessibilityManager.TouchExplorationStateChangeListener {
    public final /* synthetic */ int A;
    public final /* synthetic */ View B;
    public final /* synthetic */ e51 L;

    public /* synthetic */ ix2(e51 e51Var, View view, int i) {
        this.A = i;
        this.L = e51Var;
        this.B = view;
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z) {
        int i = this.A;
        View view = this.B;
        e51 e51Var = this.L;
        switch (i) {
            case 0:
                HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior = (HideBottomViewOnScrollBehavior) e51Var;
                if (z && hideBottomViewOnScrollBehavior.j == 1) {
                    hideBottomViewOnScrollBehavior.v(view);
                    return;
                }
                return;
            default:
                HideViewOnScrollBehavior hideViewOnScrollBehavior = (HideViewOnScrollBehavior) e51Var;
                if (z && hideViewOnScrollBehavior.j == 1) {
                    hideViewOnScrollBehavior.w(view);
                    return;
                }
                return;
        }
    }
}
