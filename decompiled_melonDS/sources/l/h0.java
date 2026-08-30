package l;

import a6.n0;
import a6.x0;
import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import java.util.WeakHashMap;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class h0 extends pc.a {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f8422d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ k0 f8423e;

    public /* synthetic */ h0(k0 k0Var, int i2) {
        this.f8422d = i2;
        this.f8423e = k0Var;
    }

    @Override // a6.g1
    public final void a() {
        View view;
        int i2 = this.f8422d;
        k0 k0Var = this.f8423e;
        switch (i2) {
            case 0:
                if (k0Var.f8438z && (view = k0Var.f8430r) != null) {
                    view.setTranslationY(0.0f);
                    k0Var.f8427o.setTranslationY(0.0f);
                }
                k0Var.f8427o.setVisibility(8);
                k0Var.f8427o.setTransitioning(false);
                k0Var.D = null;
                jb.c cVar = k0Var.f8434v;
                if (cVar != null) {
                    cVar.s(k0Var.f8433u);
                    k0Var.f8433u = null;
                    k0Var.f8434v = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = k0Var.f8426n;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = x0.f533a;
                    n0.c(actionBarOverlayLayout);
                    return;
                }
                return;
            default:
                k0Var.D = null;
                k0Var.f8427o.requestLayout();
                return;
        }
    }
}
