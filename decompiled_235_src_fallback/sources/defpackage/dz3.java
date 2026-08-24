package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: dz3  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class dz3 implements defpackage.on2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ defpackage.g17 B;

    public /* synthetic */ dz3(defpackage.g17 r1, int r2) {
            r0 = this;
            r0.A = r2
            r0.B = r1
            r0.<init>()
            return
    }

    @Override // defpackage.on2
    public final java.lang.Object c() {
            r2 = this;
            int r0 = r2.A
            jg7 r1 = defpackage.jg7.a
            g17 r2 = r2.B
            switch(r0) {
                case 0: goto Ld;
                default: goto L9;
            }
        L9:
            r2.onCancel()
            return r1
        Ld:
            r2.b()
            return r1
    }
}
