package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yo6  reason: default package */
/* loaded from: classes.dex */
public final class yo6 implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<defpackage.yo6> CREATOR = null;
    public int A;
    public int B;
    public int L;
    public int[] R;
    public int X;
    public int[] Y;
    public java.util.ArrayList Z;
    public boolean d0;
    public boolean e0;
    public boolean f0;

    static {
            b96 r0 = new b96
            r1 = 2
            r0.<init>(r1)
            defpackage.yo6.CREATOR = r0
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
            int r2 = r0.L
            r1.writeInt(r2)
            int r2 = r0.L
            if (r2 <= 0) goto L18
            int[] r2 = r0.R
            r1.writeIntArray(r2)
        L18:
            int r2 = r0.X
            r1.writeInt(r2)
            int r2 = r0.X
            if (r2 <= 0) goto L26
            int[] r2 = r0.Y
            r1.writeIntArray(r2)
        L26:
            boolean r2 = r0.d0
            r1.writeInt(r2)
            boolean r2 = r0.e0
            r1.writeInt(r2)
            boolean r2 = r0.f0
            r1.writeInt(r2)
            java.util.ArrayList r0 = r0.Z
            r1.writeList(r0)
            return
    }
}
