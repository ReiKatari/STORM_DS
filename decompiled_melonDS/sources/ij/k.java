package ij;

import java.io.InputStream;
import java.util.Arrays;
import java.util.HashMap;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a  reason: collision with root package name */
    public static final g f7096a;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.AbstractMap, java.util.HashMap, ij.g] */
    static {
        ?? hashMap = new HashMap();
        hashMap.put(w.COPY, new j(new Class[0], 3));
        hashMap.put(w.LZMA, new j(new Class[]{zj.k.class, Number.class}, 7));
        hashMap.put(w.LZMA2, new j(new Class[]{zj.k.class, Number.class}, 6));
        hashMap.put(w.DEFLATE, new j(new Class[]{Number.class}, 0));
        hashMap.put(w.DEFLATE64, new j(new Class[]{Number.class}, 4));
        hashMap.put(w.BZIP2, new j(new Class[]{Number.class}, 2));
        hashMap.put(w.AES256SHA256, new j(new Class[]{a.class}, 1));
        hashMap.put(w.BCJ_X86_FILTER, new h(new zj.a(5)));
        hashMap.put(w.BCJ_PPC_FILTER, new h(new zj.a(3)));
        hashMap.put(w.BCJ_IA64_FILTER, new h(new zj.a(2)));
        hashMap.put(w.BCJ_ARM_FILTER, new h(new zj.a(0)));
        hashMap.put(w.BCJ_ARM_THUMB_FILTER, new h(new zj.a(1)));
        hashMap.put(w.BCJ_SPARC_FILTER, new h(new zj.a(4)));
        hashMap.put(w.DELTA_FILTER, new j(new Class[]{Number.class}, 5));
        f7096a = hashMap;
    }

    public static InputStream a(String str, InputStream inputStream, long j2, f fVar, byte[] bArr, int i2) {
        byte[] bArr2 = fVar.f7089a;
        d dVar = (d) f7096a.get(w.byId(bArr2));
        if (dVar != null) {
            return dVar.a(str, inputStream, j2, fVar, bArr, i2);
        }
        fj.j.o("Unsupported compression method ", Arrays.toString(bArr2), " used in ", str);
        return null;
    }
}
