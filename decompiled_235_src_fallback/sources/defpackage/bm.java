package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bm  reason: default package */
/* loaded from: classes.dex */
public class bm implements defpackage.sm6 {
    public static final defpackage.xd5 e = null;
    public final java.lang.Class a;
    public final java.lang.reflect.Method b;
    public final java.lang.reflect.Method c;
    public final java.lang.reflect.Method d;

    static {
            xd5 r0 = new xd5
            r1 = 22
            r0.<init>(r1)
            defpackage.bm.e = r0
            return
    }

    public bm(java.lang.Class r3) {
            r2 = this;
            r2.<init>()
            r2.a = r3
            java.lang.Class r0 = java.lang.Boolean.TYPE
            java.lang.Class[] r0 = new java.lang.Class[]{r0}
            java.lang.String r1 = "setUseSessionTickets"
            java.lang.reflect.Method r0 = r3.getDeclaredMethod(r1, r0)
            r0.getClass()
            r2.b = r0
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            java.lang.Class[] r0 = new java.lang.Class[]{r0}
            java.lang.String r1 = "setHostname"
            r3.getMethod(r1, r0)
            java.lang.String r0 = "getAlpnSelectedProtocol"
            r1 = 0
            java.lang.reflect.Method r0 = r3.getMethod(r0, r1)
            r2.c = r0
            java.lang.Class<byte[]> r0 = byte[].class
            java.lang.Class[] r0 = new java.lang.Class[]{r0}
            java.lang.String r1 = "setAlpnProtocols"
            java.lang.reflect.Method r3 = r3.getMethod(r1, r0)
            r2.d = r3
            return
    }

    @Override // defpackage.sm6
    public final boolean a(javax.net.ssl.SSLSocket r1) {
            r0 = this;
            java.lang.Class r0 = r0.a
            boolean r0 = r0.isInstance(r1)
            return r0
    }

    @Override // defpackage.sm6
    public final boolean b() {
            r0 = this;
            boolean r0 = defpackage.nj.e
            boolean r0 = defpackage.nj.e
            return r0
    }

    @Override // defpackage.sm6
    public final java.lang.String c(javax.net.ssl.SSLSocket r3) {
            r2 = this;
            java.lang.Class r0 = r2.a
            boolean r0 = r0.isInstance(r3)
            r1 = 0
            if (r0 != 0) goto La
            goto L33
        La:
            java.lang.reflect.Method r2 = r2.c     // Catch: java.lang.reflect.InvocationTargetException -> L1c java.lang.IllegalAccessException -> L3a
            java.lang.Object r2 = r2.invoke(r3, r1)     // Catch: java.lang.reflect.InvocationTargetException -> L1c java.lang.IllegalAccessException -> L3a
            byte[] r2 = (byte[]) r2     // Catch: java.lang.reflect.InvocationTargetException -> L1c java.lang.IllegalAccessException -> L3a
            if (r2 == 0) goto L33
            java.lang.String r3 = new java.lang.String     // Catch: java.lang.reflect.InvocationTargetException -> L1c java.lang.IllegalAccessException -> L3a
            java.nio.charset.Charset r0 = defpackage.qm0.a     // Catch: java.lang.reflect.InvocationTargetException -> L1c java.lang.IllegalAccessException -> L3a
            r3.<init>(r2, r0)     // Catch: java.lang.reflect.InvocationTargetException -> L1c java.lang.IllegalAccessException -> L3a
            return r3
        L1c:
            r2 = move-exception
            java.lang.Throwable r3 = r2.getCause()
            boolean r0 = r3 instanceof java.lang.NullPointerException
            if (r0 == 0) goto L34
            java.lang.NullPointerException r3 = (java.lang.NullPointerException) r3
            java.lang.String r3 = r3.getMessage()
            java.lang.String r0 = "ssl == null"
            boolean r3 = defpackage.nb3.k(r3, r0)
            if (r3 == 0) goto L34
        L33:
            return r1
        L34:
            java.lang.AssertionError r3 = new java.lang.AssertionError
            r3.<init>(r2)
            throw r3
        L3a:
            r2 = move-exception
            java.lang.AssertionError r3 = new java.lang.AssertionError
            r3.<init>(r2)
            throw r3
    }

    @Override // defpackage.sm6
    public final void d(javax.net.ssl.SSLSocket r2, java.lang.String r3, java.util.List r4) {
            r1 = this;
            r4.getClass()
            java.lang.Class r3 = r1.a
            boolean r3 = r3.isInstance(r2)
            if (r3 == 0) goto L34
            java.lang.reflect.Method r3 = r1.b     // Catch: java.lang.reflect.InvocationTargetException -> L26 java.lang.IllegalAccessException -> L2d
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch: java.lang.reflect.InvocationTargetException -> L26 java.lang.IllegalAccessException -> L2d
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch: java.lang.reflect.InvocationTargetException -> L26 java.lang.IllegalAccessException -> L2d
            r3.invoke(r2, r0)     // Catch: java.lang.reflect.InvocationTargetException -> L26 java.lang.IllegalAccessException -> L2d
            java.lang.reflect.Method r1 = r1.d     // Catch: java.lang.reflect.InvocationTargetException -> L26 java.lang.IllegalAccessException -> L2d
            kx4 r3 = defpackage.kx4.a     // Catch: java.lang.reflect.InvocationTargetException -> L26 java.lang.IllegalAccessException -> L2d
            byte[] r3 = defpackage.q61.k(r4)     // Catch: java.lang.reflect.InvocationTargetException -> L26 java.lang.IllegalAccessException -> L2d
            java.lang.Object[] r3 = new java.lang.Object[]{r3}     // Catch: java.lang.reflect.InvocationTargetException -> L26 java.lang.IllegalAccessException -> L2d
            r1.invoke(r2, r3)     // Catch: java.lang.reflect.InvocationTargetException -> L26 java.lang.IllegalAccessException -> L2d
            return
        L26:
            r1 = move-exception
            java.lang.AssertionError r2 = new java.lang.AssertionError
            r2.<init>(r1)
            throw r2
        L2d:
            r1 = move-exception
            java.lang.AssertionError r2 = new java.lang.AssertionError
            r2.<init>(r1)
            throw r2
        L34:
            return
    }
}
