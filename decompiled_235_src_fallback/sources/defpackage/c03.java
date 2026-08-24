package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: c03  reason: default package */
/* loaded from: classes.dex */
public abstract class c03 {
    public final defpackage.vk5 a;
    public final defpackage.xk4 b;
    public final defpackage.b51 c;

    public c03(defpackage.vk5 r1, defpackage.xk4 r2, defpackage.b51 r3) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            return
    }

    public static defpackage.c03 b(defpackage.pa r27, java.lang.reflect.Method r28) {
            r0 = r27
            r1 = r28
            uk5 r2 = new uk5
            r2.<init>(r0, r1)
            java.lang.annotation.Annotation[] r3 = r2.c
            int r4 = r3.length
            r5 = 0
            r6 = r5
        Le:
            java.lang.String r7 = "HEAD"
            r8 = 1
            r9 = 0
            if (r6 >= r4) goto L157
            r10 = r3[r6]
            boolean r11 = r10 instanceof defpackage.z81
            if (r11 == 0) goto L27
            z81 r10 = (defpackage.z81) r10
            java.lang.String r7 = r10.value()
            java.lang.String r8 = "DELETE"
            r2.b(r8, r7, r5)
            goto L153
        L27:
            boolean r11 = r10 instanceof defpackage.vo2
            if (r11 == 0) goto L38
            vo2 r10 = (defpackage.vo2) r10
            java.lang.String r7 = r10.value()
            java.lang.String r8 = "GET"
            r2.b(r8, r7, r5)
            goto L153
        L38:
            boolean r11 = r10 instanceof defpackage.dv2
            if (r11 == 0) goto L47
            dv2 r10 = (defpackage.dv2) r10
            java.lang.String r8 = r10.value()
            r2.b(r7, r8, r5)
            goto L153
        L47:
            boolean r7 = r10 instanceof defpackage.cq4
            if (r7 == 0) goto L58
            cq4 r10 = (defpackage.cq4) r10
            java.lang.String r7 = r10.value()
            java.lang.String r9 = "PATCH"
            r2.b(r9, r7, r8)
            goto L153
        L58:
            boolean r7 = r10 instanceof defpackage.dq4
            if (r7 == 0) goto L69
            dq4 r10 = (defpackage.dq4) r10
            java.lang.String r7 = r10.value()
            java.lang.String r9 = "POST"
            r2.b(r9, r7, r8)
            goto L153
        L69:
            boolean r7 = r10 instanceof defpackage.eq4
            if (r7 == 0) goto L7a
            eq4 r10 = (defpackage.eq4) r10
            java.lang.String r7 = r10.value()
            java.lang.String r9 = "PUT"
            r2.b(r9, r7, r8)
            goto L153
        L7a:
            boolean r7 = r10 instanceof defpackage.oh4
            if (r7 == 0) goto L8b
            oh4 r10 = (defpackage.oh4) r10
            java.lang.String r7 = r10.value()
            java.lang.String r8 = "OPTIONS"
            r2.b(r8, r7, r5)
            goto L153
        L8b:
            boolean r7 = r10 instanceof defpackage.ev2
            if (r7 == 0) goto La2
            ev2 r10 = (defpackage.ev2) r10
            java.lang.String r7 = r10.method()
            java.lang.String r8 = r10.path()
            boolean r9 = r10.hasBody()
            r2.b(r7, r8, r9)
            goto L153
        La2:
            boolean r7 = r10 instanceof defpackage.xw2
            if (r7 == 0) goto L127
            xw2 r10 = (defpackage.xw2) r10
            java.lang.String[] r7 = r10.value()
            int r11 = r7.length
            if (r11 == 0) goto L11e
            boolean r10 = r10.allowUnsafeNonAsciiValues()
            ww2 r11 = new ww2
            r11.<init>(r5, r5)
            int r12 = r7.length
            r13 = r5
        Lba:
            if (r13 >= r12) goto L117
            r14 = r7[r13]
            r15 = 58
            int r15 = r14.indexOf(r15)
            r16 = r8
            r8 = -1
            if (r15 == r8) goto L10c
            if (r15 == 0) goto L10c
            int r8 = r14.length()
            int r8 = r8 + (-1)
            if (r15 == r8) goto L10c
            java.lang.String r8 = r14.substring(r5, r15)
            int r15 = r15 + 1
            java.lang.String r14 = r14.substring(r15)
            java.lang.String r14 = r14.trim()
            java.lang.String r15 = "Content-Type"
            boolean r15 = r15.equalsIgnoreCase(r8)
            if (r15 == 0) goto Lfe
            xh5 r8 = defpackage.n34.d     // Catch: java.lang.IllegalArgumentException -> Lf2
            n34 r8 = defpackage.xk2.k(r14)     // Catch: java.lang.IllegalArgumentException -> Lf2
            r2.t = r8     // Catch: java.lang.IllegalArgumentException -> Lf2
            goto L107
        Lf2:
            r0 = move-exception
            java.lang.String r2 = "Malformed content type: %s"
            java.lang.Object[] r3 = new java.lang.Object[]{r14}
            java.lang.IllegalArgumentException r0 = defpackage.ak7.o0(r1, r0, r2, r3)
            throw r0
        Lfe:
            if (r10 == 0) goto L104
            r11.e(r8, r14)
            goto L107
        L104:
            r11.b(r8, r14)
        L107:
            int r13 = r13 + 1
            r8 = r16
            goto Lba
        L10c:
            java.lang.String r0 = "@Headers value must be in the form \"Name: Value\". Found: \"%s\""
            java.lang.Object[] r2 = new java.lang.Object[]{r14}
            java.lang.IllegalArgumentException r0 = defpackage.ak7.o0(r1, r9, r0, r2)
            throw r0
        L117:
            yw2 r7 = r11.f()
            r2.s = r7
            goto L153
        L11e:
            java.lang.String r0 = "@Headers annotation is empty."
            java.lang.Object[] r2 = new java.lang.Object[r5]
            java.lang.IllegalArgumentException r0 = defpackage.ak7.o0(r1, r9, r0, r2)
            throw r0
        L127:
            r16 = r8
            boolean r7 = r10 instanceof defpackage.j94
            java.lang.String r8 = "Only one encoding annotation is allowed."
            if (r7 == 0) goto L13f
            boolean r7 = r2.p
            if (r7 != 0) goto L138
            r7 = r16
            r2.q = r7
            goto L153
        L138:
            java.lang.Object[] r0 = new java.lang.Object[r5]
            java.lang.IllegalArgumentException r0 = defpackage.ak7.o0(r1, r9, r8, r0)
            throw r0
        L13f:
            r7 = r16
            boolean r10 = r10 instanceof defpackage.bk2
            if (r10 == 0) goto L153
            boolean r10 = r2.q
            if (r10 != 0) goto L14c
            r2.p = r7
            goto L153
        L14c:
            java.lang.Object[] r0 = new java.lang.Object[r5]
            java.lang.IllegalArgumentException r0 = defpackage.ak7.o0(r1, r9, r8, r0)
            throw r0
        L153:
            int r6 = r6 + 1
            goto Le
        L157:
            java.lang.String r4 = r2.n
            if (r4 == 0) goto Lb0f
            boolean r4 = r2.o
            if (r4 != 0) goto L17a
            boolean r4 = r2.q
            if (r4 != 0) goto L171
            boolean r4 = r2.p
            if (r4 != 0) goto L168
            goto L17a
        L168:
            java.lang.String r0 = "FormUrlEncoded can only be specified on HTTP methods with request body (e.g., @POST)."
            java.lang.Object[] r2 = new java.lang.Object[r5]
            java.lang.IllegalArgumentException r0 = defpackage.ak7.o0(r1, r9, r0, r2)
            throw r0
        L171:
            java.lang.String r0 = "Multipart can only be specified on HTTP methods with request body (e.g., @POST)."
            java.lang.Object[] r2 = new java.lang.Object[r5]
            java.lang.IllegalArgumentException r0 = defpackage.ak7.o0(r1, r9, r0, r2)
            throw r0
        L17a:
            java.lang.annotation.Annotation[][] r4 = r2.d
            int r6 = r4.length
            uj2[] r8 = new defpackage.uj2[r6]
            r2.v = r8
            int r8 = r6 + (-1)
            r10 = r5
        L184:
            if (r10 >= r6) goto L958
            uj2[] r11 = r2.v
            java.lang.reflect.Type[] r12 = r2.e
            r12 = r12[r10]
            r13 = r4[r10]
            if (r10 != r8) goto L192
            r14 = 1
            goto L193
        L192:
            r14 = r5
        L193:
            if (r13 == 0) goto L927
            int r15 = r13.length
            r17 = r9
            r9 = r5
        L199:
            if (r9 >= r15) goto L91a
            r5 = r13[r9]
            r18 = r4
            boolean r4 = r5 instanceof defpackage.yh7
            r19 = r4
            java.lang.String r4 = "@Path parameters may not be used with @Url."
            r20 = r6
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            if (r19 == 0) goto L242
            r2.c(r10, r12)
            boolean r5 = r2.m
            if (r5 != 0) goto L238
            boolean r5 = r2.i
            if (r5 != 0) goto L230
            boolean r4 = r2.j
            if (r4 != 0) goto L226
            boolean r4 = r2.k
            if (r4 != 0) goto L21c
            boolean r4 = r2.l
            if (r4 != 0) goto L212
            java.lang.String r4 = r2.r
            if (r4 != 0) goto L205
            r4 = 1
            r2.m = r4
            java.lang.Class<i03> r4 = defpackage.i03.class
            if (r12 == r4) goto L1f1
            if (r12 == r6) goto L1f1
            java.lang.Class<java.net.URI> r4 = java.net.URI.class
            if (r12 == r4) goto L1f1
            boolean r4 = r12 instanceof java.lang.Class
            if (r4 == 0) goto L1e7
            r4 = r12
            java.lang.Class r4 = (java.lang.Class) r4
            java.lang.String r4 = r4.getName()
            java.lang.String r5 = "android.net.Uri"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L1e7
            goto L1f1
        L1e7:
            java.lang.String r0 = "@Url must be okhttp3.HttpUrl, String, java.net.URI, or android.net.Uri type."
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.IllegalArgumentException r0 = defpackage.ak7.v0(r1, r10, r0, r2)
            throw r0
        L1f1:
            js4 r4 = new js4
            r5 = 1
            r4.<init>(r1, r10, r5)
            r22 = r7
            r19 = r8
        L1fb:
            r23 = r9
            r24 = r11
            r21 = r14
            r25 = r15
            goto L8f4
        L205:
            java.lang.String r0 = r2.n
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r2 = "@Url cannot be used with @%s URL"
            java.lang.IllegalArgumentException r0 = defpackage.ak7.v0(r1, r10, r2, r0)
            throw r0
        L212:
            java.lang.String r0 = "A @Url parameter must not come after a @QueryMap."
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.IllegalArgumentException r0 = defpackage.ak7.v0(r1, r10, r0, r2)
            throw r0
        L21c:
            r2 = 0
            java.lang.String r0 = "A @Url parameter must not come after a @QueryName."
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.IllegalArgumentException r0 = defpackage.ak7.v0(r1, r10, r0, r2)
            throw r0
        L226:
            r2 = 0
            java.lang.String r0 = "A @Url parameter must not come after a @Query."
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.IllegalArgumentException r0 = defpackage.ak7.v0(r1, r10, r0, r2)
            throw r0
        L230:
            r2 = 0
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.IllegalArgumentException r0 = defpackage.ak7.v0(r1, r10, r4, r0)
            throw r0
        L238:
            r2 = 0
            java.lang.String r0 = "Multiple @Url method annotations found."
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.IllegalArgumentException r0 = defpackage.ak7.v0(r1, r10, r0, r2)
            throw r0
        L242:
            r19 = r8
            boolean r8 = r5 instanceof defpackage.mt4
            r21 = r8
            pa r8 = r2.a
            if (r21 == 0) goto L2e4
            r2.c(r10, r12)
            boolean r6 = r2.j
            if (r6 != 0) goto L2da
            boolean r6 = r2.k
            if (r6 != 0) goto L2d0
            boolean r6 = r2.l
            if (r6 != 0) goto L2c6
            boolean r6 = r2.m
            if (r6 != 0) goto L2be
            java.lang.String r4 = r2.r
            if (r4 == 0) goto L2b1
            r4 = 1
            r2.i = r4
            mt4 r5 = (defpackage.mt4) r5
            java.lang.String r4 = r5.value()
            java.util.regex.Pattern r6 = defpackage.uk5.y
            java.util.regex.Matcher r6 = r6.matcher(r4)
            boolean r6 = r6.matches()
            if (r6 == 0) goto L2a0
            java.util.LinkedHashSet r6 = r2.u
            boolean r6 = r6.contains(r4)
            if (r6 == 0) goto L293
            r8.v(r12, r13)
            ls4 r6 = new ls4
            java.lang.reflect.Method r8 = r2.b
            boolean r5 = r5.encoded()
            r6.<init>(r8, r10, r4, r5)
            r4 = r6
            r22 = r7
            goto L1fb
        L293:
            java.lang.String r0 = r2.r
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r4}
            java.lang.String r2 = "URL \"%s\" does not contain \"{%s}\"."
            java.lang.IllegalArgumentException r0 = defpackage.ak7.v0(r1, r10, r2, r0)
            throw r0
        L2a0:
            java.util.regex.Pattern r0 = defpackage.uk5.x
            java.lang.String r0 = r0.pattern()
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r4}
            java.lang.String r2 = "@Path parameter name must match %s. Found: %s"
            java.lang.IllegalArgumentException r0 = defpackage.ak7.v0(r1, r10, r2, r0)
            throw r0
        L2b1:
            java.lang.String r0 = r2.n
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r2 = "@Path can only be used with relative url on @%s"
            java.lang.IllegalArgumentException r0 = defpackage.ak7.v0(r1, r10, r2, r0)
            throw r0
        L2be:
            r2 = 0
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.IllegalArgumentException r0 = defpackage.ak7.v0(r1, r10, r4, r0)
            throw r0
        L2c6:
            r2 = 0
            java.lang.String r0 = "A @Path parameter must not come after a @QueryMap."
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.IllegalArgumentException r0 = defpackage.ak7.v0(r1, r10, r0, r2)
            throw r0
        L2d0:
            r2 = 0
            java.lang.String r0 = "A @Path parameter must not come after a @QueryName."
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.IllegalArgumentException r0 = defpackage.ak7.v0(r1, r10, r0, r2)
            throw r0
        L2da:
            r2 = 0
            java.lang.String r0 = "A @Path parameter must not come after a @Query."
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.IllegalArgumentException r0 = defpackage.ak7.v0(r1, r10, r0, r2)
            throw r0
        L2e4:
            boolean r4 = r5 instanceof defpackage.r65
            r21 = r4
            java.lang.String r4 = "<String>)"
            r23 = r9
            java.lang.String r9 = " must include generic type (e.g., "
            r24 = r11
            java.lang.Class<java.lang.Iterable> r11 = java.lang.Iterable.class
            if (r21 == 0) goto L37e
            r2.c(r10, r12)
            r65 r5 = (defpackage.r65) r5
            java.lang.String r6 = r5.value()
            boolean r5 = r5.encoded()
            r21 = r14
            java.lang.Class r14 = defpackage.ak7.c0(r12)
            r25 = r15
            r15 = 1
            r2.j = r15
            boolean r11 = r11.isAssignableFrom(r14)
            if (r11 == 0) goto L356
            boolean r11 = r12 instanceof java.lang.reflect.ParameterizedType
            if (r11 == 0) goto L331
            r4 = r12
            java.lang.reflect.ParameterizedType r4 = (java.lang.reflect.ParameterizedType) r4
            r11 = 0
            java.lang.reflect.Type r4 = defpackage.ak7.Y(r11, r4)
            r8.v(r4, r13)
            hs4 r4 = new hs4
            r8 = 2
            r4.<init>(r6, r8, r5)
            fs4 r5 = new fs4
            r5.<init>(r4, r11)
        L32c:
            r4 = r5
        L32d:
            r22 = r7
            goto L8f4
        L331:
            r11 = 0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = r14.getSimpleName()
            r0.append(r2)
            r0.append(r9)
            java.lang.String r2 = r14.getSimpleName()
            r0.append(r2)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            java.lang.Object[] r2 = new java.lang.Object[r11]
            java.lang.IllegalArgumentException r0 = defpackage.ak7.v0(r1, r10, r0, r2)
            throw r0
        L356:
            boolean r4 = r14.isArray()
            if (r4 == 0) goto L374
            java.lang.Class r4 = r14.getComponentType()
            java.lang.Class r4 = defpackage.uk5.a(r4)
            r8.v(r4, r13)
            hs4 r4 = new hs4
            r9 = 2
            r4.<init>(r6, r9, r5)
            fs4 r5 = new fs4
            r15 = 1
            r5.<init>(r4, r15)
            goto L32c
        L374:
            r9 = 2
            r8.v(r12, r13)
            hs4 r4 = new hs4
            r4.<init>(r6, r9, r5)
            goto L32d
        L37e:
            r21 = r14
            r25 = r15
            boolean r14 = r5 instanceof defpackage.t65
            if (r14 == 0) goto L404
            r2.c(r10, r12)
            t65 r5 = (defpackage.t65) r5
            boolean r5 = r5.encoded()
            java.lang.Class r6 = defpackage.ak7.c0(r12)
            r15 = 1
            r2.k = r15
            boolean r11 = r11.isAssignableFrom(r6)
            if (r11 == 0) goto L3dc
            boolean r11 = r12 instanceof java.lang.reflect.ParameterizedType
            if (r11 == 0) goto L3b7
            r4 = r12
            java.lang.reflect.ParameterizedType r4 = (java.lang.reflect.ParameterizedType) r4
            r11 = 0
            java.lang.reflect.Type r4 = defpackage.ak7.Y(r11, r4)
            r8.v(r4, r13)
            ms4 r4 = new ms4
            r4.<init>(r5)
            fs4 r5 = new fs4
            r5.<init>(r4, r11)
            goto L32c
        L3b7:
            r11 = 0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = r6.getSimpleName()
            r0.append(r2)
            r0.append(r9)
            java.lang.String r2 = r6.getSimpleName()
            r0.append(r2)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            java.lang.Object[] r2 = new java.lang.Object[r11]
            java.lang.IllegalArgumentException r0 = defpackage.ak7.v0(r1, r10, r0, r2)
            throw r0
        L3dc:
            boolean r4 = r6.isArray()
            if (r4 == 0) goto L3fa
            java.lang.Class r4 = r6.getComponentType()
            java.lang.Class r4 = defpackage.uk5.a(r4)
            r8.v(r4, r13)
            ms4 r4 = new ms4
            r4.<init>(r5)
            fs4 r5 = new fs4
            r15 = 1
            r5.<init>(r4, r15)
            goto L32c
        L3fa:
            r8.v(r12, r13)
            ms4 r4 = new ms4
            r4.<init>(r5)
            goto L32d
        L404:
            boolean r14 = r5 instanceof defpackage.s65
            java.lang.String r15 = "Map must include generic types (e.g., Map<String, String>)"
            r26 = r14
            java.lang.Class<java.util.Map> r14 = java.util.Map.class
            if (r26 == 0) goto L46c
            r2.c(r10, r12)
            java.lang.Class r4 = defpackage.ak7.c0(r12)
            r9 = 1
            r2.l = r9
            boolean r11 = r14.isAssignableFrom(r4)
            if (r11 == 0) goto L462
            java.lang.reflect.Type r4 = defpackage.ak7.e0(r12, r4)
            boolean r11 = r4 instanceof java.lang.reflect.ParameterizedType
            if (r11 == 0) goto L45a
            java.lang.reflect.ParameterizedType r4 = (java.lang.reflect.ParameterizedType) r4
            r11 = 0
            java.lang.reflect.Type r14 = defpackage.ak7.Y(r11, r4)
            if (r6 != r14) goto L444
            java.lang.reflect.Type r4 = defpackage.ak7.Y(r9, r4)
            r8.v(r4, r13)
            is4 r4 = new is4
            s65 r5 = (defpackage.s65) r5
            boolean r5 = r5.encoded()
            r8 = 2
            r4.<init>(r1, r10, r5, r8)
            goto L32d
        L444:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "@QueryMap keys must be of type String: "
            r0.<init>(r2)
            r0.append(r14)
            java.lang.String r0 = r0.toString()
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.IllegalArgumentException r0 = defpackage.ak7.v0(r1, r10, r0, r2)
            throw r0
        L45a:
            r2 = 0
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.IllegalArgumentException r0 = defpackage.ak7.v0(r1, r10, r15, r0)
            throw r0
        L462:
            r2 = 0
            java.lang.String r0 = "@QueryMap parameter type must be Map."
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.IllegalArgumentException r0 = defpackage.ak7.v0(r1, r10, r0, r2)
            throw r0
        L46c:
            r22 = r7
            boolean r7 = r5 instanceof defpackage.tw2
            if (r7 == 0) goto L4fb
            r2.c(r10, r12)
            tw2 r5 = (defpackage.tw2) r5
            java.lang.String r6 = r5.value()
            java.lang.Class r7 = defpackage.ak7.c0(r12)
            boolean r11 = r11.isAssignableFrom(r7)
            if (r11 == 0) goto L4cb
            boolean r11 = r12 instanceof java.lang.reflect.ParameterizedType
            if (r11 == 0) goto L4a6
            r4 = r12
            java.lang.reflect.ParameterizedType r4 = (java.lang.reflect.ParameterizedType) r4
            r11 = 0
            java.lang.reflect.Type r4 = defpackage.ak7.Y(r11, r4)
            r8.v(r4, r13)
            hs4 r4 = new hs4
            boolean r5 = r5.allowUnsafeNonAsciiValues()
            r15 = 1
            r4.<init>(r6, r15, r5)
            fs4 r5 = new fs4
            r5.<init>(r4, r11)
        L4a3:
            r4 = r5
            goto L8f4
        L4a6:
            r11 = 0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = r7.getSimpleName()
            r0.append(r2)
            r0.append(r9)
            java.lang.String r2 = r7.getSimpleName()
            r0.append(r2)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            java.lang.Object[] r2 = new java.lang.Object[r11]
            java.lang.IllegalArgumentException r0 = defpackage.ak7.v0(r1, r10, r0, r2)
            throw r0
        L4cb:
            boolean r4 = r7.isArray()
            if (r4 == 0) goto L4ec
            java.lang.Class r4 = r7.getComponentType()
            java.lang.Class r4 = defpackage.uk5.a(r4)
            r8.v(r4, r13)
            hs4 r4 = new hs4
            boolean r5 = r5.allowUnsafeNonAsciiValues()
            r15 = 1
            r4.<init>(r6, r15, r5)
            fs4 r5 = new fs4
            r5.<init>(r4, r15)
            goto L4a3
        L4ec:
            r15 = 1
            r8.v(r12, r13)
            hs4 r4 = new hs4
            boolean r5 = r5.allowUnsafeNonAsciiValues()
            r4.<init>(r6, r15, r5)
            goto L8f4
        L4fb:
            boolean r7 = r5 instanceof defpackage.vw2
            if (r7 == 0) goto L564
            java.lang.Class<yw2> r4 = defpackage.yw2.class
            if (r12 != r4) goto L50b
            js4 r4 = new js4
            r11 = 0
            r4.<init>(r1, r10, r11)
            goto L8f4
        L50b:
            r11 = 0
            r2.c(r10, r12)
            java.lang.Class r4 = defpackage.ak7.c0(r12)
            boolean r7 = r14.isAssignableFrom(r4)
            if (r7 == 0) goto L55b
            java.lang.reflect.Type r4 = defpackage.ak7.e0(r12, r4)
            boolean r7 = r4 instanceof java.lang.reflect.ParameterizedType
            if (r7 == 0) goto L554
            java.lang.reflect.ParameterizedType r4 = (java.lang.reflect.ParameterizedType) r4
            java.lang.reflect.Type r7 = defpackage.ak7.Y(r11, r4)
            if (r6 != r7) goto L53e
            r15 = 1
            java.lang.reflect.Type r4 = defpackage.ak7.Y(r15, r4)
            r8.v(r4, r13)
            is4 r4 = new is4
            vw2 r5 = (defpackage.vw2) r5
            boolean r5 = r5.allowUnsafeNonAsciiValues()
            r4.<init>(r1, r10, r5, r15)
            goto L8f4
        L53e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "@HeaderMap keys must be of type String: "
            r0.<init>(r2)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            r11 = 0
            java.lang.Object[] r2 = new java.lang.Object[r11]
            java.lang.IllegalArgumentException r0 = defpackage.ak7.v0(r1, r10, r0, r2)
            throw r0
        L554:
            java.lang.Object[] r0 = new java.lang.Object[r11]
            java.lang.IllegalArgumentException r0 = defpackage.ak7.v0(r1, r10, r15, r0)
            throw r0
        L55b:
            java.lang.String r0 = "@HeaderMap parameter type must be Map or Headers."
            java.lang.Object[] r2 = new java.lang.Object[r11]
            java.lang.IllegalArgumentException r0 = defpackage.ak7.v0(r1, r10, r0, r2)
            throw r0
        L564:
            boolean r7 = r5 instanceof defpackage.ma2
            if (r7 == 0) goto L5f9
            r2.c(r10, r12)
            boolean r6 = r2.p
            if (r6 == 0) goto L5ef
            ma2 r5 = (defpackage.ma2) r5
            java.lang.String r6 = r5.value()
            boolean r5 = r5.encoded()
            r15 = 1
            r2.f = r15
            java.lang.Class r7 = defpackage.ak7.c0(r12)
            boolean r11 = r11.isAssignableFrom(r7)
            if (r11 == 0) goto L5c6
            boolean r11 = r12 instanceof java.lang.reflect.ParameterizedType
            if (r11 == 0) goto L5a1
            r4 = r12
            java.lang.reflect.ParameterizedType r4 = (java.lang.reflect.ParameterizedType) r4
            r11 = 0
            java.lang.reflect.Type r4 = defpackage.ak7.Y(r11, r4)
            r8.v(r4, r13)
            hs4 r4 = new hs4
            r4.<init>(r6, r11, r5)
            fs4 r5 = new fs4
            r5.<init>(r4, r11)
            goto L4a3
        L5a1:
            r11 = 0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = r7.getSimpleName()
            r0.append(r2)
            r0.append(r9)
            java.lang.String r2 = r7.getSimpleName()
            r0.append(r2)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            java.lang.Object[] r2 = new java.lang.Object[r11]
            java.lang.IllegalArgumentException r0 = defpackage.ak7.v0(r1, r10, r0, r2)
            throw r0
        L5c6:
            r11 = 0
            boolean r4 = r7.isArray()
            if (r4 == 0) goto L5e5
            java.lang.Class r4 = r7.getComponentType()
            java.lang.Class r4 = defpackage.uk5.a(r4)
            r8.v(r4, r13)
            hs4 r4 = new hs4
            r4.<init>(r6, r11, r5)
            fs4 r5 = new fs4
            r15 = 1
            r5.<init>(r4, r15)
            goto L4a3
        L5e5:
            r8.v(r12, r13)
            hs4 r4 = new hs4
            r4.<init>(r6, r11, r5)
            goto L8f4
        L5ef:
            r11 = 0
            java.lang.String r0 = "@Field parameters can only be used with form encoding."
            java.lang.Object[] r2 = new java.lang.Object[r11]
            java.lang.IllegalArgumentException r0 = defpackage.ak7.v0(r1, r10, r0, r2)
            throw r0
        L5f9:
            boolean r7 = r5 instanceof defpackage.oa2
            if (r7 == 0) goto L667
            r2.c(r10, r12)
            boolean r4 = r2.p
            if (r4 == 0) goto L65d
            java.lang.Class r4 = defpackage.ak7.c0(r12)
            boolean r7 = r14.isAssignableFrom(r4)
            if (r7 == 0) goto L653
            java.lang.reflect.Type r4 = defpackage.ak7.e0(r12, r4)
            boolean r7 = r4 instanceof java.lang.reflect.ParameterizedType
            if (r7 == 0) goto L64b
            java.lang.reflect.ParameterizedType r4 = (java.lang.reflect.ParameterizedType) r4
            r11 = 0
            java.lang.reflect.Type r7 = defpackage.ak7.Y(r11, r4)
            if (r6 != r7) goto L636
            r15 = 1
            java.lang.reflect.Type r4 = defpackage.ak7.Y(r15, r4)
            r8.v(r4, r13)
            r2.f = r15
            is4 r4 = new is4
            oa2 r5 = (defpackage.oa2) r5
            boolean r5 = r5.encoded()
            r4.<init>(r1, r10, r5, r11)
            goto L8f4
        L636:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "@FieldMap keys must be of type String: "
            r0.<init>(r2)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            java.lang.Object[] r2 = new java.lang.Object[r11]
            java.lang.IllegalArgumentException r0 = defpackage.ak7.v0(r1, r10, r0, r2)
            throw r0
        L64b:
            r11 = 0
            java.lang.Object[] r0 = new java.lang.Object[r11]
            java.lang.IllegalArgumentException r0 = defpackage.ak7.v0(r1, r10, r15, r0)
            throw r0
        L653:
            r11 = 0
            java.lang.String r0 = "@FieldMap parameter type must be Map."
            java.lang.Object[] r2 = new java.lang.Object[r11]
            java.lang.IllegalArgumentException r0 = defpackage.ak7.v0(r1, r10, r0, r2)
            throw r0
        L65d:
            r11 = 0
            java.lang.String r0 = "@FieldMap parameters can only be used with form encoding."
            java.lang.Object[] r2 = new java.lang.Object[r11]
            java.lang.IllegalArgumentException r0 = defpackage.ak7.v0(r1, r10, r0, r2)
            throw r0
        L667:
            boolean r7 = r5 instanceof defpackage.zs4
            r26 = r7
            java.lang.Class<k94> r7 = defpackage.k94.class
            if (r26 == 0) goto L7d2
            r2.c(r10, r12)
            boolean r6 = r2.q
            if (r6 == 0) goto L7c8
            zs4 r5 = (defpackage.zs4) r5
            r15 = 1
            r2.g = r15
            java.lang.String r6 = r5.value()
            java.lang.Class r14 = defpackage.ak7.c0(r12)
            boolean r15 = r6.isEmpty()
            if (r15 == 0) goto L70c
            boolean r5 = r11.isAssignableFrom(r14)
            ns4 r6 = defpackage.ns4.h
            java.lang.String r8 = "@Part annotation must supply a name or use MultipartBody.Part parameter type."
            if (r5 == 0) goto L6dc
            boolean r5 = r12 instanceof java.lang.reflect.ParameterizedType
            if (r5 == 0) goto L6b7
            r4 = r12
            java.lang.reflect.ParameterizedType r4 = (java.lang.reflect.ParameterizedType) r4
            r11 = 0
            java.lang.reflect.Type r4 = defpackage.ak7.Y(r11, r4)
            java.lang.Class r4 = defpackage.ak7.c0(r4)
            boolean r4 = r7.isAssignableFrom(r4)
            if (r4 == 0) goto L6b0
            fs4 r4 = new fs4
            r4.<init>(r6, r11)
            goto L8f4
        L6b0:
            java.lang.Object[] r0 = new java.lang.Object[r11]
            java.lang.IllegalArgumentException r0 = defpackage.ak7.v0(r1, r10, r8, r0)
            throw r0
        L6b7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = r14.getSimpleName()
            r0.append(r2)
            r0.append(r9)
            java.lang.String r2 = r14.getSimpleName()
            r0.append(r2)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            r11 = 0
            java.lang.Object[] r2 = new java.lang.Object[r11]
            java.lang.IllegalArgumentException r0 = defpackage.ak7.v0(r1, r10, r0, r2)
            throw r0
        L6dc:
            r11 = 0
            boolean r4 = r14.isArray()
            if (r4 == 0) goto L6fc
            java.lang.Class r4 = r14.getComponentType()
            boolean r4 = r7.isAssignableFrom(r4)
            if (r4 == 0) goto L6f5
            fs4 r4 = new fs4
            r15 = 1
            r4.<init>(r6, r15)
            goto L8f4
        L6f5:
            java.lang.Object[] r0 = new java.lang.Object[r11]
            java.lang.IllegalArgumentException r0 = defpackage.ak7.v0(r1, r10, r8, r0)
            throw r0
        L6fc:
            boolean r4 = r7.isAssignableFrom(r14)
            if (r4 == 0) goto L705
            r4 = r6
            goto L8f4
        L705:
            java.lang.Object[] r0 = new java.lang.Object[r11]
            java.lang.IllegalArgumentException r0 = defpackage.ak7.v0(r1, r10, r8, r0)
            throw r0
        L70c:
            java.lang.String r15 = "form-data; name=\""
            r26 = r5
            java.lang.String r5 = "\""
            java.lang.String r5 = defpackage.lb1.A(r15, r6, r5)
            java.lang.String r6 = "Content-Transfer-Encoding"
            java.lang.String r15 = r26.encoding()
            java.lang.String r0 = "Content-Disposition"
            java.lang.String[] r0 = new java.lang.String[]{r0, r5, r6, r15}
            yw2 r5 = defpackage.yw2.B
            yw2 r0 = defpackage.ln2.R(r0)
            boolean r5 = r11.isAssignableFrom(r14)
            java.lang.String r6 = "@Part parameters using the MultipartBody.Part must not include a part name in the annotation."
            if (r5 == 0) goto L783
            boolean r5 = r12 instanceof java.lang.reflect.ParameterizedType
            if (r5 == 0) goto L75e
            r4 = r12
            java.lang.reflect.ParameterizedType r4 = (java.lang.reflect.ParameterizedType) r4
            r11 = 0
            java.lang.reflect.Type r4 = defpackage.ak7.Y(r11, r4)
            java.lang.Class r5 = defpackage.ak7.c0(r4)
            boolean r5 = r7.isAssignableFrom(r5)
            if (r5 != 0) goto L757
            b51 r4 = r8.s(r4, r13, r3)
            ks4 r5 = new ks4
            r5.<init>(r1, r10, r0, r4)
            fs4 r0 = new fs4
            r0.<init>(r5, r11)
        L754:
            r4 = r0
            goto L8f4
        L757:
            java.lang.Object[] r0 = new java.lang.Object[r11]
            java.lang.IllegalArgumentException r0 = defpackage.ak7.v0(r1, r10, r6, r0)
            throw r0
        L75e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = r14.getSimpleName()
            r0.append(r2)
            r0.append(r9)
            java.lang.String r2 = r14.getSimpleName()
            r0.append(r2)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            r11 = 0
            java.lang.Object[] r2 = new java.lang.Object[r11]
            java.lang.IllegalArgumentException r0 = defpackage.ak7.v0(r1, r10, r0, r2)
            throw r0
        L783:
            boolean r4 = r14.isArray()
            if (r4 == 0) goto L7af
            java.lang.Class r4 = r14.getComponentType()
            java.lang.Class r4 = defpackage.uk5.a(r4)
            boolean r5 = r7.isAssignableFrom(r4)
            if (r5 != 0) goto L7a7
            b51 r4 = r8.s(r4, r13, r3)
            ks4 r5 = new ks4
            r5.<init>(r1, r10, r0, r4)
            fs4 r0 = new fs4
            r15 = 1
            r0.<init>(r5, r15)
            goto L754
        L7a7:
            r11 = 0
            java.lang.Object[] r0 = new java.lang.Object[r11]
            java.lang.IllegalArgumentException r0 = defpackage.ak7.v0(r1, r10, r6, r0)
            throw r0
        L7af:
            r11 = 0
            boolean r4 = r7.isAssignableFrom(r14)
            if (r4 != 0) goto L7c1
            b51 r4 = r8.s(r12, r13, r3)
            ks4 r5 = new ks4
            r5.<init>(r1, r10, r0, r4)
            goto L4a3
        L7c1:
            java.lang.Object[] r0 = new java.lang.Object[r11]
            java.lang.IllegalArgumentException r0 = defpackage.ak7.v0(r1, r10, r6, r0)
            throw r0
        L7c8:
            r11 = 0
            java.lang.String r0 = "@Part parameters can only be used with multipart encoding."
            java.lang.Object[] r2 = new java.lang.Object[r11]
            java.lang.IllegalArgumentException r0 = defpackage.ak7.v0(r1, r10, r0, r2)
            throw r0
        L7d2:
            boolean r0 = r5 instanceof defpackage.at4
            if (r0 == 0) goto L856
            r2.c(r10, r12)
            boolean r0 = r2.q
            if (r0 == 0) goto L84c
            r4 = 1
            r2.g = r4
            java.lang.Class r0 = defpackage.ak7.c0(r12)
            boolean r9 = r14.isAssignableFrom(r0)
            if (r9 == 0) goto L842
            java.lang.reflect.Type r0 = defpackage.ak7.e0(r12, r0)
            boolean r9 = r0 instanceof java.lang.reflect.ParameterizedType
            if (r9 == 0) goto L83a
            java.lang.reflect.ParameterizedType r0 = (java.lang.reflect.ParameterizedType) r0
            r11 = 0
            java.lang.reflect.Type r9 = defpackage.ak7.Y(r11, r0)
            if (r6 != r9) goto L824
            java.lang.reflect.Type r0 = defpackage.ak7.Y(r4, r0)
            java.lang.Class r4 = defpackage.ak7.c0(r0)
            boolean r4 = r7.isAssignableFrom(r4)
            if (r4 != 0) goto L81a
            b51 r0 = r8.s(r0, r13, r3)
            at4 r5 = (defpackage.at4) r5
            ks4 r4 = new ks4
            java.lang.String r5 = r5.encoding()
            r4.<init>(r1, r10, r0, r5)
            goto L8f4
        L81a:
            java.lang.String r0 = "@PartMap values cannot be MultipartBody.Part. Use @Part List<Part> or a different value type instead."
            r11 = 0
            java.lang.Object[] r2 = new java.lang.Object[r11]
            java.lang.IllegalArgumentException r0 = defpackage.ak7.v0(r1, r10, r0, r2)
            throw r0
        L824:
            r11 = 0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "@PartMap keys must be of type String: "
            r0.<init>(r2)
            r0.append(r9)
            java.lang.String r0 = r0.toString()
            java.lang.Object[] r2 = new java.lang.Object[r11]
            java.lang.IllegalArgumentException r0 = defpackage.ak7.v0(r1, r10, r0, r2)
            throw r0
        L83a:
            r11 = 0
            java.lang.Object[] r0 = new java.lang.Object[r11]
            java.lang.IllegalArgumentException r0 = defpackage.ak7.v0(r1, r10, r15, r0)
            throw r0
        L842:
            r11 = 0
            java.lang.String r0 = "@PartMap parameter type must be Map."
            java.lang.Object[] r2 = new java.lang.Object[r11]
            java.lang.IllegalArgumentException r0 = defpackage.ak7.v0(r1, r10, r0, r2)
            throw r0
        L84c:
            r11 = 0
            java.lang.String r0 = "@PartMap parameters can only be used with multipart encoding."
            java.lang.Object[] r2 = new java.lang.Object[r11]
            java.lang.IllegalArgumentException r0 = defpackage.ak7.v0(r1, r10, r0, r2)
            throw r0
        L856:
            boolean r0 = r5 instanceof defpackage.o50
            if (r0 == 0) goto L897
            r2.c(r10, r12)
            boolean r0 = r2.p
            if (r0 != 0) goto L88d
            boolean r0 = r2.q
            if (r0 != 0) goto L88d
            boolean r0 = r2.h
            if (r0 != 0) goto L883
            b51 r0 = r8.s(r12, r13, r3)     // Catch: java.lang.RuntimeException -> L877
            r15 = 1
            r2.h = r15
            gs4 r4 = new gs4
            r4.<init>(r1, r10, r0)
            goto L8f4
        L877:
            r0 = move-exception
            java.lang.String r2 = "Unable to create @Body converter for %s"
            java.lang.Object[] r3 = new java.lang.Object[]{r12}
            java.lang.IllegalArgumentException r0 = defpackage.ak7.w0(r1, r0, r10, r2, r3)
            throw r0
        L883:
            java.lang.String r0 = "Multiple @Body method annotations found."
            r11 = 0
            java.lang.Object[] r2 = new java.lang.Object[r11]
            java.lang.IllegalArgumentException r0 = defpackage.ak7.v0(r1, r10, r0, r2)
            throw r0
        L88d:
            r11 = 0
            java.lang.String r0 = "@Body parameters cannot be used with form or multi-part encoding."
            java.lang.Object[] r2 = new java.lang.Object[r11]
            java.lang.IllegalArgumentException r0 = defpackage.ak7.v0(r1, r10, r0, r2)
            throw r0
        L897:
            boolean r0 = r5 instanceof defpackage.ry6
            if (r0 == 0) goto L8f3
            r2.c(r10, r12)
            java.lang.Class r0 = defpackage.ak7.c0(r12)
            java.lang.Class r0 = defpackage.uk5.a(r0)
            int r4 = r10 + (-1)
        L8a8:
            if (r4 < 0) goto L8ed
            uj2[] r5 = r2.v
            r5 = r5[r4]
            boolean r6 = r5 instanceof defpackage.os4
            if (r6 == 0) goto L8ea
            os4 r5 = (defpackage.os4) r5
            java.lang.Class r5 = r5.h
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L8bd
            goto L8ea
        L8bd:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "@Tag type "
            r2.<init>(r3)
            java.lang.String r0 = r0.getName()
            r2.append(r0)
            java.lang.String r0 = " is duplicate of "
            r2.append(r0)
            jd1 r0 = defpackage.jx4.b
            java.lang.String r0 = r0.f(r1, r4)
            r2.append(r0)
            java.lang.String r0 = " and would always overwrite its value."
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r11 = 0
            java.lang.Object[] r2 = new java.lang.Object[r11]
            java.lang.IllegalArgumentException r0 = defpackage.ak7.v0(r1, r10, r0, r2)
            throw r0
        L8ea:
            int r4 = r4 + (-1)
            goto L8a8
        L8ed:
            os4 r4 = new os4
            r4.<init>(r0)
            goto L8f4
        L8f3:
            r4 = 0
        L8f4:
            if (r4 != 0) goto L8f7
            goto L8fb
        L8f7:
            if (r17 != 0) goto L910
            r17 = r4
        L8fb:
            int r9 = r23 + 1
            r0 = r27
            r4 = r18
            r8 = r19
            r6 = r20
            r14 = r21
            r7 = r22
            r11 = r24
            r15 = r25
            r5 = 0
            goto L199
        L910:
            java.lang.String r0 = "Multiple Retrofit annotations found, only one allowed."
            r11 = 0
            java.lang.Object[] r2 = new java.lang.Object[r11]
            java.lang.IllegalArgumentException r0 = defpackage.ak7.v0(r1, r10, r0, r2)
            throw r0
        L91a:
            r18 = r4
            r20 = r6
            r22 = r7
            r19 = r8
            r24 = r11
            r21 = r14
            goto L92a
        L927:
            r17 = 0
            goto L91a
        L92a:
            if (r17 != 0) goto L946
            if (r21 == 0) goto L93c
            java.lang.Class r0 = defpackage.ak7.c0(r12)     // Catch: java.lang.NoClassDefFoundError -> L93c
            java.lang.Class<r41> r4 = defpackage.r41.class
            if (r0 != r4) goto L93c
            r15 = 1
            r2.w = r15     // Catch: java.lang.NoClassDefFoundError -> L93c
            r17 = 0
            goto L946
        L93c:
            java.lang.String r0 = "No Retrofit annotation found."
            r11 = 0
            java.lang.Object[] r2 = new java.lang.Object[r11]
            java.lang.IllegalArgumentException r0 = defpackage.ak7.v0(r1, r10, r0, r2)
            throw r0
        L946:
            r24[r10] = r17
            int r10 = r10 + 1
            r0 = r27
            r4 = r18
            r8 = r19
            r6 = r20
            r7 = r22
            r5 = 0
            r9 = 0
            goto L184
        L958:
            r22 = r7
            java.lang.String r0 = r2.r
            if (r0 != 0) goto L971
            boolean r0 = r2.m
            if (r0 == 0) goto L963
            goto L971
        L963:
            java.lang.String r0 = r2.n
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r2 = "Missing either @%s URL or @Url parameter."
            r3 = 0
            java.lang.IllegalArgumentException r0 = defpackage.ak7.o0(r1, r3, r2, r0)
            throw r0
        L971:
            boolean r0 = r2.p
            if (r0 != 0) goto L981
            boolean r3 = r2.q
            if (r3 != 0) goto L981
            boolean r3 = r2.o
            if (r3 != 0) goto L981
            boolean r3 = r2.h
            if (r3 != 0) goto L984
        L981:
            r3 = 0
            r11 = 0
            goto L98f
        L984:
            java.lang.String r0 = "Non-body HTTP method cannot contain @Body."
            r11 = 0
            java.lang.Object[] r2 = new java.lang.Object[r11]
            r3 = 0
            java.lang.IllegalArgumentException r0 = defpackage.ak7.o0(r1, r3, r0, r2)
            throw r0
        L98f:
            if (r0 == 0) goto L99f
            boolean r0 = r2.f
            if (r0 == 0) goto L996
            goto L99f
        L996:
            java.lang.String r0 = "Form-encoded method must contain at least one @Field."
            java.lang.Object[] r2 = new java.lang.Object[r11]
            java.lang.IllegalArgumentException r0 = defpackage.ak7.o0(r1, r3, r0, r2)
            throw r0
        L99f:
            boolean r0 = r2.q
            if (r0 == 0) goto L9b1
            boolean r0 = r2.g
            if (r0 == 0) goto L9a8
            goto L9b1
        L9a8:
            java.lang.String r0 = "Multipart method must contain at least one @Part."
            java.lang.Object[] r2 = new java.lang.Object[r11]
            java.lang.IllegalArgumentException r0 = defpackage.ak7.o0(r1, r3, r0, r2)
            throw r0
        L9b1:
            vk5 r0 = new vk5
            r0.<init>(r2)
            java.lang.reflect.Type r2 = r1.getGenericReturnType()
            boolean r3 = defpackage.ak7.i0(r2)
            if (r3 != 0) goto Lb03
            java.lang.Class r3 = java.lang.Void.TYPE
            if (r2 == r3) goto Laf8
            java.lang.annotation.Annotation[] r2 = r1.getAnnotations()
            java.lang.Class<jg7> r3 = defpackage.jg7.class
            java.lang.Class<vl5> r4 = defpackage.vl5.class
            boolean r5 = r0.k
            if (r5 == 0) goto La4f
            java.lang.reflect.Type[] r6 = r1.getGenericParameterTypes()
            int r7 = r6.length
            r16 = 1
            int r7 = r7 + (-1)
            r6 = r6[r7]
            java.lang.reflect.ParameterizedType r6 = (java.lang.reflect.ParameterizedType) r6
            java.lang.reflect.Type[] r6 = r6.getActualTypeArguments()
            r11 = 0
            r6 = r6[r11]
            boolean r7 = r6 instanceof java.lang.reflect.WildcardType
            if (r7 == 0) goto L9f0
            java.lang.reflect.WildcardType r6 = (java.lang.reflect.WildcardType) r6
            java.lang.reflect.Type[] r6 = r6.getLowerBounds()
            r6 = r6[r11]
        L9f0:
            java.lang.Class r7 = defpackage.ak7.c0(r6)
            java.lang.Class<gb0> r8 = defpackage.gb0.class
            if (r7 != r4) goto La05
            boolean r7 = r6 instanceof java.lang.reflect.ParameterizedType
            if (r7 == 0) goto La05
            java.lang.reflect.ParameterizedType r6 = (java.lang.reflect.ParameterizedType) r6
            java.lang.reflect.Type r6 = defpackage.ak7.Y(r11, r6)
            r7 = 1
            r9 = 0
            goto La16
        La05:
            java.lang.Class r7 = defpackage.ak7.c0(r6)
            if (r7 == r8) goto La3c
            boolean r7 = defpackage.ak7.i
            if (r7 == 0) goto La13
            if (r6 != r3) goto La13
            r7 = 1
            goto La14
        La13:
            r7 = 0
        La14:
            r9 = r7
            r7 = 0
        La16:
            vu2 r10 = new vu2
            r15 = 1
            java.lang.reflect.Type[] r11 = new java.lang.reflect.Type[r15]
            r12 = 0
            r11[r12] = r6
            r6 = 0
            r10.<init>(r6, r8, r11)
            java.lang.Class<nj6> r6 = defpackage.nj6.class
            boolean r6 = defpackage.ak7.l0(r2, r6)
            if (r6 == 0) goto La2b
            goto La38
        La2b:
            int r6 = r2.length
            int r6 = r6 + r15
            java.lang.annotation.Annotation[] r6 = new java.lang.annotation.Annotation[r6]
            oj6 r8 = defpackage.oj6.a
            r6[r12] = r8
            int r8 = r2.length
            java.lang.System.arraycopy(r2, r12, r6, r15, r8)
            r2 = r6
        La38:
            r6 = r9
        La39:
            r8 = r27
            goto La56
        La3c:
            r12 = 0
            java.lang.reflect.ParameterizedType r6 = (java.lang.reflect.ParameterizedType) r6
            java.lang.reflect.Type r0 = defpackage.ak7.Y(r12, r6)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r2 = "Suspend functions should not return Call, as they already execute asynchronously.\nChange its return type to %s"
            r3 = 0
            java.lang.IllegalArgumentException r0 = defpackage.ak7.o0(r1, r3, r2, r0)
            throw r0
        La4f:
            java.lang.reflect.Type r10 = r1.getGenericReturnType()
            r6 = 0
            r7 = 0
            goto La39
        La56:
            ib0 r2 = r8.i(r10, r2)     // Catch: java.lang.RuntimeException -> Laec
            java.lang.reflect.Type r9 = r2.a()
            java.lang.Class<wl5> r10 = defpackage.wl5.class
            if (r9 == r10) goto Lac8
            if (r9 == r4) goto Labd
            java.lang.String r4 = r0.c
            r10 = r22
            boolean r4 = r4.equals(r10)
            if (r4 == 0) goto La88
            java.lang.Class<java.lang.Void> r4 = java.lang.Void.class
            boolean r4 = r4.equals(r9)
            if (r4 != 0) goto La88
            boolean r4 = defpackage.ak7.i
            if (r4 == 0) goto La7d
            if (r9 != r3) goto La7d
            goto La88
        La7d:
            java.lang.String r0 = "HEAD method must use Void or Unit as response type."
            r11 = 0
            java.lang.Object[] r2 = new java.lang.Object[r11]
            r3 = 0
            java.lang.IllegalArgumentException r0 = defpackage.ak7.o0(r1, r3, r0, r2)
            throw r0
        La88:
            java.lang.annotation.Annotation[] r3 = r1.getAnnotations()
            b51 r4 = r8.t(r9, r3)     // Catch: java.lang.RuntimeException -> Lab1
            java.lang.Object r1 = r8.L
            r3 = r1
            xk4 r3 = (defpackage.xk4) r3
            if (r5 != 0) goto Laa0
            a03 r1 = new a03
            r6 = 0
            r5 = r2
            r2 = r0
            r1.<init>(r2, r3, r4, r5, r6)
            return r1
        Laa0:
            r5 = r2
            r2 = r0
            if (r7 == 0) goto Laab
            a03 r1 = new a03
            r6 = 1
            r1.<init>(r2, r3, r4, r5, r6)
            return r1
        Laab:
            b03 r1 = new b03
            r1.<init>(r2, r3, r4, r5, r6)
            return r1
        Lab1:
            r0 = move-exception
            java.lang.String r2 = "Unable to create converter for %s"
            java.lang.Object[] r3 = new java.lang.Object[]{r9}
            java.lang.IllegalArgumentException r0 = defpackage.ak7.o0(r1, r0, r2, r3)
            throw r0
        Labd:
            java.lang.String r0 = "Response must include generic type (e.g., Response<String>)"
            r11 = 0
            java.lang.Object[] r2 = new java.lang.Object[r11]
            r3 = 0
            java.lang.IllegalArgumentException r0 = defpackage.ak7.o0(r1, r3, r0, r2)
            throw r0
        Lac8:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "'"
            r0.<init>(r2)
            java.lang.Class r2 = defpackage.ak7.c0(r9)
            java.lang.String r2 = r2.getName()
            r0.append(r2)
            java.lang.String r2 = "' is not a valid response body type. Did you mean ResponseBody?"
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r11 = 0
            java.lang.Object[] r2 = new java.lang.Object[r11]
            r3 = 0
            java.lang.IllegalArgumentException r0 = defpackage.ak7.o0(r1, r3, r0, r2)
            throw r0
        Laec:
            r0 = move-exception
            java.lang.String r2 = "Unable to create call adapter for %s"
            java.lang.Object[] r3 = new java.lang.Object[]{r10}
            java.lang.IllegalArgumentException r0 = defpackage.ak7.o0(r1, r0, r2, r3)
            throw r0
        Laf8:
            r3 = 0
            r11 = 0
            java.lang.String r0 = "Service methods cannot return void."
            java.lang.Object[] r2 = new java.lang.Object[r11]
            java.lang.IllegalArgumentException r0 = defpackage.ak7.o0(r1, r3, r0, r2)
            throw r0
        Lb03:
            r3 = 0
            java.lang.String r0 = "Method return type must not include a type variable or wildcard: %s"
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.IllegalArgumentException r0 = defpackage.ak7.o0(r1, r3, r0, r2)
            throw r0
        Lb0f:
            r11 = r5
            r3 = r9
            java.lang.String r0 = "HTTP method annotation is required (e.g., @GET, @POST, etc.)."
            java.lang.Object[] r2 = new java.lang.Object[r11]
            java.lang.IllegalArgumentException r0 = defpackage.ak7.o0(r1, r3, r0, r2)
            throw r0
    }

    public abstract java.lang.Object a(defpackage.vk4 r1, java.lang.Object[] r2);
}
