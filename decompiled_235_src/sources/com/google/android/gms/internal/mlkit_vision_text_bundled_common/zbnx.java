package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zbnx extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zbnx> CREATOR = new zbny();
    private final int zba;
    private final int zbb;
    private final int zbc;
    private final int zbd;
    private final long zbe;

    public zbnx(int i, int i2, int i3, int i4, long j) {
        this.zba = i;
        this.zbb = i2;
        this.zbc = i3;
        this.zbd = i4;
        this.zbe = j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zba);
        SafeParcelWriter.writeInt(parcel, 2, this.zbb);
        SafeParcelWriter.writeInt(parcel, 3, this.zbc);
        SafeParcelWriter.writeInt(parcel, 4, this.zbd);
        SafeParcelWriter.writeLong(parcel, 5, this.zbe);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final int zba() {
        return this.zbc;
    }

    public final int zbb() {
        return this.zba;
    }

    public final int zbc() {
        return this.zbd;
    }

    public final int zbd() {
        return this.zbb;
    }

    public final long zbe() {
        return this.zbe;
    }
}
