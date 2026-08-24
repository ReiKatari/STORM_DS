package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: j82  reason: default package */
/* loaded from: classes.dex */
public abstract class j82 {
    public static final i82 a = new Object();
    public static final i82 b;

    /* JADX WARN: Type inference failed for: r0v0, types: [i82, java.lang.Object] */
    static {
        i82 i82Var = null;
        try {
            i82Var = (i82) Class.forName("com.google.crypto.tink.shaded.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        b = i82Var;
    }
}
