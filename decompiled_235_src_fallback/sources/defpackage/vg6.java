package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vg6  reason: default package */
/* loaded from: classes.dex */
public abstract class vg6 {
    public static final defpackage.io6 a = null;
    public static final defpackage.tg6 b = null;

    static {
            of5 r0 = defpackage.vq7.a
            r1 = 1
            r2 = 0
            r3 = 1137180672(0x43c80000, float:400.0)
            io6 r0 = defpackage.ge7.U(r2, r3, r0, r1)
            defpackage.vg6.a = r0
            tg6 r0 = new tg6
            r0.<init>()
            defpackage.vg6.b = r0
            ja4 r0 = new ja4
            r0.<init>()
            return
    }

    public static final void a(defpackage.a74 r4, defpackage.zv0 r5, defpackage.px0 r6, int r7) {
            xq2 r6 = (defpackage.xq2) r6
            r0 = 646379026(0x2686f612, float:9.364815E-16)
            r6.d0(r0)
            r0 = r7 | 6
            r1 = r0 & 19
            r2 = 18
            r3 = 1
            if (r1 == r2) goto L13
            r1 = r3
            goto L14
        L13:
            r1 = 0
        L14:
            r0 = r0 & r3
            boolean r0 = r6.S(r0, r1)
            if (r0 == 0) goto L2e
            vz4 r4 = new vz4
            r4.<init>(r5)
            r0 = 1948801580(0x74285a2c, float:5.3352953E31)
            zv0 r4 = defpackage.n16.I(r0, r4, r6)
            r0 = 6
            b(r4, r6, r0)
            x64 r4 = defpackage.x64.a
            goto L31
        L2e:
            r6.V()
        L31:
            cf5 r6 = r6.t()
            if (r6 == 0) goto L3e
            pf r0 = new pf
            r0.<init>(r4, r5, r7)
            r6.d = r0
        L3e:
            return
    }

    public static final void b(defpackage.zv0 r4, defpackage.px0 r5, int r6) {
            xq2 r5 = (defpackage.xq2) r5
            r0 = 1908320054(0x71bea736, float:1.8881375E30)
            r5.d0(r0)
            r0 = r6 & 3
            r1 = 0
            r2 = 2
            r3 = 1
            if (r0 == r2) goto L11
            r0 = r3
            goto L12
        L11:
            r0 = r1
        L12:
            r2 = r6 & 1
            boolean r0 = r5.S(r2, r0)
            if (r0 == 0) goto L2b
            ug6 r0 = new ug6
            r0.<init>(r4, r1)
            r1 = 2062852661(0x7af4a235, float:6.351052E35)
            zv0 r0 = defpackage.n16.I(r1, r0, r5)
            r1 = 6
            defpackage.bl2.d(r0, r5, r1)
            goto L2e
        L2b:
            r5.V()
        L2e:
            cf5 r5 = r5.t()
            if (r5 == 0) goto L3b
            uz3 r0 = new uz3
            r0.<init>(r4, r6, r3)
            r5.d = r0
        L3b:
            return
    }
}
