package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: il2  reason: default package */
/* loaded from: classes.dex */
public final class il2 implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<defpackage.il2> CREATOR = null;
    public java.lang.String A;
    public int B;

    static {
            y8 r0 = new y8
            r1 = 11
            r0.<init>(r1)
            defpackage.il2.CREATOR = r0
            return
    }

    public il2(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.A = r1
            r0.B = r2
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
            java.lang.String r2 = r0.A
            r1.writeString(r2)
            int r0 = r0.B
            r1.writeInt(r0)
            return
    }
}
