package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hc5  reason: default package */
/* loaded from: classes.dex */
public final class hc5 {
    public static defpackage.ic5 a(int r3) {
            t52 r0 = defpackage.ic5.getEntries()
            java.util.Iterator r0 = r0.iterator()
        L8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1c
            java.lang.Object r1 = r0.next()
            r2 = r1
            ic5 r2 = (defpackage.ic5) r2
            int r2 = r2.getWireValue()
            if (r2 != r3) goto L8
            goto L1d
        L1c:
            r1 = 0
        L1d:
            ic5 r1 = (defpackage.ic5) r1
            return r1
    }
}
