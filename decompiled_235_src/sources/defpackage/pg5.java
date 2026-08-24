package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: pg5  reason: default package */
/* loaded from: classes.dex */
public final class pg5 extends s {
    public static final Parcelable.Creator<pg5> CREATOR = new us4(4);
    public Parcelable L;

    public pg5(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.L = parcel.readParcelable(classLoader == null ? gg5.class.getClassLoader() : classLoader);
    }

    @Override // defpackage.s, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.L, 0);
    }
}
