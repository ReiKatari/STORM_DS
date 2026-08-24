package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: pg5  reason: default package */
/* loaded from: classes.dex */
public final class pg5 extends defpackage.s {
    public static final android.os.Parcelable.Creator<defpackage.pg5> CREATOR = null;
    public android.os.Parcelable L;

    static {
            us4 r0 = new us4
            r1 = 4
            r0.<init>(r1)
            defpackage.pg5.CREATOR = r0
            return
    }

    public pg5(android.os.Parcel r1, java.lang.ClassLoader r2) {
            r0 = this;
            r0.<init>(r1, r2)
            if (r2 == 0) goto L6
            goto Lc
        L6:
            java.lang.Class<gg5> r2 = defpackage.gg5.class
            java.lang.ClassLoader r2 = r2.getClassLoader()
        Lc:
            android.os.Parcelable r1 = r1.readParcelable(r2)
            r0.L = r1
            return
    }

    @Override // defpackage.s, android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            super.writeToParcel(r1, r2)
            android.os.Parcelable r0 = r0.L
            r2 = 0
            r1.writeParcelable(r0, r2)
            return
    }
}
