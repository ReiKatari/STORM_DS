package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: au3  reason: default package */
/* loaded from: classes.dex */
public final class au3 implements defpackage.fu3, defpackage.w61 {
    public final defpackage.ut3 A;
    public final defpackage.l61 B;

    public au3(defpackage.ut3 r1, defpackage.l61 r2) {
            r0 = this;
            r2.getClass()
            r0.<init>()
            r0.A = r1
            r0.B = r2
            tt3 r0 = r1.b()
            tt3 r1 = defpackage.tt3.DESTROYED
            if (r0 != r1) goto L16
            r0 = 0
            defpackage.yh2.m(r2, r0)
        L16:
            return
    }

    @Override // defpackage.w61
    public final defpackage.l61 A() {
            r0 = this;
            l61 r0 = r0.B
            return r0
    }

    @Override // defpackage.fu3
    public final void h(defpackage.hu3 r2, defpackage.st3 r3) {
            r1 = this;
            ut3 r2 = r1.A
            tt3 r3 = r2.b()
            tt3 r0 = defpackage.tt3.DESTROYED
            int r3 = r3.compareTo(r0)
            if (r3 > 0) goto L17
            r2.c(r1)
            l61 r1 = r1.B
            r2 = 0
            defpackage.yh2.m(r1, r2)
        L17:
            return
    }
}
