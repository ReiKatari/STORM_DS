package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: pv6  reason: default package */
/* loaded from: classes.dex */
public final class pv6 implements mx3 {
    public uw3 A;
    public zw3 B;
    public final /* synthetic */ Toolbar L;

    public pv6(Toolbar toolbar) {
        this.L = toolbar;
    }

    @Override // defpackage.mx3
    public final boolean b(zw3 zw3Var) {
        Toolbar toolbar = this.L;
        View view = toolbar.g0;
        if (view instanceof mq0) {
            ((mq0) view).onActionViewCollapsed();
        }
        toolbar.removeView(toolbar.g0);
        toolbar.removeView(toolbar.f0);
        toolbar.g0 = null;
        ArrayList arrayList = toolbar.C0;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.B = null;
        toolbar.requestLayout();
        zw3Var.C = false;
        zw3Var.n.p(false);
        toolbar.x();
        return true;
    }

    @Override // defpackage.mx3
    public final boolean e(zw3 zw3Var) {
        Toolbar toolbar = this.L;
        toolbar.d();
        ViewParent parent = toolbar.f0.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.f0);
            }
            toolbar.addView(toolbar.f0);
        }
        View actionView = zw3Var.getActionView();
        toolbar.g0 = actionView;
        this.B = zw3Var;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.g0);
            }
            qv6 i = Toolbar.i();
            i.a = (toolbar.l0 & 112) | 8388611;
            i.b = 2;
            toolbar.g0.setLayoutParams(i);
            toolbar.addView(toolbar.g0);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((qv6) childAt.getLayoutParams()).b != 2 && childAt != toolbar.A) {
                toolbar.removeViewAt(childCount);
                toolbar.C0.add(childAt);
            }
        }
        toolbar.requestLayout();
        zw3Var.C = true;
        zw3Var.n.p(false);
        View view = toolbar.g0;
        if (view instanceof mq0) {
            ((mq0) view).onActionViewExpanded();
        }
        toolbar.x();
        return true;
    }

    @Override // defpackage.mx3
    public final void g() {
        if (this.B != null) {
            uw3 uw3Var = this.A;
            if (uw3Var != null) {
                int size = uw3Var.f.size();
                for (int i = 0; i < size; i++) {
                    if (this.A.getItem(i) == this.B) {
                        return;
                    }
                }
            }
            b(this.B);
        }
    }

    @Override // defpackage.mx3
    public final void i(Context context, uw3 uw3Var) {
        zw3 zw3Var;
        uw3 uw3Var2 = this.A;
        if (uw3Var2 != null && (zw3Var = this.B) != null) {
            uw3Var2.d(zw3Var);
        }
        this.A = uw3Var;
    }

    @Override // defpackage.mx3
    public final boolean j(rh6 rh6Var) {
        return false;
    }

    @Override // defpackage.mx3
    public final boolean k() {
        return false;
    }

    @Override // defpackage.mx3
    public final void f(uw3 uw3Var, boolean z) {
    }
}
