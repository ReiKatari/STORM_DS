package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: oh6  reason: default package */
/* loaded from: classes.dex */
public final class oh6 extends defpackage.s {
    public static final android.os.Parcelable.Creator<defpackage.oh6> CREATOR = null;
    public final int L;

    static {
            us4 r0 = new us4
            r1 = 5
            r0.<init>(r1)
            defpackage.oh6.CREATOR = r0
            return
    }

    public oh6(android.os.Parcel r1, java.lang.ClassLoader r2) {
            r0 = this;
            r0.<init>(r1, r2)
            int r1 = r1.readInt()
            r0.L = r1
            return
    }

    public oh6(com.google.android.material.sidesheet.SideSheetBehavior r2) {
            r1 = this;
            android.view.AbsSavedState r0 = android.view.AbsSavedState.EMPTY_STATE
            r1.<init>(r0)
            int r2 = r2.h
            r1.L = r2
            return
    }

    @Override // defpackage.s, android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            super.writeToParcel(r1, r2)
            int r0 = r0.L
            r1.writeInt(r0)
            return
    }
}
