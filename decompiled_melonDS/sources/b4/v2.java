package b4;

import android.content.Context;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.behavior.HideViewOnScrollBehavior;
import java.util.Iterator;
import me.magnum.melonds.R;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class v2 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;

    public /* synthetic */ v2(int i2, Object obj) {
        this.A = i2;
        this.B = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.A) {
            case 0:
            case DSiCameraSource.FrontCamera /* 1 */:
                return;
            case 2:
                i3.e eVar = (i3.e) this.B;
                Context context = view.getContext();
                if (!eVar.f6627d) {
                    context.getApplicationContext().registerComponentCallbacks(eVar.f6628e);
                    eVar.f6627d = true;
                    return;
                }
                return;
            case 3:
            case 4:
                return;
            case l1.c.f8511g /* 5 */:
                qa.m mVar = (qa.m) this.B;
                AccessibilityManager accessibilityManager = mVar.f12453q0;
                if (mVar.f12454r0 != null && accessibilityManager != null && mVar.isAttachedToWindow()) {
                    accessibilityManager.addTouchExplorationStateChangeListener(mVar.f12454r0);
                    return;
                }
                return;
            case l1.c.f8509e /* 6 */:
            default:
                return;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        boolean z10;
        Boolean bool;
        AccessibilityManager accessibilityManager;
        AccessibilityManager accessibilityManager2;
        AccessibilityManager accessibilityManager3;
        switch (this.A) {
            case 0:
                a aVar = (a) this.B;
                Iterator it = uc.h.J(aVar.getParent(), a6.c1.f445b0).iterator();
                while (true) {
                    z10 = false;
                    if (it.hasNext()) {
                        ViewParent viewParent = (ViewParent) it.next();
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
                                z10 = bool.booleanValue();
                            }
                            if (z10) {
                                z10 = true;
                            }
                        }
                    }
                }
                if (!z10) {
                    aVar.c();
                    return;
                }
                return;
            case DSiCameraSource.FrontCamera /* 1 */:
                view.removeOnAttachStateChangeListener(this);
                ((zc.l1) this.B).i(null);
                return;
            case 2:
                i3.e eVar = (i3.e) this.B;
                Context context = view.getContext();
                if (eVar.f6627d) {
                    context.getApplicationContext().unregisterComponentCallbacks(eVar.f6628e);
                    eVar.f6627d = false;
                    return;
                }
                return;
            case 3:
                p.f fVar = (p.f) this.B;
                ViewTreeObserver viewTreeObserver = fVar.f11106r0;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        fVar.f11106r0 = view.getViewTreeObserver();
                    }
                    fVar.f11106r0.removeGlobalOnLayoutListener(fVar.f11092c0);
                }
                view.removeOnAttachStateChangeListener(this);
                return;
            case 4:
                p.c0 c0Var = (p.c0) this.B;
                ViewTreeObserver viewTreeObserver2 = c0Var.f11081i0;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        c0Var.f11081i0 = view.getViewTreeObserver();
                    }
                    c0Var.f11081i0.removeGlobalOnLayoutListener(c0Var.f11075c0);
                }
                view.removeOnAttachStateChangeListener(this);
                return;
            case l1.c.f8511g /* 5 */:
                qa.m mVar = (qa.m) this.B;
                AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = mVar.f12454r0;
                if (touchExplorationStateChangeListener != null && (accessibilityManager = mVar.f12453q0) != null) {
                    accessibilityManager.removeTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
                    return;
                }
                return;
            case l1.c.f8509e /* 6 */:
                HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior = (HideBottomViewOnScrollBehavior) this.B;
                w9.a aVar2 = hideBottomViewOnScrollBehavior.f2923h;
                if (aVar2 != null && (accessibilityManager2 = hideBottomViewOnScrollBehavior.f2922g) != null) {
                    accessibilityManager2.removeTouchExplorationStateChangeListener(aVar2);
                    hideBottomViewOnScrollBehavior.f2923h = null;
                    return;
                }
                return;
            default:
                HideViewOnScrollBehavior hideViewOnScrollBehavior = (HideViewOnScrollBehavior) this.B;
                w9.a aVar3 = hideViewOnScrollBehavior.f2929c;
                if (aVar3 != null && (accessibilityManager3 = hideViewOnScrollBehavior.f2928b) != null) {
                    accessibilityManager3.removeTouchExplorationStateChangeListener(aVar3);
                    hideViewOnScrollBehavior.f2929c = null;
                    return;
                }
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
}
