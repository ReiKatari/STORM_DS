package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: tz2  reason: default package */
/* loaded from: classes.dex */
public final class tz2 implements java.io.Closeable {
    public static final java.util.logging.Logger R = null;
    public final defpackage.z80 A;
    public final defpackage.sz2 B;
    public final defpackage.vy2 L;

    static {
            java.lang.Class<iz2> r0 = defpackage.iz2.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            r0.getClass()
            defpackage.tz2.R = r0
            return
    }

    public tz2(defpackage.fe5 r2) {
            r1 = this;
            r2.getClass()
            r1.<init>()
            r1.A = r2
            sz2 r0 = new sz2
            r0.<init>(r2)
            r1.B = r0
            vy2 r2 = new vy2
            r2.<init>(r0)
            r1.L = r2
            return
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
            r0 = this;
            z80 r0 = r0.A
            r0.close()
            return
    }

    public final boolean e(boolean r14, defpackage.i5 r15) {
            r13 = this;
            r0 = 0
            z80 r1 = r13.A     // Catch: java.io.EOFException -> L354
            r2 = 9
            r1.g0(r2)     // Catch: java.io.EOFException -> L354
            z80 r1 = r13.A
            int r1 = defpackage.yy7.o(r1)
            r2 = 16384(0x4000, float:2.2959E-41)
            if (r1 > r2) goto L34b
            z80 r3 = r13.A
            byte r3 = r3.readByte()
            r3 = r3 & 255(0xff, float:3.57E-43)
            z80 r4 = r13.A
            byte r4 = r4.readByte()
            r5 = r4 & 255(0xff, float:3.57E-43)
            z80 r6 = r13.A
            int r6 = r6.readInt()
            r7 = 2147483647(0x7fffffff, float:NaN)
            r7 = r7 & r6
            r8 = 8
            r9 = 1
            if (r3 == r8) goto L42
            java.util.logging.Logger r10 = defpackage.tz2.R
            java.util.logging.Level r11 = java.util.logging.Level.FINE
            boolean r11 = r10.isLoggable(r11)
            if (r11 == 0) goto L42
            java.lang.String r11 = defpackage.iz2.b(r9, r7, r1, r3, r5)
            r10.fine(r11)
        L42:
            r10 = 4
            if (r14 == 0) goto L52
            if (r3 != r10) goto L48
            goto L52
        L48:
            java.lang.String r13 = "Expected a SETTINGS frame but was "
            java.lang.String r14 = defpackage.iz2.a(r3)
            defpackage.e41.x(r14, r13)
            return r0
        L52:
            r14 = 0
            r11 = 5
            r12 = 2
            switch(r3) {
                case 0: goto L347;
                case 1: goto L343;
                case 2: goto L324;
                case 3: goto L294;
                case 4: goto L1f1;
                case 5: goto L1ed;
                case 6: goto L17e;
                case 7: goto Ld8;
                case 8: goto L5f;
                default: goto L58;
            }
        L58:
            z80 r13 = r13.A
            long r14 = (long) r1
            r13.skip(r14)
            return r9
        L5f:
            java.lang.String r14 = "TYPE_WINDOW_UPDATE length !=4: "
            if (r1 != r10) goto Lbc
            z80 r13 = r13.A     // Catch: java.lang.Exception -> Lb9
            int r13 = r13.readInt()     // Catch: java.lang.Exception -> Lb9
            r2 = 2147483647(0x7fffffff, double:1.060997895E-314)
            long r13 = (long) r13
            long r13 = r13 & r2
            r2 = 0
            int r0 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r0 == 0) goto Lb1
            java.util.logging.Logger r2 = defpackage.tz2.R
            java.util.logging.Level r3 = java.util.logging.Level.FINE
            boolean r3 = r2.isLoggable(r3)
            if (r3 == 0) goto L85
            java.lang.String r1 = defpackage.iz2.c(r9, r7, r1, r13)
            r2.fine(r1)
        L85:
            java.lang.Object r15 = r15.L
            qz2 r15 = (defpackage.qz2) r15
            if (r7 != 0) goto L9a
            monitor-enter(r15)
            long r0 = r15.q0     // Catch: java.lang.Throwable -> L96
            long r0 = r0 + r13
            r15.q0 = r0     // Catch: java.lang.Throwable -> L96
            r15.notifyAll()     // Catch: java.lang.Throwable -> L96
            monitor-exit(r15)
            return r9
        L96:
            r0 = move-exception
            r13 = r0
            monitor-exit(r15)
            throw r13
        L9a:
            xz2 r15 = r15.h(r7)
            if (r15 == 0) goto L307
            monitor-enter(r15)
            long r1 = r15.X     // Catch: java.lang.Throwable -> Lad
            long r1 = r1 + r13
            r15.X = r1     // Catch: java.lang.Throwable -> Lad
            if (r0 <= 0) goto Lab
            r15.notifyAll()     // Catch: java.lang.Throwable -> Lad
        Lab:
            monitor-exit(r15)
            return r9
        Lad:
            r0 = move-exception
            r13 = r0
            monitor-exit(r15)
            throw r13
        Lb1:
            java.io.IOException r13 = new java.io.IOException     // Catch: java.lang.Exception -> Lb9
            java.lang.String r14 = "windowSizeIncrement was 0"
            r13.<init>(r14)     // Catch: java.lang.Exception -> Lb9
            throw r13     // Catch: java.lang.Exception -> Lb9
        Lb9:
            r0 = move-exception
            r13 = r0
            goto Lce
        Lbc:
            java.io.IOException r13 = new java.io.IOException     // Catch: java.lang.Exception -> Lb9
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lb9
            r15.<init>(r14)     // Catch: java.lang.Exception -> Lb9
            r15.append(r1)     // Catch: java.lang.Exception -> Lb9
            java.lang.String r14 = r15.toString()     // Catch: java.lang.Exception -> Lb9
            r13.<init>(r14)     // Catch: java.lang.Exception -> Lb9
            throw r13     // Catch: java.lang.Exception -> Lb9
        Lce:
            java.util.logging.Logger r14 = defpackage.tz2.R
            java.lang.String r15 = defpackage.iz2.b(r9, r7, r1, r8, r5)
            r14.fine(r15)
            throw r13
        Ld8:
            if (r1 < r8) goto L174
            if (r7 != 0) goto L16e
            z80 r2 = r13.A
            int r2 = r2.readInt()
            z80 r3 = r13.A
            int r3 = r3.readInt()
            int r1 = r1 - r8
            z52 r4 = defpackage.a62.Companion
            r4.getClass()
            a62[] r4 = defpackage.a62.values()
            int r5 = r4.length
            r6 = r0
        Lf4:
            if (r6 >= r5) goto L103
            r7 = r4[r6]
            int r8 = r7.getHttpCode()
            if (r8 != r3) goto L100
            r14 = r7
            goto L103
        L100:
            int r6 = r6 + 1
            goto Lf4
        L103:
            if (r14 == 0) goto L164
            da0 r14 = defpackage.da0.R
            if (r1 <= 0) goto L110
            z80 r13 = r13.A
            long r3 = (long) r1
            da0 r14 = r13.l(r3)
        L110:
            r14.getClass()
            r14.d()
            java.lang.Object r13 = r15.L
            qz2 r13 = (defpackage.qz2) r13
            monitor-enter(r13)
            java.util.LinkedHashMap r14 = r13.B     // Catch: java.lang.Throwable -> L160
            java.util.Collection r14 = r14.values()     // Catch: java.lang.Throwable -> L160
            xz2[] r1 = new defpackage.xz2[r0]     // Catch: java.lang.Throwable -> L160
            java.lang.Object[] r14 = r14.toArray(r1)     // Catch: java.lang.Throwable -> L160
            r13.Y = r9     // Catch: java.lang.Throwable -> L160
            monitor-exit(r13)
            xz2[] r14 = (defpackage.xz2[]) r14
            int r13 = r14.length
        L12d:
            if (r0 >= r13) goto L307
            r1 = r14[r0]
            int r3 = r1.A
            if (r3 <= r2) goto L15d
            boolean r3 = r1.g()
            if (r3 == 0) goto L15d
            a62 r3 = defpackage.a62.REFUSED_STREAM
            r3.getClass()
            monitor-enter(r1)
            a62 r4 = r1.f()     // Catch: java.lang.Throwable -> L14d
            if (r4 != 0) goto L150
            r1.h0 = r3     // Catch: java.lang.Throwable -> L14d
            r1.notifyAll()     // Catch: java.lang.Throwable -> L14d
            goto L150
        L14d:
            r0 = move-exception
            r13 = r0
            goto L15b
        L150:
            monitor-exit(r1)
            java.lang.Object r3 = r15.L
            qz2 r3 = (defpackage.qz2) r3
            int r1 = r1.A
            r3.k(r1)
            goto L15d
        L15b:
            monitor-exit(r1)
            throw r13
        L15d:
            int r0 = r0 + 1
            goto L12d
        L160:
            r0 = move-exception
            r14 = r0
            monitor-exit(r13)
            throw r14
        L164:
            java.lang.String r13 = "TYPE_GOAWAY unexpected error code: "
            java.lang.String r13 = defpackage.lb1.g(r3, r13)
            defpackage.e41.i(r13)
            return r0
        L16e:
            java.lang.String r13 = "TYPE_GOAWAY streamId != 0"
            defpackage.e41.i(r13)
            return r0
        L174:
            java.lang.String r13 = "TYPE_GOAWAY length < 8: "
            java.lang.String r13 = defpackage.lb1.g(r1, r13)
            defpackage.e41.i(r13)
            return r0
        L17e:
            if (r1 != r8) goto L1e3
            if (r7 != 0) goto L1dd
            z80 r14 = r13.A
            int r14 = r14.readInt()
            z80 r13 = r13.A
            int r13 = r13.readInt()
            r1 = r4 & 1
            if (r1 == 0) goto L193
            r0 = r9
        L193:
            java.lang.Object r1 = r15.L
            qz2 r1 = (defpackage.qz2) r1
            if (r0 == 0) goto L1ba
            monitor-enter(r1)
            r2 = 1
            if (r14 == r9) goto L1b1
            if (r14 == r12) goto L1ab
            r13 = 3
            if (r14 == r13) goto L1a4
            goto L1b6
        L1a4:
            r1.notifyAll()     // Catch: java.lang.Throwable -> L1a8
            goto L1b6
        L1a8:
            r0 = move-exception
            r13 = r0
            goto L1b8
        L1ab:
            long r13 = r1.j0     // Catch: java.lang.Throwable -> L1a8
            long r13 = r13 + r2
            r1.j0 = r13     // Catch: java.lang.Throwable -> L1a8
            goto L1b6
        L1b1:
            long r13 = r1.h0     // Catch: java.lang.Throwable -> L1a8
            long r13 = r13 + r2
            r1.h0 = r13     // Catch: java.lang.Throwable -> L1a8
        L1b6:
            monitor-exit(r1)
            return r9
        L1b8:
            monitor-exit(r1)
            throw r13
        L1ba:
            pz6 r2 = r1.d0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Object r1 = r15.L
            qz2 r1 = (defpackage.qz2) r1
            java.lang.String r1 = r1.L
            java.lang.String r3 = " ping"
            java.lang.String r3 = defpackage.i61.n(r0, r1, r3)
            java.lang.Object r15 = r15.L
            qz2 r15 = (defpackage.qz2) r15
            pz2 r6 = new pz2
            r6.<init>(r15, r14, r13)
            r7 = 6
            r4 = 0
            defpackage.pz6.b(r2, r3, r4, r6, r7)
            return r9
        L1dd:
            java.lang.String r13 = "TYPE_PING streamId != 0"
            defpackage.e41.i(r13)
            return r0
        L1e3:
            java.lang.String r13 = "TYPE_PING length != 8: "
            java.lang.String r13 = defpackage.lb1.g(r1, r13)
            defpackage.e41.i(r13)
            return r0
        L1ed:
            r13.r(r15, r1, r5, r7)
            return r9
        L1f1:
            z80 r13 = r13.A
            if (r7 != 0) goto L28e
            r14 = r4 & 1
            if (r14 == 0) goto L203
            if (r1 != 0) goto L1fd
            goto L307
        L1fd:
            java.lang.String r13 = "FRAME_SIZE_ERROR ack frame should be empty!"
            defpackage.e41.i(r13)
            return r0
        L203:
            int r14 = r1 % 6
            if (r14 != 0) goto L284
            fd6 r14 = new fd6
            r14.<init>()
            l93 r1 = defpackage.gi2.R(r0, r1)
            r3 = 6
            j93 r1 = defpackage.gi2.P(r3, r1)
            int r3 = r1.A
            int r4 = r1.B
            int r1 = r1.L
            if (r1 <= 0) goto L21f
            if (r3 <= r4) goto L223
        L21f:
            if (r1 >= 0) goto L265
            if (r4 > r3) goto L265
        L223:
            short r5 = r13.readShort()
            byte[] r6 = defpackage.yy7.a
            r6 = 65535(0xffff, float:9.1834E-41)
            r5 = r5 & r6
            int r6 = r13.readInt()
            if (r5 == r12) goto L253
            if (r5 == r10) goto L24a
            if (r5 == r11) goto L238
            goto L25e
        L238:
            if (r6 < r2) goto L240
            r7 = 16777215(0xffffff, float:2.3509886E-38)
            if (r6 > r7) goto L240
            goto L25e
        L240:
            java.lang.String r13 = "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: "
            java.lang.String r13 = defpackage.lb1.g(r6, r13)
            defpackage.e41.i(r13)
            return r0
        L24a:
            if (r6 < 0) goto L24d
            goto L25e
        L24d:
            java.lang.String r13 = "PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1"
            defpackage.e41.i(r13)
            return r0
        L253:
            if (r6 == 0) goto L25e
            if (r6 != r9) goto L258
            goto L25e
        L258:
            java.lang.String r13 = "PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1"
            defpackage.e41.i(r13)
            return r0
        L25e:
            r14.b(r5, r6)
            if (r3 == r4) goto L265
            int r3 = r3 + r1
            goto L223
        L265:
            java.lang.Object r13 = r15.L
            qz2 r13 = (defpackage.qz2) r13
            pz6 r0 = r13.d0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r13 = r13.L
            java.lang.String r2 = " applyAndAckSettings"
            java.lang.String r1 = defpackage.i61.n(r1, r13, r2)
            ci2 r4 = new ci2
            r4.<init>(r10, r15, r14)
            r5 = 6
            r2 = 0
            defpackage.pz6.b(r0, r1, r2, r4, r5)
            return r9
        L284:
            java.lang.String r13 = "TYPE_SETTINGS length % 6 != 0: "
            java.lang.String r13 = defpackage.lb1.g(r1, r13)
            defpackage.e41.i(r13)
            return r0
        L28e:
            java.lang.String r13 = "TYPE_SETTINGS streamId != 0"
            defpackage.e41.i(r13)
            return r0
        L294:
            if (r1 != r10) goto L318
            if (r7 == 0) goto L312
            z80 r13 = r13.A
            int r13 = r13.readInt()
            z52 r1 = defpackage.a62.Companion
            r1.getClass()
            a62[] r1 = defpackage.a62.values()
            int r2 = r1.length
            r3 = r0
        L2a9:
            if (r3 >= r2) goto L2b8
            r4 = r1[r3]
            int r5 = r4.getHttpCode()
            if (r5 != r13) goto L2b5
            r14 = r4
            goto L2b8
        L2b5:
            int r3 = r3 + 1
            goto L2a9
        L2b8:
            if (r14 == 0) goto L308
            java.lang.Object r13 = r15.L
            qz2 r13 = (defpackage.qz2) r13
            if (r7 == 0) goto L2ed
            r15 = r6 & 1
            if (r15 != 0) goto L2ed
            pz6 r0 = r13.e0
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.String r1 = r13.L
            r15.append(r1)
            r1 = 91
            r15.append(r1)
            r15.append(r7)
            java.lang.String r1 = "] onReset"
            r15.append(r1)
            java.lang.String r1 = r15.toString()
            mz2 r4 = new mz2
            r4.<init>(r13, r7, r14)
            r5 = 6
            r2 = 0
            defpackage.pz6.b(r0, r1, r2, r4, r5)
            return r9
        L2ed:
            xz2 r13 = r13.k(r7)
            if (r13 == 0) goto L307
            monitor-enter(r13)
            a62 r15 = r13.f()     // Catch: java.lang.Throwable -> L300
            if (r15 != 0) goto L303
            r13.h0 = r14     // Catch: java.lang.Throwable -> L300
            r13.notifyAll()     // Catch: java.lang.Throwable -> L300
            goto L303
        L300:
            r0 = move-exception
            r14 = r0
            goto L305
        L303:
            monitor-exit(r13)
            return r9
        L305:
            monitor-exit(r13)
            throw r14
        L307:
            return r9
        L308:
            java.lang.String r14 = "TYPE_RST_STREAM unexpected error code: "
            java.lang.String r13 = defpackage.lb1.g(r13, r14)
            defpackage.e41.i(r13)
            return r0
        L312:
            java.lang.String r13 = "TYPE_RST_STREAM streamId == 0"
            defpackage.e41.i(r13)
            return r0
        L318:
            java.lang.String r13 = "TYPE_RST_STREAM length: "
            java.lang.String r14 = " != 4"
            java.lang.String r13 = defpackage.lb1.k(r13, r1, r14)
            defpackage.e41.i(r13)
            return r0
        L324:
            if (r1 != r11) goto L337
            if (r7 == 0) goto L331
            z80 r13 = r13.A
            r13.readInt()
            r13.readByte()
            return r9
        L331:
            java.lang.String r13 = "TYPE_PRIORITY streamId == 0"
            defpackage.e41.i(r13)
            return r0
        L337:
            java.lang.String r13 = "TYPE_PRIORITY length: "
            java.lang.String r14 = " != 5"
            java.lang.String r13 = defpackage.lb1.k(r13, r1, r14)
            defpackage.e41.i(r13)
            return r0
        L343:
            r13.n(r15, r1, r5, r7)
            return r9
        L347:
            r13.h(r15, r1, r5, r7)
            return r9
        L34b:
            java.lang.String r13 = "FRAME_SIZE_ERROR: "
            java.lang.String r13 = defpackage.lb1.g(r1, r13)
            defpackage.e41.i(r13)
        L354:
            return r0
    }

    public final void h(defpackage.i5 r19, int r20, int r21, int r22) {
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r21
            r3 = r22
            if (r3 == 0) goto L133
            r4 = r2 & 1
            r6 = 1
            if (r4 == 0) goto L11
            r4 = r6
            goto L13
        L11:
            r4 = r6
            r6 = 0
        L13:
            r7 = r2 & 32
            if (r7 != 0) goto L12d
            r7 = r2 & 8
            if (r7 == 0) goto L28
            z80 r7 = r0.A
            byte r7 = r7.readByte()
            byte[] r8 = defpackage.yy7.a
            r7 = r7 & 255(0xff, float:3.57E-43)
        L25:
            r8 = r20
            goto L2a
        L28:
            r7 = 0
            goto L25
        L2a:
            int r2 = defpackage.hi2.G(r8, r2, r7)
            z80 r8 = r0.A
            r8.getClass()
            java.lang.Object r9 = r1.L
            qz2 r9 = (defpackage.qz2) r9
            if (r3 == 0) goto L3f
            r10 = r3 & 1
            if (r10 != 0) goto L3f
            r10 = r4
            goto L40
        L3f:
            r10 = 0
        L40:
            if (r10 == 0) goto L7d
            k80 r4 = new k80
            r4.<init>()
            long r10 = (long) r2
            r8.g0(r10)
            r8.b0(r4, r10)
            pz6 r12 = r9.e0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r5 = r9.L
            r1.append(r5)
            r5 = 91
            r1.append(r5)
            r1.append(r3)
            java.lang.String r5 = "] onData"
            r1.append(r5)
            java.lang.String r13 = r1.toString()
            kz2 r16 = new kz2
            r5 = r2
            r2 = r9
            r1 = r16
            r1.<init>(r2, r3, r4, r5, r6)
            r17 = 6
            r14 = 0
            defpackage.pz6.b(r12, r13, r14, r16, r17)
            goto L126
        L7d:
            xz2 r9 = r9.h(r3)
            if (r9 != 0) goto L99
            java.lang.Object r4 = r1.L
            qz2 r4 = (defpackage.qz2) r4
            a62 r5 = defpackage.a62.PROTOCOL_ERROR
            r4.v(r3, r5)
            java.lang.Object r1 = r1.L
            qz2 r1 = (defpackage.qz2) r1
            long r2 = (long) r2
            r1.r(r2)
            r8.skip(r2)
            goto L126
        L99:
            java.util.TimeZone r1 = defpackage.az7.a
            vz2 r1 = r9.d0
            long r2 = (long) r2
            r1.getClass()
            r10 = r2
        La2:
            r12 = 0
            int r14 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            xz2 r15 = r1.Y
            if (r14 <= 0) goto L10e
            monitor-enter(r15)
            boolean r14 = r1.B     // Catch: java.lang.Throwable -> L10b
            k80 r5 = r1.R     // Catch: java.lang.Throwable -> L10b
            r19 = r12
            long r12 = r5.B     // Catch: java.lang.Throwable -> L10b
            long r12 = r12 + r10
            long r4 = r1.A     // Catch: java.lang.Throwable -> L10b
            int r4 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r4 <= 0) goto Lbc
            r4 = 1
            goto Lbd
        Lbc:
            r4 = 0
        Lbd:
            monitor-exit(r15)
            if (r4 == 0) goto Lcb
            r8.skip(r10)
            xz2 r1 = r1.Y
            a62 r2 = defpackage.a62.FLOW_CONTROL_ERROR
            r1.e(r2)
            goto L11e
        Lcb:
            if (r14 == 0) goto Ld1
            r8.skip(r10)
            goto L11e
        Ld1:
            k80 r4 = r1.L
            long r4 = r8.b0(r4, r10)
            r12 = -1
            int r12 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r12 == 0) goto L107
            long r10 = r10 - r4
            xz2 r4 = r1.Y
            monitor-enter(r4)
            boolean r5 = r1.X     // Catch: java.lang.Throwable -> Leb
            if (r5 == 0) goto Led
            k80 r5 = r1.L     // Catch: java.lang.Throwable -> Leb
            r5.e()     // Catch: java.lang.Throwable -> Leb
            goto L102
        Leb:
            r0 = move-exception
            goto L105
        Led:
            k80 r5 = r1.R     // Catch: java.lang.Throwable -> Leb
            long r12 = r5.B     // Catch: java.lang.Throwable -> Leb
            int r12 = (r12 > r19 ? 1 : (r12 == r19 ? 0 : -1))
            if (r12 != 0) goto Lf7
            r12 = 1
            goto Lf8
        Lf7:
            r12 = 0
        Lf8:
            k80 r13 = r1.L     // Catch: java.lang.Throwable -> Leb
            r5.m0(r13)     // Catch: java.lang.Throwable -> Leb
            if (r12 == 0) goto L102
            r4.notifyAll()     // Catch: java.lang.Throwable -> Leb
        L102:
            monitor-exit(r4)
            r4 = 1
            goto La2
        L105:
            monitor-exit(r4)
            throw r0
        L107:
            defpackage.i.n()
            return
        L10b:
            r0 = move-exception
            monitor-exit(r15)
            throw r0
        L10e:
            java.util.TimeZone r4 = defpackage.az7.a
            qz2 r4 = r15.B
            r4.r(r2)
            xz2 r1 = r1.Y
            qz2 r1 = r1.B
            oe2 r1 = r1.l0
            r1.getClass()
        L11e:
            if (r6 == 0) goto L126
            yw2 r1 = defpackage.yw2.B
            r4 = 1
            r9.i(r1, r4)
        L126:
            z80 r0 = r0.A
            long r1 = (long) r7
            r0.skip(r1)
            return
        L12d:
            java.lang.String r0 = "PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA"
            defpackage.e41.i(r0)
            return
        L133:
            java.lang.String r0 = "PROTOCOL_ERROR: TYPE_DATA streamId == 0"
            defpackage.e41.i(r0)
            return
    }

    public final java.util.List k(int r4, int r5, int r6, int r7) {
            r3 = this;
            sz2 r0 = r3.B
            r0.X = r4
            r0.B = r4
            r0.Y = r5
            r0.L = r6
            r0.R = r7
            vy2 r3 = r3.L
            fe5 r4 = r3.c
            java.util.ArrayList r5 = r3.b
        L12:
            boolean r6 = r4.e()
            if (r6 != 0) goto L122
            byte r6 = r4.readByte()
            byte[] r7 = defpackage.yy7.a
            r7 = r6 & 255(0xff, float:3.57E-43)
            r0 = 0
            r1 = 128(0x80, float:1.8E-43)
            if (r7 == r1) goto L11c
            r2 = r6 & 128(0x80, float:1.8E-43)
            if (r2 != r1) goto L63
            r6 = 127(0x7f, float:1.78E-43)
            int r6 = r3.e(r7, r6)
            int r7 = r6 + (-1)
            if (r7 < 0) goto L40
            uw2[] r1 = defpackage.xy2.a
            int r2 = r1.length
            int r2 = r2 + (-1)
            if (r7 > r2) goto L40
            r6 = r1[r7]
            r5.add(r6)
            goto L12
        L40:
            uw2[] r1 = defpackage.xy2.a
            int r1 = r1.length
            int r7 = r7 - r1
            int r1 = r3.e
            int r1 = r1 + 1
            int r1 = r1 + r7
            if (r1 < 0) goto L59
            uw2[] r7 = r3.d
            int r2 = r7.length
            if (r1 >= r2) goto L59
            r6 = r7[r1]
            r6.getClass()
            r5.add(r6)
            goto L12
        L59:
            java.lang.String r3 = "Header index too large "
            java.lang.String r3 = defpackage.lb1.g(r6, r3)
            defpackage.e41.i(r3)
            return r0
        L63:
            r1 = 64
            if (r7 != r1) goto L7d
            uw2[] r6 = defpackage.xy2.a
            da0 r6 = r3.d()
            defpackage.xy2.a(r6)
            da0 r7 = r3.d()
            uw2 r0 = new uw2
            r0.<init>(r6, r7)
            r3.c(r0)
            goto L12
        L7d:
            r2 = r6 & 64
            if (r2 != r1) goto L9b
            r6 = 63
            int r6 = r3.e(r7, r6)
            int r6 = r6 + (-1)
            da0 r6 = r3.b(r6)
            da0 r7 = r3.d()
            uw2 r0 = new uw2
            r0.<init>(r6, r7)
            r3.c(r0)
            goto L12
        L9b:
            r6 = r6 & 32
            r1 = 32
            if (r6 != r1) goto Le4
            r6 = 31
            int r6 = r3.e(r7, r6)
            r3.a = r6
            if (r6 < 0) goto Lce
            r7 = 4096(0x1000, float:5.74E-42)
            if (r6 > r7) goto Lce
            int r7 = r3.g
            if (r6 >= r7) goto L12
            if (r6 != 0) goto Lc8
            uw2[] r6 = r3.d
            defpackage.fv.B0(r6, r0)
            uw2[] r6 = r3.d
            int r6 = r6.length
            int r6 = r6 + (-1)
            r3.e = r6
            r6 = 0
            r3.f = r6
            r3.g = r6
            goto L12
        Lc8:
            int r7 = r7 - r6
            r3.a(r7)
            goto L12
        Lce:
            java.io.IOException r4 = new java.io.IOException
            int r3 = r3.a
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Invalid dynamic table size update "
            r5.<init>(r6)
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            r4.<init>(r3)
            throw r4
        Le4:
            r6 = 16
            if (r7 == r6) goto L105
            if (r7 != 0) goto Leb
            goto L105
        Leb:
            r6 = 15
            int r6 = r3.e(r7, r6)
            int r6 = r6 + (-1)
            da0 r6 = r3.b(r6)
            da0 r7 = r3.d()
            uw2 r0 = new uw2
            r0.<init>(r6, r7)
            r5.add(r0)
            goto L12
        L105:
            uw2[] r6 = defpackage.xy2.a
            da0 r6 = r3.d()
            defpackage.xy2.a(r6)
            da0 r7 = r3.d()
            uw2 r0 = new uw2
            r0.<init>(r6, r7)
            r5.add(r0)
            goto L12
        L11c:
            java.lang.String r3 = "index == 0"
            defpackage.e41.i(r3)
            return r0
        L122:
            java.util.List r3 = defpackage.gt0.k1(r5)
            r5.clear()
            return r3
    }

    public final void n(defpackage.i5 r14, int r15, int r16, int r17) {
            r13 = this;
            r0 = r16
            r1 = r17
            if (r1 == 0) goto Le2
            r2 = r0 & 1
            r3 = 0
            r4 = 1
            if (r2 == 0) goto Le
            r2 = r4
            goto L10
        Le:
            r2 = r4
            r4 = r3
        L10:
            r5 = r0 & 8
            if (r5 == 0) goto L1f
            z80 r5 = r13.A
            byte r5 = r5.readByte()
            byte[] r6 = defpackage.yy7.a
            r5 = r5 & 255(0xff, float:3.57E-43)
            goto L20
        L1f:
            r5 = r3
        L20:
            r6 = r0 & 32
            if (r6 == 0) goto L31
            z80 r6 = r13.A
            r6.readInt()
            r6.readByte()
            byte[] r6 = defpackage.yy7.a
            int r6 = r15 + (-5)
            goto L32
        L31:
            r6 = r15
        L32:
            int r6 = defpackage.hi2.G(r6, r0, r5)
            java.util.List r13 = r13.k(r6, r5, r0, r1)
            java.lang.Object r14 = r14.L
            qz2 r14 = (defpackage.qz2) r14
            if (r1 == 0) goto L45
            r0 = r1 & 1
            if (r0 != 0) goto L45
            r3 = r2
        L45:
            r6 = 91
            if (r3 == 0) goto L70
            pz6 r7 = r14.e0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = r14.L
            r0.append(r2)
            r0.append(r6)
            r0.append(r1)
            java.lang.String r2 = "] onHeaders"
            r0.append(r2)
            java.lang.String r8 = r0.toString()
            lz2 r11 = new lz2
            r11.<init>(r14, r1, r13, r4)
            r12 = 6
            r9 = 0
            defpackage.pz6.b(r7, r8, r9, r11, r12)
            return
        L70:
            monitor-enter(r14)
            xz2 r0 = r14.h(r1)     // Catch: java.lang.Throwable -> Ld3
            if (r0 != 0) goto Ld6
            boolean r0 = r14.Y     // Catch: java.lang.Throwable -> Ld3
            if (r0 == 0) goto L7d
            monitor-exit(r14)
            return
        L7d:
            int r0 = r14.R     // Catch: java.lang.Throwable -> Ld3
            if (r1 > r0) goto L83
            monitor-exit(r14)
            return
        L83:
            int r0 = r1 % 2
            int r2 = r14.X     // Catch: java.lang.Throwable -> Ld3
            int r2 = r2 % 2
            if (r0 != r2) goto L8d
            monitor-exit(r14)
            return
        L8d:
            yw2 r5 = defpackage.az7.h(r13)     // Catch: java.lang.Throwable -> Ld3
            xz2 r0 = new xz2     // Catch: java.lang.Throwable -> Ld3
            r3 = 0
            r2 = r14
            r0.<init>(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> Ld0
            r2.R = r1     // Catch: java.lang.Throwable -> Ld0
            java.util.LinkedHashMap r13 = r2.B     // Catch: java.lang.Throwable -> Ld0
            java.lang.Integer r14 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> Ld0
            r13.put(r14, r0)     // Catch: java.lang.Throwable -> Ld0
            qz6 r13 = r2.Z     // Catch: java.lang.Throwable -> Ld0
            pz6 r7 = r13.d()     // Catch: java.lang.Throwable -> Ld0
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Ld0
            r13.<init>()     // Catch: java.lang.Throwable -> Ld0
            java.lang.String r14 = r2.L     // Catch: java.lang.Throwable -> Ld0
            r13.append(r14)     // Catch: java.lang.Throwable -> Ld0
            r13.append(r6)     // Catch: java.lang.Throwable -> Ld0
            r13.append(r1)     // Catch: java.lang.Throwable -> Ld0
            java.lang.String r14 = "] onStream"
            r13.append(r14)     // Catch: java.lang.Throwable -> Ld0
            java.lang.String r8 = r13.toString()     // Catch: java.lang.Throwable -> Ld0
            ci2 r11 = new ci2     // Catch: java.lang.Throwable -> Ld0
            r13 = 3
            r11.<init>(r13, r2, r0)     // Catch: java.lang.Throwable -> Ld0
            r12 = 6
            r9 = 0
            defpackage.pz6.b(r7, r8, r9, r11, r12)     // Catch: java.lang.Throwable -> Ld0
            monitor-exit(r2)
            return
        Ld0:
            r0 = move-exception
        Ld1:
            r13 = r0
            goto Le0
        Ld3:
            r0 = move-exception
            r2 = r14
            goto Ld1
        Ld6:
            r2 = r14
            monitor-exit(r2)
            yw2 r13 = defpackage.az7.h(r13)
            r0.i(r13, r4)
            return
        Le0:
            monitor-exit(r2)
            throw r13
        Le2:
            java.lang.String r13 = "PROTOCOL_ERROR: TYPE_HEADERS streamId == 0"
            defpackage.e41.i(r13)
            return
    }

    public final void r(defpackage.i5 r9, int r10, int r11, int r12) {
            r8 = this;
            if (r12 == 0) goto L76
            r0 = r11 & 8
            if (r0 == 0) goto L11
            z80 r0 = r8.A
            byte r0 = r0.readByte()
            byte[] r1 = defpackage.yy7.a
            r0 = r0 & 255(0xff, float:3.57E-43)
            goto L12
        L11:
            r0 = 0
        L12:
            z80 r1 = r8.A
            int r1 = r1.readInt()
            r2 = 2147483647(0x7fffffff, float:NaN)
            r1 = r1 & r2
            int r10 = r10 + (-4)
            int r10 = defpackage.hi2.G(r10, r11, r0)
            java.util.List r8 = r8.k(r10, r0, r11, r12)
            java.lang.Object r9 = r9.L
            qz2 r9 = (defpackage.qz2) r9
            monitor-enter(r9)
            java.util.LinkedHashSet r10 = r9.u0     // Catch: java.lang.Throwable -> L3e
            java.lang.Integer r11 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L3e
            boolean r10 = r10.contains(r11)     // Catch: java.lang.Throwable -> L3e
            if (r10 == 0) goto L41
            a62 r8 = defpackage.a62.PROTOCOL_ERROR     // Catch: java.lang.Throwable -> L3e
            r9.v(r1, r8)     // Catch: java.lang.Throwable -> L3e
            monitor-exit(r9)
            return
        L3e:
            r0 = move-exception
            r8 = r0
            goto L74
        L41:
            java.util.LinkedHashSet r10 = r9.u0     // Catch: java.lang.Throwable -> L3e
            java.lang.Integer r11 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L3e
            r10.add(r11)     // Catch: java.lang.Throwable -> L3e
            monitor-exit(r9)
            pz6 r2 = r9.e0
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = r9.L
            r10.append(r11)
            r11 = 91
            r10.append(r11)
            r10.append(r1)
            java.lang.String r11 = "] onRequest"
            r10.append(r11)
            java.lang.String r3 = r10.toString()
            lz2 r6 = new lz2
            r6.<init>(r9, r1, r8)
            r7 = 6
            r4 = 0
            defpackage.pz6.b(r2, r3, r4, r6, r7)
            return
        L74:
            monitor-exit(r9)
            throw r8
        L76:
            java.lang.String r8 = "PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0"
            defpackage.e41.i(r8)
            return
    }
}
