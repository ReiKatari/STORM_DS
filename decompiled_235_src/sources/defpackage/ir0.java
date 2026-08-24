package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ir0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ir0 implements View.OnFocusChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ir0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        RecyclerView recyclerView;
        LinearLayoutManager linearLayoutManager;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i;
        int i2 = this.a;
        int i3 = 0;
        Object obj = this.b;
        switch (i2) {
            case 0:
                lr0 lr0Var = (lr0) obj;
                lr0Var.s(lr0Var.t());
                return;
            case 1:
                vp1 vp1Var = (vp1) obj;
                vp1Var.l = z;
                vp1Var.p();
                if (!z) {
                    vp1Var.s(false);
                    vp1Var.m = false;
                    return;
                }
                return;
            default:
                wp5 wp5Var = (wp5) obj;
                if (z && (recyclerView = wp5Var.d) != null) {
                    gg5 layoutManager = recyclerView.getLayoutManager();
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = null;
                    if (layoutManager instanceof LinearLayoutManager) {
                        linearLayoutManager = (LinearLayoutManager) layoutManager;
                    } else {
                        linearLayoutManager = null;
                    }
                    if (linearLayoutManager != null) {
                        int G = gg5.G(view);
                        int width = recyclerView.getWidth() - view.getWidth();
                        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                            marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                        } else {
                            marginLayoutParams = null;
                        }
                        if (marginLayoutParams != null) {
                            i = marginLayoutParams.rightMargin;
                        } else {
                            i = 0;
                        }
                        int i4 = width - i;
                        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                        if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                            marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                        }
                        if (marginLayoutParams2 != null) {
                            i3 = marginLayoutParams2.leftMargin;
                        }
                        linearLayoutManager.x = G;
                        linearLayoutManager.y = (i4 - i3) / 2;
                        hv3 hv3Var = linearLayoutManager.z;
                        if (hv3Var != null) {
                            hv3Var.A = -1;
                        }
                        linearLayoutManager.o0();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
