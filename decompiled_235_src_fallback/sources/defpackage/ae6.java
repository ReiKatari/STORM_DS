package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ae6  reason: default package */
/* loaded from: classes.dex */
public final class ae6 {
    public final java.io.File a;
    public final java.text.SimpleDateFormat b;

    public ae6(android.content.Context r3) {
            r2 = this;
            r2.<init>()
            java.io.File r0 = new java.io.File
            java.io.File r3 = r3.getFilesDir()
            java.lang.String r1 = "shader-compatibility.log"
            r0.<init>(r3, r1)
            r2.a = r0
            java.text.SimpleDateFormat r3 = new java.text.SimpleDateFormat
            java.lang.String r0 = "yyyy-MM-dd HH:mm:ss"
            java.util.Locale r1 = java.util.Locale.US
            r3.<init>(r0, r1)
            r2.b = r3
            return
    }
}
