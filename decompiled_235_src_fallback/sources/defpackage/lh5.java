package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: lh5  reason: default package */
/* loaded from: classes.dex */
public final class lh5 {
    public static java.lang.String a(defpackage.oo2 r1) {
            java.lang.Class r1 = r1.getClass()
            java.lang.reflect.Type[] r1 = r1.getGenericInterfaces()
            r0 = 0
            r1 = r1[r0]
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = "kotlin.jvm.functions."
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L1d
            r0 = 21
            java.lang.String r1 = r1.substring(r0)
        L1d:
            return r1
    }
}
