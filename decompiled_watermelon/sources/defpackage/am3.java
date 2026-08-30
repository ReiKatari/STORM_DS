package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.sidesheet.SideSheetBehavior;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: am3  reason: default package */
/* loaded from: classes.dex */
public final class am3 extends io2 {
    public final /* synthetic */ int j;
    public final SideSheetBehavior k;

    public /* synthetic */ am3(SideSheetBehavior sideSheetBehavior, int i) {
        this.j = i;
        this.k = sideSheetBehavior;
    }

    @Override // defpackage.io2
    public final int A() {
        int i = this.j;
        SideSheetBehavior sideSheetBehavior = this.k;
        switch (i) {
            case 0:
                return Math.max(0, sideSheetBehavior.n + sideSheetBehavior.o);
            default:
                return Math.max(0, (sideSheetBehavior.m - sideSheetBehavior.l) - sideSheetBehavior.o);
        }
    }

    @Override // defpackage.io2
    public final int B() {
        int i = this.j;
        SideSheetBehavior sideSheetBehavior = this.k;
        switch (i) {
            case 0:
                return (-sideSheetBehavior.l) - sideSheetBehavior.o;
            default:
                return sideSheetBehavior.m;
        }
    }

    @Override // defpackage.io2
    public final int D() {
        int i = this.j;
        SideSheetBehavior sideSheetBehavior = this.k;
        switch (i) {
            case 0:
                return sideSheetBehavior.o;
            default:
                return sideSheetBehavior.m;
        }
    }

    @Override // defpackage.io2
    public final int E() {
        switch (this.j) {
            case 0:
                return -this.k.l;
            default:
                return A();
        }
    }

    @Override // defpackage.io2
    public final int G(View view) {
        int i = this.j;
        SideSheetBehavior sideSheetBehavior = this.k;
        switch (i) {
            case 0:
                return view.getRight() + sideSheetBehavior.o;
            default:
                return view.getLeft() - sideSheetBehavior.o;
        }
    }

    @Override // defpackage.io2
    public final int H(CoordinatorLayout coordinatorLayout) {
        switch (this.j) {
            case 0:
                return coordinatorLayout.getLeft();
            default:
                return coordinatorLayout.getRight();
        }
    }

    @Override // defpackage.io2
    public final int K() {
        switch (this.j) {
            case 0:
                return 1;
            default:
                return 0;
        }
    }

    @Override // defpackage.io2
    public final boolean S(float f) {
        switch (this.j) {
            case 0:
                if (f > RecyclerView.A1) {
                    return true;
                }
                return false;
            default:
                if (f < RecyclerView.A1) {
                    return true;
                }
                return false;
        }
    }

    @Override // defpackage.io2
    public final boolean T(View view) {
        switch (this.j) {
            case 0:
                if (view.getRight() >= (A() - B()) / 2) {
                    return false;
                }
                return true;
            default:
                if (view.getLeft() <= (A() + this.k.m) / 2) {
                    return false;
                }
                return true;
        }
    }

    @Override // defpackage.io2
    public final boolean U(float f, float f2) {
        switch (this.j) {
            case 0:
                if (Math.abs(f) > Math.abs(f2) && Math.abs(f) > 500.0f) {
                    return true;
                }
                return false;
            default:
                if (Math.abs(f) > Math.abs(f2) && Math.abs(f) > 500.0f) {
                    return true;
                }
                return false;
        }
    }

    @Override // defpackage.io2
    public final int h(ViewGroup.MarginLayoutParams marginLayoutParams) {
        switch (this.j) {
            case 0:
                return marginLayoutParams.leftMargin;
            default:
                return marginLayoutParams.rightMargin;
        }
    }

    @Override // defpackage.io2
    public final float i(int i) {
        switch (this.j) {
            case 0:
                float B = B();
                return (i - B) / (A() - B);
            default:
                float f = this.k.m;
                return (f - i) / (f - A());
        }
    }

    @Override // defpackage.io2
    public final boolean m0(View view, float f) {
        int i = this.j;
        SideSheetBehavior sideSheetBehavior = this.k;
        switch (i) {
            case 0:
                if (Math.abs((f * sideSheetBehavior.k) + view.getLeft()) <= 0.5f) {
                    return false;
                }
                return true;
            default:
                if (Math.abs((f * sideSheetBehavior.k) + view.getRight()) <= 0.5f) {
                    return false;
                }
                return true;
        }
    }

    @Override // defpackage.io2
    public final void u0(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2) {
        int i3 = this.j;
        SideSheetBehavior sideSheetBehavior = this.k;
        switch (i3) {
            case 0:
                if (i <= sideSheetBehavior.m) {
                    marginLayoutParams.leftMargin = i2;
                    return;
                }
                return;
            default:
                int i4 = sideSheetBehavior.m;
                if (i <= i4) {
                    marginLayoutParams.rightMargin = i4 - i;
                    return;
                }
                return;
        }
    }
}
