package defpackage;

import android.util.SparseArray;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: r54  reason: default package */
/* loaded from: classes.dex */
public final class r54 {
    public final SparseArray a;
    public re7 b;

    public r54(int i) {
        this.a = new SparseArray(i);
    }

    public final void a(re7 re7Var, int i, int i2) {
        r54 r54Var;
        int a = re7Var.a(i);
        SparseArray sparseArray = this.a;
        if (sparseArray == null) {
            r54Var = null;
        } else {
            r54Var = (r54) sparseArray.get(a);
        }
        if (r54Var == null) {
            r54Var = new r54(1);
            sparseArray.put(re7Var.a(i), r54Var);
        }
        if (i2 > i) {
            r54Var.a(re7Var, i + 1, i2);
        } else {
            r54Var.b = re7Var;
        }
    }
}
