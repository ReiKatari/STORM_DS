package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: tq2  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class tq2 implements defpackage.on2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ defpackage.xq2 B;

    public /* synthetic */ tq2(defpackage.xq2 r1, int r2) {
            r0 = this;
            r0.A = r2
            r0.B = r1
            r0.<init>()
            return
    }

    public /* synthetic */ tq2(defpackage.xq2 r1, defpackage.o84 r2) {
            r0 = this;
            r2 = 0
            r0.A = r2
            r0.<init>()
            r0.B = r1
            return
    }

    @Override // defpackage.on2
    public final java.lang.Object c() {
            r1 = this;
            int r0 = r1.A
            xq2 r1 = r1.B
            switch(r0) {
                case 0: goto L11;
                case 1: goto Lc;
                default: goto L7;
            }
        L7:
            fx0 r1 = r1.m()
            return r1
        Lc:
            fx0 r1 = r1.m()
            return r1
        L11:
            r1 = 0
            throw r1
    }
}
