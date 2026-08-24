package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mx5  reason: default package */
/* loaded from: classes.dex */
public final class mx5 implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<defpackage.mx5> CREATOR = null;
    public final java.lang.String A;
    public final int B;
    public final java.lang.String L;
    public final java.lang.String R;
    public final boolean X;

    static {
            y8 r0 = new y8
            r1 = 29
            r0.<init>(r1)
            defpackage.mx5.CREATOR = r0
            return
    }

    public mx5(java.lang.String r1, int r2, java.lang.String r3, java.lang.String r4, boolean r5) {
            r0 = this;
            r1.getClass()
            r3.getClass()
            r4.getClass()
            r0.<init>()
            r0.A = r1
            r0.B = r2
            r0.L = r3
            r0.R = r4
            r0.X = r5
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
            r1.getClass()
            java.lang.String r2 = r0.A
            r1.writeString(r2)
            int r2 = r0.B
            r1.writeInt(r2)
            java.lang.String r2 = r0.L
            r1.writeString(r2)
            java.lang.String r2 = r0.R
            r1.writeString(r2)
            boolean r0 = r0.X
            r1.writeInt(r0)
            return
    }
}
