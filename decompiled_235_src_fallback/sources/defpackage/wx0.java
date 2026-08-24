package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wx0  reason: default package */
/* loaded from: classes.dex */
public final class wx0 implements defpackage.x05 {
    public final java.util.ArrayList a;

    public wx0() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.a = r0
            return
    }

    @Override // defpackage.x05
    public final boolean a(androidx.preference.Preference r5, java.lang.Object r6) {
            r4 = this;
            r5.getClass()
            java.util.ArrayList r4 = r4.a
            if (r4 == 0) goto Le
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto Le
            goto L25
        Le:
            int r0 = r4.size()
            r1 = 0
            r2 = r1
        L14:
            if (r2 >= r0) goto L25
            java.lang.Object r3 = r4.get(r2)
            int r2 = r2 + 1
            x05 r3 = (defpackage.x05) r3
            boolean r3 = r3.a(r5, r6)
            if (r3 != 0) goto L14
            return r1
        L25:
            r4 = 1
            return r4
    }
}
