package defpackage;

import android.content.Context;
import android.content.IntentFilter;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: b20  reason: default package */
/* loaded from: classes.dex */
public final class b20 extends vy0 {
    public final qq g;
    public final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b20(Context context, nh7 nh7Var, int i) {
        super(context, nh7Var);
        this.h = i;
        this.g = new qq(1, this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x003f, code lost:
        if (r8.equals("android.intent.action.DEVICE_STORAGE_OK") == false) goto L16;
     */
    @Override // defpackage.vy0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d() {
        /*
            r8 = this;
            int r0 = r8.h
            java.lang.String r1 = "status"
            java.lang.String r2 = "getInitialState - null intent received"
            java.lang.String r3 = "android.intent.action.BATTERY_CHANGED"
            r4 = -1
            r5 = 0
            r6 = 1
            r7 = 0
            switch(r0) {
                case 0: goto L8c;
                case 1: goto L4e;
                default: goto Lf;
            }
        Lf:
            java.lang.Object r0 = r8.c
            android.content.Context r0 = (android.content.Context) r0
            android.content.IntentFilter r8 = r8.k()
            android.content.Intent r8 = r0.registerReceiver(r5, r8)
            if (r8 == 0) goto L49
            java.lang.String r0 = r8.getAction()
            if (r0 != 0) goto L24
            goto L49
        L24:
            java.lang.String r8 = r8.getAction()
            if (r8 == 0) goto L48
            int r0 = r8.hashCode()
            r1 = -1181163412(0xffffffffb998e06c, float:-2.9158907E-4)
            if (r0 == r1) goto L42
            r1 = -730838620(0xffffffffd47049a4, float:-4.1281105E12)
            if (r0 == r1) goto L39
            goto L48
        L39:
            java.lang.String r0 = "android.intent.action.DEVICE_STORAGE_OK"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L49
            goto L48
        L42:
            java.lang.String r0 = "android.intent.action.DEVICE_STORAGE_LOW"
            boolean r8 = r8.equals(r0)
        L48:
            r6 = r7
        L49:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r6)
            return r8
        L4e:
            android.content.IntentFilter r0 = new android.content.IntentFilter
            r0.<init>(r3)
            java.lang.Object r8 = r8.c
            android.content.Context r8 = (android.content.Context) r8
            android.content.Intent r8 = r8.registerReceiver(r5, r0)
            if (r8 != 0) goto L69
            y70 r8 = defpackage.y70.f()
            java.lang.String r0 = defpackage.d20.a
            r8.d(r0, r2)
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
            goto L8b
        L69:
            int r0 = r8.getIntExtra(r1, r4)
            java.lang.String r1 = "level"
            int r1 = r8.getIntExtra(r1, r4)
            java.lang.String r2 = "scale"
            int r8 = r8.getIntExtra(r2, r4)
            float r1 = (float) r1
            float r8 = (float) r8
            float r1 = r1 / r8
            if (r0 == r6) goto L87
            r8 = 1041865114(0x3e19999a, float:0.15)
            int r8 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r8 <= 0) goto L86
            goto L87
        L86:
            r6 = r7
        L87:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r6)
        L8b:
            return r8
        L8c:
            android.content.IntentFilter r0 = new android.content.IntentFilter
            r0.<init>(r3)
            java.lang.Object r8 = r8.c
            android.content.Context r8 = (android.content.Context) r8
            android.content.Intent r8 = r8.registerReceiver(r5, r0)
            if (r8 != 0) goto La7
            y70 r8 = defpackage.y70.f()
            java.lang.String r0 = defpackage.c20.a
            r8.d(r0, r2)
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
            goto Lb7
        La7:
            int r8 = r8.getIntExtra(r1, r4)
            r0 = 2
            if (r8 == r0) goto Lb3
            r0 = 5
            if (r8 != r0) goto Lb2
            goto Lb3
        Lb2:
            r6 = r7
        Lb3:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r6)
        Lb7:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b20.d():java.lang.Object");
    }

    @Override // defpackage.vy0
    public final void g() {
        y70.f().b(a60.a, getClass().getSimpleName().concat(": registering receiver"));
        ((Context) this.c).registerReceiver(this.g, k());
    }

    @Override // defpackage.vy0
    public final void h() {
        y70.f().b(a60.a, getClass().getSimpleName().concat(": unregistering receiver"));
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
