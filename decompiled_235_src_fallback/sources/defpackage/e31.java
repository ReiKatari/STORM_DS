package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: e31  reason: default package */
/* loaded from: classes.dex */
public final class e31 {
    public final java.lang.ClassLoader a;

    public e31(java.lang.ClassLoader r1, int r2) {
            r0 = this;
            switch(r2) {
                case 1: goto Lc;
                default: goto L3;
            }
        L3:
            r1.getClass()
            r0.<init>()
            r0.a = r1
            return
        Lc:
            r0.<init>()
            r0.a = r1
            return
    }

    public defpackage.d31 a(java.lang.Object r4, defpackage.ar0 r5, android.app.Activity r6, defpackage.n82 r7) {
            r3 = this;
            c31 r0 = new c31
            r0.<init>(r5, r7)
            java.lang.ClassLoader r3 = r3.a
            java.lang.String r5 = "java.util.function.Consumer"
            java.lang.Class r7 = r3.loadClass(r5)
            r7.getClass()
            java.lang.Class[] r7 = new java.lang.Class[]{r7}
            java.lang.Object r7 = java.lang.reflect.Proxy.newProxyInstance(r3, r7, r0)
            r7.getClass()
            java.lang.Class r0 = r4.getClass()
            java.lang.Class r1 = r3.loadClass(r5)
            r1.getClass()
            java.lang.Class<android.app.Activity> r2 = android.app.Activity.class
            java.lang.Class[] r1 = new java.lang.Class[]{r2, r1}
            java.lang.String r2 = "addWindowLayoutInfoListener"
            java.lang.reflect.Method r0 = r0.getMethod(r2, r1)
            java.lang.Object[] r6 = new java.lang.Object[]{r6, r7}
            r0.invoke(r4, r6)
            java.lang.Class r6 = r4.getClass()
            java.lang.Class r3 = r3.loadClass(r5)
            r3.getClass()
            java.lang.Class[] r3 = new java.lang.Class[]{r3}
            java.lang.String r5 = "removeWindowLayoutInfoListener"
            java.lang.reflect.Method r3 = r6.getMethod(r5, r3)
            d31 r5 = new d31
            r5.<init>(r3, r4, r7)
            return r5
    }
}
