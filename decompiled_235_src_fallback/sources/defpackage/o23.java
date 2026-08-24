package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: o23  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class o23 implements defpackage.fk2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ defpackage.s23 B;

    public /* synthetic */ o23(defpackage.s23 r1, defpackage.s23 r2, int r3) {
            r0 = this;
            r0.A = r3
            r0.B = r2
            r0.<init>()
            return
    }

    @Override // defpackage.fk2
    public final void c(defpackage.gk2 r1) {
            r0 = this;
            int r1 = r0.A
            s23 r0 = r0.B
            switch(r1) {
                case 0: goto Ld;
                default: goto L7;
            }
        L7:
            int r1 = androidx.camera.core.ImageProcessingUtil.a
            r0.close()
            return
        Ld:
            int r1 = androidx.camera.core.ImageProcessingUtil.a
            if (r0 == 0) goto L14
            r0.close()
        L14:
            return
    }
}
