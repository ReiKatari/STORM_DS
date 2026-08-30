package o3;

import i3.p0;
import java.util.ArrayList;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final String f10707a;

    /* renamed from: b  reason: collision with root package name */
    public final float f10708b;

    /* renamed from: c  reason: collision with root package name */
    public final float f10709c;

    /* renamed from: d  reason: collision with root package name */
    public final float f10710d;

    /* renamed from: e  reason: collision with root package name */
    public final float f10711e;

    /* renamed from: f  reason: collision with root package name */
    public final long f10712f;

    /* renamed from: g  reason: collision with root package name */
    public final int f10713g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f10714h;

    /* renamed from: i  reason: collision with root package name */
    public final ArrayList f10715i;

    /* renamed from: j  reason: collision with root package name */
    public final d f10716j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f10717k;

    public e(String str, float f8, float f10, float f11, float f12, long j2, int i2, boolean z10, int i10) {
        long j10;
        int i11;
        str = (i10 & 1) != 0 ? "" : str;
        if ((i10 & 32) != 0) {
            j10 = i3.s.f6687h;
        } else {
            j10 = j2;
        }
        if ((i10 & 64) != 0) {
            i11 = 5;
        } else {
            i11 = i2;
        }
        this.f10707a = str;
        this.f10708b = f8;
        this.f10709c = f10;
        this.f10710d = f11;
        this.f10711e = f12;
        this.f10712f = j10;
        this.f10713g = i11;
        this.f10714h = z10;
        ArrayList arrayList = new ArrayList();
        this.f10715i = arrayList;
        d dVar = new d(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, 1023);
        this.f10716j = dVar;
        arrayList.add(dVar);
    }

    public static void a(e eVar, ArrayList arrayList, p0 p0Var) {
        if (eVar.f10717k) {
            x3.a.c("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
        }
        ArrayList arrayList2 = eVar.f10715i;
        ((d) arrayList2.get(arrayList2.size() - 1)).f10706j.add(new k0("", arrayList, 0, p0Var, 1.0f, null, 1.0f, 1.0f, 0, 2, 1.0f, 0.0f, 1.0f, 0.0f));
    }

    public final f b() {
        if (this.f10717k) {
            x3.a.c("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
        }
        while (true) {
            ArrayList arrayList = this.f10715i;
            if (arrayList.size() > 1) {
                if (this.f10717k) {
                    x3.a.c("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                }
                d dVar = (d) arrayList.remove(arrayList.size() - 1);
                ((d) arrayList.get(arrayList.size() - 1)).f10706j.add(new g0(dVar.f10697a, dVar.f10698b, dVar.f10699c, dVar.f10700d, dVar.f10701e, dVar.f10702f, dVar.f10703g, dVar.f10704h, dVar.f10705i, dVar.f10706j));
            } else {
                d dVar2 = this.f10716j;
                f fVar = new f(this.f10707a, this.f10708b, this.f10709c, this.f10710d, this.f10711e, new g0(dVar2.f10697a, dVar2.f10698b, dVar2.f10699c, dVar2.f10700d, dVar2.f10701e, dVar2.f10702f, dVar2.f10703g, dVar2.f10704h, dVar2.f10705i, dVar2.f10706j), this.f10712f, this.f10713g, this.f10714h);
                this.f10717k = true;
                return fVar;
            }
        }
    }
}
