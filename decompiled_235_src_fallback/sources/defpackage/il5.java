package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: il5  reason: default package */
/* loaded from: classes.dex */
public final class il5 {
    public final /* synthetic */ int a;
    public final java.util.LinkedHashSet b;

    static {
            return
    }

    public il5() {
            r1 = this;
            r0 = 1
            r1.a = r0
            r1.<init>()
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            r1.b = r0
            return
    }

    public il5(java.util.LinkedHashSet r2) {
            r1 = this;
            r0 = 0
            r1.a = r0
            r1.<init>()
            r1.b = r2
            return
    }

    public java.lang.String toString() {
            r2 = this;
            int r0 = r2.a
            switch(r0) {
                case 0: goto La;
                default: goto L5;
            }
        L5:
            java.lang.String r2 = super.toString()
            return r2
        La:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ResolvedFeatureGroup(features="
            r0.<init>(r1)
            java.util.LinkedHashSet r2 = r2.b
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
