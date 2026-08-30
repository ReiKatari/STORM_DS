package h9;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import ec.j;
import java.util.List;
import m9.n;
import m9.o;
import mc.p;
import p7.l;
import yb.y;
import zb.k;
import zc.u;
import zc.x;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class f extends j implements p {
    public List X;
    public n Y;
    public int Z;

    /* renamed from: b0  reason: collision with root package name */
    public int f6362b0;

    /* renamed from: c0  reason: collision with root package name */
    public int f6363c0;

    /* renamed from: d0  reason: collision with root package name */
    public /* synthetic */ Object f6364d0;

    /* renamed from: e0  reason: collision with root package name */
    public final /* synthetic */ g f6365e0;

    /* renamed from: f0  reason: collision with root package name */
    public final /* synthetic */ a f6366f0;

    /* renamed from: g0  reason: collision with root package name */
    public final /* synthetic */ n f6367g0;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ List f6368h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ b9.c f6369i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ m9.j f6370j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, a aVar, n nVar, List list, b9.c cVar, m9.j jVar, cc.c cVar2) {
        super(2, cVar2);
        this.f6365e0 = gVar;
        this.f6366f0 = aVar;
        this.f6367g0 = nVar;
        this.f6368h0 = list;
        this.f6369i0 = cVar;
        this.f6370j0 = jVar;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        return ((f) t((cc.c) obj2, (u) obj)).v(y.f14813a);
    }

    @Override // ec.a
    public final cc.c t(cc.c cVar, Object obj) {
        f fVar = new f(this.f6365e0, this.f6366f0, this.f6367g0, this.f6368h0, this.f6369i0, this.f6370j0, cVar);
        fVar.f6364d0 = obj;
        return fVar;
    }

    @Override // ec.a
    public final Object v(Object obj) {
        u uVar;
        n nVar;
        Bitmap g10;
        List list;
        int size;
        int i2;
        dc.a aVar = dc.a.COROUTINE_SUSPENDED;
        int i10 = this.f6363c0;
        b9.c cVar = this.f6369i0;
        a aVar2 = this.f6366f0;
        if (i10 != 0) {
            if (i10 == 1) {
                size = this.f6362b0;
                int i11 = this.Z;
                nVar = this.Y;
                list = this.X;
                uVar = (u) this.f6364d0;
                p7.j.I(obj);
                g10 = (Bitmap) obj;
                x.j(uVar.v());
                i2 = i11 + 1;
            } else {
                a0.j.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            p7.j.I(obj);
            uVar = (u) this.f6364d0;
            Drawable drawable = aVar2.f6337a;
            boolean z10 = drawable instanceof BitmapDrawable;
            nVar = this.f6367g0;
            if (z10) {
                Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
                Bitmap.Config config = bitmap.getConfig();
                if (config == null) {
                    config = Bitmap.Config.ARGB_8888;
                }
                if (k.d(q9.g.f12393a, config)) {
                    g10 = bitmap;
                    cVar.getClass();
                    list = this.f6368h0;
                    size = list.size();
                    i2 = 0;
                }
            }
            g10 = l.g(drawable, nVar.f9430b, nVar.f9432d, nVar.f9433e, nVar.f9434f);
            cVar.getClass();
            list = this.f6368h0;
            size = list.size();
            i2 = 0;
        }
        if (i2 >= size) {
            cVar.getClass();
            return new a(new BitmapDrawable(this.f6370j0.f9403a.getResources(), g10), aVar2.f6338b, aVar2.f6339c, aVar2.f6340d);
        } else if (list.get(i2) != null) {
            o.b();
            return null;
        } else {
            n9.g gVar = nVar.f9432d;
            this.f6364d0 = uVar;
            this.X = list;
            this.Y = nVar;
            this.Z = i2;
            this.f6362b0 = size;
            this.f6363c0 = 1;
            throw null;
        }
    }
}
