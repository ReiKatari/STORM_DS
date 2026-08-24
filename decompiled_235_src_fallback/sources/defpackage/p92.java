package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: p92  reason: default package */
/* loaded from: classes.dex */
public final class p92 extends defpackage.lz6 {
    public final /* synthetic */ defpackage.h26 e;
    public final /* synthetic */ defpackage.fb f;

    public p92(java.lang.String r1, defpackage.h26 r2, defpackage.fb r3) {
            r0 = this;
            r0.e = r2
            r0.f = r3
            r2 = 1
            r0.<init>(r1, r2)
            return
    }

    @Override // defpackage.lz6
    public final long a() {
            r4 = this;
            h26 r0 = r4.e
            g26 r1 = r0.d()     // Catch: java.lang.Throwable -> L7
            goto Lf
        L7:
            r1 = move-exception
            g26 r2 = new g26
            r3 = 2
            r2.<init>(r0, r1, r3)
            r1 = r2
        Lf:
            fb r4 = r4.f
            java.lang.Object r2 = r4.R
            java.util.concurrent.CopyOnWriteArrayList r2 = (java.util.concurrent.CopyOnWriteArrayList) r2
            boolean r0 = r2.contains(r0)
            if (r0 == 0) goto L22
            java.lang.Object r4 = r4.X
            java.util.concurrent.LinkedBlockingDeque r4 = (java.util.concurrent.LinkedBlockingDeque) r4
            r4.put(r1)
        L22:
            r0 = -1
            return r0
    }
}
