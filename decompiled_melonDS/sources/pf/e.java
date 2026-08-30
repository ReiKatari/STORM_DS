package pf;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import me.magnum.melonds.MelonEmulator;
import me.magnum.melonds.domain.model.ConsoleType;
import me.magnum.melonds.domain.model.EmulatorConfiguration;
import me.magnum.melonds.impl.emulator.EmulatorMessageQueue;
import yb.y;
import zc.u;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class e extends ec.j implements mc.p {
    public j X;
    public int Y;
    public final /* synthetic */ j Z;

    /* renamed from: b0  reason: collision with root package name */
    public final /* synthetic */ ConsoleType f11623b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(j jVar, ConsoleType consoleType, cc.c cVar) {
        super(2, cVar);
        this.Z = jVar;
        this.f11623b0 = consoleType;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        return ((e) t((cc.c) obj2, (u) obj)).v(y.f14813a);
    }

    @Override // ec.a
    public final cc.c t(cc.c cVar, Object obj) {
        return new e(this.Z, this.f11623b0, cVar);
    }

    @Override // ec.a
    public final Object v(Object obj) {
        j jVar;
        dc.a aVar = dc.a.COROUTINE_SUSPENDED;
        int i2 = this.Y;
        j jVar2 = this.Z;
        if (i2 != 0) {
            if (i2 == 1) {
                jVar = this.X;
                p7.j.I(obj);
            } else {
                a0.j.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            p7.j.I(obj);
            this.X = jVar2;
            this.Y = 1;
            obj = jVar2.a(this.f11623b0, this);
            if (obj == aVar) {
                return aVar;
            }
            jVar = jVar2;
        }
        EmulatorConfiguration emulatorConfiguration = (EmulatorConfiguration) obj;
        lf.c cVar = jVar.f11634g;
        ae.a aVar2 = jVar.f11631d;
        ByteBuffer byteBuffer = aVar2.f706a;
        if (byteBuffer == null) {
            byteBuffer = ByteBuffer.allocateDirect(393216).order(ByteOrder.nativeOrder());
            aVar2.f706a = byteBuffer;
            byteBuffer.getClass();
        }
        MelonEmulator melonEmulator = MelonEmulator.f9466a;
        melonEmulator.setupEmulator(emulatorConfiguration, cVar, byteBuffer);
        MelonEmulator.a a10 = melonEmulator.a();
        if (a10 != MelonEmulator.a.SUCCESS) {
            jVar2.f11634g.a();
            melonEmulator.stopEmulation();
            return new se.j(a10);
        }
        EmulatorMessageQueue emulatorMessageQueue = jVar2.f11638k;
        emulatorMessageQueue.f9482c.post(new l(emulatorMessageQueue, 1));
        melonEmulator.startEmulation();
        return se.k.f12882a;
    }
}
