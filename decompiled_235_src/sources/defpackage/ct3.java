package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.sidesheet.SideSheetBehavior;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ct3  reason: default package */
/* loaded from: classes.dex */
public final class ct3 extends ln2 {
    public final /* synthetic */ int g;
    public final SideSheetBehavior h;

    public /* synthetic */ ct3(SideSheetBehavior sideSheetBehavior, int i) {
        this.g = i;
        this.h = sideSheetBehavior;
    }

    @Override // defpackage.ln2
    public final int B() {
        switch (this.g) {
            case 0:
                return 1;
            default:
                return 0;
        }
    }

    @Override // defpackage.ln2
    public final boolean I(float f) {
        switch (this.g) {
            case 0:
                if (f > RecyclerView.B1) {
                    return true;
                }
                return false;
            default:
                if (f < RecyclerView.B1) {
                    return true;
                }
                return false;
        }
    }

    @Override // defpackage.ln2
    public final boolean J(View view) {
        switch (this.g) {
            case 0:
                if (view.getRight() >= (u() - v()) / 2) {
                    return false;
                }
                return true;
            default:
                if (view.getLeft() <= (u() + this.h.m) / 2) {
                    return false;
                }
                return true;
        }
    }

    @Override // defpackage.ln2
    public final boolean K(float f, float f2) {
        switch (this.g) {
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

    @Override // defpackage.ln2
    public final boolean c0(View view, float f) {
        int i = this.g;
        SideSheetBehavior sideSheetBehavior = this.h;
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

    @Override // defpackage.ln2
    public final void g0(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        switch (this.g) {
            case 0:
                marginLayoutParams.leftMargin = i;
                return;
            default:
                marginLayoutParams.rightMargin = i;
                return;
        }
    }

    @Override // defpackage.ln2
    public final void h0(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2) {
        int i3 = this.g;
        SideSheetBehavior sideSheetBehavior = this.h;
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

    @Override // defpackage.ln2
    public final int i(ViewGroup.MarginLayoutParams marginLayoutParams) {
        switch (this.g) {
            case 0:
                return marginLayoutParams.leftMargin;
            default:
                return marginLayoutParams.rightMargin;
        }
    }

    @Override // defpackage.ln2
    public final float j(int i) {
        switch (this.g) {
            case 0:
                float v = v();
                return (i - v) / (u() - v);
            default:
                float f = this.h.m;
                return (f - i) / (f - u());
        }
    }

    @Override // defpackage.ln2
    public final int s(ViewGroup.MarginLayoutParams marginLayoutParams) {
        switch (this.g) {
            case 0:
                return marginLayoutParams.leftMargin;
            default:
                return marginLayoutParams.rightMargin;
        }
    }

    @Override // defpackage.ln2
    public final int u() {
        int i = this.g;
        SideSheetBehavior sideSheetBehavior = this.h;
        switch (i) {
            case 0:
                return Math.max(0, sideSheetBehavior.n + sideSheetBehavior.o);
            default:
                return Math.max(0, (sideSheetBehavior.m - sideSheetBehavior.l) - sideSheetBehavior.o);
        }
    }

    @Override // defpackage.ln2
    public final int v() {
        int i = this.g;
        SideSheetBehavior sideSheetBehavior = this.h;
        switch (i) {
            case 0:
                return (-sideSheetBehavior.l) - sideSheetBehavior.o;
            default:
                return sideSheetBehavior.m;
        }
    }

    @Override // defpackage.ln2
    public final int w() {
        int i = this.g;
        SideSheetBehavior sideSheetBehavior = this.h;
        switch (i) {
            case 0:
                return sideSheetBehavior.o;
            default:
                return sideSheetBehavior.m;
        }
    }

    @Override // defpackage.ln2
    public final int x() {
        switch (this.g) {
            case 0:
                return -this.h.l;
            default:
                return u();
        }
    }

    @Override // defpackage.ln2
    public final int y(View view) {
        int i = this.g;
        SideSheetBehavior sideSheetBehavior = this.h;
        switch (i) {
            case 0:
                return view.getRight() + sideSheetBehavior.o;
            default:
                return view.getLeft() - sideSheetBehavior.o;
        }
    }

    @Override // defpackage.ln2
    public final int z(CoordinatorLayout coordinatorLayout) {
        switch (this.g) {
            case 0:
                return coordinatorLayout.getLeft();
            default:
                return coordinatorLayout.getRight();
        }
    }
}
