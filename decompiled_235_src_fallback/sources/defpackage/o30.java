package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: o30  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class o30 implements defpackage.qn2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ defpackage.f47 B;
    public final /* synthetic */ defpackage.qn2 L;

    public /* synthetic */ o30(defpackage.f47 r1, defpackage.qn2 r2, int r3) {
            r0 = this;
            r0.A = r3
            r0.B = r1
            r0.L = r2
            r0.<init>()
            return
    }

    @Override // defpackage.qn2
    public final java.lang.Object g(java.lang.Object r3) {
            r2 = this;
            int r0 = r2.A
            qn2 r1 = r2.L
            f47 r2 = r2.B
            switch(r0) {
                case 0: goto L17;
                default: goto L9;
            }
        L9:
            gl1 r3 = (defpackage.gl1) r3
            mm6 r3 = r2.c
            r3.add(r1)
            j00 r3 = new j00
            r0 = 7
            r3.<init>(r0, r2, r1)
            return r3
        L17:
            a47 r3 = (defpackage.a47) r3
            if (r2 == 0) goto L20
            vs4 r2 = r2.a
            r2.setValue(r3)
        L20:
            if (r1 == 0) goto L25
            r1.g(r3)
        L25:
            jg7 r2 = defpackage.jg7.a
            return r2
    }
}
