package qa;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class y extends i6.b {
    public static final Parcelable.Creator<y> CREATOR = new z2.o(9);
    public CharSequence L;
    public boolean R;

    public y(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.L = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.R = parcel.readInt() == 1;
    }

    public final String toString() {
        return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.L) + "}";
    }

    @Override // i6.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        TextUtils.writeToParcel(this.L, parcel, i2);
        parcel.writeInt(this.R ? 1 : 0);
    }
}
