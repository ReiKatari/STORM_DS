package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: du  reason: default package */
/* loaded from: classes.dex */
public final class du implements defpackage.fu {
    public final /* synthetic */ int A;

    public /* synthetic */ du(int r1) {
            r0 = this;
            r0.A = r1
            r0.<init>()
            return
    }

    @Override // defpackage.fu
    public final void d(defpackage.qh1 r3, int r4, int[] r5, defpackage.kk3 r6, int[] r7) {
            r2 = this;
            int r2 = r2.A
            r3 = -1
            r0 = 0
            switch(r2) {
                case 0: goto L7d;
                case 1: goto L61;
                case 2: goto L34;
                default: goto L7;
            }
        L7:
            kk3 r2 = defpackage.kk3.Ltr
            if (r6 != r2) goto L1b
            int r2 = r5.length
            r3 = r0
            r4 = r3
        Le:
            if (r0 >= r2) goto L33
            r6 = r5[r0]
            int r1 = r3 + 1
            r7[r3] = r4
            int r4 = r4 + r6
            int r0 = r0 + 1
            r3 = r1
            goto Le
        L1b:
            int r2 = r5.length
            r6 = r0
        L1d:
            if (r0 >= r2) goto L25
            r1 = r5[r0]
            int r6 = r6 + r1
            int r0 = r0 + 1
            goto L1d
        L25:
            int r4 = r4 - r6
            int r2 = r5.length
            int r2 = r2 + (-1)
        L29:
            if (r3 >= r2) goto L33
            r6 = r5[r2]
            r7[r2] = r4
            int r4 = r4 + r6
            int r2 = r2 + (-1)
            goto L29
        L33:
            return
        L34:
            kk3 r2 = defpackage.kk3.Ltr
            if (r6 != r2) goto L53
            int r2 = r5.length
            r3 = r0
            r6 = r3
        L3b:
            if (r3 >= r2) goto L43
            r1 = r5[r3]
            int r6 = r6 + r1
            int r3 = r3 + 1
            goto L3b
        L43:
            int r4 = r4 - r6
            int r2 = r5.length
            r3 = r0
        L46:
            if (r0 >= r2) goto L60
            r6 = r5[r0]
            int r1 = r3 + 1
            r7[r3] = r4
            int r4 = r4 + r6
            int r0 = r0 + 1
            r3 = r1
            goto L46
        L53:
            int r2 = r5.length
            int r2 = r2 + (-1)
        L56:
            if (r3 >= r2) goto L60
            r4 = r5[r2]
            r7[r2] = r0
            int r0 = r0 + r4
            int r2 = r2 + (-1)
            goto L56
        L60:
            return
        L61:
            int r2 = r5.length
            r3 = r0
            r6 = r3
        L64:
            if (r3 >= r2) goto L6c
            r1 = r5[r3]
            int r6 = r6 + r1
            int r3 = r3 + 1
            goto L64
        L6c:
            int r4 = r4 - r6
            int r2 = r5.length
            r3 = r0
        L6f:
            if (r0 >= r2) goto L7c
            r6 = r5[r0]
            int r1 = r3 + 1
            r7[r3] = r4
            int r4 = r4 + r6
            int r0 = r0 + 1
            r3 = r1
            goto L6f
        L7c:
            return
        L7d:
            int r2 = r5.length
            r3 = r0
            r4 = r3
        L80:
            if (r0 >= r2) goto L8d
            r6 = r5[r0]
            int r1 = r3 + 1
            r7[r3] = r4
            int r4 = r4 + r6
            int r0 = r0 + 1
            r3 = r1
            goto L80
        L8d:
            return
    }

    public final java.lang.String toString() {
            r0 = this;
            int r0 = r0.A
            switch(r0) {
                case 0: goto Le;
                case 1: goto Lb;
                case 2: goto L8;
                default: goto L5;
            }
        L5:
            java.lang.String r0 = "Arrangement#Start"
            return r0
        L8:
            java.lang.String r0 = "Arrangement#End"
            return r0
        Lb:
            java.lang.String r0 = "AbsoluteArrangement#Right"
            return r0
        Le:
            java.lang.String r0 = "AbsoluteArrangement#Left"
            return r0
    }
}
