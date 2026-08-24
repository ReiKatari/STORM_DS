package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yg5  reason: default package */
/* loaded from: classes.dex */
public class yg5 extends b2 {
    public final RecyclerView R;
    public final xg5 X;

    public yg5(RecyclerView recyclerView) {
        this.R = recyclerView;
        b2 j = j();
        if (j != null && (j instanceof xg5)) {
            this.X = (xg5) j;
        } else {
            this.X = new xg5(this);
        }
    }

    @Override // defpackage.b2
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        super.c(view, accessibilityEvent);
        if ((view instanceof RecyclerView) && !this.R.P()) {
            RecyclerView recyclerView = (RecyclerView) view;
            if (recyclerView.getLayoutManager() != null) {
                recyclerView.getLayoutManager().U(accessibilityEvent);
            }
        }
    }

    @Override // defpackage.b2
    public final void d(View view, v2 v2Var) {
        this.A.onInitializeAccessibilityNodeInfo(view, v2Var.a);
        RecyclerView recyclerView = this.R;
        if (!recyclerView.P() && recyclerView.getLayoutManager() != null) {
            gg5 layoutManager = recyclerView.getLayoutManager();
            RecyclerView recyclerView2 = layoutManager.b;
            layoutManager.V(recyclerView2.L, recyclerView2.d1, v2Var);
        }
    }

    @Override // defpackage.b2
    public final boolean g(View view, int i, Bundle bundle) {
        if (super.g(view, i, bundle)) {
            return true;
        }
        RecyclerView recyclerView = this.R;
        if (!recyclerView.P() && recyclerView.getLayoutManager() != null) {
            return recyclerView.getLayoutManager().i0(i, bundle);
        }
        return false;
    }

    public b2 j() {
        return this.X;
    }
}
