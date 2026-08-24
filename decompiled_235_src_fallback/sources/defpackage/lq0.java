package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: lq0  reason: default package */
/* loaded from: classes.dex */
public final class lq0 extends android.view.ViewOutlineProvider {
    public final /* synthetic */ com.google.android.material.chip.Chip a;

    public lq0(com.google.android.material.chip.Chip r1) {
            r0 = this;
            r0.a = r1
            r0.<init>()
            return
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(android.view.View r1, android.graphics.Outline r2) {
            r0 = this;
            com.google.android.material.chip.Chip r0 = r0.a
            nq0 r0 = r0.d0
            if (r0 == 0) goto La
            r0.getOutline(r2)
            return
        La:
            r0 = 0
            r2.setAlpha(r0)
            return
    }
}
