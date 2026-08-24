package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: w28  reason: default package */
/* loaded from: classes.dex */
public abstract class w28 {
    public static final /* synthetic */ int a = 0;

    static {
            java.lang.Class<w28> r0 = defpackage.w28.class
            r0.getClassLoader()
            return
    }

    public static android.os.Parcelable a(android.os.Parcel r1, android.os.Parcelable.Creator r2) {
            int r0 = r1.readInt()
            if (r0 != 0) goto L8
            r1 = 0
            return r1
        L8:
            java.lang.Object r1 = r2.createFromParcel(r1)
            android.os.Parcelable r1 = (android.os.Parcelable) r1
            return r1
    }

    public static void b(android.os.Parcel r2) {
            int r2 = r2.dataAvail()
            if (r2 > 0) goto L7
            return
        L7:
            android.os.BadParcelableException r0 = new android.os.BadParcelableException
            java.lang.String r1 = "Parcel data not fully consumed, unread size: "
            java.lang.String r2 = defpackage.lb1.g(r2, r1)
            r0.<init>(r2)
            throw r0
    }

    public static void c(android.os.Parcel r2, android.os.Parcelable r3) {
            r0 = 0
            if (r3 != 0) goto L7
            r2.writeInt(r0)
            return
        L7:
            r1 = 1
            r2.writeInt(r1)
            r3.writeToParcel(r2, r0)
            return
    }

    public static void d(android.os.Parcel r0, android.os.IInterface r1) {
            if (r1 != 0) goto L7
            r1 = 0
            r0.writeStrongBinder(r1)
            return
        L7:
            android.os.IBinder r1 = r1.asBinder()
            r0.writeStrongBinder(r1)
            return
    }
}
