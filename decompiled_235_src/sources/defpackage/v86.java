package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: v86  reason: default package */
/* loaded from: classes.dex */
public final class v86 extends s {
    public static final Parcelable.Creator<v86> CREATOR = new lm6(4);
    public boolean L;

    public v86(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.L = ((Boolean) parcel.readValue(null)).booleanValue();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SearchView.SavedState{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" isIconified=");
        return i61.o(sb, this.L, "}");
    }

    @Override // defpackage.s, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeValue(Boolean.valueOf(this.L));
    }
}
