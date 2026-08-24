package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: s15  reason: default package */
/* loaded from: classes.dex */
public final class s15 {
    public final int a;
    public final int b;
    public final java.lang.String c;

    public s15(androidx.preference.Preference r2) {
            r1 = this;
            r1.<init>()
            java.lang.Class r0 = r2.getClass()
            java.lang.String r0 = r0.getName()
            r1.c = r0
            int r0 = r2.getLayoutResource()
            r1.a = r0
            int r2 = r2.getWidgetLayoutResource()
            r1.b = r2
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof defpackage.s15
            if (r0 != 0) goto L5
            goto L1f
        L5:
            s15 r3 = (defpackage.s15) r3
            int r0 = r2.a
            int r1 = r3.a
            if (r0 != r1) goto L1f
            int r0 = r2.b
            int r1 = r3.b
            if (r0 != r1) goto L1f
            java.lang.String r2 = r2.c
            java.lang.String r3 = r3.c
            boolean r2 = android.text.TextUtils.equals(r2, r3)
            if (r2 == 0) goto L1f
            r2 = 1
            return r2
        L1f:
            r2 = 0
            return r2
    }

    public final int hashCode() {
            r2 = this;
            r0 = 527(0x20f, float:7.38E-43)
            int r1 = r2.a
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r2.b
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.lang.String r2 = r2.c
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            return r2
    }
}
