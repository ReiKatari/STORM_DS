package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: oz6  reason: default package */
/* loaded from: classes.dex */
public final class oz6 extends defpackage.lz6 {
    public final /* synthetic */ int e;
    public final /* synthetic */ defpackage.on2 f;

    public oz6(java.lang.String r2, defpackage.on2 r3) {
            r1 = this;
            r0 = 1
            r1.e = r0
            r1.f = r3
            r1.<init>(r2, r0)
            return
    }

    public oz6(java.lang.String r2, boolean r3, defpackage.on2 r4) {
            r1 = this;
            r0 = 0
            r1.e = r0
            r1.f = r4
            r1.<init>(r2, r3)
            return
    }

    @Override // defpackage.lz6
    public final long a() {
            r2 = this;
            int r0 = r2.e
            on2 r2 = r2.f
            switch(r0) {
                case 0: goto L12;
                default: goto L7;
            }
        L7:
            java.lang.Object r2 = r2.c()
            java.lang.Number r2 = (java.lang.Number) r2
            long r0 = r2.longValue()
            return r0
        L12:
            r2.c()
            r0 = -1
            return r0
    }
}
