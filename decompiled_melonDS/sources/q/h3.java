package q;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class h3 implements p.x {
    public p.l A;
    public p.n B;
    public final /* synthetic */ Toolbar L;

    public h3(Toolbar toolbar) {
        this.L = toolbar;
    }

    @Override // p.x
    public final void d() {
        if (this.B != null) {
            p.l lVar = this.A;
            if (lVar != null) {
                int size = lVar.f11115f.size();
                for (int i2 = 0; i2 < size; i2++) {
                    if (this.A.getItem(i2) == this.B) {
                        return;
                    }
                }
            }
            k(this.B);
        }
    }

    @Override // p.x
    public final boolean f(p.d0 d0Var) {
        return false;
    }

    @Override // p.x
    public final void g(Context context, p.l lVar) {
        p.n nVar;
        p.l lVar2 = this.A;
        if (lVar2 != null && (nVar = this.B) != null) {
            lVar2.d(nVar);
        }
        this.A = lVar;
    }

    @Override // p.x
    public final boolean h(p.n nVar) {
        Toolbar toolbar = this.L;
        toolbar.d();
        ViewParent parent = toolbar.f1010e0.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.f1010e0);
            }
            toolbar.addView(toolbar.f1010e0);
        }
        View actionView = nVar.getActionView();
        toolbar.f1011f0 = actionView;
        this.B = nVar;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.f1011f0);
            }
            i3 i2 = Toolbar.i();
            i2.f11911a = (toolbar.f1016k0 & 112) | 8388611;
            i2.f11912b = 2;
            toolbar.f1011f0.setLayoutParams(i2);
            toolbar.addView(toolbar.f1011f0);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((i3) childAt.getLayoutParams()).f11912b != 2 && childAt != toolbar.A) {
                toolbar.removeViewAt(childCount);
                toolbar.B0.add(childAt);
            }
        }
        toolbar.requestLayout();
        nVar.C = true;
        nVar.f11145n.p(false);
        View view = toolbar.f1011f0;
        if (view instanceof o.b) {
            ((o.b) view).onActionViewExpanded();
        }
        toolbar.x();
        return true;
    }

    @Override // p.x
    public final boolean i() {
        return false;
    }

    @Override // p.x
    public final boolean k(p.n nVar) {
        Toolbar toolbar = this.L;
        View view = toolbar.f1011f0;
        if (view instanceof o.b) {
            ((o.b) view).onActionViewCollapsed();
        }
        toolbar.removeView(toolbar.f1011f0);
        toolbar.removeView(toolbar.f1010e0);
        toolbar.f1011f0 = null;
        ArrayList arrayList = toolbar.B0;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.B = null;
        toolbar.requestLayout();
        nVar.C = false;
        nVar.f11145n.p(false);
        toolbar.x();
        return true;
    }

    @Override // p.x
    public final void a(p.l lVar, boolean z10) {
    }
}
