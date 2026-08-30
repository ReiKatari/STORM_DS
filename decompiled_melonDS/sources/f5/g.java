package f5;

import java.util.ArrayList;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class g implements d {

    /* renamed from: d  reason: collision with root package name */
    public final t f4866d;

    /* renamed from: f  reason: collision with root package name */
    public int f4868f;

    /* renamed from: g  reason: collision with root package name */
    public int f4869g;

    /* renamed from: a  reason: collision with root package name */
    public t f4863a = null;

    /* renamed from: b  reason: collision with root package name */
    public boolean f4864b = false;

    /* renamed from: c  reason: collision with root package name */
    public boolean f4865c = false;

    /* renamed from: e  reason: collision with root package name */
    public f f4867e = f.UNKNOWN;

    /* renamed from: h  reason: collision with root package name */
    public int f4870h = 1;

    /* renamed from: i  reason: collision with root package name */
    public h f4871i = null;

    /* renamed from: j  reason: collision with root package name */
    public boolean f4872j = false;

    /* renamed from: k  reason: collision with root package name */
    public final ArrayList f4873k = new ArrayList();

    /* renamed from: l  reason: collision with root package name */
    public final ArrayList f4874l = new ArrayList();

    public g(t tVar) {
        this.f4866d = tVar;
    }

    @Override // f5.d
    public final void a(d dVar) {
        ArrayList arrayList = this.f4874l;
        int size = arrayList.size();
        int i2 = 0;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            if (!((g) obj).f4872j) {
                return;
            }
        }
        this.f4865c = true;
        t tVar = this.f4863a;
        if (tVar != null) {
            tVar.a(this);
        }
        if (this.f4864b) {
            this.f4866d.a(this);
            return;
        }
        int size2 = arrayList.size();
        g gVar = null;
        int i11 = 0;
        while (i11 < size2) {
            Object obj2 = arrayList.get(i11);
            i11++;
            g gVar2 = (g) obj2;
            if (!(gVar2 instanceof h)) {
                i2++;
                gVar = gVar2;
            }
        }
        if (gVar != null && i2 == 1 && gVar.f4872j) {
            h hVar = this.f4871i;
            if (hVar != null) {
                if (hVar.f4872j) {
                    this.f4868f = this.f4870h * hVar.f4869g;
                } else {
                    return;
                }
            }
            d(gVar.f4869g + this.f4868f);
        }
        t tVar2 = this.f4863a;
        if (tVar2 != null) {
            tVar2.a(this);
        }
    }

    public final void b(t tVar) {
        this.f4873k.add(tVar);
        if (this.f4872j) {
            tVar.a(tVar);
        }
    }

    public final void c() {
        this.f4874l.clear();
        this.f4873k.clear();
        this.f4872j = false;
        this.f4869g = 0;
        this.f4865c = false;
        this.f4864b = false;
    }

    public void d(int i2) {
        if (!this.f4872j) {
            this.f4872j = true;
            this.f4869g = i2;
            ArrayList arrayList = this.f4873k;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                d dVar = (d) obj;
                dVar.a(dVar);
            }
        }
    }

    public final String toString() {
        Object obj;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f4866d.f4891b.f4307j0);
        sb2.append(":");
        sb2.append(this.f4867e);
        sb2.append("(");
        if (this.f4872j) {
            obj = Integer.valueOf(this.f4869g);
        } else {
            obj = "unresolved";
        }
        sb2.append(obj);
        sb2.append(") <t=");
        sb2.append(this.f4874l.size());
        sb2.append(":d=");
        sb2.append(this.f4873k.size());
        sb2.append(">");
        return sb2.toString();
    }
}
