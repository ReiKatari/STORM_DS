package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: w4  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class w4 implements defpackage.qn2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ defpackage.qa4 B;
    public final /* synthetic */ defpackage.qa4 L;

    public /* synthetic */ w4(defpackage.qa4 r1, defpackage.qa4 r2, int r3) {
            r0 = this;
            r0.A = r3
            r0.B = r1
            r0.L = r2
            r0.<init>()
            return
    }

    @Override // defpackage.qn2
    public final java.lang.Object g(java.lang.Object r8) {
            r7 = this;
            int r0 = r7.A
            qa4 r1 = r7.L
            qa4 r7 = r7.B
            switch(r0) {
                case 0: goto L19;
                default: goto L9;
            }
        L9:
            pq5 r8 = (defpackage.pq5) r8
            r8.getClass()
            r7.setValue(r8)
            xc1 r7 = defpackage.xc1.CONFIRM
            r1.setValue(r7)
            jg7 r7 = defpackage.jg7.a
            return r7
        L19:
            h3 r8 = (defpackage.h3) r8
            r8.getClass()
            java.util.List r0 = r8.b
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r0 = r0.iterator()
        L29:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L62
            java.lang.Object r3 = r0.next()
            r4 = r3
            o6 r4 = (defpackage.o6) r4
            java.lang.Object r5 = r7.getValue()
            l6 r5 = (defpackage.l6) r5
            o75 r6 = r4.a()
            n75 r6 = r6.m
            boolean r5 = r5.matches(r6)
            if (r5 == 0) goto L29
            java.lang.Object r5 = r1.getValue()
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L5e
            o75 r4 = r4.a()
            boolean r4 = r4.b()
            if (r4 == 0) goto L29
        L5e:
            r2.add(r3)
            goto L29
        L62:
            g3 r7 = r8.a
            r8.getClass()
            r7.getClass()
            h3 r8 = new h3
            r8.<init>(r7, r2)
            return r8
    }
}
