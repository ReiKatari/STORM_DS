package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: sr5  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class sr5 implements defpackage.on2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ defpackage.ss5 B;
    public final /* synthetic */ int L;
    public final /* synthetic */ defpackage.ss4 R;

    public /* synthetic */ sr5(defpackage.ss5 r1, int r2, defpackage.ss4 r3, int r4) {
            r0 = this;
            r0.A = r4
            r0.B = r1
            r0.L = r2
            r0.R = r3
            r0.<init>()
            return
    }

    @Override // defpackage.on2
    public final java.lang.Object c() {
            r8 = this;
            int r0 = r8.A
            r1 = 0
            r2 = 2
            r3 = 1
            r4 = 0
            ss4 r5 = r8.R
            int r6 = r8.L
            ss5 r8 = r8.B
            switch(r0) {
                case 0: goto L3c;
                default: goto Lf;
            }
        Lf:
            n06 r0 = r8.f
            int[] r7 = defpackage.ks5.a
            int r0 = r0.ordinal()
            r0 = r7[r0]
            if (r0 == r3) goto L2f
            if (r0 != r2) goto L2b
            int r0 = r5.h()
            java.util.List r8 = r8.a
            int r8 = r8.size()
            int r8 = r8 - r3
            if (r0 != r8) goto L36
            goto L37
        L2b:
            defpackage.i.d()
            goto L3b
        L2f:
            int r8 = r5.h()
            if (r8 < r6) goto L36
            goto L37
        L36:
            r3 = r4
        L37:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r3)
        L3b:
            return r1
        L3c:
            java.util.List r0 = r8.a
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L72
            int r0 = r5.h()
            if (r0 >= 0) goto L4b
            goto L72
        L4b:
            n06 r0 = r8.f
            int[] r7 = defpackage.ps5.a
            int r0 = r0.ordinal()
            r0 = r7[r0]
            if (r0 == r3) goto L6b
            if (r0 != r2) goto L67
            int r0 = r5.h()
            java.util.List r8 = r8.a
            int r8 = r8.size()
            int r8 = r8 - r3
            if (r0 != r8) goto L72
            goto L73
        L67:
            defpackage.i.d()
            goto L77
        L6b:
            int r8 = r5.h()
            if (r8 < r6) goto L72
            goto L73
        L72:
            r3 = r4
        L73:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r3)
        L77:
            return r1
    }
}
