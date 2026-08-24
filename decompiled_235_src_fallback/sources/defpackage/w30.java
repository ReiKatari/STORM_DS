package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: w30  reason: default package */
/* loaded from: classes.dex */
public final class w30 extends defpackage.a21 {
    public final defpackage.cr g;
    public final /* synthetic */ int h;

    public w30(android.content.Context r1, defpackage.ow7 r2, int r3) {
            r0 = this;
            r0.h = r3
            r0.<init>(r1, r2)
            cr r1 = new cr
            r2 = 1
            r1.<init>(r0, r2)
            r0.g = r1
            return
    }

    @Override // defpackage.a21
    public final java.lang.Object d() {
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
            ga0 r8 = defpackage.ga0.f()
            java.lang.String r0 = defpackage.y30.a
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
            ga0 r8 = defpackage.ga0.f()
            java.lang.String r0 = defpackage.x30.a
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
    }

    @Override // defpackage.a21
    public final void g() {
            r4 = this;
            ga0 r0 = defpackage.ga0.f()
            java.lang.String r1 = defpackage.e80.a
            java.lang.Class r2 = r4.getClass()
            java.lang.String r2 = r2.getSimpleName()
            java.lang.String r3 = ": registering receiver"
            java.lang.String r2 = r2.concat(r3)
            r0.b(r1, r2)
            java.lang.Object r0 = r4.c
            android.content.Context r0 = (android.content.Context) r0
            cr r1 = r4.g
            android.content.IntentFilter r4 = r4.k()
            r0.registerReceiver(r1, r4)
            return
    }

    @Override // defpackage.a21
    public final void h() {
            r4 = this;
            ga0 r0 = defpackage.ga0.f()
            java.lang.String r1 = defpackage.e80.a
            java.lang.Class r2 = r4.getClass()
            java.lang.String r2 = r2.getSimpleName()
            java.lang.String r3 = ": unregistering receiver"
            java.lang.String r2 = r2.concat(r3)
            r0.b(r1, r2)
            java.lang.Object r0 = r4.c
            android.content.Context r0 = (android.content.Context) r0
            cr r4 = r4.g
            r0.unregisterReceiver(r4)
            return
    }

    public final android.content.IntentFilter k() {
            r1 = this;
            int r1 = r1.h
            switch(r1) {
                case 0: goto L25;
                case 1: goto L15;
                default: goto L5;
            }
        L5:
            android.content.IntentFilter r1 = new android.content.IntentFilter
            r1.<init>()
            java.lang.String r0 = "android.intent.action.DEVICE_STORAGE_OK"
            r1.addAction(r0)
            java.lang.String r0 = "android.intent.action.DEVICE_STORAGE_LOW"
            r1.addAction(r0)
            return r1
        L15:
            android.content.IntentFilter r1 = new android.content.IntentFilter
            r1.<init>()
            java.lang.String r0 = "android.intent.action.BATTERY_OKAY"
            r1.addAction(r0)
            java.lang.String r0 = "android.intent.action.BATTERY_LOW"
            r1.addAction(r0)
            return r1
        L25:
            android.content.IntentFilter r1 = new android.content.IntentFilter
            r1.<init>()
            java.lang.String r0 = "android.os.action.CHARGING"
            r1.addAction(r0)
            java.lang.String r0 = "android.os.action.DISCHARGING"
            r1.addAction(r0)
            return r1
    }
}
