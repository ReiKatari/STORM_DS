package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bg1  reason: default package */
/* loaded from: classes.dex */
public final class bg1 implements defpackage.je0 {
    public long A;
    public final java.lang.Object B;
    public final java.lang.Object L;

    public bg1(int r3) {
            r2 = this;
            switch(r3) {
                case 1: goto L18;
                default: goto L3;
            }
        L3:
            r2.<init>()
            pl7 r3 = defpackage.pl7.Lsq2
            rl7 r0 = new rl7
            r1 = 0
            r0.<init>(r1, r3)
            r2.B = r0
            rl7 r0 = new rl7
            r0.<init>(r1, r3)
            r2.L = r0
            return
        L18:
            ys3 r3 = defpackage.ys3.d0
            r2.<init>()
            r0 = 1000000000(0x3b9aca00, double:4.94065646E-315)
            r2.A = r0
            r2.B = r3
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r3.<init>()
            r2.L = r3
            return
    }

    public bg1(java.io.InputStream r1) {
            r0 = this;
            r0.<init>()
            r0.B = r1
            r1 = 8192(0x2000, float:1.148E-41)
            byte[] r1 = new byte[r1]
            r0.L = r1
            return
    }

    public bg1(defpackage.je0 r1, defpackage.sy6 r2, long r3) {
            r0 = this;
            r0.<init>()
            r0.B = r1
            r0.L = r2
            r0.A = r3
            return
    }

    @Override // defpackage.je0
    public defpackage.sy6 a() {
            r0 = this;
            java.lang.Object r0 = r0.L
            sy6 r0 = (defpackage.sy6) r0
            return r0
    }

    @Override // defpackage.je0
    public defpackage.ie0 b() {
            r0 = this;
            java.lang.Object r0 = r0.B
            je0 r0 = (defpackage.je0) r0
            if (r0 == 0) goto Lb
            ie0 r0 = r0.b()
            return r0
        Lb:
            ie0 r0 = defpackage.ie0.UNKNOWN
            return r0
    }

    @Override // defpackage.je0
    public long c() {
            r4 = this;
            java.lang.Object r0 = r4.B
            je0 r0 = (defpackage.je0) r0
            if (r0 == 0) goto Lb
            long r0 = r0.c()
            return r0
        Lb:
            long r0 = r4.A
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L14
            return r0
        L14:
            java.lang.String r4 = "No timestamp is available."
            defpackage.i.m(r4)
            r0 = 0
            return r0
    }

    @Override // defpackage.je0
    public defpackage.he0 d() {
            r0 = this;
            java.lang.Object r0 = r0.B
            je0 r0 = (defpackage.je0) r0
            if (r0 == 0) goto Lb
            he0 r0 = r0.d()
            return r0
        Lb:
            he0 r0 = defpackage.he0.UNKNOWN
            return r0
    }

    public void e(long r4, long r6) {
            r3 = this;
            java.lang.Object r0 = r3.B
            rl7 r0 = (defpackage.rl7) r0
            r1 = 32
            long r1 = r6 >> r1
            int r1 = (int) r1
            float r1 = java.lang.Float.intBitsToFloat(r1)
            r0.a(r1, r4)
            java.lang.Object r3 = r3.L
            rl7 r3 = (defpackage.rl7) r3
            r0 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r6 = r6 & r0
            int r6 = (int) r6
            float r6 = java.lang.Float.intBitsToFloat(r6)
            r3.a(r6, r4)
            return
    }

    @Override // defpackage.je0
    public defpackage.fe0 f() {
            r0 = this;
            java.lang.Object r0 = r0.B
            je0 r0 = (defpackage.je0) r0
            if (r0 == 0) goto Lb
            fe0 r0 = r0.f()
            return r0
        Lb:
            fe0 r0 = defpackage.fe0.UNKNOWN
            return r0
    }

    @Override // defpackage.je0
    public defpackage.ge0 g() {
            r0 = this;
            java.lang.Object r0 = r0.B
            je0 r0 = (defpackage.je0) r0
            if (r0 == 0) goto Lb
            ge0 r0 = r0.g()
            return r0
        Lb:
            ge0 r0 = defpackage.ge0.UNKNOWN
            return r0
    }

