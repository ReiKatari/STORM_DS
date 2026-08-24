package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: dc1  reason: default package */
/* loaded from: classes.dex */
public final class dc1 implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<defpackage.dc1> CREATOR = null;
    public final long A;

    static {
            y8 r0 = new y8
            r1 = 8
            r0.<init>(r1)
            defpackage.dc1.CREATOR = r0
            return
    }

    public dc1(long r1) {
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

    public final boolean equals(java.lang.Object r6) {
            r5 = this;
            r0 = 1
            if (r5 != r6) goto L4
            return r0
        L4:
            boolean r1 = r6 instanceof defpackage.dc1
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            dc1 r6 = (defpackage.dc1) r6
            long r3 = r5.A
            long r5 = r6.A
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 != 0) goto L15
            return r0
        L15:
            return r2
    }

    public final int hashCode() {
            r2 = this;
            long r0 = r2.A
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            int r2 = java.util.Arrays.hashCode(r2)
            return r2
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r3, int r4) {
            r2 = this;
            long r0 = r2.A
            r3.writeLong(r0)
            return
    }
}
