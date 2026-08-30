package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ky0  reason: default package */
/* loaded from: classes.dex */
public final class ky0 {
    public final ConstraintLayout a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public final /* synthetic */ ConstraintLayout h;

    public ky0(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2) {
        this.h = constraintLayout;
        this.a = constraintLayout2;
    }

    public static boolean a(int i, int i2, int i3) {
        if (i != i2) {
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            if (mode2 == 1073741824) {
                if ((mode == Integer.MIN_VALUE || mode == 0) && i3 == size) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final void b(gz0 gz0Var, k10 k10Var) {
        int makeMeasureSpec;
        int makeMeasureSpec2;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        int baseline;
        int i;
        int i2;
        int i3;
        boolean z7;
        int i4;
        boolean z8;
        boolean z9;
        int i5;
        boolean z10;
        boolean z11;
        int childMeasureSpec;
        int i6;
        boolean z12;
        boolean z13;
        if (gz0Var != null) {
            cy0 cy0Var = gz0Var.K;
            cy0 cy0Var2 = gz0Var.I;
            if (gz0Var.h0 == 8) {
                k10Var.e = 0;
                k10Var.f = 0;
                k10Var.g = 0;
            } else if (gz0Var.U != null) {
                o56 o56Var = ConstraintLayout.n0;
                fz0 fz0Var = k10Var.a;
                fz0 fz0Var2 = k10Var.b;
                int i7 = k10Var.c;
                int i8 = k10Var.d;
                int i9 = this.b + this.c;
                int i10 = this.d;
                View view = gz0Var.g0;
                int[] iArr = hy0.a;
                int i11 = iArr[fz0Var.ordinal()];
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            if (i11 != 4) {
                                makeMeasureSpec = 0;
                            } else {
                                makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f, i10, -2);
                                if (gz0Var.r == 1) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                int i12 = k10Var.j;
                                if (i12 == 1 || i12 == 2) {
                                    if (view.getMeasuredHeight() == gz0Var.l()) {
                                        z13 = true;
                                    } else {
                                        z13 = false;
                                    }
                                    if (k10Var.j == 2 || !z12 || ((z12 && z13) || gz0Var.B())) {
                                        childMeasureSpec = View.MeasureSpec.makeMeasureSpec(gz0Var.r(), 1073741824);
                                    }
                                }
                            }
                        } else {
                            int i13 = this.f;
                            if (cy0Var2 != null) {
                                i6 = cy0Var2.g;
                            } else {
                                i6 = 0;
                            }
                            if (cy0Var != null) {
                                i6 += cy0Var.g;
                            }
                            childMeasureSpec = ViewGroup.getChildMeasureSpec(i13, i10 + i6, -1);
                        }
                    } else {
                        childMeasureSpec = ViewGroup.getChildMeasureSpec(this.f, i10, -2);
                    }
                    makeMeasureSpec = childMeasureSpec;
                } else {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i7, 1073741824);
                }
                int i14 = iArr[fz0Var2.ordinal()];
                if (i14 != 1) {
                    if (i14 != 2) {
                        if (i14 != 3) {
                            if (i14 != 4) {
                                makeMeasureSpec2 = 0;
                            } else {
                                makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.g, i9, -2);
                                if (gz0Var.s == 1) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                int i15 = k10Var.j;
                                if (i15 == 1 || i15 == 2) {
                                    if (view.getMeasuredWidth() == gz0Var.r()) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    if (k10Var.j == 2 || !z10 || ((z10 && z11) || gz0Var.C())) {
                                        makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(gz0Var.l(), 1073741824);
                                    }
                                }
                            }
                        } else {
                            int i16 = this.g;
                            if (cy0Var2 != null) {
                                i5 = gz0Var.J.g;
                            } else {
                                i5 = 0;
                            }
                            if (cy0Var != null) {
                                i5 += gz0Var.L.g;
                            }
                            makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(i16, i9 + i5, -1);
                        }
                    } else {
                        makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.g, i9, -2);
                    }
                } else {
                    makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i8, 1073741824);
                }
                hz0 hz0Var = (hz0) gz0Var.U;
                ConstraintLayout constraintLayout = this.h;
                if (hz0Var != null && a53.B(constraintLayout.g0, 256) && view.getMeasuredWidth() == gz0Var.r() && view.getMeasuredWidth() < hz0Var.r() && view.getMeasuredHeight() == gz0Var.l() && view.getMeasuredHeight() < hz0Var.l() && view.getBaseline() == gz0Var.b0 && !gz0Var.A() && a(gz0Var.G, makeMeasureSpec, gz0Var.r()) && a(gz0Var.H, makeMeasureSpec2, gz0Var.l())) {
                    k10Var.e = gz0Var.r();
                    k10Var.f = gz0Var.l();
                    k10Var.g = gz0Var.b0;
                    return;
                }
                fz0 fz0Var3 = fz0.MATCH_CONSTRAINT;
                if (fz0Var == fz0Var3) {
                    z = true;
                } else {
                    z = false;
                }
                if (fz0Var2 == fz0Var3) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                fz0 fz0Var4 = fz0.MATCH_PARENT;
                if (fz0Var2 != fz0Var4 && fz0Var2 != fz0.FIXED) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                if (fz0Var != fz0Var4 && fz0Var != fz0.FIXED) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                if (z && gz0Var.X > RecyclerView.A1) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (z2 && gz0Var.X > RecyclerView.A1) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (view == null) {
                    return;
                }
                jy0 jy0Var = (jy0) view.getLayoutParams();
                int i17 = k10Var.j;
                if (i17 != 1 && i17 != 2 && z && gz0Var.r == 0 && z2 && gz0Var.s == 0) {
                    i4 = -1;
                    z7 = false;
                    baseline = 0;
                    i = 0;
                    i2 = 0;
                } else {
                    if ((view instanceof oc7) && (gz0Var instanceof pc7)) {
                        ((oc7) view).l((pc7) gz0Var, makeMeasureSpec, makeMeasureSpec2);
                    } else {
                        view.measure(makeMeasureSpec, makeMeasureSpec2);
                    }
                    gz0Var.G = makeMeasureSpec;
                    gz0Var.H = makeMeasureSpec2;
                    gz0Var.g = false;
                    int measuredWidth = view.getMeasuredWidth();
                    int measuredHeight = view.getMeasuredHeight();
                    baseline = view.getBaseline();
                    int i18 = gz0Var.u;
                    if (i18 > 0) {
                        i = Math.max(i18, measuredWidth);
                    } else {
                        i = measuredWidth;
                    }
                    int i19 = gz0Var.v;
                    if (i19 > 0) {
                        i = Math.min(i19, i);
                    }
                    int i20 = gz0Var.x;
                    if (i20 > 0) {
                        i2 = Math.max(i20, measuredHeight);
                    } else {
                        i2 = measuredHeight;
                    }
                    int i21 = makeMeasureSpec2;
                    int i22 = gz0Var.y;
                    if (i22 > 0) {
                        i2 = Math.min(i22, i2);
                    }
                    if (!a53.B(constraintLayout.g0, 1)) {
                        if (z5 && z3) {
                            i = (int) ((i2 * gz0Var.X) + 0.5f);
                        } else if (z6 && z4) {
                            i2 = (int) ((i / gz0Var.X) + 0.5f);
                        }
                    }
                    if (measuredWidth == i && measuredHeight == i2) {
                        i4 = -1;
                        z7 = false;
                    } else {
                        if (measuredWidth != i) {
                            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i, 1073741824);
                        }
                        if (measuredHeight != i2) {
                            i3 = View.MeasureSpec.makeMeasureSpec(i2, 1073741824);
                        } else {
                            i3 = i21;
                        }
                        view.measure(makeMeasureSpec, i3);
                        gz0Var.G = makeMeasureSpec;
                        gz0Var.H = i3;
                        z7 = false;
                        gz0Var.g = false;
                        i = view.getMeasuredWidth();
                        i2 = view.getMeasuredHeight();
                        baseline = view.getBaseline();
                        i4 = -1;
                    }
                }
                if (baseline != i4) {
                    z8 = true;
                } else {
                    z8 = z7;
                }
                if (i == k10Var.c && i2 == k10Var.d) {
                    z9 = z7;
                } else {
                    z9 = true;
                }
                k10Var.i = z9;
                if (jy0Var.c0) {
                    z8 = true;
                }
                if (z8 && baseline != -1 && gz0Var.b0 != baseline) {
                    k10Var.i = true;
                }
                k10Var.e = i;
                k10Var.f = i2;
                k10Var.h = z8;
                k10Var.g = baseline;
            }
        }
    }
}
