package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qo3  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class qo3 extends defpackage.j45 implements defpackage.fg3, defpackage.on2 {
    public final /* synthetic */ int d0;

    public /* synthetic */ qo3(int r1, int r2, java.lang.Class r3, java.lang.Object r4, java.lang.String r5, java.lang.String r6) {
            r0 = this;
            r0.d0 = r2
            r2 = r3
            r3 = r5
            r5 = r1
            r1 = r4
            r4 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    @Override // defpackage.lb0
    public final defpackage.yf3 a() {
            r1 = this;
            lh5 r0 = defpackage.gh5.a
            r0.getClass()
            return r1
    }

    @Override // defpackage.on2
    public final java.lang.Object c() {
            r1 = this;
            int r0 = r1.d0
            java.lang.Object r1 = r1.B
            switch(r0) {
                case 0: goto L1e;
                case 1: goto L17;
                case 2: goto L10;
                default: goto L7;
            }
        L7:
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getSimpleName()
            goto L24
        L10:
            pp6 r1 = (defpackage.pp6) r1
            java.lang.Object r1 = r1.getValue()
            goto L24
        L17:
            pp6 r1 = (defpackage.pp6) r1
            java.lang.Object r1 = r1.getValue()
            goto L24
        L1e:
            pp6 r1 = (defpackage.pp6) r1
            java.lang.Object r1 = r1.getValue()
        L24:
            return r1
    }
}
