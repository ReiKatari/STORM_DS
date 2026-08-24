package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: t27  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class t27 implements defpackage.qn2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ defpackage.qh1 B;
    public final /* synthetic */ defpackage.qa4 L;

    public /* synthetic */ t27(defpackage.qh1 r1, defpackage.qa4 r2, int r3) {
            r0 = this;
            r0.A = r3
            r0.B = r1
            r0.L = r2
            r0.<init>()
            return
    }

    @Override // defpackage.qn2
    public final java.lang.Object g(java.lang.Object r7) {
            r6 = this;
            int r0 = r6.A
            qa4 r1 = r6.L
            qh1 r6 = r6.B
            switch(r0) {
                case 0: goto L36;
                default: goto L9;
            }
        L9:
            sm1 r7 = (defpackage.sm1) r7
            long r2 = r7.a
            float r0 = defpackage.sm1.b(r2)
            int r0 = r6.r0(r0)
            long r2 = r7.a
            float r7 = defpackage.sm1.a(r2)
            int r6 = r6.r0(r7)
            long r2 = (long) r0
            r7 = 32
            long r2 = r2 << r7
            long r6 = (long) r6
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r6 = r6 & r4
            long r6 = r6 | r2
            q93 r0 = new q93
            r0.<init>(r6)
            r1.setValue(r0)
            jg7 r6 = defpackage.jg7.a
            return r6
        L36:
            on2 r7 = (defpackage.on2) r7
            mn0 r0 = new mn0
            r2 = 8
            r0.<init>(r2, r7)
            t27 r7 = new t27
            r2 = 1
            r7.<init>(r6, r1, r2)
            boolean r6 = defpackage.d04.a()
            if (r6 == 0) goto L65
            int r6 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r6 != r1) goto L54
            rx4 r6 = defpackage.rx4.b
            goto L56
        L54:
            rx4 r6 = defpackage.rx4.c
        L56:
            boolean r1 = defpackage.d04.a()
            if (r1 == 0) goto L62
            a04 r1 = new a04
            r1.<init>(r0, r7, r6)
            goto L6b
        L62:
            x64 r1 = defpackage.x64.a
            goto L6b
        L65:
            java.lang.String r6 = "Magnifier is only supported on API level 28 and higher."
            defpackage.fa6.h(r6)
            r1 = 0
        L6b:
            return r1
    }
}
