package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: y14  reason: default package */
/* loaded from: classes.dex */
public final class y14 extends s {
    public static final Parcelable.Creator<y14> CREATOR = new lm6(3);
    public boolean L;

    public y14(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        if (classLoader == null) {
            y14.class.getClassLoader();
        }
        this.L = parcel.readInt() == 1;
    }

    @Override // defpackage.s, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.L ? 1 : 0);
    }
}
