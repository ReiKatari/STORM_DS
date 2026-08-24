package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qt5  reason: default package */
/* loaded from: classes.dex */
public final class qt5 implements android.os.Parcelable {
    public static final defpackage.pt5 CREATOR = null;
    public final defpackage.jt5 A;

    static {
            pt5 r0 = new pt5
            r0.<init>()
            defpackage.qt5.CREATOR = r0
            return
    }

    public qt5(android.os.Parcel r19) {
            r18 = this;
            r0 = r19
            r18.<init>()
            t52 r1 = defpackage.u26.getEntries()
            int r2 = r0.readInt()
            u52 r1 = (defpackage.u52) r1
            java.lang.Object r1 = r1.get(r2)
            r3 = r1
            u26 r3 = (defpackage.u26) r3
            t52 r1 = defpackage.a36.getEntries()
            int r2 = r0.readInt()
            u52 r1 = (defpackage.u52) r1
            java.lang.Object r1 = r1.get(r2)
            r4 = r1
            a36 r4 = (defpackage.a36) r4
            java.lang.String r1 = r0.readString()
            r2 = 0
            if (r1 == 0) goto L34
            java.util.UUID r1 = java.util.UUID.fromString(r1)
            r5 = r1
            goto L35
        L34:
            r5 = r2
        L35:
            java.lang.Class<zw5> r1 = defpackage.zw5.class
            java.lang.ClassLoader r6 = r1.getClassLoader()
            android.os.Parcelable r1 = defpackage.xk2.H(r0, r6, r1)
            r1.getClass()
            zw5 r1 = (defpackage.zw5) r1
            hi2 r6 = r1.A
            java.lang.String r7 = r0.readString()
            byte r1 = r0.readByte()
            r8 = 1
            if (r1 == 0) goto L53
            r1 = r8
            goto L54
        L53:
            r1 = 0
        L54:
            t52 r9 = defpackage.nx5.getEntries()
            int r10 = r0.readInt()
            u52 r9 = (defpackage.u52) r9
            java.lang.Object r9 = r9.get(r10)
            nx5 r9 = (defpackage.nx5) r9
            java.lang.Class<z41> r10 = defpackage.z41.class
            java.lang.ClassLoader r11 = r10.getClassLoader()
            android.os.Parcelable r10 = defpackage.xk2.H(r0, r11, r10)
            z41 r10 = (defpackage.z41) r10
            if (r10 == 0) goto L75
            u41 r10 = r10.A
            goto L76
        L75:
            r10 = r2
        L76:
            t52 r11 = me.magnum.melonds.domain.model.VideoRenderer.getEntries()
            int r12 = r0.readInt()
            if (r12 < 0) goto L89
            u52 r11 = (defpackage.u52) r11
            java.lang.Object r11 = r11.get(r12)
            java.lang.Enum r11 = (java.lang.Enum) r11
            goto L8a
        L89:
            r11 = r2
        L8a:
            me.magnum.melonds.domain.model.VideoRenderer r11 = (me.magnum.melonds.domain.model.VideoRenderer) r11
            int r12 = r0.readInt()
            if (r12 == 0) goto L9a
            if (r12 == r8) goto L96
            r12 = r2
            goto L9d
        L96:
            java.lang.Boolean r8 = java.lang.Boolean.TRUE
        L98:
            r12 = r8
            goto L9d
        L9a:
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
            goto L98
        L9d:
            int r8 = r0.readInt()
            if (r8 < 0) goto La9
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r13 = r8
            goto Laa
        La9:
            r13 = r2
        Laa:
            t52 r8 = me.magnum.melonds.domain.model.VideoFiltering.getEntries()
            int r14 = r0.readInt()
            if (r14 < 0) goto Lbc
            u52 r8 = (defpackage.u52) r8
            java.lang.Object r2 = r8.get(r14)
            java.lang.Enum r2 = (java.lang.Enum) r2
        Lbc:
            r14 = r2
            me.magnum.melonds.domain.model.VideoFiltering r14 = (me.magnum.melonds.domain.model.VideoFiltering) r14
            java.lang.String r15 = r0.readString()
            java.lang.String r16 = r0.readString()
            jt5 r2 = new jt5
            r17 = 245760(0x3c000, float:3.44383E-40)
            r8 = r1
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r0 = r18
            r0.A = r2
            return
    }

    public qt5(defpackage.jt5 r1) {
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
    public final void writeToParcel(android.os.Parcel r4, int r5) {
            r3 = this;
            r4.getClass()
            jt5 r3 = r3.A
            u26 r5 = r3.a
            int r5 = r5.ordinal()
            r4.writeInt(r5)
            a36 r5 = r3.b
            int r5 = r5.ordinal()
            r4.writeInt(r5)
            java.util.UUID r5 = r3.c
            r0 = 0
            if (r5 == 0) goto L21
            java.lang.String r5 = r5.toString()
            goto L22
        L21:
            r5 = r0
        L22:
            r4.writeString(r5)
            zw5 r5 = new zw5
            hi2 r1 = r3.d
            r5.<init>(r1)
            r1 = 0
            r4.writeParcelable(r5, r1)
            java.lang.String r5 = r3.e
            r4.writeString(r5)
            boolean r5 = r3.f
            byte r5 = (byte) r5
            r4.writeByte(r5)
            nx5 r5 = r3.g
            int r5 = r5.ordinal()
            r4.writeInt(r5)
            u41 r5 = r3.h
            if (r5 == 0) goto L4d
            z41 r0 = new z41
            r0.<init>(r5)
        L4d:
            r4.writeParcelable(r0, r1)
            me.magnum.melonds.domain.model.VideoRenderer r5 = r3.i
            r0 = -1
            if (r5 == 0) goto L5a
            int r5 = r5.ordinal()
            goto L5b
        L5a:
            r5 = r0
        L5b:
            r4.writeInt(r5)
            java.lang.Boolean r5 = r3.j
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            boolean r2 = defpackage.nb3.k(r5, r2)
            if (r2 == 0) goto L69
            goto L76
        L69:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            boolean r1 = defpackage.nb3.k(r5, r1)
            if (r1 == 0) goto L73
            r1 = 1
            goto L76
        L73:
            if (r5 != 0) goto L9c
            r1 = r0
        L76:
            r4.writeInt(r1)
            java.lang.Integer r5 = r3.k
            if (r5 == 0) goto L82
            int r5 = r5.intValue()
            goto L83
        L82:
            r5 = r0
        L83:
            r4.writeInt(r5)
            me.magnum.melonds.domain.model.VideoFiltering r5 = r3.l
            if (r5 == 0) goto L8e
            int r0 = r5.ordinal()
        L8e:
            r4.writeInt(r0)
            java.lang.String r5 = r3.m
            r4.writeString(r5)
            java.lang.String r3 = r3.n
            r4.writeString(r3)
            return
        L9c:
            defpackage.i.d()
            return
    }
}
