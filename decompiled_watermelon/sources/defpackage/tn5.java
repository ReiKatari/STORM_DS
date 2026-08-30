package defpackage;

import me.magnum.melonds.ui.romlist.RomListActivity;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: tn5  reason: default package */
/* loaded from: classes.dex */
public final class tn5 extends nk6 implements aj2 {
    public final /* synthetic */ int X;
    public final /* synthetic */ RomListActivity Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tn5(RomListActivity romListActivity, j11 j11Var, int i) {
        super(2, j11Var);
        this.X = i;
        this.Y = romListActivity;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        int i = this.X;
        o27 o27Var = o27.a;
        switch (i) {
            case 0:
                ((tn5) t((j11) obj2, (o27) obj)).v(o27Var);
                return o27Var;
            case 1:
                ((tn5) t((j11) obj2, (o27) obj)).v(o27Var);
                return o27Var;
            default:
                ((tn5) t((j11) obj2, (tp5) obj)).v(o27Var);
                return o27Var;
        }
    }

    @Override // defpackage.m00
    public final j11 t(j11 j11Var, Object obj) {
        int i = this.X;
        RomListActivity romListActivity = this.Y;
        switch (i) {
            case 0:
                return new tn5(romListActivity, j11Var, 0);
            case 1:
                return new tn5(romListActivity, j11Var, 1);
            default:
                return new tn5(romListActivity, j11Var, 2);
        }
    }

    @Override // defpackage.m00
    public final Object v(Object obj) {
        int i = this.X;
        o27 o27Var = o27.a;
        RomListActivity romListActivity = this.Y;
        switch (i) {
            case 0:
                p31 p31Var = p31.COROUTINE_SUSPENDED;
                me2.a0(obj);
                int i2 = RomListActivity.J0;
                sb sbVar = new sb(romListActivity);
                sbVar.A(R.string.error_invalid_directory);
                sbVar.w(R.string.error_invalid_directory_description);
                sbVar.z(R.string.ok, null);
                ((pb) sbVar.L).m = true;
                sbVar.C();
                return o27Var;
            case 1:
                p31 p31Var2 = p31.COROUTINE_SUSPENDED;
                me2.a0(obj);
                int i3 = RomListActivity.J0;
                sb sbVar2 = new sb(romListActivity);
                sbVar2.A(R.string.rom_directory_permission_missing_title);
                sbVar2.w(R.string.rom_directory_permission_missing_message);
                sbVar2.z(R.string.settings, new pn5(romListActivity, 0));
                sbVar2.x(R.string.ok, null);
                ((pb) sbVar2.L).m = true;
                sbVar2.C();
                return o27Var;
            default:
                p31 p31Var3 = p31.COROUTINE_SUSPENDED;
                me2.a0(obj);
                romListActivity.invalidateOptionsMenu();
                return o27Var;
        }
    }
}
