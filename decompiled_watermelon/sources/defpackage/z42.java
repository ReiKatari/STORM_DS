package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: z42  reason: default package */
/* loaded from: classes.dex */
public final class z42 extends t65 {
    public final /* synthetic */ b52 a;

    public z42(b52 b52Var) {
        this.a = b52Var;
    }

    @Override // defpackage.t65
    public final void b(RecyclerView recyclerView, int i, int i2) {
        boolean z;
        boolean z2;
        int computeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
        int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
        b52 b52Var = this.a;
        int i3 = b52Var.a;
        int computeVerticalScrollRange = b52Var.s.computeVerticalScrollRange();
        int i4 = b52Var.r;
        if (computeVerticalScrollRange - i4 > 0 && i4 >= i3) {
            z = true;
        } else {
            z = false;
        }
        b52Var.t = z;
        int computeHorizontalScrollRange = b52Var.s.computeHorizontalScrollRange();
        int i5 = b52Var.q;
        if (computeHorizontalScrollRange - i5 > 0 && i5 >= i3) {
            z2 = true;
        } else {
            z2 = false;
        }
        b52Var.u = z2;
        boolean z3 = b52Var.t;
        if (!z3 && !z2) {
            if (b52Var.v != 0) {
                b52Var.g(0);
                return;
            }
            return;
        }
        if (z3) {
            float f = i4;
            b52Var.l = (int) ((((f / 2.0f) + computeVerticalScrollOffset) * f) / computeVerticalScrollRange);
            b52Var.k = Math.min(i4, (i4 * i4) / computeVerticalScrollRange);
        }
        if (b52Var.u) {
            float f2 = computeHorizontalScrollOffset;
            float f3 = i5;
            b52Var.o = (int) ((((f3 / 2.0f) + f2) * f3) / computeHorizontalScrollRange);
            b52Var.n = Math.min(i5, (i5 * i5) / computeHorizontalScrollRange);
        }
        int i6 = b52Var.v;
        if (i6 != 0 && i6 != 1) {
            return;
        }
        b52Var.g(1);
    }
}
