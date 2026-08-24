package defpackage;

import android.util.SparseArray;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: q65  reason: default package */
/* loaded from: classes.dex */
public enum q65 {
    DEFAULT(0),
    UNMETERED_ONLY(1),
    UNMETERED_OR_DAILY(2),
    FAST_IF_RADIO_AWAKE(3),
    NEVER(4),
    UNRECOGNIZED(-1);
    
    private static final SparseArray<q65> valueMap;
    private final int value;

    static {
        q65 q65Var = DEFAULT;
        q65 q65Var2 = UNMETERED_ONLY;
        q65 q65Var3 = UNMETERED_OR_DAILY;
        q65 q65Var4 = FAST_IF_RADIO_AWAKE;
        q65 q65Var5 = NEVER;
        q65 q65Var6 = UNRECOGNIZED;
        SparseArray<q65> sparseArray = new SparseArray<>();
        valueMap = sparseArray;
        sparseArray.put(0, q65Var);
        sparseArray.put(1, q65Var2);
        sparseArray.put(2, q65Var3);
        sparseArray.put(3, q65Var4);
        sparseArray.put(4, q65Var5);
        sparseArray.put(-1, q65Var6);
    }

    q65(int i) {
        this.value = i;
    }

    public static q65 forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return null;
                        }
                        return NEVER;
                    }
                    return FAST_IF_RADIO_AWAKE;
                }
                return UNMETERED_OR_DAILY;
            }
            return UNMETERED_ONLY;
        }
        return DEFAULT;
    }

    public final int getNumber() {
        return this.value;
    }
}
