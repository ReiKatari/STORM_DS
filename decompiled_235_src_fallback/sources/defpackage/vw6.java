package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vw6  reason: default package */
/* loaded from: classes.dex */
public final class vw6 extends android.view.View.BaseSavedState {
    public static final android.os.Parcelable.Creator<defpackage.vw6> CREATOR = null;
    public final boolean A;

    static {
            b96 r0 = new b96
            r1 = 3
            r0.<init>(r1)
            defpackage.vw6.CREATOR = r0
            return
    }

    public vw6(android.os.Parcel r1) {
            r0 = this;
            r0.<init>(r1)
            byte r1 = r1.readByte()
            if (r1 == 0) goto Lb
            r1 = 1
            goto Lc
        Lb:
            r1 = 0
        Lc:
            r0.A = r1
            return
    }

    public vw6(android.os.Parcelable r1, boolean r2) {
            r0 = this;
            r0.<init>(r1)
            r0.A = r2
            return
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            super.writeToParcel(r1, r2)
            boolean r0 = r0.A
            r1.writeByte(r0)
            return
    }
}
