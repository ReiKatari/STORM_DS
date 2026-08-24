package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: iv7  reason: default package */
/* loaded from: classes.dex */
public abstract class iv7 {
    public static final int a = 9;
    public static final int b = 6;
    public static final int c = 10;
    public static final int d = 5;
    public static final int e = 15;

    public static final defpackage.x61 a(defpackage.ne2 r4, java.lang.Object r5, java.lang.Object r6, defpackage.s41 r7) {
            boolean r0 = r7 instanceof defpackage.jf2
            if (r0 == 0) goto L13
            r0 = r7
            jf2 r0 = (defpackage.jf2) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            jf2 r0 = new jf2
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.X
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.Y
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 == r3) goto L2a
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r4)
            r4 = 0
            return r4
        L2a:
            java.lang.Object r6 = r0.R
            defpackage.oi2.Y(r7)
            goto L3e
        L30:
            defpackage.oi2.Y(r7)
            r0.R = r6
            r0.Y = r3
            java.lang.Object r4 = r4.a(r5, r0)
            if (r4 != r1) goto L3e
            return r1
        L3e:
            o r4 = new o
            r4.<init>(r6)
            throw r4
    }

    public static final void b(java.lang.StringBuilder r1, java.lang.String r2) {
            int r0 = r1.length()
            if (r0 <= 0) goto Lb
            r0 = 43
            r1.append(r0)
        Lb:
            r1.append(r2)
            return
    }
}
