package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityManager;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.behavior.HideViewOnScrollBehavior;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: hr2  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class hr2 implements AccessibilityManager.TouchExplorationStateChangeListener {
    public final /* synthetic */ int A;
    public final /* synthetic */ View B;
    public final /* synthetic */ w11 L;

    public /* synthetic */ hr2(w11 w11Var, View view, int i) {
        this.A = i;
        this.L = w11Var;
        this.B = view;
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z) {
        int i = this.A;
        View view = this.B;
        w11 w11Var = this.L;
        switch (i) {
            case 0:
                HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior = (HideBottomViewOnScrollBehavior) w11Var;
                if (z && hideBottomViewOnScrollBehavior.j == 1) {
                    hideBottomViewOnScrollBehavior.r(view);
                    return;
                }
                return;
            default:
                HideViewOnScrollBehavior hideViewOnScrollBehavior = (HideViewOnScrollBehavior) w11Var;
                if (z && hideViewOnScrollBehavior.j == 1) {
                    hideViewOnScrollBehavior.s(view);
                    return;
                }
                return;
        }
    }
}
