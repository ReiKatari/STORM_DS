package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: nu  reason: default package */
/* loaded from: classes.dex */
public final class nu extends defpackage.sw3 {
    public final /* synthetic */ int b;

    public /* synthetic */ nu(defpackage.wb6 r1, int r2) {
            r0 = this;
            r0.b = r2
            r0.<init>(r1)
            return
    }

    @Override // defpackage.wb6
    public final java.lang.String a() {
            r0 = this;
            int r0 = r0.b
            switch(r0) {
                case 0: goto Le;
                case 1: goto Lb;
                case 2: goto L8;
                default: goto L5;
            }
        L5:
            java.lang.String r0 = "kotlin.collections.LinkedHashSet"
            return r0
        L8:
            java.lang.String r0 = "kotlin.collections.HashSet"
            return r0
        Lb:
            java.lang.String r0 = "kotlin.collections.ArrayList"
            return r0
        Le:
            java.lang.String r0 = "kotlin.Array"
            return r0
    }
}
