package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: cu  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class cu implements java.util.function.Predicate {
    public final /* synthetic */ int a;

    public /* synthetic */ cu(int r1) {
            r0 = this;
            r0.a = r1
            r0.<init>()
            return
    }

    @Override // java.util.function.Predicate
    public final boolean test(java.lang.Object r1) {
            r0 = this;
            int r0 = r0.a
            switch(r0) {
                case 0: goto Lc;
                default: goto L5;
            }
        L5:
            md6 r1 = (defpackage.md6) r1
            boolean r0 = java.util.Objects.nonNull(r1)
            return r0
        Lc:
            com.github.junrar.rarfile.FileHeader r1 = (com.github.junrar.rarfile.FileHeader) r1
            boolean r0 = r1.isEncrypted()
            return r0
    }
}
