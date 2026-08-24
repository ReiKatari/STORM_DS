package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ya6  reason: default package */
/* loaded from: classes.dex */
public final class ya6 {
    public final defpackage.ta6 a;
    public final defpackage.q94 b;

    public ya6(defpackage.xa6 r5, defpackage.g93 r6) {
            r4 = this;
            r4.<init>()
            ta6 r0 = r5.d
            r4.a = r0
            r0 = 4
            java.util.List r5 = defpackage.xa6.j(r0, r5)
            q94 r0 = new q94
            int r1 = r5.size()
            r0.<init>(r1)
            r4.b = r0
            int r0 = r5.size()
            r1 = 0
        L1c:
            if (r1 >= r0) goto L36
            java.lang.Object r2 = r5.get(r1)
            xa6 r2 = (defpackage.xa6) r2
            int r3 = r2.f
            boolean r3 = r6.a(r3)
            if (r3 == 0) goto L33
            q94 r3 = r4.b
            int r2 = r2.f
            r3.a(r2)
        L33:
            int r1 = r1 + 1
            goto L1c
        L36:
            return
    }
}
