package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: n37  reason: default package */
/* loaded from: classes.dex */
public final class n37 extends s {
    public static final Parcelable.Creator<n37> CREATOR = new lm6(5);
    public CharSequence L;
    public boolean R;

    public n37(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.L = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.R = parcel.readInt() == 1;
    }

    public final String toString() {
        return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.L) + "}";
    }

    @Override // defpackage.s, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        TextUtils.writeToParcel(this.L, parcel, i);
        parcel.writeInt(this.R ? 1 : 0);
    }
}
