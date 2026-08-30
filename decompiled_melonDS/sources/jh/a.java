package jh;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import j7.b0;
import j7.u0;
import me.magnum.melonds.common.camera.DSiCameraSource;
import qa.j;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements View.OnFocusChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f7897a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f7898b;

    public /* synthetic */ a(int i2, Object obj) {
        this.f7897a = i2;
        this.f7898b = obj;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z10) {
        RecyclerView recyclerView;
        LinearLayoutManager linearLayoutManager;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i2;
        switch (this.f7897a) {
            case 0:
                c cVar = (c) this.f7898b;
                if (z10 && (recyclerView = cVar.f7905f) != null) {
                    u0 layoutManager = recyclerView.getLayoutManager();
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = null;
                    if (layoutManager instanceof LinearLayoutManager) {
                        linearLayoutManager = (LinearLayoutManager) layoutManager;
                    } else {
                        linearLayoutManager = null;
                    }
                    if (linearLayoutManager != null) {
                        int G = u0.G(view);
                        int width = recyclerView.getWidth() - view.getWidth();
                        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                            marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                        } else {
                            marginLayoutParams = null;
                        }
                        int i10 = 0;
                        if (marginLayoutParams != null) {
                            i2 = marginLayoutParams.rightMargin;
                        } else {
                            i2 = 0;
                        }
                        int i11 = width - i2;
                        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                        if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                            marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                        }
                        if (marginLayoutParams2 != null) {
                            i10 = marginLayoutParams2.leftMargin;
                        }
                        linearLayoutManager.f1613x = G;
                        linearLayoutManager.f1614y = (i11 - i10) / 2;
                        b0 b0Var = linearLayoutManager.f1615z;
                        if (b0Var != null) {
                            b0Var.A = -1;
                        }
                        linearLayoutManager.o0();
                        return;
                    }
                    return;
                }
                return;
            case DSiCameraSource.FrontCamera /* 1 */:
                qa.c cVar2 = (qa.c) this.f7898b;
                cVar2.s(cVar2.t());
                return;
            default:
                j jVar = (j) this.f7898b;
                jVar.f12432l = z10;
                jVar.p();
                if (!z10) {
                    jVar.s(false);
                    jVar.m = false;
                    return;
                }
                return;
        }
    }
}
