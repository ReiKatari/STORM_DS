package defpackage;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import com.stormds.emulator.R;
import me.magnum.melonds.ui.cheats.CheatsActivity;
import me.magnum.melonds.ui.emulator.EmulatorActivity;
import me.magnum.melonds.ui.romlist.RomListActivity;
import me.magnum.melonds.ui.romlist.a;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: lo0  reason: default package */
/* loaded from: classes.dex */
public final class lo0 extends hw6 implements eo2 {
    public final /* synthetic */ int X;
    public /* synthetic */ boolean Y;
    public final /* synthetic */ Object Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lo0(r41 r41Var, ii7 ii7Var, boolean z) {
        super(2, r41Var);
        this.X = 4;
        this.Z = ii7Var;
        this.Y = z;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        int i = this.X;
        jg7 jg7Var = jg7.a;
        switch (i) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                ((lo0) q((r41) obj2, bool)).s(jg7Var);
                return jg7Var;
            case 1:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                ((lo0) q((r41) obj2, bool2)).s(jg7Var);
                return jg7Var;
            case 2:
                Boolean bool3 = (Boolean) obj;
                bool3.booleanValue();
                ((lo0) q((r41) obj2, bool3)).s(jg7Var);
                return jg7Var;
            case 3:
                Boolean bool4 = (Boolean) obj;
                bool4.booleanValue();
                ((lo0) q((r41) obj2, bool4)).s(jg7Var);
                return jg7Var;
            default:
                ((lo0) q((r41) obj2, (w61) obj)).s(jg7Var);
                return jg7Var;
        }
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        int i = this.X;
        Object obj2 = this.Z;
        switch (i) {
            case 0:
                lo0 lo0Var = new lo0((CheatsActivity) obj2, r41Var, 0);
                lo0Var.Y = ((Boolean) obj).booleanValue();
                return lo0Var;
            case 1:
                lo0 lo0Var2 = new lo0((EmulatorActivity) obj2, r41Var, 1);
                lo0Var2.Y = ((Boolean) obj).booleanValue();
                return lo0Var2;
            case 2:
                lo0 lo0Var3 = new lo0((RomListActivity) obj2, r41Var, 2);
                lo0Var3.Y = ((Boolean) obj).booleanValue();
                return lo0Var3;
            case 3:
                lo0 lo0Var4 = new lo0((Context) obj2, r41Var, 3);
                lo0Var4.Y = ((Boolean) obj).booleanValue();
                return lo0Var4;
            default:
                return new lo0(r41Var, (ii7) obj2, this.Y);
        }
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        switch (this.X) {
            case 0:
                CheatsActivity cheatsActivity = (CheatsActivity) this.Z;
                boolean z = this.Y;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                if (!z) {
                    Toast.makeText(cheatsActivity, (int) R.string.failed_save_cheat_changes, 1).show();
                }
                cheatsActivity.finish();
                return jg7.a;
            case 1:
                boolean z2 = this.Y;
                x61 x61Var2 = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                EmulatorActivity emulatorActivity = (EmulatorActivity) this.Z;
                emulatorActivity.k1 = z2;
                emulatorActivity.U0();
                c92 c92Var = emulatorActivity.K0;
                if (c92Var != null) {
                    c92Var.B = z2;
                    c92Var.b();
                }
                return jg7.a;
            case 2:
                boolean z3 = this.Y;
                x61 x61Var3 = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                RomListActivity romListActivity = (RomListActivity) this.Z;
                if (z3) {
                    int i = RomListActivity.K0;
                    ak7 w = romListActivity.w();
                    if (w != null) {
                        w.j0();
                    }
                    a aVar = (a) romListActivity.t().D("ROM_LIST");
                    if (aVar == null) {
                        a.EnumC0004a enumC0004a = a.EnumC0004a.ENABLE_ALL;
                        enumC0004a.getClass();
                        a aVar2 = new a();
                        aVar2.setArguments(jw2.l(new vr4("allow_rom_configuration", Boolean.TRUE), new vr4("rom_enable_criteria", enumC0004a.toString())));
                        ll2 t = romListActivity.t();
                        t.getClass();
                        androidx.fragment.app.a aVar3 = new androidx.fragment.app.a(t);
                        aVar3.e(R.id.layout_main, aVar2, "ROM_LIST");
                        aVar3.i(true, true);
                        aVar = aVar2;
                    }
                    aVar.e0 = new ro5(romListActivity, 4);
                } else {
                    int i2 = RomListActivity.K0;
                    ak7 w2 = romListActivity.w();
                    if (w2 != null) {
                        w2.j0();
                    }
                    if (((wf4) romListActivity.t().D("NO_ROM_DIRECTORY")) == null) {
                        wf4 wf4Var = new wf4();
                        ll2 t2 = romListActivity.t();
                        t2.getClass();
                        androidx.fragment.app.a aVar4 = new androidx.fragment.app.a(t2);
                        aVar4.e(R.id.layout_main, wf4Var, "NO_ROM_DIRECTORY");
                        aVar4.i(true, true);
                    }
                }
                return jg7.a;
            case 3:
                x61 x61Var4 = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                fq4.a((Context) this.Z, RescheduleReceiver.class, this.Y);
                return jg7.a;
            default:
                x61 x61Var5 = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                if (((ii7) this.Z).h.b()) {
                    if (kj2.F("CXCP")) {
                        Log.d("CXCP", "UseCaseCamera is closed before setActiveResumeMode, skipping setup.");
                    }
                } else {
                    sf0 a = ((ii7) this.Z).a.a();
                    boolean z4 = this.Y;
                    kc0 kc0Var = a.X;
                    synchronized (kc0Var.q) {
                        kc0Var.r = z4;
                    }
                }
                return jg7.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lo0(Context context, r41 r41Var, int i) {
        super(2, r41Var);
        this.X = i;
        this.Z = context;
    }
}
