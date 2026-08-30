package defpackage;

import android.util.SparseArray;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: yx3  reason: default package */
/* loaded from: classes.dex */
public final class yx3 {
    public final SparseArray a;
    public w07 b;

    public yx3(int i) {
        this.a = new SparseArray(i);
    }

    public final void a(w07 w07Var, int i, int i2) {
        yx3 yx3Var;
        int a = w07Var.a(i);
        SparseArray sparseArray = this.a;
        if (sparseArray == null) {
            yx3Var = null;
        } else {
            yx3Var = (yx3) sparseArray.get(a);
        }
        if (yx3Var == null) {
            yx3Var = new yx3(1);
            sparseArray.put(w07Var.a(i), yx3Var);
        }
        if (i2 > i) {
            yx3Var.a(w07Var, i + 1, i2);
        } else {
            yx3Var.b = w07Var;
        }
    }
}
