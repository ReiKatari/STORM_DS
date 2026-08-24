package com.google.android.gms.common.internal;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class ClientIdentity extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.common.internal.ClientIdentity> CREATOR = null;
    public final java.lang.String packageName;
    public final int uid;

    static {
            com.google.android.gms.common.internal.zaa r0 = new com.google.android.gms.common.internal.zaa
            r0.<init>()
            com.google.android.gms.common.internal.ClientIdentity.CREATOR = r0
            return
    }

    public ClientIdentity(int r1, java.lang.String r2) {
            r0 = this;
            r0.<init>()
            r0.uid = r1
            r0.packageName = r2
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.google.android.gms.common.internal.ClientIdentity
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.google.android.gms.common.internal.ClientIdentity r5 = (com.google.android.gms.common.internal.ClientIdentity) r5
            int r1 = r5.uid
            int r3 = r4.uid
            if (r1 != r3) goto L1d
            java.lang.String r5 = r5.packageName
            java.lang.String r4 = r4.packageName
            boolean r4 = com.google.android.gms.common.internal.Objects.equal(r5, r4)
            if (r4 == 0) goto L1d
            return r0
        L1d:
            return r2
    }

    public final int hashCode() {
            r0 = this;
            int r0 = r0.uid
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = r2.uid
            r0.append(r1)
            java.lang.String r1 = ":"
            r0.append(r1)
            java.lang.String r2 = r2.packageName
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r3, int r4) {
            r2 = this;
            int r4 = r2.uid
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r3)
            r1 = 1
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r3, r1, r4)
            java.lang.String r2 = r2.packageName
            r4 = 0
            r1 = 2
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r3, r1, r2, r4)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r3, r0)
            return
    }
}
