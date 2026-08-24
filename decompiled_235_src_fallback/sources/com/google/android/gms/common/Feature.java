package com.google.android.gms.common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class Feature extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.common.Feature> CREATOR = null;
    private final java.lang.String zza;
    @java.lang.Deprecated
    private final int zzb;
    private final long zzc;

    static {
            com.google.android.gms.common.zzc r0 = new com.google.android.gms.common.zzc
            r0.<init>()
            com.google.android.gms.common.Feature.CREATOR = r0
            return
    }

    public Feature(java.lang.String r1, int r2, long r3) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            return
    }

    public Feature(java.lang.String r1, long r2) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzc = r2
            r1 = -1
            r0.zzb = r1
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            boolean r0 = r5 instanceof com.google.android.gms.common.Feature
            r1 = 0
            if (r0 == 0) goto L35
            com.google.android.gms.common.Feature r5 = (com.google.android.gms.common.Feature) r5
            java.lang.String r0 = r4.getName()
            if (r0 == 0) goto L1b
            java.lang.String r0 = r4.getName()
            java.lang.String r2 = r5.getName()
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L27
        L1b:
            java.lang.String r0 = r4.getName()
            if (r0 != 0) goto L35
            java.lang.String r0 = r5.getName()
            if (r0 != 0) goto L35
        L27:
            long r2 = r4.getVersion()
            long r4 = r5.getVersion()
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 != 0) goto L35
            r4 = 1
            return r4
        L35:
            return r1
    }

    public java.lang.String getName() {
            r0 = this;
            java.lang.String r0 = r0.zza
            return r0
    }

    public long getVersion() {
            r4 = this;
            long r0 = r4.zzc
            r2 = -1
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 != 0) goto Lb
            int r4 = r4.zzb
            long r0 = (long) r4
        Lb:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.getName()
            long r1 = r3.getVersion()
            java.lang.Long r3 = java.lang.Long.valueOf(r1)
            java.lang.Object[] r3 = new java.lang.Object[]{r0, r3}
            int r3 = com.google.android.gms.common.internal.Objects.hashCode(r3)
            return r3
    }

    public final java.lang.String toString() {
            r3 = this;
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = com.google.android.gms.common.internal.Objects.toStringHelper(r3)
            java.lang.String r1 = "name"
            java.lang.String r2 = r3.getName()
            r0.add(r1, r2)
            long r1 = r3.getVersion()
            java.lang.Long r3 = java.lang.Long.valueOf(r1)
            java.lang.String r1 = "version"
            r0.add(r1, r3)
            java.lang.String r3 = r0.toString()
            return r3
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r4, int r5) {
            r3 = this;
            int r5 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r4)
            java.lang.String r0 = r3.getName()
            r1 = 0
            r2 = 1
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r4, r2, r0, r1)
            r0 = 2
            int r1 = r3.zzb
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r4, r0, r1)
            r0 = 3
            long r1 = r3.getVersion()
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(r4, r0, r1)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r4, r5)
            return
    }
}
