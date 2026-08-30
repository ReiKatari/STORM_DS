package k9;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;
import nc.k;
import q.m0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a implements Parcelable {
    @Deprecated
    public static final Parcelable.Creator<a> CREATOR = new m0(1);
    public final String A;
    public final Map B;

    public a(String str, Map map) {
        this.A = str;
        this.B = map;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (k.a(this.A, aVar.A) && k.a(this.B, aVar.B)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.B.hashCode() + (this.A.hashCode() * 31);
    }

    public final String toString() {
        return "Key(key=" + this.A + ", extras=" + this.B + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.A);
        Map map = this.B;
        parcel.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
    }
}
