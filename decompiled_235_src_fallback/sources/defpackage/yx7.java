package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yx7  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class yx7 implements defpackage.lu3, defpackage.no2 {
    public final /* synthetic */ defpackage.zx0 A;

    public yx7(defpackage.zx0 r1) {
            r0 = this;
            r0.<init>()
            r0.A = r1
            return
    }

    @Override // defpackage.no2
    public final defpackage.ao2 b() {
            r8 = this;
            po2 r0 = new po2
            r6 = 0
            r7 = 0
            r1 = 1
            zx0 r2 = r8.A
            java.lang.Class<zx0> r3 = defpackage.zx0.class
            java.lang.String r4 = "scheduleFrameEndCallback"
            java.lang.String r5 = "scheduleFrameEndCallback(Lkotlin/jvm/functions/Function0;)Landroidx/compose/runtime/CancellationHandle;"
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r0
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof defpackage.lu3
            if (r0 == 0) goto L17
            boolean r0 = r2 instanceof defpackage.no2
            if (r0 == 0) goto L17
            ao2 r1 = r1.b()
            no2 r2 = (defpackage.no2) r2
            ao2 r2 = r2.b()
            boolean r1 = r1.equals(r2)
            return r1
        L17:
            r1 = 0
            return r1
    }

    public final int hashCode() {
            r0 = this;
            ao2 r0 = r0.b()
            int r0 = r0.hashCode()
            return r0
    }
}
