package mh;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;
import me.magnum.melonds.R;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class l extends ec.j implements mc.p {
    public final /* synthetic */ int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ Context Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(Context context, cc.c cVar, int i2) {
        super(2, cVar);
        this.X = i2;
        this.Z = context;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        switch (this.X) {
            case 0:
                cc.c cVar = (cc.c) obj2;
                yb.y yVar = yb.y.f14813a;
                ((l) t(cVar, (String) obj)).v(yVar);
                return yVar;
            case DSiCameraSource.FrontCamera /* 1 */:
                cc.c cVar2 = (cc.c) obj2;
                yb.y yVar2 = yb.y.f14813a;
                ((l) t(cVar2, (re.b) obj)).v(yVar2);
                return yVar2;
            default:
                cc.c cVar3 = (cc.c) obj2;
                yb.y yVar3 = yb.y.f14813a;
                ((l) t(cVar3, (yg.o) obj)).v(yVar3);
                return yVar3;
        }
    }

    @Override // ec.a
    public final cc.c t(cc.c cVar, Object obj) {
        switch (this.X) {
            case 0:
                l lVar = new l(this.Z, cVar, 0);
                lVar.Y = obj;
                return lVar;
            case DSiCameraSource.FrontCamera /* 1 */:
                l lVar2 = new l(this.Z, cVar, 1);
                lVar2.Y = obj;
                return lVar2;
            default:
                l lVar3 = new l(this.Z, cVar, 2);
                lVar3.Y = obj;
                return lVar3;
        }
    }

    @Override // ec.a
    public final Object v(Object obj) {
        String str;
        String string;
        int i2 = this.X;
        yb.y yVar = yb.y.f14813a;
        Context context = this.Z;
        switch (i2) {
            case 0:
                dc.a aVar = dc.a.COROUTINE_SUSPENDED;
                p7.j.I(obj);
                context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse((String) this.Y)));
                return yVar;
            case DSiCameraSource.FrontCamera /* 1 */:
                dc.a aVar2 = dc.a.COROUTINE_SUSPENDED;
                p7.j.I(obj);
                switch (zg.l.f15098b[((re.b) this.Y).ordinal()]) {
                    case DSiCameraSource.FrontCamera /* 1 */:
                        str = "";
                        break;
                    case 2:
                        str = context.getString(R.string.dsiware_manager_import_title_error_open_nand_failed);
                        str.getClass();
                        break;
                    case 3:
                        str = context.getString(R.string.dsiware_manager_import_title_error_open_file_failed);
                        str.getClass();
                        break;
                    case 4:
                        str = context.getString(R.string.dsiware_manager_import_title_error_not_dsiware_title);
                        str.getClass();
                        break;
                    case l1.c.f8511g /* 5 */:
                        str = context.getString(R.string.dsiware_manager_import_title_error_title_already_imported);
                        str.getClass();
                        break;
                    case l1.c.f8509e /* 6 */:
                        str = context.getString(R.string.dsiware_manager_import_title_error_insatll_failed);
                        str.getClass();
                        break;
                    case 7:
                        str = context.getString(R.string.dsiware_manager_import_title_error_metadat_fetch_failed);
                        str.getClass();
                        break;
                    case 8:
                        str = context.getString(R.string.dsiware_manager_import_title_error_unknown);
                        str.getClass();
                        break;
                    default:
                        m9.o.o();
                        return null;
                }
                Toast.makeText(context, str, 1).show();
                return yVar;
            default:
                yg.o oVar = (yg.o) this.Y;
                dc.a aVar3 = dc.a.COROUTINE_SUSPENDED;
                p7.j.I(obj);
                if (oVar instanceof yg.n) {
                    string = context.getString(R.string.dsiware_manager_import_file_success, ((yg.n) oVar).f14829a);
                    string.getClass();
                } else if (oVar instanceof yg.m) {
                    string = context.getString(R.string.dsiware_manager_import_file_error);
                    string.getClass();
                } else if (oVar instanceof yg.l) {
                    string = context.getString(R.string.dsiware_manager_export_file_success, ((yg.l) oVar).f14827a);
                    string.getClass();
                } else if (oVar instanceof yg.k) {
                    string = context.getString(R.string.dsiware_manager_export_file_error);
                    string.getClass();
                } else {
                    m9.o.o();
                    return null;
                }
                Toast.makeText(context, string, 0).show();
                return yVar;
        }
    }
}
