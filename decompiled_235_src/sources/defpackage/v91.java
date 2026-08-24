package defpackage;

import android.content.Context;
import android.widget.Toast;
import com.stormds.emulator.R;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: v91  reason: default package */
/* loaded from: classes.dex */
public final class v91 extends hw6 implements eo2 {
    public final /* synthetic */ int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ Context Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v91(Context context, r41 r41Var, int i) {
        super(2, r41Var);
        this.X = i;
        this.Z = context;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        int i = this.X;
        jg7 jg7Var = jg7.a;
        switch (i) {
            case 0:
                ((v91) q((r41) obj2, (t33) obj)).s(jg7Var);
                return jg7Var;
            default:
                ((v91) q((r41) obj2, (y33) obj)).s(jg7Var);
                return jg7Var;
        }
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        switch (this.X) {
            case 0:
                v91 v91Var = new v91(this.Z, r41Var, 0);
                v91Var.Y = obj;
                return v91Var;
            default:
                v91 v91Var2 = new v91(this.Z, r41Var, 1);
                v91Var2.Y = obj;
                return v91Var2;
        }
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        String str;
        String string;
        int i = this.X;
        jg7 jg7Var = jg7.a;
        Context context = this.Z;
        Object obj2 = this.Y;
        switch (i) {
            case 0:
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                switch (aa1.b[((t33) obj2).ordinal()]) {
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
                    case 6:
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
                        i.d();
                        return null;
                }
                Toast.makeText(context, str, 1).show();
                return jg7Var;
            default:
                y33 y33Var = (y33) obj2;
                x61 x61Var2 = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                if (y33Var instanceof x33) {
                    string = context.getString(R.string.dsiware_manager_import_file_success, ((x33) y33Var).a);
                    string.getClass();
                } else if (y33Var instanceof w33) {
                    string = context.getString(R.string.dsiware_manager_import_file_error);
                    string.getClass();
                } else if (y33Var instanceof v33) {
                    string = context.getString(R.string.dsiware_manager_export_file_success, ((v33) y33Var).a);
                    string.getClass();
                } else if (y33Var instanceof u33) {
                    string = context.getString(R.string.dsiware_manager_export_file_error);
                    string.getClass();
                } else {
                    i.d();
                    return null;
                }
                Toast.makeText(context, string, 0).show();
                return jg7Var;
        }
    }
}
