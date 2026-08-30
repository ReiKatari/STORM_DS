package wa;

import java.lang.reflect.AccessibleObject;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class s {

    /* renamed from: a  reason: collision with root package name */
    public static final s f14188a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [wa.s] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    static {
        /*
            int r0 = wa.j.f14182a
            r1 = 9
            if (r0 < r1) goto L1a
            java.lang.Class<java.lang.reflect.AccessibleObject> r0 = java.lang.reflect.AccessibleObject.class
            java.lang.String r1 = "canAccess"
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            java.lang.Class[] r2 = new java.lang.Class[]{r2}     // Catch: java.lang.NoSuchMethodException -> L1a
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r2)     // Catch: java.lang.NoSuchMethodException -> L1a
            wa.q r1 = new wa.q     // Catch: java.lang.NoSuchMethodException -> L1a
            r1.<init>(r0)     // Catch: java.lang.NoSuchMethodException -> L1a
            goto L1b
        L1a:
            r1 = 0
        L1b:
            if (r1 != 0) goto L22
            wa.r r1 = new wa.r
            r1.<init>()
        L22:
            wa.s.f14188a = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: wa.s.<clinit>():void");
    }

    public abstract boolean a(Object obj, AccessibleObject accessibleObject);
}
