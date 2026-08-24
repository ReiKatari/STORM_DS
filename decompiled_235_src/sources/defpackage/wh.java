package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.behavior.HideViewOnScrollBehavior;
import com.stormds.emulator.R;
import java.util.WeakHashMap;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wh  reason: default package */
/* loaded from: classes.dex */
public final class wh implements View.OnAttachStateChangeListener {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;

    public /* synthetic */ wh(Object obj, int i) {
        this.A = i;
        this.B = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        int i = this.A;
        Object obj = this.B;
        switch (i) {
            case 0:
                xh xhVar = (xh) obj;
                Context context = view.getContext();
                if (!xhVar.d) {
                    context.getApplicationContext().registerComponentCallbacks(xhVar.e);
                    xhVar.d = true;
                    return;
                }
                return;
            case 1:
                return;
            case 2:
                n42 n42Var = (n42) obj;
                AccessibilityManager accessibilityManager = n42Var.s0;
                if (n42Var.t0 != null && accessibilityManager != null && n42Var.isAttachedToWindow()) {
                    accessibilityManager.addTouchExplorationStateChangeListener(n42Var.t0);
                    return;
                }
                return;
            case 3:
                View view2 = (View) obj;
                view2.removeOnAttachStateChangeListener(this);
                WeakHashMap weakHashMap = ao7.a;
                view2.requestApplyInsets();
                return;
            case 4:
            case 5:
            case 6:
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
                xh xhVar = (xh) obj;
                Context context = view.getContext();
                if (xhVar.d) {
                    context.getApplicationContext().unregisterComponentCallbacks(xhVar.e);
                    xhVar.d = false;
                    return;
                }
                return;
            case 1:
                gl0 gl0Var = (gl0) obj;
                ViewTreeObserver viewTreeObserver = gl0Var.t0;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        gl0Var.t0 = view.getViewTreeObserver();
                    }
                    gl0Var.t0.removeGlobalOnLayoutListener(gl0Var.e0);
                }
                view.removeOnAttachStateChangeListener(this);
                return;
            case 2:
                n42 n42Var = (n42) obj;
                AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = n42Var.t0;
                if (touchExplorationStateChangeListener != null && (accessibilityManager = n42Var.s0) != null) {
                    accessibilityManager.removeTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
                    return;
                }
                return;
            case 3:
                return;
            case 4:
                HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior = (HideBottomViewOnScrollBehavior) obj;
                ix2 ix2Var = hideBottomViewOnScrollBehavior.h;
                if (ix2Var != null && (accessibilityManager2 = hideBottomViewOnScrollBehavior.g) != null) {
                    accessibilityManager2.removeTouchExplorationStateChangeListener(ix2Var);
                    hideBottomViewOnScrollBehavior.h = null;
                    return;
                }
                return;
            case 5:
                HideViewOnScrollBehavior hideViewOnScrollBehavior = (HideViewOnScrollBehavior) obj;
                ix2 ix2Var2 = hideViewOnScrollBehavior.c;
                if (ix2Var2 != null && (accessibilityManager3 = hideViewOnScrollBehavior.b) != null) {
                    accessibilityManager3.removeTouchExplorationStateChangeListener(ix2Var2);
                    hideViewOnScrollBehavior.c = null;
                    return;
                }
                return;
            case 6:
                ep6 ep6Var = (ep6) obj;
                ViewTreeObserver viewTreeObserver2 = ep6Var.k0;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        ep6Var.k0 = view.getViewTreeObserver();
                    }
                    ep6Var.k0.removeGlobalOnLayoutListener(ep6Var.e0);
                }
                view.removeOnAttachStateChangeListener(this);
                return;
            case 7:
                p0 p0Var = (p0) obj;
                for (ViewParent viewParent : sb6.Z(p0Var.getParent(), mo7.d0)) {
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
                p0Var.e();
                return;
            default:
                view.removeOnAttachStateChangeListener(this);
                ((ap6) obj).h(null);
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
