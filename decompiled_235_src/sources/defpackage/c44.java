package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: c44  reason: default package */
/* loaded from: classes.dex */
public final class c44 implements Parcelable {
    @Deprecated
    public static final Parcelable.Creator<c44> CREATOR = new y8(19);
    public final String A;
    public final Map B;

    public c44(String str, Map map) {
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
        if (obj instanceof c44) {
            c44 c44Var = (c44) obj;
            if (nb3.k(this.A, c44Var.A) && nb3.k(this.B, c44Var.B)) {
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
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A);
        Map map = this.B;
        parcel.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
    }

    public /* synthetic */ c44(String str) {
        this(str, zt1.A);
    }
}
