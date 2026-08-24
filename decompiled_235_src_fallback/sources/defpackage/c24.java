package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: c24  reason: default package */
/* loaded from: classes.dex */
public final class c24 extends defpackage.b2 {
    public final /* synthetic */ int R;

    public /* synthetic */ c24(int r1) {
            r0 = this;
            r0.R = r1
            r0.<init>()
            return
    }

    @Override // defpackage.b2
    public void c(android.view.View r2, android.view.accessibility.AccessibilityEvent r3) {
            r1 = this;
            int r0 = r1.R
            switch(r0) {
                case 3: goto L9;
                default: goto L5;
            }
        L5:
            super.c(r2, r3)
            return
        L9:
            super.c(r2, r3)
            androidx.core.widget.NestedScrollView r2 = (androidx.core.widget.NestedScrollView) r2
            java.lang.Class<android.widget.ScrollView> r1 = android.widget.ScrollView.class
            java.lang.String r1 = r1.getName()
            r3.setClassName(r1)
            int r1 = r2.getScrollRange()
            if (r1 <= 0) goto L1f
            r1 = 1
            goto L20
        L1f:
            r1 = 0
        L20:
            r3.setScrollable(r1)
            int r1 = r2.getScrollX()
            r3.setScrollX(r1)
            int r1 = r2.getScrollY()
            r3.setScrollY(r1)
            int r1 = r2.getScrollX()
            r3.setMaxScrollX(r1)
            int r1 = r2.getScrollRange()
            r3.setMaxScrollY(r1)
            return
    }

    @Override // defpackage.b2
    public final void d(android.view.View r4, defpackage.v2 r5) {
            r3 = this;
            int r0 = r3.R
            r1 = 0
            r2 = 0
            android.view.View$AccessibilityDelegate r3 = r3.A
            switch(r0) {
                case 0: goto L65;
                case 1: goto L5c;
                case 2: goto L53;
                case 3: goto L12;
                default: goto L9;
            }
        L9:
            android.view.accessibility.AccessibilityNodeInfo r5 = r5.a
            r3.onInitializeAccessibilityNodeInfo(r4, r5)
            r5.setVisibleToUser(r2)
            return
        L12:
            android.view.accessibility.AccessibilityNodeInfo r0 = r5.a
            r3.onInitializeAccessibilityNodeInfo(r4, r0)
            androidx.core.widget.NestedScrollView r4 = (androidx.core.widget.NestedScrollView) r4
            java.lang.Class<android.widget.ScrollView> r3 = android.widget.ScrollView.class
            java.lang.String r3 = r3.getName()
            r5.i(r3)
            boolean r3 = r4.isEnabled()
            if (r3 == 0) goto L52
            int r3 = r4.getScrollRange()
            if (r3 <= 0) goto L52
            r0 = 1
            r5.l(r0)
            int r0 = r4.getScrollY()
            if (r0 <= 0) goto L42
            p2 r0 = defpackage.p2.i
            r5.b(r0)
            p2 r0 = defpackage.p2.n
            r5.b(r0)
        L42:
            int r4 = r4.getScrollY()
            if (r4 >= r3) goto L52
            p2 r3 = defpackage.p2.h
            r5.b(r3)
            p2 r3 = defpackage.p2.p
            r5.b(r3)
        L52:
            return
        L53:
            android.view.accessibility.AccessibilityNodeInfo r0 = r5.a
            r3.onInitializeAccessibilityNodeInfo(r4, r0)
            r5.j(r1)
            return
        L5c:
            android.view.accessibility.AccessibilityNodeInfo r0 = r5.a
            r3.onInitializeAccessibilityNodeInfo(r4, r0)
            r5.l(r2)
            return
        L65:
            android.view.accessibility.AccessibilityNodeInfo r0 = r5.a
            r3.onInitializeAccessibilityNodeInfo(r4, r0)
            r5.j(r1)
            return
    }

    @Override // defpackage.b2
    public boolean g(android.view.View r4, int r5, android.os.Bundle r6) {
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
    }
}
