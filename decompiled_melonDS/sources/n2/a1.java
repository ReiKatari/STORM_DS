package n2;

import android.os.Parcel;
import android.os.Parcelable;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a1 implements Parcelable.Creator {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f9873a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f9873a) {
            case 0:
                return new b1(parcel.readFloat());
            case DSiCameraSource.FrontCamera /* 1 */:
                return new c1(parcel.readInt());
            default:
                return new d1(parcel.readLong());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i2) {
        switch (this.f9873a) {
            case 0:
                return new b1[i2];
            case DSiCameraSource.FrontCamera /* 1 */:
                return new c1[i2];
            default:
                return new d1[i2];
        }
    }
}
