package j7;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import c1.h2;
import java.util.WeakHashMap;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class k1 extends a6.b {
    public final l1 R;
    public final WeakHashMap X = new WeakHashMap();

    public k1(l1 l1Var) {
        this.R = l1Var;
    }

    @Override // a6.b
    public final boolean a(View view, AccessibilityEvent accessibilityEvent) {
        a6.b bVar = (a6.b) this.X.get(view);
        if (bVar != null) {
            return bVar.a(view, accessibilityEvent);
        }
        return this.A.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // a6.b
    public final a0.b b(View view) {
        a6.b bVar = (a6.b) this.X.get(view);
        if (bVar != null) {
            return bVar.b(view);
        }
        return super.b(view);
    }

    @Override // a6.b
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        a6.b bVar = (a6.b) this.X.get(view);
        if (bVar != null) {
            bVar.c(view, accessibilityEvent);
        } else {
            super.c(view, accessibilityEvent);
        }
    }

    @Override // a6.b
    public final void d(View view, b6.g gVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = gVar.f2077a;
        l1 l1Var = this.R;
        RecyclerView recyclerView = l1Var.R;
        RecyclerView recyclerView2 = l1Var.R;
        boolean P = recyclerView.P();
        View.AccessibilityDelegate accessibilityDelegate = this.A;
        if (!P && recyclerView2.getLayoutManager() != null) {
            recyclerView2.getLayoutManager().W(view, gVar);
            a6.b bVar = (a6.b) this.X.get(view);
            if (bVar != null) {
                bVar.d(view, gVar);
                return;
            } else {
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                return;
            }
        }
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
    }

    @Override // a6.b
    public final void e(View view, AccessibilityEvent accessibilityEvent) {
        a6.b bVar = (a6.b) this.X.get(view);
        if (bVar != null) {
            bVar.e(view, accessibilityEvent);
        } else {
            super.e(view, accessibilityEvent);
        }
    }

    @Override // a6.b
    public final boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        a6.b bVar = (a6.b) this.X.get(viewGroup);
        if (bVar != null) {
            return bVar.f(viewGroup, view, accessibilityEvent);
        }
        return this.A.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    @Override // a6.b
    public final boolean g(View view, int i2, Bundle bundle) {
        l1 l1Var = this.R;
        RecyclerView recyclerView = l1Var.R;
        RecyclerView recyclerView2 = l1Var.R;
        if (!recyclerView.P() && recyclerView2.getLayoutManager() != null) {
            a6.b bVar = (a6.b) this.X.get(view);
            if (bVar != null) {
                if (bVar.g(view, i2, bundle)) {
                    return true;
                }
            } else if (super.g(view, i2, bundle)) {
                return true;
            }
            h2 h2Var = recyclerView2.getLayoutManager().f7709b.L;
            return false;
        }
        return super.g(view, i2, bundle);
    }

    @Override // a6.b
    public final void h(View view, int i2) {
        a6.b bVar = (a6.b) this.X.get(view);
        if (bVar != null) {
            bVar.h(view, i2);
        } else {
            super.h(view, i2);
        }
    }

    @Override // a6.b
    public final void i(View view, AccessibilityEvent accessibilityEvent) {
        a6.b bVar = (a6.b) this.X.get(view);
        if (bVar != null) {
            bVar.i(view, accessibilityEvent);
        } else {
            super.i(view, accessibilityEvent);
        }
    }
}
