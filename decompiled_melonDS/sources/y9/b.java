package y9;

import a6.i2;
import a6.p1;
import android.view.View;
import java.util.Iterator;
import java.util.List;
import pd.g;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b extends g {
    public final View L;
    public int R;
    public int X;
    public final int[] Y;

    public b(View view) {
        super(0);
        this.Y = new int[2];
        this.L = view;
    }

    @Override // pd.g
    public final void a(p1 p1Var) {
        this.L.setTranslationY(0.0f);
    }

    @Override // pd.g
    public final void b(p1 p1Var) {
        View view = this.L;
        int[] iArr = this.Y;
        view.getLocationOnScreen(iArr);
        this.R = iArr[1];
    }

    @Override // pd.g
    public final i2 c(i2 i2Var, List list) {
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            p1 p1Var = (p1) it.next();
            if ((p1Var.f502a.d() & 8) != 0) {
                int i2 = this.X;
                this.L.setTranslationY(u9.a.c(p1Var.f502a.c(), i2, 0));
                break;
            }
        }
        return i2Var;
    }

    @Override // pd.g
    public final a0.g d(p1 p1Var, a0.g gVar) {
        View view = this.L;
        int[] iArr = this.Y;
        view.getLocationOnScreen(iArr);
        int i2 = this.R - iArr[1];
        this.X = i2;
        view.setTranslationY(i2);
        return gVar;
    }
}
