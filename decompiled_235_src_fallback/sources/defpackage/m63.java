package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: m63  reason: default package */
/* loaded from: classes.dex */
public final class m63 implements android.os.Parcelable.Creator {
    public static final defpackage.h63 a(defpackage.m63 r2, android.os.Parcel r3) {
            r2.getClass()
            int r2 = r3.readInt()
            r0 = 1
            r1 = 0
            if (r2 == r0) goto L39
            r0 = 2
            if (r2 == r0) goto L11
            g63 r2 = defpackage.g63.a
            return r2
        L11:
            int r2 = r3.readInt()
            if (r2 == 0) goto L1f
            int r2 = r3.readInt()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
        L1f:
            int r2 = r3.readInt()
            t52 r0 = defpackage.d63.getEntries()
            int r3 = r3.readInt()
            u52 r0 = (defpackage.u52) r0
            java.lang.Object r3 = r0.get(r3)
            d63 r3 = (defpackage.d63) r3
            e63 r0 = new e63
            r0.<init>(r1, r2, r3)
            return r0
        L39:
            int r2 = r3.readInt()
            if (r2 == 0) goto L47
            int r2 = r3.readInt()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
        L47:
            int r2 = r3.readInt()
            f63 r3 = new f63
            r3.<init>(r2, r1)
            return r3
    }

    public static final void b(defpackage.m63 r2, android.os.Parcel r3, defpackage.h63 r4) {
            r2.getClass()
            g63 r2 = defpackage.g63.a
            boolean r2 = defpackage.nb3.k(r4, r2)
            r0 = 0
            if (r2 == 0) goto L10
            r3.writeInt(r0)
            return
        L10:
            boolean r2 = r4 instanceof defpackage.f63
            r1 = 1
            if (r2 == 0) goto L31
            r3.writeInt(r1)
            f63 r4 = (defpackage.f63) r4
            java.lang.Integer r2 = r4.a
            if (r2 == 0) goto L1f
            r0 = r1
        L1f:
            r3.writeInt(r0)
            if (r2 == 0) goto L2b
            int r2 = r2.intValue()
            r3.writeInt(r2)
        L2b:
            int r2 = r4.b
            r3.writeInt(r2)
            return
        L31:
            boolean r2 = r4 instanceof defpackage.e63
            if (r2 == 0) goto L5b
            r2 = 2
            r3.writeInt(r2)
            e63 r4 = (defpackage.e63) r4
            java.lang.Integer r2 = r4.a
            if (r2 == 0) goto L40
            r0 = r1
        L40:
            r3.writeInt(r0)
            if (r2 == 0) goto L4c
            int r2 = r2.intValue()
            r3.writeInt(r2)
        L4c:
            int r2 = r4.b
            r3.writeInt(r2)
            d63 r2 = r4.c
            int r2 = r2.ordinal()
            r3.writeInt(r2)
            return
        L5b:
            defpackage.i.d()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final java.lang.Object createFromParcel(android.os.Parcel r1) {
            r0 = this;
            r1.getClass()
            n63 r0 = new n63
            r0.<init>(r1)
            return r0
    }

    @Override // android.os.Parcelable.Creator
    public final java.lang.Object[] newArray(int r1) {
            r0 = this;
            n63[] r0 = new defpackage.n63[r1]
            return r0
    }
}
