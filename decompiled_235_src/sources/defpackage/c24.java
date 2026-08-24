package defpackage;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ScrollView;
import androidx.core.widget.NestedScrollView;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: c24  reason: default package */
/* loaded from: classes.dex */
public final class c24 extends b2 {
    public final /* synthetic */ int R;

    public /* synthetic */ c24(int i) {
        this.R = i;
    }

    @Override // defpackage.b2
    public void c(View view, AccessibilityEvent accessibilityEvent) {
        boolean z;
        switch (this.R) {
            case 3:
                super.c(view, accessibilityEvent);
                NestedScrollView nestedScrollView = (NestedScrollView) view;
                accessibilityEvent.setClassName(ScrollView.class.getName());
                if (nestedScrollView.getScrollRange() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                accessibilityEvent.setScrollable(z);
                accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
                accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
                accessibilityEvent.setMaxScrollX(nestedScrollView.getScrollX());
                accessibilityEvent.setMaxScrollY(nestedScrollView.getScrollRange());
                return;
            default:
                super.c(view, accessibilityEvent);
                return;
        }
    }

    @Override // defpackage.b2
    public final void d(View view, v2 v2Var) {
        int scrollRange;
        int i = this.R;
        View.AccessibilityDelegate accessibilityDelegate = this.A;
        switch (i) {
            case 0:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, v2Var.a);
                v2Var.j(null);
                return;
            case 1:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, v2Var.a);
                v2Var.l(false);
                return;
            case 2:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, v2Var.a);
                v2Var.j(null);
                return;
            case 3:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, v2Var.a);
                NestedScrollView nestedScrollView = (NestedScrollView) view;
                v2Var.i(ScrollView.class.getName());
                if (nestedScrollView.isEnabled() && (scrollRange = nestedScrollView.getScrollRange()) > 0) {
                    v2Var.l(true);
                    if (nestedScrollView.getScrollY() > 0) {
                        v2Var.b(p2.i);
                        v2Var.b(p2.n);
                    }
                    if (nestedScrollView.getScrollY() < scrollRange) {
                        v2Var.b(p2.h);
                        v2Var.b(p2.p);
                        return;
                    }
                    return;
                }
                return;
            default:
                AccessibilityNodeInfo accessibilityNodeInfo = v2Var.a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                accessibilityNodeInfo.setVisibleToUser(false);
                return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x004b, code lost:
        if (r5 != 16908346) goto L31;
     */
    @Override // defpackage.b2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean g(View view, int i, Bundle bundle) {
        switch (this.R) {
            case 3:
                if (super.g(view, i, bundle)) {
                    return true;
                }
                NestedScrollView nestedScrollView = (NestedScrollView) view;
                if (nestedScrollView.isEnabled()) {
                    int height = nestedScrollView.getHeight();
                    Rect rect = new Rect();
                    if (nestedScrollView.getMatrix().isIdentity() && nestedScrollView.getGlobalVisibleRect(rect)) {
                        height = rect.height();
                    }
                    if (i != 4096) {
                        if (i != 8192 && i != 16908344) {
                            break;
                        } else {
                            int max = Math.max(nestedScrollView.getScrollY() - ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                            if (max != nestedScrollView.getScrollY()) {
                                nestedScrollView.u(0 - nestedScrollView.getScrollX(), true, max - nestedScrollView.getScrollY());
                                return true;
                            }
                        }
                    }
                    int min = Math.min(nestedScrollView.getScrollY() + ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
                    if (min != nestedScrollView.getScrollY()) {
                        nestedScrollView.u(0 - nestedScrollView.getScrollX(), true, min - nestedScrollView.getScrollY());
                        return true;
                    }
                }
                return false;
            default:
                return super.g(view, i, bundle);
        }
    }
}
