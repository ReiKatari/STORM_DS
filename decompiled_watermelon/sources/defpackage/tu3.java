package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ScrollView;
import androidx.core.widget.NestedScrollView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: tu3  reason: default package */
/* loaded from: classes.dex */
public final class tu3 extends z1 {
    public final /* synthetic */ int R;

    public /* synthetic */ tu3(int i) {
        this.R = i;
    }

    @Override // defpackage.z1
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

    @Override // defpackage.z1
    public final void d(View view, t2 t2Var) {
        int scrollRange;
        int i = this.R;
        View.AccessibilityDelegate accessibilityDelegate = this.A;
        switch (i) {
            case 0:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, t2Var.a);
                t2Var.j(null);
                return;
            case 1:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, t2Var.a);
                t2Var.l(false);
                return;
            case 2:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, t2Var.a);
                t2Var.j(null);
                return;
            case 3:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, t2Var.a);
                NestedScrollView nestedScrollView = (NestedScrollView) view;
                t2Var.i(ScrollView.class.getName());
                if (nestedScrollView.isEnabled() && (scrollRange = nestedScrollView.getScrollRange()) > 0) {
                    t2Var.l(true);
                    if (nestedScrollView.getScrollY() > 0) {
                        t2Var.b(n2.i);
                        t2Var.b(n2.n);
                    }
                    if (nestedScrollView.getScrollY() < scrollRange) {
                        t2Var.b(n2.h);
                        t2Var.b(n2.p);
                        return;
                    }
                    return;
                }
                return;
            default:
                AccessibilityNodeInfo accessibilityNodeInfo = t2Var.a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                accessibilityNodeInfo.setVisibleToUser(false);
                return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x004b, code lost:
        if (r5 != 16908346) goto L31;
     */
    @Override // defpackage.z1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean g(android.view.View r4, int r5, android.os.Bundle r6) {
        /*
            r3 = this;
            int r0 = r3.R
            switch(r0) {
                case 3: goto La;
                default: goto L5;
            }
        L5:
            boolean r3 = super.g(r4, r5, r6)
            return r3
        La:
            boolean r3 = super.g(r4, r5, r6)
            r6 = 1
            if (r3 == 0) goto L13
            goto La1
        L13:
            androidx.core.widget.NestedScrollView r4 = (androidx.core.widget.NestedScrollView) r4
            boolean r3 = r4.isEnabled()
            r0 = 0
            if (r3 != 0) goto L1e
            goto La0
        L1e:
            int r3 = r4.getHeight()
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            android.graphics.Matrix r2 = r4.getMatrix()
            boolean r2 = r2.isIdentity()
            if (r2 == 0) goto L3b
            boolean r2 = r4.getGlobalVisibleRect(r1)
            if (r2 == 0) goto L3b
            int r3 = r1.height()
        L3b:
            r1 = 4096(0x1000, float:5.74E-42)
            if (r5 == r1) goto L75
            r1 = 8192(0x2000, float:1.148E-41)
            if (r5 == r1) goto L4e
            r1 = 16908344(0x1020038, float:2.3877386E-38)
            if (r5 == r1) goto L4e
            r1 = 16908346(0x102003a, float:2.3877392E-38)
            if (r5 == r1) goto L75
            goto La0
        L4e:
            int r5 = r4.getPaddingBottom()
            int r3 = r3 - r5
            int r5 = r4.getPaddingTop()
            int r3 = r3 - r5
            int r5 = r4.getScrollY()
            int r5 = r5 - r3
            int r3 = java.lang.Math.max(r5, r0)
            int r5 = r4.getScrollY()
            if (r3 == r5) goto La0
            int r5 = r4.getScrollX()
            int r0 = r0 - r5
            int r5 = r4.getScrollY()
            int r3 = r3 - r5
            r4.u(r0, r6, r3)
            goto La1
        L75:
            int r5 = r4.getPaddingBottom()
            int r3 = r3 - r5
            int r5 = r4.getPaddingTop()
            int r3 = r3 - r5
            int r5 = r4.getScrollY()
            int r5 = r5 + r3
            int r3 = r4.getScrollRange()
            int r3 = java.lang.Math.min(r5, r3)
            int r5 = r4.getScrollY()
            if (r3 == r5) goto La0
            int r5 = r4.getScrollX()
            int r0 = r0 - r5
            int r5 = r4.getScrollY()
            int r3 = r3 - r5
            r4.u(r0, r6, r3)
            goto La1
        La0:
            r6 = r0
        La1:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tu3.g(android.view.View, int, android.os.Bundle):boolean");
    }
}
