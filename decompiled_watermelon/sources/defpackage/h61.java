package defpackage;

import android.content.Context;
import android.widget.Toast;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: h61  reason: default package */
/* loaded from: classes.dex */
public final class h61 extends nk6 implements aj2 {
    public final /* synthetic */ int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ Context Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h61(Context context, j11 j11Var, int i) {
        super(2, j11Var);
        this.X = i;
        this.Z = context;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        int i = this.X;
        o27 o27Var = o27.a;
        switch (i) {
            case 0:
                ((h61) t((j11) obj2, (px2) obj)).v(o27Var);
                return o27Var;
            default:
                ((h61) t((j11) obj2, (ux2) obj)).v(o27Var);
                return o27Var;
        }
    }

    @Override // defpackage.m00
    public final j11 t(j11 j11Var, Object obj) {
        switch (this.X) {
            case 0:
                h61 h61Var = new h61(this.Z, j11Var, 0);
                h61Var.Y = obj;
                return h61Var;
            default:
                h61 h61Var2 = new h61(this.Z, j11Var, 1);
                h61Var2.Y = obj;
                return h61Var2;
        }
    }

    @Override // defpackage.m00
    public final Object v(Object obj) {
        String str;
        String string;
        int i = this.X;
        o27 o27Var = o27.a;
        Context context = this.Z;
        Object obj2 = this.Y;
        switch (i) {
            case 0:
                p31 p31Var = p31.COROUTINE_SUSPENDED;
                me2.a0(obj);
                switch (m61.b[((px2) obj2).ordinal()]) {
                    case 1:
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
                    case 5:
                        str = context.getString(R.string.dsiware_manager_import_title_error_title_already_imported);
                        str.getClass();
                        break;
                    case ig7.b /* 6 */:
                        str = context.getString(R.string.dsiware_manager_import_title_error_title_limit_reached);
                        str.getClass();
                        break;
                    case 7:
                        str = context.getString(R.string.dsiware_manager_import_title_error_dsi_memory_full);
                        str.getClass();
                        break;
                    case 8:
                        str = context.getString(R.string.dsiware_manager_import_title_error_insatll_failed);
                        str.getClass();
                        break;
                    case 9:
                        str = context.getString(R.string.dsiware_manager_import_title_error_metadat_fetch_failed);
                        str.getClass();
                        break;
                    case 10:
                        str = context.getString(R.string.dsiware_manager_import_title_error_unknown);
                        str.getClass();
                        break;
                    default:
                        i.c();
                        return null;
                }
                Toast.makeText(context, str, 1).show();
                return o27Var;
            default:
                ux2 ux2Var = (ux2) obj2;
                p31 p31Var2 = p31.COROUTINE_SUSPENDED;
                me2.a0(obj);
                if (ux2Var instanceof tx2) {
                    string = context.getString(R.string.dsiware_manager_import_file_success, ((tx2) ux2Var).a);
                    string.getClass();
                } else if (ux2Var instanceof sx2) {
                    string = context.getString(R.string.dsiware_manager_import_file_error);
                    string.getClass();
                } else if (ux2Var instanceof rx2) {
                    string = context.getString(R.string.dsiware_manager_export_file_success, ((rx2) ux2Var).a);
                    string.getClass();
                } else if (ux2Var instanceof qx2) {
                    string = context.getString(R.string.dsiware_manager_export_file_error);
                    string.getClass();
                } else {
                    i.c();
                    return null;
                }
                Toast.makeText(context, string, 0).show();
                return o27Var;
        }
    }
}
