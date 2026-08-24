package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wu2  reason: default package */
/* loaded from: classes.dex */
public final class wu2 implements java.lang.reflect.WildcardType {
    public final /* synthetic */ int A;
    public final java.lang.reflect.Type B;
    public final java.lang.reflect.Type L;

    public wu2(java.lang.reflect.Type[] r5, java.lang.reflect.Type[] r6, int r7) {
            r4 = this;
            r4.A = r7
            r0 = 1
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            r2 = 0
            r3 = 0
            switch(r7) {
                case 1: goto L56;
                default: goto La;
            }
        La:
            r4.<init>()
            int r7 = r6.length
            if (r7 > r0) goto L50
            int r7 = r5.length
            if (r7 != r0) goto L4a
            int r7 = r6.length
            if (r7 != r0) goto L35
            r7 = r6[r2]
            java.util.Objects.requireNonNull(r7)
            r7 = r6[r2]
            defpackage.q60.p(r7)
            r5 = r5[r2]
            if (r5 != r1) goto L2f
            r5 = r6[r2]
            java.lang.reflect.Type r5 = defpackage.q60.l(r5)
            r4.L = r5
            r4.B = r1
            goto L49
        L2f:
            java.lang.String r4 = "When lower bound is specified, upper bound must be Object"
            defpackage.i.h(r4)
            throw r3
        L35:
            r6 = r5[r2]
            java.util.Objects.requireNonNull(r6)
            r6 = r5[r2]
            defpackage.q60.p(r6)
            r4.L = r3
            r5 = r5[r2]
            java.lang.reflect.Type r5 = defpackage.q60.l(r5)
            r4.B = r5
        L49:
            return
        L4a:
            java.lang.String r4 = "Exactly one upper bound must be specified"
            defpackage.i.h(r4)
            throw r3
        L50:
            java.lang.String r4 = "At most one lower bound is supported"
            defpackage.i.h(r4)
            throw r3
        L56:
            r4.<init>()
            int r7 = r6.length
            if (r7 > r0) goto L90
            int r7 = r5.length
            if (r7 != r0) goto L8c
            int r7 = r6.length
            if (r7 != r0) goto L7b
            r7 = r6[r2]
            r7.getClass()
            r7 = r6[r2]
            defpackage.ak7.K(r7)
            r5 = r5[r2]
            if (r5 != r1) goto L77
            r5 = r6[r2]
            r4.L = r5
            r4.B = r1
            goto L8b
        L77:
            defpackage.u34.t()
            throw r3
        L7b:
            r6 = r5[r2]
            r6.getClass()
            r6 = r5[r2]
            defpackage.ak7.K(r6)
            r4.L = r3
            r5 = r5[r2]
            r4.B = r5
        L8b:
            return
        L8c:
            defpackage.u34.t()
            throw r3
        L90:
            defpackage.u34.t()
            throw r3
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
            boolean r0 = r4 instanceof java.lang.reflect.WildcardType
            if (r0 == 0) goto L14
            java.lang.reflect.WildcardType r4 = (java.lang.reflect.WildcardType) r4
            boolean r3 = defpackage.ak7.Q(r3, r4)
            if (r3 == 0) goto L14
            r1 = r2
        L14:
            return r1
        L15:
            boolean r0 = r4 instanceof java.lang.reflect.WildcardType
            if (r0 == 0) goto L22
            java.lang.reflect.WildcardType r4 = (java.lang.reflect.WildcardType) r4
            boolean r3 = defpackage.q60.z(r3, r4)
            if (r3 == 0) goto L22
            r1 = r2
        L22:
            return r1
    }

    @Override // java.lang.reflect.WildcardType
    public final java.lang.reflect.Type[] getLowerBounds() {
            r3 = this;
            int r0 = r3.A
            r1 = 0
            r2 = 1
            java.lang.reflect.Type r3 = r3.L
            switch(r0) {
                case 0: goto L13;
                default: goto L9;
            }
        L9:
            if (r3 == 0) goto L10
            java.lang.reflect.Type[] r0 = new java.lang.reflect.Type[r2]
            r0[r1] = r3
            goto L12
        L10:
            java.lang.reflect.Type[] r0 = defpackage.ak7.h
        L12:
            return r0
        L13:
            if (r3 == 0) goto L1a
            java.lang.reflect.Type[] r0 = new java.lang.reflect.Type[r2]
            r0[r1] = r3
            goto L1c
        L1a:
            java.lang.reflect.Type[] r0 = defpackage.q60.h
        L1c:
            return r0
    }

    @Override // java.lang.reflect.WildcardType
    public final java.lang.reflect.Type[] getUpperBounds() {
            r3 = this;
            int r0 = r3.A
            r1 = 0
            r2 = 1
            java.lang.reflect.Type r3 = r3.B
            switch(r0) {
                case 0: goto Le;
                default: goto L9;
            }
        L9:
            java.lang.reflect.Type[] r0 = new java.lang.reflect.Type[r2]
            r0[r1] = r3
            return r0
        Le:
            java.lang.reflect.Type[] r0 = new java.lang.reflect.Type[r2]
            r0[r1] = r3
            return r0
    }

    public final int hashCode() {
            r3 = this;
            int r0 = r3.A
            java.lang.reflect.Type r1 = r3.B
            r2 = 1
            java.lang.reflect.Type r3 = r3.L
            switch(r0) {
                case 0: goto L1a;
                default: goto La;
            }
        La:
            if (r3 == 0) goto L12
            int r3 = r3.hashCode()
            int r2 = r3 + 31
        L12:
            int r3 = r1.hashCode()
        L16:
            int r3 = r3 + 31
            r3 = r3 ^ r2
            return r3
        L1a:
            if (r3 == 0) goto L22
            int r3 = r3.hashCode()
            int r2 = r3 + 31
        L22:
            int r3 = r1.hashCode()
            goto L16
    }

    public final java.lang.String toString() {
            r6 = this;
            int r0 = r6.A
            java.lang.String r1 = "? extends "
            java.lang.String r2 = "?"
            java.lang.Class<java.lang.Object> r3 = java.lang.Object.class
            java.lang.String r4 = "? super "
            java.lang.reflect.Type r5 = r6.L
            java.lang.reflect.Type r6 = r6.B
            switch(r0) {
                case 0: goto L38;
                default: goto L11;
            }
        L11:
            if (r5 == 0) goto L24
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r4)
            java.lang.String r0 = defpackage.ak7.J0(r5)
            r6.append(r0)
            java.lang.String r2 = r6.toString()
            goto L37
        L24:
            if (r6 != r3) goto L27
            goto L37
        L27:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            java.lang.String r6 = defpackage.ak7.J0(r6)
            r0.append(r6)
            java.lang.String r2 = r0.toString()
        L37:
            return r2
        L38:
            if (r5 == 0) goto L4b
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r4)
            java.lang.String r0 = defpackage.q60.b0(r5)
            r6.append(r0)
            java.lang.String r2 = r6.toString()
            goto L5e
        L4b:
            if (r6 != r3) goto L4e
            goto L5e
        L4e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            java.lang.String r6 = defpackage.q60.b0(r6)
            r0.append(r6)
            java.lang.String r2 = r0.toString()
        L5e:
            return r2
    }
}
