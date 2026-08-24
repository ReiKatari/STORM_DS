package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xg5  reason: default package */
/* loaded from: classes.dex */
public final class xg5 extends b2 {
    public final yg5 R;
    public final WeakHashMap X = new WeakHashMap();

    public xg5(yg5 yg5Var) {
        this.R = yg5Var;
    }

    @Override // defpackage.b2
    public final boolean a(View view, AccessibilityEvent accessibilityEvent) {
        b2 b2Var = (b2) this.X.get(view);
        if (b2Var != null) {
            return b2Var.a(view, accessibilityEvent);
        }
        return this.A.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // defpackage.b2
    public final os0 b(View view) {
        b2 b2Var = (b2) this.X.get(view);
        if (b2Var != null) {
            return b2Var.b(view);
        }
        return super.b(view);
    }

    @Override // defpackage.b2
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        b2 b2Var = (b2) this.X.get(view);
        if (b2Var != null) {
            b2Var.c(view, accessibilityEvent);
        } else {
            super.c(view, accessibilityEvent);
        }
    }

    @Override // defpackage.b2
    public final void d(View view, v2 v2Var) {
        AccessibilityNodeInfo accessibilityNodeInfo = v2Var.a;
        yg5 yg5Var = this.R;
        RecyclerView recyclerView = yg5Var.R;
        RecyclerView recyclerView2 = yg5Var.R;
        boolean P = recyclerView.P();
        View.AccessibilityDelegate accessibilityDelegate = this.A;
        if (!P && recyclerView2.getLayoutManager() != null) {
            recyclerView2.getLayoutManager().X(view, v2Var);
            b2 b2Var = (b2) this.X.get(view);
            if (b2Var != null) {
                b2Var.d(view, v2Var);
                return;
            } else {
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                return;
            }
        }
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
    }

    @Override // defpackage.b2
    public final void e(View view, AccessibilityEvent accessibilityEvent) {
        b2 b2Var = (b2) this.X.get(view);
        if (b2Var != null) {
            b2Var.e(view, accessibilityEvent);
        } else {
            super.e(view, accessibilityEvent);
        }
    }

    @Override // defpackage.b2
    public final boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        b2 b2Var = (b2) this.X.get(viewGroup);
        if (b2Var != null) {
            return b2Var.f(viewGroup, view, accessibilityEvent);
        }
        return this.A.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    @Override // defpackage.b2
    public final boolean g(View view, int i, Bundle bundle) {
        yg5 yg5Var = this.R;
        RecyclerView recyclerView = yg5Var.R;
        RecyclerView recyclerView2 = yg5Var.R;
        if (!recyclerView.P() && recyclerView2.getLayoutManager() != null) {
            b2 b2Var = (b2) this.X.get(view);
            if (b2Var != null) {
                if (b2Var.g(view, i, bundle)) {
                    return true;
                }
            } else if (super.g(view, i, bundle)) {
                return true;
            }
            mg5 mg5Var = recyclerView2.getLayoutManager().b.L;
            return false;
        }
        return super.g(view, i, bundle);
    }

    @Override // defpackage.b2
    public final void h(View view, int i) {
        b2 b2Var = (b2) this.X.get(view);
        if (b2Var != null) {
            b2Var.h(view, i);
        } else {
            super.h(view, i);
        }
    }

    @Override // defpackage.b2
    public final void i(View view, AccessibilityEvent accessibilityEvent) {
        b2 b2Var = (b2) this.X.get(view);
        if (b2Var != null) {
            b2Var.i(view, accessibilityEvent);
        } else {
            super.i(view, accessibilityEvent);
        }
    }
}
