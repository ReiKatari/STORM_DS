package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: su2  reason: default package */
/* loaded from: classes.dex */
public final class su2 {
    public final java.lang.ThreadLocal a;
    public final java.util.concurrent.ConcurrentHashMap b;
    public final defpackage.ci c;
    public final defpackage.ld3 d;
    public final java.util.List e;
    public final boolean f;
    public final defpackage.ck2 g;
    public final java.util.List h;
    public final java.util.List i;
    public final java.util.List j;

    public su2() {
            r1 = this;
            tu2 r0 = defpackage.tu2.u
            r1.<init>(r0)
            return
    }

    public su2(defpackage.tu2 r5) {
            r4 = this;
            r4.<init>()
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            r4.a = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r4.b = r0
            z62 r0 = r5.a
            java.util.HashMap r0 = new java.util.HashMap
            java.util.HashMap r1 = r5.d
            r0.<init>(r1)
            boolean r1 = r5.i
            r4.f = r1
            ck2 r1 = r5.j
            r4.g = r1
            boolean r1 = r5.k
            java.util.ArrayList r2 = r5.e
            java.util.List r2 = defpackage.tu2.b(r2)
            r4.h = r2
            java.util.ArrayList r2 = r5.f
            java.util.List r2 = defpackage.tu2.b(r2)
            r4.i = r2
            java.util.ArrayDeque r2 = r5.n
            java.util.List r2 = defpackage.tu2.b(r2)
            r4.j = r2
            tu2 r3 = defpackage.tu2.u
            if (r5 != r3) goto L4d
            ci r5 = defpackage.tu2.s
            r4.c = r5
            ld3 r5 = defpackage.tu2.t
            r4.d = r5
            java.util.List r5 = defpackage.tu2.v
            r4.e = r5
            return
        L4d:
            ci r3 = new ci
            r3.<init>(r2, r0, r1)
            r4.c = r3
            ld3 r0 = new ld3
            r0.<init>(r3)
            r4.d = r0
            java.util.List r5 = r5.a(r3, r0)
            r4.e = r5
            return
    }

