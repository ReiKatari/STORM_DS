package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: oe7  reason: default package */
/* loaded from: classes.dex */
public final class oe7 extends defpackage.ne7 {
    @Override // defpackage.ne7
    public final android.graphics.Typeface a0(java.lang.Object r4) {
            r3 = this;
            r0 = -1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Class r1 = r3.h0     // Catch: java.lang.Throwable -> L20
            r2 = 1
            java.lang.Object r1 = java.lang.reflect.Array.newInstance(r1, r2)     // Catch: java.lang.Throwable -> L20
            r2 = 0
            java.lang.reflect.Array.set(r1, r2, r4)     // Catch: java.lang.Throwable -> L20
            java.lang.reflect.Method r3 = r3.n0     // Catch: java.lang.Throwable -> L20
            java.lang.String r4 = "sans-serif"
            java.lang.Object[] r4 = new java.lang.Object[]{r1, r4, r0, r0}     // Catch: java.lang.Throwable -> L20
            r0 = 0
            java.lang.Object r3 = r3.invoke(r0, r4)     // Catch: java.lang.Throwable -> L20
            android.graphics.Typeface r3 = (android.graphics.Typeface) r3     // Catch: java.lang.Throwable -> L20
            return r3
        L20:
            r3 = move-exception
            java.lang.RuntimeException r4 = new java.lang.RuntimeException
            r4.<init>(r3)
            throw r4
    }

    @Override // defpackage.ne7
    public final java.lang.reflect.Method d0(java.lang.Class r3) {
            r2 = this;
            r2 = 1
            java.lang.Object r3 = java.lang.reflect.Array.newInstance(r3, r2)
            java.lang.Class r3 = r3.getClass()
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            java.lang.Class r1 = java.lang.Integer.TYPE
            java.lang.Class[] r3 = new java.lang.Class[]{r3, r0, r1, r1}
            java.lang.Class<android.graphics.Typeface> r0 = android.graphics.Typeface.class
            java.lang.String r1 = "createFromFamiliesWithDefault"
            java.lang.reflect.Method r3 = r0.getDeclaredMethod(r1, r3)
            r3.setAccessible(r2)
            return r3
    }
}
