package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: p11  reason: default package */
/* loaded from: classes.dex */
public final class p11 {
    public final ConstraintLayout a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public final /* synthetic */ ConstraintLayout h;

    public p11(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2) {
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

    public final void b(l21 l21Var, e30 e30Var) {
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
        if (l21Var != null) {
            h11 h11Var = l21Var.K;
            h11 h11Var2 = l21Var.I;
            if (l21Var.h0 == 8) {
                e30Var.e = 0;
                e30Var.f = 0;
                e30Var.g = 0;
            } else if (l21Var.U != null) {
                bh6 bh6Var = ConstraintLayout.o0;
                k21 k21Var = e30Var.a;
                k21 k21Var2 = e30Var.b;
                int i7 = e30Var.c;
                int i8 = e30Var.d;
                int i9 = this.b + this.c;
                int i10 = this.d;
                View view = l21Var.g0;
                int[] iArr = m11.a;
                int i11 = iArr[k21Var.ordinal()];
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            if (i11 != 4) {
                                makeMeasureSpec = 0;
                            } else {
                                makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f, i10, -2);
                                if (l21Var.r == 1) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                int i12 = e30Var.j;
                                if (i12 == 1 || i12 == 2) {
                                    if (view.getMeasuredHeight() == l21Var.l()) {
                                        z13 = true;
                                    } else {
                                        z13 = false;
                                    }
                                    if (e30Var.j == 2 || !z12 || ((z12 && z13) || l21Var.B())) {
                                        childMeasureSpec = View.MeasureSpec.makeMeasureSpec(l21Var.r(), 1073741824);
                                    }
                                }
                            }
                        } else {
                            int i13 = this.f;
                            if (h11Var2 != null) {
                                i6 = h11Var2.g;
                            } else {
                                i6 = 0;
                            }
                            if (h11Var != null) {
                                i6 += h11Var.g;
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
                int i14 = iArr[k21Var2.ordinal()];
                if (i14 != 1) {
                    if (i14 != 2) {
                        if (i14 != 3) {
                            if (i14 != 4) {
                                makeMeasureSpec2 = 0;
                            } else {
                                makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.g, i9, -2);
                                if (l21Var.s == 1) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                int i15 = e30Var.j;
                                if (i15 == 1 || i15 == 2) {
                                    if (view.getMeasuredWidth() == l21Var.r()) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    if (e30Var.j == 2 || !z10 || ((z10 && z11) || l21Var.C())) {
                                        makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(l21Var.l(), 1073741824);
                                    }
                                }
                            }
                        } else {
                            int i16 = this.g;
                            if (h11Var2 != null) {
                                i5 = l21Var.J.g;
                            } else {
                                i5 = 0;
                            }
                            if (h11Var != null) {
                                i5 += l21Var.L.g;
                            }
                            makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(i16, i9 + i5, -1);
                        }
                    } else {
                        makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.g, i9, -2);
                    }
                } else {
                    makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i8, 1073741824);
                }
                m21 m21Var = (m21) l21Var.U;
                ConstraintLayout constraintLayout = this.h;
                if (m21Var != null && n16.v(constraintLayout.h0, 256) && view.getMeasuredWidth() == l21Var.r() && view.getMeasuredWidth() < m21Var.r() && view.getMeasuredHeight() == l21Var.l() && view.getMeasuredHeight() < m21Var.l() && view.getBaseline() == l21Var.b0 && !l21Var.A() && a(l21Var.G, makeMeasureSpec, l21Var.r()) && a(l21Var.H, makeMeasureSpec2, l21Var.l())) {
                    e30Var.e = l21Var.r();
                    e30Var.f = l21Var.l();
                    e30Var.g = l21Var.b0;
                    return;
                }
                k21 k21Var3 = k21.MATCH_CONSTRAINT;
                if (k21Var == k21Var3) {
                    z = true;
                } else {
                    z = false;
                }
                if (k21Var2 == k21Var3) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                k21 k21Var4 = k21.MATCH_PARENT;
                if (k21Var2 != k21Var4 && k21Var2 != k21.FIXED) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                if (k21Var != k21Var4 && k21Var != k21.FIXED) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                if (z && l21Var.X > RecyclerView.B1) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (z2 && l21Var.X > RecyclerView.B1) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (view == null) {
                    return;
                }
                o11 o11Var = (o11) view.getLayoutParams();
                int i17 = e30Var.j;
                if (i17 != 1 && i17 != 2 && z && l21Var.r == 0 && z2 && l21Var.s == 0) {
                    i4 = -1;
                    z7 = false;
                    baseline = 0;
                    i = 0;
                    i2 = 0;
                } else {
                    if ((view instanceof qq7) && (l21Var instanceof rq7)) {
                        ((qq7) view).l((rq7) l21Var, makeMeasureSpec, makeMeasureSpec2);
                    } else {
                        view.measure(makeMeasureSpec, makeMeasureSpec2);
                    }
                    l21Var.G = makeMeasureSpec;
                    l21Var.H = makeMeasureSpec2;
                    l21Var.g = false;
                    int measuredWidth = view.getMeasuredWidth();
                    int measuredHeight = view.getMeasuredHeight();
                    baseline = view.getBaseline();
                    int i18 = l21Var.u;
                    if (i18 > 0) {
                        i = Math.max(i18, measuredWidth);
                    } else {
                        i = measuredWidth;
                    }
                    int i19 = l21Var.v;
                    if (i19 > 0) {
                        i = Math.min(i19, i);
                    }
                    int i20 = l21Var.x;
                    if (i20 > 0) {
                        i2 = Math.max(i20, measuredHeight);
                    } else {
                        i2 = measuredHeight;
                    }
                    int i21 = makeMeasureSpec2;
                    int i22 = l21Var.y;
                    if (i22 > 0) {
                        i2 = Math.min(i22, i2);
                    }
                    if (!n16.v(constraintLayout.h0, 1)) {
                        if (z5 && z3) {
                            i = (int) ((i2 * l21Var.X) + 0.5f);
                        } else if (z6 && z4) {
                            i2 = (int) ((i / l21Var.X) + 0.5f);
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
                        l21Var.G = makeMeasureSpec;
                        l21Var.H = i3;
                        z7 = false;
                        l21Var.g = false;
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
                if (i == e30Var.c && i2 == e30Var.d) {
                    z9 = z7;
                } else {
                    z9 = true;
                }
                e30Var.i = z9;
                if (o11Var.c0) {
                    z8 = true;
                }
                if (z8 && baseline != -1 && l21Var.b0 != baseline) {
                    e30Var.i = true;
                }
                e30Var.e = i;
                e30Var.f = i2;
                e30Var.h = z8;
                e30Var.g = baseline;
            }
        }
    }
}
