package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: tk2  reason: default package */
/* loaded from: classes.dex */
public final class tk2 implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<defpackage.tk2> CREATOR = null;
    public final android.os.Bundle A;

    static {
            us4 r0 = new us4
            r1 = 3
            r0.<init>(r1)
            defpackage.tk2.CREATOR = r0
            return
    }

    public tk2(android.os.Parcel r1, java.lang.ClassLoader r2) {
            r0 = this;
            r0.<init>()
            android.os.Bundle r1 = r1.readBundle()
            r0.A = r1
            if (r2 == 0) goto L10
            if (r1 == 0) goto L10
            r1.setClassLoader(r2)
        L10:
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
            android.os.Bundle r0 = r0.A
            r1.writeBundle(r0)
            return
    }
}
