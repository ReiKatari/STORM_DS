package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xu  reason: default package */
/* loaded from: classes.dex */
public abstract class xu {
    public static final int a;

    static {
        Object em5Var;
        int i;
        Object obj = null;
        try {
            String property = System.getProperty("kotlinx.serialization.json.pool.size");
            if (property != null) {
                em5Var = xs6.h0(property);
            } else {
                em5Var = null;
            }
        } catch (Throwable th) {
            em5Var = new em5(th);
        }
        if (!(em5Var instanceof em5)) {
            obj = em5Var;
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
