package c8;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class w implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    public t A;
    public ViewGroup B;

    /* JADX WARN: Removed duplicated region for block: B:104:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01e4 A[EDGE_INSN: B:160:0x01e4->B:87:0x01e4 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x020c  */
    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onPreDraw() {
        /*
            Method dump skipped, instructions count: 818
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c8.w.onPreDraw():boolean");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        ViewGroup viewGroup = this.B;
        viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
        viewGroup.removeOnAttachStateChangeListener(this);
        x.f2719c.remove(viewGroup);
        ArrayList arrayList = (ArrayList) x.b().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                ((t) obj).F(viewGroup);
            }
        }
        this.A.k(true);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
