package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fp4  reason: default package */
/* loaded from: classes.dex */
public final class fp4 implements java.lang.AutoCloseable {
    public final defpackage.ip4 A;
    public final java.lang.Object B;
    public boolean L;
    public long R;
    public long X;
    public long Y;
    public long Z;
    public long d0;
    public final java.util.ArrayList e0;
    public final java.util.LinkedHashMap f0;

    public fp4(defpackage.ip4 r3) {
            r2 = this;
            r3.getClass()
            r2.<init>()
            r2.A = r3
            java.lang.Object r3 = new java.lang.Object
            r3.<init>()
            r2.B = r3
            r0 = 1
            r2.R = r0
            r0 = -9223372036854775808
            r2.X = r0
            r2.Y = r0
            r2.Z = r0
            r2.d0 = r0
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r2.e0 = r3
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r3.<init>()
            r2.f0 = r3
            return
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
            r6 = this;
            java.lang.Object r0 = r6.B
            monitor-enter(r0)
            boolean r1 = r6.L     // Catch: java.lang.Throwable -> L59
            if (r1 == 0) goto L9
            monitor-exit(r0)
            return
        L9:
            r1 = 1
            r6.L = r1     // Catch: java.lang.Throwable -> L59
            java.util.LinkedHashMap r1 = r6.f0     // Catch: java.lang.Throwable -> L59
            java.util.Collection r1 = r1.values()     // Catch: java.lang.Throwable -> L59
            java.util.ArrayList r1 = defpackage.gt0.m1(r1)     // Catch: java.lang.Throwable -> L59
            java.util.LinkedHashMap r2 = r6.f0     // Catch: java.lang.Throwable -> L59
            r2.clear()     // Catch: java.lang.Throwable -> L59
            java.util.ArrayList r2 = r6.e0     // Catch: java.lang.Throwable -> L59
            java.util.ArrayList r2 = defpackage.gt0.m1(r2)     // Catch: java.lang.Throwable -> L59
            java.util.ArrayList r6 = r6.e0     // Catch: java.lang.Throwable -> L59
            r6.clear()     // Catch: java.lang.Throwable -> L59
            monitor-exit(r0)
            int r6 = r1.size()
            r0 = 0
            r3 = r0
        L2d:
            if (r3 >= r6) goto L3a
            java.lang.Object r4 = r1.get(r3)
            int r3 = r3 + 1
            kp4 r4 = (defpackage.kp4) r4
            java.lang.Object r4 = r4.a
            goto L2d
        L3a:
            int r6 = r2.size()
        L3e:
            if (r0 >= r6) goto L58
            java.lang.Object r1 = r2.get(r0)
            int r0 = r0 + 1
            ep4 r1 = (defpackage.ep4) r1
            r1.getClass()
            mp4 r3 = new mp4
            r4 = 11
            r3.<init>(r4)
            r4 = -1
            r1.a(r4, r3)
            goto L3e
        L58:
            return
        L59:
            r6 = move-exception
            monitor-exit(r0)
            throw r6
    }

    public final void e(long r12) {
            r11 = this;
            java.lang.Object r0 = r11.B
            monitor-enter(r0)
            boolean r1 = r11.L     // Catch: java.lang.Throwable -> L34
            if (r1 == 0) goto L9
            monitor-exit(r0)
            return
        L9:
            r11.Z = r12     // Catch: java.lang.Throwable -> L34
            java.util.ArrayList r1 = r11.e0     // Catch: java.lang.Throwable -> L34
            int r2 = r1.size()     // Catch: java.lang.Throwable -> L34
            r3 = 0
            r4 = 0
            r5 = r3
            r7 = r5
            r6 = r4
        L16:
            if (r7 >= r2) goto L36
            java.lang.Object r8 = r1.get(r7)     // Catch: java.lang.Throwable -> L34
            int r7 = r7 + 1
            r9 = r8
            ep4 r9 = (defpackage.ep4) r9     // Catch: java.lang.Throwable -> L34
            long r9 = r9.b     // Catch: java.lang.Throwable -> L34
            int r9 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            r10 = 1
            if (r9 != 0) goto L2a
            r9 = r10
            goto L2b
        L2a:
            r9 = r3
        L2b:
            if (r9 == 0) goto L16
            if (r5 == 0) goto L31
        L2f:
            r6 = r4
            goto L39
        L31:
            r6 = r8
            r5 = r10
            goto L16
        L34:
            r11 = move-exception
            goto L57
        L36:
            if (r5 != 0) goto L39
            goto L2f
        L39:
            ep4 r6 = (defpackage.ep4) r6     // Catch: java.lang.Throwable -> L34
            if (r6 == 0) goto L47
            long r12 = r6.e     // Catch: java.lang.Throwable -> L34
            r11.d0 = r12     // Catch: java.lang.Throwable -> L34
            java.util.ArrayList r11 = r11.e0     // Catch: java.lang.Throwable -> L34
            r11.remove(r6)     // Catch: java.lang.Throwable -> L34
            r4 = r6
        L47:
            monitor-exit(r0)
            if (r4 == 0) goto L56
            mp4 r11 = new mp4
            r12 = 10
            r11.<init>(r12)
            r12 = -1
            r4.a(r12, r11)
        L56:
            return
        L57:
            monitor-exit(r0)
            throw r11
    }

