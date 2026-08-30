package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: fu  reason: default package */
/* loaded from: classes.dex */
public abstract class fu {
    public static final int a;

    static {
        Object kc5Var;
        int i;
        Object obj = null;
        try {
            String property = System.getProperty("kotlinx.serialization.json.pool.size");
            if (property != null) {
                kc5Var = gh6.o0(property);
            } else {
                kc5Var = null;
            }
        } catch (Throwable th) {
            kc5Var = new kc5(th);
        }
        if (!(kc5Var instanceof kc5)) {
            obj = kc5Var;
        }
        Integer num = (Integer) obj;
        if (num != null) {
            i = num.intValue();
        } else {
            i = 2097152;
        }
        a = i;
    }
}
