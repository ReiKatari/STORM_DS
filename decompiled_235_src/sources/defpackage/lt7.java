package defpackage;

import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: lt7  reason: default package */
/* loaded from: classes.dex */
public final class lt7 extends uj2 {
    public final /* synthetic */ int h;
    public final /* synthetic */ nt7 i;

    public /* synthetic */ lt7(nt7 nt7Var, int i) {
        this.h = i;
        this.i = nt7Var;
    }

    @Override // defpackage.kp7
    public final void c() {
        View view;
        int i = this.h;
        nt7 nt7Var = this.i;
        switch (i) {
            case 0:
                if (nt7Var.z && (view = nt7Var.r) != null) {
                    view.setTranslationY(RecyclerView.B1);
                    nt7Var.o.setTranslationY(RecyclerView.B1);
                }
                nt7Var.o.setVisibility(8);
                nt7Var.o.setTransitioning(false);
                nt7Var.E = null;
                u63 u63Var = nt7Var.v;
                if (u63Var != null) {
                    u63Var.x(nt7Var.u);
                    nt7Var.u = null;
                    nt7Var.v = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = nt7Var.n;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = ao7.a;
                    actionBarOverlayLayout.requestApplyInsets();
                    return;
                }
                return;
            default:
                nt7Var.E = null;
                nt7Var.o.requestLayout();
                return;
        }
    }
}
