package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: k41  reason: default package */
/* loaded from: classes.dex */
public final class k41 {
    public final defpackage.mm6 a;

    public k41() {
            r1 = this;
            r1.<init>()
            mm6 r0 = new mm6
            r0.<init>()
            r1.a = r0
            return
    }

    public static void b(defpackage.k41 r1, defpackage.eo2 r2, defpackage.zv0 r3, defpackage.on2 r4, int r5) {
            r5 = r5 & 8
            if (r5 == 0) goto L5
            r3 = 0
        L5:
            mm6 r5 = r1.a
            dq3 r0 = new dq3
            r0.<init>(r2, r1, r3, r4)
            zv0 r1 = new zv0
            r2 = -1789283891(0xffffffff9559b1cd, float:-4.396306E-26)
            r3 = 1
            r1.<init>(r2, r3, r0)
            r5.add(r1)
            return
    }

    public final void a(defpackage.i41 r7, defpackage.px0 r8, int r9) {
            r6 = this;
            xq2 r8 = (defpackage.xq2) r8
            r0 = -798501095(0xffffffffd067d719, float:-1.5558534E10)
            r8.d0(r0)
            boolean r0 = r8.f(r7)
            if (r0 == 0) goto L10
            r0 = 4
            goto L11
        L10:
            r0 = 2
        L11:
            r0 = r0 | r9
            boolean r1 = r8.f(r6)
            if (r1 == 0) goto L1b
            r1 = 32
            goto L1d
        L1b:
            r1 = 16
        L1d:
            r0 = r0 | r1
            r1 = r0 & 19
            r2 = 18
            r3 = 0
            if (r1 == r2) goto L27
            r1 = 1
            goto L28
        L27:
            r1 = r3
        L28:
            r2 = r0 & 1
            boolean r1 = r8.S(r2, r1)
            if (r1 == 0) goto L4a
            mm6 r1 = r6.a
            int r2 = r1.size()
        L36:
            if (r3 >= r2) goto L4d
            java.lang.Object r4 = r1.get(r3)
            fo2 r4 = (defpackage.fo2) r4
            r5 = r0 & 14
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r4.e(r7, r8, r5)
            int r3 = r3 + 1
            goto L36
        L4a:
            r8.V()
        L4d:
            cf5 r8 = r8.t()
            if (r8 == 0) goto L5b
            ql1 r0 = new ql1
            r1 = 7
            r0.<init>(r6, r9, r1, r7)
            r8.d = r0
        L5b:
            return
    }
}
