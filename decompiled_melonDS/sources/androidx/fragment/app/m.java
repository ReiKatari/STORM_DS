package androidx.fragment.app;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class m implements Runnable {
    public final /* synthetic */ int A = 1;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object L;

    public /* synthetic */ m(o oVar, ViewGroup viewGroup) {
        this.B = oVar;
        this.L = viewGroup;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.A) {
            case 0:
                z1.j((View) this.B, (Rect) this.L);
                return;
            default:
                ViewGroup viewGroup = (ViewGroup) this.L;
                viewGroup.getClass();
                ArrayList arrayList = ((o) this.B).f1365c;
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    e2 e2Var = ((p) obj).f1343a;
                    View view = e2Var.f1273c.getView();
                    if (view != null) {
                        e2Var.f1271a.applyState(view, viewGroup);
                    }
                }
                return;
        }
    }

    public /* synthetic */ m(z1 z1Var, View view, Rect rect) {
        this.B = view;
        this.L = rect;
    }
}
