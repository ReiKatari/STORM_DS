package defpackage;

import java.util.LinkedList;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: hf6  reason: default package */
/* loaded from: classes.dex */
public final class hf6 implements i47 {
    public final w82 a;
    public final n57 b;
    public final b34 c;
    public n47 d;
    public final LinkedList e;

    public hf6(w82 w82Var, n57 n57Var) {
        w82Var.getClass();
        n57Var.getClass();
        this.a = w82Var;
        this.b = n57Var;
        this.c = new b34();
        this.e = new LinkedList();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(defpackage.hf6 r6, defpackage.ff6 r7, defpackage.n47 r8, defpackage.k11 r9) {
        /*
            r6.getClass()
            boolean r0 = r9 instanceof defpackage.gf6
            if (r0 == 0) goto L16
            r0 = r9
            gf6 r0 = (defpackage.gf6) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.Y = r1
            goto L1b
        L16:
            gf6 r0 = new gf6
            r0.<init>(r6, r9)
        L1b:
            java.lang.Object r9 = r0.R
            p31 r1 = defpackage.p31.COROUTINE_SUSPENDED
            int r2 = r0.Y
            r3 = 0
            r4 = 1
            java.lang.String r5 = "CXCP"
            if (r2 == 0) goto L33
            if (r2 != r4) goto L2d
            defpackage.me2.a0(r9)
            goto L60
        L2d:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r6)
            return r3
        L33:
            defpackage.me2.a0(r9)
            boolean r9 = defpackage.ve2.D(r5)
            if (r9 == 0) goto L55
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r2 = "StillCaptureRequestControl: submitting "
            r9.<init>(r2)
            r9.append(r7)
            java.lang.String r7 = " at "
            r9.append(r7)
            r9.append(r8)
            java.lang.String r7 = r9.toString()
            android.util.Log.d(r5, r7)
        L55:
            w82 r6 = r6.a
            r0.Y = r4
            java.lang.Object r9 = r6.a(r0)
            if (r9 != r1) goto L60
            return r1
        L60:
            java.lang.Number r9 = (java.lang.Number) r9
            r9.intValue()
            boolean r6 = defpackage.ve2.D(r5)
            if (r6 == 0) goto L70
            java.lang.String r6 = "StillCaptureRequestControl: Issuing single capture"
            android.util.Log.d(r5, r6)
        L70:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hf6.a(hf6, ff6, n47, k11):java.lang.Object");
    }

    @Override // defpackage.i47
    public final void b(n47 n47Var) {
        this.d = n47Var;
        tq5.w(this.b.f, null, null, new vm(this, null), 3);
    }

    @Override // defpackage.i47
    public final void reset() {
        tq5.w(this.b.f, null, null, new zw5(this, null, 6), 3);
    }
}
