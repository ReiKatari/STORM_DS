package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: z41  reason: default package */
/* loaded from: classes.dex */
public final class z41 implements android.os.Parcelable {
    public static final defpackage.y41 CREATOR = null;
    public final defpackage.u41 A;

    static {
            y41 r0 = new y41
            r0.<init>()
            defpackage.z41.CREATOR = r0
            return
    }

    public z41(android.os.Parcel r14) {
            r13 = this;
            r13.<init>()
            int r0 = r14.readInt()
            kw3 r1 = new kw3
            r1.<init>(r0)
            r2 = 0
            r3 = r2
        Le:
            r4 = 0
            if (r3 >= r0) goto L2d
            java.lang.Class<n63> r5 = defpackage.n63.class
            java.lang.ClassLoader r6 = r5.getClassLoader()
            android.os.Parcelable r5 = defpackage.xk2.H(r14, r6, r5)
            if (r5 == 0) goto L27
            n63 r5 = (defpackage.n63) r5
            i63 r4 = r5.A
            r1.add(r4)
            int r3 = r3 + 1
            goto Le
        L27:
            java.lang.String r13 = "Required value was null."
            defpackage.i.h(r13)
            throw r4
        L2d:
            kw3 r0 = defpackage.hf.A(r1)
            int r1 = r14.dataAvail()
            if (r1 <= 0) goto L7e
            int r1 = r14.readInt()
            int r8 = r14.readInt()
            int r9 = r14.readInt()
            byte r3 = r14.readByte()
            r5 = 1
            if (r3 == 0) goto L4c
            r10 = r5
            goto L4d
        L4c:
            r10 = r2
        L4d:
            byte r3 = r14.readByte()
            if (r3 == 0) goto L55
            r11 = r5
            goto L56
        L55:
            r11 = r2
        L56:
            float r12 = r14.readFloat()
            int r3 = r14.dataAvail()
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r3 <= 0) goto L6c
            byte r14 = r14.readByte()
            if (r14 == 0) goto L6a
        L68:
            r7 = r5
            goto L6f
        L6a:
            r7 = r2
            goto L6f
        L6c:
            if (r1 == r6) goto L6a
            goto L68
        L6f:
            java.lang.Integer r14 = java.lang.Integer.valueOf(r1)
            if (r1 == r6) goto L77
            r6 = r14
            goto L78
        L77:
            r6 = r4
        L78:
            kk6 r5 = new kk6
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            goto L83
        L7e:
            kk6 r5 = new kk6
            r5.<init>()
        L83:
            u41 r14 = new u41
            r14.<init>(r0, r5)
            r13.A = r14
            return
    }

    public z41(defpackage.u41 r1) {
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
    public final void writeToParcel(android.os.Parcel r6, int r7) {
            r5 = this;
            r6.getClass()
            u41 r5 = r5.A
            java.util.ArrayList r0 = r5.b
            int r1 = r0.size()
            r6.writeInt(r1)
            int r1 = r0.size()
            r2 = 0
        L13:
            if (r2 >= r1) goto L26
            java.lang.Object r3 = r0.get(r2)
            int r2 = r2 + 1
            i63 r3 = (defpackage.i63) r3
            n63 r4 = new n63
            r4.<init>(r3)
            r6.writeParcelable(r4, r7)
            goto L13
        L26:
            kk6 r5 = r5.a
            java.lang.Integer r7 = r5.a
            if (r7 == 0) goto L31
            int r7 = r7.intValue()
            goto L33
        L31:
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
        L33:
            r6.writeInt(r7)
            int r7 = r5.c
            r6.writeInt(r7)
            int r7 = r5.d
            r6.writeInt(r7)
            boolean r7 = r5.e
            byte r7 = (byte) r7
            r6.writeByte(r7)
            boolean r7 = r5.f
            byte r7 = (byte) r7
            r6.writeByte(r7)
            float r7 = r5.g
            r6.writeFloat(r7)
            boolean r5 = r5.b
            byte r5 = (byte) r5
            r6.writeByte(r5)
            return
    }
}
