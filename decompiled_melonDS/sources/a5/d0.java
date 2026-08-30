package a5;

import a6.i2;
import a6.p1;
import android.view.View;
import java.util.List;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class d0 extends pd.g {
    public final /* synthetic */ e0 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(e0 e0Var) {
        super(1);
        this.L = e0Var;
    }

    @Override // pd.g
    public final i2 c(i2 i2Var, List list) {
        e0 e0Var = this.L;
        if (!e0Var.f387i0) {
            View childAt = e0Var.getChildAt(0);
            int max = Math.max(0, childAt.getLeft());
            int max2 = Math.max(0, childAt.getTop());
            int max3 = Math.max(0, e0Var.getWidth() - childAt.getRight());
            int max4 = Math.max(0, e0Var.getHeight() - childAt.getBottom());
            if (max != 0 || max2 != 0 || max3 != 0 || max4 != 0) {
                return i2Var.f479a.m(max, max2, max3, max4);
            }
        }
        return i2Var;
    }

    @Override // pd.g
    public final a0.g d(p1 p1Var, a0.g gVar) {
        e0 e0Var = this.L;
        if (!e0Var.f387i0) {
            View childAt = e0Var.getChildAt(0);
            int max = Math.max(0, childAt.getLeft());
            int max2 = Math.max(0, childAt.getTop());
            int max3 = Math.max(0, e0Var.getWidth() - childAt.getRight());
            int max4 = Math.max(0, e0Var.getHeight() - childAt.getBottom());
            if (max != 0 || max2 != 0 || max3 != 0 || max4 != 0) {
                q5.b c4 = q5.b.c(max, max2, max3, max4);
                int i2 = c4.f12283a;
                int i10 = c4.f12284b;
                int i11 = c4.f12285c;
                int i12 = c4.f12286d;
                return new a0.g(5, i2.e((q5.b) gVar.B, i2, i10, i11, i12), i2.e((q5.b) gVar.L, i2, i10, i11, i12));
            }
        }
        return gVar;
    }
}
