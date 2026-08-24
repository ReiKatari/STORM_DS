package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: n63  reason: default package */
/* loaded from: classes.dex */
public final class n63 implements android.os.Parcelable {
    public static final defpackage.m63 CREATOR = null;
    public final defpackage.i63 A;

    static {
            m63 r0 = new m63
            r0.<init>()
            defpackage.n63.CREATOR = r0
            return
    }

    public n63(android.os.Parcel r5) {
            r4 = this;
            r4.<init>()
            i63 r0 = new i63
            t52 r1 = defpackage.b63.getEntries()
            int r2 = r5.readInt()
            u52 r1 = (defpackage.u52) r1
            java.lang.Object r1 = r1.get(r2)
            b63 r1 = (defpackage.b63) r1
            m63 r2 = defpackage.n63.CREATOR
            h63 r3 = defpackage.m63.a(r2, r5)
            h63 r5 = defpackage.m63.a(r2, r5)
            r0.<init>(r1, r3, r5)
            r4.A = r0
            return
    }

    public n63(defpackage.i63 r1) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.A = r1
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
            i63 r1 = r1.A
            b63 r3 = r1.a
            int r3 = r3.ordinal()
            r2.writeInt(r3)
            m63 r3 = defpackage.n63.CREATOR
            h63 r0 = r1.b
            defpackage.m63.b(r3, r2, r0)
            h63 r1 = r1.c
            defpackage.m63.b(r3, r2, r1)
            return
    }
}
