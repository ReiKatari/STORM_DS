package h;

import a8.l;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new l(24);
    public final int A;
    public final Intent B;

    public a(Intent intent, int i2) {
        this.A = i2;
        this.B = intent;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("ActivityResult{resultCode=");
        int i2 = this.A;
        if (i2 != -1) {
            if (i2 != 0) {
                str = String.valueOf(i2);
            } else {
                str = "RESULT_CANCELED";
            }
        } else {
            str = "RESULT_OK";
        }
        sb2.append(str);
        sb2.append(", data=");
        sb2.append(this.B);
        sb2.append('}');
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int i10;
        parcel.getClass();
        parcel.writeInt(this.A);
        Intent intent = this.B;
        if (intent == null) {
            i10 = 0;
        } else {
            i10 = 1;
        }
        parcel.writeInt(i10);
        if (intent != null) {
            intent.writeToParcel(parcel, i2);
        }
    }
}
