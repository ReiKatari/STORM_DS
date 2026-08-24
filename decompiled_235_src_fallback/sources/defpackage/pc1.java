package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: pc1  reason: default package */
/* loaded from: classes.dex */
public final class pc1 {
    public android.os.Parcel a;

    public long a() {
            r6 = this;
            int r0 = defpackage.kt0.i
            android.os.Parcel r6 = r6.a
            long r0 = r6.readLong()
            r2 = 63
            long r2 = r2 & r0
            r4 = 16
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 >= 0) goto L12
            return r0
        L12:
            r4 = -64
            long r0 = r0 & r4
            r4 = 1
            long r2 = r2 + r4
            long r0 = r0 | r2
            return r0
    }

    public long b() {
            r4 = this;
            android.os.Parcel r4 = r4.a
            byte r0 = r4.readByte()
            r1 = 1
            r2 = 0
            if (r0 != r1) goto L11
            r0 = 4294967296(0x100000000, double:2.121995791E-314)
            goto L1b
        L11:
            r1 = 2
            if (r0 != r1) goto L1a
            r0 = 8589934592(0x200000000, double:4.243991582E-314)
            goto L1b
        L1a:
            r0 = r2
        L1b:
            boolean r2 = defpackage.y47.a(r0, r2)
            if (r2 == 0) goto L24
            long r0 = defpackage.x47.c
            return r0
        L24:
            float r4 = r4.readFloat()
            long r0 = defpackage.hi2.J(r4, r0)
            return r0
    }

    public void c(byte r1) {
            r0 = this;
            android.os.Parcel r0 = r0.a
            r0.writeByte(r1)
            return
    }

    public void d(float r1) {
            r0 = this;
            android.os.Parcel r0 = r0.a
            r0.writeFloat(r1)
            return
    }

    public void e(long r9) {
            r8 = this;
            long r0 = defpackage.x47.b(r9)
            r2 = 0
            boolean r4 = defpackage.y47.a(r0, r2)
            r5 = 0
            if (r4 == 0) goto Le
            goto L27
        Le:
            r6 = 4294967296(0x100000000, double:2.121995791E-314)
            boolean r4 = defpackage.y47.a(r0, r6)
            if (r4 == 0) goto L1b
            r5 = 1
            goto L27
        L1b:
            r6 = 8589934592(0x200000000, double:4.243991582E-314)
            boolean r0 = defpackage.y47.a(r0, r6)
            if (r0 == 0) goto L27
            r5 = 2
        L27:
            r8.c(r5)
            long r0 = defpackage.x47.b(r9)
            boolean r0 = defpackage.y47.a(r0, r2)
            if (r0 != 0) goto L3b
            float r9 = defpackage.x47.c(r9)
            r8.d(r9)
        L3b:
            return
    }
}
