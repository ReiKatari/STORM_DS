package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: l00  reason: default package */
/* loaded from: classes.dex */
public final class l00 implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<defpackage.l00> CREATOR = null;
    public final java.util.ArrayList A;
    public final java.util.ArrayList B;

    static {
            y8 r0 = new y8
            r1 = 3
            r0.<init>(r1)
            defpackage.l00.CREATOR = r0
            return
    }

    public l00(android.os.Parcel r2) {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = r2.createStringArrayList()
            r1.A = r0
            android.os.Parcelable$Creator<androidx.fragment.app.b> r0 = androidx.fragment.app.b.CREATOR
            java.util.ArrayList r2 = r2.createTypedArrayList(r0)
            r1.B = r2
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
            java.util.ArrayList r2 = r0.A
            r1.writeStringList(r2)
            java.util.ArrayList r0 = r0.B
            r1.writeTypedList(r0)
            return
    }
}
