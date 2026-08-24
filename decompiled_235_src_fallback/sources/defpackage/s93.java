package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: s93  reason: default package */
/* loaded from: classes.dex */
public final class s93 implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<defpackage.s93> CREATOR = null;
    public final android.content.IntentSender A;
    public final android.content.Intent B;
    public final int L;
    public final int R;

    static {
            y8 r0 = new y8
            r1 = 15
            r0.<init>(r1)
            defpackage.s93.CREATOR = r0
            return
    }

    public s93(android.content.IntentSender r1, android.content.Intent r2, int r3, int r4) {
            r0 = this;
            r0.<init>()
            r0.A = r1
            r0.B = r2
            r0.L = r3
            r0.R = r4
            return
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r2, int r3) {
            r1 = this;
            r2.getClass()
            android.content.IntentSender r0 = r1.A
            r2.writeParcelable(r0, r3)
            android.content.Intent r0 = r1.B
            r2.writeParcelable(r0, r3)
            int r3 = r1.L
            r2.writeInt(r3)
            int r1 = r1.R
            r2.writeInt(r1)
            return
    }
}
