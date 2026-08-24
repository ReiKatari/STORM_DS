package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: i27  reason: default package */
/* loaded from: classes.dex */
public final class i27 {
    public static final defpackage.ap3 g = null;
    public final defpackage.rs4 a;
    public final defpackage.rs4 b;
    public final defpackage.ss4 c;
    public defpackage.of5 d;
    public long e;
    public final defpackage.vs4 f;

    static {
            z17 r0 = new z17
            r1 = 1
            r0.<init>(r1)
            r76 r1 = new r76
            r2 = 28
            r1.<init>(r2)
            ap3 r0 = defpackage.jx2.z(r0, r1)
            defpackage.i27.g = r0
            return
    }

    public i27(defpackage.lo4 r3, float r4) {
            r2 = this;
            r2.<init>()
            rs4 r0 = new rs4
            r0.<init>(r4)
            r2.a = r0
            rs4 r4 = new rs4
            r0 = 0
            r4.<init>(r0)
            r2.b = r4
            ss4 r4 = new ss4
            r0 = 0
            r4.<init>(r0)
            r2.c = r4
            of5 r4 = defpackage.of5.e
            r2.d = r4
            long r0 = defpackage.k47.b
            r2.e = r0
            xd5 r4 = defpackage.xd5.s0
            vs4 r0 = new vs4
            r0.<init>(r3, r4)
            r2.f = r0
            return
    }

    public final void a(defpackage.lo4 r9, defpackage.of5 r10, int r11, int r12) {
            r8 = this;
            int r12 = r12 - r11
            float r12 = (float) r12
            rs4 r0 = r8.b
            r0.i(r12)
            float r0 = r10.a
            float r1 = r10.b
            of5 r2 = r8.d
            float r3 = r2.a
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            r4 = 0
            rs4 r5 = r8.a
            if (r3 != 0) goto L1d
            float r2 = r2.b
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 != 0) goto L1d
            goto L5b
        L1d:
            lo4 r2 = defpackage.lo4.Vertical
            if (r9 != r2) goto L23
            r9 = 1
            goto L24
        L23:
            r9 = 0
        L24:
            if (r9 == 0) goto L27
            r0 = r1
        L27:
            if (r9 == 0) goto L2c
            float r9 = r10.d
            goto L2e
        L2c:
            float r9 = r10.c
        L2e:
            float r1 = r5.h()
            float r2 = (float) r11
            float r3 = r1 + r2
            int r6 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r6 <= 0) goto L3b
        L39:
            float r9 = r9 - r3
            goto L51
        L3b:
            int r6 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r6 >= 0) goto L46
            float r7 = r9 - r0
            int r7 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r7 <= 0) goto L46
            goto L39
        L46:
            if (r6 >= 0) goto L50
            float r9 = r9 - r0
            int r9 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r9 > 0) goto L50
            float r9 = r0 - r1
            goto L51
        L50:
            r9 = r4
        L51:
            float r0 = r5.h()
            float r0 = r0 + r9
            r5.i(r0)
            r8.d = r10
        L5b:
            float r9 = r5.h()
            float r9 = defpackage.gi2.p(r9, r4, r12)
            r5.i(r9)
            ss4 r8 = r8.c
            r8.i(r11)
            return
    }
}
