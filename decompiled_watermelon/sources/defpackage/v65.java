package defpackage;

import android.util.SparseArray;
import java.util.Set;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: v65  reason: default package */
/* loaded from: classes.dex */
public final class v65 {
    public SparseArray a;
    public int b;
    public Set c;

    public final u65 a(int i) {
        SparseArray sparseArray = this.a;
        u65 u65Var = (u65) sparseArray.get(i);
        if (u65Var == null) {
            u65 u65Var2 = new u65();
            sparseArray.put(i, u65Var2);
            return u65Var2;
        }
        return u65Var;
    }
}