    public final java.lang.Object a(defpackage.hf3 r8, defpackage.ie7 r9) {
            r7 = this;
            java.lang.String r0 = "AssertionError (GSON 2.14.0): "
            java.lang.String r1 = "Type adapter '"
            ls6 r2 = r8.B
            ls6 r3 = defpackage.ls6.LEGACY_STRICT
            if (r2 != r3) goto Lf
            ls6 r3 = defpackage.ls6.LENIENT
            r8.q0(r3)
        Lf:
            r8.n0()     // Catch: java.lang.Throwable -> L55 java.lang.AssertionError -> L57 java.io.IOException -> L59 java.lang.IllegalStateException -> L5b java.io.EOFException -> L85
            r3 = 0
            yc7 r7 = r7.d(r9)     // Catch: java.lang.Throwable -> L55 java.lang.AssertionError -> L57 java.io.IOException -> L59 java.lang.IllegalStateException -> L5b java.io.EOFException -> L5d
            java.lang.Class r9 = r9.a     // Catch: java.lang.Throwable -> L55 java.lang.AssertionError -> L57 java.io.IOException -> L59 java.lang.IllegalStateException -> L5b java.io.EOFException -> L5d
            java.lang.Object r4 = r7.b(r8)     // Catch: java.lang.Throwable -> L55 java.lang.AssertionError -> L57 java.io.IOException -> L59 java.lang.IllegalStateException -> L5b java.io.EOFException -> L5d
            java.lang.Class r5 = defpackage.ii2.b0(r9)     // Catch: java.lang.Throwable -> L55 java.lang.AssertionError -> L57 java.io.IOException -> L59 java.lang.IllegalStateException -> L5b java.io.EOFException -> L5d
            if (r4 == 0) goto L5f
            boolean r5 = r5.isInstance(r4)     // Catch: java.lang.Throwable -> L55 java.lang.AssertionError -> L57 java.io.IOException -> L59 java.lang.IllegalStateException -> L5b java.io.EOFException -> L5d
            if (r5 == 0) goto L2a
            goto L5f
        L2a:
            java.lang.ClassCastException r5 = new java.lang.ClassCastException     // Catch: java.lang.Throwable -> L55 java.lang.AssertionError -> L57 java.io.IOException -> L59 java.lang.IllegalStateException -> L5b java.io.EOFException -> L5d
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L55 java.lang.AssertionError -> L57 java.io.IOException -> L59 java.lang.IllegalStateException -> L5b java.io.EOFException -> L5d
            r6.<init>(r1)     // Catch: java.lang.Throwable -> L55 java.lang.AssertionError -> L57 java.io.IOException -> L59 java.lang.IllegalStateException -> L5b java.io.EOFException -> L5d
            r6.append(r7)     // Catch: java.lang.Throwable -> L55 java.lang.AssertionError -> L57 java.io.IOException -> L59 java.lang.IllegalStateException -> L5b java.io.EOFException -> L5d
            java.lang.String r7 = "' returned wrong type; requested "
            r6.append(r7)     // Catch: java.lang.Throwable -> L55 java.lang.AssertionError -> L57 java.io.IOException -> L59 java.lang.IllegalStateException -> L5b java.io.EOFException -> L5d
            r6.append(r9)     // Catch: java.lang.Throwable -> L55 java.lang.AssertionError -> L57 java.io.IOException -> L59 java.lang.IllegalStateException -> L5b java.io.EOFException -> L5d
            java.lang.String r7 = " but got instance of "
            r6.append(r7)     // Catch: java.lang.Throwable -> L55 java.lang.AssertionError -> L57 java.io.IOException -> L59 java.lang.IllegalStateException -> L5b java.io.EOFException -> L5d
            java.lang.Class r7 = r4.getClass()     // Catch: java.lang.Throwable -> L55 java.lang.AssertionError -> L57 java.io.IOException -> L59 java.lang.IllegalStateException -> L5b java.io.EOFException -> L5d
            r6.append(r7)     // Catch: java.lang.Throwable -> L55 java.lang.AssertionError -> L57 java.io.IOException -> L59 java.lang.IllegalStateException -> L5b java.io.EOFException -> L5d
            java.lang.String r7 = "\nVerify that the adapter was registered for the correct type."
            r6.append(r7)     // Catch: java.lang.Throwable -> L55 java.lang.AssertionError -> L57 java.io.IOException -> L59 java.lang.IllegalStateException -> L5b java.io.EOFException -> L5d
            java.lang.String r7 = r6.toString()     // Catch: java.lang.Throwable -> L55 java.lang.AssertionError -> L57 java.io.IOException -> L59 java.lang.IllegalStateException -> L5b java.io.EOFException -> L5d
            r5.<init>(r7)     // Catch: java.lang.Throwable -> L55 java.lang.AssertionError -> L57 java.io.IOException -> L59 java.lang.IllegalStateException -> L5b java.io.EOFException -> L5d
            throw r5     // Catch: java.lang.Throwable -> L55 java.lang.AssertionError -> L57 java.io.IOException -> L59 java.lang.IllegalStateException -> L5b java.io.EOFException -> L5d
        L55:
            r7 = move-exception
            goto L94
        L57:
            r7 = move-exception
            goto L63
        L59:
            r7 = move-exception
            goto L79
        L5b:
            r7 = move-exception
            goto L7f
        L5d:
            r7 = move-exception
            goto L87
        L5f:
            r8.q0(r2)
            return r4
        L63:
            java.lang.AssertionError r9 = new java.lang.AssertionError     // Catch: java.lang.Throwable -> L55
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L55
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L55
            java.lang.String r0 = r7.getMessage()     // Catch: java.lang.Throwable -> L55
            r1.append(r0)     // Catch: java.lang.Throwable -> L55
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Throwable -> L55
            r9.<init>(r0, r7)     // Catch: java.lang.Throwable -> L55
            throw r9     // Catch: java.lang.Throwable -> L55
        L79:
            ne3 r9 = new ne3     // Catch: java.lang.Throwable -> L55
            r9.<init>(r7)     // Catch: java.lang.Throwable -> L55
            throw r9     // Catch: java.lang.Throwable -> L55
        L7f:
            ne3 r9 = new ne3     // Catch: java.lang.Throwable -> L55
            r9.<init>(r7)     // Catch: java.lang.Throwable -> L55
            throw r9     // Catch: java.lang.Throwable -> L55
        L85:
            r7 = move-exception
            r3 = 1
        L87:
            if (r3 == 0) goto L8e
            r8.q0(r2)
            r7 = 0
            return r7
        L8e:
            ne3 r9 = new ne3     // Catch: java.lang.Throwable -> L55
            r9.<init>(r7)     // Catch: java.lang.Throwable -> L55
            throw r9     // Catch: java.lang.Throwable -> L55
        L94:
            r8.q0(r2)
            throw r7
    }

