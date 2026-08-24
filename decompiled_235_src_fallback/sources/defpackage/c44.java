package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: c44  reason: default package */
/* loaded from: classes.dex */
public final class c44 implements android.os.Parcelable {
    @java.lang.Deprecated
    public static final android.os.Parcelable.Creator<defpackage.c44> CREATOR = null;
    public final java.lang.String A;
    public final java.util.Map B;

    static {
            y8 r0 = new y8
            r1 = 19
            r0.<init>(r1)
            defpackage.c44.CREATOR = r0
            return
    }

    public /* synthetic */ c44(java.lang.String r2) {
            r1 = this;
            zt1 r0 = defpackage.zt1.A
            r1.<init>(r2, r0)
            return
    }

    public c44(java.lang.String r1, java.util.Map r2) {
            r0 = this;
            r0.<init>()
            r0.A = r1
            r0.B = r2
            return
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
            r0 = this;
            r0 = 0
            return r0
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof defpackage.c44
            if (r1 == 0) goto L1f
            c44 r4 = (defpackage.c44) r4
            java.lang.String r1 = r4.A
            java.lang.String r2 = r3.A
            boolean r1 = defpackage.nb3.k(r2, r1)
            if (r1 == 0) goto L1f
            java.util.Map r3 = r3.B
            java.util.Map r4 = r4.B
            boolean r3 = defpackage.nb3.k(r3, r4)
            if (r3 == 0) goto L1f
            return r0
        L1f:
            r3 = 0
            return r3
    }

    public final int hashCode() {
            r1 = this;
            java.lang.String r0 = r1.A
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.util.Map r1 = r1.B
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Key(key="
            r0.<init>(r1)
            java.lang.String r1 = r2.A
            r0.append(r1)
            java.lang.String r1 = ", extras="
            r0.append(r1)
            java.util.Map r2 = r2.B
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r2, int r3) {
            r1 = this;
            java.lang.String r3 = r1.A
            r2.writeString(r3)
            java.util.Map r1 = r1.B
            int r3 = r1.size()
            r2.writeInt(r3)
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L16:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L35
            java.lang.Object r3 = r1.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r0 = r3.getKey()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r3 = r3.getValue()
            java.lang.String r3 = (java.lang.String) r3
            r2.writeString(r0)
            r2.writeString(r3)
            goto L16
        L35:
            return
    }
}
