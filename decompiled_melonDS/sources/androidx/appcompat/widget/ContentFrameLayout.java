package androidx.appcompat.widget;

import a6.f1;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;
import l.o;
import l.x;
import p.l;
import q.f;
import q.g1;
import q.j;
import q.m3;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {
    public TypedValue A;
    public TypedValue B;
    public TypedValue L;
    public TypedValue R;

    /* renamed from: b0  reason: collision with root package name */
    public TypedValue f959b0;

    /* renamed from: c0  reason: collision with root package name */
    public TypedValue f960c0;

    /* renamed from: d0  reason: collision with root package name */
    public final Rect f961d0;

    /* renamed from: e0  reason: collision with root package name */
    public g1 f962e0;

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f961d0 = new Rect();
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f959b0 == null) {
            this.f959b0 = new TypedValue();
        }
        return this.f959b0;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f960c0 == null) {
            this.f960c0 = new TypedValue();
        }
        return this.f960c0;
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
        g1 g1Var = this.f962e0;
        if (g1Var != null) {
            g1Var.getClass();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        j jVar;
        super.onDetachedFromWindow();
        g1 g1Var = this.f962e0;
        if (g1Var != null) {
            x xVar = ((o) g1Var).B;
            ActionBarOverlayLayout actionBarOverlayLayout = xVar.f8474l0;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.k();
                ActionMenuView actionMenuView = ((m3) actionBarOverlayLayout.f925b0).f11964a.A;
                if (actionMenuView != null && (jVar = actionMenuView.f951q0) != null) {
                    jVar.c();
                    f fVar = jVar.f11925n0;
                    if (fVar != null && fVar.b()) {
                        fVar.f11172i.dismiss();
                    }
                }
            }
            if (xVar.f8478q0 != null) {
                xVar.f8468f0.getDecorView().removeCallbacks(xVar.f8479r0);
                if (xVar.f8478q0.isShowing()) {
                    try {
                        xVar.f8478q0.dismiss();
                    } catch (IllegalArgumentException unused) {
                    }
                }
                xVar.f8478q0 = null;
            }
            f1 f1Var = xVar.f8480s0;
            if (f1Var != null) {
                f1Var.b();
            }
            l lVar = xVar.z(0).f8454h;
            if (lVar != null) {
                lVar.c(true);
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

    public void setAttachListener(g1 g1Var) {
        this.f962e0 = g1Var;
    }
}
