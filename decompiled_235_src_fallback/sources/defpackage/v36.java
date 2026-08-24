package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: v36  reason: default package */
/* loaded from: classes.dex */
public abstract /* synthetic */ class v36 {
    public static final /* synthetic */ sun.misc.Unsafe a = null;

    static {
            sun.misc.Unsafe r0 = a()
            defpackage.v36.a = r0
            return
    }

    public static /* synthetic */ sun.misc.Unsafe a() {
            r0 = 0
            java.lang.Class<sun.misc.Unsafe> r1 = sun.misc.Unsafe.class
            java.lang.String r2 = "theUnsafe"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r2)     // Catch: java.lang.NoSuchFieldException -> La
            goto L35
        La:
            r1 = move-exception
            java.lang.Class<sun.misc.Unsafe> r2 = sun.misc.Unsafe.class
            java.lang.reflect.Field[] r2 = r2.getDeclaredFields()
            int r3 = r2.length
            r4 = 0
        L13:
            if (r4 >= r3) goto L31
            r5 = r2[r4]
            int r6 = r5.getModifiers()
            boolean r6 = java.lang.reflect.Modifier.isStatic(r6)
            if (r6 == 0) goto L2e
            java.lang.Class<sun.misc.Unsafe> r6 = sun.misc.Unsafe.class
            java.lang.Class r7 = r5.getType()
            boolean r6 = r6.isAssignableFrom(r7)
            if (r6 == 0) goto L2e
            goto L32
        L2e:
            int r4 = r4 + 1
            goto L13
        L31:
            r5 = r0
        L32:
            if (r5 != 0) goto L47
            r1 = r5
        L35:
            r2 = 1
            r1.setAccessible(r2)
            java.lang.Object r0 = r1.get(r0)     // Catch: java.lang.Exception -> L40
            sun.misc.Unsafe r0 = (sun.misc.Unsafe) r0     // Catch: java.lang.Exception -> L40
            return r0
        L40:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
        L47:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Couldn't find the Unsafe"
            r0.<init>(r2, r1)
            throw r0
    }
}
