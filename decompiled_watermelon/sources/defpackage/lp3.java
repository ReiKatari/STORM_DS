package defpackage;

import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: lp3  reason: default package */
/* loaded from: classes.dex */
public final class lp3 extends mp3 {
    @Override // defpackage.mp3
    public final void a(long j, Object obj) {
        ((i1) ((r33) l37.d.i(j, obj))).A = false;
    }

    @Override // defpackage.mp3
    public final void b(long j, Object obj, Object obj2) {
        k37 k37Var = l37.d;
        r33 r33Var = (r33) k37Var.i(j, obj);
        r33 r33Var2 = (r33) k37Var.i(j, obj2);
        int size = r33Var.size();
        int size2 = r33Var2.size();
        if (size > 0 && size2 > 0) {
            if (!((i1) r33Var).A) {
                r33Var = r33Var.e(size2 + size);
            }
            r33Var.addAll(r33Var2);
        }
        if (size > 0) {
            r33Var2 = r33Var;
        }
        l37.o(j, obj, r33Var2);
    }

    @Override // defpackage.mp3
    public final List c(long j, Object obj) {
        int i;
        r33 r33Var = (r33) l37.d.i(j, obj);
        if (!((i1) r33Var).A) {
            int size = r33Var.size();
            if (size == 0) {
                i = 10;
            } else {
                i = size * 2;
            }
            r33 e = r33Var.e(i);
            l37.o(j, obj, e);
            return e;
        }
        return r33Var;
    }
}
