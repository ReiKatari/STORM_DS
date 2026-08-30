package u1;

import android.os.Build;
import n2.t2;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class n {

    /* renamed from: a  reason: collision with root package name */
    public static final t2 f13366a = new n2.n1(new od.n(12));

    /* renamed from: b  reason: collision with root package name */
    public static Boolean f13367b;

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0040, code lost:
        if (r0.f(r13) == false) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(l4.h r12, l4.r0 r13, p4.d r14, java.util.List r15, n2.m r16, int r17) {
        /*
            r0 = r16
            n2.r r0 = (n2.r) r0
            n2.t2 r1 = u1.n.f13366a
            java.lang.Object r1 = r0.j(r1)
            java.util.concurrent.Executor r1 = (java.util.concurrent.Executor) r1
            r2 = 0
            if (r1 == 0) goto L95
            java.lang.String r3 = r12.B
            int r3 = r3.length()
            boolean r3 = b(r3)
            if (r3 == 0) goto L95
            r3 = -518761746(0xffffffffe11452ee, float:-1.7100586E20)
            r0.X(r3)
            n2.t2 r3 = b4.q1.f1924n
            java.lang.Object r3 = r0.j(r3)
            r6 = r3
            x4.m r6 = (x4.m) r6
            n2.t2 r3 = b4.q1.f1919h
            java.lang.Object r3 = r0.j(r3)
            r9 = r3
            x4.c r9 = (x4.c) r9
            r3 = r17 & 112(0x70, float:1.57E-43)
            r3 = r3 ^ 48
            r4 = 1
            r5 = 32
            if (r3 <= r5) goto L42
            boolean r3 = r0.f(r13)     // Catch: java.util.concurrent.RejectedExecutionException -> L91
            if (r3 != 0) goto L46
        L42:
            r3 = r17 & 48
            if (r3 != r5) goto L48
        L46:
            r3 = r4
            goto L49
        L48:
            r3 = r2
        L49:
            int r5 = r6.ordinal()     // Catch: java.util.concurrent.RejectedExecutionException -> L91
            boolean r5 = r0.d(r5)     // Catch: java.util.concurrent.RejectedExecutionException -> L91
            r3 = r3 | r5
            boolean r5 = r0.h(r15)     // Catch: java.util.concurrent.RejectedExecutionException -> L91
            r3 = r3 | r5
            r5 = r17 & 14
            r5 = r5 ^ 6
            r7 = 4
            if (r5 <= r7) goto L64
            boolean r5 = r0.f(r12)     // Catch: java.util.concurrent.RejectedExecutionException -> L91
            if (r5 != 0) goto L6a
        L64:
            r5 = r17 & 6
            if (r5 != r7) goto L69
            goto L6a
        L69:
            r4 = r2
        L6a:
            r3 = r3 | r4
            boolean r4 = r0.f(r9)     // Catch: java.util.concurrent.RejectedExecutionException -> L91
            r3 = r3 | r4
            boolean r4 = r0.h(r14)     // Catch: java.util.concurrent.RejectedExecutionException -> L91
            r3 = r3 | r4
            java.lang.Object r4 = r0.L()     // Catch: java.util.concurrent.RejectedExecutionException -> L91
            if (r3 != 0) goto L7f
            n2.e r3 = n2.l.f9953a     // Catch: java.util.concurrent.RejectedExecutionException -> L91
            if (r4 != r3) goto L8c
        L7f:
            s0.f r4 = new s0.f     // Catch: java.util.concurrent.RejectedExecutionException -> L91
            r11 = 1
            r8 = r12
            r5 = r13
            r10 = r14
            r7 = r15
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)     // Catch: java.util.concurrent.RejectedExecutionException -> L91
            r0.h0(r4)     // Catch: java.util.concurrent.RejectedExecutionException -> L91
        L8c:
            java.lang.Runnable r4 = (java.lang.Runnable) r4     // Catch: java.util.concurrent.RejectedExecutionException -> L91
            r1.execute(r4)     // Catch: java.util.concurrent.RejectedExecutionException -> L91
        L91:
            r0.p(r2)
            return
        L95:
            r12 = -523310345(0xffffffffe0ceeaf7, float:-1.1928001E20)
            r0.X(r12)
            r0.p(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: u1.n.a(l4.h, l4.r0, p4.d, java.util.List, n2.m, int):void");
    }

    public static final boolean b(int i2) {
        boolean z10;
        if (Build.VERSION.SDK_INT >= 28 && i2 >= 8 && i2 < 1000) {
            if (f13367b == null) {
                if (Runtime.getRuntime().availableProcessors() >= 4) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                f13367b = Boolean.valueOf(z10);
            }
            Boolean bool = f13367b;
            bool.getClass();
            if (bool.booleanValue()) {
                return true;
            }
        }
        return false;
    }
}
