package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bo3  reason: default package */
/* loaded from: classes.dex */
public final class bo3 implements defpackage.on2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ defpackage.fk3 B;
    public final /* synthetic */ defpackage.qn2 L;

    public bo3(defpackage.fk3 r2, defpackage.qn2 r3) {
            r1 = this;
            r0 = 1
            r1.A = r0
            r1.<init>()
            r1.B = r2
            r1.L = r3
            return
    }

    public /* synthetic */ bo3(defpackage.qn2 r1, defpackage.fk3 r2, int r3) {
            r0 = this;
            r0.A = r3
            r0.L = r1
            r0.B = r2
            r0.<init>()
            return
    }

    @Override // defpackage.on2
    public final java.lang.Object c() {
            r3 = this;
            int r0 = r3.A
            jg7 r1 = defpackage.jg7.a
            fk3 r2 = r3.B
            qn2 r3 = r3.L
            switch(r0) {
                case 0: goto L17;
                case 1: goto Lf;
                default: goto Lb;
            }
        Lb:
            r3.g(r2)
            return r1
        Lf:
            java.util.UUID r0 = r2.a
            if (r0 == 0) goto L16
            r3.g(r0)
        L16:
            return r1
        L17:
            java.util.UUID r0 = r2.a
            r3.g(r0)
            return r1
    }
}
