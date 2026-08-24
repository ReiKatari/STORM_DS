package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: f74  reason: default package */
/* loaded from: classes.dex */
public final class f74 {
    public java.lang.reflect.Method a;
    public java.lang.reflect.Method b;
    public java.lang.reflect.Method c;

    public f74(java.lang.reflect.Method r1, java.lang.reflect.Method r2, java.lang.reflect.Method r3) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            return
    }

    public static void a() {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 >= r1) goto L7
            return
        L7:
            java.lang.UnsupportedClassVersionError r0 = new java.lang.UnsupportedClassVersionError
            java.lang.String r1 = "This function can only be used for API Level < 29."
            r0.<init>(r1)
            throw r0
    }
}
