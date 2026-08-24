package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ie4  reason: default package */
/* loaded from: classes.dex */
public final class ie4 extends android.view.View.BaseSavedState {
    public static final android.os.Parcelable.Creator<defpackage.ie4> CREATOR = null;
    public int A;

    static {
            y8 r0 = new y8
            r1 = 22
            r0.<init>(r1)
            defpackage.ie4.CREATOR = r0
            return
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "HorizontalScrollView.SavedState{"
            r0.<init>(r1)
            int r1 = java.lang.System.identityHashCode(r2)
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
            java.lang.String r1 = " scrollPosition="
            r0.append(r1)
            int r2 = r2.A
            java.lang.String r1 = "}"
            java.lang.String r2 = defpackage.lb1.o(r0, r2, r1)
            return r2
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            super.writeToParcel(r1, r2)
            int r0 = r0.A
            r1.writeInt(r0)
            return
    }
}
