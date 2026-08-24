package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hq  reason: default package */
/* loaded from: classes.dex */
public final class hq implements defpackage.c56 {
    public final /* synthetic */ int a;
    public final java.lang.Object b;

    public hq(defpackage.d56 r2) {
            r1 = this;
            r0 = 1
            r1.a = r0
            r1.<init>()
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            r1.b = r0
            java.lang.String r0 = "androidx.savedstate.Restarter"
            r2.c(r0, r1)
            return
    }

    public hq(defpackage.jq r2) {
            r1 = this;
            r0 = 0
            r1.a = r0
            r1.<init>()
            r1.b = r2
            return
    }

    @Override // defpackage.c56
    public final android.os.Bundle a() {
            r2 = this;
            int r0 = r2.a
            java.lang.Object r2 = r2.b
            switch(r0) {
                case 0: goto L20;
                default: goto L7;
            }
        L7:
            r0 = 0
            vr4[] r1 = new defpackage.vr4[r0]
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r1, r0)
            vr4[] r0 = (defpackage.vr4[]) r0
            android.os.Bundle r0 = defpackage.jw2.l(r0)
            java.util.LinkedHashSet r2 = (java.util.LinkedHashSet) r2
            java.util.List r2 = defpackage.gt0.k1(r2)
            java.lang.String r1 = "classes_to_restore"
            defpackage.bl2.N(r0, r1, r2)
            return r0
        L20:
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            jq r2 = (defpackage.jq) r2
            tq r2 = r2.v()
            r2.getClass()
            return r0
    }
}
