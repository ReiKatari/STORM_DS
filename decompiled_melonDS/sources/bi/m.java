package bi;

import android.content.Context;
import android.widget.Toast;
import androidx.fragment.app.h1;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import me.magnum.melonds.R;
import me.magnum.melonds.common.camera.DSiCameraSource;
import me.magnum.melonds.ui.cheats.CheatsActivity;
import me.magnum.melonds.ui.romlist.RomListActivity;
import me.magnum.melonds.ui.romlist.a;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class m extends ec.j implements mc.p {
    public final /* synthetic */ int X;
    public /* synthetic */ boolean Y;
    public final /* synthetic */ Context Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(Context context, cc.c cVar, int i2) {
        super(2, cVar);
        this.X = i2;
        this.Z = context;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        int i2 = this.X;
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        cc.c cVar = (cc.c) obj2;
        switch (i2) {
            case 0:
                yb.y yVar = yb.y.f14813a;
                ((m) t(cVar, bool)).v(yVar);
                return yVar;
            case DSiCameraSource.FrontCamera /* 1 */:
                yb.y yVar2 = yb.y.f14813a;
                ((m) t(cVar, bool)).v(yVar2);
                return yVar2;
            default:
                yb.y yVar3 = yb.y.f14813a;
                ((m) t(cVar, bool)).v(yVar3);
                return yVar3;
        }
    }

    @Override // ec.a
    public final cc.c t(cc.c cVar, Object obj) {
        switch (this.X) {
            case 0:
                m mVar = new m((RomListActivity) this.Z, cVar, 0);
                mVar.Y = ((Boolean) obj).booleanValue();
                return mVar;
            case DSiCameraSource.FrontCamera /* 1 */:
                m mVar2 = new m((CheatsActivity) this.Z, cVar, 1);
                mVar2.Y = ((Boolean) obj).booleanValue();
                return mVar2;
            default:
                m mVar3 = new m(this.Z, cVar, 2);
                mVar3.Y = ((Boolean) obj).booleanValue();
                return mVar3;
        }
    }

    @Override // ec.a
    public final Object v(Object obj) {
        int i2 = this.X;
        yb.y yVar = yb.y.f14813a;
        Context context = this.Z;
        switch (i2) {
            case 0:
                boolean z10 = this.Y;
                dc.a aVar = dc.a.COROUTINE_SUSPENDED;
                p7.j.I(obj);
                RomListActivity romListActivity = (RomListActivity) context;
                if (z10) {
                    int i10 = RomListActivity.D0;
                    me.magnum.melonds.ui.romlist.a aVar2 = (me.magnum.melonds.ui.romlist.a) romListActivity.t().D("ROM_LIST");
                    if (aVar2 == null) {
                        a.EnumC0005a enumC0005a = a.EnumC0005a.ENABLE_ALL;
                        enumC0005a.getClass();
                        me.magnum.melonds.ui.romlist.a aVar3 = new me.magnum.melonds.ui.romlist.a();
                        aVar3.setArguments(zb.k.b(new yb.j("allow_rom_configuration", Boolean.TRUE), new yb.j("rom_enable_criteria", enumC0005a.toString())));
                        h1 t5 = romListActivity.t();
                        t5.getClass();
                        androidx.fragment.app.a aVar4 = new androidx.fragment.app.a(t5);
                        aVar4.i(R.id.layout_main, aVar3, "ROM_LIST");
                        aVar4.e();
                        aVar2 = aVar3;
                    }
                    aVar2.f9575c0 = new a2.c(7, romListActivity);
                } else {
                    int i11 = RomListActivity.D0;
                    if (((e) romListActivity.t().D("NO_ROM_DIRECTORY")) == null) {
                        e eVar = new e();
                        h1 t10 = romListActivity.t();
                        t10.getClass();
                        androidx.fragment.app.a aVar5 = new androidx.fragment.app.a(t10);
                        aVar5.i(R.id.layout_main, eVar, "NO_ROM_DIRECTORY");
                        aVar5.e();
                    }
                }
                return yVar;
            case DSiCameraSource.FrontCamera /* 1 */:
                CheatsActivity cheatsActivity = (CheatsActivity) context;
                boolean z11 = this.Y;
                dc.a aVar6 = dc.a.COROUTINE_SUSPENDED;
                p7.j.I(obj);
                if (!z11) {
                    Toast.makeText(cheatsActivity, (int) R.string.failed_save_cheat_changes, 1).show();
                }
                cheatsActivity.finish();
                return yVar;
            default:
                dc.a aVar7 = dc.a.COROUTINE_SUSPENDED;
                p7.j.I(obj);
                y8.h.a(context, RescheduleReceiver.class, this.Y);
                return yVar;
        }
    }
}
