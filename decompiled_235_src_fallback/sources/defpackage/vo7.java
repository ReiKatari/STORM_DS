package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vo7  reason: default package */
/* loaded from: classes.dex */
public final class vo7 implements defpackage.i71, defpackage.wr0 {
    public static final void b(defpackage.vo7 r5, java.util.List r6, java.util.List r7) {
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r6 = r6.iterator()
        L9:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L45
            java.lang.Object r0 = r6.next()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r2 = defpackage.ht0.v0(r7, r2)
            r1.<init>(r2)
            java.util.Iterator r2 = r7.iterator()
        L28:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L41
            java.lang.Object r3 = r2.next()
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            vv7 r4 = new vv7
            r4.<init>(r0, r3)
            r1.add(r4)
            goto L28
        L41:
            defpackage.gt0.A0(r5, r1)
            goto L9
        L45:
            defpackage.gt0.p1(r5)
            return
    }

    @Override // defpackage.wr0
    public long a() {
            r2 = this;
            long r0 = java.lang.System.currentTimeMillis()
            return r0
    }
}
