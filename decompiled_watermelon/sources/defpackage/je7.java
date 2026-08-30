package defpackage;

import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: je7  reason: default package */
/* loaded from: classes.dex */
public final class je7 extends gk2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ le7 b;

    public /* synthetic */ je7(le7 le7Var, int i) {
        this.a = i;
        this.b = le7Var;
    }

    @Override // defpackage.jb7
    public final void a() {
        View view;
        int i = this.a;
        le7 le7Var = this.b;
        switch (i) {
            case 0:
                if (le7Var.C0 && (view = le7Var.u0) != null) {
                    view.setTranslationY(RecyclerView.A1);
                    le7Var.r0.setTranslationY(RecyclerView.A1);
                }
                le7Var.r0.setVisibility(8);
                le7Var.r0.setTransitioning(false);
                le7Var.H0 = null;
                q03 q03Var = le7Var.y0;
                if (q03Var != null) {
                    q03Var.u(le7Var.x0);
                    le7Var.x0 = null;
                    le7Var.y0 = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = le7Var.q0;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = aa7.a;
                    actionBarOverlayLayout.requestApplyInsets();
                    return;
                }
                return;
            default:
                le7Var.H0 = null;
                le7Var.r0.requestLayout();
                return;
        }
    }
}
