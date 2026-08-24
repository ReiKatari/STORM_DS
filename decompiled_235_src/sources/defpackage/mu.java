package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mu  reason: default package */
/* loaded from: classes.dex */
public class mu {
    public static volatile mu a;

    /* JADX WARN: Type inference failed for: r0v0, types: [mu, java.lang.Object] */
    static {
        ?? obj = new Object();
        String property = System.getProperty("org.tukaani.xz.ArrayCache");
        if (property == null) {
            property = "Dummy";
        }
        if (!property.equals("Basic")) {
            if (property.equals("Dummy")) {
                a = obj;
                return;
            }
            throw new Error(lb1.A("Unsupported value '", property, "' in the system property org.tukaani.xz.ArrayCache. Supported values: Dummy, Basic"));
        }
        a = b30.a;
    }

    public byte[] a(int i) {
        return new byte[i];
    }

    public void b(byte[] bArr) {
    }
}
