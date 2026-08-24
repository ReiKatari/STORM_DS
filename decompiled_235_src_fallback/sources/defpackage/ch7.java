package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ch7  reason: default package */
/* loaded from: classes.dex */
public final class ch7 implements java.security.PrivilegedExceptionAction {
    public static sun.misc.Unsafe a() {
            java.lang.Class<sun.misc.Unsafe> r0 = sun.misc.Unsafe.class
            java.lang.reflect.Field[] r1 = r0.getDeclaredFields()
            int r2 = r1.length
            r3 = 0
        L8:
            r4 = 0
            if (r3 >= r2) goto L25
            r5 = r1[r3]
            r6 = 1
            r5.setAccessible(r6)
            java.lang.Object r4 = r5.get(r4)
            boolean r5 = r0.isInstance(r4)
            if (r5 == 0) goto L22
            java.lang.Object r0 = r0.cast(r4)
            sun.misc.Unsafe r0 = (sun.misc.Unsafe) r0
            return r0
        L22:
            int r3 = r3 + 1
            goto L8
        L25:
            return r4
    }

    @Override // java.security.PrivilegedExceptionAction
    public final /* bridge */ /* synthetic */ java.lang.Object run() {
            r0 = this;
            sun.misc.Unsafe r0 = a()
            return r0
    }
}
