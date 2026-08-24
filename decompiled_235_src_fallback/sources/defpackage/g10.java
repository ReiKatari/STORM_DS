package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
@defpackage.cc6
/* renamed from: g10  reason: default package */
/* loaded from: classes.dex */
public final class g10 implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<defpackage.g10> CREATOR = null;
    public static final defpackage.f10 Companion = null;
    public final java.lang.String A;
    public final java.lang.String B;
    public final java.lang.String L;

    static {
            f10 r0 = new f10
            r0.<init>()
            defpackage.g10.Companion = r0
            y8 r0 = new y8
            r1 = 4
            r0.<init>(r1)
            defpackage.g10.CREATOR = r0
            return
    }

    public /* synthetic */ g10(java.lang.String r3, int r4, java.lang.String r5, java.lang.String r6) {
            r2 = this;
            r0 = r4 & 7
            r1 = 7
            if (r1 != r0) goto Lf
            r2.<init>()
            r2.A = r3
            r2.B = r5
            r2.L = r6
            return
        Lf:
            e10 r2 = defpackage.e10.a
            wb6 r2 = r2.e()
            defpackage.ii2.S(r4, r1, r2)
            r2 = 0
            throw r2
    }

    public g10(java.lang.String r1, java.lang.String r2, java.lang.String r3) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            r3.getClass()
            r0.<init>()
            r0.A = r1
            r0.B = r2
            r0.L = r3
            return
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            r1.getClass()
            java.lang.String r2 = r0.A
            r1.writeString(r2)
            java.lang.String r2 = r0.B
            r1.writeString(r2)
            java.lang.String r0 = r0.L
            r1.writeString(r0)
            return
    }
}
