package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: s30  reason: default package */
/* loaded from: classes.dex */
public abstract class s30 {
    public static final defpackage.nq6 a = null;
    public static java.lang.Boolean b;

    static {
            c5 r0 = new c5
            r1 = 11
            r0.<init>(r1)
            nq6 r1 = new nq6
            r1.<init>(r0)
            defpackage.s30.a = r1
            return
    }

    public static final void a(defpackage.fp r11, defpackage.s47 r12, defpackage.ki2 r13, java.util.List r14, defpackage.px0 r15) {
            xq2 r15 = (defpackage.xq2) r15
            nq6 r0 = defpackage.s30.a
            java.lang.Object r0 = r15.j(r0)
            java.util.concurrent.Executor r0 = (java.util.concurrent.Executor) r0
            r1 = 0
            if (r0 == 0) goto L42
            java.lang.String r2 = r11.B
            int r2 = r2.length()
            boolean r2 = b(r2)
            if (r2 == 0) goto L42
            r2 = -518737659(0xffffffffe114b105, float:-1.714296E20)
            r15.b0(r2)
            nq6 r2 = defpackage.ky0.n
            java.lang.Object r2 = r15.j(r2)
            r5 = r2
            kk3 r5 = (defpackage.kk3) r5
            nq6 r2 = defpackage.ky0.h
            java.lang.Object r2 = r15.j(r2)
            r8 = r2
            qh1 r8 = (defpackage.qh1) r8
            r30 r3 = new r30     // Catch: java.util.concurrent.RejectedExecutionException -> L3e
            r10 = 0
            r7 = r11
            r4 = r12
            r9 = r13
            r6 = r14
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)     // Catch: java.util.concurrent.RejectedExecutionException -> L3e
            r0.execute(r3)     // Catch: java.util.concurrent.RejectedExecutionException -> L3e
        L3e:
            r15.p(r1)
            return
        L42:
            r11 = -517090505(0xffffffffe12dd337, float:-2.0040665E20)
            r15.b0(r11)
            r15.p(r1)
            return
    }

    public static final boolean b(int r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            r2 = 0
            if (r0 < r1) goto L34
            r0 = 8
            if (r3 < r0) goto L34
            r0 = 1000(0x3e8, float:1.401E-42)
            if (r3 >= r0) goto L34
            java.lang.Boolean r3 = defpackage.s30.b
            r0 = 1
            if (r3 != 0) goto L28
            java.lang.Runtime r3 = java.lang.Runtime.getRuntime()
            int r3 = r3.availableProcessors()
            r1 = 4
            if (r3 < r1) goto L21
            r3 = r0
            goto L22
        L21:
            r3 = r2
        L22:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            defpackage.s30.b = r3
        L28:
            java.lang.Boolean r3 = defpackage.s30.b
            r3.getClass()
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L34
            return r0
        L34:
            return r2
    }
}
