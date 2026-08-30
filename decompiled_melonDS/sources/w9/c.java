package w9;

import android.view.View;
import android.view.ViewParent;
import com.google.android.material.behavior.SwipeDismissBehavior;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c extends ij.a {

    /* renamed from: e  reason: collision with root package name */
    public int f14172e;

    /* renamed from: f  reason: collision with root package name */
    public int f14173f = -1;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ SwipeDismissBehavior f14174g;

    public c(SwipeDismissBehavior swipeDismissBehavior) {
        this.f14174g = swipeDismissBehavior;
    }

    @Override // ij.a
    public final int B(View view, int i2) {
        boolean z10;
        int width;
        int width2;
        if (view.getLayoutDirection() == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i10 = this.f14174g.f2941d;
        if (i10 == 0) {
            width = this.f14172e;
            if (z10) {
                width -= view.getWidth();
                width2 = this.f14172e;
            } else {
                width2 = view.getWidth() + width;
            }
        } else {
            int i11 = this.f14172e;
            if (i10 == 1) {
                if (z10) {
                    width2 = view.getWidth() + i11;
                    width = i11;
                } else {
                    width = i11 - view.getWidth();
                    width2 = this.f14172e;
                }
            } else {
                width = i11 - view.getWidth();
                width2 = view.getWidth() + this.f14172e;
            }
        }
        return Math.min(Math.max(width, i2), width2);
    }

    @Override // ij.a
    public final int C(View view, int i2) {
        return view.getTop();
    }

    @Override // ij.a
    public final int i0(View view) {
        return view.getWidth();
    }

    @Override // ij.a
    public final void q0(View view, int i2) {
        this.f14173f = i2;
        this.f14172e = view.getLeft();
        ViewParent parent = view.getParent();
        if (parent != null) {
            SwipeDismissBehavior swipeDismissBehavior = this.f14174g;
            swipeDismissBehavior.f2940c = true;
            parent.requestDisallowInterceptTouchEvent(true);
            swipeDismissBehavior.f2940c = false;
        }
    }

    @Override // ij.a
    public final void s0(View view, int i2, int i10) {
        SwipeDismissBehavior swipeDismissBehavior = this.f14174g;
        float width = view.getWidth() * swipeDismissBehavior.f2942e;
        float width2 = view.getWidth() * swipeDismissBehavior.f2943f;
        float abs = Math.abs(i2 - this.f14172e);
        if (abs <= width) {
            view.setAlpha(1.0f);
        } else if (abs >= width2) {
            view.setAlpha(0.0f);
        } else {
            view.setAlpha(Math.min(Math.max(0.0f, 1.0f - ((abs - width) / (width2 - width))), 1.0f));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x004e, code lost:
        if (java.lang.Math.abs(r9.getLeft() - r8.f14172e) >= java.lang.Math.round(r9.getWidth() * 0.5f)) goto L25;
     */
    @Override // ij.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void t0(android.view.View r9, float r10, float r11) {
        /*
            r8 = this;
            r11 = -1
            r8.f14173f = r11
            int r11 = r9.getWidth()
            r0 = 0
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            r2 = 0
            com.google.android.material.behavior.SwipeDismissBehavior r3 = r8.f14174g
            r4 = 1
            if (r1 == 0) goto L37
            int r5 = r9.getLayoutDirection()
            if (r5 != r4) goto L18
            r5 = r4
            goto L19
        L18:
            r5 = r2
        L19:
            int r6 = r3.f2941d
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
            int r5 = r8.f14172e
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
            int r0 = r8.f14172e
            if (r10 >= r0) goto L5d
            goto L5f
        L5d:
            int r0 = r0 + r11
            goto L63
        L5f:
            int r10 = r8.f14172e
            int r0 = r10 - r11
        L63:
            r2 = r4
            goto L67
        L65:
            int r0 = r8.f14172e
        L67:
            j6.d r10 = r3.f2938a
            int r11 = r9.getTop()
            boolean r10 = r10.o(r0, r11)
            if (r10 == 0) goto L7b
            m0.h r10 = new m0.h
            r10.<init>(r3, r9, r2)
            r9.postOnAnimation(r10)
        L7b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: w9.c.t0(android.view.View, float, float):void");
    }

    @Override // ij.a
    public final boolean z0(View view, int i2) {
        int i10 = this.f14173f;
        if ((i10 == -1 || i10 == i2) && this.f14174g.r(view)) {
            return true;
        }
        return false;
    }

    @Override // ij.a
    public final void r0(int i2) {
    }
}
