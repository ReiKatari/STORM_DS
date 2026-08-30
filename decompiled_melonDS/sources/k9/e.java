package k9;

import a1.s;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class e extends s {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ int f8101h = 0;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ Object f8102i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(m7.g gVar) {
        super(25);
        this.f8102i = gVar;
    }

    @Override // a1.s
    public Object c(Object obj) {
        switch (this.f8101h) {
            case DSiCameraSource.FrontCamera /* 1 */:
                String str = (String) obj;
                str.getClass();
                return ((m7.g) this.f8102i).A.T(str);
            default:
                return super.c(obj);
        }
    }

    @Override // a1.s
    public final void d(Object obj, Object obj2, Object obj3) {
        switch (this.f8101h) {
            case 0:
                d dVar = (d) obj2;
                d dVar2 = (d) obj3;
                ((bk.a) ((jb.c) this.f8102i).B).s((a) obj, dVar.f8098a, dVar.f8099b, dVar.f8100c);
                return;
            default:
                t7.c cVar = (t7.c) obj2;
                t7.c cVar2 = (t7.c) obj3;
                ((String) obj).getClass();
                cVar.getClass();
                cVar.close();
                return;
        }
    }

    @Override // a1.s
    public int o(Object obj, Object obj2) {
        switch (this.f8101h) {
            case 0:
                a aVar = (a) obj;
                return ((d) obj2).f8100c;
            default:
                return super.o(obj, obj2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(int i2, jb.c cVar) {
        super(i2);
        this.f8102i = cVar;
    }
}
