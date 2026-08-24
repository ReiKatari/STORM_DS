package defpackage;

import android.util.SparseArray;
import java.util.HashMap;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: d35  reason: default package */
/* loaded from: classes.dex */
public abstract class d35 {
    public static final SparseArray a = new SparseArray();
    public static final HashMap b;

    static {
        HashMap hashMap = new HashMap();
        b = hashMap;
        hashMap.put(b35.DEFAULT, 0);
        hashMap.put(b35.VERY_LOW, 1);
        hashMap.put(b35.HIGHEST, 2);
        for (b35 b35Var : hashMap.keySet()) {
            a.append(((Integer) b.get(b35Var)).intValue(), b35Var);
        }
    }

    public static int a(b35 b35Var) {
        Integer num = (Integer) b.get(b35Var);
        if (num != null) {
            return num.intValue();
        }
        e41.y(b35Var, "PriorityMapping is missing known Priority value ");
        return 0;
    }

    public static b35 b(int i) {
        b35 b35Var = (b35) a.get(i);
        if (b35Var != null) {
            return b35Var;
        }
        i.h(lb1.g(i, "Unknown Priority for value "));
        return null;
    }
}
