package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gh5  reason: default package */
/* loaded from: classes.dex */
public abstract class gh5 {
    public static final defpackage.lh5 a = null;

    static {
            r0 = 0
            java.lang.String r1 = "kotlin.reflect.jvm.internal.ReflectionFactoryImpl"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> Le
            java.lang.Object r1 = r1.newInstance()     // Catch: java.lang.Throwable -> Le
            lh5 r1 = (defpackage.lh5) r1     // Catch: java.lang.Throwable -> Le
            r0 = r1
        Le:
            if (r0 == 0) goto L11
            goto L16
        L11:
            lh5 r0 = new lh5
            r0.<init>()
        L16:
            defpackage.gh5.a = r0
            return
    }

    public static defpackage.ar0 a(java.lang.Class r1) {
            lh5 r0 = defpackage.gh5.a
            r0.getClass()
            ar0 r0 = new ar0
            r0.<init>(r1)
            return r0
    }
}
