package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: yq6  reason: default package */
/* loaded from: classes.dex */
public final class yq6 extends r {
    public static final Parcelable.Creator<yq6> CREATOR = new wa6(5);
    public CharSequence L;
    public boolean R;

    public yq6(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.L = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.R = parcel.readInt() == 1;
    }

    public final String toString() {
        return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.L) + "}";
    }

    @Override // defpackage.r, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        TextUtils.writeToParcel(this.L, parcel, i);
        parcel.writeInt(this.R ? 1 : 0);
    }
}
