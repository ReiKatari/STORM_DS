package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: z77  reason: default package */
/* loaded from: classes.dex */
public final class z77 extends defpackage.or0 {
    public boolean J0;
    public defpackage.qn2 K0;
    public final defpackage.t46 L0;

    public z77(boolean r9, defpackage.r94 r10, boolean r11, defpackage.mq5 r12, defpackage.qn2 r13) {
            r8 = this;
            q01 r7 = new q01
            r0 = 3
            r7.<init>(r13, r9, r0)
            r2 = 0
            r3 = 0
            r5 = 0
            r0 = r8
            r1 = r10
            r4 = r11
            r6 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r0.J0 = r9
            r0.K0 = r13
            t46 r8 = new t46
            r9 = 18
            r8.<init>(r0, r9)
            r0.L0 = r8
            return
    }

    @Override // defpackage.h0
    public final void U0(defpackage.gb6 r6) {
            r5 = this;
            boolean r0 = r5.J0
            if (r0 == 0) goto L7
            a87 r0 = defpackage.a87.On
            goto L9
        L7:
            a87 r0 = defpackage.a87.Off
        L9:
            fg3[] r1 = defpackage.eb6.a
            fb6 r1 = defpackage.bb6.K
            fg3[] r2 = defpackage.eb6.a
            r3 = 26
            r4 = r2[r3]
            r6.a(r1, r0)
            rf r0 = defpackage.xd5.Z
            fb6 r1 = defpackage.bb6.s
            r4 = 9
            r4 = r2[r4]
            r6.a(r1, r0)
            boolean r5 = r5.J0
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 0
            if (r0 < r3) goto L32
            oh r0 = new oh
            android.view.autofill.AutofillValue r5 = defpackage.au.e(r5)
            r0.<init>(r5)
            goto L33
        L32:
            r0 = r1
        L33:
            if (r0 == 0) goto L3e
            fb6 r5 = defpackage.bb6.t
            r3 = 10
            r2 = r2[r3]
            r6.a(r5, r0)
        L3e:
            ro5 r5 = new ro5
            r0 = 21
            r5.<init>(r6, r0)
            fb6 r0 = defpackage.sa6.h
            y1 r2 = new y1
            r2.<init>(r1, r5)
            r6.a(r0, r2)
            return
    }
}
