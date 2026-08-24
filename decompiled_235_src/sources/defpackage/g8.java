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
import com.stormds.emulator.R;
import java.util.ArrayList;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: g8  reason: default package */
/* loaded from: classes.dex */
public final class g8 implements b54 {
    public final Context A;
    public Context B;
    public i44 L;
    public final LayoutInflater R;
    public a54 X;
    public d54 d0;
    public f8 e0;
    public Drawable f0;
    public boolean g0;
    public boolean h0;
    public boolean i0;
    public int j0;
    public int k0;
    public int l0;
    public boolean m0;
    public d8 o0;
    public d8 p0;
    public uo2 q0;
    public e8 r0;
    public final int Y = R.layout.abc_action_menu_layout;
    public final int Z = R.layout.abc_action_menu_item_layout;
    public final SparseBooleanArray n0 = new SparseBooleanArray();
    public final os0 s0 = new os0(this, 5);

    public g8(Context context) {
        this.A = context;
        this.R = LayoutInflater.from(context);
    }

    public final View a(o44 o44Var, View view, ViewGroup viewGroup) {
        c54 c54Var;
        View actionView = o44Var.getActionView();
        int i = 0;
        if (actionView == null || o44Var.e()) {
            if (view instanceof c54) {
                c54Var = (c54) view;
            } else {
                c54Var = (c54) this.R.inflate(this.Z, viewGroup, false);
            }
            c54Var.c(o44Var);
            ActionMenuItemView actionMenuItemView = (ActionMenuItemView) c54Var;
            actionMenuItemView.setItemInvoker((ActionMenuView) this.d0);
            if (this.r0 == null) {
                this.r0 = new e8(this);
            }
            actionMenuItemView.setPopupCallback(this.r0);
            actionView = (View) c54Var;
        }
        if (o44Var.C) {
            i = 8;
        }
        actionView.setVisibility(i);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        ((ActionMenuView) viewGroup).getClass();
        if (!(layoutParams instanceof i8)) {
            actionView.setLayoutParams(ActionMenuView.k(layoutParams));
        }
        return actionView;
    }

