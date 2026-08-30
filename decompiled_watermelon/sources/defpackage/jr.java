package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: jr  reason: default package */
/* loaded from: classes.dex */
public final class jr implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;

    public /* synthetic */ jr(int i, Object obj) {
        this.A = i;
        this.B = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int i = this.A;
        Object obj = this.B;
        switch (i) {
            case 0:
                sr srVar = (sr) obj;
                if (!srVar.getInternalPopup().a()) {
                    srVar.d0.k(srVar.getTextDirection(), srVar.getTextAlignment());
                }
                ViewTreeObserver viewTreeObserver = srVar.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                    return;
                }
                return;
            case 1:
                pr prVar = (pr) obj;
                sr srVar2 = prVar.B0;
                if (srVar2.isAttachedToWindow() && srVar2.getGlobalVisibleRect(prVar.z0)) {
                    prVar.q();
                    prVar.c();
                    return;
                }
                prVar.dismiss();
                return;
            case 2:
                yi0 yi0Var = (yi0) obj;
                ArrayList arrayList = yi0Var.c0;
                if (yi0Var.a() && arrayList.size() > 0) {
                    int i2 = 0;
                    if (!((xi0) arrayList.get(0)).a.t0) {
                        View view = yi0Var.j0;
                        if (view != null && view.isShown()) {
                            int size = arrayList.size();
                            while (i2 < size) {
                                Object obj2 = arrayList.get(i2);
                                i2++;
                                ((xi0) obj2).a.c();
                            }
                            return;
                        }
                        yi0Var.dismiss();
                        return;
                    }
                    return;
                }
                return;
            default:
                od6 od6Var = (od6) obj;
                kx3 kx3Var = od6Var.c0;
                if (od6Var.a() && !kx3Var.t0) {
                    View view2 = od6Var.h0;
                    if (view2 != null && view2.isShown()) {
                        kx3Var.c();
                        return;
                    } else {
                        od6Var.dismiss();
                        return;
                    }
                }
                return;
        }
    }
}
