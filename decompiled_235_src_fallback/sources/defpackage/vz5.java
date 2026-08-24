package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vz5  reason: default package */
/* loaded from: classes.dex */
public final class vz5 implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final java.lang.Object createFromParcel(android.os.Parcel r21) {
            r20 = this;
            r21.getClass()
            wz5 r0 = new wz5
            r0.<init>()
            java.lang.String r2 = r21.readString()
            java.lang.String r3 = r21.readString()
            r3.getClass()
            java.lang.String r4 = r21.readString()
            java.lang.String r1 = r21.readString()
            r1.getClass()
            android.net.Uri r5 = android.net.Uri.parse(r1)
            java.lang.String r1 = r21.readString()
            r6 = 0
            if (r1 == 0) goto L2e
            android.net.Uri r1 = android.net.Uri.parse(r1)
            goto L2f
        L2e:
            r1 = r6
        L2f:
            long r7 = r21.readLong()
            r9 = -1
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 != 0) goto L3b
            r8 = r6
            goto L41
        L3b:
            java.util.Date r11 = new java.util.Date
            r11.<init>(r7)
            r8 = r11
        L41:
            java.lang.Class<qt5> r7 = defpackage.qt5.class
            java.lang.ClassLoader r11 = r7.getClassLoader()
            r12 = r21
            android.os.Parcelable r7 = defpackage.xk2.H(r12, r11, r7)
            qt5 r7 = (defpackage.qt5) r7
            int r11 = r12.readInt()
            r13 = 1
            if (r11 != r13) goto L58
        L56:
            r14 = r9
            goto L5a
        L58:
            r13 = 0
            goto L56
        L5a:
            java.lang.String r10 = r12.readString()
            r10.getClass()
            jd1 r9 = defpackage.oq1.B
            r16 = r14
            long r14 = r12.readLong()
            uq1 r9 = defpackage.uq1.MILLISECONDS
            long r14 = defpackage.n16.M(r14, r9)
            long r18 = r12.readLong()
            java.lang.Long r9 = java.lang.Long.valueOf(r18)
            int r11 = (r18 > r16 ? 1 : (r18 == r16 ? 0 : -1))
            if (r11 == 0) goto L7c
            r6 = r9
        L7c:
            byte[] r9 = r12.createByteArray()
            r11 = r14
            r14 = r6
            r6 = r1
            pq5 r1 = new pq5
            r2.getClass()
            r4.getClass()
            r7.getClass()
            jt5 r7 = r7.A
            r15 = r9
            r9 = r13
            r13 = 0
            r16 = 1024(0x400, float:1.435E-42)
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r13, r14, r15, r16)
            r0.A = r1
            return r0
    }

    @Override // android.os.Parcelable.Creator
    public final java.lang.Object[] newArray(int r1) {
            r0 = this;
            wz5[] r0 = new defpackage.wz5[r1]
            return r0
    }
}