    public synchronized defpackage.bt3 h(long r18, long r20) {
            r17 = this;
            r1 = r17
            monitor-enter(r17)
            zs3 r0 = new zs3     // Catch: java.lang.Throwable -> L48
            r2 = r18
            r4 = r20
            r0.<init>(r2, r4)     // Catch: java.lang.Throwable -> L48
            java.lang.Object r2 = r1.B     // Catch: java.lang.Throwable -> L48
            on2 r2 = (defpackage.on2) r2     // Catch: java.lang.Throwable -> L48
            java.lang.Object r2 = r2.c()     // Catch: java.lang.Throwable -> L48
            java.lang.Number r2 = (java.lang.Number) r2     // Catch: java.lang.Throwable -> L48
            long r2 = r2.longValue()     // Catch: java.lang.Throwable -> L48
            java.lang.Object r4 = r1.L     // Catch: java.lang.Throwable -> L48
            java.util.LinkedHashMap r4 = (java.util.LinkedHashMap) r4     // Catch: java.lang.Throwable -> L48
            java.lang.Object r4 = r4.get(r0)     // Catch: java.lang.Throwable -> L48
            at3 r4 = (defpackage.at3) r4     // Catch: java.lang.Throwable -> L48
            r5 = 0
            r7 = 1
            if (r4 != 0) goto L4a
            java.lang.Object r4 = r1.L     // Catch: java.lang.Throwable -> L48
            java.util.LinkedHashMap r4 = (java.util.LinkedHashMap) r4     // Catch: java.lang.Throwable -> L48
            at3 r9 = new at3     // Catch: java.lang.Throwable -> L48
            r9.<init>()     // Catch: java.lang.Throwable -> L48
            r9.a = r2     // Catch: java.lang.Throwable -> L48
            r9.b = r7     // Catch: java.lang.Throwable -> L48
            r9.c = r5     // Catch: java.lang.Throwable -> L48
            r4.put(r0, r9)     // Catch: java.lang.Throwable -> L48
            bt3 r10 = new bt3     // Catch: java.lang.Throwable -> L48
            r11 = 1
            r13 = 0
            r15 = 1
            r10.<init>(r11, r13, r15)     // Catch: java.lang.Throwable -> L48
            monitor-exit(r17)
            return r10
        L48:
            r0 = move-exception
            goto L7d
        L4a:
            long r9 = r4.b     // Catch: java.lang.Throwable -> L48
            long r12 = r9 + r7
            r4.b = r12     // Catch: java.lang.Throwable -> L48
            long r9 = r4.a     // Catch: java.lang.Throwable -> L48
            long r9 = r2 - r9
            int r0 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r0 < 0) goto L6e
            long r14 = r1.A     // Catch: java.lang.Throwable -> L48
            int r0 = (r9 > r14 ? 1 : (r9 == r14 ? 0 : -1))
            if (r0 < 0) goto L5f
            goto L6e
        L5f:
            long r2 = r4.c     // Catch: java.lang.Throwable -> L48
            long r14 = r2 + r7
            r4.c = r14     // Catch: java.lang.Throwable -> L48
            bt3 r11 = new bt3     // Catch: java.lang.Throwable -> L48
            r16 = 0
            r11.<init>(r12, r14, r16)     // Catch: java.lang.Throwable -> L48
            monitor-exit(r17)
            return r11
        L6e:
            bt3 r11 = new bt3     // Catch: java.lang.Throwable -> L48
            long r14 = r4.c     // Catch: java.lang.Throwable -> L48
            r16 = 1
            r11.<init>(r12, r14, r16)     // Catch: java.lang.Throwable -> L48
            r4.a = r2     // Catch: java.lang.Throwable -> L48
            r4.c = r5     // Catch: java.lang.Throwable -> L48
            monitor-exit(r17)
            return r11
        L7d:
            monitor-exit(r17)     // Catch: java.lang.Throwable -> L48
            throw r0
    }

    public byte[] i(int r9, int r10) {
            r8 = this;
            java.lang.Object r0 = r8.B
            java.io.InputStream r0 = (java.io.InputStream) r0
            if (r9 < 0) goto L50
            if (r10 >= 0) goto L9
            goto L50
        L9:
            long r1 = (long) r9
            long r3 = r8.A
            int r9 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r9 >= 0) goto L11
            goto L50
        L11:
            long r5 = (long) r10
            long r5 = r5 + r1
            int r9 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r9 >= 0) goto L18
            goto L50
        L18:
            java.lang.Object r9 = r8.L
            byte[] r9 = (byte[]) r9
            long r1 = r1 - r3
        L1d:
            r3 = 0
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r4 = 0
            if (r3 <= 0) goto L3a
            int r3 = r9.length
            long r5 = (long) r3
            long r5 = java.lang.Math.min(r5, r1)
            int r3 = (int) r5
            int r3 = r0.read(r9, r4, r3)
            if (r3 > 0) goto L32
            goto L50
        L32:
            long r4 = r8.A
            long r6 = (long) r3
            long r4 = r4 + r6
            r8.A = r4
            long r1 = r1 - r6
            goto L1d
        L3a:
            byte[] r9 = new byte[r10]
        L3c:
            if (r4 >= r10) goto L4f
            int r1 = r10 - r4
            int r1 = r0.read(r9, r4, r1)
            if (r1 > 0) goto L47
            goto L50
        L47:
            int r4 = r4 + r1
            long r2 = r8.A
            long r5 = (long) r1
            long r2 = r2 + r5
            r8.A = r2
            goto L3c
        L4f:
            return r9
        L50:
            r8 = 0
            return r8
    }

    public synchronized void j(long r3, long r5) {
            r2 = this;
            monitor-enter(r2)
            java.lang.Object r0 = r2.L     // Catch: java.lang.Throwable -> Lf
            java.util.LinkedHashMap r0 = (java.util.LinkedHashMap) r0     // Catch: java.lang.Throwable -> Lf
            zs3 r1 = new zs3     // Catch: java.lang.Throwable -> Lf
            r1.<init>(r3, r5)     // Catch: java.lang.Throwable -> Lf
            r0.remove(r1)     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r2)
            return
        Lf:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lf
            throw r3
    }

    public synchronized void k() {
            r1 = this;
            monitor-enter(r1)
            java.lang.Object r0 = r1.L     // Catch: java.lang.Throwable -> La
            java.util.LinkedHashMap r0 = (java.util.LinkedHashMap) r0     // Catch: java.lang.Throwable -> La
            r0.clear()     // Catch: java.lang.Throwable -> La
            monitor-exit(r1)
            return
        La:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> La
            throw r0
    }
}
