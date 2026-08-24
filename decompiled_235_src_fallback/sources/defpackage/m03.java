package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: m03  reason: default package */
/* loaded from: classes.dex */
public final class m03 extends defpackage.oi2 {
    public final long e;
    public long f;
    public final /* synthetic */ defpackage.n03 g;

    public m03(defpackage.n03 r1, long r2) {
            r0 = this;
            r0.<init>()
            r0.g = r1
            r0.e = r2
            return
    }

    @Override // defpackage.oi2
    public final boolean G() {
            r4 = this;
            long r0 = r4.f
            long r2 = r4.e
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto La
            r4 = 1
            return r4
        La:
            r4 = 0
            return r4
    }

    @Override // defpackage.oi2
    public final int T(byte[] r12, int r13, int r14) {
            r11 = this;
            n03 r0 = r11.g
            q r1 = r0.X
            r2 = 0
            if (r14 != 0) goto L8
            return r2
        L8:
            long r3 = r11.e
            long r5 = r11.f
            long r3 = r3 - r5
            long r5 = (long) r14
            long r3 = java.lang.Math.min(r3, r5)
            int r14 = (int) r3
        L13:
            if (r2 >= r14) goto L7e
            n40 r3 = r0.L
            int r4 = r3.R
            r5 = 65535(0xffff, float:9.1834E-41)
            r6 = 1
            if (r4 <= 0) goto L41
            r4 = 8
            long r3 = defpackage.n03.n(r3, r4)
            int r3 = (int) r3
            byte r3 = (byte) r3
            int r4 = r13 + r2
            java.lang.Object r7 = r1.c
            byte[] r7 = (byte[]) r7
            int r8 = r1.a
            r7[r8] = r3
            int r7 = r8 + 1
            r5 = r5 & r7
            boolean r7 = r1.b
            if (r7 != 0) goto L3c
            if (r5 >= r8) goto L3c
            r1.b = r6
        L3c:
            r1.a = r5
            r12[r4] = r3
            goto L6e
        L41:
            java.io.InputStream r3 = r0.R
            int r4 = r13 + r2
            int r7 = r14 - r2
            int r3 = r3.read(r12, r4, r7)
            r7 = -1
            if (r3 == r7) goto L76
            r7 = r4
        L4f:
            int r8 = r4 + r3
            if (r7 >= r8) goto L6d
            r8 = r12[r7]
            java.lang.Object r9 = r1.c
            byte[] r9 = (byte[]) r9
            int r10 = r1.a
            r9[r10] = r8
            int r8 = r10 + 1
            r8 = r8 & r5
            boolean r9 = r1.b
            if (r9 != 0) goto L68
            if (r8 >= r10) goto L68
            r1.b = r6
        L68:
            r1.a = r8
            int r7 = r7 + 1
            goto L4f
        L6d:
            r6 = r3
        L6e:
            long r3 = r11.f
            long r7 = (long) r6
            long r3 = r3 + r7
            r11.f = r3
            int r2 = r2 + r6
            goto L13
        L76:
            java.io.EOFException r11 = new java.io.EOFException
            java.lang.String r12 = "Truncated Deflate64 Stream"
            r11.<init>(r12)
            throw r11
        L7e:
            return r14
    }

    @Override // defpackage.oi2
    public final defpackage.o03 W() {
            r4 = this;
            long r0 = r4.f
            long r2 = r4.e
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto Lb
            o03 r4 = defpackage.o03.STORED
            return r4
        Lb:
            o03 r4 = defpackage.o03.INITIAL
            return r4
    }

    @Override // defpackage.oi2
    public final int j() {
            r8 = this;
            long r0 = r8.e
            long r2 = r8.f
            long r0 = r0 - r2
            n03 r8 = r8.g
            n40 r8 = r8.L
            int r2 = r8.R
            long r2 = (long) r2
            u60 r8 = r8.A
            int r8 = r8.available()
            long r4 = (long) r8
            r6 = 8
            long r4 = r4 * r6
            long r4 = r4 + r2
            long r4 = r4 / r6
            long r0 = java.lang.Math.min(r0, r4)
            int r8 = (int) r0
            return r8
    }
}
