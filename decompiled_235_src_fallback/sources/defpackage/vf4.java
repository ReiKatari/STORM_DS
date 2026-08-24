package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vf4  reason: default package */
/* loaded from: classes.dex */
public final class vf4 extends defpackage.aj3 implements defpackage.on2 {
    public final /* synthetic */ int B;
    public final /* synthetic */ defpackage.wf4 L;

    public /* synthetic */ vf4(defpackage.wf4 r1, int r2) {
            r0 = this;
            r0.B = r2
            r0.L = r1
            r1 = 0
            r0.<init>(r1)
            return
    }

    @Override // defpackage.on2
    public final java.lang.Object c() {
            r1 = this;
            int r0 = r1.B
            wf4 r1 = r1.L
            switch(r0) {
                case 0: goto L19;
                case 1: goto L10;
                default: goto L7;
            }
        L7:
            androidx.fragment.app.p r1 = r1.requireActivity()
            yo7 r1 = r1.getDefaultViewModelProviderFactory()
            return r1
        L10:
            androidx.fragment.app.p r1 = r1.requireActivity()
            j71 r1 = r1.getDefaultViewModelCreationExtras()
            return r1
        L19:
            androidx.fragment.app.p r1 = r1.requireActivity()
            ap7 r1 = r1.getViewModelStore()
            return r1
    }
}
