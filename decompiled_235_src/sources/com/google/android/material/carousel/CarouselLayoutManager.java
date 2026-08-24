package com.google.android.material.carousel;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.stormds.emulator.R;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class CarouselLayoutManager extends gg5 implements rg5 {
    public final gv p;
    public dl0 q;
    public final View.OnLayoutChangeListener r;

    public CarouselLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        new cl0();
        this.r = new al0(this, 0);
        this.p = new gv();
        o0();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a75.b);
            obtainStyledAttributes.getInt(0, 0);
            o0();
            G0(obtainStyledAttributes.getInt(0, 0));
            obtainStyledAttributes.recycle();
        }
    }

    @Override // defpackage.gg5
    public final void A0(RecyclerView recyclerView, int i) {
        bl0 bl0Var = new bl0(this, recyclerView.getContext());
        bl0Var.a = i;
        B0(bl0Var);
    }

    public final float D0(float f, float f2) {
        if (F0()) {
            return f - f2;
        }
        return f + f2;
    }

    public final boolean E0() {
        if (this.q.a == 0) {
            return true;
        }
        return false;
    }

    public final boolean F0() {
        if (E0() && this.b.getLayoutDirection() == 1) {
            return true;
        }
        return false;
    }

    public final void G0(int i) {
        dl0 dl0Var;
        if (i != 0 && i != 1) {
            i.h(lb1.g(i, "invalid orientation:"));
            return;
        }
        c(null);
        dl0 dl0Var2 = this.q;
        if (dl0Var2 != null && i == dl0Var2.a) {
            return;
        }
        if (i != 0) {
            if (i == 1) {
                dl0Var = new dl0(this, 0);
            } else {
                i.h("invalid orientation");
                return;
            }
        } else {
            dl0Var = new dl0(this, 1);
        }
        this.q = dl0Var;
        o0();
    }

    @Override // defpackage.gg5
    public final boolean K() {
        return true;
    }

    @Override // defpackage.gg5
    public final void R(RecyclerView recyclerView) {
        Context context = recyclerView.getContext();
        gv gvVar = this.p;
        float f = gvVar.a;
        if (f <= RecyclerView.B1) {
            f = context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_min);
        }
        gvVar.a = f;
        float f2 = gvVar.b;
        if (f2 <= RecyclerView.B1) {
            f2 = context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_max);
        }
        gvVar.b = f2;
        o0();
        recyclerView.addOnLayoutChangeListener(this.r);
    }

    @Override // defpackage.gg5
    public final void S(RecyclerView recyclerView) {
        recyclerView.removeOnLayoutChangeListener(this.r);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x003b, code lost:
        if (r7 == 1) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0045, code lost:
        if (F0() != false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0049, code lost:
        if (r7 == 1) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0052, code lost:
        if (F0() != false) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0058  */
    @Override // defpackage.gg5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View T(View view, int i, mg5 mg5Var, sg5 sg5Var) {
        boolean z;
        if (v() != 0) {
            int i2 = this.q.a;
            if (i != 1) {
                if (i != 2) {
                    if (i != 17) {
                        if (i != 33) {
                            if (i != 66) {
                                if (i != 130) {
                                    Log.d("CarouselLayoutManager", "Unknown focus request:" + i);
                                }
                                z = true;
                            } else {
                                if (i2 == 0) {
                                }
                                z = true;
                            }
                        }
                    } else {
                        if (i2 == 0) {
                        }
                        z = true;
                    }
                    if (!z) {
                        int i3 = 0;
                        if (z) {
                            if (gg5.G(view) != 0) {
                                int G = gg5.G(u(0)) - 1;
                                if (G >= 0 && G < B()) {
                                    this.q.a();
                                    throw null;
                                }
                                if (F0()) {
                                    i3 = v() - 1;
                                }
                                return u(i3);
                            }
                        } else if (gg5.G(view) != B() - 1) {
                            int G2 = gg5.G(u(v() - 1)) + 1;
                            if (G2 >= 0 && G2 < B()) {
                                this.q.a();
                                throw null;
                            }
                            if (!F0()) {
                                i3 = v() - 1;
                            }
                            return u(i3);
                        }
                    }
                }
                z = true;
                if (!z) {
                }
            }
            z = true;
            if (!z) {
            }
        }
        return null;
    }

    @Override // defpackage.gg5
    public final void U(AccessibilityEvent accessibilityEvent) {
        super.U(accessibilityEvent);
        if (v() > 0) {
            accessibilityEvent.setFromIndex(gg5.G(u(0)));
            accessibilityEvent.setToIndex(gg5.G(u(v() - 1)));
        }
    }

    @Override // defpackage.gg5
    public final void Y(int i, int i2) {
        B();
    }

    @Override // defpackage.gg5
    public final void Z() {
        B();
    }

    @Override // defpackage.rg5
    public final PointF a(int i) {
        return null;
    }

    @Override // defpackage.gg5
    public final void b0(int i, int i2) {
        B();
    }

    @Override // defpackage.gg5
    public final boolean d() {
        return E0();
    }

    @Override // defpackage.gg5
    public final void d0(mg5 mg5Var, sg5 sg5Var) {
        int i;
        if (sg5Var.b() > 0) {
            if (E0()) {
                i = this.n;
            } else {
                i = this.o;
            }
            if (i > RecyclerView.B1) {
                F0();
                mg5Var.e(0);
                i.m("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
                return;
            }
        }
        j0(mg5Var);
    }

    @Override // defpackage.gg5
    public final boolean e() {
        return !E0();
    }

    @Override // defpackage.gg5
    public final void e0(sg5 sg5Var) {
        if (v() == 0) {
            return;
        }
        gg5.G(u(0));
    }

    @Override // defpackage.gg5
    public final int j(sg5 sg5Var) {
        v();
        return 0;
    }

    @Override // defpackage.gg5
    public final int k(sg5 sg5Var) {
        return 0;
    }

    @Override // defpackage.gg5
    public final int l(sg5 sg5Var) {
        return 0;
    }

    @Override // defpackage.gg5
    public final int m(sg5 sg5Var) {
        v();
        return 0;
    }

    @Override // defpackage.gg5
    public final int n(sg5 sg5Var) {
        return 0;
    }

    @Override // defpackage.gg5
    public final boolean n0(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
        return false;
    }

    @Override // defpackage.gg5
    public final int o(sg5 sg5Var) {
        return 0;
    }

    @Override // defpackage.gg5
    public final int p0(int i, mg5 mg5Var, sg5 sg5Var) {
        if (!E0() || v() == 0 || i == 0) {
            return 0;
        }
        mg5Var.e(0);
        i.m("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
        return 0;
    }

    @Override // defpackage.gg5
    public final hg5 r() {
        return new hg5(-2, -2);
    }

    @Override // defpackage.gg5
    public final int r0(int i, mg5 mg5Var, sg5 sg5Var) {
        if (!e() || v() == 0 || i == 0) {
            return 0;
        }
        mg5Var.e(0);
        i.m("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
        return 0;
    }

    @Override // defpackage.gg5
    public final void y(View view, Rect rect) {
        super.y(view, rect);
        rect.centerY();
        if (E0()) {
            rect.centerX();
        }
        throw null;
    }

    @Override // defpackage.gg5
    public final void q0(int i) {
    }

    public CarouselLayoutManager() {
        gv gvVar = new gv();
        new cl0();
        this.r = new al0(this, 0);
        this.p = gvVar;
        o0();
        G0(0);
    }
}
