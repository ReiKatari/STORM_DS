package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: c96  reason: default package */
/* loaded from: classes.dex */
public final class c96 extends defpackage.v05 {
    public static final android.os.Parcelable.Creator<defpackage.c96> CREATOR = null;
    public int A;
    public int B;
    public int L;

    static {
            b96 r0 = new b96
            r1 = 0
            r0.<init>(r1)
            defpackage.c96.CREATOR = r0
            return
    }

    public c96() {
            r1 = this;
            android.view.AbsSavedState r0 = android.view.AbsSavedState.EMPTY_STATE
            r1.<init>(r0)
            return
    }

    public c96(android.os.Parcel r2) {
            r1 = this;
            r1.<init>(r2)
            int r0 = r2.readInt()
            r1.A = r0
            int r0 = r2.readInt()
            r1.B = r0
            int r2 = r2.readInt()
            r1.L = r2
            return
    }

    @Override // android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            super.writeToParcel(r1, r2)
            int r2 = r0.A
            r1.writeInt(r2)
            int r2 = r0.B
            r1.writeInt(r2)
            int r0 = r0.L
            r1.writeInt(r0)
            return
    }
}
