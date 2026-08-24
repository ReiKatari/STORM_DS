package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: t71  reason: default package */
/* loaded from: classes.dex */
public final class t71 implements defpackage.fa7 {
    public final defpackage.mw a;
    public final defpackage.a33 b;
    public final int c;

    public t71(defpackage.mw r1, defpackage.a33 r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            if (r3 <= 0) goto Lc
            return
        Lc:
            java.lang.String r0 = "durationMillis must be > 0."
            defpackage.i.h(r0)
            r0 = 0
            throw r0
    }

    @Override // defpackage.fa7
    public final void a() {
            r6 = this;
            n71 r0 = new n71
            mw r1 = r6.a
            r1.getClass()
            a33 r1 = r6.b
            android.graphics.drawable.Drawable r2 = r1.a()
            z23 r3 = r1.b()
            y56 r3 = r3.y
            boolean r4 = r1 instanceof defpackage.bu6
            if (r4 == 0) goto L21
            r5 = r1
            bu6 r5 = (defpackage.bu6) r5
            boolean r5 = r5.g
            if (r5 != 0) goto L1f
            goto L21
        L1f:
            r5 = 0
            goto L22
        L21:
            r5 = 1
        L22:
            int r6 = r6.c
            r0.<init>(r2, r3, r6, r5)
            if (r4 == 0) goto L2a
            goto L2e
        L2a:
            boolean r6 = r1 instanceof defpackage.b62
            if (r6 == 0) goto L2f
        L2e:
            return
        L2f:
            defpackage.i.d()
            return
    }
}
