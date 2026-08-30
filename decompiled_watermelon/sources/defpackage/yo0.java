package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: yo0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class yo0 implements View.OnFocusChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ yo0(int i, Object obj) {
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
                bp0 bp0Var = (bp0) obj;
                bp0Var.s(bp0Var.t());
                return;
            case 1:
                ol1 ol1Var = (ol1) obj;
                ol1Var.l = z;
                ol1Var.p();
                if (!z) {
                    ol1Var.s(false);
                    ol1Var.m = false;
                    return;
                }
                return;
            default:
                yf5 yf5Var = (yf5) obj;
                if (z && (recyclerView = yf5Var.d) != null) {
                    q65 layoutManager = recyclerView.getLayoutManager();
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = null;
                    if (layoutManager instanceof LinearLayoutManager) {
                        linearLayoutManager = (LinearLayoutManager) layoutManager;
                    } else {
                        linearLayoutManager = null;
                    }
                    if (linearLayoutManager != null) {
                        int G = q65.G(view);
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
                        fo3 fo3Var = linearLayoutManager.z;
                        if (fo3Var != null) {
                            fo3Var.A = -1;
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
