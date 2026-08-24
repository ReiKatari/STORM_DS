package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vc7  reason: default package */
/* loaded from: classes.dex */
public final class vc7 extends defpackage.v05 {
    public static final android.os.Parcelable.Creator<defpackage.vc7> CREATOR = null;
    public boolean A;

    static {
            b96 r0 = new b96
            r1 = 4
            r0.<init>(r1)
            defpackage.vc7.CREATOR = r0
            return
    }

    public vc7() {
            r1 = this;
            android.view.AbsSavedState r0 = android.view.AbsSavedState.EMPTY_STATE
            r1.<init>(r0)
            return
    }

    public vc7(android.os.Parcel r2) {
            r1 = this;
            r1.<init>(r2)
            int r2 = r2.readInt()
            r0 = 1
            if (r2 != r0) goto Lb
            goto Lc
        Lb:
            r0 = 0
        Lc:
            r1.A = r0
            return
    }

    @Override // android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            super.writeToParcel(r1, r2)
            boolean r0 = r0.A
            r1.writeInt(r0)
            return
    }
}
