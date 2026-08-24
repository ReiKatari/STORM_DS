package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: tc3  reason: default package */
/* loaded from: classes.dex */
public class tc3 extends defpackage.ed3 {
    public final boolean X;

    public tc3(defpackage.rc3 r5) {
            r4 = this;
            r0 = 1
            r4.<init>(r0)
            r4.T(r5)
            hq0 r5 = r4.P()
            boolean r1 = r5 instanceof defpackage.iq0
            r2 = 0
            if (r1 == 0) goto L13
            iq0 r5 = (defpackage.iq0) r5
            goto L14
        L13:
            r5 = r2
        L14:
            r1 = 0
            if (r5 == 0) goto L35
            ed3 r5 = r5.p()
        L1b:
            boolean r3 = r5.L()
            if (r3 == 0) goto L22
            goto L36
        L22:
            hq0 r5 = r5.P()
            boolean r3 = r5 instanceof defpackage.iq0
            if (r3 == 0) goto L2d
            iq0 r5 = (defpackage.iq0) r5
            goto L2e
        L2d:
            r5 = r2
        L2e:
            if (r5 == 0) goto L35
            ed3 r5 = r5.p()
            goto L1b
        L35:
            r0 = r1
        L36:
            r4.X = r0
            return
    }

    @Override // defpackage.ed3
    public final boolean L() {
            r0 = this;
            boolean r0 = r0.X
            return r0
    }

    @Override // defpackage.ed3
    public final boolean M() {
            r0 = this;
            r0 = 1
            return r0
    }
}
