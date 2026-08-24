package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: cz7  reason: default package */
/* loaded from: classes.dex */
public final class cz7 extends defpackage.v05 {
    public static final defpackage.bz7 CREATOR = null;
    public com.smp.masterswitchpreference.MasterSwitchPreferenceAttrs A;

    static {
            bz7 r0 = new bz7
            r0.<init>()
            defpackage.cz7.CREATOR = r0
            return
    }

    public cz7() {
            r1 = this;
            android.view.AbsSavedState r0 = android.view.AbsSavedState.EMPTY_STATE
            r1.<init>(r0)
            return
    }

    public cz7(android.os.Parcel r3) {
            r2 = this;
            r2.<init>(r3)
            java.lang.Class<cz7> r0 = defpackage.cz7.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            java.lang.Class<com.smp.masterswitchpreference.MasterSwitchPreferenceAttrs> r1 = com.smp.masterswitchpreference.MasterSwitchPreferenceAttrs.class
            android.os.Parcelable r3 = defpackage.xk2.H(r3, r0, r1)
            com.smp.masterswitchpreference.MasterSwitchPreferenceAttrs r3 = (com.smp.masterswitchpreference.MasterSwitchPreferenceAttrs) r3
            r2.A = r3
            return
    }

    @Override // android.view.AbsSavedState, android.os.Parcelable
    public final int describeContents() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            r1.getClass()
            super.writeToParcel(r1, r2)
            com.smp.masterswitchpreference.MasterSwitchPreferenceAttrs r0 = r0.A
            r2 = 0
            r1.writeParcelable(r0, r2)
            return
    }
}
