package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: kl1  reason: default package */
/* loaded from: classes.dex */
public final class kl1 extends defpackage.aj3 implements defpackage.on2 {
    public final /* synthetic */ boolean B;
    public final /* synthetic */ defpackage.d56 L;
    public final /* synthetic */ java.lang.String R;

    public kl1(boolean r1, defpackage.d56 r2, java.lang.String r3) {
            r0 = this;
            r0.B = r1
            r0.L = r2
            r0.R = r3
            r1 = 0
            r0.<init>(r1)
            return
    }

    @Override // defpackage.on2
    public final java.lang.Object c() {
            r2 = this;
            boolean r0 = r2.B
            if (r0 == 0) goto L1a
            d56 r0 = r2.L
            java.lang.String r2 = r2.R
            f56 r0 = r0.a
            jd1 r1 = r0.c
            monitor-enter(r1)
            java.util.LinkedHashMap r0 = r0.d     // Catch: java.lang.Throwable -> L17
            java.lang.Object r2 = r0.remove(r2)     // Catch: java.lang.Throwable -> L17
            c56 r2 = (defpackage.c56) r2     // Catch: java.lang.Throwable -> L17
            monitor-exit(r1)
            goto L1a
        L17:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        L1a:
            jg7 r2 = defpackage.jg7.a
            return r2
    }
}
