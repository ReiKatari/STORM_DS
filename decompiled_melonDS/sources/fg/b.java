package fg;

import a8.l;
import android.os.Parcel;
import android.os.Parcelable;
import me.magnum.melonds.domain.model.Cheat;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new l(22);
    public final Long A;
    public final long B;
    public final String L;
    public final String R;
    public final String X;
    public final boolean Y;

    public b(Long l10, long j2, String str, String str2, String str3, boolean z10) {
        str.getClass();
        str3.getClass();
        this.A = l10;
        this.B = j2;
        this.L = str;
        this.R = str2;
        this.X = str3;
        this.Y = z10;
    }

    public final Cheat a() {
        return new Cheat(this.A, this.B, this.L, this.R, this.X, this.Y);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.getClass();
        Long l10 = this.A;
        if (l10 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l10.longValue());
        }
        parcel.writeLong(this.B);
        parcel.writeString(this.L);
        parcel.writeString(this.R);
        parcel.writeString(this.X);
        parcel.writeInt(this.Y ? 1 : 0);
    }
}
