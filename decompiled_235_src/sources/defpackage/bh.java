package defpackage;

import android.util.Log;
import java.util.concurrent.CancellationException;
import me.magnum.melonds.MelonEmulator;
import me.magnum.melonds.domain.model.ConsoleType;
import me.magnum.melonds.domain.model.EmulatorConfiguration;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bh  reason: default package */
/* loaded from: classes.dex */
public final class bh extends hw6 implements eo2 {
    public int X;
    public final /* synthetic */ jh Y;
    public final /* synthetic */ ConsoleType Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bh(jh jhVar, ConsoleType consoleType, r41 r41Var) {
        super(2, r41Var);
        this.Y = jhVar;
        this.Z = consoleType;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        return ((bh) q((r41) obj2, (w61) obj)).s(jg7.a);
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        return new bh(this.Y, this.Z, r41Var);
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        x61 x61Var = x61.COROUTINE_SUSPENDED;
        int i = this.X;
        MelonEmulator melonEmulator = MelonEmulator.a;
        jh jhVar = this.Y;
        try {
            if (i != 0) {
                if (i == 1) {
                    oi2.Y(obj);
                } else {
                    i.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            } else {
                oi2.Y(obj);
                ConsoleType consoleType = this.Z;
                this.X = 1;
                obj = jhVar.e(consoleType, this);
                if (obj == x61Var) {
                    return x61Var;
                }
            }
            jh.b(jhVar, (EmulatorConfiguration) obj);
            MelonEmulator.a a = melonEmulator.a();
            if (a != MelonEmulator.a.SUCCESS) {
                jhVar.g.a();
                melonEmulator.stopEmulation();
                return new zc2(a);
            }
            jhVar.r.c();
            melonEmulator.startEmulation(true);
            return ad2.a;
        } catch (Throwable th) {
            if (!(th instanceof CancellationException)) {
                Log.e("AndroidEmulatorManager", "Failed to load firmware", th);
                jhVar.g.a();
                melonEmulator.stopEmulation();
                jhVar.r.d();
                return new zc2(MelonEmulator.a.FIRMWARE_BAD);
            }
            throw th;
        }
    }
}
