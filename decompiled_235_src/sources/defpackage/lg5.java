package defpackage;

import android.util.SparseArray;
import java.util.Set;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: lg5  reason: default package */
/* loaded from: classes.dex */
public final class lg5 {
    public SparseArray a;
    public int b;
    public Set c;

    public final kg5 a(int i) {
        SparseArray sparseArray = this.a;
        kg5 kg5Var = (kg5) sparseArray.get(i);
        if (kg5Var == null) {
            kg5 kg5Var2 = new kg5();
            sparseArray.put(i, kg5Var2);
            return kg5Var2;
        }
        return kg5Var;
    }
}
