package defpackage;

import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: nw3  reason: default package */
/* loaded from: classes.dex */
public final class nw3 extends ow3 {
    @Override // defpackage.ow3
    public final void a(long j, Object obj) {
        ((j1) ((z93) gh7.d.i(j, obj))).A = false;
    }

    @Override // defpackage.ow3
    public final void b(Object obj, long j, Object obj2) {
        fh7 fh7Var = gh7.d;
        z93 z93Var = (z93) fh7Var.i(j, obj);
        z93 z93Var2 = (z93) fh7Var.i(j, obj2);
        int size = z93Var.size();
        int size2 = z93Var2.size();
        if (size > 0 && size2 > 0) {
            if (!((j1) z93Var).A) {
                z93Var = z93Var.k(size2 + size);
            }
            z93Var.addAll(z93Var2);
        }
        if (size > 0) {
            z93Var2 = z93Var;
        }
        gh7.o(obj, j, z93Var2);
    }

    @Override // defpackage.ow3
    public final List c(long j, Object obj) {
        int i;
        z93 z93Var = (z93) gh7.d.i(j, obj);
        if (!((j1) z93Var).A) {
            int size = z93Var.size();
            if (size == 0) {
                i = 10;
            } else {
                i = size * 2;
            }
            z93 k = z93Var.k(i);
            gh7.o(obj, j, k);
            return k;
        }
        return z93Var;
    }
}
