package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ho0  reason: default package */
/* loaded from: classes.dex */
public final class ho0 implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<defpackage.ho0> CREATOR = null;
    public final java.lang.Long A;
    public final long B;
    public final java.lang.String L;
    public final java.lang.String R;
    public final java.lang.String X;
    public final boolean Y;

    static {
            y8 r0 = new y8
            r1 = 7
            r0.<init>(r1)
            defpackage.ho0.CREATOR = r0
            return
    }

    public ho0(java.lang.Long r1, long r2, java.lang.String r4, java.lang.String r5, java.lang.String r6, boolean r7) {
            r0 = this;
            r4.getClass()
            r6.getClass()
            r0.<init>()
            r0.A = r1
            r0.B = r2
            r0.L = r4
            r0.R = r5
            r0.X = r6
            r0.Y = r7
            return
    }

    public final me.magnum.melonds.domain.model.Cheat a() {
            r8 = this;
            me.magnum.melonds.domain.model.Cheat r0 = new me.magnum.melonds.domain.model.Cheat
            java.lang.String r6 = r8.X
            boolean r7 = r8.Y
            java.lang.Long r1 = r8.A
            long r2 = r8.B
            java.lang.String r4 = r8.L
            java.lang.String r5 = r8.R
            r0.<init>(r1, r2, r4, r5, r6, r7)
            return r0
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r3, int r4) {
            r2 = this;
            r3.getClass()
            java.lang.Long r4 = r2.A
            if (r4 != 0) goto Lc
            r4 = 0
            r3.writeInt(r4)
            goto L17
        Lc:
            r0 = 1
            r3.writeInt(r0)
            long r0 = r4.longValue()
            r3.writeLong(r0)
        L17:
            long r0 = r2.B
            r3.writeLong(r0)
            java.lang.String r4 = r2.L
            r3.writeString(r4)
            java.lang.String r4 = r2.R
            r3.writeString(r4)
            java.lang.String r4 = r2.X
            r3.writeString(r4)
            boolean r2 = r2.Y
            r3.writeInt(r2)
            return
    }
}
