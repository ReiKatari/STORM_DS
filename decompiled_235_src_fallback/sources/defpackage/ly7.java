package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ly7  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ly7 implements defpackage.eo2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ defpackage.dh5 B;
    public final /* synthetic */ defpackage.fe5 L;
    public final /* synthetic */ defpackage.dh5 R;
    public final /* synthetic */ defpackage.dh5 X;

    public /* synthetic */ ly7(defpackage.dh5 r2, defpackage.fe5 r3, defpackage.dh5 r4, defpackage.dh5 r5) {
            r1 = this;
            r0 = 1
            r1.A = r0
            r1.<init>()
            r1.B = r2
            r1.L = r3
            r1.R = r4
            r1.X = r5
            return
    }

    public /* synthetic */ ly7(defpackage.fe5 r2, defpackage.dh5 r3, defpackage.dh5 r4, defpackage.dh5 r5) {
            r1 = this;
            r0 = 0
            r1.A = r0
            r1.<init>()
            r1.L = r2
            r1.B = r3
            r1.R = r4
            r1.X = r5
            return
    }

    @Override // defpackage.eo2
    public final java.lang.Object o(java.lang.Object r18, java.lang.Object r19) {
            r17 = this;
            r0 = r17
            int r1 = r0.A
            jg7 r2 = defpackage.jg7.a
            r3 = 1
            dh5 r4 = r0.X
            dh5 r5 = r0.R
            fe5 r6 = r0.L
            dh5 r0 = r0.B
            r7 = 0
            switch(r1) {
                case 0: goto L5c;
                default: goto L13;
            }
        L13:
            r1 = r18
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r8 = r19
            java.lang.Long r8 = (java.lang.Long) r8
            long r8 = r8.longValue()
            if (r1 != r3) goto L5b
            java.lang.Object r1 = r0.A
            if (r1 != 0) goto L55
            r10 = 24
            int r1 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r1 != 0) goto L4e
            long r7 = r6.r()
            java.lang.Long r1 = java.lang.Long.valueOf(r7)
            r0.A = r1
            long r0 = r6.r()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r5.A = r0
            long r0 = r6.r()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r4.A = r0
            goto L5b
        L4e:
            java.lang.String r0 = "bad zip: NTFS extra attribute tag 0x0001 size != 24"
            defpackage.e41.i(r0)
        L53:
            r2 = r7
            goto L5b
        L55:
            java.lang.String r0 = "bad zip: NTFS extra attribute tag 0x0001 repeated"
            defpackage.e41.i(r0)
            goto L53
        L5b:
            return r2
        L5c:
            r1 = r18
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r8 = r19
            java.lang.Long r8 = (java.lang.Long) r8
            long r8 = r8.longValue()
            r10 = 21589(0x5455, float:3.0253E-41)
            if (r1 != r10) goto Lcf
            r10 = 1
            int r1 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            java.lang.String r12 = "bad zip: extended timestamp extra too short"
            if (r1 < 0) goto Lcb
            byte r1 = r6.readByte()
            r13 = r1 & 1
            r14 = 0
            if (r13 != r3) goto L83
            r13 = r3
            goto L84
        L83:
            r13 = r14
        L84:
            r15 = r1 & 2
            r3 = 2
            if (r15 != r3) goto L8b
            r3 = 1
            goto L8c
        L8b:
            r3 = r14
        L8c:
            r15 = 4
            r1 = r1 & r15
            if (r1 != r15) goto L91
            r14 = 1
        L91:
            if (r13 == 0) goto L95
            r10 = 5
        L95:
            r15 = 4
            if (r3 == 0) goto L9a
            long r10 = r10 + r15
        L9a:
            if (r14 == 0) goto L9d
            long r10 = r10 + r15
        L9d:
            int r1 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r1 < 0) goto Lc6
            if (r13 == 0) goto Lad
            int r1 = r6.n()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.A = r1
        Lad:
            if (r3 == 0) goto Lb9
            int r0 = r6.n()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5.A = r0
        Lb9:
            if (r14 == 0) goto Lcf
            int r0 = r6.n()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4.A = r0
            goto Lcf
        Lc6:
            defpackage.e41.i(r12)
        Lc9:
            r2 = r7
            goto Lcf
        Lcb:
            defpackage.e41.i(r12)
            goto Lc9
        Lcf:
            return r2
    }
}
