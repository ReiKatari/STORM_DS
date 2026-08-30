package defpackage;

import android.view.View;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: fj  reason: default package */
/* loaded from: classes.dex */
public final class fj implements o31 {
    public final View A;
    public final zq6 B;
    public final o31 L;
    public final AtomicReference R = new AtomicReference(null);

    public fj(View view, zq6 zq6Var, o31 o31Var) {
        this.A = view;
        this.B = zq6Var;
        this.L = o31Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.p31 a(defpackage.im3 r11, defpackage.k11 r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof defpackage.cj
            if (r0 == 0) goto L13
            r0 = r12
            cj r0 = (defpackage.cj) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            cj r0 = new cj
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.R
            p31 r1 = defpackage.p31.COROUTINE_SUSPENDED
            int r2 = r0.Y
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L2e
            if (r2 == r4) goto L2a
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r10)
            return r3
        L2a:
            defpackage.me2.a0(r12)
            goto L4f
        L2e:
            defpackage.me2.a0(r12)
            ej r5 = new ej
            r12 = 0
            r5.<init>(r12, r11, r10)
            y r7 = new y
            r11 = 4
            r8 = 0
            r7.<init>(r10, r8, r11)
            r0.Y = r4
            qk5 r4 = new qk5
            r9 = 3
            java.util.concurrent.atomic.AtomicReference r6 = r10.R
            r4.<init>(r5, r6, r7, r8, r9)
            java.lang.Object r10 = defpackage.iq2.k(r4, r0)
            if (r10 != r1) goto L4f
            return r1
        L4f:
            defpackage.f81.c()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fj.a(im3, k11):p31");
    }

    @Override // defpackage.o31
    public final e31 w() {
        return this.L.w();
    }
}
