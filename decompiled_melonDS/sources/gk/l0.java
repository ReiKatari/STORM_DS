package gk;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class l0 {

    /* renamed from: a  reason: collision with root package name */
    public static final a f5744a;

    /* renamed from: b  reason: collision with root package name */
    public static final b f5745b;

    /* renamed from: c  reason: collision with root package name */
    public static final b f5746c;

    static {
        String property = System.getProperty("java.vm.name");
        property.getClass();
        if (!property.equals("RoboVM")) {
            if (!property.equals("Dalvik")) {
                f5744a = null;
                f5745b = new m0(1);
                f5746c = new b(6);
                return;
            }
            f5744a = new a(0);
            f5745b = new m0(0);
            f5746c = new b(6);
            return;
        }
        f5744a = null;
        f5745b = new b(7);
        f5746c = new b(6);
    }
}
