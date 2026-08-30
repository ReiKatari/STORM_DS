package j7;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class l1 extends a6.b {
    public final RecyclerView R;
    public final k1 X;

    public l1(RecyclerView recyclerView) {
        this.R = recyclerView;
        a6.b j2 = j();
        if (j2 != null && (j2 instanceof k1)) {
            this.X = (k1) j2;
        } else {
            this.X = new k1(this);
        }
    }

    @Override // a6.b
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        super.c(view, accessibilityEvent);
        if ((view instanceof RecyclerView) && !this.R.P()) {
            RecyclerView recyclerView = (RecyclerView) view;
            if (recyclerView.getLayoutManager() != null) {
                recyclerView.getLayoutManager().U(accessibilityEvent);
            }
        }
    }

    @Override // a6.b
    public final void d(View view, b6.g gVar) {
        this.A.onInitializeAccessibilityNodeInfo(view, gVar.f2077a);
        RecyclerView recyclerView = this.R;
        if (!recyclerView.P() && recyclerView.getLayoutManager() != null) {
            u0 layoutManager = recyclerView.getLayoutManager();
            RecyclerView recyclerView2 = layoutManager.f7709b;
            layoutManager.V(recyclerView2.L, recyclerView2.f1621a1, gVar);
        }
    }

    @Override // a6.b
    public final boolean g(View view, int i2, Bundle bundle) {
        if (super.g(view, i2, bundle)) {
            return true;
        }
        RecyclerView recyclerView = this.R;
        if (!recyclerView.P() && recyclerView.getLayoutManager() != null) {
            return recyclerView.getLayoutManager().i0(i2, bundle);
        }
        return false;
    }

    public a6.b j() {
        return this.X;
    }
}
