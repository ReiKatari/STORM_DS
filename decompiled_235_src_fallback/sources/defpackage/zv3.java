package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zv3  reason: default package */
/* loaded from: classes.dex */
public final class zv3 implements java.util.Map.Entry {
    public defpackage.zv3 A;
    public defpackage.zv3 B;
    public defpackage.zv3 L;
    public defpackage.zv3 R;
    public defpackage.zv3 X;
    public final java.lang.Object Y;
    public final boolean Z;
    public java.lang.Object d0;
    public int e0;

    public zv3(boolean r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.Y = r0
            r1.Z = r2
            r1.X = r1
            r1.R = r1
            return
    }

    public zv3(boolean r1, defpackage.zv3 r2, java.lang.Object r3, defpackage.zv3 r4, defpackage.zv3 r5) {
            r0 = this;
            r0.<init>()
            r0.A = r2
            r0.Y = r3
            r0.Z = r1
            r1 = 1
            r0.e0 = r1
            r0.R = r4
            r0.X = r5
            r5.R = r0
            r4.X = r0
            return
    }

    @Override // java.util.Map.Entry
    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof java.util.Map.Entry
            r1 = 0
            if (r0 == 0) goto L33
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r0 = r3.Y
            if (r0 != 0) goto L12
            java.lang.Object r0 = r4.getKey()
            if (r0 != 0) goto L33
            goto L1c
        L12:
            java.lang.Object r2 = r4.getKey()
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L33
        L1c:
            java.lang.Object r3 = r3.d0
            if (r3 != 0) goto L27
            java.lang.Object r3 = r4.getValue()
            if (r3 != 0) goto L33
            goto L31
        L27:
            java.lang.Object r4 = r4.getValue()
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L33
        L31:
            r3 = 1
            return r3
        L33:
            return r1
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object getKey() {
            r0 = this;
            java.lang.Object r0 = r0.Y
            return r0
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object getValue() {
            r0 = this;
            java.lang.Object r0 = r0.d0
            return r0
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
            r2 = this;
            r0 = 0
            java.lang.Object r1 = r2.Y
            if (r1 != 0) goto L7
            r1 = r0
            goto Lb
        L7:
            int r1 = r1.hashCode()
        Lb:
            java.lang.Object r2 = r2.d0
            if (r2 != 0) goto L10
            goto L14
        L10:
            int r0 = r2.hashCode()
        L14:
            r2 = r1 ^ r0
            return r2
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object setValue(java.lang.Object r2) {
            r1 = this;
            if (r2 != 0) goto Le
            boolean r0 = r1.Z
            if (r0 == 0) goto L7
            goto Le
        L7:
            java.lang.String r1 = "value == null"
            defpackage.u34.x(r1)
            r1 = 0
            return r1
        Le:
            java.lang.Object r0 = r1.d0
            r1.d0 = r2
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Object r1 = r2.Y
            r0.append(r1)
            java.lang.String r1 = "="
            r0.append(r1)
            java.lang.Object r2 = r2.d0
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
