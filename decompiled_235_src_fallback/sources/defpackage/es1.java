package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: es1  reason: default package */
/* loaded from: classes.dex */
public final class es1 extends defpackage.v05 {
    public static final android.os.Parcelable.Creator<defpackage.es1> CREATOR = null;
    public java.lang.String A;

    static {
            y8 r0 = new y8
            r1 = 10
            r0.<init>(r1)
            defpackage.es1.CREATOR = r0
            return
    }

    public es1() {
            r1 = this;
            android.view.AbsSavedState r0 = android.view.AbsSavedState.EMPTY_STATE
            r1.<init>(r0)
            return
    }

    public es1(android.os.Parcel r1) {
            r0 = this;
            r0.<init>(r1)
            java.lang.String r1 = r1.readString()
            r0.A = r1
            return
    }

    @Override // android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            super.writeToParcel(r1, r2)
            java.lang.String r0 = r0.A
            r1.writeString(r0)
            return
    }
}
