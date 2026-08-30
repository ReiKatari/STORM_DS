package oa;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.sidesheet.SideSheetBehavior;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a extends ij.a {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ int f10859e;

    /* renamed from: f  reason: collision with root package name */
    public final SideSheetBehavior f10860f;

    public /* synthetic */ a(SideSheetBehavior sideSheetBehavior, int i2) {
        this.f10859e = i2;
        this.f10860f = sideSheetBehavior;
    }

    @Override // ij.a
    public final void A0(ViewGroup.MarginLayoutParams marginLayoutParams, int i2, int i10) {
        switch (this.f10859e) {
            case 0:
                if (i2 <= this.f10860f.m) {
                    marginLayoutParams.leftMargin = i10;
                    return;
                }
                return;
            default:
                int i11 = this.f10860f.m;
                if (i2 <= i11) {
                    marginLayoutParams.rightMargin = i11 - i2;
                    return;
                }
                return;
        }
    }

    @Override // ij.a
    public final int R() {
        switch (this.f10859e) {
            case 0:
                SideSheetBehavior sideSheetBehavior = this.f10860f;
                return Math.max(0, sideSheetBehavior.f3091n + sideSheetBehavior.f3092o);
            default:
                SideSheetBehavior sideSheetBehavior2 = this.f10860f;
                return Math.max(0, (sideSheetBehavior2.m - sideSheetBehavior2.f3090l) - sideSheetBehavior2.f3092o);
        }
    }

    @Override // ij.a
    public final int S() {
        switch (this.f10859e) {
            case 0:
                SideSheetBehavior sideSheetBehavior = this.f10860f;
                return (-sideSheetBehavior.f3090l) - sideSheetBehavior.f3092o;
            default:
                return this.f10860f.m;
        }
    }

    @Override // ij.a
    public final int T() {
        switch (this.f10859e) {
            case 0:
                return this.f10860f.f3092o;
            default:
                return this.f10860f.m;
        }
    }

    @Override // ij.a
    public final int U() {
        switch (this.f10859e) {
            case 0:
                return -this.f10860f.f3090l;
            default:
                return R();
        }
    }

    @Override // ij.a
    public final int W(View view) {
        switch (this.f10859e) {
            case 0:
                return view.getRight() + this.f10860f.f3092o;
            default:
                return view.getLeft() - this.f10860f.f3092o;
        }
    }

    @Override // ij.a
    public final int X(CoordinatorLayout coordinatorLayout) {
        switch (this.f10859e) {
            case 0:
                return coordinatorLayout.getLeft();
            default:
                return coordinatorLayout.getRight();
        }
    }

    @Override // ij.a
    public final int d0() {
        switch (this.f10859e) {
            case 0:
                return 1;
            default:
                return 0;
        }
    }

    @Override // ij.a
    public final boolean m0(float f8) {
        switch (this.f10859e) {
            case 0:
                if (f8 > 0.0f) {
                    return true;
                }
                return false;
            default:
                if (f8 < 0.0f) {
                    return true;
                }
                return false;
        }
    }

    @Override // ij.a
    public final boolean n0(View view) {
        switch (this.f10859e) {
            case 0:
                if (view.getRight() < (R() - S()) / 2) {
                    return true;
                }
                return false;
            default:
                if (view.getLeft() > (R() + this.f10860f.m) / 2) {
                    return true;
                }
                return false;
        }
    }

    @Override // ij.a
    public final boolean o0(float f8, float f10) {
        switch (this.f10859e) {
            case 0:
                if (Math.abs(f8) > Math.abs(f10) && Math.abs(f8) > 500) {
                    return true;
                }
                return false;
            default:
                if (Math.abs(f8) > Math.abs(f10) && Math.abs(f8) > 500) {
                    return true;
                }
                return false;
        }
    }

    @Override // ij.a
    public final boolean v0(View view, float f8) {
        switch (this.f10859e) {
            case 0:
                if (Math.abs((f8 * this.f10860f.f3089k) + view.getLeft()) > 0.5f) {
                    return true;
                }
                return false;
            default:
                if (Math.abs((f8 * this.f10860f.f3089k) + view.getRight()) > 0.5f) {
                    return true;
                }
                return false;
        }
    }

    @Override // ij.a
    public final int y(ViewGroup.MarginLayoutParams marginLayoutParams) {
        switch (this.f10859e) {
            case 0:
                return marginLayoutParams.leftMargin;
            default:
                return marginLayoutParams.rightMargin;
        }
    }

    @Override // ij.a
    public final float z(int i2) {
        switch (this.f10859e) {
            case 0:
                float S = S();
                return (i2 - S) / (R() - S);
            default:
                float f8 = this.f10860f.m;
                return (f8 - i2) / (f8 - R());
        }
    }
}