    public final void h(long r16, java.lang.Object r18) {
            r15 = this;
            r6 = r16
            r8 = r18
            java.lang.Object r9 = r15.B
            monitor-enter(r9)
            boolean r1 = r15.L     // Catch: java.lang.Throwable -> L36
            r10 = 0
            r11 = 0
            if (r1 != 0) goto L8c
            ip4 r1 = r15.A     // Catch: java.lang.Throwable -> L36
            long r2 = r15.d0     // Catch: java.lang.Throwable -> L36
            boolean r1 = r1.a(r2, r6)     // Catch: java.lang.Throwable -> L36
            if (r1 == 0) goto L19
            goto L8c
        L19:
            java.util.ArrayList r1 = r15.e0     // Catch: java.lang.Throwable -> L36
            int r2 = r1.size()     // Catch: java.lang.Throwable -> L36
            r3 = r10
        L20:
            if (r3 >= r2) goto L39
            java.lang.Object r4 = r1.get(r3)     // Catch: java.lang.Throwable -> L36
            int r3 = r3 + 1
            r5 = r4
            ep4 r5 = (defpackage.ep4) r5     // Catch: java.lang.Throwable -> L36
            ip4 r12 = r15.A     // Catch: java.lang.Throwable -> L36
            long r13 = r5.e     // Catch: java.lang.Throwable -> L36
            boolean r5 = r12.a(r13, r6)     // Catch: java.lang.Throwable -> L36
            if (r5 == 0) goto L20
            goto L3a
        L36:
            r0 = move-exception
            goto Lc1
        L39:
            r4 = r11
        L3a:
            r12 = r4
            ep4 r12 = (defpackage.ep4) r12     // Catch: java.lang.Throwable -> L36
            if (r12 == 0) goto L54
            boolean r5 = r12.a     // Catch: java.lang.Throwable -> L36
            long r1 = r12.d     // Catch: java.lang.Throwable -> L36
            long r3 = r12.e     // Catch: java.lang.Throwable -> L36
            r0 = r15
            java.util.ArrayList r1 = r0.n(r1, r3, r5)     // Catch: java.lang.Throwable -> L36
            r12.a(r6, r8)     // Catch: java.lang.Throwable -> L36
            java.util.ArrayList r0 = r15.e0     // Catch: java.lang.Throwable -> L36
            r0.remove(r12)     // Catch: java.lang.Throwable -> L36
            r0 = r11
            goto L92
        L54:
            java.util.LinkedHashMap r1 = r15.f0     // Catch: java.lang.Throwable -> L36
            java.lang.Long r2 = java.lang.Long.valueOf(r6)     // Catch: java.lang.Throwable -> L36
            kp4 r3 = new kp4     // Catch: java.lang.Throwable -> L36
            r3.<init>(r8)     // Catch: java.lang.Throwable -> L36
            r1.put(r2, r3)     // Catch: java.lang.Throwable -> L36
            java.util.LinkedHashMap r1 = r15.f0     // Catch: java.lang.Throwable -> L36
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L36
            r2 = 3
            if (r1 <= r2) goto L89
            java.util.LinkedHashMap r1 = r15.f0     // Catch: java.lang.Throwable -> L36
            java.util.Set r1 = r1.keySet()     // Catch: java.lang.Throwable -> L36
            java.lang.Iterable r1 = (java.lang.Iterable) r1     // Catch: java.lang.Throwable -> L36
            java.lang.Object r1 = defpackage.gt0.G0(r1)     // Catch: java.lang.Throwable -> L36
            java.lang.Number r1 = (java.lang.Number) r1     // Catch: java.lang.Throwable -> L36
            long r1 = r1.longValue()     // Catch: java.lang.Throwable -> L36
            java.util.LinkedHashMap r0 = r15.f0     // Catch: java.lang.Throwable -> L36
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch: java.lang.Throwable -> L36
            java.lang.Object r0 = r0.remove(r1)     // Catch: java.lang.Throwable -> L36
        L87:
            r1 = r11
            goto L92
        L89:
            r0 = r11
            r1 = r0
            goto L92
        L8c:
            kp4 r0 = new kp4     // Catch: java.lang.Throwable -> L36
            r0.<init>(r8)     // Catch: java.lang.Throwable -> L36
            goto L87
        L92:
            monitor-exit(r9)
            kp4 r0 = (defpackage.kp4) r0
            if (r0 == 0) goto La0
            java.lang.Object r0 = r0.a
            boolean r2 = r0 instanceof defpackage.mp4
            if (r2 != 0) goto La0
            if (r0 == 0) goto La0
            r11 = r0
        La0:
            if (r1 == 0) goto Lc0
            int r0 = r1.size()
        La6:
            if (r10 >= r0) goto Lc0
            java.lang.Object r2 = r1.get(r10)
            int r10 = r10 + 1
            ep4 r2 = (defpackage.ep4) r2
            r2.getClass()
            mp4 r3 = new mp4
            r4 = 12
            r3.<init>(r4)
            r4 = -1
            r2.a(r4, r3)
            goto La6
        Lc0:
            return
        Lc1:
            monitor-exit(r9)
            throw r0
    }