    public final java.lang.Object b(java.io.FileReader r2, java.lang.reflect.Type r3) {
            r1 = this;
            ie7 r0 = new ie7
            r0.<init>(r3)
            java.lang.Object r1 = r1.c(r2, r0)
            return r1
    }

    public final java.lang.Object c(java.io.Reader r2, defpackage.ie7 r3) {
            r1 = this;
            hf3 r0 = new hf3
            r0.<init>(r2)
            ls6 r2 = defpackage.ls6.LEGACY_STRICT
            r0.q0(r2)
            java.lang.Object r1 = r1.a(r0, r3)
            if (r1 == 0) goto L2f
            jf3 r2 = r0.n0()     // Catch: java.io.IOException -> L21 defpackage.i04 -> L28
            jf3 r3 = defpackage.jf3.END_DOCUMENT     // Catch: java.io.IOException -> L21 defpackage.i04 -> L28
            if (r2 != r3) goto L19
            goto L2f
        L19:
            ne3 r1 = new ne3     // Catch: java.io.IOException -> L21 defpackage.i04 -> L28
            java.lang.String r2 = "JSON document was not fully consumed."
            r1.<init>(r2)     // Catch: java.io.IOException -> L21 defpackage.i04 -> L28
            throw r1     // Catch: java.io.IOException -> L21 defpackage.i04 -> L28
        L21:
            r1 = move-exception
            ne3 r2 = new ne3
            r2.<init>(r1)
            throw r2
        L28:
            r1 = move-exception
            ne3 r2 = new ne3
            r2.<init>(r1)
            throw r2
        L2f:
            return r1
    }

