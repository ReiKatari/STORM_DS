package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ds  reason: default package */
/* loaded from: classes.dex */
public final class ds extends android.view.View.BaseSavedState {
    public static final android.os.Parcelable.Creator<defpackage.ds> CREATOR = null;
    public boolean A;

    static {
            y8 r0 = new y8
            r1 = 1
            r0.<init>(r1)
            defpackage.ds.CREATOR = r0
            return
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            super.writeToParcel(r1, r2)
            boolean r0 = r0.A
            byte r0 = (byte) r0
            r1.writeByte(r0)
            return
    }
}
