package defpackage;

import java.io.InputStream;
import java.util.Arrays;
import java.util.HashMap;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: hq0  reason: default package */
/* loaded from: classes.dex */
public abstract class hq0 {
    public static final dq0 a;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.AbstractMap, dq0, java.util.HashMap] */
    static {
        ?? hashMap = new HashMap();
        hashMap.put(h26.COPY, new gq0(new Class[0], 3));
        hashMap.put(h26.LZMA, new gq0(new Class[]{ec3.class, Number.class}, 7));
        hashMap.put(h26.LZMA2, new gq0(new Class[]{ec3.class, Number.class}, 6));
        hashMap.put(h26.DEFLATE, new gq0(new Class[]{Number.class}, 0));
        hashMap.put(h26.DEFLATE64, new gq0(new Class[]{Number.class}, 4));
        hashMap.put(h26.BZIP2, new gq0(new Class[]{Number.class}, 2));
        hashMap.put(h26.AES256SHA256, new gq0(new Class[]{l.class}, 1));
        hashMap.put(h26.BCJ_X86_FILTER, new eq0(new n(5)));
        hashMap.put(h26.BCJ_PPC_FILTER, new eq0(new n(3)));
        hashMap.put(h26.BCJ_IA64_FILTER, new eq0(new n(2)));
        hashMap.put(h26.BCJ_ARM_FILTER, new eq0(new n(0)));
        hashMap.put(h26.BCJ_ARM_THUMB_FILTER, new eq0(new n(1)));
        hashMap.put(h26.BCJ_SPARC_FILTER, new eq0(new n(4)));
        hashMap.put(h26.DELTA_FILTER, new gq0(new Class[]{Number.class}, 5));
        a = hashMap;
    }

    public static InputStream a(String str, InputStream inputStream, long j, cq0 cq0Var, byte[] bArr, int i) {
        byte[] bArr2 = cq0Var.a;
        i0 i0Var = (i0) a.get(h26.byId(bArr2));
        if (i0Var != null) {
            return i0Var.a(str, inputStream, j, cq0Var, bArr, i);
        }
        vd6.j("Unsupported compression method ", Arrays.toString(bArr2), " used in ", str);
        return null;
    }
}
