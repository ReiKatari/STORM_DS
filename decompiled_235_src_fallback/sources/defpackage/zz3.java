package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zz3  reason: default package */
/* loaded from: classes.dex */
public final class zz3 {
    public static final java.util.List b = null;
    public final java.util.ArrayList a;

    static {
            ze7 r0 = new ze7
            r1 = 0
            r0.<init>(r1)
            ze7 r1 = new ze7
            r2 = 9
            r1.<init>(r2)
            ze7 r2 = new ze7
            r3 = -65
            r2.<init>(r3)
            ze7[] r0 = new defpackage.ze7[]{r0, r1, r2}
            java.util.List r0 = defpackage.hf.c0(r0)
            defpackage.zz3.b = r0
            return
    }

    public zz3(java.util.ArrayList r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r1 != r2) goto L3
            goto L16
        L3:
            boolean r0 = r2 instanceof defpackage.zz3
            if (r0 != 0) goto L8
            goto L14
        L8:
            zz3 r2 = (defpackage.zz3) r2
            java.util.ArrayList r1 = r1.a
            java.util.ArrayList r2 = r2.a
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L16
        L14:
            r1 = 0
            return r1
        L16:
            r1 = 1
            return r1
    }

    public final int hashCode() {
            r0 = this;
            java.util.ArrayList r0 = r0.a
            int r0 = r0.hashCode()
            return r0
    }

    public final java.lang.String toString() {
            r6 = this;
            v83 r4 = new v83
            r0 = 22
            r4.<init>(r0)
            r5 = 30
            java.util.ArrayList r0 = r6.a
            java.lang.String r1 = ":"
            r2 = 0
            r3 = 0
            java.lang.String r6 = defpackage.gt0.P0(r0, r1, r2, r3, r4, r5)
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r6 = r6.toUpperCase(r0)
            r6.getClass()
            return r6
    }
}
