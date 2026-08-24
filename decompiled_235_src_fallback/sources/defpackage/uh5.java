package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: uh5  reason: default package */
/* loaded from: classes.dex */
public final class uh5 extends defpackage.rh5 {
    public static final java.util.HashMap e = null;
    public final java.lang.reflect.Constructor b;
    public final java.lang.Object[] c;
    public final java.util.HashMap d;

    static {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1 = 0
            java.lang.Byte r2 = java.lang.Byte.valueOf(r1)
            java.lang.Class r3 = java.lang.Byte.TYPE
            r0.put(r3, r2)
            java.lang.Class r2 = java.lang.Short.TYPE
            java.lang.Short r3 = java.lang.Short.valueOf(r1)
            r0.put(r2, r3)
            java.lang.Class r2 = java.lang.Integer.TYPE
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            r0.put(r2, r3)
            r2 = 0
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.Class r3 = java.lang.Long.TYPE
            r0.put(r3, r2)
            r2 = 0
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            java.lang.Class r3 = java.lang.Float.TYPE
            r0.put(r3, r2)
            r2 = 0
            java.lang.Double r2 = java.lang.Double.valueOf(r2)
            java.lang.Class r3 = java.lang.Double.TYPE
            r0.put(r3, r2)
            java.lang.Class r2 = java.lang.Character.TYPE
            java.lang.Character r1 = java.lang.Character.valueOf(r1)
            r0.put(r2, r1)
            java.lang.Class r1 = java.lang.Boolean.TYPE
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r0.put(r1, r2)
            defpackage.uh5.e = r0
            return
    }

    public uh5(java.lang.Class r4, defpackage.th5 r5, boolean r6) {
            r3 = this;
            r3.<init>(r5)
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            r3.d = r5
            uj2 r5 = defpackage.oh5.a
            java.lang.reflect.Constructor r0 = r5.F(r4)
            r3.b = r0
            if (r6 == 0) goto L19
            r6 = 0
            defpackage.vh5.b(r6, r0)
            goto L1c
        L19:
            defpackage.oh5.f(r0)
        L1c:
            java.lang.String[] r4 = r5.M(r4)
            r5 = 0
            r6 = r5
        L22:
            int r0 = r4.length
            if (r6 >= r0) goto L33
            java.util.HashMap r0 = r3.d
            r1 = r4[r6]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r6)
            r0.put(r1, r2)
            int r6 = r6 + 1
            goto L22
        L33:
            java.lang.reflect.Constructor r4 = r3.b
            java.lang.Class[] r4 = r4.getParameterTypes()
            int r6 = r4.length
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r3.c = r6
        L3e:
            int r6 = r4.length
            if (r5 >= r6) goto L50
            java.lang.Object[] r6 = r3.c
            java.util.HashMap r0 = defpackage.uh5.e
            r1 = r4[r5]
            java.lang.Object r0 = r0.get(r1)
            r6[r5] = r0
            int r5 = r5 + 1
            goto L3e
        L50:
            return
    }

    @Override // defpackage.rh5
    public final java.lang.Object d() {
            r0 = this;
            java.lang.Object[] r0 = r0.c
            java.lang.Object r0 = r0.clone()
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            return r0
    }

    @Override // defpackage.rh5
    public final java.lang.Object e(java.lang.Object r6) {
            r5 = this;
            java.lang.Object[] r6 = (java.lang.Object[]) r6
            java.lang.String r0 = "' with args "
            java.lang.String r1 = "Failed to invoke constructor '"
            java.lang.reflect.Constructor r5 = r5.b
            r2 = 0
            java.lang.Object r5 = r5.newInstance(r6)     // Catch: java.lang.reflect.InvocationTargetException -> Le java.lang.IllegalArgumentException -> L31 java.lang.InstantiationException -> L33 java.lang.IllegalAccessException -> L54
            return r5
        Le:
            r3 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r1)
            java.lang.String r5 = defpackage.oh5.b(r5)
            r4.append(r5)
            r4.append(r0)
            java.lang.String r5 = java.util.Arrays.toString(r6)
            r4.append(r5)
            java.lang.String r5 = r4.toString()
            java.lang.Throwable r6 = r3.getCause()
            defpackage.u34.p(r5, r6)
            return r2
        L31:
            r2 = move-exception
            goto L34
        L33:
            r2 = move-exception
        L34:
            java.lang.RuntimeException r3 = new java.lang.RuntimeException
            java.lang.String r5 = defpackage.oh5.b(r5)
            java.lang.String r6 = java.util.Arrays.toString(r6)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r1)
            r4.append(r5)
            r4.append(r0)
            r4.append(r6)
            java.lang.String r5 = r4.toString()
            r3.<init>(r5, r2)
            throw r3
        L54:
            r5 = move-exception
            uj2 r6 = defpackage.oh5.a
            java.lang.String r6 = "Unexpected IllegalAccessException occurred (Gson 2.14.0). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers."
            defpackage.u34.p(r6, r5)
            return r2
    }

    @Override // defpackage.rh5
    public final void f(java.lang.Object r3, defpackage.hf3 r4, defpackage.qh5 r5) {
            r2 = this;
            java.lang.Object[] r3 = (java.lang.Object[]) r3
            java.lang.String r0 = r5.c
            java.util.HashMap r1 = r2.d
            java.lang.Object r1 = r1.get(r0)
            java.lang.Integer r1 = (java.lang.Integer) r1
            if (r1 == 0) goto L3b
            int r2 = r1.intValue()
            yc7 r1 = r5.g
            java.lang.Object r1 = r1.b(r4)
            if (r1 != 0) goto L38
            boolean r5 = r5.h
            if (r5 != 0) goto L1f
            goto L38
        L1f:
            ug r2 = new ug
            java.lang.String r3 = "null is not allowed as value for record component '"
            java.lang.String r5 = "' of primitive type; at path "
            java.lang.StringBuilder r3 = defpackage.i61.t(r3, r0, r5)
            java.lang.String r4 = r4.x()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
        L38:
            r3[r2] = r1
            return
        L3b:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.reflect.Constructor r2 = r2.b
            java.lang.String r2 = defpackage.oh5.b(r2)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Could not find the index in the constructor '"
            r4.<init>(r5)
            r4.append(r2)
            java.lang.String r2 = "' for field with name '"
            r4.append(r2)
            r4.append(r0)
            java.lang.String r2 = "', unable to determine which argument in the constructor the field corresponds to. This is unexpected behavior, as we expect the RecordComponents to have the same names as the fields in the Java class, and that the order of the RecordComponents is the same as the order of the canonical constructor parameters."
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            r3.<init>(r2)
            throw r3
    }
}
