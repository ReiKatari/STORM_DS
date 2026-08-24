package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: z84  reason: default package */
/* loaded from: classes.dex */
public final class z84 extends defpackage.v05 {
    public static final android.os.Parcelable.Creator<defpackage.z84> CREATOR = null;
    public java.util.HashSet A;

    static {
            y8 r0 = new y8
            r1 = 21
            r0.<init>(r1)
            defpackage.z84.CREATOR = r0
            return
    }

    public z84() {
            r1 = this;
            android.view.AbsSavedState r0 = android.view.AbsSavedState.EMPTY_STATE
            r1.<init>(r0)
            return
    }

    public z84(android.os.Parcel r3) {
            r2 = this;
            r2.<init>(r3)
            int r0 = r3.readInt()
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            r2.A = r1
            java.lang.String[] r0 = new java.lang.String[r0]
            r3.readStringArray(r0)
            java.util.HashSet r2 = r2.A
            java.util.Collections.addAll(r2, r0)
            return
    }

    @Override // android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            super.writeToParcel(r1, r2)
            java.util.HashSet r2 = r0.A
            int r2 = r2.size()
            r1.writeInt(r2)
            java.util.HashSet r0 = r0.A
            int r2 = r0.size()
            java.lang.String[] r2 = new java.lang.String[r2]
            java.lang.Object[] r0 = r0.toArray(r2)
            java.lang.String[] r0 = (java.lang.String[]) r0
            r1.writeStringArray(r0)
            return
    }
}
