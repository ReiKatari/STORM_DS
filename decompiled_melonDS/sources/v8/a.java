package v8;

import android.content.Context;
import android.content.IntentFilter;
import com.squareup.picasso.l;
import me.magnum.melonds.common.camera.DSiCameraSource;
import p8.v;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a extends e {

    /* renamed from: g  reason: collision with root package name */
    public final l f13757g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ int f13758h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, z8.a aVar, int i2) {
        super(context, aVar);
        this.f13758h = i2;
        this.f13757g = new l(3, this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0038, code lost:
        if (r0.equals("android.intent.action.DEVICE_STORAGE_OK") == false) goto L16;
     */
    @Override // v8.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d() {
        /*
            r5 = this;
            int r0 = r5.f13758h
            switch(r0) {
                case 0: goto L8e;
                case 1: goto L47;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r5.f13764c
            android.content.Context r0 = (android.content.Context) r0
            r1 = 0
            android.content.IntentFilter r2 = r5.k()
            android.content.Intent r0 = r0.registerReceiver(r1, r2)
            r1 = 1
            if (r0 == 0) goto L42
            java.lang.String r2 = r0.getAction()
            if (r2 != 0) goto L1c
            goto L42
        L1c:
            java.lang.String r0 = r0.getAction()
            r2 = 0
            if (r0 == 0) goto L41
            int r3 = r0.hashCode()
            r4 = -1181163412(0xffffffffb998e06c, float:-2.9158907E-4)
            if (r3 == r4) goto L3b
            r4 = -730838620(0xffffffffd47049a4, float:-4.1281105E12)
            if (r3 == r4) goto L32
            goto L41
        L32:
            java.lang.String r3 = "android.intent.action.DEVICE_STORAGE_OK"
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L42
            goto L41
        L3b:
            java.lang.String r1 = "android.intent.action.DEVICE_STORAGE_LOW"
            boolean r0 = r0.equals(r1)
        L41:
            r1 = r2
        L42:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            return r0
        L47:
            android.content.IntentFilter r0 = new android.content.IntentFilter
            java.lang.String r1 = "android.intent.action.BATTERY_CHANGED"
            r0.<init>(r1)
            java.lang.Object r1 = r5.f13764c
            android.content.Context r1 = (android.content.Context) r1
            r2 = 0
            android.content.Intent r0 = r1.registerReceiver(r2, r0)
            if (r0 != 0) goto L67
            p8.v r0 = p8.v.e()
            java.lang.String r1 = v8.c.f13760a
            java.lang.String r2 = "getInitialState - null intent received"
            r0.c(r1, r2)
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            goto L8d
        L67:
            java.lang.String r1 = "status"
            r2 = -1
            int r1 = r0.getIntExtra(r1, r2)
            java.lang.String r3 = "level"
            int r3 = r0.getIntExtra(r3, r2)
            java.lang.String r4 = "scale"
            int r0 = r0.getIntExtra(r4, r2)
            float r2 = (float) r3
            float r0 = (float) r0
            float r2 = r2 / r0
            r0 = 1
            if (r1 == r0) goto L89
            r1 = 1041865114(0x3e19999a, float:0.15)
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 <= 0) goto L88
            goto L89
        L88:
            r0 = 0
        L89:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L8d:
            return r0
        L8e:
            android.content.IntentFilter r0 = new android.content.IntentFilter
            java.lang.String r1 = "android.intent.action.BATTERY_CHANGED"
            r0.<init>(r1)
            java.lang.Object r1 = r5.f13764c
            android.content.Context r1 = (android.content.Context) r1
            r2 = 0
            android.content.Intent r0 = r1.registerReceiver(r2, r0)
            if (r0 != 0) goto Lae
            p8.v r0 = p8.v.e()
            java.lang.String r1 = v8.b.f13759a
            java.lang.String r2 = "getInitialState - null intent received"
            r0.c(r1, r2)
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            goto Lc3
        Lae:
            java.lang.String r1 = "status"
            r2 = -1
            int r0 = r0.getIntExtra(r1, r2)
            r1 = 2
            if (r0 == r1) goto Lbe
            r1 = 5
            if (r0 != r1) goto Lbc
            goto Lbe
        Lbc:
            r0 = 0
            goto Lbf
        Lbe:
            r0 = 1
        Lbf:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        Lc3:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: v8.a.d():java.lang.Object");
    }

    @Override // v8.e
    public final void g() {
        v.e().a(d.f13761a, getClass().getSimpleName().concat(": registering receiver"));
        ((Context) this.f13764c).registerReceiver(this.f13757g, k());
    }

    @Override // v8.e
    public final void h() {
        v.e().a(d.f13761a, getClass().getSimpleName().concat(": unregistering receiver"));
        ((Context) this.f13764c).unregisterReceiver(this.f13757g);
    }

    public final IntentFilter k() {
        switch (this.f13758h) {
            case 0:
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.CHARGING");
                intentFilter.addAction("android.os.action.DISCHARGING");
                return intentFilter;
            case DSiCameraSource.FrontCamera /* 1 */:
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
