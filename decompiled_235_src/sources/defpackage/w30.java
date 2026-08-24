package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: w30  reason: default package */
/* loaded from: classes.dex */
public final class w30 extends a21 {
    public final cr g;
    public final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w30(Context context, ow7 ow7Var, int i) {
        super(context, ow7Var);
        this.h = i;
        this.g = new cr(this, 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x003f, code lost:
        if (r8.equals("android.intent.action.DEVICE_STORAGE_OK") == false) goto L16;
     */
    @Override // defpackage.a21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d() {
        boolean z = true;
        switch (this.h) {
            case 0:
                Intent registerReceiver = ((Context) this.c).registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                if (registerReceiver == null) {
                    ga0.f().d(x30.a, "getInitialState - null intent received");
                    return Boolean.FALSE;
                }
                int intExtra = registerReceiver.getIntExtra("status", -1);
                if (intExtra != 2 && intExtra != 5) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 1:
                Intent registerReceiver2 = ((Context) this.c).registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                if (registerReceiver2 == null) {
                    ga0.f().d(y30.a, "getInitialState - null intent received");
                    return Boolean.FALSE;
                }
                float intExtra2 = registerReceiver2.getIntExtra("level", -1) / registerReceiver2.getIntExtra("scale", -1);
                if (registerReceiver2.getIntExtra("status", -1) != 1 && intExtra2 <= 0.15f) {
                    z = false;
                }
                return Boolean.valueOf(z);
            default:
                Intent registerReceiver3 = ((Context) this.c).registerReceiver(null, k());
                if (registerReceiver3 != null && registerReceiver3.getAction() != null) {
                    String action = registerReceiver3.getAction();
                    if (action != null) {
                        int hashCode = action.hashCode();
                        if (hashCode != -1181163412) {
                            if (hashCode == -730838620) {
                                break;
                            }
                        } else {
                            action.equals("android.intent.action.DEVICE_STORAGE_LOW");
                        }
                    }
                    z = false;
                }
                return Boolean.valueOf(z);
        }
    }

    @Override // defpackage.a21
    public final void g() {
        ga0.f().b(e80.a, getClass().getSimpleName().concat(": registering receiver"));
        ((Context) this.c).registerReceiver(this.g, k());
    }

    @Override // defpackage.a21
    public final void h() {
        ga0.f().b(e80.a, getClass().getSimpleName().concat(": unregistering receiver"));
        ((Context) this.c).unregisterReceiver(this.g);
    }

    public final IntentFilter k() {
        switch (this.h) {
            case 0:
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.CHARGING");
                intentFilter.addAction("android.os.action.DISCHARGING");
                return intentFilter;
            case 1:
                IntentFilter intentFilter2 = new IntentFilter();
                intentFilter2.addAction("android.intent.action.BATTERY_OKAY");
                intentFilter2.addAction("android.intent.action.BATTERY_LOW");
                return intentFilter2;
            default:
                IntentFilter intentFilter3 = new IntentFilter();
                intentFilter3.addAction("android.intent.action.DEVICE_STORAGE_OK");
                intentFilter3.addAction("android.intent.action.DEVICE_STORAGE_LOW");
                return intentFilter3;
        }
    }
}
