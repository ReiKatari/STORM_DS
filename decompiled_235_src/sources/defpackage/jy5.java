package defpackage;

import com.stormds.emulator.R;
import me.magnum.melonds.ui.romlist.RomListActivity;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: jy5  reason: default package */
/* loaded from: classes.dex */
public final class jy5 extends hw6 implements eo2 {
    public final /* synthetic */ int X;
    public final /* synthetic */ RomListActivity Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jy5(RomListActivity romListActivity, r41 r41Var, int i) {
        super(2, r41Var);
        this.X = i;
        this.Y = romListActivity;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        int i = this.X;
        jg7 jg7Var = jg7.a;
        switch (i) {
            case 0:
                ((jy5) q((r41) obj2, (jg7) obj)).s(jg7Var);
                return jg7Var;
            case 1:
                ((jy5) q((r41) obj2, (jg7) obj)).s(jg7Var);
                return jg7Var;
            default:
                ((jy5) q((r41) obj2, (n06) obj)).s(jg7Var);
                return jg7Var;
        }
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        int i = this.X;
        RomListActivity romListActivity = this.Y;
        switch (i) {
            case 0:
                return new jy5(romListActivity, r41Var, 0);
            case 1:
                return new jy5(romListActivity, r41Var, 1);
            default:
                return new jy5(romListActivity, r41Var, 2);
        }
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        int i = this.X;
        jg7 jg7Var = jg7.a;
        RomListActivity romListActivity = this.Y;
        switch (i) {
            case 0:
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                int i2 = RomListActivity.K0;
                zb zbVar = new zb(romListActivity);
                zbVar.z(R.string.error_invalid_directory);
                zbVar.w(R.string.error_invalid_directory_description);
                zbVar.y(R.string.ok, null);
                ((wb) zbVar.L).m = true;
                zbVar.B();
                return jg7Var;
            case 1:
                x61 x61Var2 = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                int i3 = RomListActivity.K0;
                zb zbVar2 = new zb(romListActivity);
                zbVar2.z(R.string.rom_directory_permission_missing_title);
                zbVar2.w(R.string.rom_directory_permission_missing_message);
                zbVar2.y(R.string.settings, new ey5(romListActivity, 0));
                zbVar2.x(R.string.ok, null);
                ((wb) zbVar2.L).m = true;
                zbVar2.B();
                return jg7Var;
            default:
                x61 x61Var3 = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                romListActivity.invalidateOptionsMenu();
                return jg7Var;
        }
    }
}
