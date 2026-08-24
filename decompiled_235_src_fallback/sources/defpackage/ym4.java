package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ym4  reason: default package */
/* loaded from: classes.dex */
public final class ym4 extends defpackage.ao4 {
    public static final defpackage.ym4 d = null;

    static {
            ym4 r0 = new ym4
            r1 = 2
            r2 = 1
            r3 = 0
            r0.<init>(r3, r1, r2)
            defpackage.ym4.d = r0
            return
    }

    @Override // defpackage.ao4
    public final void c(defpackage.ls0 r7, defpackage.nt r8, defpackage.pk6 r9, defpackage.jb1 r10, defpackage.bo4 r11) {
            r6 = this;
            r6 = 0
            java.lang.Object r10 = r7.g(r6)
            n93 r10 = (defpackage.n93) r10
            r11 = 1
            java.lang.Object r7 = r7.g(r11)
            sq2 r7 = (defpackage.sq2) r7
            int r7 = r9.c(r7)
            int r0 = r9.t
            java.lang.String r1 = "Check failed"
            if (r0 >= r7) goto L19
            goto L1c
        L19:
            defpackage.tx0.a(r1)
        L1c:
            defpackage.xk2.F(r9, r8, r7)
            int r0 = r9.t
            int r2 = r9.v
        L23:
            if (r2 < 0) goto L32
            boolean r3 = r9.y(r2)
            if (r3 != 0) goto L32
            int[] r3 = r9.b
            int r2 = r9.E(r3, r2)
            goto L23
        L32:
            int r2 = r2 + r11
            r3 = r6
        L34:
            if (r2 >= r0) goto L64
            boolean r4 = r9.v(r0, r2)
            if (r4 == 0) goto L46
            boolean r4 = r9.y(r2)
            if (r4 == 0) goto L43
            r3 = r6
        L43:
            int r2 = r2 + 1
            goto L34
        L46:
            boolean r4 = r9.y(r2)
            if (r4 == 0) goto L4e
            r4 = r11
            goto L5d
        L4e:
            int[] r4 = r9.b
            int r5 = r9.r(r2)
            int r5 = r5 * 5
            int r5 = r5 + r11
            r4 = r4[r5]
            r5 = 67108863(0x3ffffff, float:1.5046327E-36)
            r4 = r4 & r5
        L5d:
            int r3 = r3 + r4
            int r4 = r9.u(r2)
            int r2 = r2 + r4
            goto L34
        L64:
            int r0 = r9.t
            if (r0 >= r7) goto L98
            boolean r0 = r9.v(r7, r0)
            if (r0 == 0) goto L92
            int r0 = r9.t
            int r2 = r9.u
            if (r0 >= r2) goto L8e
            int[] r2 = r9.b
            int r0 = r9.r(r0)
            int r0 = r0 * 5
            int r0 = r0 + r11
            r0 = r2[r0]
            r2 = 1073741824(0x40000000, float:2.0)
            r0 = r0 & r2
            if (r0 == 0) goto L8e
            int r0 = r9.t
            java.lang.Object r0 = r9.D(r0)
            r8.d(r0)
            r3 = r6
        L8e:
            r9.P()
            goto L64
        L92:
            int r0 = r9.L()
            int r3 = r3 + r0
            goto L64
        L98:
            if (r0 != r7) goto L9b
            goto L9e
        L9b:
            defpackage.tx0.a(r1)
        L9e:
            r10.a = r3
            return
    }
}
