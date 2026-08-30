package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import java.util.ArrayList;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: f8  reason: default package */
/* loaded from: classes.dex */
public final class f8 implements mx3 {
    public final Context A;
    public Context B;
    public uw3 L;
    public final LayoutInflater R;
    public lx3 X;
    public ox3 c0;
    public e8 d0;
    public Drawable e0;
    public boolean f0;
    public boolean g0;
    public boolean h0;
    public int i0;
    public int j0;
    public int k0;
    public boolean l0;
    public c8 n0;
    public c8 o0;
    public qj2 p0;
    public d8 q0;
    public final int Y = R.layout.abc_action_menu_layout;
    public final int Z = R.layout.abc_action_menu_item_layout;
    public final SparseBooleanArray m0 = new SparseBooleanArray();
    public final bq0 r0 = new bq0(5, this);

    public f8(Context context) {
        this.A = context;
        this.R = LayoutInflater.from(context);
    }

    public final View a(zw3 zw3Var, View view, ViewGroup viewGroup) {
        nx3 nx3Var;
        View actionView = zw3Var.getActionView();
        int i = 0;
        if (actionView == null || zw3Var.e()) {
            if (view instanceof nx3) {
                nx3Var = (nx3) view;
            } else {
                nx3Var = (nx3) this.R.inflate(this.Z, viewGroup, false);
            }
            nx3Var.c(zw3Var);
            ActionMenuItemView actionMenuItemView = (ActionMenuItemView) nx3Var;
            actionMenuItemView.setItemInvoker((ActionMenuView) this.c0);
            if (this.q0 == null) {
                this.q0 = new d8(this);
            }
            actionMenuItemView.setPopupCallback(this.q0);
            actionView = (View) nx3Var;
        }
        if (zw3Var.C) {
            i = 8;
        }
        actionView.setVisibility(i);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        ((ActionMenuView) viewGroup).getClass();
        if (!(layoutParams instanceof h8)) {
            actionView.setLayoutParams(ActionMenuView.k(layoutParams));
        }
        return actionView;
    }

    @Override // defpackage.mx3
    public final boolean b(zw3 zw3Var) {
        return false;
    }

