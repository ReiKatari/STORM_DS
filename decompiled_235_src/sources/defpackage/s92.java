package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: s92  reason: default package */
/* loaded from: classes.dex */
public final class s92 extends jg5 {
    public final /* synthetic */ u92 a;

    public s92(u92 u92Var) {
        this.a = u92Var;
    }

    @Override // defpackage.jg5
    public final void b(RecyclerView recyclerView, int i, int i2) {
        boolean z;
        boolean z2;
        int computeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
        int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
        u92 u92Var = this.a;
        int i3 = u92Var.a;
        int computeVerticalScrollRange = u92Var.s.computeVerticalScrollRange();
        int i4 = u92Var.r;
        if (computeVerticalScrollRange - i4 > 0 && i4 >= i3) {
            z = true;
        } else {
            z = false;
        }
        u92Var.t = z;
        int computeHorizontalScrollRange = u92Var.s.computeHorizontalScrollRange();
        int i5 = u92Var.q;
        if (computeHorizontalScrollRange - i5 > 0 && i5 >= i3) {
            z2 = true;
        } else {
            z2 = false;
        }
        u92Var.u = z2;
        boolean z3 = u92Var.t;
        if (!z3 && !z2) {
            if (u92Var.v != 0) {
                u92Var.g(0);
                return;
            }
            return;
        }
        if (z3) {
            float f = i4;
            u92Var.l = (int) ((((f / 2.0f) + computeVerticalScrollOffset) * f) / computeVerticalScrollRange);
            u92Var.k = Math.min(i4, (i4 * i4) / computeVerticalScrollRange);
        }
        if (u92Var.u) {
            float f2 = computeHorizontalScrollOffset;
            float f3 = i5;
            u92Var.o = (int) ((((f3 / 2.0f) + f2) * f3) / computeHorizontalScrollRange);
            u92Var.n = Math.min(i5, (i5 * i5) / computeHorizontalScrollRange);
        }
        int i6 = u92Var.v;
        if (i6 != 0 && i6 != 1) {
            return;
        }
        u92Var.g(1);
    }
}
