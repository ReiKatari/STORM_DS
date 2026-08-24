package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: z8  reason: default package */
/* loaded from: classes.dex */
public final class z8 implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<defpackage.z8> CREATOR = null;
    public final int A;
    public final android.content.Intent B;

    static {
            y8 r0 = new y8
            r1 = 0
            r0.<init>(r1)
            defpackage.z8.CREATOR = r0
            return
    }

    public z8(android.content.Intent r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.A = r2
            r0.B = r1
            return
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
            r0 = this;
            r0 = 0
            return r0
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ActivityResult{resultCode="
            r0.<init>(r1)
            r1 = -1
            int r2 = r3.A
            if (r2 == r1) goto L16
            if (r2 == 0) goto L13
            java.lang.String r1 = java.lang.String.valueOf(r2)
            goto L18
        L13:
            java.lang.String r1 = "RESULT_CANCELED"
            goto L18
        L16:
            java.lang.String r1 = "RESULT_OK"
        L18:
            r0.append(r1)
            java.lang.String r1 = ", data="
            r0.append(r1)
            android.content.Intent r3 = r3.B
            r0.append(r3)
            r3 = 125(0x7d, float:1.75E-43)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r2, int r3) {
            r1 = this;
            r2.getClass()
            int r0 = r1.A
            r2.writeInt(r0)
            android.content.Intent r1 = r1.B
            if (r1 != 0) goto Le
            r0 = 0
            goto Lf
        Le:
            r0 = 1
        Lf:
            r2.writeInt(r0)
            if (r1 == 0) goto L17
            r1.writeToParcel(r2, r3)
        L17:
            return
    }
}
