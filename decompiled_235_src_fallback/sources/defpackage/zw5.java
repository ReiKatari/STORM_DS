package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zw5  reason: default package */
/* loaded from: classes.dex */
public final class zw5 implements android.os.Parcelable {
    public static final defpackage.yw5 CREATOR = null;
    public final defpackage.hi2 A;

    static {
            yw5 r0 = new yw5
            r0.<init>()
            defpackage.zw5.CREATOR = r0
            return
    }

    public zw5(android.os.Parcel r4) {
            r3 = this;
            r3.<init>()
            int r0 = r4.readInt()
            if (r0 == 0) goto L46
            r1 = 1
            r2 = 0
            if (r0 == r1) goto L29
            r4 = 2
            if (r0 == r4) goto L26
            r4 = 3
            if (r0 == r4) goto L23
            r4 = 4
            if (r0 != r4) goto L19
            rw5 r4 = defpackage.rw5.o
            goto L48
        L19:
            java.lang.String r3 = "Unsupported GBA slot type: "
            java.lang.String r3 = defpackage.lb1.g(r0, r3)
            defpackage.fa6.h(r3)
            throw r2
        L23:
            vw5 r4 = defpackage.vw5.o
            goto L48
        L26:
            tw5 r4 = defpackage.tw5.o
            goto L48
        L29:
            sw5 r0 = new sw5
            java.lang.String r1 = r4.readString()
            if (r1 == 0) goto L36
            android.net.Uri r1 = android.net.Uri.parse(r1)
            goto L37
        L36:
            r1 = r2
        L37:
            java.lang.String r4 = r4.readString()
            if (r4 == 0) goto L41
            android.net.Uri r2 = android.net.Uri.parse(r4)
        L41:
            r0.<init>(r1, r2)
            r4 = r0
            goto L48
        L46:
            uw5 r4 = defpackage.uw5.o
        L48:
            r3.A = r4
            return
    }

    public zw5(defpackage.hi2 r1) {
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
            hi2 r1 = r1.A
            boolean r3 = r1 instanceof defpackage.uw5
            if (r3 == 0) goto Le
            r1 = 0
            r2.writeInt(r1)
            return
        Le:
            boolean r3 = r1 instanceof defpackage.sw5
            if (r3 == 0) goto L35
            r3 = 1
            r2.writeInt(r3)
            r3 = r1
            sw5 r3 = (defpackage.sw5) r3
            android.net.Uri r3 = r3.o
            r0 = 0
            if (r3 == 0) goto L23
            java.lang.String r3 = r3.toString()
            goto L24
        L23:
            r3 = r0
        L24:
            r2.writeString(r3)
            sw5 r1 = (defpackage.sw5) r1
            android.net.Uri r1 = r1.p
            if (r1 == 0) goto L31
            java.lang.String r0 = r1.toString()
        L31:
            r2.writeString(r0)
            return
        L35:
            vw5 r3 = defpackage.vw5.o
            boolean r3 = defpackage.nb3.k(r1, r3)
            if (r3 == 0) goto L42
            r1 = 3
            r2.writeInt(r1)
            return
        L42:
            tw5 r3 = defpackage.tw5.o
            boolean r3 = defpackage.nb3.k(r1, r3)
            if (r3 == 0) goto L4f
            r1 = 2
            r2.writeInt(r1)
            return
        L4f:
            rw5 r3 = defpackage.rw5.o
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 == 0) goto L5c
            r1 = 4
            r2.writeInt(r1)
            return
        L5c:
            defpackage.i.d()
            return
    }
}
