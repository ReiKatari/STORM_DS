package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ig7  reason: default package */
/* loaded from: classes.dex */
public abstract class ig7 {
    public static final int a = 9;
    public static final int b = 6;
    public static final int c = 10;
    public static final int d = 5;
    public static final int e = 15;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.p31 a(defpackage.w92 r4, java.lang.Object r5, java.lang.Object r6, defpackage.k11 r7) {
        /*
            boolean r0 = r7 instanceof defpackage.sa2
            if (r0 == 0) goto L13
            r0 = r7
            sa2 r0 = (defpackage.sa2) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            sa2 r0 = new sa2
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.X
            p31 r1 = defpackage.p31.COROUTINE_SUSPENDED
            int r2 = r0.Y
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 == r3) goto L2a
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r4)
            r4 = 0
            return r4
        L2a:
            java.lang.Object r6 = r0.R
            defpackage.me2.a0(r7)
            goto L3e
        L30:
            defpackage.me2.a0(r7)
            r0.R = r6
            r0.Y = r3
            java.lang.Object r4 = r4.b(r5, r0)
            if (r4 != r1) goto L3e
            return r1
        L3e:
            o r4 = new o
            r4.<init>(r6)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ig7.a(w92, java.lang.Object, java.lang.Object, k11):p31");
    }

    public static final void b(StringBuilder sb, String str) {
        if (sb.length() > 0) {
            sb.append('+');
        }
        sb.append(str);
    }
}
