package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vu2  reason: default package */
/* loaded from: classes.dex */
public final class vu2 implements java.lang.reflect.ParameterizedType {
    public final /* synthetic */ int A;
    public final java.lang.reflect.Type B;
    public final java.lang.reflect.Type L;
    public final java.lang.reflect.Type[] R;

    public vu2(java.lang.reflect.Type r4, java.lang.Class r5, java.lang.reflect.Type[] r6) {
            r3 = this;
            r0 = 0
            r3.A = r0
            r3.<init>()
            java.util.Objects.requireNonNull(r5)
            r1 = 0
            if (r4 != 0) goto L23
            int r2 = r5.getModifiers()
            boolean r2 = java.lang.reflect.Modifier.isStatic(r2)
            if (r2 != 0) goto L23
            java.lang.Class r2 = r5.getDeclaringClass()
            if (r2 != 0) goto L1d
            goto L23
        L1d:
            java.lang.String r3 = "Must specify owner type for "
            defpackage.e41.w(r5, r3)
            throw r1
        L23:
            if (r4 != 0) goto L26
            goto L2a
        L26:
            java.lang.reflect.Type r1 = defpackage.q60.l(r4)
        L2a:
            r3.B = r1
            java.lang.reflect.Type r4 = defpackage.q60.l(r5)
            r3.L = r4
            java.lang.Object r4 = r6.clone()
            java.lang.reflect.Type[] r4 = (java.lang.reflect.Type[]) r4
            r3.R = r4
            int r4 = r4.length
        L3b:
            if (r0 >= r4) goto L58
            java.lang.reflect.Type[] r5 = r3.R
            r5 = r5[r0]
            java.util.Objects.requireNonNull(r5)
            java.lang.reflect.Type[] r5 = r3.R
            r5 = r5[r0]
            defpackage.q60.p(r5)
            java.lang.reflect.Type[] r5 = r3.R
            r6 = r5[r0]
            java.lang.reflect.Type r6 = defpackage.q60.l(r6)
            r5[r0] = r6
            int r0 = r0 + 1
            goto L3b
        L58:
            return
    }

    public vu2(java.lang.reflect.Type r5, java.lang.reflect.Type r6, java.lang.reflect.Type[] r7) {
            r4 = this;
            r0 = 1
            r4.A = r0
            r4.<init>()
            boolean r1 = r6 instanceof java.lang.Class
            r2 = 0
            if (r1 == 0) goto L23
            if (r5 != 0) goto Lf
            r1 = r0
            goto L10
        Lf:
            r1 = r2
        L10:
            r3 = r6
            java.lang.Class r3 = (java.lang.Class) r3
            java.lang.Class r3 = r3.getEnclosingClass()
            if (r3 != 0) goto L1a
            goto L1b
        L1a:
            r0 = r2
        L1b:
            if (r1 != r0) goto L1e
            goto L23
        L1e:
            defpackage.u34.t()
            r4 = 0
            throw r4
        L23:
            int r0 = r7.length
        L24:
            if (r2 >= r0) goto L33
            r1 = r7[r2]
            java.lang.String r3 = "typeArgument == null"
            java.util.Objects.requireNonNull(r1, r3)
            defpackage.ak7.K(r1)
            int r2 = r2 + 1
            goto L24
        L33:
            r4.B = r5
            r4.L = r6
            java.lang.Object r5 = r7.clone()
            java.lang.reflect.Type[] r5 = (java.lang.reflect.Type[]) r5
            r4.R = r5
            return
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            int r0 = r3.A
            r1 = 0
            r2 = 1
            switch(r0) {
                case 0: goto L15;
                default: goto L7;
            }
        L7:
            boolean r0 = r4 instanceof java.lang.reflect.ParameterizedType
            if (r0 == 0) goto L14
            java.lang.reflect.ParameterizedType r4 = (java.lang.reflect.ParameterizedType) r4
            boolean r3 = defpackage.ak7.Q(r3, r4)
            if (r3 == 0) goto L14
            r1 = r2
        L14:
            return r1
        L15:
            boolean r0 = r4 instanceof java.lang.reflect.ParameterizedType
            if (r0 == 0) goto L22
            java.lang.reflect.ParameterizedType r4 = (java.lang.reflect.ParameterizedType) r4
            boolean r3 = defpackage.q60.z(r3, r4)
            if (r3 == 0) goto L22
            r1 = r2
        L22:
            return r1
    }

