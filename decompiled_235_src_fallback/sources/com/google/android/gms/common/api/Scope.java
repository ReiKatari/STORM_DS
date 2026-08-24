package com.google.android.gms.common.api;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class Scope extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.common.api.Scope> CREATOR = null;
    final int zza;
    private final java.lang.String zzb;

    static {
            com.google.android.gms.common.api.zza r0 = new com.google.android.gms.common.api.zza
            r0.<init>()
            com.google.android.gms.common.api.Scope.CREATOR = r0
            return
    }

    public Scope(int r2, java.lang.String r3) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "scopeUri must not be null or empty"
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r3, r0)
            r1.zza = r2
            r1.zzb = r3
            return
    }

    public Scope(java.lang.String r2) {
            r1 = this;
            r0 = 1
            r1.<init>(r0, r2)
            return
    }

    public boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r1 != r2) goto L4
            r1 = 1
            return r1
        L4:
            boolean r0 = r2 instanceof com.google.android.gms.common.api.Scope
            if (r0 != 0) goto La
            r1 = 0
            return r1
        La:
            java.lang.String r1 = r1.zzb
            com.google.android.gms.common.api.Scope r2 = (com.google.android.gms.common.api.Scope) r2
            java.lang.String r2 = r2.zzb
            boolean r1 = r1.equals(r2)
            return r1
    }

    public java.lang.String getScopeUri() {
            r0 = this;
            java.lang.String r0 = r0.zzb
            return r0
    }

    public int hashCode() {
            r0 = this;
            java.lang.String r0 = r0.zzb
            int r0 = r0.hashCode()
            return r0
    }

    public java.lang.String toString() {
            r0 = this;
            java.lang.String r0 = r0.zzb
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r3, int r4) {
            r2 = this;
            int r4 = r2.zza
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r3)
            r1 = 1
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r3, r1, r4)
            java.lang.String r2 = r2.getScopeUri()
            r4 = 0
            r1 = 2
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r3, r1, r2, r4)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r3, r0)
            return
    }
}
