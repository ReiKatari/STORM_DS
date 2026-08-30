package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {
    public TypedValue A;
    public TypedValue B;
    public TypedValue L;
    public TypedValue R;
    public TypedValue c0;
    public TypedValue d0;
    public final Rect e0;
    public f01 f0;

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.e0 = new Rect();
    }

    public TypedValue getFixedHeightMajor() {
        if (this.c0 == null) {
            this.c0 = new TypedValue();
        }
        return this.c0;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.d0 == null) {
            this.d0 = new TypedValue();
        }
        return this.d0;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.L == null) {
            this.L = new TypedValue();
        }
        return this.L;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.R == null) {
            this.R = new TypedValue();
        }
        return this.R;
    }

    public TypedValue getMinWidthMajor() {
        if (this.A == null) {
            this.A = new TypedValue();
        }
        return this.A;
    }

    public TypedValue getMinWidthMinor() {
        if (this.B == null) {
            this.B = new TypedValue();
        }
        return this.B;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        f01 f01Var = this.f0;
        if (f01Var != null) {
            f01Var.getClass();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        f8 f8Var;
        super.onDetachedFromWindow();
        f01 f01Var = this.f0;
        if (f01Var != null) {
            tq tqVar = ((jq) f01Var).B;
            ActionBarOverlayLayout actionBarOverlayLayout = tqVar.l0;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.k();
                ActionMenuView actionMenuView = ((yv6) actionBarOverlayLayout.c0).a.A;
                if (actionMenuView != null && (f8Var = actionMenuView.r0) != null) {
                    f8Var.c();
                    c8 c8Var = f8Var.o0;
                    if (c8Var != null && c8Var.b()) {
                        c8Var.i.dismiss();
                    }
                }
            }
            if (tqVar.q0 != null) {
                tqVar.g0.getDecorView().removeCallbacks(tqVar.r0);
                if (tqVar.q0.isShowing()) {
                    try {
                        tqVar.q0.dismiss();
                    } catch (IllegalArgumentException unused) {
                    }
                }
                tqVar.q0 = null;
            }
            hb7 hb7Var = tqVar.s0;
            if (hb7Var != null) {
                hb7Var.b();
            }
            uw3 uw3Var = tqVar.y(0).h;
            if (uw3Var != null) {
                uw3Var.c(true);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ac A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r17, int r18) {
        /*
            Method dump skipped, instructions count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ContentFrameLayout.onMeasure(int, int):void");
    }

    public void setAttachListener(f01 f01Var) {
        this.f0 = f01Var;
    }
}
