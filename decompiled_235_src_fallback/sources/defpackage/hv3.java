package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hv3  reason: default package */
/* loaded from: classes.dex */
public final class hv3 implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<defpackage.hv3> CREATOR = null;
    public int A;
    public int B;
    public boolean L;

    static {
            y8 r0 = new y8
            r1 = 16
            r0.<init>(r1)
            defpackage.hv3.CREATOR = r0
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
            int r2 = r0.A
            r1.writeInt(r2)
            int r2 = r0.B
            r1.writeInt(r2)
            boolean r0 = r0.L
            r1.writeInt(r0)
            return
    }
}
