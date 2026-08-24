package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: j60  reason: default package */
/* loaded from: classes.dex */
public final class j60 extends defpackage.s {
    public static final android.os.Parcelable.Creator<defpackage.j60> CREATOR = null;
    public final int L;
    public final int R;
    public final boolean X;
    public final boolean Y;
    public final boolean Z;

    static {
            lm6 r0 = new lm6
            r1 = 1
            r0.<init>(r1)
            defpackage.j60.CREATOR = r0
            return
    }

    public j60(android.os.Parcel r3, java.lang.ClassLoader r4) {
            r2 = this;
            r2.<init>(r3, r4)
            int r4 = r3.readInt()
            r2.L = r4
            int r4 = r3.readInt()
            r2.R = r4
            int r4 = r3.readInt()
            r0 = 0
            r1 = 1
            if (r4 != r1) goto L19
            r4 = r1
            goto L1a
        L19:
            r4 = r0
        L1a:
            r2.X = r4
            int r4 = r3.readInt()
            if (r4 != r1) goto L24
            r4 = r1
            goto L25
        L24:
            r4 = r0
        L25:
            r2.Y = r4
            int r3 = r3.readInt()
            if (r3 != r1) goto L2e
            r0 = r1
        L2e:
            r2.Z = r0
            return
    }

    public j60(com.google.android.material.bottomsheet.BottomSheetBehavior r2) {
            r1 = this;
            android.view.AbsSavedState r0 = android.view.AbsSavedState.EMPTY_STATE
            r1.<init>(r0)
            int r0 = r2.N
            r1.L = r0
            int r0 = r2.e
            r1.R = r0
            boolean r0 = r2.b
            r1.X = r0
            boolean r0 = r2.I
            r1.Y = r0
            boolean r2 = r2.J
            r1.Z = r2
            return
    }

    @Override // defpackage.s, android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            super.writeToParcel(r1, r2)
            int r2 = r0.L
            r1.writeInt(r2)
            int r2 = r0.R
            r1.writeInt(r2)
            boolean r2 = r0.X
            r1.writeInt(r2)
            boolean r2 = r0.Y
            r1.writeInt(r2)
            boolean r0 = r0.Z
            r1.writeInt(r0)
            return
    }
}
