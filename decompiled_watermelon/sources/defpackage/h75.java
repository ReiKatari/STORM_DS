package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: h75  reason: default package */
/* loaded from: classes.dex */
public final class h75 extends z1 {
    public final i75 R;
    public final WeakHashMap X = new WeakHashMap();

    public h75(i75 i75Var) {
        this.R = i75Var;
    }

    @Override // defpackage.z1
    public final boolean a(View view, AccessibilityEvent accessibilityEvent) {
        z1 z1Var = (z1) this.X.get(view);
        if (z1Var != null) {
            return z1Var.a(view, accessibilityEvent);
        }
        return this.A.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // defpackage.z1
    public final bq0 b(View view) {
        z1 z1Var = (z1) this.X.get(view);
        if (z1Var != null) {
            return z1Var.b(view);
        }
        return super.b(view);
    }

    @Override // defpackage.z1
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        z1 z1Var = (z1) this.X.get(view);
        if (z1Var != null) {
            z1Var.c(view, accessibilityEvent);
        } else {
            super.c(view, accessibilityEvent);
        }
    }

    @Override // defpackage.z1
    public final void d(View view, t2 t2Var) {
        AccessibilityNodeInfo accessibilityNodeInfo = t2Var.a;
        i75 i75Var = this.R;
        RecyclerView recyclerView = i75Var.R;
        RecyclerView recyclerView2 = i75Var.R;
        boolean P = recyclerView.P();
        View.AccessibilityDelegate accessibilityDelegate = this.A;
        if (!P && recyclerView2.getLayoutManager() != null) {
            recyclerView2.getLayoutManager().X(view, t2Var);
            z1 z1Var = (z1) this.X.get(view);
            if (z1Var != null) {
                z1Var.d(view, t2Var);
                return;
            } else {
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                return;
            }
        }
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
    }

    @Override // defpackage.z1
    public final void e(View view, AccessibilityEvent accessibilityEvent) {
        z1 z1Var = (z1) this.X.get(view);
        if (z1Var != null) {
            z1Var.e(view, accessibilityEvent);
        } else {
            super.e(view, accessibilityEvent);
        }
    }

    @Override // defpackage.z1
    public final boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        z1 z1Var = (z1) this.X.get(viewGroup);
        if (z1Var != null) {
            return z1Var.f(viewGroup, view, accessibilityEvent);
        }
        return this.A.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    @Override // defpackage.z1
    public final boolean g(View view, int i, Bundle bundle) {
        i75 i75Var = this.R;
        RecyclerView recyclerView = i75Var.R;
        RecyclerView recyclerView2 = i75Var.R;
        if (!recyclerView.P() && recyclerView2.getLayoutManager() != null) {
            z1 z1Var = (z1) this.X.get(view);
            if (z1Var != null) {
                if (z1Var.g(view, i, bundle)) {
                    return true;
                }
            } else if (super.g(view, i, bundle)) {
                return true;
            }
            w65 w65Var = recyclerView2.getLayoutManager().b.L;
            return false;
        }
        return super.g(view, i, bundle);
    }

    @Override // defpackage.z1
    public final void h(View view, int i) {
        z1 z1Var = (z1) this.X.get(view);
        if (z1Var != null) {
            z1Var.h(view, i);
        } else {
            super.h(view, i);
        }
    }

    @Override // defpackage.z1
    public final void i(View view, AccessibilityEvent accessibilityEvent) {
        z1 z1Var = (z1) this.X.get(view);
        if (z1Var != null) {
            z1Var.i(view, accessibilityEvent);
        } else {
            super.i(view, accessibilityEvent);
        }
    }
}
