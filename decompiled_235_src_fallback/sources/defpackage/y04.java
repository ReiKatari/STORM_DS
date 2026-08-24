package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: y04  reason: default package */
/* loaded from: classes.dex */
public final class y04 {
    public static void a(java.lang.Object r0, java.lang.Object r1) {
            x04 r0 = (defpackage.x04) r0
            if (r1 != 0) goto L28
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto Lb
            goto L19
        Lb:
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
            boolean r1 = r0.hasNext()
            if (r1 != 0) goto L1a
        L19:
            return
        L1a:
            java.lang.Object r0 = r0.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            r0.getKey()
            r0.getValue()
            r0 = 0
            throw r0
        L28:
            defpackage.u34.a()
            return
    }

    public static defpackage.x04 b(java.lang.Object r1, java.lang.Object r2) {
            x04 r1 = (defpackage.x04) r1
            x04 r2 = (defpackage.x04) r2
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L1e
            boolean r0 = r1.A
            if (r0 != 0) goto L12
            x04 r1 = r1.c()
        L12:
            r1.b()
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L1e
            r1.putAll(r2)
        L1e:
            return r1
    }
}