    public final defpackage.yc7 d(defpackage.ie7 r10) {
            r9 = this;
            java.lang.String r0 = "type must not be null"
            java.util.Objects.requireNonNull(r10, r0)
            java.util.concurrent.ConcurrentHashMap r0 = r9.b
            java.lang.Object r1 = r0.get(r10)
            yc7 r1 = (defpackage.yc7) r1
            if (r1 == 0) goto L10
            return r1
        L10:
            java.lang.ThreadLocal r1 = r9.a
            java.lang.Object r2 = r1.get()
            java.util.Map r2 = (java.util.Map) r2
            if (r2 != 0) goto L24
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r1.set(r2)
            r3 = 1
            goto L2e
        L24:
            java.lang.Object r3 = r2.get(r10)
            yc7 r3 = (defpackage.yc7) r3
            if (r3 == 0) goto L2d
            return r3
        L2d:
            r3 = 0
        L2e:
            ru2 r4 = new ru2     // Catch: java.lang.Throwable -> L5a
            r4.<init>()     // Catch: java.lang.Throwable -> L5a
            r2.put(r10, r4)     // Catch: java.lang.Throwable -> L5a
            java.util.List r5 = r9.e     // Catch: java.lang.Throwable -> L5a
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Throwable -> L5a
            r6 = 0
            r7 = r6
        L3e:
            boolean r8 = r5.hasNext()     // Catch: java.lang.Throwable -> L5a
            if (r8 == 0) goto L64
            java.lang.Object r7 = r5.next()     // Catch: java.lang.Throwable -> L5a
            zc7 r7 = (defpackage.zc7) r7     // Catch: java.lang.Throwable -> L5a
            yc7 r7 = r7.a(r9, r10)     // Catch: java.lang.Throwable -> L5a
            if (r7 == 0) goto L3e
            yc7 r9 = r4.a     // Catch: java.lang.Throwable -> L5a
            if (r9 != 0) goto L5c
            r4.a = r7     // Catch: java.lang.Throwable -> L5a
            r2.put(r10, r7)     // Catch: java.lang.Throwable -> L5a
            goto L64
        L5a:
            r9 = move-exception
            goto L77
        L5c:
            java.lang.AssertionError r9 = new java.lang.AssertionError     // Catch: java.lang.Throwable -> L5a
            java.lang.String r10 = "Delegate is already set"
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L5a
            throw r9     // Catch: java.lang.Throwable -> L5a
        L64:
            if (r3 == 0) goto L69
            r1.remove()
        L69:
            if (r7 == 0) goto L71
            if (r3 == 0) goto L70
            r0.putAll(r2)
        L70:
            return r7
        L71:
            java.lang.String r9 = "GSON (2.14.0) cannot handle "
            defpackage.e41.w(r10, r9)
            return r6
        L77:
            if (r3 == 0) goto L7c
            r1.remove()
        L7c:
            throw r9
    }

    public final defpackage.yc7 e(defpackage.zc7 r8, defpackage.ie7 r9) {
            r7 = this;
            java.lang.String r0 = "skipPast must not be null"
            java.util.Objects.requireNonNull(r8, r0)
            java.lang.String r0 = "type must not be null"
            java.util.Objects.requireNonNull(r9, r0)
            ld3 r0 = r7.d
            r0.getClass()
            java.util.concurrent.ConcurrentHashMap r1 = r0.B
            kd3 r2 = defpackage.ld3.L
            r3 = 1
            if (r8 != r2) goto L17
            goto L58
        L17:
            java.lang.Class r2 = r9.a
            java.lang.Object r4 = r1.get(r2)
            zc7 r4 = (defpackage.zc7) r4
            if (r4 == 0) goto L24
            if (r4 != r8) goto L59
            goto L58
        L24:
            java.lang.Class<jd3> r4 = defpackage.jd3.class
            java.lang.annotation.Annotation r4 = r2.getAnnotation(r4)
            jd3 r4 = (defpackage.jd3) r4
            if (r4 != 0) goto L2f
            goto L59
        L2f:
            java.lang.Class r4 = r4.value()
            java.lang.Class<zc7> r5 = defpackage.zc7.class
            boolean r5 = r5.isAssignableFrom(r4)
            if (r5 != 0) goto L3c
            goto L59
        L3c:
            ci r5 = r0.A
            ie7 r6 = new ie7
            r6.<init>(r4)
            ph4 r4 = r5.l(r6, r3)
            java.lang.Object r4 = r4.e()
            zc7 r4 = (defpackage.zc7) r4
            java.lang.Object r1 = r1.putIfAbsent(r2, r4)
            zc7 r1 = (defpackage.zc7) r1
            if (r1 == 0) goto L56
            r4 = r1
        L56:
            if (r4 != r8) goto L59
        L58:
            r8 = r0
        L59:
            java.util.List r0 = r7.e
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
        L60:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L79
            java.lang.Object r2 = r0.next()
            zc7 r2 = (defpackage.zc7) r2
            if (r1 != 0) goto L72
            if (r2 != r8) goto L60
            r1 = r3
            goto L60
        L72:
            yc7 r2 = r2.a(r7, r9)
            if (r2 == 0) goto L60
            return r2
        L79:
            if (r1 != 0) goto L80
            yc7 r7 = r7.d(r9)
            return r7
        L80:
            java.lang.String r7 = "GSON cannot serialize or deserialize "
            defpackage.e41.w(r9, r7)
            r7 = 0
            return r7
    }

