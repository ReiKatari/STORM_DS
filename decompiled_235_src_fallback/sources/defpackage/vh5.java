package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vh5  reason: default package */
/* loaded from: classes.dex */
public final class vh5 implements defpackage.zc7 {
    public final defpackage.ci A;
    public final defpackage.qa2 B;
    public final defpackage.z62 L;
    public final defpackage.ld3 R;
    public final java.util.List X;

    public vh5(defpackage.ci r1, defpackage.qa2 r2, defpackage.z62 r3, defpackage.ld3 r4, java.util.List r5) {
            r0 = this;
            r0.<init>()
            r0.A = r1
            r0.B = r2
            r0.L = r3
            r0.R = r4
            r0.X = r5
            return
    }

    public static void b(java.lang.Object r1, java.lang.reflect.AccessibleObject r2) {
            r0 = r2
            java.lang.reflect.Member r0 = (java.lang.reflect.Member) r0
            int r0 = r0.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isStatic(r0)
            if (r0 == 0) goto Le
            r1 = 0
        Le:
            kh5 r0 = defpackage.kh5.a
            boolean r1 = r0.a(r1, r2)
            if (r1 == 0) goto L17
            return
        L17:
            r1 = 1
            java.lang.String r1 = defpackage.oh5.d(r2, r1)
            ne3 r2 = new ne3
            java.lang.String r0 = " is not accessible and ReflectionAccessFilter does not permit making it accessible. Register a TypeAdapter for the declaring type, adjust the access filter or increase the visibility of the element and its declaring type."
            java.lang.String r1 = r1.concat(r0)
            r2.<init>(r1)
            throw r2
    }

