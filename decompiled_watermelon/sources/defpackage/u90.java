package defpackage;

import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: u90  reason: default package */
/* loaded from: classes.dex */
public final class u90 implements AutoCloseable {
    public final g11 A;
    public final CopyOnWriteArrayList B;

    public u90(q9 q9Var, String str) {
        g11 c = iq2.c(se.O(((ct6) q9Var.L).f, new e63((c63) q9Var.R)));
        this.A = c;
        this.B = new CopyOnWriteArrayList();
        tq5.w(c, null, null, new a0(q9Var, str, this, (j11) null, 11), 3);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        iq2.f(this.A, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(long r8, defpackage.k11 r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof defpackage.s90
            if (r0 == 0) goto L13
            r0 = r10
            s90 r0 = (defpackage.s90) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            s90 r0 = new s90
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.X
            p31 r1 = defpackage.p31.COROUTINE_SUSPENDED
            int r2 = r0.Z
            r3 = 0
            java.util.concurrent.CopyOnWriteArrayList r7 = r7.B
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L33
            if (r2 != r5) goto L2d
            gs0 r8 = r0.R
            defpackage.me2.a0(r10)
            goto L51
        L2d:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r7)
            return r4
        L33:
            defpackage.me2.a0(r10)
            gs0 r10 = new gs0
            r10.<init>()
            r7.add(r10)
            t90 r2 = new t90
            r2.<init>(r10, r4, r3)
            r0.R = r10
            r0.Z = r5
            java.lang.Object r8 = defpackage.ln2.W(r8, r2, r0)
            if (r8 != r1) goto L4e
            return r1
        L4e:
            r6 = r10
            r10 = r8
            r8 = r6
        L51:
            if (r10 == 0) goto L54
            r3 = r5
        L54:
            r7.remove(r8)
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r3)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u90.d(long, k11):java.lang.Object");
    }
}
