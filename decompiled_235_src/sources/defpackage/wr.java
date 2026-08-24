package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wr  reason: default package */
/* loaded from: classes.dex */
public final class wr implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;

    public /* synthetic */ wr(Object obj, int i) {
        this.A = i;
        this.B = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int i = this.A;
        Object obj = this.B;
        switch (i) {
            case 0:
                fs fsVar = (fs) obj;
                if (!fsVar.getInternalPopup().a()) {
                    fsVar.e0.l(fsVar.getTextDirection(), fsVar.getTextAlignment());
                }
                ViewTreeObserver viewTreeObserver = fsVar.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                    return;
                }
                return;
            case 1:
                cs csVar = (cs) obj;
                fs fsVar2 = csVar.C0;
                if (fsVar2.isAttachedToWindow() && fsVar2.getGlobalVisibleRect(csVar.A0)) {
                    csVar.r();
                    csVar.e();
                    return;
                }
                csVar.dismiss();
                return;
            case 2:
                gl0 gl0Var = (gl0) obj;
                ArrayList arrayList = gl0Var.d0;
                if (gl0Var.a() && arrayList.size() > 0) {
                    int i2 = 0;
                    if (!((fl0) arrayList.get(0)).a.u0) {
                        View view = gl0Var.k0;
                        if (view != null && view.isShown()) {
                            int size = arrayList.size();
                            while (i2 < size) {
                                Object obj2 = arrayList.get(i2);
                                i2++;
                                ((fl0) obj2).a.e();
                            }
                            return;
                        }
                        gl0Var.dismiss();
                        return;
                    }
                    return;
                }
                return;
            default:
                ep6 ep6Var = (ep6) obj;
                z44 z44Var = ep6Var.d0;
                if (ep6Var.a() && !z44Var.u0) {
                    View view2 = ep6Var.i0;
                    if (view2 != null && view2.isShown()) {
                        z44Var.e();
                        return;
                    } else {
                        ep6Var.dismiss();
                        return;
                    }
                }
                return;
        }
    }
}