    public static void c(java.lang.Class r3, java.lang.String r4, java.lang.reflect.Field r5, java.lang.reflect.Field r6) {
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Class "
            r1.<init>(r2)
            java.lang.String r3 = r3.getName()
            r1.append(r3)
            java.lang.String r3 = " declares multiple JSON fields named '"
            r1.append(r3)
            r1.append(r4)
            java.lang.String r3 = "'; conflict is caused by fields "
            r1.append(r3)
            java.lang.String r3 = defpackage.oh5.c(r5)
            r1.append(r3)
            java.lang.String r3 = " and "
            r1.append(r3)
            java.lang.String r3 = defpackage.oh5.c(r6)
            r1.append(r3)
            java.lang.String r3 = "\nSee "
            r1.append(r3)
            java.lang.String r3 = "duplicate-fields"
            java.lang.String r4 = "https://github.com/google/gson/blob/main/Troubleshooting.md#"
            java.lang.String r3 = r4.concat(r3)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    @Override // defpackage.zc7
    public final defpackage.yc7 a(defpackage.su2 r8, defpackage.ie7 r9) {
            r7 = this;
            java.lang.Class r3 = r9.a
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            boolean r0 = r0.isAssignableFrom(r3)
            if (r0 != 0) goto Lc
            r7 = 0
            return r7
        Lc:
            uj2 r0 = defpackage.oh5.a
            int r0 = r3.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isStatic(r0)
            if (r0 != 0) goto L2a
            boolean r0 = r3.isAnonymousClass()
            if (r0 != 0) goto L24
            boolean r0 = r3.isLocalClass()
            if (r0 == 0) goto L2a
        L24:
            ph5 r7 = new ph5
            r7.<init>()
            return r7
        L2a:
            java.util.List r0 = r7.X
            hh5 r0 = defpackage.nj2.q(r0)
            hh5 r1 = defpackage.hh5.BLOCK_ALL
            if (r0 == r1) goto L68
            hh5 r1 = defpackage.hh5.BLOCK_INACCESSIBLE
            r2 = 1
            if (r0 != r1) goto L3b
            r4 = r2
            goto L3d
        L3b:
            r0 = 0
            r4 = r0
        L3d:
            uj2 r0 = defpackage.oh5.a
            boolean r0 = r0.Y(r3)
            if (r0 == 0) goto L53
            uh5 r6 = new uh5
            r5 = 1
            r0 = r7
            r1 = r8
            r2 = r9
            th5 r7 = r0.d(r1, r2, r3, r4, r5)
            r6.<init>(r3, r7, r4)
            return r6
        L53:
            r0 = r7
            r1 = r8
            r7 = r2
            r2 = r9
            ci r8 = r0.A
            ph4 r7 = r8.l(r2, r7)
            sh5 r8 = new sh5
            r5 = 0
            th5 r9 = r0.d(r1, r2, r3, r4, r5)
            r8.<init>(r7, r9)
            return r8
        L68:
            ne3 r7 = new ne3
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "ReflectionAccessFilter does not permit using reflection for "
            r8.<init>(r9)
            r8.append(r3)
            java.lang.String r9 = ". Register a TypeAdapter for this type or adjust the access filter."
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
    }

    public final defpackage.th5 d(defpackage.su2 r29, defpackage.ie7 r30, java.lang.Class r31, boolean r32, boolean r33) {
            r28 = this;
            r0 = r28
            r7 = r31
            boolean r1 = r7.isInterface()
            if (r1 == 0) goto Ld
            th5 r0 = defpackage.th5.c
            return r0
        Ld:
            java.util.LinkedHashMap r8 = new java.util.LinkedHashMap
            r8.<init>()
            java.util.LinkedHashMap r9 = new java.util.LinkedHashMap
            r9.<init>()
            r10 = r30
            r1 = r32
            r11 = r7
        L1c:
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            if (r11 == r2) goto L1ef
            java.lang.reflect.Field[] r12 = r11.getDeclaredFields()
            r13 = 1
            r14 = 0
            if (r11 == r7) goto L3c
            int r2 = r12.length
            if (r2 <= 0) goto L3c
            java.util.List r1 = r0.X
            hh5 r1 = defpackage.nj2.q(r1)
            hh5 r2 = defpackage.hh5.BLOCK_ALL
            if (r1 == r2) goto L3f
            hh5 r2 = defpackage.hh5.BLOCK_INACCESSIBLE
            if (r1 != r2) goto L3b
            r1 = r13
            goto L3c
        L3b:
            r1 = r14
        L3c:
            r18 = r1
            goto L60
        L3f:
            ne3 r0 = new ne3
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "ReflectionAccessFilter does not permit using reflection for "
            r1.<init>(r2)
            r1.append(r11)
            java.lang.String r2 = " (supertype of "
            r1.append(r2)
            r1.append(r7)
            java.lang.String r2 = "). Register a TypeAdapter for this type or adjust the access filter."
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L60:
            int r15 = r12.length
            r1 = r14
        L62:
            if (r1 >= r15) goto L1d3
            r2 = r12[r1]
            boolean r24 = r0.e(r2, r13)
            boolean r3 = r0.e(r2, r14)
            if (r24 != 0) goto L7b
            if (r3 != 0) goto L7b
            r3 = r29
            r27 = r1
            r30 = r13
            r2 = r15
            goto L1cc
        L7b:
            java.lang.Class<gc6> r4 = defpackage.gc6.class
            r25 = 0
            if (r33 == 0) goto Lbf
            int r5 = r2.getModifiers()
            boolean r5 = java.lang.reflect.Modifier.isStatic(r5)
            if (r5 == 0) goto L90
            r26 = r14
        L8d:
            r19 = r25
            goto Lc2
        L90:
            uj2 r5 = defpackage.oh5.a
            java.lang.reflect.Method r5 = r5.E(r11, r2)
            if (r18 != 0) goto L9b
            defpackage.oh5.f(r5)
        L9b:
            java.lang.annotation.Annotation r6 = r5.getAnnotation(r4)
            if (r6 == 0) goto Lba
            java.lang.annotation.Annotation r6 = r2.getAnnotation(r4)
            if (r6 == 0) goto La8
            goto Lba
        La8:
            java.lang.String r0 = defpackage.oh5.d(r5, r14)
            ne3 r1 = new ne3
            java.lang.String r2 = "@SerializedName on "
            java.lang.String r3 = " is not supported"
            java.lang.String r0 = defpackage.lb1.A(r2, r0, r3)
            r1.<init>(r0)
            throw r1
        Lba:
            r26 = r3
            r19 = r5
            goto Lc2
        Lbf:
            r26 = r3
            goto L8d
        Lc2:
            if (r18 != 0) goto Lc9
            if (r19 != 0) goto Lc9
            defpackage.oh5.f(r2)
        Lc9:
            java.lang.reflect.Type r3 = r10.b
            java.lang.reflect.Type r5 = r2.getGenericType()
            java.util.HashMap r6 = new java.util.HashMap
            r6.<init>()
            java.lang.reflect.Type r3 = defpackage.q60.W(r3, r11, r5, r6)
            java.lang.annotation.Annotation r4 = r2.getAnnotation(r4)
            gc6 r4 = (defpackage.gc6) r4
            if (r4 != 0) goto Leb
            qa2 r4 = r0.B
            java.lang.String r5 = r4.translateName(r2)
            java.util.List r4 = r4.alternateNames(r2)
            goto Lf7
        Leb:
            java.lang.String r5 = r4.value()
            java.lang.String[] r4 = r4.alternate()
            java.util.List r4 = java.util.Arrays.asList(r4)
        Lf7:
            boolean r6 = r4.isEmpty()
            if (r6 == 0) goto L105
            java.util.List r4 = java.util.Collections.singletonList(r5)
            r30 = r13
            r13 = r4
            goto L119
        L105:
            java.util.ArrayList r6 = new java.util.ArrayList
            int r16 = r4.size()
            r30 = r13
            int r13 = r16 + 1
            r6.<init>(r13)
            r6.add(r5)
            r6.addAll(r4)
            r13 = r6
        L119:
            java.lang.Object r4 = r13.get(r14)
            r16 = r4
            java.lang.String r16 = (java.lang.String) r16
            ie7 r4 = new ie7
            r4.<init>(r3)
            java.lang.Class r3 = r4.a
            if (r3 == 0) goto L133
            boolean r3 = r3.isPrimitive()
            if (r3 == 0) goto L133
            r22 = r30
            goto L135
        L133:
            r22 = r14
        L135:
            int r3 = r2.getModifiers()
            boolean r5 = java.lang.reflect.Modifier.isStatic(r3)
            if (r5 == 0) goto L148
            boolean r3 = java.lang.reflect.Modifier.isFinal(r3)
            if (r3 == 0) goto L148
            r23 = r30
            goto L14a
        L148:
            r23 = r14
        L14a:
            java.lang.Class<jd3> r3 = defpackage.jd3.class
            java.lang.annotation.Annotation r3 = r2.getAnnotation(r3)
            r5 = r3
            jd3 r5 = (defpackage.jd3) r5
            if (r5 == 0) goto L166
            r17 = r2
            ci r2 = r0.A
            r6 = 0
            r3 = r1
            ld3 r1 = r0.R
            r27 = r3
            r3 = r29
            yc7 r1 = r1.b(r2, r3, r4, r5, r6)
            goto L16e
        L166:
            r3 = r29
            r27 = r1
            r17 = r2
            r1 = r25
        L16e:
            if (r1 == 0) goto L173
            r2 = r30
            goto L174
        L173:
            r2 = r14
        L174:
            if (r1 != 0) goto L17a
            yc7 r1 = r3.d(r4)
        L17a:
            if (r24 == 0) goto L18c
            if (r2 == 0) goto L180
            r2 = r1
            goto L188
        L180:
            lc3 r2 = new lc3
            java.lang.reflect.Type r4 = r4.b
            r5 = 2
            r2.<init>(r3, r1, r4, r5)
        L188:
            r20 = r2
        L18a:
            r2 = r15
            goto L18f
        L18c:
            r20 = r1
            goto L18a
        L18f:
            qh5 r15 = new qh5
            r21 = r1
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23)
            r4 = r16
            r1 = r17
            if (r26 == 0) goto L1bb
            java.util.Iterator r5 = r13.iterator()
        L1a0:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L1bb
            java.lang.Object r6 = r5.next()
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r13 = r8.put(r6, r15)
            qh5 r13 = (defpackage.qh5) r13
            if (r13 != 0) goto L1b5
            goto L1a0
        L1b5:
            java.lang.reflect.Field r0 = r13.b
            c(r7, r6, r0, r1)
            throw r25
        L1bb:
            if (r24 == 0) goto L1cc
            java.lang.Object r5 = r9.put(r4, r15)
            qh5 r5 = (defpackage.qh5) r5
            if (r5 != 0) goto L1c6
            goto L1cc
        L1c6:
            java.lang.reflect.Field r0 = r5.b
            c(r7, r4, r0, r1)
            throw r25
        L1cc:
            int r1 = r27 + 1
            r13 = r30
            r15 = r2
            goto L62
        L1d3:
            r3 = r29
            java.lang.reflect.Type r1 = r10.b
            java.lang.reflect.Type r2 = r11.getGenericSuperclass()
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            java.lang.reflect.Type r1 = defpackage.q60.W(r1, r11, r2, r4)
            ie7 r10 = new ie7
            r10.<init>(r1)
            java.lang.Class r11 = r10.a
            r1 = r18
            goto L1c
        L1ef:
            th5 r0 = new th5
            java.util.ArrayList r1 = new java.util.ArrayList
            java.util.Collection r2 = r9.values()
            r1.<init>(r2)
            r0.<init>(r8, r1)
            return r0
    }

    public final boolean e(java.lang.reflect.Field r3, boolean r4) {
            r2 = this;
            z62 r2 = r2.L
            r2.getClass()
            r0 = 136(0x88, float:1.9E-43)
            int r1 = r3.getModifiers()
            r0 = r0 & r1
            r1 = 1
            if (r0 == 0) goto L11
        Lf:
            r2 = r1
            goto L41
        L11:
            boolean r0 = r3.isSynthetic()
            if (r0 == 0) goto L18
            goto Lf
        L18:
            java.lang.Class r3 = r3.getType()
            boolean r3 = r2.b(r3, r4)
            if (r3 == 0) goto L23
            goto Lf
        L23:
            if (r4 == 0) goto L28
            java.util.List r2 = r2.A
            goto L2a
        L28:
            java.util.List r2 = r2.B
        L2a:
            boolean r3 = r2.isEmpty()
            if (r3 != 0) goto L40
            java.util.Iterator r2 = r2.iterator()
            boolean r3 = r2.hasNext()
            if (r3 != 0) goto L3b
            goto L40
        L3b:
            java.lang.ClassCastException r2 = defpackage.i61.j(r2)
            throw r2
        L40:
            r2 = 0
        L41:
            r2 = r2 ^ r1
            return r2
    }
}