    @Override // defpackage.b54
    public final boolean b(it6 it6Var) {
        boolean z;
        if (it6Var.hasVisibleItems()) {
            it6 it6Var2 = it6Var;
            while (true) {
                i44 i44Var = it6Var2.z;
                if (i44Var == this.L) {
                    break;
                }
                it6Var2 = (it6) i44Var;
            }
            o44 o44Var = it6Var2.A;
            ViewGroup viewGroup = (ViewGroup) this.d0;
            View view = null;
            if (viewGroup != null) {
                int childCount = viewGroup.getChildCount();
                int i = 0;
                while (true) {
                    if (i >= childCount) {
                        break;
                    }
                    View childAt = viewGroup.getChildAt(i);
                    if ((childAt instanceof c54) && ((c54) childAt).getItemData() == o44Var) {
                        view = childAt;
                        break;
                    }
                    i++;
                }
            }
            if (view != null) {
                it6Var.A.getClass();
                int size = it6Var.f.size();
                int i2 = 0;
                while (true) {
                    if (i2 < size) {
                        MenuItem item = it6Var.getItem(i2);
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
                d8 d8Var = new d8(this, this.B, it6Var, view);
                this.p0 = d8Var;
                d8Var.g = z;
                t44 t44Var = d8Var.i;
                if (t44Var != null) {
                    t44Var.o(z);
                }
                d8 d8Var2 = this.p0;
                if (!d8Var2.b()) {
                    if (d8Var2.e != null) {
                        d8Var2.d(0, 0, false, false);
                    } else {
                        i.m("MenuPopupHelper cannot be used without an anchor");
                        return false;
                    }
                }
                a54 a54Var = this.X;
                if (a54Var != null) {
                    a54Var.M(it6Var);
                }
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.b54
    public final boolean c() {
        int i;
        ArrayList arrayList;
        int i2;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        g8 g8Var = this;
        i44 i44Var = g8Var.L;
        if (i44Var != null) {
            arrayList = i44Var.l();
            i = arrayList.size();
        } else {
            i = 0;
            arrayList = null;
        }
        int i3 = g8Var.l0;
        int i4 = g8Var.k0;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) g8Var.d0;
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
            o44 o44Var = (o44) arrayList.get(i5);
            int i8 = o44Var.y;
            if ((i8 & 2) == 2) {
                i6++;
            } else if ((i8 & 1) == 1) {
                i7++;
            } else {
                z5 = true;
            }
            if (g8Var.m0 && o44Var.C) {
                i3 = 0;
            }
            i5++;
        }
        if (g8Var.h0 && (z5 || i7 + i6 > i3)) {
            i3--;
        }
        int i9 = i3 - i6;
        SparseBooleanArray sparseBooleanArray = g8Var.n0;
        sparseBooleanArray.clear();
        int i10 = 0;
        int i11 = 0;
        while (i10 < i) {
            o44 o44Var2 = (o44) arrayList.get(i10);
            int i12 = o44Var2.y;
            if ((i12 & 2) == i2) {
                z2 = z;
            } else {
                z2 = false;
            }
            int i13 = o44Var2.b;
            if (z2) {
                View a = g8Var.a(o44Var2, null, viewGroup);
                a.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredWidth = a.getMeasuredWidth();
                i4 -= measuredWidth;
                if (i11 == 0) {
                    i11 = measuredWidth;
                }
                if (i13 != 0) {
                    sparseBooleanArray.put(i13, z);
                }
                o44Var2.f(z);
            } else if ((i12 & 1) == z) {
                boolean z6 = sparseBooleanArray.get(i13);
                if ((i9 > 0 || z6) && i4 > 0) {
                    z3 = z;
                } else {
                    z3 = false;
                }
                if (z3) {
                    View a2 = g8Var.a(o44Var2, null, viewGroup);
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
                        o44 o44Var3 = (o44) arrayList.get(i14);
                        if (o44Var3.b == i13) {
                            if ((o44Var3.x & 32) == 32) {
                                i9++;
                            }
                            o44Var3.f(false);
                        }
                    }
                }
                if (z3) {
                    i9--;
                }
                o44Var2.f(z3);
            } else {
                o44Var2.f(false);
                i10++;
                i2 = 2;
                g8Var = this;
                z = true;
            }
            i10++;
            i2 = 2;
            g8Var = this;
            z = true;
        }
        return z;
    }

    @Override // defpackage.b54
    public final void d(i44 i44Var, boolean z) {
        e();
        d8 d8Var = this.p0;
        if (d8Var != null && d8Var.b()) {
            d8Var.i.dismiss();
        }
        a54 a54Var = this.X;
        if (a54Var != null) {
            a54Var.d(i44Var, z);
        }
    }

    public final boolean e() {
        d54 d54Var;
        uo2 uo2Var = this.q0;
        if (uo2Var != null && (d54Var = this.d0) != null) {
            ((View) d54Var).removeCallbacks(uo2Var);
            this.q0 = null;
            return true;
        }
        d8 d8Var = this.o0;
        if (d8Var != null) {
            if (d8Var.b()) {
                d8Var.i.dismiss();
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.b54
    public final boolean f(o44 o44Var) {
        return false;
    }

    @Override // defpackage.b54
    public final void g(a54 a54Var) {
        throw null;
    }

    @Override // defpackage.b54
    public final boolean h(o44 o44Var) {
        return false;
    }

    @Override // defpackage.b54
    public final void i() {
        int i;
        o44 o44Var;
        ViewGroup viewGroup = (ViewGroup) this.d0;
        ArrayList arrayList = null;
        boolean z = false;
        if (viewGroup != null) {
            i44 i44Var = this.L;
            if (i44Var != null) {
                i44Var.i();
                ArrayList l = this.L.l();
                int size = l.size();
                i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    o44 o44Var2 = (o44) l.get(i2);
                    if ((o44Var2.x & 32) == 32) {
                        View childAt = viewGroup.getChildAt(i);
                        if (childAt instanceof c54) {
                            o44Var = ((c54) childAt).getItemData();
                        } else {
                            o44Var = null;
                        }
                        View a = a(o44Var2, childAt, viewGroup);
                        if (o44Var2 != o44Var) {
                            a.setPressed(false);
                            a.jumpDrawablesToCurrentState();
                        }
                        if (a != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) a.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(a);
                            }
                            ((ViewGroup) this.d0).addView(a, i);
                        }
                        i++;
                    }
                }
            } else {
                i = 0;
            }
            while (i < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i) == this.e0) {
                    i++;
                } else {
                    viewGroup.removeViewAt(i);
                }
            }
        }
        ((View) this.d0).requestLayout();
        i44 i44Var2 = this.L;
        if (i44Var2 != null) {
            i44Var2.i();
            ArrayList arrayList2 = i44Var2.i;
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                p44 p44Var = ((o44) arrayList2.get(i3)).A;
            }
        }
        i44 i44Var3 = this.L;
        if (i44Var3 != null) {
            i44Var3.i();
            arrayList = i44Var3.j;
        }
        if (this.h0 && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z = !((o44) arrayList.get(0)).C;
            } else if (size3 > 0) {
                z = true;
            }
        }
        f8 f8Var = this.e0;
        if (z) {
            if (f8Var == null) {
                this.e0 = new f8(this, this.A);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.e0.getParent();
            if (viewGroup3 != this.d0) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.e0);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.d0;
                f8 f8Var2 = this.e0;
                actionMenuView.getClass();
                i8 j = ActionMenuView.j();
                j.a = true;
                actionMenuView.addView(f8Var2, j);
            }
        } else if (f8Var != null) {
            ViewParent parent = f8Var.getParent();
            d54 d54Var = this.d0;
            if (parent == d54Var) {
                ((ViewGroup) d54Var).removeView(this.e0);
            }
        }
        ((ActionMenuView) this.d0).setOverflowReserved(this.h0);
    }

    public final boolean j() {
        d8 d8Var = this.o0;
        if (d8Var != null && d8Var.b()) {
            return true;
        }
        return false;
    }

    @Override // defpackage.b54
    public final void k(Context context, i44 i44Var) {
        this.B = context;
        LayoutInflater.from(context);
        this.L = i44Var;
        Resources resources = context.getResources();
        if (!this.i0) {
            this.h0 = true;
        }
        int i = 2;
        this.j0 = context.getResources().getDisplayMetrics().widthPixels / 2;
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
        this.l0 = i;
        int i4 = this.j0;
        if (this.h0) {
            if (this.e0 == null) {
                f8 f8Var = new f8(this, this.A);
                this.e0 = f8Var;
                if (this.g0) {
                    f8Var.setImageDrawable(this.f0);
                    this.f0 = null;
                    this.g0 = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.e0.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i4 -= this.e0.getMeasuredWidth();
        } else {
            this.e0 = null;
        }
        this.k0 = i4;
        float f = resources.getDisplayMetrics().density;
    }

    public final boolean l() {
        i44 i44Var;
        if (this.h0 && !j() && (i44Var = this.L) != null && this.d0 != null && this.q0 == null) {
            i44Var.i();
            if (!i44Var.j.isEmpty()) {
                uo2 uo2Var = new uo2(1, this, new d8(this, this.B, this.L, this.e0), false);
                this.q0 = uo2Var;
                ((View) this.d0).post(uo2Var);
                return true;
            }
        }
        return false;
    }
}
