package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ut  reason: default package */
/* loaded from: classes.dex */
public class ut {
    public static volatile ut a;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, ut] */
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
            throw new Error(wh1.A("Unsupported value '", property, "' in the system property org.tukaani.xz.ArrayCache. Supported values: Dummy, Basic"));
        }
        a = h10.a;
    }

    public byte[] a(int i) {
        return new byte[i];
    }

    public void b(byte[] bArr) {
    }
}
