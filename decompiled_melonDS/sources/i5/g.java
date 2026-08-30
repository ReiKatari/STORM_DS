package i5;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final ConstraintLayout f6867a;

    /* renamed from: b  reason: collision with root package name */
    public int f6868b;

    /* renamed from: c  reason: collision with root package name */
    public int f6869c;

    /* renamed from: d  reason: collision with root package name */
    public int f6870d;

    /* renamed from: e  reason: collision with root package name */
    public int f6871e;

    /* renamed from: f  reason: collision with root package name */
    public int f6872f;

    /* renamed from: g  reason: collision with root package name */
    public int f6873g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ ConstraintLayout f6874h;

    public g(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2) {
        this.f6874h = constraintLayout;
        this.f6867a = constraintLayout2;
    }

    public static boolean a(int i2, int i10, int i11) {
        if (i2 != i10) {
            int mode = View.MeasureSpec.getMode(i2);
            int mode2 = View.MeasureSpec.getMode(i10);
            int size = View.MeasureSpec.getSize(i10);
            if (mode2 == 1073741824) {
                if ((mode == Integer.MIN_VALUE || mode == 0) && i11 == size) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final void b(e5.g gVar, f5.b bVar) {
        int makeMeasureSpec;
        int makeMeasureSpec2;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        int i2;
        int i10;
        int i11;
        boolean z16;
        int baseline;
        int i12;
        boolean z17;
        boolean z18;
        int i13;
        boolean z19;
        boolean z20;
        int childMeasureSpec;
        int i14;
        boolean z21;
        boolean z22;
        if (gVar != null) {
            e5.d dVar = gVar.K;
            e5.d dVar2 = gVar.I;
            if (gVar.f4303h0 == 8) {
                bVar.f4846e = 0;
                bVar.f4847f = 0;
                bVar.f4848g = 0;
            } else if (gVar.U != null) {
                w wVar = ConstraintLayout.f1155m0;
                e5.f fVar = bVar.f4842a;
                e5.f fVar2 = bVar.f4843b;
                int i15 = bVar.f4844c;
                int i16 = bVar.f4845d;
                int i17 = this.f6868b + this.f6869c;
                int i18 = this.f6870d;
                View view = gVar.f4301g0;
                int[] iArr = d.f6825a;
                int i19 = iArr[fVar.ordinal()];
                if (i19 != 1) {
                    if (i19 != 2) {
                        if (i19 != 3) {
                            if (i19 != 4) {
                                makeMeasureSpec = 0;
                            } else {
                                makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f6872f, i18, -2);
                                if (gVar.f4320r == 1) {
                                    z21 = true;
                                } else {
                                    z21 = false;
                                }
                                int i20 = bVar.f4851j;
                                if (i20 == 1 || i20 == 2) {
                                    if (view.getMeasuredHeight() == gVar.l()) {
                                        z22 = true;
                                    } else {
                                        z22 = false;
                                    }
                                    if (bVar.f4851j == 2 || !z21 || ((z21 && z22) || gVar.B())) {
                                        childMeasureSpec = View.MeasureSpec.makeMeasureSpec(gVar.r(), 1073741824);
                                    }
                                }
                            }
                        } else {
                            int i21 = this.f6872f;
                            if (dVar2 != null) {
                                i14 = dVar2.f4284g;
                            } else {
                                i14 = 0;
                            }
                            if (dVar != null) {
                                i14 += dVar.f4284g;
                            }
                            childMeasureSpec = ViewGroup.getChildMeasureSpec(i21, i18 + i14, -1);
                        }
                    } else {
                        childMeasureSpec = ViewGroup.getChildMeasureSpec(this.f6872f, i18, -2);
                    }
                    makeMeasureSpec = childMeasureSpec;
                } else {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i15, 1073741824);
                }
                int i22 = iArr[fVar2.ordinal()];
                if (i22 != 1) {
                    if (i22 != 2) {
                        if (i22 != 3) {
                            if (i22 != 4) {
                                makeMeasureSpec2 = 0;
                            } else {
                                makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f6873g, i17, -2);
                                if (gVar.f4322s == 1) {
                                    z19 = true;
                                } else {
                                    z19 = false;
                                }
                                int i23 = bVar.f4851j;
                                if (i23 == 1 || i23 == 2) {
                                    if (view.getMeasuredWidth() == gVar.r()) {
                                        z20 = true;
                                    } else {
                                        z20 = false;
                                    }
                                    if (bVar.f4851j == 2 || !z19 || ((z19 && z20) || gVar.C())) {
                                        makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(gVar.l(), 1073741824);
                                    }
                                }
                            }
                        } else {
                            int i24 = this.f6873g;
                            if (dVar2 != null) {
                                i13 = gVar.J.f4284g;
                            } else {
                                i13 = 0;
                            }
                            if (dVar != null) {
                                i13 += gVar.L.f4284g;
                            }
                            makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(i24, i17 + i13, -1);
                        }
                    } else {
                        makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f6873g, i17, -2);
                    }
                } else {
                    makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i16, 1073741824);
                }
                e5.h hVar = (e5.h) gVar.U;
                ConstraintLayout constraintLayout = this.f6874h;
                if (hVar != null && e5.n.c(constraintLayout.f1160f0, 256) && view.getMeasuredWidth() == gVar.r() && view.getMeasuredWidth() < hVar.r() && view.getMeasuredHeight() == gVar.l() && view.getMeasuredHeight() < hVar.l() && view.getBaseline() == gVar.f4291b0 && !gVar.A() && a(gVar.G, makeMeasureSpec, gVar.r()) && a(gVar.H, makeMeasureSpec2, gVar.l())) {
                    bVar.f4846e = gVar.r();
                    bVar.f4847f = gVar.l();
                    bVar.f4848g = gVar.f4291b0;
                    return;
                }
                e5.f fVar3 = e5.f.MATCH_CONSTRAINT;
                if (fVar == fVar3) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (fVar2 == fVar3) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                e5.f fVar4 = e5.f.MATCH_PARENT;
                if (fVar2 != fVar4 && fVar2 != e5.f.FIXED) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                if (fVar != fVar4 && fVar != e5.f.FIXED) {
                    z13 = false;
                } else {
                    z13 = true;
                }
                if (z10 && gVar.X > 0.0f) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (z11 && gVar.X > 0.0f) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (view == null) {
                    return;
                }
                f fVar5 = (f) view.getLayoutParams();
                int i25 = bVar.f4851j;
                if (i25 != 1 && i25 != 2 && z10 && gVar.f4320r == 0 && z11 && gVar.f4322s == 0) {
                    z16 = false;
                    i12 = -1;
                    baseline = 0;
                    i2 = 0;
                    i10 = 0;
                } else {
                    if ((view instanceof z) && (gVar instanceof e5.p)) {
                        ((z) view).l((e5.p) gVar, makeMeasureSpec, makeMeasureSpec2);
                    } else {
                        view.measure(makeMeasureSpec, makeMeasureSpec2);
                    }
                    gVar.G = makeMeasureSpec;
                    gVar.H = makeMeasureSpec2;
                    gVar.f4300g = false;
                    int measuredWidth = view.getMeasuredWidth();
                    int measuredHeight = view.getMeasuredHeight();
                    int baseline2 = view.getBaseline();
                    int i26 = gVar.f4325u;
                    if (i26 > 0) {
                        i2 = Math.max(i26, measuredWidth);
                    } else {
                        i2 = measuredWidth;
                    }
                    int i27 = gVar.f4326v;
                    if (i27 > 0) {
                        i2 = Math.min(i27, i2);
                    }
                    int i28 = gVar.f4328x;
                    if (i28 > 0) {
                        i10 = Math.max(i28, measuredHeight);
                    } else {
                        i10 = measuredHeight;
                    }
                    int i29 = makeMeasureSpec2;
                    int i30 = gVar.f4329y;
                    if (i30 > 0) {
                        i10 = Math.min(i30, i10);
                    }
                    if (!e5.n.c(constraintLayout.f1160f0, 1)) {
                        if (z14 && z12) {
                            i2 = (int) ((i10 * gVar.X) + 0.5f);
                        } else if (z15 && z13) {
                            i10 = (int) ((i2 / gVar.X) + 0.5f);
                        }
                    }
                    if (measuredWidth == i2 && measuredHeight == i10) {
                        baseline = baseline2;
                        z16 = false;
                    } else {
                        if (measuredWidth != i2) {
                            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i2, 1073741824);
                        }
                        if (measuredHeight != i10) {
                            i11 = View.MeasureSpec.makeMeasureSpec(i10, 1073741824);
                        } else {
                            i11 = i29;
                        }
                        view.measure(makeMeasureSpec, i11);
                        gVar.G = makeMeasureSpec;
                        gVar.H = i11;
                        z16 = false;
                        gVar.f4300g = false;
                        int measuredWidth2 = view.getMeasuredWidth();
                        int measuredHeight2 = view.getMeasuredHeight();
                        baseline = view.getBaseline();
                        i2 = measuredWidth2;
                        i10 = measuredHeight2;
                    }
                    i12 = -1;
                }
                if (baseline != i12) {
                    z17 = true;
                } else {
                    z17 = z16;
                }
                if (i2 == bVar.f4844c && i10 == bVar.f4845d) {
                    z18 = z16;
                } else {
                    z18 = true;
                }
                bVar.f4850i = z18;
                if (fVar5.f6832c0) {
                    z17 = true;
                }
                if (z17 && baseline != -1 && gVar.f4291b0 != baseline) {
                    bVar.f4850i = true;
                }
                bVar.f4846e = i2;
                bVar.f4847f = i10;
                bVar.f4849h = z17;
                bVar.f4848g = baseline;
            }
        }
    }
}
