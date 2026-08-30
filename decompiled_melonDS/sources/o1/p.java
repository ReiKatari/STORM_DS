package o1;

import java.util.List;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class p {

    /* renamed from: a  reason: collision with root package name */
    public final int f10577a;

    /* renamed from: b  reason: collision with root package name */
    public final o[] f10578b;

    /* renamed from: c  reason: collision with root package name */
    public final jb.c f10579c;

    /* renamed from: d  reason: collision with root package name */
    public final List f10580d;

    /* renamed from: e  reason: collision with root package name */
    public final int f10581e;

    /* renamed from: f  reason: collision with root package name */
    public final int f10582f;

    /* renamed from: g  reason: collision with root package name */
    public final int f10583g;

    public p(int i2, o[] oVarArr, jb.c cVar, List list, int i10) {
        this.f10577a = i2;
        this.f10578b = oVarArr;
        this.f10579c = cVar;
        this.f10580d = list;
        this.f10581e = i10;
        int i11 = 0;
        for (o oVar : oVarArr) {
            i11 = Math.max(i11, oVar.f10570k);
        }
        this.f10582f = i11;
        int i12 = i11 + this.f10581e;
        this.f10583g = i12 >= 0 ? i12 : 0;
    }

    public final o[] a(int i2, int i10, int i11) {
        o[] oVarArr = this.f10578b;
        int length = oVarArr.length;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (i12 < length) {
            o oVar = oVarArr[i12];
            int i15 = i13 + 1;
            int i16 = (int) ((b) this.f10580d.get(i13)).f10497a;
            oVar.k(i2, ((int[]) this.f10579c.L)[i14], i10, i11, this.f10577a, i14);
            i14 += i16;
            i12++;
            i13 = i15;
        }
        return oVarArr;
    }
}
