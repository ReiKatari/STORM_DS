package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fy2  reason: default package */
/* loaded from: classes.dex */
public final class fy2 {
    public int a;
    public float b;
    public final java.lang.Object c;

    public fy2(int r1, defpackage.qc r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.c = r2
            return
    }

    public fy2(defpackage.y37 r1) {
            r0 = this;
            r0.<init>()
            r0.c = r1
            r1 = -1
            r0.a = r1
            return
    }

    public float a(int r6, boolean r7, boolean r8, boolean r9) {
            r5 = this;
            java.lang.Object r0 = r5.c
            y37 r0 = (defpackage.y37) r0
            r1 = 1
            r2 = 0
            if (r7 == 0) goto L1d
            android.text.Layout r3 = r0.f
            int r3 = defpackage.hi2.C(r3, r6, r7)
            android.text.Layout r4 = r0.f
            int r4 = r4.getLineStart(r3)
            int r3 = r0.f(r3)
            if (r6 == r4) goto L1f
            if (r6 != r3) goto L1d
            goto L1f
        L1d:
            r3 = r2
            goto L20
        L1f:
            r3 = r1
        L20:
            int r4 = r6 * 4
            if (r9 == 0) goto L28
            if (r3 == 0) goto L2d
            r1 = r2
            goto L2d
        L28:
            if (r3 == 0) goto L2c
            r1 = 2
            goto L2d
        L2c:
            r1 = 3
        L2d:
            int r4 = r4 + r1
            int r1 = r5.a
            if (r1 != r4) goto L35
            float r5 = r5.b
            return r5
        L35:
            if (r9 == 0) goto L3c
            float r6 = r0.h(r6, r7)
            goto L40
        L3c:
            float r6 = r0.i(r6, r7)
        L40:
            if (r8 == 0) goto L46
            r5.a = r4
            r5.b = r6
        L46:
            return r6
    }

    public java.lang.Object b(float r5, defpackage.s41 r6) {
            r4 = this;
            boolean r0 = r6 instanceof defpackage.hi5
            if (r0 == 0) goto L13
            r0 = r6
            hi5 r0 = (defpackage.hi5) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            hi5 r0 = new hi5
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.R
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.Y
            r3 = 1
            if (r2 == 0) goto L2e
            if (r2 != r3) goto L27
            defpackage.oi2.Y(r6)
            goto L43
        L27:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r4)
            r4 = 0
            return r4
        L2e:
            defpackage.oi2.Y(r6)
            java.lang.Object r6 = r4.c
            qc r6 = (defpackage.qc) r6
            java.lang.Float r2 = new java.lang.Float
            r2.<init>(r5)
            r0.Y = r3
            java.lang.Object r6 = r6.o(r2, r0)
            if (r6 != r1) goto L43
            return r1
        L43:
            java.lang.Number r6 = (java.lang.Number) r6
            float r5 = r6.floatValue()
            float r6 = r4.b
            float r6 = r6 + r5
            r4.b = r6
            jg7 r4 = defpackage.jg7.a
            return r4
    }
}
