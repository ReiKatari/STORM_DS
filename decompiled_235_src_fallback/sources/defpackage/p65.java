package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: p65  reason: default package */
/* loaded from: classes.dex */
public abstract class p65 {
    public static final defpackage.da0 a = null;

    static {
            da0 r0 = defpackage.da0.R
            java.lang.String r0 = "xn--"
            da0 r0 = defpackage.xd5.o(r0)
            defpackage.p65.a = r0
            return
    }

    public static int a(int r0, boolean r1, int r2) {
            if (r1 == 0) goto L5
            int r0 = r0 / 700
            goto L7
        L5:
            int r0 = r0 / 2
        L7:
            int r1 = r0 / r2
            int r1 = r1 + r0
            r0 = 0
        Lb:
            r2 = 455(0x1c7, float:6.38E-43)
            if (r1 <= r2) goto L14
            int r1 = r1 / 35
            int r0 = r0 + 36
            goto Lb
        L14:
            int r2 = r1 * 36
            int r1 = r1 + 38
            int r2 = r2 / r1
            int r2 = r2 + r0
            return r2
    }

    public static int b(int r1) {
            r0 = 26
            if (r1 >= r0) goto L7
            int r1 = r1 + 97
            return r1
        L7:
            r0 = 36
            if (r1 >= r0) goto Le
            int r1 = r1 + 22
            return r1
        Le:
            java.lang.String r0 = "unexpected digit: "
            defpackage.u34.e(r1, r0)
            r1 = 0
            return r1
    }
}
