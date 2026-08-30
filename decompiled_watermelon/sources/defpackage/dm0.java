package defpackage;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import me.magnum.melonds.ui.cheats.CheatsActivity;
import me.magnum.melonds.ui.emulator.EmulatorActivity;
import me.magnum.melonds.ui.romlist.RomListActivity;
import me.magnum.melonds.ui.romlist.a;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: dm0  reason: default package */
/* loaded from: classes.dex */
public final class dm0 extends nk6 implements aj2 {
    public final /* synthetic */ int X;
    public /* synthetic */ boolean Y;
    public final /* synthetic */ Object Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dm0(j11 j11Var, k47 k47Var, boolean z) {
        super(2, j11Var);
        this.X = 4;
        this.Z = k47Var;
        this.Y = z;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        int i = this.X;
        o27 o27Var = o27.a;
        switch (i) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                ((dm0) t((j11) obj2, bool)).v(o27Var);
                return o27Var;
            case 1:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                ((dm0) t((j11) obj2, bool2)).v(o27Var);
                return o27Var;
            case 2:
                Boolean bool3 = (Boolean) obj;
                bool3.booleanValue();
                ((dm0) t((j11) obj2, bool3)).v(o27Var);
                return o27Var;
            case 3:
                Boolean bool4 = (Boolean) obj;
                bool4.booleanValue();
                ((dm0) t((j11) obj2, bool4)).v(o27Var);
                return o27Var;
            default:
                ((dm0) t((j11) obj2, (o31) obj)).v(o27Var);
                return o27Var;
        }
    }

    @Override // defpackage.m00
    public final j11 t(j11 j11Var, Object obj) {
        int i = this.X;
        Object obj2 = this.Z;
        switch (i) {
            case 0:
                dm0 dm0Var = new dm0((CheatsActivity) obj2, j11Var, 0);
                dm0Var.Y = ((Boolean) obj).booleanValue();
                return dm0Var;
            case 1:
                dm0 dm0Var2 = new dm0((EmulatorActivity) obj2, j11Var, 1);
                dm0Var2.Y = ((Boolean) obj).booleanValue();
                return dm0Var2;
            case 2:
                dm0 dm0Var3 = new dm0((RomListActivity) obj2, j11Var, 2);
                dm0Var3.Y = ((Boolean) obj).booleanValue();
                return dm0Var3;
            case 3:
                dm0 dm0Var4 = new dm0((Context) obj2, j11Var, 3);
                dm0Var4.Y = ((Boolean) obj).booleanValue();
                return dm0Var4;
            default:
                return new dm0(j11Var, (k47) obj2, this.Y);
        }
    }

    @Override // defpackage.m00
    public final Object v(Object obj) {
        switch (this.X) {
            case 0:
                CheatsActivity cheatsActivity = (CheatsActivity) this.Z;
                boolean z = this.Y;
                p31 p31Var = p31.COROUTINE_SUSPENDED;
                me2.a0(obj);
                if (!z) {
                    Toast.makeText(cheatsActivity, (int) R.string.failed_save_cheat_changes, 1).show();
                }
                cheatsActivity.finish();
                return o27.a;
            case 1:
                boolean z2 = this.Y;
                p31 p31Var2 = p31.COROUTINE_SUSPENDED;
                me2.a0(obj);
                EmulatorActivity emulatorActivity = (EmulatorActivity) this.Z;
                emulatorActivity.h1 = z2;
                emulatorActivity.Q0();
                k42 k42Var = emulatorActivity.J0;
                if (k42Var != null) {
                    k42Var.B = z2;
                    k42Var.b();
                }
                return o27.a;
            case 2:
                boolean z3 = this.Y;
                p31 p31Var3 = p31.COROUTINE_SUSPENDED;
                me2.a0(obj);
                RomListActivity romListActivity = (RomListActivity) this.Z;
                if (z3) {
                    int i = RomListActivity.J0;
                    ct3 w = romListActivity.w();
                    if (w != null) {
                        w.s0();
                    }
                    a aVar = (a) romListActivity.t().D("ROM_LIST");
                    if (aVar == null) {
                        a.EnumC0004a enumC0004a = a.EnumC0004a.ENABLE_ALL;
                        enumC0004a.getClass();
                        a aVar2 = new a();
                        aVar2.setArguments(dk7.k(new ti4("allow_rom_configuration", Boolean.TRUE), new ti4("rom_enable_criteria", enumC0004a.toString())));
                        mg2 t = romListActivity.t();
                        t.getClass();
                        androidx.fragment.app.a aVar3 = new androidx.fragment.app.a(t);
                        aVar3.j(R.id.layout_main, aVar2, "ROM_LIST");
                        aVar3.f();
                        aVar = aVar2;
                    }
                    aVar.d0 = new n95(6, romListActivity);
                } else {
                    int i2 = RomListActivity.J0;
                    ct3 w2 = romListActivity.w();
                    if (w2 != null) {
                        w2.O0();
                    }
                    if (((f74) romListActivity.t().D("NO_ROM_DIRECTORY")) == null) {
                        f74 f74Var = new f74();
                        mg2 t2 = romListActivity.t();
                        t2.getClass();
                        androidx.fragment.app.a aVar4 = new androidx.fragment.app.a(t2);
                        aVar4.j(R.id.layout_main, f74Var, "NO_ROM_DIRECTORY");
                        aVar4.f();
                    }
                }
                return o27.a;
            case 3:
                p31 p31Var4 = p31.COROUTINE_SUSPENDED;
                me2.a0(obj);
                ch4.a((Context) this.Z, RescheduleReceiver.class, this.Y);
                return o27.a;
            default:
                p31 p31Var5 = p31.COROUTINE_SUSPENDED;
                me2.a0(obj);
                if (((k47) this.Z).h.b()) {
                    if (ve2.D("CXCP")) {
                        Log.d("CXCP", "UseCaseCamera is closed before setActiveResumeMode, skipping setup.");
                    }
                } else {
                    jd0 a = ((k47) this.Z).a.a();
                    boolean z4 = this.Y;
                    ca0 ca0Var = a.X;
                    synchronized (ca0Var.q) {
                        ca0Var.r = z4;
                    }
                }
                return o27.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dm0(Context context, j11 j11Var, int i) {
        super(2, j11Var);
        this.X = i;
        this.Z = context;
    }
}
