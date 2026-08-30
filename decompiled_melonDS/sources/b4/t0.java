package b4;

import android.view.View;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class t0 implements zc.u {
    public final View A;
    public final q4.y B;
    public final zc.u L;
    public final AtomicReference R = new AtomicReference(null);

    public t0(View view, q4.y yVar, zc.u uVar) {
        this.A = view;
        this.B = yVar;
        this.L = uVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final dc.a a(d2.u r6, ec.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof b4.s0
            if (r0 == 0) goto L13
            r0 = r7
            b4.s0 r0 = (b4.s0) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            b4.s0 r0 = new b4.s0
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.R
            dc.a r1 = dc.a.COROUTINE_SUSPENDED
            int r2 = r0.Y
            r3 = 1
            if (r2 == 0) goto L2e
            if (r2 == r3) goto L2a
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            a0.j.p(r6)
        L28:
            r6 = 0
            return r6
        L2a:
            p7.j.I(r7)
            goto L4f
        L2e:
            p7.j.I(r7)
            a5.n r7 = new a5.n
            r2 = 3
            r7.<init>(r2, r6, r5)
            a5.o r6 = new a5.o
            r2 = 13
            r4 = 0
            r6.<init>(r2, r4, r5)
            r0.Y = r3
            a9.d r2 = new a9.d
            java.util.concurrent.atomic.AtomicReference r3 = r5.R
            r2.<init>(r7, r3, r6, r4)
            java.lang.Object r6 = zc.x.g(r2, r0)
            if (r6 != r1) goto L4f
            return r1
        L4f:
            wa.b.a()
            goto L28
        */
        throw new UnsupportedOperationException("Method not decompiled: b4.t0.a(d2.u, ec.c):dc.a");
    }

    @Override // zc.u
    public final cc.g v() {
        return this.L.v();
    }
}
