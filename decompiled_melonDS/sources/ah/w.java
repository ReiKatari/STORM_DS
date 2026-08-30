package ah;

import java.util.Iterator;
import java.util.Map;
import me.magnum.melonds.ui.emulator.EmulatorActivity;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class w extends ec.j implements mc.p {
    public EmulatorActivity X;
    public Iterator Y;
    public int Z;

    /* renamed from: b0  reason: collision with root package name */
    public int f811b0;

    /* renamed from: c0  reason: collision with root package name */
    public final /* synthetic */ Map f812c0;

    /* renamed from: d0  reason: collision with root package name */
    public final /* synthetic */ EmulatorActivity f813d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(Map map, EmulatorActivity emulatorActivity, cc.c cVar) {
        super(2, cVar);
        this.f812c0 = map;
        this.f813d0 = emulatorActivity;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        return ((w) t((cc.c) obj2, (zc.u) obj)).v(yb.y.f14813a);
    }

    @Override // ec.a
    public final cc.c t(cc.c cVar, Object obj) {
        return new w(this.f812c0, this.f813d0, cVar);
    }

    @Override // ec.a
    public final Object v(Object obj) {
        int i2;
        EmulatorActivity emulatorActivity;
        Iterator it;
        yb.y yVar;
        Object a10;
        dc.a aVar = dc.a.COROUTINE_SUSPENDED;
        int i10 = this.f811b0;
        if (i10 != 0) {
            if (i10 == 1) {
                i2 = this.Z;
                it = this.Y;
                emulatorActivity = this.X;
                p7.j.I(obj);
            } else {
                a0.j.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            p7.j.I(obj);
            Iterator it2 = this.f812c0.keySet().iterator();
            i2 = 0;
            emulatorActivity = this.f813d0;
            it = it2;
        }
        do {
            boolean hasNext = it.hasNext();
            yVar = yb.y.f14813a;
            if (hasNext) {
                String str = (String) it.next();
                sd.h hVar = emulatorActivity.D0;
                if (hVar != null) {
                    this.X = emulatorActivity;
                    this.Y = it;
                    this.Z = i2;
                    this.f811b0 = 1;
                    cd.w0 w0Var = (cd.w0) hVar.f12873c.get(str);
                    if (w0Var != null && (a10 = w0Var.a(yVar, this)) == dc.a.COROUTINE_SUSPENDED) {
                        yVar = a10;
                        continue;
                    }
                } else {
                    nc.k.f("permissionHandler");
                    throw null;
                }
            } else {
                return yVar;
            }
        } while (yVar != aVar);
        return aVar;
    }
}
