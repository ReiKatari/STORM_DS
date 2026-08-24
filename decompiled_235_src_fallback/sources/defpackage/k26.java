package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: k26  reason: default package */
/* loaded from: classes.dex */
public abstract class k26 {
    public static final defpackage.l26 a = null;

    static {
            l26 r0 = new l26
            du r1 = defpackage.ju.a
            d40 r2 = defpackage.d90.h0
            r0.<init>(r1, r2)
            defpackage.k26.a = r0
            return
    }

    public static final defpackage.l26 a(defpackage.fu r5, defpackage.d40 r6, defpackage.px0 r7, int r8) {
            du r0 = defpackage.ju.a
            boolean r0 = r5.equals(r0)
            r1 = 0
            if (r0 == 0) goto L1f
            d40 r0 = defpackage.d90.h0
            boolean r0 = defpackage.nb3.k(r6, r0)
            if (r0 == 0) goto L1f
            xq2 r7 = (defpackage.xq2) r7
            r5 = -1073830487(0xffffffffbffea5a9, float:-1.9894305)
            r7.b0(r5)
            r7.p(r1)
            l26 r5 = defpackage.k26.a
            return r5
        L1f:
            xq2 r7 = (defpackage.xq2) r7
            r0 = -1073779616(0xffffffffbfff6c60, float:-1.9954948)
            r7.b0(r0)
            r0 = r8 & 14
            r0 = r0 ^ 6
            r2 = 1
            r3 = 4
            if (r0 <= r3) goto L35
            boolean r0 = r7.f(r5)
            if (r0 != 0) goto L39
        L35:
            r0 = r8 & 6
            if (r0 != r3) goto L3b
        L39:
            r0 = r2
            goto L3c
        L3b:
            r0 = r1
        L3c:
            r3 = r8 & 112(0x70, float:1.57E-43)
            r3 = r3 ^ 48
            r4 = 32
            if (r3 <= r4) goto L4a
            boolean r3 = r7.f(r6)
            if (r3 != 0) goto L50
        L4a:
            r8 = r8 & 48
            if (r8 != r4) goto L4f
            goto L50
        L4f:
            r2 = r1
        L50:
            r8 = r0 | r2
            java.lang.Object r0 = r7.P()
            if (r8 != 0) goto L5c
            vs0 r8 = defpackage.ox0.a
            if (r0 != r8) goto L64
        L5c:
            l26 r0 = new l26
            r0.<init>(r5, r6)
            r7.l0(r0)
        L64:
            l26 r0 = (defpackage.l26) r0
            r7.p(r1)
            return r0
    }
}
