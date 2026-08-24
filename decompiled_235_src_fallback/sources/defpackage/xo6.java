package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xo6  reason: default package */
/* loaded from: classes.dex */
public final class xo6 implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<defpackage.xo6> CREATOR = null;
    public int A;
    public int B;
    public int[] L;
    public boolean R;

    static {
            b96 r0 = new b96
            r1 = 1
            r0.<init>(r1)
            defpackage.xo6.CREATOR = r0
            return
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
            r0 = this;
            r0 = 0
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "FullSpanItem{mPosition="
            r0.<init>(r1)
            int r1 = r2.A
            r0.append(r1)
            java.lang.String r1 = ", mGapDir="
            r0.append(r1)
            int r1 = r2.B
            r0.append(r1)
            java.lang.String r1 = ", mHasUnwantedGapAfter="
            r0.append(r1)
            boolean r1 = r2.R
            r0.append(r1)
            java.lang.String r1 = ", mGapPerSpan="
            r0.append(r1)
            int[] r2 = r2.L
            java.lang.String r2 = java.util.Arrays.toString(r2)
            r0.append(r2)
            r2 = 125(0x7d, float:1.75E-43)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r2, int r3) {
            r1 = this;
            int r3 = r1.A
            r2.writeInt(r3)
            int r3 = r1.B
            r2.writeInt(r3)
            boolean r3 = r1.R
            r2.writeInt(r3)
            int[] r3 = r1.L
            if (r3 == 0) goto L20
            int r0 = r3.length
            if (r0 <= 0) goto L20
            int r3 = r3.length
            r2.writeInt(r3)
            int[] r1 = r1.L
            r2.writeIntArray(r1)
            return
        L20:
            r1 = 0
            r2.writeInt(r1)
            return
    }
}
