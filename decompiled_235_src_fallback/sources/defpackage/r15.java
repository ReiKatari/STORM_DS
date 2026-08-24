package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: r15  reason: default package */
/* loaded from: classes.dex */
public final class r15 extends defpackage.v05 {
    public static final android.os.Parcelable.Creator<defpackage.r15> CREATOR = null;
    public final int A;

    static {
            y8 r0 = new y8
            r1 = 28
            r0.<init>(r1)
            defpackage.r15.CREATOR = r0
            return
    }

    public r15(int r2) {
            r1 = this;
            android.view.AbsSavedState r0 = android.view.AbsSavedState.EMPTY_STATE
            r1.<init>(r0)
            r1.A = r2
            return
    }

    public r15(android.os.Parcel r1) {
            r0 = this;
            r0.<init>(r1)
            int r1 = r1.readInt()
            r0.A = r1
            return
    }

    @Override // android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            super.writeToParcel(r1, r2)
            int r0 = r0.A
            r1.writeInt(r0)
            return
    }
}
