package pd;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a  reason: collision with root package name */
    public static final int f11569a;

    static {
        Object kVar;
        int i2;
        Object obj = null;
        try {
            String property = System.getProperty("kotlinx.serialization.json.pool.size");
            if (property != null) {
                kVar = vc.o.W(property);
            } else {
                kVar = null;
            }
        } catch (Throwable th2) {
            kVar = new yb.k(th2);
        }
        if (!(kVar instanceof yb.k)) {
            obj = kVar;
        }
        Integer num = (Integer) obj;
        if (num != null) {
            i2 = num.intValue();
        } else {
            i2 = 2097152;
        }
        f11569a = i2;
    }
}
