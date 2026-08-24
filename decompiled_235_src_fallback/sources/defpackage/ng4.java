package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ng4  reason: default package */
/* loaded from: classes.dex */
public abstract class ng4 {
    public final defpackage.m86 a;
    public final defpackage.eo2 b;
    public defpackage.qh1 c;
    public boolean d;
    public final defpackage.yc1 e;

    public ng4(defpackage.m86 r1, defpackage.eo2 r2, defpackage.qh1 r3) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            yc1 r1 = new yc1
            r2 = 8
            r1.<init>(r2)
            r0.e = r1
            return
    }

    public static void a(defpackage.oy4 r3) {
            java.util.List r3 = r3.a
            int r0 = r3.size()
            r1 = 0
        L7:
            if (r1 >= r0) goto L15
            java.lang.Object r2 = r3.get(r1)
            vy4 r2 = (defpackage.vy4) r2
            r2.a()
            int r1 = r1 + 1
            goto L7
        L15:
            return
    }

    public final java.lang.Object b(defpackage.eo2 r6, defpackage.s41 r7) {
            r5 = this;
            boolean r0 = r7 instanceof defpackage.mg4
            if (r0 == 0) goto L13
            r0 = r7
            mg4 r0 = (defpackage.mg4) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            mg4 r0 = new mg4
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.R
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.Y
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L2e
            if (r2 != r4) goto L28
            defpackage.oi2.Y(r7)
            goto L4a
        L28:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r5)
            return r3
        L2e:
            defpackage.oi2.Y(r7)
            r5.d = r4
            bf4 r7 = new bf4
            r7.<init>(r5, r6, r3, r4)
            r0.Y = r4
            fu6 r6 = new fu6
            l61 r2 = r0.b()
            r6.<init>(r0, r2)
            java.lang.Object r6 = defpackage.mp2.Z(r6, r4, r6, r7)
            if (r6 != r1) goto L4a
            return r1
        L4a:
            r6 = 0
            r5.d = r6
            jg7 r5 = defpackage.jg7.a
            return r5
    }
}
