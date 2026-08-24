package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: co3  reason: default package */
/* loaded from: classes.dex */
public final class co3 implements defpackage.on2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ defpackage.qn2 B;
    public final /* synthetic */ java.lang.Object L;
    public final /* synthetic */ java.lang.Object R;

    public co3(defpackage.na4 r2, defpackage.fk3 r3, defpackage.qn2 r4) {
            r1 = this;
            r0 = 0
            r1.A = r0
            r1.<init>()
            r1.L = r2
            r1.R = r3
            r1.B = r4
            return
    }

    public co3(defpackage.nu4 r2, defpackage.qn2 r3, defpackage.qa4 r4) {
            r1 = this;
            r0 = 1
            r1.A = r0
            r1.<init>()
            r1.L = r2
            r1.B = r3
            r1.R = r4
            return
    }

    @Override // defpackage.on2
    public final java.lang.Object c() {
            r4 = this;
            int r0 = r4.A
            jg7 r1 = defpackage.jg7.a
            java.lang.Object r2 = r4.R
            qn2 r3 = r4.B
            java.lang.Object r4 = r4.L
            switch(r0) {
                case 0: goto L2c;
                default: goto Ld;
            }
        Ld:
            nu4 r4 = (defpackage.nu4) r4
            int r0 = defpackage.ru4.b
            xz5 r0 = defpackage.xz5.RESET
            if (r4 == r0) goto L26
            xz5 r0 = defpackage.xz5.EXIT
            if (r4 == r0) goto L26
            cd2 r0 = defpackage.cd2.RESET
            if (r4 == r0) goto L26
            cd2 r0 = defpackage.cd2.EXIT
            if (r4 != r0) goto L22
            goto L26
        L22:
            r3.g(r4)
            goto L2b
        L26:
            qa4 r2 = (defpackage.qa4) r2
            r2.setValue(r4)
        L2b:
            return r1
        L2c:
            na4 r4 = (defpackage.na4) r4
            fk3 r2 = (defpackage.fk3) r2
            r4.k(r2)
            r3.g(r2)
            return r1
    }
}
