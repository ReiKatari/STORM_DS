package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: pe1  reason: default package */
/* loaded from: classes.dex */
public final class pe1 implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<defpackage.pe1> CREATOR = null;
    public final int A;

    static {
            y8 r0 = new y8
            r1 = 9
            r0.<init>(r1)
            defpackage.pe1.CREATOR = r0
            return
    }

    public pe1(int r1) {
            r0 = this;
            r0.<init>()
            r0.A = r1
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
            boolean r1 = r4 instanceof defpackage.pe1
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            pe1 r4 = (defpackage.pe1) r4
            int r3 = r3.A
            int r4 = r4.A
            if (r3 == r4) goto L13
            return r2
        L13:
            return r0
    }

    public final int hashCode() {
            r0 = this;
            int r0 = r0.A
            int r0 = java.lang.Integer.hashCode(r0)
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "DefaultLazyKey(index="
            r0.<init>(r1)
            int r2 = r2.A
            r1 = 41
            java.lang.String r2 = defpackage.xg6.q(r0, r2, r1)
            return r2
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            int r0 = r0.A
            r1.writeInt(r0)
            return
    }
}
