package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: dr7  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class dr7 implements defpackage.qn2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ defpackage.qr7 B;

    public /* synthetic */ dr7(defpackage.qr7 r1, int r2) {
            r0 = this;
            r0.A = r2
            r0.B = r1
            r0.<init>()
            return
    }

    @Override // defpackage.qn2
    public final java.lang.Object g(java.lang.Object r20) {
            r19 = this;
            r0 = r19
            int r1 = r0.A
            jg7 r2 = defpackage.jg7.a
            qr7 r3 = r0.B
            switch(r1) {
                case 0: goto L3c;
                case 1: goto L31;
                case 2: goto L26;
                case 3: goto L16;
                default: goto Lb;
            }
        Lb:
            r0 = r20
            hm4 r0 = (defpackage.hm4) r0
            r0.getClass()
            r3.e(r0)
            return r2
        L16:
            r0 = r20
            java.lang.String r0 = (java.lang.String) r0
            r0.getClass()
            u63 r1 = r3.d
            r1.D(r0)
            r3.f()
            return r2
        L26:
            r0 = r20
            java.lang.String r0 = (java.lang.String) r0
            r0.getClass()
            r3.g(r0)
            return r2
        L31:
            r0 = r20
            java.lang.String r0 = (java.lang.String) r0
            r0.getClass()
            r3.g(r0)
            return r2
        L3c:
            r0 = r20
            android.net.Uri r0 = (android.net.Uri) r0
            if (r0 == 0) goto Laa
            tp6 r1 = r3.e
            u63 r4 = r3.d     // Catch: java.lang.Throwable -> L4b
            ja r0 = r4.p(r0)     // Catch: java.lang.Throwable -> L4b
            goto L52
        L4b:
            r0 = move-exception
            em5 r4 = new em5
            r4.<init>(r0)
            r0 = r4
        L52:
            boolean r4 = r0 instanceof defpackage.em5
            if (r4 != 0) goto L85
            r4 = r0
            ja r4 = (defpackage.ja) r4
        L5a:
            java.lang.Object r5 = r1.getValue()
            r6 = r5
            pr7 r6 = (defpackage.pr7) r6
            java.lang.String r7 = r4.b
            java.lang.String r8 = "Драйвер "
            java.lang.String r9 = " успешно импортирован!"
            java.lang.String r17 = defpackage.lb1.A(r8, r7, r9)
            r18 = 1023(0x3ff, float:1.434E-42)
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            pr7 r6 = defpackage.pr7.a(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            boolean r5 = r1.j(r5, r6)
            if (r5 == 0) goto L5a
            r3.f()
        L85:
            java.lang.Throwable r0 = defpackage.hm5.a(r0)
            if (r0 == 0) goto Laa
        L8b:
            java.lang.Object r0 = r1.getValue()
            r3 = r0
            pr7 r3 = (defpackage.pr7) r3
            java.lang.String r14 = "Не удалось импортировать драйвер из ZIP"
            r15 = 1023(0x3ff, float:1.434E-42)
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            pr7 r3 = defpackage.pr7.a(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            boolean r0 = r1.j(r0, r3)
            if (r0 == 0) goto L8b
        Laa:
            return r2
    }
}
