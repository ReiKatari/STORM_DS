package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: d87  reason: default package */
/* loaded from: classes.dex */
public final class d87 implements b54 {
    public i44 A;
    public o44 B;
    public final /* synthetic */ Toolbar L;

    public d87(Toolbar toolbar) {
        this.L = toolbar;
    }

    @Override // defpackage.b54
    public final boolean b(it6 it6Var) {
        return false;
    }

    @Override // defpackage.b54
    public final boolean c() {
        return false;
    }

    @Override // defpackage.b54
    public final boolean f(o44 o44Var) {
        Toolbar toolbar = this.L;
        View view = toolbar.h0;
        if (view instanceof zs0) {
            ((zs0) view).onActionViewCollapsed();
        }
        toolbar.removeView(toolbar.h0);
        toolbar.removeView(toolbar.g0);
        toolbar.h0 = null;
        ArrayList arrayList = toolbar.D0;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.B = null;
        toolbar.requestLayout();
        o44Var.C = false;
        o44Var.n.p(false);
        toolbar.x();
        return true;
    }

    @Override // defpackage.b54
    public final boolean h(o44 o44Var) {
        Toolbar toolbar = this.L;
        toolbar.c();
        ViewParent parent = toolbar.g0.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.g0);
            }
            toolbar.addView(toolbar.g0);
        }
        View actionView = o44Var.getActionView();
        toolbar.h0 = actionView;
        this.B = o44Var;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.h0);
            }
            e87 h = Toolbar.h();
            h.a = (toolbar.m0 & 112) | 8388611;
            h.b = 2;
            toolbar.h0.setLayoutParams(h);
            toolbar.addView(toolbar.h0);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((e87) childAt.getLayoutParams()).b != 2 && childAt != toolbar.A) {
                toolbar.removeViewAt(childCount);
                toolbar.D0.add(childAt);
            }
        }
        toolbar.requestLayout();
        o44Var.C = true;
        o44Var.n.p(false);
        View view = toolbar.h0;
        if (view instanceof zs0) {
            ((zs0) view).onActionViewExpanded();
        }
        toolbar.x();
        return true;
    }

    @Override // defpackage.b54
    public final void i() {
        if (this.B != null) {
            i44 i44Var = this.A;
            if (i44Var != null) {
                int size = i44Var.f.size();
                for (int i = 0; i < size; i++) {
                    if (this.A.getItem(i) == this.B) {
                        return;
                    }
                }
            }
            f(this.B);
        }
    }

    @Override // defpackage.b54
    public final void k(Context context, i44 i44Var) {
        o44 o44Var;
        i44 i44Var2 = this.A;
        if (i44Var2 != null && (o44Var = this.B) != null) {
            i44Var2.d(o44Var);
        }
        this.A = i44Var;
    }

    @Override // defpackage.b54
    public final void d(i44 i44Var, boolean z) {
    }
}
