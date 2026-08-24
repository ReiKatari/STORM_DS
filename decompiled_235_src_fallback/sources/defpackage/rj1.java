package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: rj1  reason: default package */
/* loaded from: classes.dex */
public class rj1 extends defpackage.ci1 {
    public int m;

    public rj1(defpackage.ct7 r1) {
            r0 = this;
            r0.<init>(r1)
            boolean r1 = r1 instanceof defpackage.ly2
            if (r1 == 0) goto Lc
            bi1 r1 = defpackage.bi1.HORIZONTAL_DIMENSION
            r0.e = r1
            return
        Lc:
            bi1 r1 = defpackage.bi1.VERTICAL_DIMENSION
            r0.e = r1
            return
    }

    @Override // defpackage.ci1
    public final void d(int r3) {
            r2 = this;
            boolean r0 = r2.j
            if (r0 == 0) goto L5
            goto L1f
        L5:
            r0 = 1
            r2.j = r0
            r2.g = r3
            java.util.ArrayList r2 = r2.k
            int r3 = r2.size()
            r0 = 0
        L11:
            if (r0 >= r3) goto L1f
            java.lang.Object r1 = r2.get(r0)
            int r0 = r0 + 1
            xh1 r1 = (defpackage.xh1) r1
            r1.a(r1)
            goto L11
        L1f:
            return
    }
}
