package me.magnum.melonds.impl.emulator;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class EmulatorMessageQueue {
    public final defpackage.h61 a;
    public final android.os.HandlerThread b;
    public final android.os.Handler c;
    public android.os.ParcelFileDescriptor d;
    public java.io.FileInputStream e;
    public boolean f;
    public final java.nio.ByteBuffer g;
    public final java.nio.ByteBuffer h;

    public EmulatorMessageQueue(defpackage.h61 r2) {
            r1 = this;
            r1.<init>()
            r1.a = r2
            android.os.HandlerThread r2 = new android.os.HandlerThread
            java.lang.String r0 = "EmulatorMessageQueue"
            r2.<init>(r0)
            r2.start()
            r1.b = r2
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r2 = r2.getLooper()
            r0.<init>(r2)
            r1.c = r0
            r2 = 8
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocateDirect(r2)
            java.nio.ByteOrder r0 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteBuffer r2 = r2.order(r0)
            r1.g = r2
            r2 = 128(0x80, float:1.8E-43)
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocateDirect(r2)
            java.nio.ByteOrder r0 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteBuffer r2 = r2.order(r0)
            r1.h = r2
            return
    }

    public static final /* synthetic */ int a() {
            int r0 = initMessagePipe()
            return r0
    }

    private static final native void closeMessagePipe();

    private static final native int initMessagePipe();

    public final void b() {
            r30 = this;
            r0 = r30
            java.io.FileInputStream r1 = r0.e
            if (r1 != 0) goto L8
            goto L54a
        L8:
            java.nio.ByteBuffer r2 = r0.g
            r2.clear()
            java.nio.channels.FileChannel r2 = r1.getChannel()
            java.nio.ByteBuffer r3 = r0.g
            int r2 = r2.read(r3)
            java.nio.ByteBuffer r3 = r0.g
            r4 = 0
            r3.position(r4)
            r3 = 8
            if (r2 >= r3) goto L23
            goto L54a
        L23:
            java.nio.ByteBuffer r2 = r0.g
            int r2 = r2.getInt()
            java.nio.ByteBuffer r3 = r0.g
            int r3 = r3.getInt()
            if (r3 <= 0) goto L4e
            java.nio.ByteBuffer r5 = r0.h
            r5.position(r4)
            java.nio.ByteBuffer r5 = r0.h
            r5.limit(r3)
            java.nio.channels.FileChannel r1 = r1.getChannel()
            java.nio.ByteBuffer r5 = r0.h
            int r1 = r1.read(r5)
            java.nio.ByteBuffer r5 = r0.h
            r5.position(r4)
            if (r1 >= r3) goto L4e
            goto L54a
        L4e:
            t52 r1 = defpackage.mw1.getEntries()
            java.util.Iterator r1 = r1.iterator()
        L56:
            boolean r3 = r1.hasNext()
            r5 = 0
            if (r3 == 0) goto L6b
            java.lang.Object r3 = r1.next()
            r6 = r3
            mw1 r6 = (defpackage.mw1) r6
            int r6 = r6.getEvent()
            if (r6 != r2) goto L56
            goto L6c
        L6b:
            r3 = r5
        L6c:
            mw1 r3 = (defpackage.mw1) r3
            if (r3 == 0) goto L54a
            h61 r1 = r0.a
            java.nio.ByteBuffer r0 = r0.h
            r0.getClass()
            java.lang.Object r1 = r1.B
            r6 = r1
            jh r6 = (defpackage.jh) r6
            int[] r1 = defpackage.vg.a
            int r2 = r3.ordinal()
            r1 = r1[r2]
            r2 = 1
            java.lang.String r3 = "tracker_display="
            r7 = 0
            r9 = 4
            r10 = 32
            switch(r1) {
                case 1: goto L53c;
                case 2: goto L534;
                case 3: goto L512;
                case 4: goto L4e3;
                case 5: goto L4cc;
                case 6: goto L4bd;
                case 7: goto L4ae;
                case 8: goto L49f;
                case 9: goto L460;
                case 10: goto L451;
                case 11: goto L442;
                case 12: goto L424;
                case 13: goto L41c;
                case 14: goto L414;
                case 15: goto L3f0;
                case 16: goto L362;
                case 17: goto L33e;
                case 18: goto L305;
                case 19: goto L2f6;
                case 20: goto L2d2;
                case 21: goto L286;
                case 22: goto L227;
                case 23: goto L1d1;
                case 24: goto L1a6;
                case 25: goto L122;
                case 26: goto Lba;
                case 27: goto L93;
                default: goto L8f;
            }
        L8f:
            defpackage.i.d()
            return
        L93:
            int r1 = r0.remaining()
            r2 = 16
            if (r1 >= r2) goto L9c
            goto Lb2
        L9c:
            long r1 = r0.getLong()
            long r3 = r0.getLong()
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 <= 0) goto Lb2
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 > 0) goto Lad
            goto Lb2
        Lad:
            g95 r5 = new g95
            r5.<init>(r1, r3)
        Lb2:
            if (r5 == 0) goto L54a
            of6 r0 = r6.n
            r0.k(r5)
            return
        Lba:
            int r1 = r0.remaining()
            r2 = 28
            if (r1 >= r2) goto Lc3
            goto L11a
        Lc3:
            long r10 = r0.getLong()
            long r12 = r0.getLong()
            int r1 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r1 <= 0) goto L11a
            int r1 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            if (r1 > 0) goto Ld4
            goto L11a
        Ld4:
            hc5 r1 = defpackage.ic5.Companion
            int r2 = r0.getInt()
            r1.getClass()
            ic5 r14 = defpackage.hc5.a(r2)
            if (r14 != 0) goto Le4
            goto L11a
        Le4:
            fc5 r1 = defpackage.gc5.Companion
            int r2 = r0.getInt()
            r1.getClass()
            t52 r1 = defpackage.gc5.getEntries()
            java.util.Iterator r1 = r1.iterator()
        Lf5:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L109
            java.lang.Object r3 = r1.next()
            r4 = r3
            gc5 r4 = (defpackage.gc5) r4
            int r4 = r4.getWireValue()
            if (r4 != r2) goto Lf5
            goto L10a
        L109:
            r3 = r5
        L10a:
            r15 = r3
            gc5 r15 = (defpackage.gc5) r15
            if (r15 != 0) goto L110
            goto L11a
        L110:
            h95 r9 = new h95
            int r16 = r0.getInt()
            r9.<init>(r10, r12, r14, r15, r16)
            r5 = r9
        L11a:
            if (r5 == 0) goto L54a
            of6 r0 = r6.n
            r0.k(r5)
            return
        L122:
            int r1 = r0.remaining()
            r3 = 104(0x68, float:1.46E-43)
            if (r1 >= r3) goto L12c
            goto L19e
        L12c:
            long r12 = r0.getLong()
            long r14 = r0.getLong()
            int r1 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            if (r1 <= 0) goto L19e
            int r1 = (r14 > r7 ? 1 : (r14 == r7 ? 0 : -1))
            if (r1 > 0) goto L13d
            goto L19e
        L13d:
            long r16 = r0.getLong()
            long r18 = r0.getLong()
            long r21 = r0.getLong()
            long r23 = r0.getLong()
            long r25 = r0.getLong()
            hc5 r1 = defpackage.ic5.Companion
            int r3 = r0.getInt()
            r1.getClass()
            ic5 r20 = defpackage.hc5.a(r3)
            if (r20 != 0) goto L161
            goto L19e
        L161:
            int r27 = r0.getInt()
            int r1 = r0.getInt()
            if (r1 == 0) goto L16e
            r28 = r2
            goto L170
        L16e:
            r28 = r4
        L170:
            int r1 = r0.remaining()
            if (r1 < r9) goto L17b
            int r1 = r0.getInt()
            goto L17c
        L17b:
            r1 = r4
        L17c:
            int r2 = r0.remaining()
            if (r10 <= r2) goto L183
            r10 = r2
        L183:
            byte[] r2 = new byte[r10]
            r0.get(r2)
            if (r1 >= 0) goto L18b
            r1 = r4
        L18b:
            if (r1 <= r10) goto L18e
            goto L18f
        L18e:
            r10 = r1
        L18f:
            java.lang.String r0 = new java.lang.String
            java.nio.charset.Charset r1 = defpackage.qm0.a
            r0.<init>(r2, r4, r10, r1)
            f95 r11 = new f95
            r29 = r0
            r11.<init>(r12, r14, r16, r18, r20, r21, r23, r25, r27, r28, r29)
            r5 = r11
        L19e:
            if (r5 == 0) goto L54a
            of6 r0 = r6.n
            r0.k(r5)
            return
        L1a6:
            b95 r1 = new b95
            long r2 = r0.getLong()
            r1.<init>(r2)
            bg1 r0 = r6.q
            r0.k()
            boolean r0 = r6.p
            if (r0 == 0) goto L1cb
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r4 = "event_type=jni_event_received jni_event=RUNTIME_RESET attempt_floor="
            r0.<init>(r4)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "RASubmission"
            android.util.Log.i(r2, r0)
        L1cb:
            of6 r0 = r6.n
            r0.k(r1)
            return
        L1d1:
            d95 r7 = new d95
            long r1 = r0.getLong()
            long r10 = r0.getLong()
            long r12 = r0.getLong()
            int r14 = r0.getInt()
            int r3 = r0.remaining()
            if (r3 < r9) goto L1ee
            int r3 = r0.getInt()
            goto L1ef
        L1ee:
            r3 = r4
        L1ef:
            int r5 = r0.remaining()
            r8 = 48
            if (r8 <= r5) goto L1f8
            goto L1f9
        L1f8:
            r5 = r8
        L1f9:
            byte[] r8 = new byte[r5]
            r0.get(r8)
            if (r3 >= 0) goto L201
            r3 = r4
        L201:
            if (r3 <= r5) goto L204
            goto L205
        L204:
            r5 = r3
        L205:
            java.lang.String r15 = new java.lang.String
            java.nio.charset.Charset r0 = defpackage.qm0.a
            r15.<init>(r8, r4, r5, r0)
            r8 = r1
            r7.<init>(r8, r10, r12, r14, r15)
            r0 = r7
            bg1 r1 = r6.q
            r1.j(r8, r10)
            java.lang.String r1 = "result="
            java.lang.String r14 = defpackage.lb1.g(r14, r1)
            java.lang.String r7 = "SERVER_ERROR"
            r6.h(r7, r8, r10, r12, r14)
            of6 r1 = r6.n
            r1.k(r0)
            return
        L227:
            long r8 = r0.getLong()
            long r1 = r0.getLong()
            long r12 = r0.getLong()
            int r3 = r0.getInt()
            long r3 = (long) r3
            r14 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r16 = r3 & r14
            int r3 = r0.getInt()
            long r3 = (long) r3
            long r18 = r3 & r14
            java.lang.String r14 = defpackage.cs1.t(r10, r0)
            java.lang.String r15 = defpackage.cs1.t(r10, r0)
            c95 r7 = new c95
            r10 = r1
            r7.<init>(r8, r10, r12, r14, r15, r16, r18)
            r4 = r7
            r0 = r16
            r2 = r18
            bg1 r5 = r6.q
            r5.j(r8, r10)
            java.lang.String r5 = " best_score="
            java.lang.String r7 = " rank="
            r16 = r6
            java.lang.String r6 = "submitted_score="
            java.lang.StringBuilder r5 = defpackage.i61.u(r6, r14, r5, r15, r7)
            r5.append(r0)
            java.lang.String r0 = " num_entries="
            r5.append(r0)
            r5.append(r2)
            java.lang.String r14 = r5.toString()
            java.lang.String r7 = "SCOREBOARD"
            r6 = r16
            r6.h(r7, r8, r10, r12, r14)
            of6 r0 = r6.n
            r0.k(r4)
            return
        L286:
            z85 r7 = new z85
            long r1 = r0.getLong()
            long r11 = r0.getLong()
            r14 = r11
            long r12 = r0.getLong()
            int r5 = r0.remaining()
            if (r5 < r9) goto L2a0
            int r5 = r0.getInt()
            goto L2a1
        L2a0:
            r5 = r4
        L2a1:
            int r8 = r0.remaining()
            if (r10 <= r8) goto L2a8
            r10 = r8
        L2a8:
            byte[] r8 = new byte[r10]
            r0.get(r8)
            if (r5 >= 0) goto L2b0
            r5 = r4
        L2b0:
            if (r5 <= r10) goto L2b4
        L2b2:
            r15 = r14
            goto L2b6
        L2b4:
            r10 = r5
            goto L2b2
        L2b6:
            java.lang.String r14 = new java.lang.String
            java.nio.charset.Charset r0 = defpackage.qm0.a
            r14.<init>(r8, r4, r10, r0)
            r8 = r1
            r10 = r15
            r7.<init>(r8, r10, r12, r14)
            r0 = r7
            java.lang.String r7 = "SUBMITTED"
            java.lang.String r14 = r3.concat(r14)
            r6.h(r7, r8, r10, r12, r14)
            of6 r1 = r6.n
            r1.k(r0)
            return
        L2d2:
            e95 r7 = new e95
            long r8 = r0.getLong()
            long r10 = r0.getLong()
            long r12 = r0.getLong()
            r7.<init>(r8, r10, r12)
            r0 = r7
            bg1 r1 = r6.q
            r1.j(r8, r10)
            java.lang.String r7 = "TRACKER_HIDE"
            java.lang.String r14 = ""
            r6.h(r7, r8, r10, r12, r14)
            of6 r1 = r6.n
            r1.k(r0)
            return
        L2f6:
            of6 r1 = r6.n
            q85 r2 = new q85
            long r3 = r0.getLong()
            r2.<init>(r3)
            r1.k(r2)
            return
        L305:
            x85 r1 = new x85
            long r2 = r0.getLong()
            int r5 = r0.getInt()
            int r7 = r0.remaining()
            if (r7 < r9) goto L31a
            int r7 = r0.getInt()
            goto L31b
        L31a:
            r7 = r4
        L31b:
            int r8 = r0.remaining()
            if (r10 <= r8) goto L322
            r10 = r8
        L322:
            byte[] r8 = new byte[r10]
            r0.get(r8)
            if (r7 >= 0) goto L32a
            r7 = r4
        L32a:
            if (r7 <= r10) goto L32d
            goto L32e
        L32d:
            r10 = r7
        L32e:
            java.lang.String r0 = new java.lang.String
            java.nio.charset.Charset r7 = defpackage.qm0.a
            r0.<init>(r8, r4, r10, r7)
            r1.<init>(r0, r5, r2)
            of6 r0 = r6.n
            r0.k(r1)
            return
        L33e:
            w85 r7 = new w85
            long r8 = r0.getLong()
            long r10 = r0.getLong()
            long r12 = r0.getLong()
            r7.<init>(r8, r10, r12)
            r0 = r7
            bg1 r1 = r6.q
            r1.j(r8, r10)
            java.lang.String r7 = "CANCELED"
            java.lang.String r14 = ""
            r6.h(r7, r8, r10, r12, r14)
            of6 r1 = r6.n
            r1.k(r0)
            return
        L362:
            long r7 = r0.getLong()
            long r11 = r0.getLong()
            r14 = r11
            long r12 = r0.getLong()
            int r1 = r0.getInt()
            if (r1 == 0) goto L378
        L375:
            r16 = r7
            goto L37a
        L378:
            r2 = r4
            goto L375
        L37a:
            a95 r7 = new a95
            int r1 = r0.remaining()
            if (r1 < r9) goto L387
            int r1 = r0.getInt()
            goto L388
        L387:
            r1 = r4
        L388:
            int r5 = r0.remaining()
            if (r10 <= r5) goto L38f
            r10 = r5
        L38f:
            byte[] r5 = new byte[r10]
            r0.get(r5)
            if (r1 >= 0) goto L397
            r1 = r4
        L397:
            if (r1 <= r10) goto L39b
        L399:
            r0 = r14
            goto L39d
        L39b:
            r10 = r1
            goto L399
        L39d:
            java.lang.String r14 = new java.lang.String
            java.nio.charset.Charset r8 = defpackage.qm0.a
            r14.<init>(r5, r4, r10, r8)
            r10 = r0
            r15 = r2
            r8 = r16
            r7.<init>(r8, r10, r12, r14, r15)
            r0 = r7
            bg1 r1 = r6.q
            if (r15 == 0) goto L3bd
            r1.j(r8, r10)
            java.lang.String r7 = "TRACKER_SHOW"
            java.lang.String r14 = r3.concat(r14)
            r6.h(r7, r8, r10, r12, r14)
            goto L3ea
        L3bd:
            bt3 r1 = r1.h(r8, r10)
            boolean r2 = r1.a
            if (r2 == 0) goto L3ea
            long r4 = r1.b
            long r1 = r1.c
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r3)
            r7.append(r14)
            java.lang.String r3 = " tracker_update_index="
            r7.append(r3)
            r7.append(r4)
            java.lang.String r3 = " suppressed_updates="
            r7.append(r3)
            r7.append(r1)
            java.lang.String r14 = r7.toString()
            java.lang.String r7 = "TRACKER_UPDATE"
            r6.h(r7, r8, r10, r12, r14)
        L3ea:
            of6 r1 = r6.n
            r1.k(r0)
            return
        L3f0:
            y85 r7 = new y85
            long r8 = r0.getLong()
            long r10 = r0.getLong()
            long r12 = r0.getLong()
            r7.<init>(r8, r10, r12)
            r0 = r7
            bg1 r1 = r6.q
            r1.j(r8, r10)
            java.lang.String r7 = "STARTED"
            java.lang.String r14 = ""
            r6.h(r7, r8, r10, r12, r14)
            of6 r1 = r6.n
            r1.k(r0)
            return
        L414:
            of6 r0 = r6.n
            i95 r1 = defpackage.i95.a
            r0.k(r1)
            return
        L41c:
            of6 r0 = r6.n
            u85 r1 = defpackage.u85.a
            r0.k(r1)
            return
        L424:
            long r1 = r0.getLong()
            int r8 = r0.getInt()
            java.lang.String r11 = defpackage.cs1.t(r10, r0)
            r3 = 64
            java.lang.String r12 = defpackage.cs1.t(r3, r0)
            j95 r7 = new j95
            r9 = r1
            r7.<init>(r8, r9, r11, r12)
            of6 r0 = r6.n
            r0.k(r7)
            return
        L442:
            of6 r1 = r6.n
            k95 r2 = new k95
            long r3 = r0.getLong()
            r2.<init>(r3)
            r1.k(r2)
            return
        L451:
            of6 r1 = r6.n
            v85 r2 = new v85
            long r3 = r0.getLong()
            r2.<init>(r3)
            r1.k(r2)
            return
        L460:
            r85 r7 = new r85
            long r1 = r0.getLong()
            int r8 = r0.getInt()
            int r3 = r0.getInt()
            int r5 = r0.remaining()
            if (r5 < r9) goto L479
            int r5 = r0.getInt()
            goto L47a
        L479:
            r5 = r4
        L47a:
            int r9 = r0.remaining()
            if (r10 <= r9) goto L481
            r10 = r9
        L481:
            byte[] r9 = new byte[r10]
            r0.get(r9)
            if (r5 >= 0) goto L489
            r5 = r4
        L489:
            if (r5 <= r10) goto L48c
            goto L48d
        L48c:
            r10 = r5
        L48d:
            java.lang.String r12 = new java.lang.String
            java.nio.charset.Charset r0 = defpackage.qm0.a
            r12.<init>(r9, r4, r10, r0)
            r10 = r1
            r9 = r3
            r7.<init>(r8, r9, r10, r12)
            of6 r0 = r6.n
            r0.k(r7)
            return
        L49f:
            of6 r1 = r6.n
            t85 r2 = new t85
            long r3 = r0.getLong()
            r2.<init>(r3)
            r1.k(r2)
            return
        L4ae:
            of6 r1 = r6.n
            s85 r2 = new s85
            long r3 = r0.getLong()
            r2.<init>(r3)
            r1.k(r2)
            return
        L4bd:
            of6 r1 = r6.n
            p85 r2 = new p85
            long r3 = r0.getLong()
            r2.<init>(r3)
            r1.k(r2)
            return
        L4cc:
            of6 r1 = r6.l
            kw1 r2 = new kw1
            int r3 = r0.getInt()
            int r4 = r0.getInt()
            int r0 = r0.getInt()
            r2.<init>(r3, r4, r0)
            r1.k(r2)
            return
        L4e3:
            int r0 = r0.getInt()
            t52 r1 = me.magnum.melonds.domain.model.VideoRenderer.getEntries()
            java.util.Iterator r1 = r1.iterator()
        L4ef:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L503
            java.lang.Object r2 = r1.next()
            r3 = r2
            me.magnum.melonds.domain.model.VideoRenderer r3 = (me.magnum.melonds.domain.model.VideoRenderer) r3
            int r3 = r3.getRenderer()
            if (r3 != r0) goto L4ef
            r5 = r2
        L503:
            me.magnum.melonds.domain.model.VideoRenderer r5 = (me.magnum.melonds.domain.model.VideoRenderer) r5
            if (r5 == 0) goto L54a
            of6 r0 = r6.l
            fw1 r1 = new fw1
            r1.<init>(r5)
            r0.k(r1)
            return
        L512:
            int r0 = r0.getInt()
            r1 = 2
            if (r0 == r1) goto L525
            r1 = 3
            if (r0 == r1) goto L522
            if (r0 == r9) goto L51f
            goto L527
        L51f:
            iw1 r5 = defpackage.iw1.PowerOff
            goto L527
        L522:
            iw1 r5 = defpackage.iw1.BadExceptionRegion
            goto L527
        L525:
            iw1 r5 = defpackage.iw1.GBAModeNotSupported
        L527:
            if (r5 == 0) goto L54a
            of6 r0 = r6.l
            jw1 r1 = new jw1
            r1.<init>(r5)
            r0.k(r1)
            return
        L534:
            of6 r0 = r6.l
            hw1 r1 = defpackage.hw1.a
            r0.k(r1)
            return
        L53c:
            of6 r1 = r6.l
            gw1 r2 = new gw1
            int r0 = r0.getInt()
            r2.<init>(r0)
            r1.k(r2)
        L54a:
            return
    }

    public final void c() {
            r4 = this;
            java.util.concurrent.CountDownLatch r0 = new java.util.concurrent.CountDownLatch
            r1 = 1
            r0.<init>(r1)
            dh5 r1 = new dh5
            r1.<init>()
            v r2 = new v
            r3 = 17
            r2.<init>(r4, r1, r0, r3)
            android.os.Handler r4 = r4.c
            r4.post(r2)
            r0.await()
            java.lang.Object r4 = r1.A
            java.lang.Exception r4 = (java.lang.Exception) r4
            if (r4 != 0) goto L21
            return
        L21:
            throw r4
    }

    public final void d() {
            r3 = this;
            android.os.HandlerThread r0 = r3.b
            boolean r0 = r0.isAlive()
            if (r0 != 0) goto L9
            return
        L9:
            android.os.Looper r0 = android.os.Looper.myLooper()
            android.os.Handler r1 = r3.c
            android.os.Looper r2 = r1.getLooper()
            boolean r0 = defpackage.nb3.k(r0, r2)
            if (r0 == 0) goto L1d
            r3.e()
            return
        L1d:
            n0 r0 = new n0
            r2 = 22
            r0.<init>(r3, r2)
            r1.post(r0)
            return
    }

    public final void e() {
            r3 = this;
            boolean r0 = r3.f
            if (r0 != 0) goto L5
            return
        L5:
            r0 = 0
            r3.f = r0
            android.os.ParcelFileDescriptor r0 = r3.d
            if (r0 == 0) goto L22
            android.os.Looper r1 = android.os.Looper.myLooper()
            if (r1 == 0) goto L1f
            android.os.MessageQueue r1 = r1.getQueue()
            if (r1 == 0) goto L1f
            java.io.FileDescriptor r2 = r0.getFileDescriptor()
            r1.removeOnFileDescriptorEventListener(r2)
        L1f:
            r0.close()
        L22:
            r0 = 0
            r3.e = r0
            r3.d = r0
            closeMessagePipe()
            return
    }
}
