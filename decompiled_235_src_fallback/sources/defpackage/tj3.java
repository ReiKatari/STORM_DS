package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: tj3  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class tj3 implements defpackage.on2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ java.lang.Integer B;
    public final /* synthetic */ java.lang.Integer L;
    public final /* synthetic */ defpackage.eo2 R;

    public /* synthetic */ tj3(java.lang.Integer r1, java.lang.Integer r2, defpackage.eo2 r3, int r4) {
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
            r4 = this;
            int r0 = r4.A
            jg7 r1 = defpackage.jg7.a
            eo2 r2 = r4.R
            java.lang.Integer r3 = r4.L
            java.lang.Integer r4 = r4.B
            switch(r0) {
                case 0: goto L15;
                default: goto Ld;
            }
        Ld:
            if (r4 == 0) goto L14
            if (r3 == 0) goto L14
            r2.o(r4, r3)
        L14:
            return r1
        L15:
            if (r4 == 0) goto L1c
            if (r3 == 0) goto L1c
            r2.o(r4, r3)
        L1c:
            return r1
    }
}
