package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.behavior.HideViewOnScrollBehavior;
import java.util.WeakHashMap;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: kh  reason: default package */
/* loaded from: classes.dex */
public final class kh implements View.OnAttachStateChangeListener {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;

    public /* synthetic */ kh(int i, Object obj) {
        this.A = i;
        this.B = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        int i = this.A;
        Object obj = this.B;
        switch (i) {
            case 0:
                lh lhVar = (lh) obj;
                Context context = view.getContext();
                if (!lhVar.d) {
                    context.getApplicationContext().registerComponentCallbacks(lhVar.e);
                    lhVar.d = true;
                    return;
                }
                return;
            case 1:
                return;
            case 2:
                yz1 yz1Var = (yz1) obj;
                AccessibilityManager accessibilityManager = yz1Var.r0;
                if (yz1Var.s0 != null && accessibilityManager != null && yz1Var.isAttachedToWindow()) {
                    accessibilityManager.addTouchExplorationStateChangeListener(yz1Var.s0);
                    return;
                }
                return;
            case 3:
                View view2 = (View) obj;
                view2.removeOnAttachStateChangeListener(this);
                WeakHashMap weakHashMap = aa7.a;
                view2.requestApplyInsets();
                return;
            case 4:
            case 5:
            case ig7.b /* 6 */:
            case 7:
            default:
                return;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        AccessibilityManager accessibilityManager;
        AccessibilityManager accessibilityManager2;
        AccessibilityManager accessibilityManager3;
        Boolean bool;
        boolean z;
        int i = this.A;
        Object obj = this.B;
        switch (i) {
            case 0:
                lh lhVar = (lh) obj;
                Context context = view.getContext();
                if (lhVar.d) {
                    context.getApplicationContext().unregisterComponentCallbacks(lhVar.e);
                    lhVar.d = false;
                    return;
                }
                return;
            case 1:
                yi0 yi0Var = (yi0) obj;
                ViewTreeObserver viewTreeObserver = yi0Var.s0;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        yi0Var.s0 = view.getViewTreeObserver();
                    }
                    yi0Var.s0.removeGlobalOnLayoutListener(yi0Var.d0);
                }
                view.removeOnAttachStateChangeListener(this);
                return;
            case 2:
                yz1 yz1Var = (yz1) obj;
                AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = yz1Var.s0;
                if (touchExplorationStateChangeListener != null && (accessibilityManager = yz1Var.r0) != null) {
                    accessibilityManager.removeTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
                    return;
                }
                return;
            case 3:
                return;
            case 4:
                HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior = (HideBottomViewOnScrollBehavior) obj;
                hr2 hr2Var = hideBottomViewOnScrollBehavior.h;
                if (hr2Var != null && (accessibilityManager2 = hideBottomViewOnScrollBehavior.g) != null) {
                    accessibilityManager2.removeTouchExplorationStateChangeListener(hr2Var);
                    hideBottomViewOnScrollBehavior.h = null;
                    return;
                }
                return;
            case 5:
                HideViewOnScrollBehavior hideViewOnScrollBehavior = (HideViewOnScrollBehavior) obj;
                hr2 hr2Var2 = hideViewOnScrollBehavior.c;
                if (hr2Var2 != null && (accessibilityManager3 = hideViewOnScrollBehavior.b) != null) {
                    accessibilityManager3.removeTouchExplorationStateChangeListener(hr2Var2);
                    hideViewOnScrollBehavior.c = null;
                    return;
                }
                return;
            case ig7.b /* 6 */:
                od6 od6Var = (od6) obj;
                ViewTreeObserver viewTreeObserver2 = od6Var.j0;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        od6Var.j0 = view.getViewTreeObserver();
                    }
                    od6Var.j0.removeGlobalOnLayoutListener(od6Var.d0);
                }
                view.removeOnAttachStateChangeListener(this);
                return;
            case 7:
                o0 o0Var = (o0) obj;
                for (ViewParent viewParent : d06.x0(o0Var.getParent(), ma7.c0)) {
                    if (viewParent instanceof View) {
                        View view2 = (View) viewParent;
                        view2.getClass();
                        Object tag = view2.getTag(R.id.is_pooling_container_tag);
                        if (tag instanceof Boolean) {
                            bool = (Boolean) tag;
                        } else {
                            bool = null;
                        }
                        if (bool != null) {
                            z = bool.booleanValue();
                        } else {
                            z = false;
                        }
                        if (z) {
                            return;
                        }
                    }
                }
                o0Var.e();
                return;
            default:
                view.removeOnAttachStateChangeListener(this);
                ((kd6) obj).i(null);
                return;
        }
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }

    private final void c(View view) {
    }

    private final void d(View view) {
    }

    private final void e(View view) {
    }

    private final void f(View view) {
    }

    private final void g(View view) {
    }
}
