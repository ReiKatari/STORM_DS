package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ht0  reason: default package */
/* loaded from: classes.dex */
public abstract class ht0 extends defpackage.hf {
    public static int v0(java.lang.Iterable r1, int r2) {
            r1.getClass()
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto Le
            java.util.Collection r1 = (java.util.Collection) r1
            int r1 = r1.size()
            return r1
        Le:
            return r2
    }
}
