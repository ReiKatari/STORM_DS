package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ml2  reason: default package */
/* loaded from: classes.dex */
public final class ml2 implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<defpackage.ml2> CREATOR = null;
    public java.util.ArrayList A;
    public java.util.ArrayList B;
    public androidx.fragment.app.b[] L;
    public int R;
    public java.lang.String X;
    public java.util.ArrayList Y;
    public java.util.ArrayList Z;
    public java.util.ArrayList d0;

    static {
            y8 r0 = new y8
            r1 = 12
            r0.<init>(r1)
            defpackage.ml2.CREATOR = r0
            return
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r2, int r3) {
            r1 = this;
            java.util.ArrayList r0 = r1.A
            r2.writeStringList(r0)
            java.util.ArrayList r0 = r1.B
            r2.writeStringList(r0)
            androidx.fragment.app.b[] r0 = r1.L
            r2.writeTypedArray(r0, r3)
            int r3 = r1.R
            r2.writeInt(r3)
            java.lang.String r3 = r1.X
            r2.writeString(r3)
            java.util.ArrayList r3 = r1.Y
            r2.writeStringList(r3)
            java.util.ArrayList r3 = r1.Z
            r2.writeTypedList(r3)
            java.util.ArrayList r1 = r1.d0
            r2.writeTypedList(r1)
            return
    }
}
