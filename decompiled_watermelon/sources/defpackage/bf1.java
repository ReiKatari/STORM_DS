package defpackage;

import android.view.View;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: bf1  reason: default package */
/* loaded from: classes.dex */
public final class bf1 extends yv4 {
    public final /* synthetic */ cf1 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bf1(cf1 cf1Var) {
        super(1);
        this.L = cf1Var;
    }

    @Override // defpackage.yv4
    public final vf7 k0(vf7 vf7Var, List list) {
        cf1 cf1Var = this.L;
        if (!cf1Var.k0) {
            View childAt = cf1Var.getChildAt(0);
            int max = Math.max(0, childAt.getLeft());
            int max2 = Math.max(0, childAt.getTop());
            int max3 = Math.max(0, cf1Var.getWidth() - childAt.getRight());
            int max4 = Math.max(0, cf1Var.getHeight() - childAt.getBottom());
            if (max != 0 || max2 != 0 || max3 != 0 || max4 != 0) {
                return vf7Var.a.q(max, max2, max3, max4);
            }
        }
        return vf7Var;
    }

    @Override // defpackage.yv4
    public final wv6 l0(ze7 ze7Var, wv6 wv6Var) {
        cf1 cf1Var = this.L;
        if (!cf1Var.k0) {
            View childAt = cf1Var.getChildAt(0);
            int max = Math.max(0, childAt.getLeft());
            int max2 = Math.max(0, childAt.getTop());
            int max3 = Math.max(0, cf1Var.getWidth() - childAt.getRight());
            int max4 = Math.max(0, cf1Var.getHeight() - childAt.getBottom());
            if (max != 0 || max2 != 0 || max3 != 0 || max4 != 0) {
                x13 c = x13.c(max, max2, max3, max4);
                int i = c.a;
                int i2 = c.b;
                int i3 = c.c;
                int i4 = c.d;
                return new wv6(7, vf7.e((x13) wv6Var.B, i, i2, i3, i4), vf7.e((x13) wv6Var.L, i, i2, i3, i4));
            }
        }
        return wv6Var;
    }
}
