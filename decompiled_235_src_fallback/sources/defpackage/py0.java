package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: py0  reason: default package */
/* loaded from: classes.dex */
public final class py0 extends defpackage.l55 {
    public final /* synthetic */ int b;
    public final java.lang.Object c;

    public py0(defpackage.on2 r2) {
            r1 = this;
            r0 = 1
            r1.b = r0
            xd5 r0 = defpackage.xd5.s0
            r1.<init>(r2)
            r1.c = r0
            return
    }

    public py0(defpackage.qn2 r3) {
            r2 = this;
            r0 = 0
            r2.b = r0
            c5 r0 = new c5
            r1 = 19
            r0.<init>(r1)
            r2.<init>(r0)
            qy0 r0 = new qy0
            r0.<init>(r3)
            r2.c = r0
            return
    }

    @Override // defpackage.l55
    public final defpackage.pq a(java.lang.Object r11) {
            r10 = this;
            int r0 = r10.b
            r1 = 0
            r2 = 1
            switch(r0) {
                case 0: goto L1a;
                default: goto L7;
            }
        L7:
            pq r3 = new pq
            if (r11 != 0) goto Ld
            r6 = r2
            goto Le
        Ld:
            r6 = r1
        Le:
            java.lang.Object r0 = r10.c
            r7 = r0
            im6 r7 = (defpackage.im6) r7
            r8 = 1
            r4 = r10
            r5 = r11
            r3.<init>(r4, r5, r6, r7, r8)
            return r3
        L1a:
            r4 = r10
            r5 = r11
            pq r10 = new pq
            if (r5 != 0) goto L22
            r7 = r2
            goto L23
        L22:
            r7 = r1
        L23:
            r8 = 0
            r9 = 1
            r6 = r5
            r5 = r4
            r4 = r10
            r4.<init>(r5, r6, r7, r8, r9)
            return r4
    }

    @Override // defpackage.l55
    public defpackage.nk7 b() {
            r1 = this;
            int r0 = r1.b
            switch(r0) {
                case 0: goto La;
                default: goto L5;
            }
        L5:
            nk7 r1 = super.b()
            return r1
        La:
            java.lang.Object r1 = r1.c
            qy0 r1 = (defpackage.qy0) r1
            return r1
    }
}
