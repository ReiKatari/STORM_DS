package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: kh5  reason: default package */
/* loaded from: classes.dex */
public abstract class kh5 {
    public static final defpackage.kh5 a = null;

    static {
            int r0 = defpackage.qc3.a
            r1 = 9
            if (r0 < r1) goto L1a
            java.lang.Class<java.lang.reflect.AccessibleObject> r0 = java.lang.reflect.AccessibleObject.class
            java.lang.String r1 = "canAccess"
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            java.lang.Class[] r2 = new java.lang.Class[]{r2}     // Catch: java.lang.NoSuchMethodException -> L1a
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r2)     // Catch: java.lang.NoSuchMethodException -> L1a
            ih5 r1 = new ih5     // Catch: java.lang.NoSuchMethodException -> L1a
            r1.<init>(r0)     // Catch: java.lang.NoSuchMethodException -> L1a
            goto L1b
        L1a:
            r1 = 0
        L1b:
            if (r1 != 0) goto L22
            jh5 r1 = new jh5
            r1.<init>()
        L22:
            defpackage.kh5.a = r1
            return
    }

    public abstract boolean a(java.lang.Object r1, java.lang.reflect.AccessibleObject r2);
}