    @Override // java.lang.reflect.ParameterizedType
    public final java.lang.reflect.Type[] getActualTypeArguments() {
            r1 = this;
            int r0 = r1.A
            java.lang.reflect.Type[] r1 = r1.R
            switch(r0) {
                case 0: goto Le;
                default: goto L7;
            }
        L7:
            java.lang.Object r1 = r1.clone()
            java.lang.reflect.Type[] r1 = (java.lang.reflect.Type[]) r1
            return r1
        Le:
            java.lang.Object r1 = r1.clone()
            java.lang.reflect.Type[] r1 = (java.lang.reflect.Type[]) r1
            return r1
    }

    @Override // java.lang.reflect.ParameterizedType
    public final java.lang.reflect.Type getOwnerType() {
            r1 = this;
            int r0 = r1.A
            switch(r0) {
                case 0: goto L8;
                default: goto L5;
            }
        L5:
            java.lang.reflect.Type r1 = r1.B
            return r1
        L8:
            java.lang.reflect.Type r1 = r1.B
            return r1
    }

    @Override // java.lang.reflect.ParameterizedType
    public final java.lang.reflect.Type getRawType() {
            r1 = this;
            int r0 = r1.A
            switch(r0) {
                case 0: goto L8;
                default: goto L5;
            }
        L5:
            java.lang.reflect.Type r1 = r1.L
            return r1
        L8:
            java.lang.reflect.Type r1 = r1.L
            return r1
    }

    public final int hashCode() {
            r4 = this;
            int r0 = r4.A
            r1 = 0
            java.lang.reflect.Type r2 = r4.B
            java.lang.reflect.Type r3 = r4.L
            java.lang.reflect.Type[] r4 = r4.R
            switch(r0) {
                case 0: goto L1d;
                default: goto Lc;
            }
        Lc:
            int r4 = java.util.Arrays.hashCode(r4)
            int r0 = r3.hashCode()
            r4 = r4 ^ r0
            if (r2 == 0) goto L1b
            int r1 = r2.hashCode()
        L1b:
            r4 = r4 ^ r1
            return r4
        L1d:
            int r4 = java.util.Arrays.hashCode(r4)
            int r0 = r3.hashCode()
            r4 = r4 ^ r0
            if (r2 == 0) goto L2c
            int r1 = r2.hashCode()
        L2c:
            r4 = r4 ^ r1
            return r4
    }

    public final java.lang.String toString() {
            r9 = this;
            int r0 = r9.A
            java.lang.String r1 = ">"
            java.lang.String r2 = ", "
            r3 = 0
            java.lang.String r4 = "<"
            java.lang.reflect.Type[] r5 = r9.R
            r6 = 1
            java.lang.reflect.Type r9 = r9.L
            switch(r0) {
                case 0: goto L4f;
                default: goto L11;
            }
        L11:
            int r0 = r5.length
            if (r0 != 0) goto L19
            java.lang.String r9 = defpackage.ak7.J0(r9)
            goto L4e
        L19:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r7 = r5.length
            int r7 = r7 + r6
            int r7 = r7 * 30
            r0.<init>(r7)
            java.lang.String r9 = defpackage.ak7.J0(r9)
            r0.append(r9)
            r0.append(r4)
            r9 = r5[r3]
            java.lang.String r9 = defpackage.ak7.J0(r9)
            r0.append(r9)
        L35:
            int r9 = r5.length
            if (r6 >= r9) goto L47
            r0.append(r2)
            r9 = r5[r6]
            java.lang.String r9 = defpackage.ak7.J0(r9)
            r0.append(r9)
            int r6 = r6 + 1
            goto L35
        L47:
            r0.append(r1)
            java.lang.String r9 = r0.toString()
        L4e:
            return r9
        L4f:
            int r0 = r5.length
            if (r0 != 0) goto L57
            java.lang.String r9 = defpackage.q60.b0(r9)
            goto L8b
        L57:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            int r8 = r0 + 1
            int r8 = r8 * 30
            r7.<init>(r8)
            java.lang.String r9 = defpackage.q60.b0(r9)
            r7.append(r9)
            r7.append(r4)
            r9 = r5[r3]
            java.lang.String r9 = defpackage.q60.b0(r9)
            r7.append(r9)
        L73:
            if (r6 >= r0) goto L84
            r7.append(r2)
            r9 = r5[r6]
            java.lang.String r9 = defpackage.q60.b0(r9)
            r7.append(r9)
            int r6 = r6 + 1
            goto L73
        L84:
            r7.append(r1)
            java.lang.String r9 = r7.toString()
        L8b:
            return r9
    }
}
