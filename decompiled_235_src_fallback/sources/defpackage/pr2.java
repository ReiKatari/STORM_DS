package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: pr2  reason: default package */
/* loaded from: classes.dex */
public abstract class pr2 extends defpackage.c1 {
    private static java.util.Map<java.lang.Object, defpackage.pr2> defaultInstanceMap;
    protected int memoizedSerializedSize;
    protected defpackage.mg7 unknownFields;

    static {
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            defpackage.pr2.defaultInstanceMap = r0
            return
    }

    public pr2() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.memoizedHashCode = r0
            mg7 r0 = defpackage.mg7.f
            r1.unknownFields = r0
            r0 = -1
            r1.memoizedSerializedSize = r0
            return
    }

    public static defpackage.pr2 g(java.lang.Class r3) {
            java.util.Map<java.lang.Object, pr2> r0 = defpackage.pr2.defaultInstanceMap
            java.lang.Object r0 = r0.get(r3)
            pr2 r0 = (defpackage.pr2) r0
            if (r0 != 0) goto L28
            java.lang.String r0 = r3.getName()     // Catch: java.lang.ClassNotFoundException -> L1f
            java.lang.ClassLoader r1 = r3.getClassLoader()     // Catch: java.lang.ClassNotFoundException -> L1f
            r2 = 1
            java.lang.Class.forName(r0, r2, r1)     // Catch: java.lang.ClassNotFoundException -> L1f
            java.util.Map<java.lang.Object, pr2> r0 = defpackage.pr2.defaultInstanceMap
            java.lang.Object r0 = r0.get(r3)
            pr2 r0 = (defpackage.pr2) r0
            goto L28
        L1f:
            r3 = move-exception
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Class initialization cannot fail."
            r0.<init>(r1, r3)
            throw r0
        L28:
            if (r0 != 0) goto L48
            java.lang.Object r0 = defpackage.gh7.a(r3)
            pr2 r0 = (defpackage.pr2) r0
            r0.getClass()
            or2 r1 = defpackage.or2.GET_DEFAULT_INSTANCE
            java.lang.Object r0 = r0.f(r1)
            pr2 r0 = (defpackage.pr2) r0
            if (r0 == 0) goto L43
            java.util.Map<java.lang.Object, pr2> r1 = defpackage.pr2.defaultInstanceMap
            r1.put(r3, r0)
            return r0
        L43:
            defpackage.e41.m()
            r3 = 0
            return r3
        L48:
            return r0
    }

    public static java.lang.Object h(java.lang.reflect.Method r1, defpackage.pr2 r2, java.lang.Object... r3) {
            r0 = 0
            java.lang.Object r1 = r1.invoke(r2, r3)     // Catch: java.lang.reflect.InvocationTargetException -> L6 java.lang.IllegalAccessException -> L1f
            return r1
        L6:
            r1 = move-exception
            java.lang.Throwable r1 = r1.getCause()
            boolean r2 = r1 instanceof java.lang.RuntimeException
            if (r2 != 0) goto L1c
            boolean r2 = r1 instanceof java.lang.Error
            if (r2 != 0) goto L19
            java.lang.String r2 = "Unexpected exception thrown by generated accessor method."
            defpackage.u34.p(r2, r1)
            return r0
        L19:
            java.lang.Error r1 = (java.lang.Error) r1
            throw r1
        L1c:
            java.lang.RuntimeException r1 = (java.lang.RuntimeException) r1
            throw r1
        L1f:
            r1 = move-exception
            java.lang.String r2 = "Couldn't use Java reflection to implement protocol message reflection."
            defpackage.u34.p(r2, r1)
            return r0
    }

    public static defpackage.pr2 j(defpackage.pr2 r4, defpackage.ea0 r5, defpackage.g82 r6) {
            ca0 r5 = (defpackage.ca0) r5
            byte[] r0 = r5.R
            int r1 = r5.g()
            int r5 = r5.size()
            ks0 r2 = new ks0
            r3 = 1
            r2.<init>(r0, r1, r5, r3)
            r2.e(r5)     // Catch: defpackage.ub3 -> L89
            or2 r5 = defpackage.or2.NEW_MUTABLE_INSTANCE
            java.lang.Object r4 = r4.f(r5)
            pr2 r4 = (defpackage.pr2) r4
            y45 r5 = defpackage.y45.c     // Catch: java.lang.RuntimeException -> L5e java.io.IOException -> L6f
            r5.getClass()     // Catch: java.lang.RuntimeException -> L5e java.io.IOException -> L6f
            java.lang.Class r0 = r4.getClass()     // Catch: java.lang.RuntimeException -> L5e java.io.IOException -> L6f
            j66 r5 = r5.a(r0)     // Catch: java.lang.RuntimeException -> L5e java.io.IOException -> L6f
            ls0 r0 = r2.b     // Catch: java.lang.RuntimeException -> L5e java.io.IOException -> L6f
            if (r0 == 0) goto L2f
            goto L34
        L2f:
            ls0 r0 = new ls0     // Catch: java.lang.RuntimeException -> L5e java.io.IOException -> L6f
            r0.<init>(r2)     // Catch: java.lang.RuntimeException -> L5e java.io.IOException -> L6f
        L34:
            r5.d(r4, r0, r6)     // Catch: java.lang.RuntimeException -> L5e java.io.IOException -> L6f
            r5.a(r4)     // Catch: java.lang.RuntimeException -> L5e java.io.IOException -> L6f
            int r5 = r2.h
            if (r5 != 0) goto L56
            boolean r5 = r4.i()
            if (r5 == 0) goto L45
            return r4
        L45:
            ug r4 = new ug
            r5 = 14
            r4.<init>(r5)
            ub3 r5 = new ub3
            java.lang.String r4 = r4.getMessage()
            r5.<init>(r4)
            throw r5
        L56:
            ub3 r4 = new ub3
            java.lang.String r5 = "Protocol message end-group tag did not match expected tag."
            r4.<init>(r5)
            throw r4
        L5e:
            r4 = move-exception
            java.lang.Throwable r5 = r4.getCause()
            boolean r5 = r5 instanceof defpackage.ub3
            if (r5 == 0) goto L6e
            java.lang.Throwable r4 = r4.getCause()
            ub3 r4 = (defpackage.ub3) r4
            throw r4
        L6e:
            throw r4
        L6f:
            r4 = move-exception
            java.lang.Throwable r5 = r4.getCause()
            boolean r5 = r5 instanceof defpackage.ub3
            if (r5 == 0) goto L7f
            java.lang.Throwable r4 = r4.getCause()
            ub3 r4 = (defpackage.ub3) r4
            throw r4
        L7f:
            ub3 r5 = new ub3
            java.lang.String r4 = r4.getMessage()
            r5.<init>(r4)
            throw r5
        L89:
            r4 = move-exception
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            r5.<init>(r4)
            throw r5
    }

    public static defpackage.pr2 k(defpackage.pr2 r6, byte[] r7, defpackage.g82 r8) {
            int r4 = r7.length
            or2 r0 = defpackage.or2.NEW_MUTABLE_INSTANCE
            java.lang.Object r6 = r6.f(r0)
            r1 = r6
            pr2 r1 = (defpackage.pr2) r1
            y45 r6 = defpackage.y45.c     // Catch: java.lang.IndexOutOfBoundsException -> L49 java.io.IOException -> L4e
            r6.getClass()     // Catch: java.lang.IndexOutOfBoundsException -> L49 java.io.IOException -> L4e
            java.lang.Class r0 = r1.getClass()     // Catch: java.lang.IndexOutOfBoundsException -> L49 java.io.IOException -> L4e
            j66 r0 = r6.a(r0)     // Catch: java.lang.IndexOutOfBoundsException -> L49 java.io.IOException -> L4e
            ou r5 = new ou     // Catch: java.lang.IndexOutOfBoundsException -> L49 java.io.IOException -> L4e
            r5.<init>()     // Catch: java.lang.IndexOutOfBoundsException -> L49 java.io.IOException -> L4e
            r8.getClass()     // Catch: java.lang.IndexOutOfBoundsException -> L49 java.io.IOException -> L4e
            r3 = 0
            r2 = r7
            r0.h(r1, r2, r3, r4, r5)     // Catch: java.lang.IndexOutOfBoundsException -> L49 java.io.IOException -> L4e
            r0.a(r1)     // Catch: java.lang.IndexOutOfBoundsException -> L49 java.io.IOException -> L4e
            int r6 = r1.memoizedHashCode     // Catch: java.lang.IndexOutOfBoundsException -> L49 java.io.IOException -> L4e
            if (r6 != 0) goto L43
            boolean r6 = r1.i()
            if (r6 == 0) goto L32
            return r1
        L32:
            ug r6 = new ug
            r7 = 14
            r6.<init>(r7)
            ub3 r7 = new ub3
            java.lang.String r6 = r6.getMessage()
            r7.<init>(r6)
            throw r7
        L43:
            java.lang.RuntimeException r6 = new java.lang.RuntimeException     // Catch: java.lang.IndexOutOfBoundsException -> L49 java.io.IOException -> L4e
            r6.<init>()     // Catch: java.lang.IndexOutOfBoundsException -> L49 java.io.IOException -> L4e
            throw r6     // Catch: java.lang.IndexOutOfBoundsException -> L49 java.io.IOException -> L4e
        L49:
            ub3 r6 = defpackage.ub3.e()
            throw r6
        L4e:
            r0 = move-exception
            r6 = r0
            java.lang.Throwable r7 = r6.getCause()
            boolean r7 = r7 instanceof defpackage.ub3
            if (r7 == 0) goto L5f
            java.lang.Throwable r6 = r6.getCause()
            ub3 r6 = (defpackage.ub3) r6
            throw r6
        L5f:
            ub3 r7 = new ub3
            java.lang.String r6 = r6.getMessage()
            r7.<init>(r6)
            throw r7
    }

    public static void l(java.lang.Class r1, defpackage.pr2 r2) {
            java.util.Map<java.lang.Object, pr2> r0 = defpackage.pr2.defaultInstanceMap
            r0.put(r1, r2)
            return
    }

    @Override // defpackage.c1
    public final int a() {
            r2 = this;
            int r0 = r2.memoizedSerializedSize
            r1 = -1
            if (r0 != r1) goto L18
            y45 r0 = defpackage.y45.c
            r0.getClass()
            java.lang.Class r1 = r2.getClass()
            j66 r0 = r0.a(r1)
            int r0 = r0.i(r2)
            r2.memoizedSerializedSize = r0
        L18:
            int r2 = r2.memoizedSerializedSize
            return r2
    }

    @Override // defpackage.c1
    public final void d(defpackage.ms0 r3) {
            r2 = this;
            y45 r0 = defpackage.y45.c
            r0.getClass()
            java.lang.Class r1 = r2.getClass()
            j66 r0 = r0.a(r1)
            os0 r1 = r3.a
            if (r1 == 0) goto L12
            goto L17
        L12:
            os0 r1 = new os0
            r1.<init>(r3)
        L17:
            r0.e(r2, r1)
            return
    }

    public final defpackage.mr2 e() {
            r1 = this;
            or2 r0 = defpackage.or2.NEW_BUILDER
            java.lang.Object r1 = r1.f(r0)
            mr2 r1 = (defpackage.mr2) r1
            return r1
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L4
            r2 = 1
            return r2
        L4:
            or2 r0 = defpackage.or2.GET_DEFAULT_INSTANCE
            java.lang.Object r0 = r2.f(r0)
            pr2 r0 = (defpackage.pr2) r0
            java.lang.Class r0 = r0.getClass()
            boolean r0 = r0.isInstance(r3)
            if (r0 != 0) goto L18
            r2 = 0
            return r2
        L18:
            y45 r0 = defpackage.y45.c
            r0.getClass()
            java.lang.Class r1 = r2.getClass()
            j66 r0 = r0.a(r1)
            pr2 r3 = (defpackage.pr2) r3
            boolean r2 = r0.c(r2, r3)
            return r2
    }

    public abstract java.lang.Object f(defpackage.or2 r1);

    public final int hashCode() {
            r2 = this;
            int r0 = r2.memoizedHashCode
            if (r0 == 0) goto L5
            return r0
        L5:
            y45 r0 = defpackage.y45.c
            r0.getClass()
            java.lang.Class r1 = r2.getClass()
            j66 r0 = r0.a(r1)
            int r0 = r0.f(r2)
            r2.memoizedHashCode = r0
            return r0
    }

    public final boolean i() {
            r2 = this;
            or2 r0 = defpackage.or2.GET_MEMOIZED_IS_INITIALIZED
            java.lang.Object r0 = r2.f(r0)
            java.lang.Byte r0 = (java.lang.Byte) r0
            byte r0 = r0.byteValue()
            r1 = 1
            if (r0 != r1) goto L10
            return r1
        L10:
            if (r0 != 0) goto L14
            r2 = 0
            return r2
        L14:
            y45 r0 = defpackage.y45.c
            r0.getClass()
            java.lang.Class r1 = r2.getClass()
            j66 r0 = r0.a(r1)
            boolean r0 = r0.b(r2)
            or2 r1 = defpackage.or2.SET_MEMOIZED_IS_INITIALIZED
            r2.f(r1)
            return r0
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = super.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "# "
            r1.append(r2)
            r1.append(r0)
            r0 = 0
            defpackage.nc1.b0(r3, r1, r0)
            java.lang.String r3 = r1.toString()
            return r3
    }
}
