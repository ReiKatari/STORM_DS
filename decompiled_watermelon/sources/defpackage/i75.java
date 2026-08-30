package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: i75  reason: default package */
/* loaded from: classes.dex */
public class i75 extends z1 {
    public final RecyclerView R;
    public final h75 X;

    public i75(RecyclerView recyclerView) {
        this.R = recyclerView;
        z1 j = j();
        if (j != null && (j instanceof h75)) {
            this.X = (h75) j;
        } else {
            this.X = new h75(this);
        }
    }

    @Override // defpackage.z1
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        super.c(view, accessibilityEvent);
        if ((view instanceof RecyclerView) && !this.R.P()) {
            RecyclerView recyclerView = (RecyclerView) view;
            if (recyclerView.getLayoutManager() != null) {
                recyclerView.getLayoutManager().U(accessibilityEvent);
            }
        }
    }

    @Override // defpackage.z1
    public final void d(View view, t2 t2Var) {
        this.A.onInitializeAccessibilityNodeInfo(view, t2Var.a);
        RecyclerView recyclerView = this.R;
        if (!recyclerView.P() && recyclerView.getLayoutManager() != null) {
            q65 layoutManager = recyclerView.getLayoutManager();
            RecyclerView recyclerView2 = layoutManager.b;
            layoutManager.V(recyclerView2.L, recyclerView2.c1, t2Var);
        }
    }

    @Override // defpackage.z1
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

    public z1 j() {
        return this.X;
    }
}
