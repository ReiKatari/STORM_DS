package defpackage;

import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: bb6  reason: default package */
/* loaded from: classes.dex */
public final class bb6 {
    public final mi2 a;
    public boolean c;
    public a31 h;
    public ab6 i;
    public final AtomicReference b = new AtomicReference(null);
    public final bt5 d = new bt5(6, this);
    public final n95 e = new n95(16, this);
    public final o24 f = new o24(new ab6[16]);
    public final Object g = new Object();
    public long j = -1;

    public bb6(mi2 mi2Var) {
        this.a = mi2Var;
    }

    public final void a() {
        synchronized (this.g) {
            o24 o24Var = this.f;
            Object[] objArr = o24Var.A;
            int i = o24Var.L;
            for (int i2 = 0; i2 < i; i2++) {
                ab6 ab6Var = (ab6) objArr[i2];
                ab6Var.e.a();
                ab6Var.f.a();
                ab6Var.l.a();
                ab6Var.m.clear();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0080 A[Catch: all -> 0x008e, TryCatch #0 {all -> 0x008e, blocks: (B:4:0x0007, B:8:0x0011, B:27:0x0078, B:29:0x0080, B:34:0x0090, B:31:0x0085, B:11:0x0021, B:14:0x002d, B:16:0x0041, B:18:0x004f, B:20:0x0059, B:22:0x0069, B:26:0x0074, B:35:0x0094), top: B:40:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(defpackage.by5 r22) {
        /*
            r21 = this;
            r0 = r21
            r1 = r22
            java.lang.Object r2 = r0.g
            monitor-enter(r2)
            o24 r0 = r0.f     // Catch: java.lang.Throwable -> L8e
            int r3 = r0.L     // Catch: java.lang.Throwable -> L8e
            r5 = 0
            r6 = 0
        Ld:
            java.lang.Object[] r7 = r0.A
            if (r5 >= r3) goto L94
            r7 = r7[r5]     // Catch: java.lang.Throwable -> L8e
            ab6 r7 = (defpackage.ab6) r7     // Catch: java.lang.Throwable -> L8e
            d24 r8 = r7.f     // Catch: java.lang.Throwable -> L8e
            java.lang.Object r8 = r8.k(r1)     // Catch: java.lang.Throwable -> L8e
            s14 r8 = (defpackage.s14) r8     // Catch: java.lang.Throwable -> L8e
            if (r8 != 0) goto L21
        L1f:
            r15 = r5
            goto L78
        L21:
            java.lang.Object[] r9 = r8.b     // Catch: java.lang.Throwable -> L8e
            int[] r10 = r8.c     // Catch: java.lang.Throwable -> L8e
            long[] r8 = r8.a     // Catch: java.lang.Throwable -> L8e
            int r11 = r8.length     // Catch: java.lang.Throwable -> L8e
            int r11 = r11 + (-2)
            if (r11 < 0) goto L1f
            r12 = 0
        L2d:
            r13 = r8[r12]     // Catch: java.lang.Throwable -> L8e
            r15 = r5
            long r4 = ~r13     // Catch: java.lang.Throwable -> L8e
            r16 = 7
            long r4 = r4 << r16
            long r4 = r4 & r13
            r16 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r4 = r4 & r16
            int r4 = (r4 > r16 ? 1 : (r4 == r16 ? 0 : -1))
            if (r4 == 0) goto L72
            int r4 = r12 - r11
            int r4 = ~r4     // Catch: java.lang.Throwable -> L8e
            int r4 = r4 >>> 31
            r5 = 8
            int r4 = 8 - r4
            r16 = r5
            r5 = 0
        L4d:
            if (r5 >= r4) goto L6e
            r17 = 255(0xff, double:1.26E-321)
            long r17 = r13 & r17
            r19 = 128(0x80, double:6.3E-322)
            int r17 = (r17 > r19 ? 1 : (r17 == r19 ? 0 : -1))
            if (r17 >= 0) goto L67
            int r17 = r12 << 3
            int r17 = r17 + r5
            r18 = r5
            r5 = r9[r17]     // Catch: java.lang.Throwable -> L8e
            r17 = r10[r17]     // Catch: java.lang.Throwable -> L8e
            r7.c(r1, r5)     // Catch: java.lang.Throwable -> L8e
            goto L69
        L67:
            r18 = r5
        L69:
            long r13 = r13 >> r16
            int r5 = r18 + 1
            goto L4d
        L6e:
            r5 = r16
            if (r4 != r5) goto L78
        L72:
            if (r12 == r11) goto L78
            int r12 = r12 + 1
            r5 = r15
            goto L2d
        L78:
            d24 r4 = r7.f     // Catch: java.lang.Throwable -> L8e
            boolean r4 = r4.j()     // Catch: java.lang.Throwable -> L8e
            if (r4 != 0) goto L83
            int r6 = r6 + 1
            goto L90
        L83:
            if (r6 <= 0) goto L90
            java.lang.Object[] r4 = r0.A     // Catch: java.lang.Throwable -> L8e
            int r5 = r15 - r6
            r7 = r4[r15]     // Catch: java.lang.Throwable -> L8e
            r4[r5] = r7     // Catch: java.lang.Throwable -> L8e
            goto L90
        L8e:
            r0 = move-exception
            goto L9e
        L90:
            int r5 = r15 + 1
            goto Ld
        L94:
            int r1 = r3 - r6
            r4 = 0
            java.util.Arrays.fill(r7, r1, r3, r4)     // Catch: java.lang.Throwable -> L8e
            r0.L = r1     // Catch: java.lang.Throwable -> L8e
            monitor-exit(r2)
            return
        L9e:
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bb6.b(by5):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean c() {
        boolean z;
        Set set;
        Set set2;
        synchronized (this.g) {
            z = this.c;
        }
        if (z) {
            return false;
        }
        boolean z2 = false;
        while (true) {
            AtomicReference atomicReference = this.b;
            while (true) {
                Object obj = atomicReference.get();
                set = null;
                List list = null;
                List list2 = null;
                if (obj == null) {
                    break;
                }
                if (obj instanceof Set) {
                    set2 = (Set) obj;
                } else if (obj instanceof List) {
                    List list3 = (List) obj;
                    Set set3 = (Set) list3.get(0);
                    if (list3.size() == 2) {
                        list2 = list3.get(1);
                    } else if (list3.size() > 2) {
                        list2 = list3.subList(1, list3.size());
                    }
                    set2 = set3;
                    list = list2;
                } else {
                    xu0.b("Unexpected notification");
                    f81.c();
                    return false;
                }
                while (!atomicReference.compareAndSet(obj, list)) {
                    if (atomicReference.get() != obj) {
                        break;
                    }
                }
                set = set2;
                break;
            }
            if (set == null) {
                return z2;
            }
            synchronized (this.g) {
                o24 o24Var = this.f;
                Object[] objArr = o24Var.A;
                int i = o24Var.L;
                for (int i2 = 0; i2 < i; i2++) {
                    if (!((ab6) objArr[i2]).a(set) && !z2) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01e8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x021b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r6v0, types: [o24] */
    /* JADX WARN: Type inference failed for: r6v17, types: [java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(java.lang.Object r27, defpackage.mi2 r28, defpackage.ki2 r29) {
        /*
            Method dump skipped, instructions count: 551
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bb6.d(java.lang.Object, mi2, ki2):void");
    }

    public final void e() {
        bt5 bt5Var = this.d;
        ma6.e(ma6.a);
        synchronized (ma6.c) {
            ma6.h = tq0.Y0(ma6.h, bt5Var);
        }
        this.h = new a31(21, bt5Var);
    }
}
