package eg;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.UUID;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class e implements Parcelable {
    public static final d CREATOR = new Object();
    public final af.a A;

    public e(Parcel parcel) {
        UUID uuid;
        af.f fVar = (af.f) ((fc.b) af.f.getEntries()).get(parcel.readInt());
        af.h hVar = (af.h) ((fc.b) af.h.getEntries()).get(parcel.readInt());
        String readString = parcel.readString();
        if (readString != null) {
            uuid = UUID.fromString(readString);
        } else {
            uuid = null;
        }
        UUID uuid2 = uuid;
        Parcelable v10 = p7.a.v(parcel, g.class.getClassLoader(), g.class);
        v10.getClass();
        this.A = new af.a(fVar, hVar, uuid2, ((g) v10).A, parcel.readString());
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        String str;
        parcel.getClass();
        af.a aVar = this.A;
        parcel.writeInt(aVar.f707a.ordinal());
        parcel.writeInt(aVar.f708b.ordinal());
        UUID uuid = aVar.f709c;
        if (uuid != null) {
            str = uuid.toString();
        } else {
            str = null;
        }
        parcel.writeString(str);
        parcel.writeParcelable(new g(aVar.f710d), 0);
        parcel.writeString(aVar.f711e);
    }

    public e(af.a aVar) {
        aVar.getClass();
        this.A = aVar;
    }
}
