package eg;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import m9.o;
import nc.k;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class g implements Parcelable {
    public static final f CREATOR = new Object();
    public final a.a A;

    public g(Parcel parcel) {
        a.a aVar;
        Uri uri;
        int readInt = parcel.readInt();
        if (readInt != 0) {
            if (readInt != 1) {
                if (readInt != 2) {
                    if (readInt == 3) {
                        aVar = af.e.f716b;
                    } else {
                        o.v(w.d.l(readInt, "Unsupported GBA slot type: "));
                        throw null;
                    }
                } else {
                    aVar = af.c.f714b;
                }
            } else {
                String readString = parcel.readString();
                if (readString != null) {
                    uri = Uri.parse(readString);
                } else {
                    uri = null;
                }
                String readString2 = parcel.readString();
                aVar = new af.b(uri, readString2 != null ? Uri.parse(readString2) : null);
            }
        } else {
            aVar = af.d.f715b;
        }
        this.A = aVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        String str;
        parcel.getClass();
        a.a aVar = this.A;
        if (aVar instanceof af.d) {
            parcel.writeInt(0);
        } else if (aVar instanceof af.b) {
            parcel.writeInt(1);
            Uri uri = ((af.b) aVar).f712b;
            String str2 = null;
            if (uri != null) {
                str = uri.toString();
            } else {
                str = null;
            }
            parcel.writeString(str);
            Uri uri2 = ((af.b) aVar).f713c;
            if (uri2 != null) {
                str2 = uri2.toString();
            }
            parcel.writeString(str2);
        } else if (k.a(aVar, af.e.f716b)) {
            parcel.writeInt(3);
        } else if (aVar instanceof af.c) {
            parcel.writeInt(2);
        } else {
            o.o();
        }
    }

    public g(a.a aVar) {
        aVar.getClass();
        this.A = aVar;
    }
}
