package androidx.versionedparcelable;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class ParcelImpl implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<androidx.versionedparcelable.ParcelImpl> CREATOR = null;
    public final defpackage.fm7 A;

    static {
            y8 r0 = new y8
            r1 = 23
            r0.<init>(r1)
            androidx.versionedparcelable.ParcelImpl.CREATOR = r0
            return
    }

    public ParcelImpl(android.os.Parcel r2) {
            r1 = this;
            r1.<init>()
            em7 r0 = new em7
            r0.<init>(r2)
            fm7 r2 = r0.g()
            r1.A = r2
            return
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            em7 r2 = new em7
            r2.<init>(r1)
            fm7 r0 = r0.A
            r2.i(r0)
            return
    }
}