    public final boolean c() {
        ox3 ox3Var;
        qj2 qj2Var = this.p0;
        if (qj2Var != null && (ox3Var = this.c0) != null) {
            ((View) ox3Var).removeCallbacks(qj2Var);
            this.p0 = null;
            return true;
        }
        c8 c8Var = this.n0;
        if (c8Var != null) {
            if (c8Var.b()) {
                c8Var.i.dismiss();
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.mx3
    public final void d(lx3 lx3Var) {
        throw null;
    }

    @Override // defpackage.mx3
    public final boolean e(zw3 zw3Var) {
        return false;
    }

    @Override // defpackage.mx3
    public final void f(uw3 uw3Var, boolean z) {
        c();
        c8 c8Var = this.o0;
        if (c8Var != null && c8Var.b()) {
            c8Var.i.dismiss();
        }
        lx3 lx3Var = this.X;
        if (lx3Var != null) {
            lx3Var.f(uw3Var, z);
        }
    }

    @Override // defpackage.mx3
    public final void g() {
        int i;
        zw3 zw3Var;
        ViewGroup viewGroup = (ViewGroup) this.c0;
        ArrayList arrayList = null;
        boolean z = false;
        if (viewGroup != null) {
            uw3 uw3Var = this.L;
            if (uw3Var != null) {
                uw3Var.i();
                ArrayList l = this.L.l();
                int size = l.size();
                i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    zw3 zw3Var2 = (zw3) l.get(i2);
                    if ((zw3Var2.x & 32) == 32) {
                        View childAt = viewGroup.getChildAt(i);
                        if (childAt instanceof nx3) {
                            zw3Var = ((nx3) childAt).getItemData();
                        } else {
                            zw3Var = null;
                        }
                        View a = a(zw3Var2, childAt, viewGroup);
                        if (zw3Var2 != zw3Var) {
                            a.setPressed(false);
                            a.jumpDrawablesToCurrentState();
                        }
                        if (a != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) a.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(a);
                            }
                            ((ViewGroup) this.c0).addView(a, i);
                        }
                        i++;
                    }
                }
            } else {
                i = 0;
            }
            while (i < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i) == this.d0) {
                    i++;
                } else {
                    viewGroup.removeViewAt(i);
                }
            }
        }
        ((View) this.c0).requestLayout();
        uw3 uw3Var2 = this.L;
        if (uw3Var2 != null) {
            uw3Var2.i();
            ArrayList arrayList2 = uw3Var2.i;
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                ax3 ax3Var = ((zw3) arrayList2.get(i3)).A;
            }
        }
        uw3 uw3Var3 = this.L;
        if (uw3Var3 != null) {
            uw3Var3.i();
            arrayList = uw3Var3.j;
        }
        if (this.g0 && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z = !((zw3) arrayList.get(0)).C;
            } else if (size3 > 0) {
                z = true;
            }
        }
        e8 e8Var = this.d0;
        if (z) {
            if (e8Var == null) {
                this.d0 = new e8(this, this.A);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.d0.getParent();
            if (viewGroup3 != this.c0) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.d0);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.c0;
                e8 e8Var2 = this.d0;
                actionMenuView.getClass();
                h8 j = ActionMenuView.j();
                j.a = true;
                actionMenuView.addView(e8Var2, j);
            }
        } else if (e8Var != null) {
            ViewParent parent = e8Var.getParent();
            ox3 ox3Var = this.c0;
            if (parent == ox3Var) {
                ((ViewGroup) ox3Var).removeView(this.d0);
            }
        }
        ((ActionMenuView) this.c0).setOverflowReserved(this.g0);
    }

    public final boolean h() {
        c8 c8Var = this.n0;
        if (c8Var != null && c8Var.b()) {
            return true;
        }
        return false;
    }

    @Override // defpackage.mx3
    public final void i(Context context, uw3 uw3Var) {
        this.B = context;
        LayoutInflater.from(context);
        this.L = uw3Var;
        Resources resources = context.getResources();
        if (!this.h0) {
            this.g0 = true;
        }
        int i = 2;
        this.i0 = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i2 = configuration.screenWidthDp;
        int i3 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp <= 600 && i2 <= 600 && ((i2 <= 960 || i3 <= 720) && (i2 <= 720 || i3 <= 960))) {
            if (i2 < 500 && ((i2 <= 640 || i3 <= 480) && (i2 <= 480 || i3 <= 640))) {
                if (i2 >= 360) {
                    i = 3;
                }
            } else {
                i = 4;
            }
        } else {
            i = 5;
        }
        this.k0 = i;
        int i4 = this.i0;
        if (this.g0) {
            if (this.d0 == null) {
                e8 e8Var = new e8(this, this.A);
                this.d0 = e8Var;
                if (this.f0) {
                    e8Var.setImageDrawable(this.e0);
                    this.e0 = null;
                    this.f0 = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.d0.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i4 -= this.d0.getMeasuredWidth();
        } else {
            this.d0 = null;
        }
        this.j0 = i4;
        float f = resources.getDisplayMetrics().density;
    }

    @Override // defpackage.mx3
    public final boolean j(rh6 rh6Var) {
        boolean z;
        if (rh6Var.hasVisibleItems()) {
            rh6 rh6Var2 = rh6Var;
            while (true) {
                uw3 uw3Var = rh6Var2.z;
                if (uw3Var == this.L) {
                    break;
                }
                rh6Var2 = (rh6) uw3Var;
            }
            zw3 zw3Var = rh6Var2.A;
            ViewGroup viewGroup = (ViewGroup) this.c0;
            View view = null;
            if (viewGroup != null) {
                int childCount = viewGroup.getChildCount();
                int i = 0;
                while (true) {
                    if (i >= childCount) {
                        break;
                    }
                    View childAt = viewGroup.getChildAt(i);
                    if ((childAt instanceof nx3) && ((nx3) childAt).getItemData() == zw3Var) {
                        view = childAt;
                        break;
                    }
                    i++;
                }
            }
            if (view != null) {
                rh6Var.A.getClass();
                int size = rh6Var.f.size();
                int i2 = 0;
                while (true) {
                    if (i2 < size) {
                        MenuItem item = rh6Var.getItem(i2);
                        if (item.isVisible() && item.getIcon() != null) {
                            z = true;
                            break;
                        }
                        i2++;
                    } else {
                        z = false;
                        break;
                    }
                }
                c8 c8Var = new c8(this, this.B, rh6Var, view);
                this.o0 = c8Var;
                c8Var.g = z;
                ex3 ex3Var = c8Var.i;
                if (ex3Var != null) {
                    ex3Var.o(z);
                }
                c8 c8Var2 = this.o0;
                if (!c8Var2.b()) {
                    if (c8Var2.e != null) {
                        c8Var2.d(0, 0, false, false);
                    } else {
                        i.n("MenuPopupHelper cannot be used without an anchor");
                        return false;
                    }
                }
                lx3 lx3Var = this.X;
                if (lx3Var != null) {
                    lx3Var.M(rh6Var);
                }
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.mx3
    public final boolean k() {
        int i;
        ArrayList arrayList;
        int i2;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        f8 f8Var = this;
        uw3 uw3Var = f8Var.L;
        if (uw3Var != null) {
            arrayList = uw3Var.l();
            i = arrayList.size();
        } else {
            i = 0;
            arrayList = null;
        }
        int i3 = f8Var.k0;
        int i4 = f8Var.j0;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) f8Var.c0;
        int i5 = 0;
        boolean z5 = false;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            i2 = 2;
            z = true;
            if (i5 >= i) {
                break;
            }
            zw3 zw3Var = (zw3) arrayList.get(i5);
            int i8 = zw3Var.y;
            if ((i8 & 2) == 2) {
                i6++;
            } else if ((i8 & 1) == 1) {
                i7++;
            } else {
                z5 = true;
            }
            if (f8Var.l0 && zw3Var.C) {
                i3 = 0;
            }
            i5++;
        }
        if (f8Var.g0 && (z5 || i7 + i6 > i3)) {
            i3--;
        }
        int i9 = i3 - i6;
        SparseBooleanArray sparseBooleanArray = f8Var.m0;
        sparseBooleanArray.clear();
        int i10 = 0;
        int i11 = 0;
        while (i10 < i) {
            zw3 zw3Var2 = (zw3) arrayList.get(i10);
            int i12 = zw3Var2.y;
            if ((i12 & 2) == i2) {
                z2 = z;
            } else {
                z2 = false;
            }
            int i13 = zw3Var2.b;
            if (z2) {
                View a = f8Var.a(zw3Var2, null, viewGroup);
                a.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredWidth = a.getMeasuredWidth();
                i4 -= measuredWidth;
                if (i11 == 0) {
                    i11 = measuredWidth;
                }
                if (i13 != 0) {
                    sparseBooleanArray.put(i13, z);
                }
                zw3Var2.f(z);
            } else if ((i12 & 1) == z) {
                boolean z6 = sparseBooleanArray.get(i13);
                if ((i9 > 0 || z6) && i4 > 0) {
                    z3 = z;
                } else {
                    z3 = false;
                }
                if (z3) {
                    View a2 = f8Var.a(zw3Var2, null, viewGroup);
                    a2.measure(makeMeasureSpec, makeMeasureSpec);
                    int measuredWidth2 = a2.getMeasuredWidth();
                    i4 -= measuredWidth2;
                    if (i11 == 0) {
                        i11 = measuredWidth2;
                    }
                    if (i4 + i11 > 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    z3 &= z4;
                }
                if (z3 && i13 != 0) {
                    sparseBooleanArray.put(i13, true);
                } else if (z6) {
                    sparseBooleanArray.put(i13, false);
                    for (int i14 = 0; i14 < i10; i14++) {
                        zw3 zw3Var3 = (zw3) arrayList.get(i14);
                        if (zw3Var3.b == i13) {
                            if ((zw3Var3.x & 32) == 32) {
                                i9++;
                            }
                            zw3Var3.f(false);
                        }
                    }
                }
                if (z3) {
                    i9--;
                }
                zw3Var2.f(z3);
            } else {
                zw3Var2.f(false);
                i10++;
                i2 = 2;
                f8Var = this;
                z = true;
            }
            i10++;
            i2 = 2;
            f8Var = this;
            z = true;
        }
        return z;
    }

    public final boolean l() {
        uw3 uw3Var;
        if (this.g0 && !h() && (uw3Var = this.L) != null && this.c0 != null && this.p0 == null) {
            uw3Var.i();
            if (!uw3Var.j.isEmpty()) {
                qj2 qj2Var = new qj2(1, this, new c8(this, this.B, this.L, this.d0), false);
                this.p0 = qj2Var;
                ((View) this.c0).post(qj2Var);
                return true;
            }
        }
        return false;
    }
}
