package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: nh5  reason: default package */
/* loaded from: classes.dex */
public final class nh5 extends defpackage.uj2 {
    public final java.lang.reflect.Method h;
    public final java.lang.reflect.Method i;
    public final java.lang.reflect.Method j;
    public final java.lang.reflect.Method k;

    public nh5() {
            r3 = this;
            r3.<init>()
            java.lang.Class<java.lang.Class> r0 = java.lang.Class.class
            java.lang.String r1 = "isRecord"
            r2 = 0
            java.lang.reflect.Method r1 = r0.getMethod(r1, r2)
            r3.h = r1
            java.lang.String r1 = "getRecordComponents"
            java.lang.reflect.Method r0 = r0.getMethod(r1, r2)
            r3.i = r0
            java.lang.String r0 = "java.lang.reflect.RecordComponent"
            java.lang.Class r0 = java.lang.Class.forName(r0)
            java.lang.String r1 = "getName"
            java.lang.reflect.Method r1 = r0.getMethod(r1, r2)
            r3.j = r1
            java.lang.String r1 = "getType"
            java.lang.reflect.Method r0 = r0.getMethod(r1, r2)
            r3.k = r0
            return
    }

    @Override // defpackage.uj2
    public final java.lang.reflect.Method E(java.lang.Class r1, java.lang.reflect.Field r2) {
            r0 = this;
            r0 = 0
            java.lang.String r2 = r2.getName()     // Catch: java.lang.ReflectiveOperationException -> La
            java.lang.reflect.Method r0 = r1.getMethod(r2, r0)     // Catch: java.lang.ReflectiveOperationException -> La
            return r0
        La:
            r1 = move-exception
            java.lang.String r2 = "Unexpected ReflectiveOperationException occurred (Gson 2.14.0). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior."
            defpackage.u34.p(r2, r1)
            return r0
    }

    @Override // defpackage.uj2
    public final java.lang.reflect.Constructor F(java.lang.Class r7) {
            r6 = this;
            r0 = 0
            java.lang.reflect.Method r1 = r6.i     // Catch: java.lang.ReflectiveOperationException -> L1f
            java.lang.Object r1 = r1.invoke(r7, r0)     // Catch: java.lang.ReflectiveOperationException -> L1f
            java.lang.Object[] r1 = (java.lang.Object[]) r1     // Catch: java.lang.ReflectiveOperationException -> L1f
            int r2 = r1.length     // Catch: java.lang.ReflectiveOperationException -> L1f
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.ReflectiveOperationException -> L1f
            r3 = 0
        Ld:
            int r4 = r1.length     // Catch: java.lang.ReflectiveOperationException -> L1f
            if (r3 >= r4) goto L21
            java.lang.reflect.Method r4 = r6.k     // Catch: java.lang.ReflectiveOperationException -> L1f
            r5 = r1[r3]     // Catch: java.lang.ReflectiveOperationException -> L1f
            java.lang.Object r4 = r4.invoke(r5, r0)     // Catch: java.lang.ReflectiveOperationException -> L1f
            java.lang.Class r4 = (java.lang.Class) r4     // Catch: java.lang.ReflectiveOperationException -> L1f
            r2[r3] = r4     // Catch: java.lang.ReflectiveOperationException -> L1f
            int r3 = r3 + 1
            goto Ld
        L1f:
            r6 = move-exception
            goto L26
        L21:
            java.lang.reflect.Constructor r6 = r7.getDeclaredConstructor(r2)     // Catch: java.lang.ReflectiveOperationException -> L1f
            return r6
        L26:
            java.lang.String r7 = "Unexpected ReflectiveOperationException occurred (Gson 2.14.0). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior."
            defpackage.u34.p(r7, r6)
            return r0
    }

    @Override // defpackage.uj2
    public final java.lang.String[] M(java.lang.Class r6) {
            r5 = this;
            r0 = 0
            java.lang.reflect.Method r1 = r5.i     // Catch: java.lang.ReflectiveOperationException -> L1f
            java.lang.Object r6 = r1.invoke(r6, r0)     // Catch: java.lang.ReflectiveOperationException -> L1f
            java.lang.Object[] r6 = (java.lang.Object[]) r6     // Catch: java.lang.ReflectiveOperationException -> L1f
            int r1 = r6.length     // Catch: java.lang.ReflectiveOperationException -> L1f
            java.lang.String[] r1 = new java.lang.String[r1]     // Catch: java.lang.ReflectiveOperationException -> L1f
            r2 = 0
        Ld:
            int r3 = r6.length     // Catch: java.lang.ReflectiveOperationException -> L1f
            if (r2 >= r3) goto L21
            java.lang.reflect.Method r3 = r5.j     // Catch: java.lang.ReflectiveOperationException -> L1f
            r4 = r6[r2]     // Catch: java.lang.ReflectiveOperationException -> L1f
            java.lang.Object r3 = r3.invoke(r4, r0)     // Catch: java.lang.ReflectiveOperationException -> L1f
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.ReflectiveOperationException -> L1f
            r1[r2] = r3     // Catch: java.lang.ReflectiveOperationException -> L1f
            int r2 = r2 + 1
            goto Ld
        L1f:
            r5 = move-exception
            goto L22
        L21:
            return r1
        L22:
            java.lang.String r6 = "Unexpected ReflectiveOperationException occurred (Gson 2.14.0). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior."
            defpackage.u34.p(r6, r5)
            return r0
    }

    @Override // defpackage.uj2
    public final boolean Y(java.lang.Class r2) {
            r1 = this;
            java.lang.reflect.Method r1 = r1.h     // Catch: java.lang.ReflectiveOperationException -> Le
            r0 = 0
            java.lang.Object r1 = r1.invoke(r2, r0)     // Catch: java.lang.ReflectiveOperationException -> Le
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.ReflectiveOperationException -> Le
            boolean r1 = r1.booleanValue()     // Catch: java.lang.ReflectiveOperationException -> Le
            return r1
        Le:
            r1 = move-exception
            java.lang.String r2 = "Unexpected ReflectiveOperationException occurred (Gson 2.14.0). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior."
            defpackage.u34.p(r2, r1)
            r1 = 0
            return r1
    }
}
