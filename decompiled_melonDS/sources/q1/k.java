package q1;

import androidx.preference.Preference;
import java.util.List;
import p1.n0;
import p1.o0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    public final a1.x f12148a;

    /* renamed from: b  reason: collision with root package name */
    public final a1.x f12149b;

    /* renamed from: c  reason: collision with root package name */
    public int f12150c;

    /* renamed from: d  reason: collision with root package name */
    public int f12151d;

    public k(h hVar, o0 o0Var, c cVar) {
        a1.x xVar = a1.m.f66a;
        this.f12148a = new a1.x();
        new a1.y();
        this.f12149b = new a1.x();
        this.f12150c = Preference.DEFAULT_ORDER;
        this.f12151d = Integer.MIN_VALUE;
    }

    public final boolean a() {
        if (this.f12150c != Integer.MAX_VALUE && this.f12151d != Integer.MIN_VALUE) {
            return true;
        }
        return false;
    }

    public final void b() {
        this.f12150c = Preference.DEFAULT_ORDER;
        this.f12151d = Integer.MIN_VALUE;
        this.f12149b.c();
        a1.x xVar = this.f12148a;
        long[] jArr = xVar.f61a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j2 = jArr[i2];
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i10 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i11 = 0; i11 < i10; i11++) {
                        if ((255 & j2) < 128) {
                            int i12 = (i2 << 3) + i11;
                            int i13 = xVar.f62b[i12];
                            List list = (List) xVar.f63c[i12];
                            int size = list.size();
                            for (int i14 = 0; i14 < size; i14++) {
                                ((n0) list.get(i14)).cancel();
                            }
                            xVar.h(i12);
                        }
                        j2 >>= 8;
                    }
                    if (i10 != 8) {
                        return;
                    }
                }
                if (i2 != length) {
                    i2++;
                } else {
                    return;
                }
            }
        }
    }
}
