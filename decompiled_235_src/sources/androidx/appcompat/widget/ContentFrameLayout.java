package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {
    public TypedValue A;
    public TypedValue B;
    public TypedValue L;
    public TypedValue R;
    public TypedValue d0;
    public TypedValue e0;
    public final Rect f0;
    public k31 g0;

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f0 = new Rect();
    }

    public TypedValue getFixedHeightMajor() {
        if (this.d0 == null) {
            this.d0 = new TypedValue();
        }
        return this.d0;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.e0 == null) {
            this.e0 = new TypedValue();
        }
        return this.e0;
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
        k31 k31Var = this.g0;
        if (k31Var != null) {
            k31Var.getClass();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        g8 g8Var;
        super.onDetachedFromWindow();
        k31 k31Var = this.g0;
        if (k31Var != null) {
            fr frVar = ((vq) k31Var).B;
            ActionBarOverlayLayout actionBarOverlayLayout = frVar.m0;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.k();
                ActionMenuView actionMenuView = ((l87) actionBarOverlayLayout.d0).a.A;
                if (actionMenuView != null && (g8Var = actionMenuView.s0) != null) {
                    g8Var.e();
                    d8 d8Var = g8Var.p0;
                    if (d8Var != null && d8Var.b()) {
                        d8Var.i.dismiss();
                    }
                }
            }
            if (frVar.r0 != null) {
                frVar.h0.getDecorView().removeCallbacks(frVar.s0);
                if (frVar.r0.isShowing()) {
                    try {
                        frVar.r0.dismiss();
                    } catch (IllegalArgumentException unused) {
                    }
                }
                frVar.r0 = null;
            }
            ip7 ip7Var = frVar.t0;
            if (ip7Var != null) {
                ip7Var.b();
            }
            i44 i44Var = frVar.C(0).h;
            if (i44Var != null) {
                i44Var.c(true);
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
    */
    public final void onMeasure(int i, int i2) {
        boolean z;
        int i3;
        boolean z2;
        int i4;
        int measuredWidth;
        TypedValue typedValue;
        int i5;
        int i6;
        float fraction;
        TypedValue typedValue2;
        int i7;
        int i8;
        float fraction2;
        TypedValue typedValue3;
        int i9;
        int i10;
        float fraction3;
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        boolean z3 = true;
        if (displayMetrics.widthPixels < displayMetrics.heightPixels) {
            z = true;
        } else {
            z = false;
        }
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        Rect rect = this.f0;
        if (mode == Integer.MIN_VALUE) {
            if (z) {
                typedValue3 = this.R;
            } else {
                typedValue3 = this.L;
            }
            if (typedValue3 != null && (i9 = typedValue3.type) != 0) {
                if (i9 == 5) {
                    fraction3 = typedValue3.getDimension(displayMetrics);
                } else if (i9 == 6) {
                    int i11 = displayMetrics.widthPixels;
                    fraction3 = typedValue3.getFraction(i11, i11);
                } else {
                    i10 = 0;
                    if (i10 > 0) {
                        i3 = View.MeasureSpec.makeMeasureSpec(Math.min(i10 - (rect.left + rect.right), View.MeasureSpec.getSize(i)), 1073741824);
                        z2 = true;
                        if (mode2 == Integer.MIN_VALUE) {
                            if (z) {
                                typedValue2 = this.d0;
                            } else {
                                typedValue2 = this.e0;
                            }
                            if (typedValue2 != null && (i7 = typedValue2.type) != 0) {
                                if (i7 == 5) {
                                    fraction2 = typedValue2.getDimension(displayMetrics);
                                } else if (i7 == 6) {
                                    int i12 = displayMetrics.heightPixels;
                                    fraction2 = typedValue2.getFraction(i12, i12);
                                } else {
                                    i8 = 0;
                                    if (i8 > 0) {
                                        i4 = View.MeasureSpec.makeMeasureSpec(Math.min(i8 - (rect.top + rect.bottom), View.MeasureSpec.getSize(i2)), 1073741824);
                                        super.onMeasure(i3, i4);
                                        measuredWidth = getMeasuredWidth();
                                        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
                                        if (!z2 && mode == Integer.MIN_VALUE) {
                                            if (!z) {
                                                typedValue = this.B;
                                            } else {
                                                typedValue = this.A;
                                            }
                                            if (typedValue != null && (i5 = typedValue.type) != 0) {
                                                if (i5 != 5) {
                                                    fraction = typedValue.getDimension(displayMetrics);
                                                } else if (i5 == 6) {
                                                    int i13 = displayMetrics.widthPixels;
                                                    fraction = typedValue.getFraction(i13, i13);
                                                } else {
                                                    i6 = 0;
                                                    if (i6 > 0) {
                                                        i6 -= rect.left + rect.right;
                                                    }
                                                    if (measuredWidth < i6) {
                                                        makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i6, 1073741824);
                                                        if (!z3) {
                                                            super.onMeasure(makeMeasureSpec, i4);
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                }
                                                i6 = (int) fraction;
                                                if (i6 > 0) {
                                                }
                                                if (measuredWidth < i6) {
                                                }
                                            }
                                        }
                                        z3 = false;
                                        if (!z3) {
                                        }
                                    }
                                }
                                i8 = (int) fraction2;
                                if (i8 > 0) {
                                }
                            }
                        }
                        i4 = i2;
                        super.onMeasure(i3, i4);
                        measuredWidth = getMeasuredWidth();
                        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
                        if (!z2) {
                            if (!z) {
                            }
                            if (typedValue != null) {
                                if (i5 != 5) {
                                }
                                i6 = (int) fraction;
                                if (i6 > 0) {
                                }
                                if (measuredWidth < i6) {
                                }
                            }
                        }
                        z3 = false;
                        if (!z3) {
                        }
                    }
                }
                i10 = (int) fraction3;
                if (i10 > 0) {
                }
            }
        }
        i3 = i;
        z2 = false;
        if (mode2 == Integer.MIN_VALUE) {
        }
        i4 = i2;
        super.onMeasure(i3, i4);
        measuredWidth = getMeasuredWidth();
        int makeMeasureSpec22 = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
        if (!z2) {
        }
        z3 = false;
        if (!z3) {
        }
    }

    public void setAttachListener(k31 k31Var) {
        this.g0 = k31Var;
    }
}
