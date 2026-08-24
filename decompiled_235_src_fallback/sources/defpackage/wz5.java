package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wz5  reason: default package */
/* loaded from: classes.dex */
public final class wz5 implements android.os.Parcelable {
    public static final defpackage.vz5 CREATOR = null;
    public defpackage.pq5 A;

    static {
            vz5 r0 = new vz5
            r0.<init>()
            defpackage.wz5.CREATOR = r0
            return
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r5, int r6) {
            r4 = this;
            r5.getClass()
            pq5 r4 = r4.A
            java.lang.String r6 = r4.a
            r5.writeString(r6)
            java.lang.String r6 = r4.b
            r5.writeString(r6)
            java.lang.String r6 = r4.c
            r5.writeString(r6)
            android.net.Uri r6 = r4.d
            java.lang.String r6 = r6.toString()
            r5.writeString(r6)
            android.net.Uri r6 = r4.e
            if (r6 == 0) goto L26
            java.lang.String r6 = r6.toString()
            goto L27
        L26:
            r6 = 0
        L27:
            r5.writeString(r6)
            java.util.Date r6 = r4.g
            r0 = -1
            if (r6 == 0) goto L35
            long r2 = r6.getTime()
            goto L36
        L35:
            r2 = r0
        L36:
            r5.writeLong(r2)
            qt5 r6 = new qt5
            jt5 r2 = r4.f
            r6.<init>(r2)
            r2 = 0
            r5.writeParcelable(r6, r2)
            boolean r6 = r4.h
            r5.writeInt(r6)
            java.lang.String r6 = r4.i
            r5.writeString(r6)
            long r2 = r4.j
            long r2 = defpackage.oq1.e(r2)
            r5.writeLong(r2)
            java.lang.Long r6 = r4.l
            if (r6 == 0) goto L5f
            long r0 = r6.longValue()
        L5f:
            r5.writeLong(r0)
            byte[] r4 = r4.m
            r5.writeByteArray(r4)
            return
    }
}