    public final java.lang.String f(java.lang.Object r5) {
            r4 = this;
            java.lang.Class r0 = r5.getClass()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            qy3 r2 = new qy3     // Catch: java.io.IOException -> L2c
            r2.<init>(r1)     // Catch: java.io.IOException -> L2c
            vf3 r3 = new vf3     // Catch: java.io.IOException -> L2c
            r3.<init>(r2)     // Catch: java.io.IOException -> L2c
            ck2 r2 = r4.g     // Catch: java.io.IOException -> L2c
            r3.F(r2)     // Catch: java.io.IOException -> L2c
            boolean r2 = r4.f     // Catch: java.io.IOException -> L2c
            r3.e0 = r2     // Catch: java.io.IOException -> L2c
            ls6 r2 = defpackage.ls6.LEGACY_STRICT     // Catch: java.io.IOException -> L2c
            r3.J(r2)     // Catch: java.io.IOException -> L2c
            r2 = 0
            r3.g0 = r2     // Catch: java.io.IOException -> L2c
            r4.g(r5, r0, r3)     // Catch: java.io.IOException -> L2c
            java.lang.String r4 = r1.toString()
            return r4
        L2c:
            r4 = move-exception
            ne3 r5 = new ne3
            r5.<init>(r4)
            throw r5
    }

    public final void g(java.lang.Object r5, java.lang.reflect.Type r6, defpackage.vf3 r7) {
            r4 = this;
            java.lang.String r0 = "AssertionError (GSON 2.14.0): "
            ie7 r1 = new ie7
            r1.<init>(r6)
            yc7 r6 = r4.d(r1)
            ls6 r1 = r7.d0
            ls6 r2 = defpackage.ls6.LEGACY_STRICT
            if (r1 != r2) goto L16
            ls6 r2 = defpackage.ls6.LENIENT
            r7.J(r2)
        L16:
            boolean r2 = r7.e0
            boolean r3 = r7.g0
            boolean r4 = r4.f
            r7.e0 = r4
            r4 = 0
            r7.g0 = r4
            r6.c(r7, r5)     // Catch: java.lang.Throwable -> L2c java.lang.AssertionError -> L2e java.io.IOException -> L45
            r7.J(r1)
            r7.e0 = r2
            r7.g0 = r3
            return
        L2c:
            r4 = move-exception
            goto L4c
        L2e:
            r4 = move-exception
            java.lang.AssertionError r5 = new java.lang.AssertionError     // Catch: java.lang.Throwable -> L2c
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2c
            r6.<init>(r0)     // Catch: java.lang.Throwable -> L2c
            java.lang.String r0 = r4.getMessage()     // Catch: java.lang.Throwable -> L2c
            r6.append(r0)     // Catch: java.lang.Throwable -> L2c
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L2c
            r5.<init>(r6, r4)     // Catch: java.lang.Throwable -> L2c
            throw r5     // Catch: java.lang.Throwable -> L2c
        L45:
            r4 = move-exception
            ne3 r5 = new ne3     // Catch: java.lang.Throwable -> L2c
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L2c
            throw r5     // Catch: java.lang.Throwable -> L2c
        L4c:
            r7.J(r1)
            r7.e0 = r2
            r7.g0 = r3
            throw r4
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "{serializeNulls:false,factories:"
            r0.<init>(r1)
            java.util.List r1 = r2.e
            r0.append(r1)
            java.lang.String r1 = ",instanceCreators:"
            r0.append(r1)
            ci r2 = r2.c
            r0.append(r2)
            java.lang.String r2 = "}"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
