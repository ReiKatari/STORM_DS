package defpackage;

import java.io.InputStream;
import java.util.Arrays;
import java.util.HashMap;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: us0  reason: default package */
/* loaded from: classes.dex */
public abstract class us0 {
    public static final qs0 a;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.AbstractMap, java.util.HashMap, qs0] */
    static {
        ?? hashMap = new HashMap();
        hashMap.put(td6.COPY, new ts0(new Class[0], 3));
        hashMap.put(td6.LZMA, new ts0(new Class[]{wi3.class, Number.class}, 7));
        hashMap.put(td6.LZMA2, new ts0(new Class[]{wi3.class, Number.class}, 6));
        hashMap.put(td6.DEFLATE, new ts0(new Class[]{Number.class}, 0));
        hashMap.put(td6.DEFLATE64, new ts0(new Class[]{Number.class}, 4));
        hashMap.put(td6.BZIP2, new ts0(new Class[]{Number.class}, 2));
        hashMap.put(td6.AES256SHA256, new ts0(new Class[]{l.class}, 1));
        hashMap.put(td6.BCJ_X86_FILTER, new rs0(new n(5)));
        hashMap.put(td6.BCJ_PPC_FILTER, new rs0(new n(3)));
        hashMap.put(td6.BCJ_IA64_FILTER, new rs0(new n(2)));
        hashMap.put(td6.BCJ_ARM_FILTER, new rs0(new n(0)));
        hashMap.put(td6.BCJ_ARM_THUMB_FILTER, new rs0(new n(1)));
        hashMap.put(td6.BCJ_SPARC_FILTER, new rs0(new n(4)));
        hashMap.put(td6.DELTA_FILTER, new ts0(new Class[]{Number.class}, 5));
        a = hashMap;
    }

    public static InputStream a(String str, InputStream inputStream, long j, ps0 ps0Var, byte[] bArr, int i) {
        byte[] bArr2 = ps0Var.a;
        j0 j0Var = (j0) a.get(td6.byId(bArr2));
        if (j0Var != null) {
            return j0Var.a(str, inputStream, j, ps0Var, bArr, i);
        }
        fa6.i("Unsupported compression method ", Arrays.toString(bArr2), " used in ", str);
        return null;
    }
}
