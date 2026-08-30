package zj;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    public static volatile b f15153a;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, zj.b] */
    static {
        ?? obj = new Object();
        String property = System.getProperty("org.tukaani.xz.ArrayCache");
        if (property == null) {
            property = "Dummy";
        }
        if (!property.equals("Basic")) {
            if (property.equals("Dummy")) {
                f15153a = obj;
                return;
            }
            throw new Error(kc.a.g("Unsupported value '", property, "' in the system property org.tukaani.xz.ArrayCache. Supported values: Dummy, Basic"));
        }
        f15153a = e.f15156a;
    }

    public byte[] a(int i2) {
        return new byte[i2];
    }

    public void b(byte[] bArr) {
    }
}
