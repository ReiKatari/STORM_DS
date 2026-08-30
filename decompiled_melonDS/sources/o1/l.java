package o1;

import androidx.preference.Preference;
import java.util.List;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    public final jb.c f10529a;

    /* renamed from: b  reason: collision with root package name */
    public final int f10530b;

    /* renamed from: c  reason: collision with root package name */
    public final int f10531c;

    /* renamed from: d  reason: collision with root package name */
    public final k f10532d;

    /* renamed from: e  reason: collision with root package name */
    public final d5.j f10533e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ jb.c f10534f;

    public l(jb.c cVar, int i2, int i10, k kVar, d5.j jVar) {
        this.f10534f = cVar;
        this.f10529a = cVar;
        this.f10530b = i2;
        this.f10531c = i10;
        this.f10532d = kVar;
        this.f10533e = jVar;
    }

    public final long a(int i2, int i10) {
        int i11;
        jb.c cVar = this.f10529a;
        int[] iArr = (int[]) cVar.B;
        if (i10 == 1) {
            i11 = iArr[i2];
        } else {
            int i12 = (i10 + i2) - 1;
            int[] iArr2 = (int[]) cVar.L;
            i11 = (iArr2[i12] + iArr[i12]) - iArr2[i2];
        }
        if (i11 < 0) {
            i11 = 0;
        }
        if (i11 < 0) {
            x4.i.a("width must be >= 0");
        }
        return x4.b.h(i11, i11, 0, Preference.DEFAULT_ORDER);
    }

    public final p b(int i2) {
        int i10;
        r j2 = this.f10533e.j(i2);
        int i11 = j2.f10585a;
        int size = j2.f10586b.size();
        int i12 = 0;
        if (size != 0 && i11 + size != this.f10530b) {
            i10 = this.f10531c;
        } else {
            i10 = 0;
        }
        o[] oVarArr = new o[size];
        int i13 = 0;
        while (true) {
            List list = j2.f10586b;
            if (i12 < size) {
                int i14 = (int) ((b) list.get(i12)).f10497a;
                int i15 = i10;
                o j10 = this.f10532d.j(i11 + i12, a(i13, i14), i13, i14, i15);
                i13 += i14;
                oVarArr[i12] = j10;
                i12++;
                i10 = i15;
            } else {
                return new p(i2, oVarArr, this.f10534f, list, i10);
            }
        }
    }
}
