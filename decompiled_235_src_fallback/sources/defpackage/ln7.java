package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ln7  reason: default package */
/* loaded from: classes.dex */
public final class ln7 implements defpackage.gi7 {
    public final defpackage.uw a;

    public ln7() {
            r1 = this;
            r1.<init>()
            r0 = 0
            uw r0 = defpackage.g04.t(r0)
            r1.a = r0
            return
    }

    @Override // defpackage.gi7
    public final void b(defpackage.li7 r1) {
            r0 = this;
            return
    }

    @Override // defpackage.gi7
    public final void reset() {
            r1 = this;
            uw r1 = r1.a
            r0 = 0
            r1.a = r0
            java.lang.String r1 = "CXCP"
            boolean r0 = defpackage.kj2.F(r1)
            if (r0 == 0) goto L12
            java.lang.String r0 = "reset: videoUsage = 0"
            android.util.Log.d(r1, r0)
        L12:
            return
    }
}
