package defpackage;

import android.view.View;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.behavior.SwipeDismissBehavior;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: vk6  reason: default package */
/* loaded from: classes.dex */
public final class vk6 extends yf2 {
    public int e;
    public int f = -1;
    public final /* synthetic */ SwipeDismissBehavior g;

    public vk6(SwipeDismissBehavior swipeDismissBehavior) {
        this.g = swipeDismissBehavior;
    }

    @Override // defpackage.yf2
    public final void L(View view, int i) {
        this.f = i;
        this.e = view.getLeft();
        ViewParent parent = view.getParent();
        if (parent != null) {
            SwipeDismissBehavior swipeDismissBehavior = this.g;
            swipeDismissBehavior.c = true;
            parent.requestDisallowInterceptTouchEvent(true);
            swipeDismissBehavior.c = false;
        }
    }

    @Override // defpackage.yf2
    public final void N(View view, int i, int i2) {
        SwipeDismissBehavior swipeDismissBehavior = this.g;
        float width = view.getWidth() * swipeDismissBehavior.e;
        float width2 = view.getWidth() * swipeDismissBehavior.f;
        float abs = Math.abs(i - this.e);
        if (abs <= width) {
            view.setAlpha(1.0f);
        } else if (abs >= width2) {
            view.setAlpha(RecyclerView.A1);
        } else {
            view.setAlpha(Math.min(Math.max((float) RecyclerView.A1, 1.0f - ((abs - width) / (width2 - width))), 1.0f));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x004e, code lost:
        if (java.lang.Math.abs(r9.getLeft() - r8.e) >= java.lang.Math.round(r9.getWidth() * 0.5f)) goto L25;
     */
    @Override // defpackage.yf2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void O(android.view.View r9, float r10, float r11) {
        /*
            r8 = this;
            r11 = -1
            r8.f = r11
            int r11 = r9.getWidth()
            r0 = 0
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            r2 = 0
            com.google.android.material.behavior.SwipeDismissBehavior r3 = r8.g
            r4 = 1
            if (r1 == 0) goto L37
            int r5 = r9.getLayoutDirection()
            if (r5 != r4) goto L18
            r5 = r4
            goto L19
        L18:
            r5 = r2
        L19:
            int r6 = r3.d
            r7 = 2
            if (r6 != r7) goto L1f
            goto L50
        L1f:
            if (r6 != 0) goto L2b
            if (r5 == 0) goto L28
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 >= 0) goto L65
            goto L50
        L28:
            if (r1 <= 0) goto L65
            goto L50
        L2b:
            if (r6 != r4) goto L65
            if (r5 == 0) goto L32
            if (r1 <= 0) goto L65
            goto L50
        L32:
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 >= 0) goto L65
            goto L50
        L37:
            int r1 = r9.getLeft()
            int r5 = r8.e
            int r1 = r1 - r5
            int r5 = r9.getWidth()
            float r5 = (float) r5
            r6 = 1056964608(0x3f000000, float:0.5)
            float r5 = r5 * r6
            int r5 = java.lang.Math.round(r5)
            int r1 = java.lang.Math.abs(r1)
            if (r1 < r5) goto L65
        L50:
            int r10 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r10 < 0) goto L5f
            int r10 = r9.getLeft()
            int r0 = r8.e
            if (r10 >= r0) goto L5d
            goto L5f
        L5d:
            int r0 = r0 + r11
            goto L63
        L5f:
            int r8 = r8.e
            int r0 = r8 - r11
        L63:
            r2 = r4
            goto L67
        L65:
            int r0 = r8.e
        L67:
            ha7 r8 = r3.a
            int r10 = r9.getTop()
            boolean r8 = r8.o(r0, r10)
            if (r8 == 0) goto L7b
            qj2 r8 = new qj2
            r8.<init>(r3, r9, r2)
            r9.postOnAnimation(r8)
        L7b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vk6.O(android.view.View, float, float):void");
    }

    @Override // defpackage.yf2
    public final boolean W(View view, int i) {
        int i2 = this.f;
        if ((i2 == -1 || i2 == i) && this.g.r(view)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.yf2
    public final int k(View view, int i) {
        boolean z;
        int width;
        int width2;
        if (view.getLayoutDirection() == 1) {
            z = true;
        } else {
            z = false;
        }
        int i2 = this.g.d;
        if (i2 == 0) {
            width = this.e;
            if (z) {
                width -= view.getWidth();
                width2 = this.e;
            } else {
                width2 = view.getWidth() + width;
            }
        } else {
            int i3 = this.e;
            if (i2 == 1) {
                if (z) {
                    width2 = view.getWidth() + i3;
                    width = i3;
                } else {
                    width = i3 - view.getWidth();
                    width2 = this.e;
                }
            } else {
                width = i3 - view.getWidth();
                width2 = this.e + view.getWidth();
            }
        }
        return Math.min(Math.max(width, i), width2);
    }

    @Override // defpackage.yf2
    public final int l(View view, int i) {
        return view.getTop();
    }

    @Override // defpackage.yf2
    public final int x(View view) {
        return view.getWidth();
    }

    @Override // defpackage.yf2
    public final void M(int i) {
    }
}
