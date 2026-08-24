package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: cq0  reason: default package */
/* loaded from: classes.dex */
public final class cq0 extends defpackage.s {
    public static final android.os.Parcelable.Creator<defpackage.cq0> CREATOR = null;
    public boolean L;

    static {
            us4 r0 = new us4
            r1 = 2
            r0.<init>(r1)
            defpackage.cq0.CREATOR = r0
            return
    }

    public cq0(android.os.Parcel r1, java.lang.ClassLoader r2) {
            r0 = this;
            r0.<init>(r1, r2)
            int r1 = r1.readInt()
            r2 = 1
            if (r1 != r2) goto Lb
            goto Lc
        Lb:
            r2 = 0
        Lc:
            r0.L = r2
            return
    }

    @Override // defpackage.s, android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            super.writeToParcel(r1, r2)
            boolean r0 = r0.L
            r1.writeInt(r0)
            return
    }
}
