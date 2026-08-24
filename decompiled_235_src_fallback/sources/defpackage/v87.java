package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: v87  reason: default package */
/* loaded from: classes.dex */
public abstract class v87 {
    public static final long a = 0;
    public static final java.lang.reflect.Method b = null;

    static {
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            java.lang.Class<android.os.Trace> r1 = android.os.Trace.class
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 29
            if (r2 >= r3) goto L4b
            java.lang.String r2 = "TRACE_TAG_APP"
            java.lang.reflect.Field r2 = r1.getField(r2)     // Catch: java.lang.Exception -> L43
            r3 = 0
            long r2 = r2.getLong(r3)     // Catch: java.lang.Exception -> L43
            defpackage.v87.a = r2     // Catch: java.lang.Exception -> L43
            java.lang.String r2 = "isTagEnabled"
            java.lang.Class r3 = java.lang.Long.TYPE     // Catch: java.lang.Exception -> L43
            java.lang.Class[] r4 = new java.lang.Class[]{r3}     // Catch: java.lang.Exception -> L43
            java.lang.reflect.Method r2 = r1.getMethod(r2, r4)     // Catch: java.lang.Exception -> L43
            defpackage.v87.b = r2     // Catch: java.lang.Exception -> L43
            java.lang.String r2 = "asyncTraceBegin"
            java.lang.Class r4 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L43
            java.lang.Class[] r5 = new java.lang.Class[]{r3, r0, r4}     // Catch: java.lang.Exception -> L43
            r1.getMethod(r2, r5)     // Catch: java.lang.Exception -> L43
            java.lang.String r2 = "asyncTraceEnd"
            java.lang.Class[] r5 = new java.lang.Class[]{r3, r0, r4}     // Catch: java.lang.Exception -> L43
            r1.getMethod(r2, r5)     // Catch: java.lang.Exception -> L43
            java.lang.String r2 = "traceCounter"
            java.lang.Class[] r0 = new java.lang.Class[]{r3, r0, r4}     // Catch: java.lang.Exception -> L43
            r1.getMethod(r2, r0)     // Catch: java.lang.Exception -> L43
            return
        L43:
            r0 = move-exception
            java.lang.String r1 = "TraceCompat"
            java.lang.String r2 = "Unable to initialize via reflection."
            android.util.Log.i(r1, r2, r0)
        L4b:
            return
    }

    public static boolean a() {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto Lb
            boolean r0 = defpackage.rp.g()
            return r0
        Lb:
            r0 = 0
            java.lang.reflect.Method r1 = defpackage.v87.b     // Catch: java.lang.Exception -> L25
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Exception -> L25
            long r3 = defpackage.v87.a     // Catch: java.lang.Exception -> L25
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch: java.lang.Exception -> L25
            r2[r0] = r3     // Catch: java.lang.Exception -> L25
            r3 = 0
            java.lang.Object r1 = r1.invoke(r3, r2)     // Catch: java.lang.Exception -> L25
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Exception -> L25
            boolean r0 = r1.booleanValue()     // Catch: java.lang.Exception -> L25
            return r0
        L25:
            java.lang.String r1 = "TraceCompat"
            java.lang.String r2 = "Unable to invoke isTagEnabled() via reflection."
            android.util.Log.v(r1, r2)
            return r0
    }
}
