package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: uu2  reason: default package */
/* loaded from: classes.dex */
public final class uu2 implements java.lang.reflect.GenericArrayType {
    public final /* synthetic */ int A;
    public final java.lang.reflect.Type B;

    public uu2(int r1, java.lang.reflect.Type r2) {
            r0 = this;
            r0.A = r1
            switch(r1) {
                case 1: goto L12;
                default: goto L5;
            }
        L5:
            r0.<init>()
            java.util.Objects.requireNonNull(r2)
            java.lang.reflect.Type r1 = defpackage.q60.l(r2)
            r0.B = r1
            return
        L12:
            r0.<init>()
            r0.B = r2
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
            boolean r0 = r4 instanceof java.lang.reflect.GenericArrayType
            if (r0 == 0) goto L14
            java.lang.reflect.GenericArrayType r4 = (java.lang.reflect.GenericArrayType) r4
            boolean r3 = defpackage.ak7.Q(r3, r4)
            if (r3 == 0) goto L14
            r1 = r2
        L14:
            return r1
        L15:
            boolean r0 = r4 instanceof java.lang.reflect.GenericArrayType
            if (r0 == 0) goto L22
            java.lang.reflect.GenericArrayType r4 = (java.lang.reflect.GenericArrayType) r4
            boolean r3 = defpackage.q60.z(r3, r4)
            if (r3 == 0) goto L22
            r1 = r2
        L22:
            return r1
    }

    @Override // java.lang.reflect.GenericArrayType
    public final java.lang.reflect.Type getGenericComponentType() {
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

    public final int hashCode() {
            r1 = this;
            int r0 = r1.A
            switch(r0) {
                case 0: goto Lc;
                default: goto L5;
            }
        L5:
            java.lang.reflect.Type r1 = r1.B
            int r1 = r1.hashCode()
            return r1
        Lc:
            java.lang.reflect.Type r1 = r1.B
            int r1 = r1.hashCode()
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            int r0 = r2.A
            java.lang.String r1 = "[]"
            java.lang.reflect.Type r2 = r2.B
            switch(r0) {
                case 0: goto L1d;
                default: goto L9;
            }
        L9:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = defpackage.ak7.J0(r2)
            r0.append(r2)
            r0.append(r1)
            java.lang.String r2 = r0.toString()
            return r2
        L1d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = defpackage.q60.b0(r2)
            r0.append(r2)
            r0.append(r1)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
