package com.google.mlkit.vision.common.internal;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class VisionImageMetadataParcel extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.mlkit.vision.common.internal.VisionImageMetadataParcel> CREATOR = null;
    public final int height;
    public final int rotation;
    public final long timestampMillis;
    public final int width;
    public final int zza;

    static {
            com.google.mlkit.vision.common.internal.zzg r0 = new com.google.mlkit.vision.common.internal.zzg
            r0.<init>()
            com.google.mlkit.vision.common.internal.VisionImageMetadataParcel.CREATOR = r0
            return
    }

    public VisionImageMetadataParcel(int r1, int r2, int r3, long r4, int r6) {
            r0 = this;
            r0.<init>()
            r0.width = r1
            r0.height = r2
            r0.zza = r3
            r0.timestampMillis = r4
            r0.rotation = r6
            return
    }

    public android.graphics.Matrix getUprightRotationMatrix() {
            r3 = this;
            com.google.mlkit.vision.common.internal.ImageUtils r0 = com.google.mlkit.vision.common.internal.ImageUtils.getInstance()
            int r1 = r3.width
            int r2 = r3.height
            int r3 = r3.rotation
            android.graphics.Matrix r3 = r0.getUprightRotationMatrix(r1, r2, r3)
            return r3
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r4, int r5) {
            r3 = this;
            int r5 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r4)
            r0 = 1
            int r1 = r3.width
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r4, r0, r1)
            r0 = 2
            int r1 = r3.height
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r4, r0, r1)
            r0 = 3
            int r1 = r3.zza
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r4, r0, r1)
            r0 = 4
            long r1 = r3.timestampMillis
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(r4, r0, r1)
            r0 = 5
            int r3 = r3.rotation
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r4, r0, r3)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r4, r5)
            return
    }
}
