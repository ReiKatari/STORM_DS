package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: g87  reason: default package */
/* loaded from: classes.dex */
public final class g87 extends defpackage.s {
    public static final android.os.Parcelable.Creator<defpackage.g87> CREATOR = null;
    public int L;
    public boolean R;

    static {
            us4 r0 = new us4
            r1 = 6
            r0.<init>(r1)
            defpackage.g87.CREATOR = r0
            return
    }

    public g87(android.os.Parcel r1, java.lang.ClassLoader r2) {
            r0 = this;
            r0.<init>(r1, r2)
            int r2 = r1.readInt()
            r0.L = r2
            int r1 = r1.readInt()
            if (r1 == 0) goto L11
            r1 = 1
            goto L12
        L11:
            r1 = 0
        L12:
            r0.R = r1
            return
    }

    @Override // defpackage.s, android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            super.writeToParcel(r1, r2)
            int r2 = r0.L
            r1.writeInt(r2)
            boolean r0 = r0.R
            r1.writeInt(r0)
            return
    }
}
