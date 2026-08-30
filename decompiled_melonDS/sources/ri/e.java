package ri;

import fj.g0;
import java.io.Closeable;
import java.util.ArrayList;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class e implements Closeable {
    public final String A;
    public final long B;
    public final ArrayList L;
    public final /* synthetic */ h R;

    public e(h hVar, String str, long j2, ArrayList arrayList, long[] jArr) {
        str.getClass();
        jArr.getClass();
        this.R = hVar;
        this.A = str;
        this.B = j2;
        this.L = arrayList;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ArrayList arrayList = this.L;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            qi.e.b((g0) obj);
        }
    }
}
