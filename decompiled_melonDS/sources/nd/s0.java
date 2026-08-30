package nd;

import java.util.Map;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class s0 implements jd.a {

    /* renamed from: a  reason: collision with root package name */
    public final jd.a f10360a;

    /* renamed from: b  reason: collision with root package name */
    public final jd.a f10361b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f10362c;

    /* renamed from: d  reason: collision with root package name */
    public final ld.f f10363d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public s0(jd.a aVar, jd.a aVar2, int i2) {
        this(aVar, aVar2, (byte) 0);
        this.f10362c = i2;
        aVar.getClass();
        aVar2.getClass();
        switch (i2) {
            case DSiCameraSource.FrontCamera /* 1 */:
                this(aVar, aVar2, (byte) 0);
                ld.e[] eVarArr = new ld.e[0];
                if (!vc.h.j0("kotlin.Pair")) {
                    ld.a aVar3 = new ld.a("kotlin.Pair");
                    ld.a.a(aVar3, "first", aVar.e());
                    ld.a.a(aVar3, "second", aVar2.e());
                    this.f10363d = new ld.f("kotlin.Pair", ld.j.f9044o, aVar3.f9011c.size(), zb.k.Q(eVarArr), aVar3);
                    return;
                }
                a0.j.h("Blank serial names are prohibited");
                throw null;
            default:
                this.f10363d = aj.g.h("kotlin.collections.Map.Entry", ld.j.f9046q, new ld.e[0], new he.g(13, aVar, aVar2));
                return;
        }
    }

    @Override // jd.a
    public final Object a(md.c cVar) {
        Object r0Var;
        ld.e e6 = e();
        md.a a10 = cVar.a(e6);
        Object obj = a1.f10268c;
        Object obj2 = obj;
        Object obj3 = obj2;
        while (true) {
            int g10 = a10.g(e());
            if (g10 != -1) {
                if (g10 != 0) {
                    if (g10 == 1) {
                        obj3 = a10.o(e(), 1, this.f10361b, null);
                    } else {
                        throw new IllegalArgumentException(w.d.l(g10, "Invalid index: "));
                    }
                } else {
                    obj2 = a10.o(e(), 0, this.f10360a, null);
                }
            } else if (obj2 != obj) {
                if (obj3 != obj) {
                    switch (this.f10362c) {
                        case 0:
                            r0Var = new r0(obj2, obj3);
                            break;
                        default:
                            r0Var = new yb.j(obj2, obj3);
                            break;
                    }
                    a10.b(e6);
                    return r0Var;
                }
                throw new IllegalArgumentException("Element 'value' is missing");
            } else {
                throw new IllegalArgumentException("Element 'key' is missing");
            }
        }
    }

    @Override // jd.a
    public final void d(md.d dVar, Object obj) {
        Object key;
        Object value;
        md.b a10 = dVar.a(e());
        ld.e e6 = e();
        jd.a aVar = this.f10360a;
        switch (this.f10362c) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                key = entry.getKey();
                break;
            default:
                yb.j jVar = (yb.j) obj;
                jVar.getClass();
                key = jVar.A;
                break;
        }
        ij.a aVar2 = (ij.a) a10;
        aVar2.J(e6, 0, aVar, key);
        ld.e e10 = e();
        jd.a aVar3 = this.f10361b;
        switch (this.f10362c) {
            case 0:
                Map.Entry entry2 = (Map.Entry) obj;
                entry2.getClass();
                value = entry2.getValue();
                break;
            default:
                yb.j jVar2 = (yb.j) obj;
                jVar2.getClass();
                value = jVar2.B;
                break;
        }
        aVar2.J(e10, 1, aVar3, value);
        aVar2.b(e());
    }

    @Override // jd.a
    public final ld.e e() {
        switch (this.f10362c) {
            case 0:
                return this.f10363d;
            default:
                return this.f10363d;
        }
    }

    public s0(jd.a aVar, jd.a aVar2, byte b10) {
        this.f10360a = aVar;
        this.f10361b = aVar2;
    }
}
