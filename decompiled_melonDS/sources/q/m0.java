package q;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import java.util.LinkedHashMap;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class m0 implements Parcelable.Creator {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f11955a;

    /* JADX WARN: Type inference failed for: r0v1, types: [android.view.View$BaseSavedState, java.lang.Object, q.n0] */
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        boolean z10;
        switch (this.f11955a) {
            case 0:
                ?? baseSavedState = new View.BaseSavedState(parcel);
                if (parcel.readByte() != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                baseSavedState.A = z10;
                return baseSavedState;
            default:
                String readString = parcel.readString();
                readString.getClass();
                int readInt = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(readInt);
                for (int i2 = 0; i2 < readInt; i2++) {
                    String readString2 = parcel.readString();
                    readString2.getClass();
                    String readString3 = parcel.readString();
                    readString3.getClass();
                    linkedHashMap.put(readString2, readString3);
                }
                return new k9.a(readString, linkedHashMap);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i2) {
        switch (this.f11955a) {
            case 0:
                return new n0[i2];
            default:
                return new k9.a[i2];
        }
    }
}
