package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: uu0  reason: default package */
/* loaded from: classes.dex */
public final class uu0 implements defpackage.mb0 {
    public final /* synthetic */ int A;
    public final defpackage.wu0 B;

    public /* synthetic */ uu0(defpackage.wu0 r1, int r2) {
            r0 = this;
            r0.A = r2
            r0.B = r1
            r0.<init>()
            return
    }

    @Override // defpackage.mb0
    public final void c(defpackage.gb0 r1, defpackage.vl5 r2) {
            r0 = this;
            int r1 = r0.A
            wu0 r0 = r0.B
            switch(r1) {
                case 0: goto Lb;
                default: goto L7;
            }
        L7:
            r0.complete(r2)
            return
        Lb:
            wl5 r1 = r2.a
            boolean r1 = r1.m0
            if (r1 == 0) goto L17
            java.lang.Object r1 = r2.b
            r0.complete(r1)
            goto L1f
        L17:
            ug r1 = new ug
            r1.<init>(r2)
            r0.completeExceptionally(r1)
        L1f:
            return
    }

    @Override // defpackage.mb0
    public final void f(defpackage.gb0 r1, java.lang.Throwable r2) {
            r0 = this;
            int r1 = r0.A
            wu0 r0 = r0.B
            switch(r1) {
                case 0: goto Lb;
                default: goto L7;
            }
        L7:
            r0.completeExceptionally(r2)
            return
        Lb:
            r0.completeExceptionally(r2)
            return
    }
}
