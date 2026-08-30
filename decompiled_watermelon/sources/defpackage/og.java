package defpackage;

import android.util.Log;
import java.util.concurrent.CancellationException;
import me.magnum.melonds.MelonEmulator;
import me.magnum.melonds.domain.model.ConsoleType;
import me.magnum.melonds.domain.model.EmulatorConfiguration;
import me.magnum.melonds.impl.emulator.EmulatorMessageQueue;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: og  reason: default package */
/* loaded from: classes.dex */
public final class og extends nk6 implements aj2 {
    public int X;
    public final /* synthetic */ xg Y;
    public final /* synthetic */ ConsoleType Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public og(xg xgVar, ConsoleType consoleType, j11 j11Var) {
        super(2, j11Var);
        this.Y = xgVar;
        this.Z = consoleType;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        return ((og) t((j11) obj2, (o31) obj)).v(o27.a);
    }

    @Override // defpackage.m00
    public final j11 t(j11 j11Var, Object obj) {
        return new og(this.Y, this.Z, j11Var);
    }

    @Override // defpackage.m00
    public final Object v(Object obj) {
        p31 p31Var = p31.COROUTINE_SUSPENDED;
        int i = this.X;
        MelonEmulator melonEmulator = MelonEmulator.a;
        xg xgVar = this.Y;
        try {
            if (i != 0) {
                if (i == 1) {
                    me2.a0(obj);
                } else {
                    i.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            } else {
                me2.a0(obj);
                ConsoleType consoleType = this.Z;
                this.X = 1;
                obj = xgVar.b(consoleType, this);
                if (obj == p31Var) {
                    return p31Var;
                }
            }
            EmulatorConfiguration emulatorConfiguration = (EmulatorConfiguration) obj;
            xgVar.i(emulatorConfiguration);
            EmulatorMessageQueue emulatorMessageQueue = xgVar.r;
            s51 s51Var = xgVar.g;
            MelonEmulator.a a = melonEmulator.a();
            if (a != MelonEmulator.a.SUCCESS) {
                s51Var.a();
                melonEmulator.stopEmulation();
                return new h82(a);
            }
            emulatorMessageQueue.c();
            if (!xgVar.g(emulatorConfiguration)) {
                s51Var.a();
                melonEmulator.stopEmulation();
                emulatorMessageQueue.d();
                return new h82(MelonEmulator.a.FIRMWARE_BAD);
            }
            melonEmulator.startEmulation(true);
            return i82.a;
        } catch (Throwable th) {
            if (!(th instanceof CancellationException)) {
                Log.e("AndroidEmulatorManager", "Failed to load firmware", th);
                xgVar.g.a();
                melonEmulator.stopEmulation();
                xgVar.r.d();
                return new h82(MelonEmulator.a.FIRMWARE_BAD);
            }
            throw th;
        }
    }
}
