package defpackage;

import android.view.View;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fj1  reason: default package */
/* loaded from: classes.dex */
public final class fj1 extends f55 {
    public final /* synthetic */ gj1 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fj1(gj1 gj1Var) {
        super(1);
        this.L = gj1Var;
    }

    @Override // defpackage.f55
    public final vu7 k0(vu7 vu7Var, List list) {
        gj1 gj1Var = this.L;
        if (!gj1Var.l0) {
            View childAt = gj1Var.getChildAt(0);
            int max = Math.max(0, childAt.getLeft());
            int max2 = Math.max(0, childAt.getTop());
            int max3 = Math.max(0, gj1Var.getWidth() - childAt.getRight());
            int max4 = Math.max(0, gj1Var.getHeight() - childAt.getBottom());
            if (max != 0 || max2 != 0 || max3 != 0 || max4 != 0) {
                return vu7Var.a.q(max, max2, max3, max4);
            }
        }
        return vu7Var;
    }

    @Override // defpackage.f55
    public final rr6 l0(au7 au7Var, rr6 rr6Var) {
        gj1 gj1Var = this.L;
        if (!gj1Var.l0) {
            View childAt = gj1Var.getChildAt(0);
            int max = Math.max(0, childAt.getLeft());
            int max2 = Math.max(0, childAt.getTop());
            int max3 = Math.max(0, gj1Var.getWidth() - childAt.getRight());
            int max4 = Math.max(0, gj1Var.getHeight() - childAt.getBottom());
            if (max != 0 || max2 != 0 || max3 != 0 || max4 != 0) {
                e83 c = e83.c(max, max2, max3, max4);
                int i = c.a;
                int i2 = c.b;
                int i3 = c.c;
                int i4 = c.d;
                return new rr6(14, vu7.e((e83) rr6Var.B, i, i2, i3, i4), vu7.e((e83) rr6Var.L, i, i2, i3, i4));
            }
        }
        return rr6Var;
    }
}
