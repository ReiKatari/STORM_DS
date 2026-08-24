package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ei7  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ei7 implements defpackage.n55 {
    public final /* synthetic */ int a;
    public final /* synthetic */ defpackage.fi7 b;

    public /* synthetic */ ei7(defpackage.fi7 r1, int r2) {
            r0 = this;
            r0.a = r2
            r0.b = r1
            r0.<init>()
            return
    }

    @Override // defpackage.n55
    public final java.lang.Object get() {
            r1 = this;
            int r0 = r1.a
            fi7 r1 = r1.b
            switch(r0) {
                case 0: goto L12;
                default: goto L7;
            }
        L7:
            go3 r1 = r1.d
            java.lang.Object r1 = r1.getValue()
            of0 r1 = (defpackage.of0) r1
            java.util.Map r1 = r1.b
            return r1
        L12:
            qn2 r0 = r1.a
            go3 r1 = r1.d
            java.lang.Object r1 = r1.getValue()
            of0 r1 = (defpackage.of0) r1
            kf0 r1 = r1.a
            java.lang.Object r1 = r0.g(r1)
            sf0 r1 = (defpackage.sf0) r1
            return r1
    }
}
