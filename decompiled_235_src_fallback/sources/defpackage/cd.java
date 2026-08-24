package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: cd  reason: default package */
/* loaded from: classes.dex */
public final class cd {
    public final /* synthetic */ int a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ cd(java.lang.Object r1, int r2) {
            r0 = this;
            r0.a = r2
            r0.b = r1
            r0.<init>()
            return
    }

    public final void a(float r7) {
            r6 = this;
            int r0 = r6.a
            java.lang.Object r6 = r6.b
            switch(r0) {
                case 0: goto L13;
                default: goto L7;
            }
        L7:
            qj6 r6 = (defpackage.qj6) r6
            j70 r6 = r6.A
            java.lang.Float r7 = java.lang.Float.valueOf(r7)
            r6.g(r7)
            return
        L13:
            dd r6 = (defpackage.dd) r6
            bd r0 = r6.n
            rs4 r1 = r6.j
            float r2 = r1.h()
            boolean r2 = java.lang.Float.isNaN(r2)
            r3 = 0
            if (r2 == 0) goto L26
            r1 = r3
            goto L2a
        L26:
            float r1 = r1.h()
        L2a:
            float r1 = r1 + r7
            s04 r7 = r6.d()
            java.util.Map r7 = r7.a
            java.util.Collection r7 = r7.values()
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            r7.getClass()
            java.util.Iterator r7 = r7.iterator()
            boolean r2 = r7.hasNext()
            r4 = 0
            if (r2 != 0) goto L47
            r7 = r4
            goto L6a
        L47:
            java.lang.Object r2 = r7.next()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
        L51:
            boolean r5 = r7.hasNext()
            if (r5 == 0) goto L66
            java.lang.Object r5 = r7.next()
            java.lang.Number r5 = (java.lang.Number) r5
            float r5 = r5.floatValue()
            float r2 = java.lang.Math.min(r2, r5)
            goto L51
        L66:
            java.lang.Float r7 = java.lang.Float.valueOf(r2)
        L6a:
            r2 = 2143289344(0x7fc00000, float:NaN)
            if (r7 == 0) goto L73
            float r7 = r7.floatValue()
            goto L74
        L73:
            r7 = r2
        L74:
            s04 r6 = r6.d()
            java.util.Map r6 = r6.a
            java.util.Collection r6 = r6.values()
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            r6.getClass()
            java.util.Iterator r6 = r6.iterator()
            boolean r5 = r6.hasNext()
            if (r5 != 0) goto L8e
            goto Lb1
        L8e:
            java.lang.Object r4 = r6.next()
            java.lang.Number r4 = (java.lang.Number) r4
            float r4 = r4.floatValue()
        L98:
            boolean r5 = r6.hasNext()
            if (r5 == 0) goto Lad
            java.lang.Object r5 = r6.next()
            java.lang.Number r5 = (java.lang.Number) r5
            float r5 = r5.floatValue()
            float r4 = java.lang.Math.max(r4, r5)
            goto L98
        Lad:
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
        Lb1:
            if (r4 == 0) goto Lb7
            float r2 = r4.floatValue()
        Lb7:
            float r6 = defpackage.gi2.p(r1, r7, r2)
            dd r7 = r0.a
            rs4 r0 = r7.j
            r0.i(r6)
            rs4 r6 = r7.k
            r6.i(r3)
            return
    }
}
