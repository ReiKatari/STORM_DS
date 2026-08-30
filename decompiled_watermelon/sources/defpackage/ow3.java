package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ow3  reason: default package */
/* loaded from: classes.dex */
public final class ow3 implements Parcelable {
    @Deprecated
    public static final Parcelable.Creator<ow3> CREATOR = new x8(19);
    public final String A;
    public final Map B;

    public ow3(String str, Map map) {
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
        if (obj instanceof ow3) {
            ow3 ow3Var = (ow3) obj;
            if (b53.x(this.A, ow3Var.A) && b53.x(this.B, ow3Var.B)) {
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

    public /* synthetic */ ow3(String str) {
        this(str, qp1.A);
    }
}
