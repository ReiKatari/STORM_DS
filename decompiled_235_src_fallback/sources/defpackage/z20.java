package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: z20  reason: default package */
/* loaded from: classes.dex */
public final class z20 extends java.util.LinkedHashMap {
    public z20() {
            r3 = this;
            r0 = 1061158912(0x3f400000, float:0.75)
            r1 = 1
            r2 = 64
            r3.<init>(r2, r0, r1)
            return
    }

    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(java.util.Map.Entry r1) {
            r0 = this;
            int r0 = r0.size()
            r1 = 32
            if (r0 <= r1) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }
}
