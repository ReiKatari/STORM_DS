package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ws7  reason: default package */
/* loaded from: classes.dex */
public final class ws7 implements java.io.Closeable {
    public final defpackage.z80 A;
    public final defpackage.af5 B;
    public final boolean L;
    public final boolean R;
    public boolean X;
    public int Y;
    public long Z;
    public boolean d0;
    public boolean e0;
    public boolean f0;
    public final defpackage.k80 g0;
    public final defpackage.k80 h0;
    public defpackage.f54 i0;
    public final byte[] j0;

    public ws7(defpackage.z80 r1, defpackage.af5 r2, boolean r3, boolean r4) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.A = r1
            r0.B = r2
            r0.L = r3
            r0.R = r4
            k80 r1 = new k80
            r1.<init>()
            r0.g0 = r1
            k80 r1 = new k80
            r1.<init>()
            r0.h0 = r1
            r1 = 0
            r0.j0 = r1
            return
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
            r1 = this;
            f54 r0 = r1.i0
            if (r0 == 0) goto L7
            defpackage.yy7.b(r0)
        L7:
            z80 r1 = r1.A
            defpackage.yy7.b(r1)
            return
    }

    public final void e() {
            r13 = this;
            r13.k()
            boolean r0 = r13.e0
            if (r0 == 0) goto Lb
            r13.h()
            return
        Lb:
            int r0 = r13.Y
            r1 = 1
            r2 = 2
            if (r0 == r1) goto L29
            if (r0 != r2) goto L14
            goto L29
        L14:
            java.net.ProtocolException r13 = new java.net.ProtocolException
            java.util.TimeZone r1 = defpackage.az7.a
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            r0.getClass()
            java.lang.String r1 = "Unknown opcode: "
            java.lang.String r0 = r1.concat(r0)
            r13.<init>(r0)
            throw r13
        L29:
            boolean r3 = r13.X
            if (r3 != 0) goto L161
            long r3 = r13.Z
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            k80 r8 = r13.h0
            if (r7 <= 0) goto L3c
            z80 r7 = r13.A
            r7.K(r8, r3)
        L3c:
            boolean r3 = r13.d0
            if (r3 != 0) goto L6c
        L40:
            boolean r3 = r13.X
            if (r3 != 0) goto L50
            r13.k()
            boolean r3 = r13.e0
            if (r3 != 0) goto L4c
            goto L50
        L4c:
            r13.h()
            goto L40
        L50:
            int r3 = r13.Y
            if (r3 != 0) goto L55
            goto L29
        L55:
            java.net.ProtocolException r0 = new java.net.ProtocolException
            int r13 = r13.Y
            java.util.TimeZone r1 = defpackage.az7.a
            java.lang.String r13 = java.lang.Integer.toHexString(r13)
            r13.getClass()
            java.lang.String r1 = "Expected continuation opcode. Got: "
            java.lang.String r13 = r1.concat(r13)
            r0.<init>(r13)
            throw r0
        L6c:
            boolean r3 = r13.f0
            r4 = 0
            if (r3 == 0) goto Leb
            f54 r3 = r13.i0
            if (r3 != 0) goto L7e
            f54 r3 = new f54
            boolean r7 = r13.R
            r3.<init>(r7, r1)
            r13.i0 = r3
        L7e:
            k80 r7 = r3.L
            long r9 = r7.B
            int r5 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r5 != 0) goto Le5
            java.lang.Object r5 = r3.R
            java.util.zip.Inflater r5 = (java.util.zip.Inflater) r5
            if (r5 != 0) goto L93
            java.util.zip.Inflater r5 = new java.util.zip.Inflater
            r5.<init>(r1)
            r3.R = r5
        L93:
            java.io.Closeable r6 = r3.X
            h53 r6 = (defpackage.h53) r6
            if (r6 != 0) goto La5
            h53 r6 = new h53
            fe5 r9 = new fe5
            r9.<init>(r7)
            r6.<init>(r9, r5)
            r3.X = r6
        La5:
            boolean r9 = r3.B
            if (r9 == 0) goto Lac
            r5.reset()
        Lac:
            r7.m0(r8)
            r9 = 65535(0xffff, float:9.1834E-41)
            r7.q0(r9)
            long r9 = r5.getBytesRead()
            long r11 = r7.B
            long r9 = r9 + r11
        Lbc:
            r11 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r6.e(r8, r11)
            long r11 = r5.getBytesRead()
            int r11 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r11 >= 0) goto Ld2
            boolean r11 = r5.finished()
            if (r11 == 0) goto Lbc
        Ld2:
            long r11 = r5.getBytesRead()
            int r5 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r5 >= 0) goto Leb
            r7.e()
            r6.close()
            r3.X = r4
            r3.R = r4
            goto Leb
        Le5:
            java.lang.String r13 = "Failed requirement."
            defpackage.i.h(r13)
            return
        Leb:
            af5 r13 = r13.B
            zp3 r3 = r13.a
            r5 = 0
            if (r0 != r1) goto L11d
            java.lang.String r0 = r8.c0()
            java.lang.String r1 = "Path:turn.end"
            boolean r0 = defpackage.qs6.j0(r0, r1, r5)
            if (r0 == 0) goto L160
            r0 = 1000(0x3e8, float:1.401E-42)
            java.lang.String r1 = "Done"
            r13.b(r0, r1)
            java.lang.Object r13 = r3.h
            java.io.ByteArrayOutputStream r13 = (java.io.ByteArrayOutputStream) r13
            byte[] r13 = r13.toByteArray()
            java.lang.Object r0 = r3.i
            tu0 r0 = (defpackage.tu0) r0
            r13.getClass()
            int r1 = r13.length
            if (r1 != 0) goto L118
            goto L119
        L118:
            r4 = r13
        L119:
            r0.b0(r4)
            return
        L11d:
            long r6 = r8.B
            da0 r13 = r8.l(r6)
            r13.getClass()
            byte[] r13 = r13.r()     // Catch: java.lang.Throwable -> L148
            int r0 = r13.length     // Catch: java.lang.Throwable -> L148
            if (r0 <= r2) goto L160
            r0 = r13[r5]     // Catch: java.lang.Throwable -> L148
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 << 8
            r1 = r13[r1]     // Catch: java.lang.Throwable -> L148
            r1 = r1 & 255(0xff, float:3.57E-43)
            r0 = r0 | r1
            int r0 = r0 + r2
            if (r2 > r0) goto L160
            int r1 = r13.length     // Catch: java.lang.Throwable -> L148
            if (r0 > r1) goto L160
            java.lang.Object r1 = r3.h     // Catch: java.lang.Throwable -> L148
            java.io.ByteArrayOutputStream r1 = (java.io.ByteArrayOutputStream) r1     // Catch: java.lang.Throwable -> L148
            int r2 = r13.length     // Catch: java.lang.Throwable -> L148
            int r2 = r2 - r0
            r1.write(r13, r0, r2)     // Catch: java.lang.Throwable -> L148
            goto L160
        L148:
            r13 = move-exception
            java.lang.String r13 = r13.getMessage()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Error parsing binary audio frame: "
            r0.<init>(r1)
            r0.append(r13)
            java.lang.String r13 = r0.toString()
            java.lang.String r0 = "EdgeNeuralTtsClient"
            android.util.Log.w(r0, r13)
        L160:
            return
        L161:
            java.lang.String r13 = "closed"
            defpackage.e41.i(r13)
            return
    }

    public final void h() {
            r9 = this;
            long r0 = r9.Z
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto Lf
            z80 r4 = r9.A
            k80 r5 = r9.g0
            r4.K(r5, r0)
        Lf:
            int r0 = r9.Y
            switch(r0) {
                case 8: goto L70;
                case 9: goto L41;
                case 10: goto L2b;
                default: goto L14;
            }
        L14:
            java.net.ProtocolException r0 = new java.net.ProtocolException
            int r9 = r9.Y
            java.util.TimeZone r1 = defpackage.az7.a
            java.lang.String r9 = java.lang.Integer.toHexString(r9)
            r9.getClass()
            java.lang.String r1 = "Unknown control opcode: "
            java.lang.String r9 = r1.concat(r9)
            r0.<init>(r9)
            throw r0
        L2b:
            af5 r0 = r9.B
            k80 r9 = r9.g0
            long r1 = r9.B
            da0 r9 = r9.l(r1)
            monitor-enter(r0)
            r9.getClass()     // Catch: java.lang.Throwable -> L3e
            r9 = 0
            r0.w = r9     // Catch: java.lang.Throwable -> L3e
            monitor-exit(r0)
            return
        L3e:
            r9 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3e
            throw r9
        L41:
            af5 r0 = r9.B
            k80 r9 = r9.g0
            long r1 = r9.B
            da0 r9 = r9.l(r1)
            monitor-enter(r0)
            r9.getClass()     // Catch: java.lang.Throwable -> L60
            boolean r1 = r0.u     // Catch: java.lang.Throwable -> L60
            if (r1 != 0) goto L6c
            boolean r1 = r0.r     // Catch: java.lang.Throwable -> L60
            if (r1 == 0) goto L62
            java.util.ArrayDeque r1 = r0.p     // Catch: java.lang.Throwable -> L60
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L60
            if (r1 == 0) goto L62
            goto L6c
        L60:
            r9 = move-exception
            goto L6e
        L62:
            java.util.ArrayDeque r1 = r0.o     // Catch: java.lang.Throwable -> L60
            r1.add(r9)     // Catch: java.lang.Throwable -> L60
            r0.e()     // Catch: java.lang.Throwable -> L60
            monitor-exit(r0)
            return
        L6c:
            monitor-exit(r0)
            return
        L6e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L60
            throw r9
        L70:
            java.lang.String r0 = ""
            k80 r1 = r9.g0
            long r4 = r1.B
            r6 = 1
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 == 0) goto Le8
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 == 0) goto Lbe
            short r0 = r1.readShort()
            k80 r1 = r9.g0
            java.lang.String r1 = r1.c0()
            r2 = 1000(0x3e8, float:1.401E-42)
            if (r0 < r2) goto Laf
            r2 = 5000(0x1388, float:7.006E-42)
            if (r0 < r2) goto L93
            goto Laf
        L93:
            r2 = 1004(0x3ec, float:1.407E-42)
            if (r2 > r0) goto L9c
            r2 = 1007(0x3ef, float:1.411E-42)
            if (r0 >= r2) goto L9c
            goto La4
        L9c:
            r2 = 1015(0x3f7, float:1.422E-42)
            if (r2 > r0) goto Lad
            r2 = 3000(0xbb8, float:4.204E-42)
            if (r0 >= r2) goto Lad
        La4:
            java.lang.String r2 = "Code "
            java.lang.String r3 = " is reserved and may not be used."
            java.lang.String r2 = defpackage.lb1.k(r2, r0, r3)
            goto Lb5
        Lad:
            r2 = 0
            goto Lb5
        Laf:
            java.lang.String r2 = "Code must be in range [1000,5000): "
            java.lang.String r2 = defpackage.lb1.g(r0, r2)
        Lb5:
            if (r2 != 0) goto Lb8
            goto Lc3
        Lb8:
            java.net.ProtocolException r9 = new java.net.ProtocolException
            r9.<init>(r2)
            throw r9
        Lbe:
            r1 = 1005(0x3ed, float:1.408E-42)
            r8 = r1
            r1 = r0
            r0 = r8
        Lc3:
            af5 r2 = r9.B
            r3 = -1
            if (r0 == r3) goto Le2
            monitor-enter(r2)
            int r4 = r2.s     // Catch: java.lang.Throwable -> Ld6
            if (r4 != r3) goto Ld8
            r2.s = r0     // Catch: java.lang.Throwable -> Ld6
            r2.t = r1     // Catch: java.lang.Throwable -> Ld6
            monitor-exit(r2)
            r0 = 1
            r9.X = r0
            return
        Ld6:
            r9 = move-exception
            goto Le0
        Ld8:
            java.lang.String r9 = "already closed"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Ld6
            r0.<init>(r9)     // Catch: java.lang.Throwable -> Ld6
            throw r0     // Catch: java.lang.Throwable -> Ld6
        Le0:
            monitor-exit(r2)
            throw r9
        Le2:
            java.lang.String r9 = "Failed requirement."
            defpackage.i.h(r9)
            return
        Le8:
            java.net.ProtocolException r9 = new java.net.ProtocolException
            java.lang.String r0 = "Malformed close payload length of 1."
            r9.<init>(r0)
            throw r9
    }

    public final void k() {
            r8 = this;
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.NANOSECONDS
            boolean r1 = r8.X
            if (r1 != 0) goto L113
            z80 r1 = r8.A
            b67 r2 = r1.b()
            long r2 = r2.h()
            b67 r4 = r1.b()
            r4.b()
            byte r4 = r1.readByte()     // Catch: java.lang.Throwable -> L10a
            byte[] r5 = defpackage.yy7.a     // Catch: java.lang.Throwable -> L10a
            b67 r5 = r1.b()
            r5.g(r2, r0)
            r0 = r4 & 15
            r8.Y = r0
            r2 = r4 & 128(0x80, float:1.8E-43)
            r3 = 1
            r5 = 0
            if (r2 == 0) goto L30
            r2 = r3
            goto L31
        L30:
            r2 = r5
        L31:
            r8.d0 = r2
            r6 = r4 & 8
            if (r6 == 0) goto L39
            r6 = r3
            goto L3a
        L39:
            r6 = r5
        L3a:
            r8.e0 = r6
            if (r6 == 0) goto L49
            if (r2 == 0) goto L41
            goto L49
        L41:
            java.net.ProtocolException r8 = new java.net.ProtocolException
            java.lang.String r0 = "Control frames must be final."
            r8.<init>(r0)
            throw r8
        L49:
            r2 = r4 & 64
            if (r2 == 0) goto L4f
            r2 = r3
            goto L50
        L4f:
            r2 = r5
        L50:
            java.lang.String r6 = "Unexpected rsv1 flag"
            if (r0 == r3) goto L60
            r7 = 2
            if (r0 == r7) goto L60
            if (r2 != 0) goto L5a
            goto L71
        L5a:
            java.net.ProtocolException r8 = new java.net.ProtocolException
            r8.<init>(r6)
            throw r8
        L60:
            if (r2 == 0) goto L6e
            boolean r0 = r8.L
            if (r0 == 0) goto L68
            r0 = r3
            goto L6f
        L68:
            java.net.ProtocolException r8 = new java.net.ProtocolException
            r8.<init>(r6)
            throw r8
        L6e:
            r0 = r5
        L6f:
            r8.f0 = r0
        L71:
            r0 = r4 & 32
            if (r0 != 0) goto L102
            r0 = r4 & 16
            if (r0 != 0) goto Lfa
            byte r0 = r1.readByte()
            r2 = r0 & 128(0x80, float:1.8E-43)
            if (r2 == 0) goto L82
            r5 = r3
        L82:
            if (r5 == r3) goto Lf2
            r0 = r0 & 127(0x7f, float:1.78E-43)
            long r2 = (long) r0
            r8.Z = r2
            r6 = 126(0x7e, double:6.23E-322)
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 != 0) goto L9b
            short r0 = r1.readShort()
            r2 = 65535(0xffff, float:9.1834E-41)
            r0 = r0 & r2
            long r2 = (long) r0
            r8.Z = r2
            goto Ld2
        L9b:
            r6 = 127(0x7f, double:6.27E-322)
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 != 0) goto Ld2
            long r2 = r1.readLong()
            r8.Z = r2
            r6 = 0
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 < 0) goto Lae
            goto Ld2
        Lae:
            java.net.ProtocolException r0 = new java.net.ProtocolException
            long r1 = r8.Z
            java.util.TimeZone r8 = defpackage.az7.a
            java.lang.String r8 = java.lang.Long.toHexString(r1)
            r8.getClass()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Frame length 0x"
            r1.<init>(r2)
            r1.append(r8)
            java.lang.String r8 = " > 0x7FFFFFFFFFFFFFFF"
            r1.append(r8)
            java.lang.String r8 = r1.toString()
            r0.<init>(r8)
            throw r0
        Ld2:
            boolean r0 = r8.e0
            if (r0 == 0) goto Le7
            long r2 = r8.Z
            r6 = 125(0x7d, double:6.2E-322)
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 > 0) goto Ldf
            goto Le7
        Ldf:
            java.net.ProtocolException r8 = new java.net.ProtocolException
            java.lang.String r0 = "Control frame must be less than 125B."
            r8.<init>(r0)
            throw r8
        Le7:
            if (r5 == 0) goto Lf1
            byte[] r8 = r8.j0
            r8.getClass()
            r1.readFully(r8)
        Lf1:
            return
        Lf2:
            java.net.ProtocolException r8 = new java.net.ProtocolException
            java.lang.String r0 = "Server-sent frames must not be masked."
            r8.<init>(r0)
            throw r8
        Lfa:
            java.net.ProtocolException r8 = new java.net.ProtocolException
            java.lang.String r0 = "Unexpected rsv3 flag"
            r8.<init>(r0)
            throw r8
        L102:
            java.net.ProtocolException r8 = new java.net.ProtocolException
            java.lang.String r0 = "Unexpected rsv2 flag"
            r8.<init>(r0)
            throw r8
        L10a:
            r8 = move-exception
            b67 r1 = r1.b()
            r1.g(r2, r0)
            throw r8
        L113:
            java.lang.String r8 = "closed"
            defpackage.e41.i(r8)
            return
    }
}
