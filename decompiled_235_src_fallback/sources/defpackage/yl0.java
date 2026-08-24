package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yl0  reason: default package */
/* loaded from: classes.dex */
public final class yl0 extends defpackage.xl0 {
    public yl0(defpackage.le2 r2, defpackage.l61 r3, int r4, defpackage.m80 r5, int r6) {
            r1 = this;
            r0 = r6 & 2
            if (r0 == 0) goto L6
            vt1 r3 = defpackage.vt1.A
        L6:
            r0 = r6 & 4
            if (r0 == 0) goto Lb
            r4 = -3
        Lb:
            r6 = r6 & 8
            if (r6 == 0) goto L11
            m80 r5 = defpackage.m80.SUSPEND
        L11:
            r1.<init>(r4, r5, r3, r2)
            return
    }

    @Override // defpackage.wl0
    public final defpackage.wl0 f(defpackage.l61 r2, int r3, defpackage.m80 r4) {
            r1 = this;
            yl0 r0 = new yl0
            le2 r1 = r1.R
            r0.<init>(r3, r4, r2, r1)
            return r0
    }

    @Override // defpackage.wl0
    public final defpackage.le2 g() {
            r0 = this;
            le2 r0 = r0.R
            return r0
    }

    @Override // defpackage.xl0
    public final java.lang.Object j(defpackage.ne2 r1, defpackage.r41 r2) {
            r0 = this;
            le2 r0 = r0.R
            java.lang.Object r0 = r0.b(r1, r2)
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            if (r0 != r1) goto Lb
            return r0
        Lb:
            jg7 r0 = defpackage.jg7.a
            return r0
    }
}
