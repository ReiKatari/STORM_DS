package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: to0  reason: default package */
/* loaded from: classes.dex */
public final class to0 extends defpackage.aj3 implements defpackage.on2 {
    public final /* synthetic */ int B;
    public final /* synthetic */ defpackage.go3 L;

    public /* synthetic */ to0(defpackage.go3 r1, int r2) {
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
            go3 r1 = r1.L
            switch(r0) {
                case 0: goto L1f;
                default: goto L7;
            }
        L7:
            java.lang.Object r1 = r1.getValue()
            bp7 r1 = (defpackage.bp7) r1
            boolean r0 = r1 instanceof defpackage.mw2
            if (r0 == 0) goto L14
            mw2 r1 = (defpackage.mw2) r1
            goto L15
        L14:
            r1 = 0
        L15:
            if (r1 == 0) goto L1c
            j71 r1 = r1.getDefaultViewModelCreationExtras()
            goto L1e
        L1c:
            h71 r1 = defpackage.h71.b
        L1e:
            return r1
        L1f:
            java.lang.Object r1 = r1.getValue()
            bp7 r1 = (defpackage.bp7) r1
            ap7 r1 = r1.getViewModelStore()
            return r1
    }
}
