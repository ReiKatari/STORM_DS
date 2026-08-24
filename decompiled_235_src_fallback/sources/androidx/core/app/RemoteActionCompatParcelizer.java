package androidx.core.app;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public RemoteActionCompatParcelizer() {
            r0 = this;
            r0.<init>()
            return
    }

    public static androidx.core.app.RemoteActionCompat read(defpackage.dm7 r5) {
            androidx.core.app.RemoteActionCompat r0 = new androidx.core.app.RemoteActionCompat
            r0.<init>()
            androidx.core.graphics.drawable.IconCompat r1 = r0.a
            r2 = 1
            boolean r3 = r5.e(r2)
            if (r3 != 0) goto Lf
            goto L13
        Lf:
            fm7 r1 = r5.g()
        L13:
            androidx.core.graphics.drawable.IconCompat r1 = (androidx.core.graphics.drawable.IconCompat) r1
            r0.a = r1
            java.lang.CharSequence r1 = r0.b
            r3 = 2
            boolean r3 = r5.e(r3)
            if (r3 != 0) goto L21
            goto L2e
        L21:
            r1 = r5
            em7 r1 = (defpackage.em7) r1
            android.os.Parcelable$Creator r3 = android.text.TextUtils.CHAR_SEQUENCE_CREATOR
            android.os.Parcel r1 = r1.e
            java.lang.Object r1 = r3.createFromParcel(r1)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
        L2e:
            r0.b = r1
            java.lang.CharSequence r1 = r0.c
            r3 = 3
            boolean r3 = r5.e(r3)
            if (r3 != 0) goto L3a
            goto L47
        L3a:
            r1 = r5
            em7 r1 = (defpackage.em7) r1
            android.os.Parcelable$Creator r3 = android.text.TextUtils.CHAR_SEQUENCE_CREATOR
            android.os.Parcel r1 = r1.e
            java.lang.Object r1 = r3.createFromParcel(r1)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
        L47:
            r0.c = r1
            android.app.PendingIntent r1 = r0.d
            r3 = 4
            android.os.Parcelable r1 = r5.f(r1, r3)
            android.app.PendingIntent r1 = (android.app.PendingIntent) r1
            r0.d = r1
            boolean r1 = r0.e
            r3 = 5
            boolean r3 = r5.e(r3)
            r4 = 0
            if (r3 != 0) goto L5f
            goto L6d
        L5f:
            r1 = r5
            em7 r1 = (defpackage.em7) r1
            android.os.Parcel r1 = r1.e
            int r1 = r1.readInt()
            if (r1 == 0) goto L6c
            r1 = r2
            goto L6d
        L6c:
            r1 = r4
        L6d:
            r0.e = r1
            boolean r1 = r0.f
            r3 = 6
            boolean r3 = r5.e(r3)
            if (r3 != 0) goto L7a
            r2 = r1
            goto L86
        L7a:
            em7 r5 = (defpackage.em7) r5
            android.os.Parcel r5 = r5.e
            int r5 = r5.readInt()
            if (r5 == 0) goto L85
            goto L86
        L85:
            r2 = r4
        L86:
            r0.f = r2
            return r0
    }

    public static void write(androidx.core.app.RemoteActionCompat r4, defpackage.dm7 r5) {
            r5.getClass()
            androidx.core.graphics.drawable.IconCompat r0 = r4.a
            r1 = 1
            r5.h(r1)
            r5.i(r0)
            java.lang.CharSequence r0 = r4.b
            r1 = 2
            r5.h(r1)
            r1 = r5
            em7 r1 = (defpackage.em7) r1
            android.os.Parcel r1 = r1.e
            r2 = 0
            android.text.TextUtils.writeToParcel(r0, r1, r2)
            java.lang.CharSequence r0 = r4.c
            r3 = 3
            r5.h(r3)
            android.text.TextUtils.writeToParcel(r0, r1, r2)
            android.app.PendingIntent r0 = r4.d
            r3 = 4
            r5.h(r3)
            r1.writeParcelable(r0, r2)
            boolean r0 = r4.e
            r2 = 5
            r5.h(r2)
            r1.writeInt(r0)
            boolean r4 = r4.f
            r0 = 6
            r5.h(r0)
            r1.writeInt(r4)
            return
    }
}