    public final void k(long r19, long r21, long r23, defpackage.dp4 r25) {
            r18 = this;
            r0 = r18
            r2 = r19
            r8 = r23
            r25.getClass()
            java.lang.Object r11 = r0.B
            monitor-enter(r11)
            java.util.ArrayList r1 = r0.e0     // Catch: java.lang.Throwable -> L2a
            int r4 = r1.size()     // Catch: java.lang.Throwable -> L2a
            r5 = 0
        L13:
            if (r5 >= r4) goto L2f
            java.lang.Object r7 = r1.get(r5)     // Catch: java.lang.Throwable -> L2a
            int r5 = r5 + 1
            r10 = r7
            ep4 r10 = (defpackage.ep4) r10     // Catch: java.lang.Throwable -> L2a
            long r14 = r10.b     // Catch: java.lang.Throwable -> L2a
            int r10 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            if (r10 != 0) goto L26
            r10 = 1
            goto L27
        L26:
            r10 = 0
        L27:
            if (r10 == 0) goto L13
            goto L30
        L2a:
            r0 = move-exception
            r17 = r11
            goto L19d
        L2f:
            r7 = 0
        L30:
            ep4 r7 = (defpackage.ep4) r7     // Catch: java.lang.Throwable -> L2a
            if (r7 == 0) goto L82
            java.lang.String r0 = "CXCP"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2a
            r1.<init>()     // Catch: java.lang.Throwable -> L2a
            java.lang.String r4 = "onOutputStarted was invoked multiple times with a previously started output!onOutputStarted with "
            r1.append(r4)     // Catch: java.lang.Throwable -> L2a
            java.lang.String r2 = defpackage.nm2.a(r2)     // Catch: java.lang.Throwable -> L2a
            r1.append(r2)     // Catch: java.lang.Throwable -> L2a
            java.lang.String r2 = ", "
            r1.append(r2)     // Catch: java.lang.Throwable -> L2a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2a
            java.lang.String r3 = "CameraTimestamp(value="
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L2a
            r4 = r21
            r2.append(r4)     // Catch: java.lang.Throwable -> L2a
            r3 = 41
            r2.append(r3)     // Catch: java.lang.Throwable -> L2a
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L2a
            r1.append(r2)     // Catch: java.lang.Throwable -> L2a
            java.lang.String r2 = ", "
            r1.append(r2)     // Catch: java.lang.Throwable -> L2a
            r1.append(r8)     // Catch: java.lang.Throwable -> L2a
            java.lang.String r2 = ". Previously started output: "
            r1.append(r2)     // Catch: java.lang.Throwable -> L2a
            r1.append(r7)     // Catch: java.lang.Throwable -> L2a
            java.lang.String r2 = ". Ignoring."
            r1.append(r2)     // Catch: java.lang.Throwable -> L2a
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L2a
            android.util.Log.w(r0, r1)     // Catch: java.lang.Throwable -> L2a
            monitor-exit(r11)
            return
        L82:
            r4 = r21
            boolean r14 = r0.L     // Catch: java.lang.Throwable -> L2a
            long r6 = r0.R     // Catch: java.lang.Throwable -> L2a
            r15 = 1
            r17 = r11
            long r10 = r6 + r15
            r0.R = r10     // Catch: java.lang.Throwable -> Lae
            if (r14 != 0) goto L114
            long r10 = r0.Z     // Catch: java.lang.Throwable -> Lae
            int r1 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r1 == 0) goto L114
            long r10 = r0.d0     // Catch: java.lang.Throwable -> Lae
            int r1 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r1 != 0) goto La0
            goto L114
        La0:
            long r10 = r0.Y     // Catch: java.lang.Throwable -> Lae
            int r1 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r1 >= 0) goto La8
            r1 = 1
            goto La9
        La8:
            r1 = 0
        La9:
            if (r1 != 0) goto Lb1
            r0.Y = r2     // Catch: java.lang.Throwable -> Lae
            goto Lb1
        Lae:
            r0 = move-exception
            goto L19d
        Lb1:
            long r10 = r0.X     // Catch: java.lang.Throwable -> Lae
            int r10 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r10 >= 0) goto Lb9
            r10 = 1
            goto Lba
        Lb9:
            r10 = 0
        Lba:
            if (r10 != 0) goto Lbe
            r0.X = r8     // Catch: java.lang.Throwable -> Lae
        Lbe:
            if (r1 != 0) goto Lc5
            if (r10 == 0) goto Lc3
            goto Lc5
        Lc3:
            r1 = 0
            goto Lc6
        Lc5:
            r1 = 1
        Lc6:
            java.util.LinkedHashMap r10 = r0.f0     // Catch: java.lang.Throwable -> Lae
            java.util.Set r10 = r10.keySet()     // Catch: java.lang.Throwable -> Lae
            java.lang.Iterable r10 = (java.lang.Iterable) r10     // Catch: java.lang.Throwable -> Lae
            java.util.Iterator r10 = r10.iterator()     // Catch: java.lang.Throwable -> Lae
        Ld2:
            boolean r11 = r10.hasNext()     // Catch: java.lang.Throwable -> Lae
            if (r11 == 0) goto Lec
            java.lang.Object r11 = r10.next()     // Catch: java.lang.Throwable -> Lae
            r15 = r11
            java.lang.Number r15 = (java.lang.Number) r15     // Catch: java.lang.Throwable -> Lae
            long r12 = r15.longValue()     // Catch: java.lang.Throwable -> Lae
            ip4 r15 = r0.A     // Catch: java.lang.Throwable -> Lae
            boolean r12 = r15.a(r8, r12)     // Catch: java.lang.Throwable -> Lae
            if (r12 == 0) goto Ld2
            goto Led
        Lec:
            r11 = 0
        Led:
            java.lang.Long r11 = (java.lang.Long) r11     // Catch: java.lang.Throwable -> Lae
            if (r11 == 0) goto L101
            java.util.LinkedHashMap r2 = r0.f0     // Catch: java.lang.Throwable -> Lae
            java.lang.Object r10 = r2.remove(r11)     // Catch: java.lang.Throwable -> Lae
            r5 = r1
            r1 = r6
            r3 = r8
            java.util.ArrayList r0 = r0.n(r1, r3, r5)     // Catch: java.lang.Throwable -> Lae
            r1 = 0
            r6 = 1
            goto L14d
        L101:
            java.util.ArrayList r11 = r0.e0     // Catch: java.lang.Throwable -> Lae
            ep4 r0 = new ep4     // Catch: java.lang.Throwable -> Lae
            r8 = r23
            r10 = r25
            r0.<init>(r1, r2, r4, r6, r8, r10)     // Catch: java.lang.Throwable -> Lae
            r11.add(r0)     // Catch: java.lang.Throwable -> Lae
            r0 = 0
            r1 = 0
            r6 = 0
        L112:
            r10 = 0
            goto L14d
        L114:
            java.util.LinkedHashMap r1 = r0.f0     // Catch: java.lang.Throwable -> Lae
            java.util.Set r1 = r1.keySet()     // Catch: java.lang.Throwable -> Lae
            java.lang.Iterable r1 = (java.lang.Iterable) r1     // Catch: java.lang.Throwable -> Lae
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> Lae
        L120:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> Lae
            if (r2 == 0) goto L13a
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> Lae
            r3 = r2
            java.lang.Number r3 = (java.lang.Number) r3     // Catch: java.lang.Throwable -> Lae
            long r3 = r3.longValue()     // Catch: java.lang.Throwable -> Lae
            ip4 r5 = r0.A     // Catch: java.lang.Throwable -> Lae
            boolean r3 = r5.a(r8, r3)     // Catch: java.lang.Throwable -> Lae
            if (r3 == 0) goto L120
            goto L13b
        L13a:
            r2 = 0
        L13b:
            java.lang.Long r2 = (java.lang.Long) r2     // Catch: java.lang.Throwable -> Lae
            if (r2 == 0) goto L148
            java.util.LinkedHashMap r0 = r0.f0     // Catch: java.lang.Throwable -> Lae
            java.lang.Object r0 = r0.remove(r2)     // Catch: java.lang.Throwable -> Lae
            kp4 r0 = (defpackage.kp4) r0     // Catch: java.lang.Throwable -> Lae
            goto L149
        L148:
            r0 = 0
        L149:
            r1 = r0
            r0 = 0
            r6 = 1
            goto L112
        L14d:
            monitor-exit(r17)
            if (r0 == 0) goto L16f
            int r2 = r0.size()
            r12 = 0
        L155:
            if (r12 >= r2) goto L16f
            java.lang.Object r3 = r0.get(r12)
            int r12 = r12 + 1
            ep4 r3 = (defpackage.ep4) r3
            r3.getClass()
            mp4 r4 = new mp4
            r5 = 12
            r4.<init>(r5)
            r7 = -1
            r3.a(r7, r4)
            goto L155
        L16f:
            if (r1 == 0) goto L17c
            java.lang.Object r0 = r1.a
            boolean r1 = r0 instanceof defpackage.mp4
            if (r1 != 0) goto L17b
            if (r0 == 0) goto L17b
            r13 = r0
            goto L17c
        L17b:
            r13 = 0
        L17c:
            if (r6 == 0) goto L19c
            if (r14 == 0) goto L18a
            mp4 r0 = new mp4
            r1 = 11
            r0.<init>(r1)
        L187:
            r10 = r25
            goto L199
        L18a:
            kp4 r10 = (defpackage.kp4) r10
            if (r10 == 0) goto L191
            java.lang.Object r0 = r10.a
            goto L187
        L191:
            mp4 r0 = new mp4
            r1 = 10
            r0.<init>(r1)
            goto L187
        L199:
            r10.b(r0)
        L19c:
            return
        L19d:
            monitor-exit(r17)
            throw r0
    }

    public final java.util.ArrayList n(long r8, long r10, boolean r12) {
            r7 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.ArrayList r7 = r7.e0
            int r1 = r7.size()
            r2 = 0
        Lc:
            if (r2 >= r1) goto L2b
            java.lang.Object r3 = r7.get(r2)
            int r2 = r2 + 1
            r4 = r3
            ep4 r4 = (defpackage.ep4) r4
            boolean r5 = r4.a
            if (r5 != r12) goto Lc
            long r5 = r4.d
            int r5 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r5 >= 0) goto Lc
            long r4 = r4.e
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 >= 0) goto Lc
            r0.add(r3)
            goto Lc
        L2b:
            r7.removeAll(r0)
            return r0
    }
}
