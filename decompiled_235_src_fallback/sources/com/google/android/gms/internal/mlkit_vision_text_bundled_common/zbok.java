package com.google.android.gms.internal.mlkit_vision_text_bundled_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zbok extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbok> CREATOR = null;
    private final java.lang.String zba;
    private final java.util.List zbb;

    static {
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbol r0 = new com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbol
            r0.<init>()
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbok.CREATOR = r0
            return
    }

    public zbok(java.lang.String r1, java.util.List r2) {
            r0 = this;
            r0.<init>()
            r0.zba = r1
            r0.zbb = r2
            return
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r4, int r5) {
            r3 = this;
            java.lang.String r5 = r3.zba
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r4)
            r1 = 1
            r2 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r4, r1, r5, r2)
            r5 = 2
            java.util.List r3 = r3.zbb
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(r4, r5, r3, r2)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r4, r0)
            return
    }
}
