package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: pm2  reason: default package */
/* loaded from: classes.dex */
public final class pm2 extends defpackage.d2 implements defpackage.dp4 {
    public final /* synthetic */ defpackage.tm2 c;

    public pm2(defpackage.tm2 r1) {
            r0 = this;
            r0.c = r1
            r1 = 4
            r0.<init>(r1)
            return
    }

    @Override // defpackage.dp4
    public final void b(java.lang.Object r5) {
            r4 = this;
            java.lang.Object r0 = r4.b
            tu0 r0 = (defpackage.tu0) r0
            kp4 r1 = new kp4
            r1.<init>(r5)
            r0.b0(r1)
            tm2 r4 = r4.c
            xw r5 = r4.f
        L10:
            java.lang.Object r0 = r5.a
            r1 = r0
            rm2 r1 = (defpackage.rm2) r1
            int[] r2 = defpackage.sm2.a
            int r3 = r1.ordinal()
            r2 = r2[r3]
            r3 = 1
            if (r2 == r3) goto L47
            r3 = 3
            if (r2 != r3) goto L26
            rm2 r1 = defpackage.rm2.COMPLETE
            goto L49
        L26:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Unexpected frame state for "
            r0.<init>(r2)
            r0.append(r4)
            java.lang.String r4 = "! State is "
            r0.append(r4)
            r0.append(r1)
            r4 = 32
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r5.<init>(r4)
            throw r5
        L47:
            rm2 r1 = defpackage.rm2.FRAME_INFO_COMPLETE
        L49:
            boolean r0 = r5.a(r0, r1)
            if (r0 == 0) goto L10
            java.util.concurrent.CopyOnWriteArrayList r5 = r4.h
            java.util.Iterator r5 = r5.iterator()
            r5.getClass()
            boolean r0 = r5.hasNext()
            if (r0 != 0) goto L78
            rm2 r5 = defpackage.rm2.COMPLETE
            if (r1 != r5) goto L77
            java.util.concurrent.CopyOnWriteArrayList r4 = r4.h
            java.util.Iterator r4 = r4.iterator()
            r4.getClass()
            boolean r5 = r4.hasNext()
            if (r5 != 0) goto L72
            goto L77
        L72:
            java.lang.ClassCastException r4 = defpackage.i61.j(r4)
            throw r4
        L77:
            return
        L78:
            java.lang.ClassCastException r4 = defpackage.i61.j(r5)
            throw r4
    }
}
