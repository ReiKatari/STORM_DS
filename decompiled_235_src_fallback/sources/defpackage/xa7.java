package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xa7  reason: default package */
/* loaded from: classes.dex */
public final class xa7 {
    public static defpackage.ya7 a(java.lang.String r3) {
            t52 r0 = defpackage.ya7.getEntries()
            java.util.Iterator r0 = r0.iterator()
        L8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L20
            java.lang.Object r1 = r0.next()
            r2 = r1
            ya7 r2 = (defpackage.ya7) r2
            java.lang.String r2 = r2.getPreferenceValue()
            boolean r2 = defpackage.nb3.k(r2, r3)
            if (r2 == 0) goto L8
            goto L21
        L20:
            r1 = 0
        L21:
            ya7 r1 = (defpackage.ya7) r1
            if (r1 != 0) goto L28
            ya7 r3 = defpackage.ya7.SMART_BACKGROUND_MATCH
            return r3
        L28:
            return r1
    }
}
