package defpackage;

import android.view.View;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.behavior.SwipeDismissBehavior;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: pw6  reason: default package */
/* loaded from: classes.dex */
public final class pw6 extends oi2 {
    public int e;
    public int f = -1;
    public final /* synthetic */ SwipeDismissBehavior g;

    public pw6(SwipeDismissBehavior swipeDismissBehavior) {
        this.g = swipeDismissBehavior;
    }

    @Override // defpackage.oi2
    public final int E(View view) {
        return view.getWidth();
    }

    @Override // defpackage.oi2
    public final void P(View view, int i) {
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

    @Override // defpackage.oi2
    public final void R(View view, int i, int i2) {
        SwipeDismissBehavior swipeDismissBehavior = this.g;
        float width = view.getWidth() * swipeDismissBehavior.e;
        float width2 = view.getWidth() * swipeDismissBehavior.f;
        float abs = Math.abs(i - this.e);
        if (abs <= width) {
            view.setAlpha(1.0f);
        } else if (abs >= width2) {
            view.setAlpha(RecyclerView.B1);
        } else {
            view.setAlpha(Math.min(Math.max((float) RecyclerView.B1, 1.0f - ((abs - width) / (width2 - width))), 1.0f));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x004e, code lost:
        if (java.lang.Math.abs(r9.getLeft() - r8.e) >= java.lang.Math.round(r9.getWidth() * 0.5f)) goto L25;
     */
    @Override // defpackage.oi2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void S(View view, float f, float f2) {
        int i;
        boolean z;
        this.f = -1;
        int width = view.getWidth();
        int i2 = (f > RecyclerView.B1 ? 1 : (f == RecyclerView.B1 ? 0 : -1));
        boolean z2 = false;
        SwipeDismissBehavior swipeDismissBehavior = this.g;
        if (i2 != 0) {
            if (view.getLayoutDirection() == 1) {
                z = true;
            } else {
                z = false;
            }
            int i3 = swipeDismissBehavior.d;
            if (i3 != 2) {
                i = i3 == 0 ? this.e : this.e;
            }
            if (f >= RecyclerView.B1) {
                int left = view.getLeft();
                int i4 = this.e;
                if (left >= i4) {
                    i = i4 + width;
                    z2 = true;
                }
            }
            i = this.e - width;
            z2 = true;
        }
        if (swipeDismissBehavior.a.o(i, view.getTop())) {
            view.postOnAnimation(new uo2(swipeDismissBehavior, view, z2));
        }
    }

    @Override // defpackage.oi2
    public final boolean a0(View view, int i) {
        int i2 = this.f;
        if ((i2 == -1 || i2 == i) && this.g.v(view)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.oi2
    public final int m(View view, int i) {
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

    @Override // defpackage.oi2
    public final int n(View view, int i) {
        return view.getTop();
    }

    @Override // defpackage.oi2
    public final void Q(int i) {
    }
}
