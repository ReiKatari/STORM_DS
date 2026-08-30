package p;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import me.magnum.melonds.common.camera.DSiCameraSource;
import q.i2;
import q.l0;
import q.p0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class d implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;

    public /* synthetic */ d(int i2, Object obj) {
        this.A = i2;
        this.B = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.A) {
            case 0:
                f fVar = (f) this.B;
                ArrayList arrayList = fVar.f11091b0;
                if (fVar.b() && arrayList.size() > 0) {
                    int i2 = 0;
                    if (!((e) arrayList.get(0)).f11088a.f11881s0) {
                        View view = fVar.f11098i0;
                        if (view != null && view.isShown()) {
                            int size = arrayList.size();
                            while (i2 < size) {
                                Object obj = arrayList.get(i2);
                                i2++;
                                ((e) obj).f11088a.c();
                            }
                            return;
                        }
                        fVar.dismiss();
                        return;
                    }
                    return;
                }
                return;
            case DSiCameraSource.FrontCamera /* 1 */:
                c0 c0Var = (c0) this.B;
                i2 i2Var = c0Var.f11074b0;
                if (c0Var.b() && !i2Var.f11881s0) {
                    View view2 = c0Var.f11079g0;
                    if (view2 != null && view2.isShown()) {
                        i2Var.c();
                        return;
                    } else {
                        c0Var.dismiss();
                        return;
                    }
                }
                return;
            case 2:
                p0 p0Var = (p0) this.B;
                if (!p0Var.getInternalPopup().b()) {
                    p0Var.f11984c0.k(p0Var.getTextDirection(), p0Var.getTextAlignment());
                }
                ViewTreeObserver viewTreeObserver = p0Var.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                    return;
                }
                return;
            default:
                l0 l0Var = (l0) this.B;
                p0 p0Var2 = l0Var.A0;
                if (p0Var2.isAttachedToWindow() && p0Var2.getGlobalVisibleRect(l0Var.f11950y0)) {
                    l0Var.s();
                    l0Var.c();
                    return;
                }
                l0Var.dismiss();
                return;
        }
    }
}
