package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: y76  reason: default package */
/* loaded from: classes.dex */
public abstract class y76 {
    public static final defpackage.r76 a = null;
    public static final defpackage.w76 b = null;
    public static final defpackage.ak1 c = null;
    public static final defpackage.or4 d = null;

    static {
            r76 r0 = new r76
            r1 = 1
            r0.<init>(r1)
            defpackage.y76.a = r0
            w76 r0 = new w76
            r0.<init>()
            defpackage.y76.b = r0
            ak1 r0 = new ak1
            r0.<init>(r1)
            defpackage.y76.c = r0
            or4 r0 = new or4
            r0.<init>(r1)
            defpackage.y76.d = r0
            return
    }

    public static final java.lang.Object a(defpackage.m86 r11, long r12, defpackage.s41 r14) {
            boolean r0 = r14 instanceof defpackage.x76
            if (r0 == 0) goto L13
            r0 = r14
            x76 r0 = (defpackage.x76) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            x76 r0 = new x76
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.Y
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.Z
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2d
            ah5 r11 = r0.X
            m86 r12 = r0.R
            defpackage.oi2.Y(r14)
            r10 = r11
            r11 = r12
            goto L55
        L2d:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r11)
            r11 = 0
            return r11
        L34:
            defpackage.oi2.Y(r14)
            ah5 r10 = new ah5
            r10.<init>()
            xa4 r14 = defpackage.xa4.Default
            c0 r4 = new c0
            r8 = 0
            r5 = 3
            r9 = r11
            r6 = r12
            r4.<init>(r5, r6, r8, r9, r10)
            r0.R = r9
            r0.X = r10
            r0.Z = r3
            java.lang.Object r11 = r9.f(r14, r4, r0)
            if (r11 != r1) goto L54
            return r1
        L54:
            r11 = r9
        L55:
            float r12 = r10.A
            long r11 = r11.h(r12)
            jk4 r13 = new jk4
            r13.<init>(r11)
            return r13
    }

    public static defpackage.a74 b(defpackage.h27 r6, defpackage.lo4 r7, boolean r8, boolean r9, defpackage.r94 r10) {
            v76 r0 = new v76
            r1 = r6
            r2 = r7
            r3 = r8
            r4 = r9
            r5 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
    }
}
