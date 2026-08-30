package ai;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.PowerManager;
import androidx.work.impl.foreground.SystemForegroundService;
import d1.h1;
import java.util.UUID;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class z implements mc.a {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object R;
    public final /* synthetic */ Object X;

    public /* synthetic */ z(Object obj, Object obj2, Object obj3, Object obj4, int i2) {
        this.A = i2;
        this.B = obj;
        this.L = obj2;
        this.R = obj3;
        this.X = obj4;
    }

    @Override // mc.a
    public final Object b() {
        switch (this.A) {
            case 0:
                rg.d dVar = (rg.d) this.B;
                ze.a aVar = (ze.a) this.R;
                mc.l lVar = (mc.l) this.X;
                String str = ((zh.e) this.L).f15125f;
                if (str == null) {
                    str = aVar.f15053a;
                }
                rg.d.d(dVar, str, new w(lVar, 3));
                return yb.y.f14813a;
            case DSiCameraSource.FrontCamera /* 1 */:
                Number number = (Number) this.B;
                d1.c0 c0Var = (d1.c0) this.L;
                Number number2 = (Number) this.R;
                d1.b0 b0Var = (d1.b0) this.X;
                if (!number.equals(c0Var.A) || !number2.equals(c0Var.B)) {
                    c0Var.A = number;
                    c0Var.B = number2;
                    c0Var.X = new h1(b0Var, c0Var.L, number, number2, null);
                    c0Var.f3535c0.f3557b.setValue(Boolean.TRUE);
                    c0Var.Y = false;
                    c0Var.Z = true;
                }
                return yb.y.f14813a;
            default:
                y8.n nVar = (y8.n) this.B;
                p8.m mVar = (p8.m) this.R;
                Context context = (Context) this.X;
                String uuid = ((UUID) this.L).toString();
                x8.p d4 = nVar.f14805c.d(uuid);
                if (d4 != null && !d4.f14421b.isFinished()) {
                    q8.d dVar2 = nVar.f14804b;
                    synchronized (dVar2.f12351k) {
                        try {
                            p8.v e6 = p8.v.e();
                            String str2 = q8.d.f12340l;
                            e6.f(str2, "Moving WorkSpec (" + uuid + ") to the foreground");
                            q8.b0 b0Var2 = (q8.b0) dVar2.f12347g.remove(uuid);
                            if (b0Var2 != null) {
                                if (dVar2.f12341a == null) {
                                    PowerManager.WakeLock a10 = y8.k.a(dVar2.f12342b);
                                    dVar2.f12341a = a10;
                                    a10.acquire();
                                }
                                dVar2.f12346f.put(uuid, b0Var2);
                                Intent a11 = w8.a.a(dVar2.f12342b, p7.l.k(b0Var2.f12324a), mVar);
                                Context context2 = dVar2.f12342b;
                                if (Build.VERSION.SDK_INT >= 26) {
                                    a6.q.k(context2, a11);
                                } else {
                                    context2.startService(a11);
                                }
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    x8.i k10 = p7.l.k(d4);
                    String str3 = w8.a.f14168d0;
                    Intent intent = new Intent(context, SystemForegroundService.class);
                    intent.setAction("ACTION_NOTIFY");
                    intent.putExtra("KEY_NOTIFICATION_ID", mVar.f11497a);
                    intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", mVar.f11498b);
                    intent.putExtra("KEY_NOTIFICATION", mVar.f11499c);
                    intent.putExtra("KEY_WORKSPEC_ID", k10.f14391a);
                    intent.putExtra("KEY_GENERATION", k10.f14392b);
                    context.startService(intent);
                    return null;
                }
                a0.j.p("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                return null;
        }
    }
}
