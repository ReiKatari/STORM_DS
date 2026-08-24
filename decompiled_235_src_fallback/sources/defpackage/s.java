package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: s  reason: default package */
/* loaded from: classes.dex */
public abstract class s implements android.os.Parcelable {
    public static final defpackage.r B = null;
    public static final android.os.Parcelable.Creator<defpackage.s> CREATOR = null;
    public final android.os.Parcelable A;

    static {
            r r0 = new r
            r0.<init>()
            defpackage.s.B = r0
            us4 r0 = new us4
            r1 = 1
            r0.<init>(r1)
            defpackage.s.CREATOR = r0
            return
    }

    public s() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.A = r0
            return
    }

    public s(android.os.Parcel r1, java.lang.ClassLoader r2) {
            r0 = this;
            r0.<init>()
            android.os.Parcelable r1 = r1.readParcelable(r2)
            if (r1 == 0) goto La
            goto Lc
        La:
            r r1 = defpackage.s.B
        Lc:
            r0.A = r1
            return
    }

    public s(android.os.Parcelable r3) {
            r2 = this;
            r2.<init>()
            r0 = 0
            if (r3 == 0) goto Lf
            r r1 = defpackage.s.B
            if (r3 == r1) goto Lb
            goto Lc
        Lb:
            r3 = r0
        Lc:
            r2.A = r3
            return
        Lf:
            java.lang.String r2 = "superState must not be null"
            defpackage.i.h(r2)
            throw r0
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            android.os.Parcelable r0 = r0.A
            r1.writeParcelable(r0, r2)
            return
    }
}
