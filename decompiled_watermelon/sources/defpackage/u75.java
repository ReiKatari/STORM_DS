package defpackage;

import java.lang.reflect.AccessibleObject;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: u75  reason: default package */
/* loaded from: classes.dex */
public abstract class u75 {
    public static final u75 a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [u75] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    static {
        /*
            int r0 = defpackage.b63.a
            r1 = 9
            if (r0 < r1) goto L1a
            java.lang.Class<java.lang.reflect.AccessibleObject> r0 = java.lang.reflect.AccessibleObject.class
            java.lang.String r1 = "canAccess"
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            java.lang.Class[] r2 = new java.lang.Class[]{r2}     // Catch: java.lang.NoSuchMethodException -> L1a
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r2)     // Catch: java.lang.NoSuchMethodException -> L1a
            s75 r1 = new s75     // Catch: java.lang.NoSuchMethodException -> L1a
            r1.<init>(r0)     // Catch: java.lang.NoSuchMethodException -> L1a
            goto L1b
        L1a:
            r1 = 0
        L1b:
            if (r1 != 0) goto L22
            t75 r1 = new t75
            r1.<init>()
        L22:
            defpackage.u75.a = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u75.<clinit>():void");
    }

    public abstract boolean a(Object obj, AccessibleObject accessibleObject);
}
