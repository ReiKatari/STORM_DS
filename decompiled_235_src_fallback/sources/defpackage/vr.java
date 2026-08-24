package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vr  reason: default package */
/* loaded from: classes.dex */
public final class vr extends defpackage.ik2 {
    public final /* synthetic */ defpackage.cs f0;
    public final /* synthetic */ defpackage.fs g0;

    public vr(defpackage.fs r1, defpackage.fs r2, defpackage.cs r3) {
            r0 = this;
            r0.g0 = r1
            r0.f0 = r3
            r0.<init>(r2)
            return
    }

    @Override // defpackage.ik2
    public final defpackage.lh6 b() {
            r0 = this;
            cs r0 = r0.f0
            return r0
    }

    @Override // defpackage.ik2
    public final boolean c() {
            r2 = this;
            fs r2 = r2.g0
            es r0 = r2.getInternalPopup()
            boolean r0 = r0.a()
            if (r0 != 0) goto L19
            es r0 = r2.e0
            int r1 = r2.getTextDirection()
            int r2 = r2.getTextAlignment()
            r0.l(r1, r2)
        L19:
            r2 = 1
            return r2
    }
}
