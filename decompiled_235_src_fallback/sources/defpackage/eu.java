package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: eu  reason: default package */
/* loaded from: classes.dex */
public final class eu implements defpackage.iu {
    public final /* synthetic */ int A;

    public /* synthetic */ eu() {
            r1 = this;
            r0 = 1
            r1.A = r0
            r1.<init>()
            return
    }

    @Override // defpackage.iu
    public final void g(defpackage.qh1 r4, int r5, int[] r6, int[] r7) {
            r3 = this;
            int r3 = r3.A
            r4 = 0
            switch(r3) {
                case 0: goto L17;
                default: goto L6;
            }
        L6:
            int r3 = r6.length
            r5 = r4
            r0 = r5
        L9:
            if (r4 >= r3) goto L16
            r1 = r6[r4]
            int r2 = r5 + 1
            r7[r5] = r0
            int r0 = r0 + r1
            int r4 = r4 + 1
            r5 = r2
            goto L9
        L16:
            return
        L17:
            int r3 = r6.length
            r0 = r4
            r1 = r0
        L1a:
            if (r0 >= r3) goto L22
            r2 = r6[r0]
            int r1 = r1 + r2
            int r0 = r0 + 1
            goto L1a
        L22:
            int r5 = r5 - r1
            int r3 = r6.length
            r0 = r5
            r5 = r4
        L26:
            if (r4 >= r3) goto L33
            r1 = r6[r4]
            int r2 = r5 + 1
            r7[r5] = r0
            int r0 = r0 + r1
            int r4 = r4 + 1
            r5 = r2
            goto L26
        L33:
            return
    }

    public final java.lang.String toString() {
            r0 = this;
            int r0 = r0.A
            switch(r0) {
                case 0: goto L8;
                default: goto L5;
            }
        L5:
            java.lang.String r0 = "Arrangement#Top"
            return r0
        L8:
            java.lang.String r0 = "Arrangement#Bottom"
            return r0
    }
}
