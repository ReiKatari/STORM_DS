package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: j50  reason: default package */
/* loaded from: classes.dex */
public final class j50 {
    public int a;
    public int b;
    public boolean c;
    public final java.io.Serializable d;

    public j50(defpackage.cg0 r2, android.util.Rational r3) {
            r1 = this;
            r1.<init>()
            int r0 = r2.b()
            r1.a = r0
            int r2 = r2.m()
            r1.b = r2
            r1.d = r3
            r2 = 1
            if (r3 == 0) goto L20
            int r0 = r3.getNumerator()
            int r3 = r3.getDenominator()
            if (r0 < r3) goto L1f
            goto L20
        L1f:
            r2 = 0
        L20:
            r1.c = r2
            return
    }

    public j50(defpackage.u... r2) {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.a = r0
            r1.b = r0
            r0 = 0
            r1.c = r0
            r1.d = r2
            return
    }

    public android.util.Size a(defpackage.n23 r5) {
            r4 = this;
            r0 = 0
            int r1 = r5.K(r0)
            r2 = 0
            xx r3 = defpackage.n23.s
            java.lang.Object r5 = r5.b(r3, r2)
            android.util.Size r5 = (android.util.Size) r5
            int r2 = r4.b
            int r4 = r4.a
            if (r5 == 0) goto L36
            int r1 = defpackage.nb3.Z(r1)
            r3 = 1
            if (r3 != r2) goto L1c
            r0 = r3
        L1c:
            int r4 = defpackage.nb3.z(r1, r0, r4)
            r0 = 90
            if (r4 == r0) goto L28
            r0 = 270(0x10e, float:3.78E-43)
            if (r4 != r0) goto L36
        L28:
            android.util.Size r4 = new android.util.Size
            int r0 = r5.getHeight()
            int r5 = r5.getWidth()
            r4.<init>(r0, r5)
            return r4
        L36:
            return r5
    }
}
